package com.maxiaohua.genealogy.fw.web.interceptor.impl;

import com.maxiaohua.genealogy.fw.core.ajax.AJAXParser;
import com.maxiaohua.genealogy.fw.core.config.SystemContext;
import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.dao.CISSqlSessionFactory;
import com.maxiaohua.genealogy.fw.core.exception.ApplicationException;
import com.maxiaohua.genealogy.fw.core.interceptor.Interceptor;
import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;
import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.ErrorLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.Logger;
import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.properties.MessageProperties;
import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.NoAuthentication;
import com.maxiaohua.genealogy.fw.core.util.LDAPUtil;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.web.util.RequestScurityUtil;

public class ContextSessionControlInterceptor implements Interceptor {
	
	private static final Logger appLogger = LogFactory.getLogger();
	
	private static final DebugLogger debugLogger = LogFactory.getDebugLogger();
	
	private static final ErrorLogger errorLogger = LogFactory.getErrorLogger();

	private AJAXParser ajaxParser;
	
	private MessageProperties messageProperties;
	
    public void setAjaxParser(
            AJAXParser ajaxParser) {
        this.ajaxParser = ajaxParser;
    }
    
    public void setMessageProperties(
    		MessageProperties messageProperties) {
        this.messageProperties = messageProperties;
    }
	
	@Override
	public void intercept(
			InterceptorChain chain) throws Exception {
		boolean isFirstTime = chain.isCaughtExpectedException();
		
		String sysId = chain.getSysId();
		String serviceId = chain.getServiceId();
		
		if (StringUtil.isEmpty(sysId)) {
			RequestContext.open().putElement(RequestContext.Key.SystemId, CISSqlSessionFactory.DEFAULT_ENVIRONMENT_ID);
		} else {
			RequestContext.open().putElement(RequestContext.Key.SystemId, sysId);
		}
		
		requestContextControl(serviceId, chain.getUserID());
		
		@SuppressWarnings("rawtypes")
		AbstractService service = (AbstractService) (SystemContext.getBeanFactory().getBean(serviceId));
		
		if (service == null) {
			errorLogger.writeErrorLog(serviceId + "是无效的Service");
			appLogger.error(serviceId + "是无效的Service", null);
			debugLogger.error(serviceId + "是无效的Service", null);
			throw new ApplicationException(MessageCode.M10190CM);
		}
		String serviceName = service.getClass().getName();
		String appId = serviceName.substring(0, serviceName.indexOf("."));
		appId = appId.substring(appId.indexOf(".") + 1);
		RequestContext.open().putElement(RequestContext.Key.AppId, appId);

		appLogger.info(serviceId + "#begin#");
		appLogger.debug(chain.getJsonInput());
		debugLogger.writeWSLog(serviceId + "#begin#", chain.getJsonInput());
		
		
		if (AbstractService.isLoginService(serviceId) || AbstractService.isRegisterService(serviceId)
				 || AbstractService.isAppVersionService(serviceId) || AbstractService.isValidCodeService(serviceId)
				 || AbstractService.isCheckValidCodeService(serviceId)) {
			// 个别处理
		} else {
			if (needAuthentication(service)) {
				Class<?> clazz = RequestScurityUtil.class;
				RequestScurityUtil securityDTO = (RequestScurityUtil) ajaxParser.parse(chain.getJsonInput(), clazz, clazz);
				validateAccess(securityDTO.getUserID(), securityDTO.getTimestamp(), securityDTO.getCode());
			}
		}

		chain.next();

		if (!isFirstTime) {
			appLogger.debug(chain.getJsonOutput());
			appLogger.info(serviceId + "#end#");
			debugLogger.writeWSLog(chain.getJsonOutput(), serviceId + "#end#");
		}
	}
	
	protected void requestContextControl(
			String serviceId,
			String userId) {
		RequestContext requestContext = RequestContext.open();

		
		java.sql.Timestamp serviceStartTime = new java.sql.Timestamp(System.currentTimeMillis());
		RequestContext.open().putElement(RequestContext.Key.ServiceStartTime, serviceStartTime);

		if (!StringUtil.isEmpty(userId)) {
			requestContext.putElement(RequestContext.Key.UserId, userId);
		}
	}

	protected void validateAccess(
			String userId,
			String timestamp,
			String code) {
		StringBuilder buf = new StringBuilder();
		
		buf.append(messageProperties.get("rest_token"));
		buf.append(messageProperties.get("rest_appId"));
		buf.append(userId);
		buf.append(timestamp);
		
		if(code == null || !code.equals(new String(LDAPUtil.generateToken(buf.toString())))){
			errorLogger.writeErrorLog("非法访问。");
			appLogger.error("非法访问。", null);
			debugLogger.error("非法访问。", null);
			throw new ApplicationException(MessageCode.M10040CM);
		}
		
		java.sql.Timestamp serviceStartTime = new java.sql.Timestamp(System.currentTimeMillis());
		java.sql.Timestamp requestTime;
		StringBuilder sb = new StringBuilder();
		sb.append(timestamp.substring(0,4));
		sb.append("-");
		sb.append(timestamp.substring(4,6));
		sb.append("-");
		sb.append(timestamp.substring(6,8));
		sb.append(" ");
		sb.append(timestamp.substring(8,10));
		sb.append(":");
		sb.append(timestamp.substring(10,12));
		sb.append(":");
		sb.append(timestamp.substring(12,14));
		requestTime = java.sql.Timestamp.valueOf(sb.toString());
		
		if ((serviceStartTime.getTime() - requestTime.getTime())/(1000*60) > 3){
			errorLogger.writeErrorLog("非法访问。");
			appLogger.error("非法访问。", null);
			debugLogger.error("非法访问。", null);
			throw new ApplicationException(MessageCode.M10040CM);
		}
		
		RequestContext.open().putElementToSession(RequestContext.Key.UserId, userId);
	}
	
	@SuppressWarnings("rawtypes")
	protected boolean needAuthentication(
			AbstractService service) {
		return service != null && service.getClass().getAnnotation(NoAuthentication.class) == null;
	}
}
package com.maxiaohua.genealogy.fw.web.rest;

import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maxiaohua.genealogy.fw.core.config.SystemContext;
import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;
import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.ErrorLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.Logger;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;


public abstract class AbstractRestController {
	
	protected static final Logger appLogger = LogFactory.getLogger();
	
	protected static final DebugLogger debugLogger = LogFactory.getDebugLogger();
	
	protected static final ErrorLogger errorLogger = LogFactory.getErrorLogger();
	
	private static final String INTERCEPTOR_CHAIN_NAME = "webServiceInterceptorChain";
	
	private static final String ENCODING = "UTF-8";
	
	public String runService(
			HttpServletRequest request,
			HttpServletResponse response,
			String sysId,
			String serviceId,
			String jsonInput) {
		try {
			if (StringUtil.isNotEmpty(jsonInput)) {
				jsonInput = URLDecoder.decode(jsonInput, ENCODING);
			}
			RequestContext.open();
			InterceptorChain chain = SystemContext.getBeanFactory().beanOfName(INTERCEPTOR_CHAIN_NAME);
			chain.setRequest(request);
			chain.setResponse(response);
			chain.setSysId(sysId);
			chain.setServiceId(serviceId);
			chain.setJsonInput(jsonInput);
			chain.next();

			return chain.getJsonOutput();
		} catch (Exception e) {
			errorLogger.writeErrorLog(e.toString());
			appLogger.error(jsonInput, e);
			debugLogger.error(jsonInput, e);
			return "No found system resources: InterceptorChain or AJAXRender.";
		} finally {
			
			RequestContext.close();
		}

	}
}
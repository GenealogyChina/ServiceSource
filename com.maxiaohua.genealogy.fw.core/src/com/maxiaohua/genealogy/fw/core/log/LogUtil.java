package com.maxiaohua.genealogy.fw.core.log;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.maxiaohua.genealogy.fw.core.ajax.AJAXRender;
import com.maxiaohua.genealogy.fw.core.ajax.impl.JSONRenderImpl;
import com.maxiaohua.genealogy.fw.core.bean.BeanFactory;
import com.maxiaohua.genealogy.fw.core.config.SystemContext;
import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.message.Message;
import com.maxiaohua.genealogy.fw.core.properties.MessageProperties;
import com.maxiaohua.genealogy.fw.core.properties.impl.MessageUtil;
import com.maxiaohua.genealogy.fw.core.util.BeanTransformer;


public class LogUtil {
	
	private static final String MESSAGE_PROPERTIES_NAME = "messageProperties";

    
    private static final int MAX_LOGGING_ARRAY_SIZE_FOR_DEBUG = 100;

	
	private static MessageProperties messageProperties;

	
	private static final AJAXRender jsonRender;
	static {
		jsonRender = new JSONRenderImpl();
		jsonRender.setIgnoreNull(true);
		jsonRender.setIgnoreSpace(true);
		jsonRender.setArrayMaxRenderSize(MAX_LOGGING_ARRAY_SIZE_FOR_DEBUG);
	}

	
	public static String toPlainString(
			Object obj) {
		try {
			return jsonRender.render(obj);
		} catch (Exception e) {
			return "";
		}
	}

	
	public static String formatMessage(
			Object obj) {
		StringBuilder messageLog = new StringBuilder();
		messageLog.append("[" + RequestContext.open().getElement(RequestContext.Key.UserId) + "] ");
		//messageLog.append("[" + RequestContext.open().getElement(RequestContext.Key.IpAddress) + "] ");
		//messageLog.append("[" + RequestContext.open().getElement(RequestContext.Key.HttpSessionId) + "] ");
		messageLog.append("[" + RequestContext.open().getElement(RequestContext.Key.AppId) + "] ");

		if (obj instanceof Message) {
			BeanFactory beanFactory = SystemContext.getBeanFactory();
			try {
				if (messageProperties == null) {

					messageProperties = beanFactory.beanOfName(MESSAGE_PROPERTIES_NAME);

				}
				Message message = (Message) obj;

				String messageContent = messageProperties.get(message.getId(), message.getParameters());
				if (!messageContent.equals(message.getId())) {
					messageLog.append(MessageUtil.getMessageType(messageProperties.get(message.getId())) + " " + message.getId() + " "
							+ messageContent);
				} else {
					messageLog.append("null " + "null " + messageContent);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			messageLog.append(obj);
		}

		return messageLog.toString();
	}

	
	public static String getParameter(
			Object obj) {

		StringBuilder paramLog = new StringBuilder("[");

		HashMap<String, Object> dtoMap = BeanTransformer.getObjectFields(obj);
		if (dtoMap != null && !dtoMap.isEmpty()) {
			Iterator<Map.Entry<String, Object>> iter = dtoMap.entrySet().iterator();
			while (iter.hasNext()) {
				Map.Entry<String, Object> resultMap = iter.next();
				String parameter = resultMap.getKey();
				Object value = resultMap.getValue();
				if (value != null) {
					paramLog.append(parameter + "=" + value + ",");
				}
			}
			paramLog = paramLog.replace(paramLog.length() - 1, paramLog.length(), "");
		}
		paramLog.append("]");

		return paramLog.toString();
	}
}
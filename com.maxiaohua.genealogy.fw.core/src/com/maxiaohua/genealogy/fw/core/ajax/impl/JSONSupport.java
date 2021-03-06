package com.maxiaohua.genealogy.fw.core.ajax.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.ErrorLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.Logger;


public abstract class JSONSupport {
	
	protected static final Logger appLogger = LogFactory.getLogger();
	
	protected static final DebugLogger debugLogger = LogFactory.getDebugLogger();
	
	protected static final ErrorLogger errorLogger = LogFactory.getErrorLogger();
    
    protected static final Object[] NULL_GETTER_PARAMS = new Object[0];
    
    protected static final String JSON_NULL_STR = "null";
    
    protected static final char JSON_ELEMENT_SEP = ',';
    
    protected static final char JSON_PROPERTY_AROUND = '\"';
    
    protected static final char JSON_PROPERTY_SUFFIX = ':';
    
    protected static final char JSON_ARRAY_BEGIN = '[';
    
    protected static final char JSON_ARRAY_END = ']';
    
    protected static final char JSON_MAP_BEGIN = '{';
    
    protected static final char JSON_MAP_END = '}';
    
    protected static final char JSON_TEXT_VALUE_AROUND = '\"';
    
    protected static final String SERVICE_BEAN_PACKAGE_PREFIX = "com.maxiaohua.genealogy.";
    
    protected static final Set<Class<?>> BASIC_TYPE_DEFINE = new HashSet<Class<?>>();
    static {
        BASIC_TYPE_DEFINE.add(java.lang.String.class);
        BASIC_TYPE_DEFINE.add(java.lang.Integer.class);
        BASIC_TYPE_DEFINE.add(java.lang.Short.class);
        BASIC_TYPE_DEFINE.add(java.lang.Long.class);
        BASIC_TYPE_DEFINE.add(java.lang.Double.class);
        BASIC_TYPE_DEFINE.add(java.lang.Float.class);
        BASIC_TYPE_DEFINE.add(java.lang.Boolean.class);
        BASIC_TYPE_DEFINE.add(java.lang.Character.class);
        BASIC_TYPE_DEFINE.add(java.lang.Byte.class);
        BASIC_TYPE_DEFINE.add(java.sql.Date.class);
        BASIC_TYPE_DEFINE.add(java.sql.Time.class);
        BASIC_TYPE_DEFINE.add(java.sql.Timestamp.class);
        BASIC_TYPE_DEFINE.add(java.util.Date.class);
        BASIC_TYPE_DEFINE.add(java.math.BigInteger.class);
        BASIC_TYPE_DEFINE.add(java.math.BigDecimal.class);
    }

    
    protected final SimpleDateFormat defaultUtilDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

    
	private List<String> packageNames = null;

    
    public Type[] getActualTypes(
            Type genericType) {
        ParameterizedType parameterizedType = (ParameterizedType) genericType;
        return parameterizedType.getActualTypeArguments();
    }

    
    public boolean isBasicType(
            Class<?> clazz) {
        if (BASIC_TYPE_DEFINE.contains(clazz) || clazz.isPrimitive()) {
            return true;
        }
        return false;
    }

    
	public boolean isServiceBeanType(
			Class<?> clazz) {
		if (packageNames == null) {
			if (clazz.getName().startsWith(SERVICE_BEAN_PACKAGE_PREFIX) || clazz.getName().startsWith("com.nsct.mobel.service.")) {
				return true;
			}
		} else {
			for (String packageName : packageNames) {
				if (clazz.getName().startsWith(packageName)) {
					return true;
				}
			}
		}
		return false;
	}

	
	public List<String> getPackageNames() {
		return packageNames;
	}

	
	public void setPackageNames(
			List<String> packageNames) {
		this.packageNames = packageNames;
	}

}
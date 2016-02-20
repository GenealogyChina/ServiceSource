package com.maxiaohua.genealogy.fw.core.service;

import com.maxiaohua.genealogy.fw.core.biz.AbstractComponent;
import com.maxiaohua.genealogy.fw.core.exception.ValidationException;


public abstract class AbstractService<R, P> extends AbstractComponent {
    
    public static final String SERVICE_EXECUTE_METHOD = "execute";
    
    public static final String APP_VERSION_SERVICE = "GsGetAppVersion";
    
    private static final String LOGIN_SERVICE = "GsLogin";
    
    private static final String REGISTER_SERVICE = "GsRegist";
        
    private static final String VALID_CODE_SERVICE = "GsGetValidCode";
    
    private static final String CHECK_VALID_CODE = "GsCheckValidCode";
    
    public void validate(
            P input) throws ValidationException {
    }

    
    public abstract R execute(
            P input);

    
    public void preExecute(
            P input) {
    }

    
    public R postExecute(
            P input,
            R output) {
        return output;
    }

    
    public void exceptionExecute(
            P input,
            Exception ex) {
    }

    
    public void finallyExecute(
            P input,
            R output) {
    }

    
    public static boolean isLoginService(
            String serviceId) {
        if (LOGIN_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isRegisterService(
            String serviceId) {
        if (REGISTER_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isValidCodeService(
            String serviceId) {
        if (VALID_CODE_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isAppVersionService(
            String serviceId) {
        if (APP_VERSION_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isCheckValidCodeService(
            String serviceId) {
        if (CHECK_VALID_CODE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
}
package com.maxiaohua.genealogy.fw.core.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;


public interface ExceptionHandler {
    
    void handleException(
            InterceptorChain chain,
            Throwable exception,
            HttpServletRequest request,
            HttpServletResponse response);
}
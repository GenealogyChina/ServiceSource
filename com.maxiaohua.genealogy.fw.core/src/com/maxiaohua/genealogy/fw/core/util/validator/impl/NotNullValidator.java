package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class NotNullValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.NotNull) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.NotNull.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;
        if (fieldValue == null) {
            result = false;
        }
        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return null;
    }

}
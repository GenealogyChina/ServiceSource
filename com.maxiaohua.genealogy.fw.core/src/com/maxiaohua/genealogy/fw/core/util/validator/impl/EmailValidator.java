package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.util.validator.CommonValidationUtil;


public class EmailValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Email) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.Email.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        if (fieldValue == null || !CommonValidationUtil.isEmailString(fieldValue.toString())) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return null;
    }

}
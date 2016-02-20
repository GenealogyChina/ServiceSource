package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class NotEmptyValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.NotEmpty) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.NotEmpty.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        if (fieldValue == null || StringUtil.isEmptyHankakuAndZenkaku(String.valueOf(fieldValue))) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return null;
    }

}
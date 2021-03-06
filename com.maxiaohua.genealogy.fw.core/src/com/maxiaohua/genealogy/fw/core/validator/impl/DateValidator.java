package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil.FORMAT;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class DateValidator extends AnnotationValidator {
    private FORMAT format = null;

    @Override
    protected void prepare() {
        if (annotation != null) {
            format = ((com.maxiaohua.genealogy.fw.core.validator.type.Date) annotation).format();
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.Date) annotation).errorCode();
        } else { 
            format = DateUtil.FORMAT.YYYYMMDDHyphen;
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.Date.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            if (DateUtil.parseToDate(fieldValue.toString(), format) == null) {
                result = false;
            }
        } catch (Exception e) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return new String[] { format.toString() };
    }
}
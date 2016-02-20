package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class AfterDateSqlValidator extends AnnotationValidator implements MessageCode {
    private String dateStr = null;
    private boolean ifEqual = false;
    private int errortype = 0;

    @Override
    protected void prepare() {
        if (annotation != null) {
            dateStr = ((com.maxiaohua.genealogy.fw.core.util.validator.type.AfterDateSql) annotation).compareTo();
            ifEqual = ((com.maxiaohua.genealogy.fw.core.util.validator.type.AfterDateSql) annotation).ifEqual();
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.AfterDateSql) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.AfterDateSql.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            java.sql.Date targetDate = java.sql.Date.valueOf(fieldValue.toString());

            try {

                if (ifEqual) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToDate(dateStr, DateUtil.FORMAT.YYYYMMDDHyphen)) < 0) {
                        result = false;
                        errorCode = M10210CM;
                    }
                } else {
                    if (DateUtil.compare(targetDate, DateUtil.parseToDate(dateStr, DateUtil.FORMAT.YYYYMMDDHyphen)) <= 0) {
                        result = false;
                        errorCode = M10230CM;
                    }
                }
            } catch (Exception e) {
                result = false;
            }
        } catch (Exception e) {
            result = false;
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.DateSql.DEFAULT_ERROR_CODE;
            errortype = 1;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        String[] msgParameters = new String[1];

        switch (errortype) {
        case 1:
            msgParameters[0] = null;
            break;
        default:
            msgParameters[0] = dateStr;
            break;
        }
        return msgParameters;
    }

}
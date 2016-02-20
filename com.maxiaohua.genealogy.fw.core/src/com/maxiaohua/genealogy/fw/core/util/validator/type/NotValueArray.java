
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.NotValueArrayValidator;


@RuleDescriptor("NotValueArray")
@Constraint(validator = NotValueArrayValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotValueArray {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10410CM;

    
    public int junban() default 1;

    
    public String[] values();

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}
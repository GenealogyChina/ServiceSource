
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.validator.impl.AfterTimeValidator;


@RuleDescriptor("AfterTime")
@Constraint(validator = AfterTimeValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AfterTime {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10580CM;

    
    public int junban() default 1;

    
    public boolean ifEqual();

    
    public String compareTo();

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}
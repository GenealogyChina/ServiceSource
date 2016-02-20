
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.validator.impl.MinValidator;


@RuleDescriptor("Min")
@Constraint(validator = MinValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Min {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10320CM;

    
    public int junban() default 1;

    
    public boolean ifEqual();

    
    public long min();

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}

package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.BeforeValidator;


@RuleDescriptor("Before")
@Constraint(validator = BeforeValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Before {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10220CM;

    
    public boolean ifEqual();

    
    public int junban() default 1;

    
    public String compareTo();

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}
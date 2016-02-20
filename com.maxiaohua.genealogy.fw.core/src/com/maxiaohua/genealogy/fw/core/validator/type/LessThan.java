
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.validator.impl.LessThanValidator;


@Deprecated
@RuleDescriptor("LessThan")
@Constraint(validator = LessThanValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LessThan {
    
    public String compareTo();

    
    public static final String DEFAULT_ERROR_CODE = "E0026";

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}
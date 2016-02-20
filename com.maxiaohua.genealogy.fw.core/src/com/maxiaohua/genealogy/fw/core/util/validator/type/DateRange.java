
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.DateRangeValidator;


@RuleDescriptor("DateRange")
@Constraint(validator = DateRangeValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateRange {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10210CM;

    
    public int junban() default 1;

    
    public String lagerEqual() default "";

    
    public String lagerThan() default "";

    
    public String lessEqual() default "";

    
    public String lessThan() default "";

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}
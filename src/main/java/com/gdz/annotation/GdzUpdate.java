package com.gdz.annotation;

import java.lang.annotation.*;

/**
 * @author duanxiaoqiu
 * @Date 2020-01-07 17:26
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface GdzUpdate {
    String value() default "";
}

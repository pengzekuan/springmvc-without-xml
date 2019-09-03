package com.yn.km.peter.annotation;

import java.lang.annotation.*;

/**
 * @package cn.yn.dealmore.mcc.annotation
 * @project wash-car-system
 * @user pengzekuan
 * @time 2019-05-18
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface NotNull {
}

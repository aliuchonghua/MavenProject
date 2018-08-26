package org.westos.web01.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2018/8/26.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyValue {
    String value() default "";
}

package org.westos.web01.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2018/8/26.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDocumentAnno {
   String key() default "westos";
   String value() default "hello";
}

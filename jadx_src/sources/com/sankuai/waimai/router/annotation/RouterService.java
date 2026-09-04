package com.sankuai.waimai.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface RouterService {
    boolean defaultImpl() default false;

    Class[] interfaces();

    String[] key() default {};

    boolean singleton() default false;
}

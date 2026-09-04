package com.google.android.material.internal;

import androidx.annotation.n0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Experimental.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Deprecated
public @interface h {
    @n0
    String value() default "";
}

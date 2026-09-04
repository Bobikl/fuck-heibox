package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: MagicConstant.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface e {
    long[] flags() default {};

    Class flagsFromClass() default void.class;

    long[] intValues() default {};

    String[] stringValues() default {};

    Class valuesFromClass() default void.class;
}

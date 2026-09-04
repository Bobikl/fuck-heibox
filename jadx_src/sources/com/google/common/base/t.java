package com.google.common.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;

/* JADX INFO: compiled from: ParametricNullness.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Nonnull(when = When.UNKNOWN)
@TypeQualifierNickname
@o9.b
@Retention(RetentionPolicy.RUNTIME)
public @interface t {
}

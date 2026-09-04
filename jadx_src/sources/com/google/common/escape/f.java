package com.google.common.escape;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

/* JADX INFO: compiled from: ElementTypesAreNonnullByDefault.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@TypeQualifierDefault({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Nonnull
@o9.b
@Retention(RetentionPolicy.RUNTIME)
public @interface f {
}

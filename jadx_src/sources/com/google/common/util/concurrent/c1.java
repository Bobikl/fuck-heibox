package com.google.common.util.concurrent;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Partially.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public final class c1 {

    /* JADX INFO: compiled from: Partially.java */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        String value();
    }

    private c1() {
    }
}

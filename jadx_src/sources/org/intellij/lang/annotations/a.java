package org.intellij.lang.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Flow.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface a {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @dl.c
    public static final String f137806k1 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    @dl.c
    public static final String f137807l1 = "this";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    @dl.c
    public static final String f137808m1 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @dl.c
    public static final String f137809n1 = "The return value of this method";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @dl.c
    public static final String f137810o1 = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}

package jh;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: SchedulerSupport.java */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface g {
    public static final String C0 = "none";
    public static final String D0 = "custom";
    public static final String E0 = "io.reactivex:computation";
    public static final String F0 = "io.reactivex:io";
    public static final String G0 = "io.reactivex:new-thread";
    public static final String H0 = "io.reactivex:trampoline";
    public static final String I0 = "io.reactivex:single";

    String value();
}

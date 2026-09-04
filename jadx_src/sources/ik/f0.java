package ik;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: SubstringIndexFor.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@cl.e0({g0.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface f0 {
    @cl.r
    String[] offset();

    @cl.r
    String[] value();
}

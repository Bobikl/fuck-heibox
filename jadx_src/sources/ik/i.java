package ik;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: LTLengthOf.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@cl.e0({h.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface i {
    @cl.r
    String[] offset() default {};

    @cl.r
    String[] value();
}

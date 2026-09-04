package ik;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresLTLengthOf.java */
/* JADX INFO: loaded from: classes5.dex */
@cl.p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@cl.w(qualifier = i.class)
@Documented
@Repeatable(InterfaceC1089a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface a {

    /* JADX INFO: renamed from: ik.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EnsuresLTLengthOf.java */
    @cl.p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @cl.w(qualifier = i.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1089a {
        a[] value();
    }

    @cl.r
    @cl.z(androidx.constraintlayout.core.motion.utils.w.c.R)
    String[] offset() default {};

    @cl.r
    @cl.z("value")
    String[] targetValue();

    @cl.r
    String[] value();
}

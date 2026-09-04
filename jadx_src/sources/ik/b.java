package ik;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresLTLengthOfIf.java */
/* JADX INFO: loaded from: classes5.dex */
@cl.p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@cl.c(qualifier = i.class)
public @interface b {

    /* JADX INFO: compiled from: EnsuresLTLengthOfIf.java */
    @cl.p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @cl.c(qualifier = i.class)
    public @interface a {
        b[] value();
    }

    String[] expression();

    @cl.r
    @cl.z(androidx.constraintlayout.core.motion.utils.w.c.R)
    String[] offset() default {};

    boolean result();

    @cl.r
    @cl.z("value")
    String[] targetValue();
}

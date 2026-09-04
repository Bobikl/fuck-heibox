package ck;

import cl.p;
import cl.z;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresCalledMethodsIf.java */
/* JADX INFO: loaded from: classes5.dex */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@cl.c(qualifier = ck.a.class)
public @interface e {

    /* JADX INFO: compiled from: EnsuresCalledMethodsIf.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @cl.c(qualifier = ck.a.class)
    public @interface a {
        e[] value();
    }

    String[] expression();

    @z("value")
    String[] methods();

    boolean result();
}

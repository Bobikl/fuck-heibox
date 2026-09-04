package lk;

import cl.p;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresLockHeldIf.java */
/* JADX INFO: loaded from: classes5.dex */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@cl.c(qualifier = h.class)
public @interface b {

    /* JADX INFO: compiled from: EnsuresLockHeldIf.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @cl.c(qualifier = h.class)
    public @interface a {
        b[] value();
    }

    String[] expression();

    boolean result();
}

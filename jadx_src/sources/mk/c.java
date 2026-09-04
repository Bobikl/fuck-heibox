package mk;

import cl.p;
import cl.r;
import cl.z;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresKeyForIf.java */
/* JADX INFO: loaded from: classes5.dex */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@cl.c(qualifier = f.class)
public @interface c {

    /* JADX INFO: compiled from: EnsuresKeyForIf.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @cl.c(qualifier = f.class)
    public @interface a {
        c[] value();
    }

    String[] expression();

    @r
    @z("value")
    String[] map();

    boolean result();
}

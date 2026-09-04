package mk;

import cl.p;
import cl.r;
import cl.w;
import cl.z;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresKeyFor.java */
/* JADX INFO: loaded from: classes5.dex */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@w(qualifier = f.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface b {

    /* JADX INFO: compiled from: EnsuresKeyFor.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @w(qualifier = f.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        b[] value();
    }

    @r
    @z("value")
    String[] map();

    String[] value();
}

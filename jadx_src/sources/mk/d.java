package mk;

import cl.p;
import cl.w;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresNonNull.java */
/* JADX INFO: loaded from: classes5.dex */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@w(qualifier = i.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface d {

    /* JADX INFO: compiled from: EnsuresNonNull.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @w(qualifier = i.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        d[] value();
    }

    String[] value();
}

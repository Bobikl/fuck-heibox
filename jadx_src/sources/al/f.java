package al;

import cl.z;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresMinLenIf.java */
/* JADX INFO: loaded from: classes5.dex */
@cl.p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@cl.c(qualifier = n.class)
public @interface f {

    /* JADX INFO: compiled from: EnsuresMinLenIf.java */
    @cl.p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @cl.c(qualifier = n.class)
    public @interface a {
        f[] value();
    }

    String[] expression();

    boolean result();

    @z("value")
    int targetValue() default 0;
}

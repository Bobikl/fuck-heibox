package cl;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresQualifierIf.java */
/* JADX INFO: loaded from: classes5.dex */
@p
@Target({ElementType.METHOD})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface j {

    /* JADX INFO: compiled from: EnsuresQualifierIf.java */
    @p
    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        j[] value();
    }

    String[] expression();

    Class<? extends Annotation> qualifier();

    boolean result();
}

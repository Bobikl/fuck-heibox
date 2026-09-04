package cl;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresQualifier.java */
/* JADX INFO: loaded from: classes5.dex */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface i {

    /* JADX INFO: compiled from: EnsuresQualifier.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        i[] value();
    }

    String[] expression();

    Class<? extends Annotation> qualifier();
}

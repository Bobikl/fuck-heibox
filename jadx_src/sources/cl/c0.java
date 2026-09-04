package cl;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: RequiresQualifier.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface c0 {

    /* JADX INFO: compiled from: RequiresQualifier.java */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        c0[] value();
    }

    String[] expression();

    Class<? extends Annotation> qualifier();
}

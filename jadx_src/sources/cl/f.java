package cl;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: compiled from: DefaultQualifier.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.PACKAGE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.SOURCE)
public @interface f {

    /* JADX INFO: compiled from: DefaultQualifier.java */
    @Target({ElementType.PACKAGE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        f[] value();
    }

    TypeUseLocation[] locations() default {TypeUseLocation.ALL};

    Class<? extends Annotation> value();
}

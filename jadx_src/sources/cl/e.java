package cl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.TypeKind;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: compiled from: DefaultFor.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface e {
    String[] names() default {};

    String[] namesExceptions() default {};

    TypeKind[] typeKinds() default {};

    Class<?>[] types() default {};

    TypeUseLocation[] value() default {};
}

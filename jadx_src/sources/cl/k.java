package cl;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: FieldInvariant.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface k {
    String[] field();

    Class<? extends Annotation>[] qualifier();
}

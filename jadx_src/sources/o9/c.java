package o9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: GwtIncompatible.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@b
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface c {
    String value() default "";
}

package o9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: GwtCompatible.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@b
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface b {
    boolean emulated() default false;

    boolean serializable() default false;
}

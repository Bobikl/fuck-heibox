package pk;

import cl.e0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Regex.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@e0({e.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
    int value() default 0;
}

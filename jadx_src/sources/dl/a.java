package dl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Contract.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface a {
    boolean pure() default false;

    String value() default "";
}

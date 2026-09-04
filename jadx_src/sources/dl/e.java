package dl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Nullable.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface e {
    String value() default "";
}

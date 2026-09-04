package s9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: DoNotCall.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface e {
    String value() default "";
}

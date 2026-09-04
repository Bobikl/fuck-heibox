package u9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Property.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface d {
    String value() default "";
}

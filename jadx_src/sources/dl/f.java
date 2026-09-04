package dl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: PropertyKey.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface f {
    String resourceBundle();
}

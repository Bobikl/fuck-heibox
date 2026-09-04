package s9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: CompatibleWith.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface c {
    String value();
}

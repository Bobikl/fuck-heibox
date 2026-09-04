package s9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: DoNotMock.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface f {
    String value() default "Create a real instance instead";
}

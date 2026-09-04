package zg;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: DoNotMock.java */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE})
@Inherited
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface a {
    String value() default "Create a real instance instead";
}

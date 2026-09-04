package ig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: RouterRegex.java */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface c {
    boolean exported() default false;

    Class[] interceptors() default {};

    int priority() default 0;

    String regex();
}

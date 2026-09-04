package ig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: RouterUri.java */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface d {
    boolean exported() default false;

    String host() default "universal";

    Class[] interceptors() default {};

    String[] path();

    String scheme() default "hblink";
}

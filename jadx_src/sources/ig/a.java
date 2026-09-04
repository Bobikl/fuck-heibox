package ig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: RouterPage.java */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface a {
    Class[] interceptors() default {};

    String[] path();
}

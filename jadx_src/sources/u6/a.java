package u6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Index.java */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface a {
    String[] modules() default {};
}

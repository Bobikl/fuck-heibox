package mk;

import cl.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: RequiresNonNull.java */
/* JADX INFO: loaded from: classes5.dex */
@x(qualifier = i.class)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface m {
    String[] value();
}

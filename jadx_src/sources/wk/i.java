package wk;

import cl.e0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: MethodVal.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@e0({m.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface i {
    String[] className();

    String[] methodName();

    int[] params();
}

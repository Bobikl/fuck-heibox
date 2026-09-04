package al;

import cl.e0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: IntVal.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@e0({s.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface l {
    long[] value();
}

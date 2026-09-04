package tk;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.checkerframework.checker.units.qual.Prefix;

/* JADX INFO: compiled from: UnitsMultiple.java */
/* JADX INFO: loaded from: classes5.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface r {
    Prefix prefix() default Prefix.one;

    Class<? extends Annotation> quantity();
}

package lk;

import cl.e0;
import cl.f0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: compiled from: GuardSatisfied.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE})
@e0({f.class})
@f0({TypeUseLocation.RECEIVER, TypeUseLocation.PARAMETER, TypeUseLocation.RETURN})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
    int value() default -1;
}

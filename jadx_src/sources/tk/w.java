package tk;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.checker.units.qual.Prefix;

/* JADX INFO: compiled from: g.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@cl.e0({j.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface w {
    Prefix value() default Prefix.one;
}

package sk;

import cl.a0;
import cl.e;
import cl.e0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: compiled from: Untainted.java */
/* JADX INFO: loaded from: classes5.dex */
@a0({LiteralKind.STRING})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@e0({b.class})
@e({TypeUseLocation.LOWER_BOUND})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
}

package mk;

import cl.a0;
import cl.e0;
import cl.h0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.TypeKind;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: compiled from: NonNull.java */
/* JADX INFO: loaded from: classes5.dex */
@a0({LiteralKind.STRING})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@e0({h.class})
@cl.e({TypeUseLocation.EXCEPTION_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@cl.h
@h0(typeKinds = {TypeKind.PACKAGE, TypeKind.INT, TypeKind.BOOLEAN, TypeKind.CHAR, TypeKind.DOUBLE, TypeKind.FLOAT, TypeKind.LONG, TypeKind.SHORT, TypeKind.BYTE})
@Documented
public @interface i {
}

package kk;

import cl.a0;
import cl.e0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.TypeKind;

/* JADX INFO: compiled from: Interned.java */
/* JADX INFO: loaded from: classes5.dex */
@a0({LiteralKind.PRIMITIVE, LiteralKind.STRING})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@e0({h.class})
@cl.e(typeKinds = {TypeKind.BOOLEAN, TypeKind.BYTE, TypeKind.CHAR, TypeKind.DOUBLE, TypeKind.FLOAT, TypeKind.INT, TypeKind.LONG, TypeKind.SHORT})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface e {
}

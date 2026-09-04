package rk;

import cl.e0;
import cl.h0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.TypeKind;

/* JADX INFO: compiled from: Signed.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@h0(typeKinds = {TypeKind.FLOAT, TypeKind.DOUBLE}, types = {Float.class, Double.class})
@e0({g.class})
@cl.e(typeKinds = {TypeKind.BYTE, TypeKind.INT, TypeKind.LONG, TypeKind.SHORT, TypeKind.FLOAT, TypeKind.DOUBLE}, types = {Byte.class, Integer.class, Long.class, Short.class, Float.class, Double.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface b {
}

package lk;

import cl.e0;
import cl.h0;
import cl.r;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.TypeKind;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: compiled from: GuardedBy.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@e0({f.class})
@cl.e(typeKinds = {TypeKind.BOOLEAN, TypeKind.BYTE, TypeKind.CHAR, TypeKind.DOUBLE, TypeKind.FLOAT, TypeKind.INT, TypeKind.LONG, TypeKind.SHORT}, types = {String.class, Void.class}, value = {TypeUseLocation.EXCEPTION_PARAMETER, TypeUseLocation.UPPER_BOUND})
@Retention(RetentionPolicy.RUNTIME)
@cl.h
@h0(typeKinds = {TypeKind.BOOLEAN, TypeKind.BYTE, TypeKind.CHAR, TypeKind.DOUBLE, TypeKind.FLOAT, TypeKind.INT, TypeKind.LONG, TypeKind.SHORT}, types = {String.class})
@Documented
public @interface d {
    @r
    String[] value() default {};
}

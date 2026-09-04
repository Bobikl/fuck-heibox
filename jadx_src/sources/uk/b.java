package uk;

import cl.e0;
import cl.h;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: compiled from: MaybeAliased.java */
/* JADX INFO: loaded from: classes5.dex */
@h
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@e0({})
@cl.e(types = {Void.class}, value = {TypeUseLocation.UPPER_BOUND, TypeUseLocation.LOWER_BOUND})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface b {
}

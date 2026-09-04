package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Upsert.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000e\u0012\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/m2;", "", "Lkotlin/reflect/d;", "entity", "()Ljava/lang/Class;", "room-common"}, k = 1, mv = {1, 7, 1})
@androidx.annotation.w0(16)
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.FUNCTION})
public @interface m2 {
    Class<?> entity() default Object.class;
}

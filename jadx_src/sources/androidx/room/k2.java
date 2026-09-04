package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: TypeConverters.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B(\u0012\u001c\b\u0002\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/room/k2;", "", "", "Lkotlin/reflect/d;", "value", "()[Ljava/lang/Class;", "Landroidx/room/BuiltInTypeConverters;", "builtInTypeConverters", "()Landroidx/room/BuiltInTypeConverters;", "room-common"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.CLASS})
public @interface k2 {
    BuiltInTypeConverters builtInTypeConverters() default @BuiltInTypeConverters;

    Class<?>[] value() default {};
}

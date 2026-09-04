package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: Junction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B \u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/room/g0;", "", "Lkotlin/reflect/d;", "value", "()Ljava/lang/Class;", "", "parentColumn", "()Ljava/lang/String;", "entityColumn", "room-common"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {})
public @interface g0 {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}

package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Relation.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B8\u0012\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/room/p1;", "", "Lkotlin/reflect/d;", "entity", "()Ljava/lang/Class;", "", "parentColumn", "()Ljava/lang/String;", "entityColumn", "Landroidx/room/g0;", "associateBy", "()Landroidx/room/g0;", "", "projection", "()[Ljava/lang/String;", "room-common"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION})
public @interface p1 {
    g0 associateBy() default @g0(Object.class);

    Class<?> entity() default Object.class;

    String entityColumn();

    String parentColumn();

    String[] projection() default {};
}

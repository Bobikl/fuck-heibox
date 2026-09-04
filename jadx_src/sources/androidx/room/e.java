package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: AutoMigration.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/room/e;", "", "", "from", "()I", "to", "Lkotlin/reflect/d;", "spec", "()Ljava/lang/Class;", "room-common"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface e {
    int from();

    Class<?> spec() default Object.class;

    int to();
}

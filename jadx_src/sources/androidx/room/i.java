package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Database.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001BJ\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002R\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/room/i;", "", "", "Lkotlin/reflect/d;", "entities", "()[Ljava/lang/Class;", "views", "", "version", "()I", "", "exportSchema", "()Z", "Landroidx/room/e;", "autoMigrations", "()[Landroidx/room/e;", "room-common"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface i {
    e[] autoMigrations() default {};

    Class<?>[] entities() default {};

    boolean exportSchema() default true;

    int version();

    Class<?>[] views() default {};
}

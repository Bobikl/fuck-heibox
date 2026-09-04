package androidx.compose.runtime.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.p0;

/* JADX INFO: compiled from: FunctionKeyMeta.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@mh.c(AnnotationRetention.RUNTIME)
@mh.b
@Retention(RetentionPolicy.RUNTIME)
@androidx.compose.runtime.m
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/internal/i;", "", "", "key", "()I", "startOffset", "endOffset", "runtime_release"}, k = 1, mv = {1, 7, 1})
@Repeatable(a.class)
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface i {

    /* JADX INFO: compiled from: FunctionKeyMeta.kt */
    @Target({ElementType.TYPE})
    @mh.c(AnnotationRetention.RUNTIME)
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @p0
    @Retention(RetentionPolicy.RUNTIME)
    @mh.d(allowedTargets = {AnnotationTarget.CLASS})
    public @interface a {
        i[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}

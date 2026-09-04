package androidx.compose.runtime.internal;

import androidx.constraintlayout.core.motion.utils.w;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: LiveLiteral.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@mh.c(AnnotationRetention.RUNTIME)
@androidx.compose.runtime.m
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/internal/m;", "", "", "key", "()Ljava/lang/String;", "", w.c.R, "()I", "runtime_release"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.RUNTIME)
@mh.d(allowedTargets = {AnnotationTarget.FUNCTION})
public @interface m {
    String key();

    int offset();
}

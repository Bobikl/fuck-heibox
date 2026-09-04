package androidx.compose.runtime.internal;

import androidx.compose.runtime.h0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Decoy.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@h0
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/internal/g;", "", "", "bitMask", "()I", "runtime_release"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.RUNTIME)
@mh.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR})
public @interface g {
    int bitMask();
}

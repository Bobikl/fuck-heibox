package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Inference.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@u0(version = "1.3")
@mh.c(AnnotationRetention.BINARY)
@rh.d
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
public @interface b {
}

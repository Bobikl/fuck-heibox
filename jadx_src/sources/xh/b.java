package xh;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import kotlin.u0;

/* JADX INFO: compiled from: JvmDefault.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD})
@u0(version = "1.2")
@kotlin.k(message = "Switch to new -Xjvm-default modes: `all` or `all-compatibility`")
@Retention(RetentionPolicy.RUNTIME)
@mh.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
public @interface b {
}

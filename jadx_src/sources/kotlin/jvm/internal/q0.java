package kotlin.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: SerializedIr.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE})
@kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
@mh.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface q0 {
    @xh.h(name = "b")
    String[] b() default {};
}

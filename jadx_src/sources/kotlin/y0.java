package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: OptIn.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE})
@r
@u0(version = org.apache.tools.ant.util.s0.f136934y)
@mh.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface y0 {
    Class<? extends Annotation> markerClass();
}

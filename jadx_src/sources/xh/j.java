package xh;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.u0;

/* JADX INFO: compiled from: JvmPlatformAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({})
@u0(version = "1.2")
@mh.c(AnnotationRetention.SOURCE)
@mh.a
@Retention(RetentionPolicy.SOURCE)
@Documented
@mh.d(allowedTargets = {AnnotationTarget.FILE})
public @interface j {
    String name();
}

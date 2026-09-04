package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE})
@mh.c(AnnotationRetention.BINARY)
@d
@mh.a
@Retention(RetentionPolicy.CLASS)
@Documented
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface s {
    Class<?> forClass();
}

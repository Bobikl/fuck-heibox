package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE})
@mh.a
@Documented
@Retention(RetentionPolicy.RUNTIME)
@mh.d(allowedTargets = {AnnotationTarget.PROPERTY, AnnotationTarget.CLASS})
public @interface p {
    String value();
}

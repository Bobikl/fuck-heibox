package mh;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.ANNOTATION_TYPE})
@a
@Documented
@Retention(RetentionPolicy.RUNTIME)
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
public @interface d {
    AnnotationTarget[] allowedTargets();
}

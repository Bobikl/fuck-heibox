package sh;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD})
@mh.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
public @interface f {
}

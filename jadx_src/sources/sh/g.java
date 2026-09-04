package sh;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: InternalAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@u0(version = s0.f136932w)
@mh.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
public @interface g {
}

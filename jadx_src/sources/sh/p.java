package sh;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.DeprecationLevel;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.internal.RequireKotlinVersionKind;
import kotlin.jvm.internal.p0;
import kotlin.u0;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@u0(version = "1.2")
@mh.c(AnnotationRetention.SOURCE)
@mh.b
@Retention(RetentionPolicy.SOURCE)
@Repeatable(a.class)
@mh.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
public @interface p {

    /* JADX INFO: compiled from: Annotations.kt */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @mh.c(AnnotationRetention.SOURCE)
    @p0
    @Retention(RetentionPolicy.SOURCE)
    @mh.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
    public @interface a {
        p[] value();
    }

    int errorCode() default -1;

    DeprecationLevel level() default DeprecationLevel.ERROR;

    String message() default "";

    String version();

    RequireKotlinVersionKind versionKind() default RequireKotlinVersionKind.LANGUAGE_VERSION;
}

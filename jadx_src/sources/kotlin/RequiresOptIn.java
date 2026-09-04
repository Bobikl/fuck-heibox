package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: OptIn.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.ANNOTATION_TYPE})
@u0(version = "1.3")
@mh.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
public @interface RequiresOptIn {

    /* JADX INFO: compiled from: OptIn.kt */
    public enum Level {
        WARNING,
        ERROR
    }

    Level level() default Level.ERROR;

    String message() default "";
}

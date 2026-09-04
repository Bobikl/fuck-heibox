package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({})
@mh.c(AnnotationRetention.BINARY)
@mh.a
@Documented
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {})
public @interface s0 {
    String expression();

    String[] imports();
}

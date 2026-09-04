package zi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import zi.b;

/* JADX INFO: compiled from: WriteWith.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE})
@mh.c(AnnotationRetention.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@mh.d(allowedTargets = {AnnotationTarget.TYPE})
public @interface f<P extends b<?>> {
}

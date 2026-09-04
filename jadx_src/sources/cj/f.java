package cj;

import cj.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.p0;

/* JADX INFO: compiled from: TypeParceler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE})
@mh.c(AnnotationRetention.SOURCE)
@mh.b
@Repeatable(a.class)
@Retention(RetentionPolicy.SOURCE)
@mh.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
public @interface f<T, P extends c<? super T>> {

    /* JADX INFO: compiled from: TypeParceler.kt */
    @Target({ElementType.TYPE})
    @mh.c(AnnotationRetention.SOURCE)
    @p0
    @Retention(RetentionPolicy.SOURCE)
    @mh.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
    public @interface a {
        f[] value();
    }
}

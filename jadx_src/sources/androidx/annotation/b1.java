package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@mh.c(AnnotationRetention.BINARY)
@mh.a
@Retention(RetentionPolicy.CLASS)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B(\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/annotation/b1;", "", "", "value", "()J", org.apache.tools.ant.types.selectors.o.f136588l, org.apache.tools.ant.types.selectors.o.f136589m, "multiple", "annotation"}, k = 1, mv = {1, 7, 0})
@Documented
@mh.d(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD, AnnotationTarget.ANNOTATION_CLASS})
public @interface b1 {
    long max() default Long.MAX_VALUE;

    long min() default Long.MIN_VALUE;

    long multiple() default 1;

    long value() default -1;
}

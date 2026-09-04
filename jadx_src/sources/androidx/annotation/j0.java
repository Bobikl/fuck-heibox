package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: compiled from: LongDef.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@mh.c(AnnotationRetention.SOURCE)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\"\u0012\f\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u00020\t\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/annotation/j0;", "", "", "value", "()[J", "", AgooConstants.MESSAGE_FLAG, "()Z", "open", "", "annotation"}, k = 1, mv = {1, 7, 0})
@Retention(RetentionPolicy.SOURCE)
@mh.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
public @interface j0 {
    boolean flag() default false;

    boolean open() default false;

    long[] value() default {};
}

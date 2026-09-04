package androidx.annotation;

import com.umeng.analytics.pro.ak;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: RequiresPermission.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@mh.c(AnnotationRetention.BINARY)
@mh.a
@Retention(RetentionPolicy.CLASS)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB4\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/annotation/z0;", "", "", "value", "()Ljava/lang/String;", "", "allOf", "()[Ljava/lang/String;", "anyOf", "", "conditional", "()Z", ak.av, "b", "annotation"}, k = 1, mv = {1, 7, 0})
@Documented
@mh.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
public @interface z0 {

    /* JADX INFO: compiled from: RequiresPermission.jvm.kt */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/annotation/z0$a;", "", "Landroidx/annotation/z0;", "value", "()Landroidx/annotation/z0;", "annotation"}, k = 1, mv = {1, 7, 0})
    @Retention(RetentionPolicy.RUNTIME)
    @mh.d(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER})
    public @interface a {
        z0 value() default @z0;
    }

    /* JADX INFO: compiled from: RequiresPermission.jvm.kt */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/annotation/z0$b;", "", "Landroidx/annotation/z0;", "value", "()Landroidx/annotation/z0;", "annotation"}, k = 1, mv = {1, 7, 0})
    @Retention(RetentionPolicy.RUNTIME)
    @mh.d(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER})
    public @interface b {
        z0 value() default @z0;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}

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

/* JADX INFO: compiled from: Dimension.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@mh.c(AnnotationRetention.BINARY)
@mh.a
@Retention(RetentionPolicy.CLASS)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/annotation/r;", "", "", "unit", "()I", ak.av, "annotation"}, k = 1, mv = {1, 7, 0})
@Documented
@mh.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.ANNOTATION_CLASS})
public @interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f1564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1561b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1562c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1563d = 2;

    /* JADX INFO: renamed from: androidx.annotation.r$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Dimension.jvm.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Landroidx/annotation/r$a;", "", "", "b", "I", "DP", ak.aF, "PX", "d", "SP", "<init>", "()V", "annotation"}, k = 1, mv = {1, 7, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f1564a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int DP = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int PX = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int SP = 2;

        private Companion() {
        }
    }

    int unit() default 1;
}

package androidx.annotation;

import com.umeng.analytics.pro.ak;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: VisibleForTesting.kt */
/* JADX INFO: loaded from: classes.dex */
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/annotation/j1;", "", "", "otherwise", "()I", "e", ak.av, "annotation"}, k = 1, mv = {1, 7, 0})
@mh.a
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f1555a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1551f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f1552g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f1553h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f1554i = 5;

    /* JADX INFO: renamed from: androidx.annotation.j1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: VisibleForTesting.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Landroidx/annotation/j1$a;", "", "", "b", "I", "PRIVATE", ak.aF, "PACKAGE_PRIVATE", "d", "PROTECTED", "e", "NONE", "<init>", "()V", "annotation"}, k = 1, mv = {1, 7, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f1555a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int PRIVATE = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int PACKAGE_PRIVATE = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int PROTECTED = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int NONE = 5;

        private Companion() {
        }
    }

    int otherwise() default 2;
}

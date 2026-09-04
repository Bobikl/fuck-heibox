package androidx.compose.material3;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.r1, reason: from toString */
/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/r1;", androidx.exifinterface.media.a.f23244d5, "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "from", ak.aF, "to", "", "F", "()F", Progress.G, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;F)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class SwipeProgress<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final T to;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float fraction;

    public SwipeProgress(T t10, T t11, float f10) {
        this.from = t10;
        this.to = t11;
        this.fraction = f10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getFraction() {
        return this.fraction;
    }

    public final T b() {
        return this.from;
    }

    public final T c() {
        return this.to;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) other;
        if (kotlin.jvm.internal.f0.g(this.from, swipeProgress.from) && kotlin.jvm.internal.f0.g(this.to, swipeProgress.to)) {
            return (this.fraction > swipeProgress.fraction ? 1 : (this.fraction == swipeProgress.fraction ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.from;
        int iHashCode = (t10 != null ? t10.hashCode() : 0) * 31;
        T t11 = this.to;
        return ((iHashCode + (t11 != null ? t11.hashCode() : 0)) * 31) + Float.floatToIntBits(this.fraction);
    }

    @dl.d
    public String toString() {
        return "SwipeProgress(from=" + this.from + ", to=" + this.to + ", fraction=" + this.fraction + ')';
    }
}

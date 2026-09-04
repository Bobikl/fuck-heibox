package androidx.compose.material3;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.f0, reason: from toString */
/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0007\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/f0;", "Landroidx/compose/material3/z1;", "", "b", "Ls1/e;", "fromValue", "toValue", ak.av, Progress.G, ak.aF, "", "toString", "", "hashCode", "", "other", "", "equals", "F", "<init>", "(F)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FractionalThreshold implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float fraction;

    public FractionalThreshold(float f10) {
        this.fraction = f10;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final float getFraction() {
        return this.fraction;
    }

    public static /* synthetic */ FractionalThreshold d(FractionalThreshold fractionalThreshold, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fractionalThreshold.fraction;
        }
        return fractionalThreshold.c(f10);
    }

    @Override // androidx.compose.material3.z1
    public float a(@dl.d s1.e eVar, float f10, float f11) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        return u1.d.a(f10, f11, this.fraction);
    }

    @dl.d
    public final FractionalThreshold c(float fraction) {
        return new FractionalThreshold(fraction);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FractionalThreshold) && kotlin.jvm.internal.f0.g(Float.valueOf(this.fraction), Float.valueOf(((FractionalThreshold) other).fraction));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.fraction);
    }

    @dl.d
    public String toString() {
        return "FractionalThreshold(fraction=" + this.fraction + ')';
    }
}

package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.layout.g, reason: from toString */
/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/g;", "Landroidx/compose/ui/layout/c;", "Lb1/m;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", ak.av, "(JJ)J", "", "b", "value", ak.aF, "", "toString", "", "hashCode", "", "other", "", "equals", "F", "e", "()F", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FixedScale implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float value;

    public FixedScale(float f10) {
        this.value = f10;
    }

    public static /* synthetic */ FixedScale d(FixedScale fixedScale, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fixedScale.value;
        }
        return fixedScale.c(f10);
    }

    @Override // androidx.compose.ui.layout.c
    public long a(long srcSize, long dstSize) {
        float f10 = this.value;
        return o1.a(f10, f10);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @dl.d
    public final FixedScale c(float value) {
        return new FixedScale(value);
    }

    public final float e() {
        return this.value;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FixedScale) && kotlin.jvm.internal.f0.g(Float.valueOf(this.value), Float.valueOf(((FixedScale) other).value));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    @dl.d
    public String toString() {
        return "FixedScale(value=" + this.value + ')';
    }
}

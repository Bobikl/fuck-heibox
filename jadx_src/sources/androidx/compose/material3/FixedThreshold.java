package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.d0, reason: from toString */
/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\n\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0003\u001a\u00020\u0002HÂ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/d0;", "Landroidx/compose/material3/z1;", "Ls1/h;", "b", "()F", "Ls1/e;", "", "fromValue", "toValue", ak.av, androidx.constraintlayout.core.motion.utils.w.c.R, ak.aF, "(F)Landroidx/compose/material3/d0;", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "<init>", "(FLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FixedThreshold implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float offset;

    private FixedThreshold(float f10) {
        this.offset = f10;
    }

    public /* synthetic */ FixedThreshold(float f10, kotlin.jvm.internal.u uVar) {
        this(f10);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final float getOffset() {
        return this.offset;
    }

    public static /* synthetic */ FixedThreshold d(FixedThreshold fixedThreshold, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fixedThreshold.offset;
        }
        return fixedThreshold.c(f10);
    }

    @Override // androidx.compose.material3.z1
    public float a(@dl.d s1.e eVar, float f10, float f11) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        return f10 + (eVar.E1(this.offset) * Math.signum(f11 - f10));
    }

    @dl.d
    public final FixedThreshold c(float offset) {
        return new FixedThreshold(offset, null);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FixedThreshold) && s1.h.l(this.offset, ((FixedThreshold) other).offset);
    }

    public int hashCode() {
        return s1.h.n(this.offset);
    }

    @dl.d
    public String toString() {
        return "FixedThreshold(offset=" + ((Object) s1.h.s(this.offset)) + ')';
    }
}

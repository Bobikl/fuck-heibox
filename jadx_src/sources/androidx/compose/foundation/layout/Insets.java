package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.u, reason: from toString */
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u001d\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001d\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u001d\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001d\u0010\u0018\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/u;", "Landroidx/compose/foundation/layout/h1;", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "b", ak.av, "d", ak.aF, "", "toString", "", "other", "", "equals", "hashCode", "Ls1/h;", "F", "leftDp", "topDp", "rightDp", "e", "bottomDp", "<init>", "(FFFFLkotlin/jvm/internal/u;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class Insets implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float right;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float bottom;

    private Insets(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public /* synthetic */ Insets(float f10, float f11, float f12, float f13, kotlin.jvm.internal.u uVar) {
        this(f10, f11, f12, f13);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int a(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return density.e1(this.top);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int b(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return density.e1(this.left);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int c(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return density.e1(this.bottom);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int d(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return density.e1(this.right);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Insets)) {
            return false;
        }
        Insets insets = (Insets) other;
        return s1.h.l(this.left, insets.left) && s1.h.l(this.top, insets.top) && s1.h.l(this.right, insets.right) && s1.h.l(this.bottom, insets.bottom);
    }

    public int hashCode() {
        return (((((s1.h.n(this.left) * 31) + s1.h.n(this.top)) * 31) + s1.h.n(this.right)) * 31) + s1.h.n(this.bottom);
    }

    @dl.d
    public String toString() {
        return "Insets(left=" + ((Object) s1.h.s(this.left)) + ", top=" + ((Object) s1.h.s(this.top)) + ", right=" + ((Object) s1.h.s(this.right)) + ", bottom=" + ((Object) s1.h.s(this.bottom)) + ')';
    }
}

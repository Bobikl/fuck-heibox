package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.p0, reason: from toString */
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/p0;", "Landroidx/compose/foundation/layout/h1;", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "b", ak.av, "d", ak.aF, "", "toString", "", "other", "", "equals", "hashCode", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/foundation/layout/m0;", "paddingValues", "<init>", "(Landroidx/compose/foundation/layout/m0;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class PaddingValues implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m0 paddingValues;

    public PaddingValues(@dl.d m0 paddingValues) {
        kotlin.jvm.internal.f0.p(paddingValues, "paddingValues");
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.h1
    public int a(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return density.e1(this.paddingValues.getTop());
    }

    @Override // androidx.compose.foundation.layout.h1
    public int b(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return density.e1(this.paddingValues.b(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.h1
    public int c(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return density.e1(this.paddingValues.getBottom());
    }

    @Override // androidx.compose.foundation.layout.h1
    public int d(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return density.e1(this.paddingValues.c(layoutDirection));
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PaddingValues) {
            return kotlin.jvm.internal.f0.g(((PaddingValues) other).paddingValues, this.paddingValues);
        }
        return false;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @dl.d
    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return "PaddingValues(" + ((Object) s1.h.s(this.paddingValues.b(layoutDirection))) + ", " + ((Object) s1.h.s(this.paddingValues.getTop())) + ", " + ((Object) s1.h.s(this.paddingValues.c(layoutDirection))) + ", " + ((Object) s1.h.s(this.paddingValues.getBottom())) + ')';
    }
}

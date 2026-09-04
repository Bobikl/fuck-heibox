package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.z, reason: from toString */
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0018\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\bJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/z;", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/h;", "b", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "d", "()F", ak.aF, ak.av, "", "toString", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/foundation/layout/h1;", "Landroidx/compose/foundation/layout/h1;", "e", "()Landroidx/compose/foundation/layout/h1;", "insets", "Ls1/e;", "density", "<init>", "(Landroidx/compose/foundation/layout/h1;Ls1/e;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class InsetsPaddingValues implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final h1 insets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @dl.d
    private final s1.e density;

    public InsetsPaddingValues(@dl.d h1 insets, @dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(insets, "insets");
        kotlin.jvm.internal.f0.p(density, "density");
        this.insets = insets;
        this.density = density;
    }

    @Override // androidx.compose.foundation.layout.m0
    /* JADX INFO: renamed from: a */
    public float getBottom() {
        s1.e eVar = this.density;
        return eVar.E(this.insets.c(eVar));
    }

    @Override // androidx.compose.foundation.layout.m0
    public float b(@dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        s1.e eVar = this.density;
        return eVar.E(this.insets.b(eVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.m0
    public float c(@dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        s1.e eVar = this.density;
        return eVar.E(this.insets.d(eVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.m0
    /* JADX INFO: renamed from: d */
    public float getTop() {
        s1.e eVar = this.density;
        return eVar.E(this.insets.a(eVar));
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final h1 getInsets() {
        return this.insets;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) other;
        return kotlin.jvm.internal.f0.g(this.insets, insetsPaddingValues.insets) && kotlin.jvm.internal.f0.g(this.density, insetsPaddingValues.density);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    @dl.d
    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}

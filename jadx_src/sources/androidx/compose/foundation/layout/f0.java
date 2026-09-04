package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0015\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/f0;", "Landroidx/compose/foundation/layout/h1;", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "b", ak.av, "d", ak.aF, "", "other", "", "equals", "hashCode", "", "toString", "Landroidx/compose/foundation/layout/h1;", "e", "()Landroidx/compose/foundation/layout/h1;", "insets", "Landroidx/compose/foundation/layout/k1;", "I", "f", "()I", "sides", "<init>", "(Landroidx/compose/foundation/layout/h1;ILkotlin/jvm/internal/u;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class f0 implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 insets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int sides;

    private f0(h1 h1Var, int i10) {
        this.insets = h1Var;
        this.sides = i10;
    }

    public /* synthetic */ f0(h1 h1Var, int i10, kotlin.jvm.internal.u uVar) {
        this(h1Var, i10);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int a(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        if (k1.q(this.sides, k1.INSTANCE.k())) {
            return this.insets.a(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.h1
    public int b(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        if (k1.q(this.sides, layoutDirection == LayoutDirection.Ltr ? k1.INSTANCE.a() : k1.INSTANCE.b())) {
            return this.insets.b(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.h1
    public int c(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        if (k1.q(this.sides, k1.INSTANCE.e())) {
            return this.insets.c(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.h1
    public int d(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        if (k1.q(this.sides, layoutDirection == LayoutDirection.Ltr ? k1.INSTANCE.c() : k1.INSTANCE.d())) {
            return this.insets.d(density, layoutDirection);
        }
        return 0;
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
        if (!(other instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) other;
        return kotlin.jvm.internal.f0.g(this.insets, f0Var.insets) && k1.p(this.sides, f0Var.sides);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSides() {
        return this.sides;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + k1.r(this.sides);
    }

    @dl.d
    public String toString() {
        return '(' + this.insets + " only " + ((Object) k1.t(this.sides)) + ')';
    }
}

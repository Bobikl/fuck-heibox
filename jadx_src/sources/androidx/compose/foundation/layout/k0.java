package androidx.compose.foundation.layout;

import androidx.compose.runtime.h2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@t
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R+\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/k0;", "Landroidx/compose/foundation/layout/h1;", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "b", ak.av, "d", ak.aF, "<set-?>", "Landroidx/compose/runtime/a1;", "e", "()Landroidx/compose/foundation/layout/h1;", "f", "(Landroidx/compose/foundation/layout/h1;)V", "insets", "initialInsets", "<init>", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class k0 implements h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f6336c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 insets;

    /* JADX WARN: Multi-variable type inference failed */
    public k0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public k0(@dl.d h1 initialInsets) {
        kotlin.jvm.internal.f0.p(initialInsets, "initialInsets");
        this.insets = h2.g(initialInsets, null, 2, null);
    }

    public /* synthetic */ k0(h1 h1Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? i1.a(0, 0, 0, 0) : h1Var);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int a(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return e().a(density);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int b(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return e().b(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int c(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return e().c(density);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int d(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return e().d(density, layoutDirection);
    }

    @dl.d
    public final h1 e() {
        return (h1) this.insets.getValue();
    }

    public final void f(@dl.d h1 h1Var) {
        kotlin.jvm.internal.f0.p(h1Var, "<set-?>");
        this.insets.setValue(h1Var);
    }
}

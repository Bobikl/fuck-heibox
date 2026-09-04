package androidx.compose.foundation.layout;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.n3;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR+\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010*\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010 \u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/f;", "Landroidx/compose/foundation/layout/h1;", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "b", ak.av, "d", ak.aF, "Landroidx/core/view/n3;", "windowInsetsCompat", "typeMask", "Lkotlin/b2;", "j", "(Landroidx/core/view/n3;I)V", "", "other", "", "equals", "hashCode", "", "toString", "I", "f", "()I", "type", "Ljava/lang/String;", "name", "Landroidx/core/graphics/h0;", "<set-?>", "Landroidx/compose/runtime/a1;", "e", "()Landroidx/core/graphics/h0;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/core/graphics/h0;)V", "insets", "g", "()Z", "i", "(Z)V", "isVisible", "<init>", "(ILjava/lang/String;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class f implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 insets;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 isVisible;

    public f(int i10, @dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        this.type = i10;
        this.name = name;
        this.insets = h2.g(androidx.core.graphics.h0.f20741e, null, 2, null);
        this.isVisible = h2.g(Boolean.TRUE, null, 2, null);
    }

    private final void i(boolean z10) {
        this.isVisible.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.foundation.layout.h1
    public int a(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return e().f20743b;
    }

    @Override // androidx.compose.foundation.layout.h1
    public int b(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return e().f20742a;
    }

    @Override // androidx.compose.foundation.layout.h1
    public int c(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return e().f20745d;
    }

    @Override // androidx.compose.foundation.layout.h1
    public int d(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return e().f20744c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final androidx.core.graphics.h0 e() {
        return (androidx.core.graphics.h0) this.insets.getValue();
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof f) && this.type == ((f) other).type;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public final void h(@dl.d androidx.core.graphics.h0 h0Var) {
        kotlin.jvm.internal.f0.p(h0Var, "<set-?>");
        this.insets.setValue(h0Var);
    }

    public int hashCode() {
        return this.type;
    }

    public final void j(@dl.d n3 windowInsetsCompat, int typeMask) {
        kotlin.jvm.internal.f0.p(windowInsetsCompat, "windowInsetsCompat");
        if (typeMask == 0 || (typeMask & this.type) != 0) {
            h(windowInsetsCompat.f(this.type));
            i(windowInsetsCompat.C(this.type));
        }
    }

    @dl.d
    public String toString() {
        return this.name + '(' + e().f20742a + ", " + e().f20743b + ", " + e().f20744c + ", " + e().f20745d + ')';
    }
}

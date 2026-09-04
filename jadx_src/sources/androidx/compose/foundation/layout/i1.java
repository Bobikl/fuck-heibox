package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001f\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0012\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\f\u001a\f\u0010\u000f\u001a\u00020\u0000*\u00020\tH\u0000\u001a.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u001a;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u00162\b\b\u0002\u0010\u0014\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/h1;", "insets", "k", "i", "e", "Landroidx/compose/foundation/layout/k1;", "sides", "j", "(Landroidx/compose/foundation/layout/h1;I)Landroidx/compose/foundation/layout/h1;", "Landroidx/compose/foundation/layout/m0;", "g", "(Landroidx/compose/foundation/layout/h1;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/layout/m0;", "Ls1/e;", "density", RXScreenCaptureService.KEY_HEIGHT, "f", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", ak.av, "Ls1/h;", ak.aF, "(FFFF)Landroidx/compose/foundation/layout/h1;", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class i1 {
    @dl.d
    public static final h1 a(int i10, int i11, int i12, int i13) {
        return new Insets(i10, i11, i12, i13);
    }

    public static /* synthetic */ h1 b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return a(i10, i11, i12, i13);
    }

    @dl.d
    public static final h1 c(float f10, float f11, float f12, float f13) {
        return new Insets(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ h1 d(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.g(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.g(0);
        }
        if ((i10 & 4) != 0) {
            f12 = s1.h.g(0);
        }
        if ((i10 & 8) != 0) {
            f13 = s1.h.g(0);
        }
        return c(f10, f11, f12, f13);
    }

    @dl.d
    public static final h1 e(@dl.d h1 h1Var, @dl.d h1 insets) {
        kotlin.jvm.internal.f0.p(h1Var, "<this>");
        kotlin.jvm.internal.f0.p(insets, "insets");
        return new a(h1Var, insets);
    }

    @dl.d
    public static final h1 f(@dl.d m0 m0Var) {
        kotlin.jvm.internal.f0.p(m0Var, "<this>");
        return new PaddingValues(m0Var);
    }

    @m1
    @dl.d
    @androidx.compose.runtime.h
    public static final m0 g(@dl.d h1 h1Var, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(h1Var, "<this>");
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1485016250, i10, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:242)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(h1Var, (s1.e) pVar.K(CompositionLocalsKt.i()));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return insetsPaddingValues;
    }

    @dl.d
    public static final m0 h(@dl.d h1 h1Var, @dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(h1Var, "<this>");
        kotlin.jvm.internal.f0.p(density, "density");
        return new InsetsPaddingValues(h1Var, density);
    }

    @dl.d
    public static final h1 i(@dl.d h1 h1Var, @dl.d h1 insets) {
        kotlin.jvm.internal.f0.p(h1Var, "<this>");
        kotlin.jvm.internal.f0.p(insets, "insets");
        return new s(h1Var, insets);
    }

    @dl.d
    public static final h1 j(@dl.d h1 only, int i10) {
        kotlin.jvm.internal.f0.p(only, "$this$only");
        return new f0(only, i10, null);
    }

    @dl.d
    public static final h1 k(@dl.d h1 h1Var, @dl.d h1 insets) {
        kotlin.jvm.internal.f0.p(h1Var, "<this>");
        kotlin.jvm.internal.f0.p(insets, "insets");
        return new d1(h1Var, insets);
    }
}

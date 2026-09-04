package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J=\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\tJ;\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001f\u001a\u00020\u001c8Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/e0;", "", "Ls1/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", ak.aF, "(FFFFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/FloatingActionButtonElevation;", "j", ak.av, "(FFFF)Landroidx/compose/material3/FloatingActionButtonElevation;", "b", "F", "f", "()F", "LargeIconSize", "Landroidx/compose/ui/graphics/g2;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "i", "smallShape", "g", "largeShape", "e", "extendedFabShape", "Landroidx/compose/ui/graphics/l0;", "d", "(Landroidx/compose/runtime/p;I)J", "containerColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e0 f11833a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float LargeIconSize = t0.n.f140069a.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11835c = 0;

    private e0() {
    }

    public static /* synthetic */ FloatingActionButtonElevation b(e0 e0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
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
        return e0Var.a(f10, f11, f12, f13);
    }

    @dl.d
    public final FloatingActionButtonElevation a(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation) {
        return new FloatingActionButtonElevation(defaultElevation, pressedElevation, focusedElevation, hoveredElevation, null);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final FloatingActionButtonElevation c(float f10, float f11, float f12, float f13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-241106249);
        if ((i11 & 1) != 0) {
            f10 = t0.p.f140183a.b();
        }
        float f14 = f10;
        if ((i11 & 2) != 0) {
            f11 = t0.p.f140183a.p();
        }
        float f15 = f11;
        if ((i11 & 4) != 0) {
            f12 = t0.p.f140183a.f();
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = t0.p.f140183a.h();
        }
        float f17 = f13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-241106249, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:421)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f14, f15, f16, f17, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return floatingActionButtonElevation;
    }

    @xh.h(name = "getContainerColor")
    @androidx.compose.runtime.h
    public final long d(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1855656391);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1855656391, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:407)");
        }
        long jK = ColorSchemeKt.k(t0.p.f140183a.a(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @dl.d
    @xh.h(name = "getExtendedFabShape")
    @androidx.compose.runtime.h
    public final g2 e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-536021915);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-536021915, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:403)");
        }
        g2 g2VarD = ShapesKt.d(t0.m.f140008a.d(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    public final float f() {
        return LargeIconSize;
    }

    @dl.d
    @xh.h(name = "getLargeShape")
    @androidx.compose.runtime.h
    public final g2 g(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1835912187);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1835912187, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:400)");
        }
        g2 g2VarD = ShapesKt.d(t0.n.f140069a.d(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 h(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-53247565);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-53247565, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:394)");
        }
        g2 g2VarD = ShapesKt.d(t0.p.f140183a.d(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @xh.h(name = "getSmallShape")
    @androidx.compose.runtime.h
    public final g2 i(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(394933381);
        if (ComposerKt.g0()) {
            ComposerKt.w0(394933381, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:397)");
        }
        g2 g2VarD = ShapesKt.d(t0.o.f140139a.d(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final FloatingActionButtonElevation j(float f10, float f11, float f12, float f13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-285065125);
        if ((i11 & 1) != 0) {
            f10 = t0.p.f140183a.l();
        }
        float f14 = f10;
        if ((i11 & 2) != 0) {
            f11 = t0.p.f140183a.o();
        }
        float f15 = f11;
        if ((i11 & 4) != 0) {
            f12 = t0.p.f140183a.m();
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = t0.p.f140183a.n();
        }
        float f17 = f13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-285065125, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:444)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f14, f15, f16, f17, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return floatingActionButtonElevation;
    }
}

package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/m1;", "", "Landroidx/compose/ui/graphics/g2;", "f", "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "Landroidx/compose/ui/graphics/l0;", ak.aF, "(Landroidx/compose/runtime/p;I)J", "color", "d", "contentColor", ak.av, "actionColor", "b", "actionContentColor", "e", "dismissActionContentColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final m1 f12029a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12030b = 0;

    private m1() {
    }

    @xh.h(name = "getActionColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(743425465);
        if (ComposerKt.g0()) {
            ComposerKt.w0(743425465, i10, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionColor> (Snackbar.kt:414)");
        }
        long jK = ColorSchemeKt.k(t0.t0.f140362a.c(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getActionContentColor")
    @androidx.compose.runtime.h
    public final long b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1313141593);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1313141593, i10, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionContentColor> (Snackbar.kt:417)");
        }
        long jK = ColorSchemeKt.k(t0.t0.f140362a.c(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getColor")
    @androidx.compose.runtime.h
    public final long c(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(987938253);
        if (ComposerKt.g0()) {
            ComposerKt.w0(987938253, i10, -1, "androidx.compose.material3.SnackbarDefaults.<get-color> (Snackbar.kt:408)");
        }
        long jK = ColorSchemeKt.k(t0.t0.f140362a.f(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getContentColor")
    @androidx.compose.runtime.h
    public final long d(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1021310823);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1021310823, i10, -1, "androidx.compose.material3.SnackbarDefaults.<get-contentColor> (Snackbar.kt:411)");
        }
        long jK = ColorSchemeKt.k(t0.t0.f140362a.o(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getDismissActionContentColor")
    @androidx.compose.runtime.h
    public final long e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-528602817);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-528602817, i10, -1, "androidx.compose.material3.SnackbarDefaults.<get-dismissActionContentColor> (Snackbar.kt:420)");
        }
        long jK = ColorSchemeKt.k(t0.t0.f140362a.k(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 f(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-551629101);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-551629101, i10, -1, "androidx.compose.material3.SnackbarDefaults.<get-shape> (Snackbar.kt:405)");
        }
        g2 g2VarD = ShapesKt.d(t0.t0.f140362a.h(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }
}

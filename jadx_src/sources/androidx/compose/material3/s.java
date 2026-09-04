package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R \u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00118Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/s;", "", "Ls1/h;", "b", "F", "d", "()F", "ModalDrawerElevation", ak.aF, "e", "PermanentDrawerElevation", "DismissibleDrawerElevation", "MaximumDrawerWidth", "Landroidx/compose/ui/graphics/g2;", "g", "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "Landroidx/compose/ui/graphics/l0;", "f", "(Landroidx/compose/runtime/p;I)J", "scrimColor", ak.av, "containerColor", "Landroidx/compose/foundation/layout/h1;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/layout/h1;", "windowInsets", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final s f12103a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ModalDrawerElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float PermanentDrawerElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float DismissibleDrawerElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float MaximumDrawerWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12108f = 0;

    static {
        t0.g0 g0Var = t0.g0.f139778a;
        ModalDrawerElevation = g0Var.F();
        PermanentDrawerElevation = g0Var.G();
        DismissibleDrawerElevation = g0Var.G();
        MaximumDrawerWidth = g0Var.q();
    }

    private s() {
    }

    @xh.h(name = "getContainerColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1797317261);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1797317261, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:623)");
        }
        long jK = ColorSchemeKt.k(t0.g0.f139778a.n(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    public final float b() {
        return DismissibleDrawerElevation;
    }

    public final float c() {
        return MaximumDrawerWidth;
    }

    public final float d() {
        return ModalDrawerElevation;
    }

    public final float e() {
        return PermanentDrawerElevation;
    }

    @xh.h(name = "getScrimColor")
    @androidx.compose.runtime.h
    public final long f(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1055074989);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1055074989, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:620)");
        }
        long jW = androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.q0.f140234a.a(), pVar, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jW;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 g(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(928378975);
        if (ComposerKt.g0()) {
            ComposerKt.w0(928378975, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:616)");
        }
        g2 g2VarD = ShapesKt.d(t0.g0.f139778a.o(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @xh.h(name = "getWindowInsets")
    @androidx.compose.runtime.h
    public final androidx.compose.foundation.layout.h1 h(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-909973510);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-909973510, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:633)");
        }
        androidx.compose.foundation.layout.h1 h1VarA = v1.a(androidx.compose.foundation.layout.h1.INSTANCE, pVar, 8);
        androidx.compose.foundation.layout.k1.Companion companion = androidx.compose.foundation.layout.k1.INSTANCE;
        androidx.compose.foundation.layout.h1 h1VarJ = androidx.compose.foundation.layout.i1.j(h1VarA, androidx.compose.foundation.layout.k1.s(companion.l(), companion.j()));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return h1VarJ;
    }
}

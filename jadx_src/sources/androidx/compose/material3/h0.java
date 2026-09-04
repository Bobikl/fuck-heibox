package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J=\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJQ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\tJQ\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ=\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\tJQ\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ=\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\tJQ\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/material3/h0;", "", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "Landroidx/compose/material3/g0;", "g", "(JJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/g0;", "checkedContainerColor", "checkedContentColor", "Landroidx/compose/material3/i0;", RXScreenCaptureService.KEY_HEIGHT, "(JJJJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/i0;", ak.av, "b", ak.aF, "d", "j", "l", "", "enabled", "checked", "Landroidx/compose/foundation/g;", "k", "(ZZLandroidx/compose/runtime/p;I)Landroidx/compose/foundation/g;", "i", "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/foundation/g;", "Landroidx/compose/ui/graphics/g2;", "e", "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "filledShape", "f", "outlinedShape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h0 f11896a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11897b = 0;

    private h0() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g0 a(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-669858473);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.u.f140380a.b(), pVar, 6) : j10;
        long jC = (i11 & 2) != 0 ? ColorSchemeKt.c(jK, pVar, i10 & 14) : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.u.f140380a.f(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jW2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.u.f140380a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-669858473, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:608)");
        }
        g0 g0Var = new g0(jK, jC, jW, jW2, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g0Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final i0 b(long j10, long j11, long j12, long j13, long j14, long j15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1887173701);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.u.f140380a.t(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.u.f140380a.p(), pVar, 6) : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.u.f140380a.f(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jW2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.u.f140380a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jK3 = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.u.f140380a.j(), pVar, 6) : j14;
        long jC = (i11 & 32) != 0 ? ColorSchemeKt.c(jK3, pVar, (i10 >> 12) & 14) : j15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1887173701, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:635)");
        }
        i0 i0Var = new i0(jK, jK2, jW, jW2, jK3, jC, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return i0Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g0 c(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-18532843);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.x.f140533a.b(), pVar, 6) : j10;
        long jC = (i11 & 2) != 0 ? ColorSchemeKt.c(jK, pVar, i10 & 14) : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.x.f140533a.f(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jW2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.x.f140533a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-18532843, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:666)");
        }
        g0 g0Var = new g0(jK, jC, jW, jW2, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g0Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final i0 d(long j10, long j11, long j12, long j13, long j14, long j15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-19426557);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.x.f140533a.t(), pVar, 6) : j10;
        long jC = (i11 & 2) != 0 ? ColorSchemeKt.c(jK, pVar, i10 & 14) : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.x.f140533a.f(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jW2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.x.f140533a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jK2 = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.x.f140533a.j(), pVar, 6) : j14;
        long jK3 = (i11 & 32) != 0 ? ColorSchemeKt.k(t0.x.f140533a.l(), pVar, 6) : j15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-19426557, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:693)");
        }
        i0 i0Var = new i0(jK, jC, jW, jW2, jK2, jK3, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return i0Var;
    }

    @dl.d
    @xh.h(name = "getFilledShape")
    @androidx.compose.runtime.h
    public final g2 e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1265841879);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1265841879, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:539)");
        }
        g2 g2VarD = ShapesKt.d(t0.u.f140380a.c(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @xh.h(name = "getOutlinedShape")
    @androidx.compose.runtime.h
    public final g2 f(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1327125527);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1327125527, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:543)");
        }
        g2 g2VarD = ShapesKt.d(t0.l0.f139987a.a(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g0 g(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(999008085);
        long jS = (i11 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jM = (i11 & 2) != 0 ? ((androidx.compose.ui.graphics.l0) pVar.K(ContentColorKt.a())).M() : j11;
        long jS2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(jM, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(999008085, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:555)");
        }
        g0 g0Var = new g0(jS, jM, jS2, jW, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g0Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final i0 h(long j10, long j11, long j12, long j13, long j14, long j15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-2020719549);
        long jS = (i11 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jM = (i11 & 2) != 0 ? ((androidx.compose.ui.graphics.l0) pVar.K(ContentColorKt.a())).M() : j11;
        long jS2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(jM, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jS3 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j14;
        long jK = (i11 & 32) != 0 ? ColorSchemeKt.k(t0.z.f140615a.e(), pVar, 6) : j15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2020719549, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:581)");
        }
        i0 i0Var = new i0(jS, jM, jS2, jW, jS3, jK, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return i0Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final BorderStroke i(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long jW;
        pVar.T(-511461558);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-511461558, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:789)");
        }
        if (z10) {
            pVar.T(1252615072);
            jW = ((androidx.compose.ui.graphics.l0) pVar.K(ContentColorKt.a())).M();
            pVar.c0();
        } else {
            pVar.T(1252615127);
            jW = androidx.compose.ui.graphics.l0.w(((androidx.compose.ui.graphics.l0) pVar.K(ContentColorKt.a())).M(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            pVar.c0();
        }
        androidx.compose.ui.graphics.l0 l0VarN = androidx.compose.ui.graphics.l0.n(jW);
        pVar.T(1157296644);
        boolean zS = pVar.s(l0VarN);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = androidx.compose.foundation.h.a(t0.l0.f139987a.p(), jW);
            pVar.N(objU);
        }
        pVar.c0();
        BorderStroke borderStroke = (BorderStroke) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return borderStroke;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g0 j(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1030517545);
        long jS = (i11 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jM = (i11 & 2) != 0 ? ((androidx.compose.ui.graphics.l0) pVar.K(ContentColorKt.a())).M() : j11;
        long jS2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(jM, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1030517545, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:723)");
        }
        g0 g0Var = new g0(jS, jM, jS2, jW, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g0Var;
    }

    @dl.e
    @androidx.compose.runtime.h
    public final BorderStroke k(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1244729690);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1244729690, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:776)");
        }
        if (z11) {
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            return null;
        }
        BorderStroke borderStrokeI = i(z10, pVar, (i10 & 14) | ((i10 >> 3) & 112));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return borderStrokeI;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final i0 l(long j10, long j11, long j12, long j13, long j14, long j15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(2130592709);
        long jS = (i11 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jM = (i11 & 2) != 0 ? ((androidx.compose.ui.graphics.l0) pVar.K(ContentColorKt.a())).M() : j11;
        long jS2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(jM, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jK = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.l0.f139987a.g(), pVar, 6) : j14;
        long jC = (i11 & 32) != 0 ? ColorSchemeKt.c(jK, pVar, (i10 >> 12) & 14) : j15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(2130592709, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:749)");
        }
        i0 i0Var = new i0(jS, jM, jS2, jW, jK, jC, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return i0Var;
    }
}

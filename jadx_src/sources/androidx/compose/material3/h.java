package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&JQ\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJQ\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u000bJQ\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000bJ=\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0015J=\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010$\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b#\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/material3/h;", "", "Ls1/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/CardElevation;", "b", "(FFFFFFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/CardElevation;", "d", "j", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "Landroidx/compose/material3/g;", ak.av, "(JJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/g;", ak.aF, "i", "", "enabled", "Landroidx/compose/foundation/g;", RXScreenCaptureService.KEY_HEIGHT, "(ZLandroidx/compose/runtime/p;II)Landroidx/compose/foundation/g;", "Landroidx/compose/ui/graphics/g2;", "g", "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "e", "elevatedShape", "f", "outlinedShape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h f11894a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11895b = 0;

    private h() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g a(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        long jI;
        pVar.T(-1589582123);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.t.f140349a.a(), pVar, 6) : j10;
        long jC = (i11 & 2) != 0 ? ColorSchemeKt.c(jK, pVar, i10 & 14) : j11;
        if ((i11 & 4) != 0) {
            t0.t tVar = t0.t.f140349a;
            jI = androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(tVar.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.j(o0.f12059a.a(pVar, 6), tVar.e()));
        } else {
            jI = j12;
        }
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.c(jK, pVar, i10 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1589582123, i10, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:455)");
        }
        g gVar = new g(jK, jC, jI, jW, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return gVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final CardElevation b(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-574898487);
        float fB = (i11 & 1) != 0 ? t0.t.f140349a.b() : f10;
        float fK = (i11 & 2) != 0 ? t0.t.f140349a.k() : f11;
        float fG = (i11 & 4) != 0 ? t0.t.f140349a.g() : f12;
        float fH = (i11 & 8) != 0 ? t0.t.f140349a.h() : f13;
        float f16 = (i11 & 16) != 0 ? t0.t.f140349a.f() : f14;
        float fE = (i11 & 32) != 0 ? t0.t.f140349a.e() : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-574898487, i10, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:373)");
        }
        CardElevation cardElevation = new CardElevation(fB, fK, fG, fH, f16, fE, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return cardElevation;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g c(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        long jI;
        pVar.T(139558303);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.k.f139946a.a(), pVar, 6) : j10;
        long jC = (i11 & 2) != 0 ? ColorSchemeKt.c(jK, pVar, i10 & 14) : j11;
        if ((i11 & 4) != 0) {
            t0.k kVar = t0.k.f139946a;
            jI = androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(kVar.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.j(o0.f12059a.a(pVar, 6), kVar.f()));
        } else {
            jI = j12;
        }
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(jC, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(139558303, i10, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:484)");
        }
        g gVar = new g(jK, jC, jI, jW, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return gVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final CardElevation d(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1154241939);
        float fB = (i11 & 1) != 0 ? t0.k.f139946a.b() : f10;
        float fL = (i11 & 2) != 0 ? t0.k.f139946a.l() : f11;
        float fH = (i11 & 4) != 0 ? t0.k.f139946a.h() : f12;
        float fI = (i11 & 8) != 0 ? t0.k.f139946a.i() : f13;
        float fG = (i11 & 16) != 0 ? t0.k.f139946a.g() : f14;
        float f16 = (i11 & 32) != 0 ? t0.k.f139946a.f() : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1154241939, i10, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:401)");
        }
        CardElevation cardElevation = new CardElevation(fB, fL, fH, fI, fG, f16, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return cardElevation;
    }

    @dl.d
    @xh.h(name = "getElevatedShape")
    @androidx.compose.runtime.h
    public final g2 e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-133496185);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-133496185, i10, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:357)");
        }
        g2 g2VarD = ShapesKt.d(t0.k.f139946a.c(), pVar, 6);
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
        pVar.T(1095404023);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1095404023, i10, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:360)");
        }
        g2 g2VarD = ShapesKt.d(t0.k0.f139960a.c(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 g(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1266660211);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1266660211, i10, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:354)");
        }
        g2 g2VarD = ShapesKt.d(t0.t.f140349a.c(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final BorderStroke h(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        long jI;
        pVar.T(-392936593);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-392936593, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:533)");
        }
        if (z10) {
            pVar.T(-31428837);
            jI = ColorSchemeKt.k(t0.k0.f139960a.o(), pVar, 6);
            pVar.c0();
        } else {
            pVar.T(-31428766);
            t0.k0 k0Var = t0.k0.f139960a;
            jI = androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(k0Var.f(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.j(o0.f12059a.a(pVar, 6), k0Var.e()));
            pVar.c0();
        }
        androidx.compose.ui.graphics.l0 l0VarN = androidx.compose.ui.graphics.l0.n(jI);
        pVar.T(1157296644);
        boolean zS = pVar.s(l0VarN);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = androidx.compose.foundation.h.a(t0.k0.f139960a.p(), jI);
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
    public final g i(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1112362409);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.k0.f139960a.a(), pVar, 6) : j10;
        long jC = (i11 & 2) != 0 ? ColorSchemeKt.c(jK, pVar, i10 & 14) : j11;
        long j14 = (i11 & 4) != 0 ? jK : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(jC, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1112362409, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:514)");
        }
        g gVar = new g(jK, jC, j14, jW, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return gVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final CardElevation j(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-97678773);
        float fB = (i11 & 1) != 0 ? t0.k0.f139960a.b() : f10;
        float f16 = (i11 & 2) != 0 ? fB : f11;
        float f17 = (i11 & 4) != 0 ? fB : f12;
        float f18 = (i11 & 8) != 0 ? fB : f13;
        float fG = (i11 & 16) != 0 ? t0.k0.f139960a.g() : f14;
        float fE = (i11 & 32) != 0 ? t0.k0.f139960a.e() : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-97678773, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:429)");
        }
        CardElevation cardElevation = new CardElevation(fB, f16, f17, f18, fG, fE, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return cardElevation;
    }
}

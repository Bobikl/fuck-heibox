package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AJ=\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\tJ=\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\tJ=\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\tJ=\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\tJG\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0016JG\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016R\u001d\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001d\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0017\u0010#\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0017\u0010&\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b%\u0010\u001fR \u0010*\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010)R \u0010-\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010)R \u0010/\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b.\u0010)R \u00101\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b0\u0010\u0019\u001a\u0004\b0\u0010)R\u0011\u00105\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00106\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b'\u00104R\u0011\u00107\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b+\u00104R\u0011\u00109\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b8\u00104R\u0011\u0010;\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b:\u00104R\u0011\u0010?\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/material3/f;", "", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "Landroidx/compose/material3/e;", ak.av, "(JJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/e;", ak.aF, "e", "t", ak.aG, "Ls1/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Landroidx/compose/material3/ButtonElevation;", "b", "(FFFFFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/ButtonElevation;", "d", "f", "F", "ButtonHorizontalPadding", "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/foundation/layout/m0;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/foundation/layout/m0;", "ContentPadding", "ButtonWithIconHorizontalStartPadding", "g", "ButtonWithIconContentPadding", "TextButtonHorizontalPadding", "r", "TextButtonContentPadding", "i", "n", "()F", "MinWidth", "j", "m", "MinHeight", "k", "IconSize", "l", "IconSpacing", "Landroidx/compose/ui/graphics/g2;", "q", "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "elevatedShape", "filledTonalShape", "p", "outlinedShape", ak.aB, "textShape", "Landroidx/compose/foundation/g;", "o", "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/g;", "outlinedButtonBorder", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f f11853a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.layout.m0 ContentPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonWithIconHorizontalStartPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.layout.m0 ButtonWithIconContentPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.layout.m0 TextButtonContentPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final float IconSpacing;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f11865m = 0;

    static {
        float fG = s1.h.g(24);
        ButtonHorizontalPadding = fG;
        float f10 = 8;
        float fG2 = s1.h.g(f10);
        ButtonVerticalPadding = fG2;
        androidx.compose.foundation.layout.m0 m0VarD = PaddingKt.d(fG, fG2, fG, fG2);
        ContentPadding = m0VarD;
        float fG3 = s1.h.g(16);
        ButtonWithIconHorizontalStartPadding = fG3;
        ButtonWithIconContentPadding = PaddingKt.d(fG3, fG2, fG, fG2);
        float fG4 = s1.h.g(12);
        TextButtonHorizontalPadding = fG4;
        TextButtonContentPadding = PaddingKt.d(fG4, m0VarD.getTop(), fG4, m0VarD.getBottom());
        MinWidth = s1.h.g(58);
        MinHeight = s1.h.g(40);
        IconSize = t0.s.f140298a.p();
        IconSpacing = s1.h.g(f10);
    }

    private f() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final e a(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-339300779);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.s.f140298a.a(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.s.f140298a.q(), pVar, 6) : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.s.f140298a.e(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jW2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.s.f140298a.h(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-339300779, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:547)");
        }
        e eVar = new e(jK, jK2, jW, jW2, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return eVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final ButtonElevation b(float f10, float f11, float f12, float f13, float f14, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1827791191);
        float fB = (i11 & 1) != 0 ? t0.s.f140298a.b() : f10;
        float fS = (i11 & 2) != 0 ? t0.s.f140298a.s() : f11;
        float fI = (i11 & 4) != 0 ? t0.s.f140298a.i() : f12;
        float fL = (i11 & 8) != 0 ? t0.s.f140298a.l() : f13;
        float f15 = (i11 & 16) != 0 ? t0.s.f140298a.f() : f14;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1827791191, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:674)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fB, fS, fI, fL, f15, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return buttonElevation;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final e c(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1507908383);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.j.f139896a.a(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.j.f139896a.r(), pVar, 6) : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.j.f139896a.f(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jW2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.j.f139896a.i(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1507908383, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:572)");
        }
        e eVar = new e(jK, jK2, jW, jW2, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return eVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final ButtonElevation d(float f10, float f11, float f12, float f13, float f14, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1065482445);
        float fB = (i11 & 1) != 0 ? t0.j.f139896a.b() : f10;
        float fT = (i11 & 2) != 0 ? t0.j.f139896a.t() : f11;
        float fJ = (i11 & 4) != 0 ? t0.j.f139896a.j() : f12;
        float fM = (i11 & 8) != 0 ? t0.j.f139896a.m() : f13;
        float fG = (i11 & 16) != 0 ? t0.j.f139896a.g() : f14;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1065482445, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:700)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fB, fT, fJ, fM, fG, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return buttonElevation;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final e e(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1670757653);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.w.f140476a.a(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.w.f140476a.q(), pVar, 6) : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.w.f140476a.e(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jW2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.w.f140476a.h(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1670757653, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:598)");
        }
        e eVar = new e(jK, jK2, jW, jW2, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return eVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final ButtonElevation f(float f10, float f11, float f12, float f13, float f14, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(5982871);
        float fB = (i11 & 1) != 0 ? t0.w.f140476a.b() : f10;
        float fS = (i11 & 2) != 0 ? t0.w.f140476a.s() : f11;
        float fI = (i11 & 4) != 0 ? t0.w.f140476a.i() : f12;
        float fL = (i11 & 8) != 0 ? t0.w.f140476a.l() : f13;
        float fG = (i11 & 16) != 0 ? s1.h.g(0) : f14;
        if (ComposerKt.g0()) {
            ComposerKt.w0(5982871, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:727)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fB, fS, fI, fL, fG, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return buttonElevation;
    }

    @dl.d
    public final androidx.compose.foundation.layout.m0 g() {
        return ButtonWithIconContentPadding;
    }

    @dl.d
    public final androidx.compose.foundation.layout.m0 h() {
        return ContentPadding;
    }

    @dl.d
    @xh.h(name = "getElevatedShape")
    @androidx.compose.runtime.h
    public final g2 i(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(2143958791);
        if (ComposerKt.g0()) {
            ComposerKt.w0(2143958791, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:526)");
        }
        g2 g2VarD = ShapesKt.d(t0.j.f139896a.d(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @xh.h(name = "getFilledTonalShape")
    @androidx.compose.runtime.h
    public final g2 j(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-886584987);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-886584987, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:529)");
        }
        g2 g2VarD = ShapesKt.d(t0.w.f140476a.d(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    public final float k() {
        return IconSize;
    }

    public final float l() {
        return IconSpacing;
    }

    public final float m() {
        return MinHeight;
    }

    public final float n() {
        return MinWidth;
    }

    @dl.d
    @xh.h(name = "getOutlinedButtonBorder")
    @androidx.compose.runtime.h
    public final BorderStroke o(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-563957672);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-563957672, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:744)");
        }
        t0.j0 j0Var = t0.j0.f139922a;
        BorderStroke borderStrokeA = androidx.compose.foundation.h.a(j0Var.q(), ColorSchemeKt.k(j0Var.p(), pVar, 6));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return borderStrokeA;
    }

    @dl.d
    @xh.h(name = "getOutlinedShape")
    @androidx.compose.runtime.h
    public final g2 p(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-2045213065);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2045213065, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:532)");
        }
        g2 g2VarD = ShapesKt.d(t0.j0.f139922a.b(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 q(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1234923021);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1234923021, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:523)");
        }
        g2 g2VarD = ShapesKt.d(t0.s.f140298a.d(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    public final androidx.compose.foundation.layout.m0 r() {
        return TextButtonContentPadding;
    }

    @dl.d
    @xh.h(name = "getTextShape")
    @androidx.compose.runtime.h
    public final g2 s(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-349121587);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-349121587, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:535)");
        }
        g2 g2VarD = ShapesKt.d(t0.x0.f140556a.b(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final e t(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1778526249);
        long jS = (i11 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jK = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.j0.f139922a.n(), pVar, 6) : j11;
        long jS2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.j0.f139922a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1778526249, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:624)");
        }
        e eVar = new e(jS, jK, jS2, jW, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return eVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final e u(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1402274782);
        long jS = (i11 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jK = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.x0.f140556a.k(), pVar, 6) : j11;
        long jS2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.x0.f140556a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1402274782, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:648)");
        }
        e eVar = new e(jS, jK, jS2, jW, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return eVar;
    }
}

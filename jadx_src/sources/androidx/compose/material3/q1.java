package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)JQ\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJQ\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJQ\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u000bJQ\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0015R \u0010!\u001a\u00020\f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010#\u001a\u00020\f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\"\u0010 R\u0011\u0010'\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/material3/q1;", "", "Landroidx/compose/ui/graphics/l0;", "containerColor", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "Landroidx/compose/material3/m;", "g", "(JJJJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/m;", "Ls1/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/ChipElevation;", RXScreenCaptureService.KEY_HEIGHT, "(FFFFFFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/ChipElevation;", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/material3/l;", "f", "(JJFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/l;", ak.av, "b", "F", ak.aF, "()F", "Height", "d", "IconSize", "Landroidx/compose/ui/graphics/g2;", "e", "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final q1 f12093a = new q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12096d = 0;

    static {
        t0.v0 v0Var = t0.v0.f140450a;
        Height = v0Var.a();
        IconSize = v0Var.B();
    }

    private q1() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m a(long j10, long j11, long j12, long j13, long j14, long j15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1269423125);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.v0.f140450a.i(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.v0.f140450a.y(), pVar, 6) : j11;
        long jQ = (i11 & 4) != 0 ? o0.f12059a.a(pVar, 6).q() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v0.f140450a.k(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jW2 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v0.f140450a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jW3 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.l0.w(o0.f12059a.a(pVar, 6).p(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1269423125, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1249)");
        }
        androidx.compose.ui.graphics.l0.Companion companion = androidx.compose.ui.graphics.l0.INSTANCE;
        m mVar = new m(jK, jK2, jQ, companion.u(), jW, jW2, jW3, companion.u(), null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return mVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final ChipElevation b(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1118088467);
        float fJ = (i11 & 1) != 0 ? t0.v0.f140450a.j() : f10;
        float fO = (i11 & 2) != 0 ? t0.v0.f140450a.o() : f11;
        float fM = (i11 & 4) != 0 ? t0.v0.f140450a.m() : f12;
        float fN = (i11 & 8) != 0 ? t0.v0.f140450a.n() : f13;
        float f16 = (i11 & 16) != 0 ? t0.v0.f140450a.f() : f14;
        float fL = (i11 & 32) != 0 ? t0.v0.f140450a.l() : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1118088467, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1286)");
        }
        ChipElevation chipElevation = new ChipElevation(fJ, fO, fM, fN, f16, fL, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return chipElevation;
    }

    public final float c() {
        return Height;
    }

    public final float d() {
        return IconSize;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(641188183);
        if (ComposerKt.g0()) {
            ComposerKt.w0(641188183, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1303)");
        }
        g2 g2VarD = ShapesKt.d(t0.v0.f140450a.b(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final l f(long j10, long j11, float f10, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(439283919);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.v0.f140450a.s(), pVar, 6) : j10;
        long jW = (i11 & 2) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v0.f140450a.q(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        float fT = (i11 & 4) != 0 ? t0.v0.f140450a.t() : f10;
        if (ComposerKt.g0()) {
            ComposerKt.w0(439283919, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1226)");
        }
        l lVar = new l(jK, jW, fT, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return lVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m g(long j10, long j11, long j12, long j13, long j14, long j15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1882647883);
        long jS = (i11 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jK = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.v0.f140450a.y(), pVar, 6) : j11;
        long jK2 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.v0.f140450a.A(), pVar, 6) : j12;
        long jS2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j13;
        long jW = (i11 & 16) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v0.f140450a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jW2 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v0.f140450a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1882647883, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1169)");
        }
        androidx.compose.ui.graphics.l0.Companion companion = androidx.compose.ui.graphics.l0.INSTANCE;
        m mVar = new m(jS, jK, jK2, companion.u(), jS2, jW, jW2, companion.u(), null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return mVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final ChipElevation h(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1929994057);
        float fP = (i11 & 1) != 0 ? t0.v0.f140450a.p() : f10;
        float f16 = (i11 & 2) != 0 ? fP : f11;
        float f17 = (i11 & 4) != 0 ? fP : f12;
        float f18 = (i11 & 8) != 0 ? fP : f13;
        float f19 = (i11 & 16) != 0 ? t0.v0.f140450a.f() : f14;
        float f20 = (i11 & 32) != 0 ? fP : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1929994057, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1202)");
        }
        ChipElevation chipElevation = new ChipElevation(fP, f16, f17, f18, f19, f20, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return chipElevation;
    }
}

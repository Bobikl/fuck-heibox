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
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u008d\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJQ\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u008d\u0001\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0011JQ\u0010&\u001a\u00020\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u001bR \u0010*\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010,\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b+\u0010)R\u0011\u00100\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/material3/c0;", "", "Landroidx/compose/ui/graphics/l0;", "containerColor", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "Landroidx/compose/material3/g1;", "d", "(JJJJJJJJJJJJLandroidx/compose/runtime/p;III)Landroidx/compose/material3/g1;", "Ls1/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/SelectableChipElevation;", "e", "(FFFFFFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/SelectableChipElevation;", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "Landroidx/compose/material3/f1;", ak.aF, "(JJJJFFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/f1;", ak.av, "b", "F", "f", "()F", "Height", "g", "IconSize", "Landroidx/compose/ui/graphics/g2;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c0 f11810a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11813d = 0;

    static {
        t0.y yVar = t0.y.f140573a;
        Height = yVar.a();
        IconSize = yVar.C();
    }

    private c0() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g1 a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @dl.e androidx.compose.runtime.p pVar, int i10, int i11, int i12) {
        pVar.T(-915841711);
        long jK = (i12 & 1) != 0 ? ColorSchemeKt.k(t0.y.f140573a.n(), pVar, 6) : j10;
        long jK2 = (i12 & 2) != 0 ? ColorSchemeKt.k(t0.y.f140573a.V(), pVar, 6) : j11;
        long jK3 = (i12 & 4) != 0 ? ColorSchemeKt.k(t0.y.f140573a.U(), pVar, 6) : j12;
        long jW = (i12 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.y.f140573a.h(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jW2 = (i12 & 16) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.y.f140573a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jW3 = (i12 & 32) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.y.f140573a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long j22 = (i12 & 64) != 0 ? jW3 : j16;
        long jK4 = (i12 & 128) != 0 ? ColorSchemeKt.k(t0.y.f140573a.m(), pVar, 6) : j17;
        long j23 = (i12 & 256) != 0 ? jW : j18;
        long jK5 = (i12 & 512) != 0 ? ColorSchemeKt.k(t0.y.f140573a.L(), pVar, 6) : j19;
        long jK6 = (i12 & 1024) != 0 ? ColorSchemeKt.k(t0.y.f140573a.K(), pVar, 6) : j20;
        long j24 = (i12 & 2048) != 0 ? jK6 : j21;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-915841711, i10, i11, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:937)");
        }
        g1 g1Var = new g1(jK, jK2, jK3, jK3, jW, jW2, jW3, j22, jK4, j23, jK5, jK6, j24, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g1Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final SelectableChipElevation b(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(684803697);
        float fG = (i11 & 1) != 0 ? t0.y.f140573a.g() : f10;
        float fL = (i11 & 2) != 0 ? t0.y.f140573a.l() : f11;
        float fJ = (i11 & 4) != 0 ? t0.y.f140573a.j() : f12;
        float fK = (i11 & 8) != 0 ? t0.y.f140573a.k() : f13;
        float f16 = (i11 & 16) != 0 ? t0.y.f140573a.f() : f14;
        float fI = (i11 & 32) != 0 ? t0.y.f140573a.i() : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(684803697, i10, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:982)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fG, fL, fJ, fK, f16, fI, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return selectableChipElevation;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final f1 c(long j10, long j11, long j12, long j13, float f10, float f11, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1884534961);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.y.f140573a.z(), pVar, 6) : j10;
        long jS = (i11 & 2) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.y.f140573a.q(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jS2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j13;
        float fA = (i11 & 16) != 0 ? t0.y.f140573a.A() : f10;
        float fU = (i11 & 32) != 0 ? t0.y.f140573a.u() : f11;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1884534961, i10, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:901)");
        }
        f1 f1Var = new f1(jK, jS, jW, jS2, fA, fU, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f1Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g1 d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @dl.e androidx.compose.runtime.p pVar, int i10, int i11, int i12) {
        pVar.T(-1831479801);
        long jS = (i12 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jK = (i12 & 2) != 0 ? ColorSchemeKt.k(t0.y.f140573a.V(), pVar, 6) : j11;
        long jK2 = (i12 & 4) != 0 ? ColorSchemeKt.k(t0.y.f140573a.U(), pVar, 6) : j12;
        long jS2 = (i12 & 8) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j13;
        long jW = (i12 & 16) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.y.f140573a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jW2 = (i12 & 32) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.y.f140573a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long j22 = (i12 & 64) != 0 ? jW2 : j16;
        long jK3 = (i12 & 128) != 0 ? ColorSchemeKt.k(t0.y.f140573a.r(), pVar, 6) : j17;
        long jW3 = (i12 & 256) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.y.f140573a.p(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jK4 = (i12 & 512) != 0 ? ColorSchemeKt.k(t0.y.f140573a.L(), pVar, 6) : j19;
        long jK5 = (i12 & 1024) != 0 ? ColorSchemeKt.k(t0.y.f140573a.K(), pVar, 6) : j20;
        long j23 = (i12 & 2048) != 0 ? jK5 : j21;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1831479801, i10, i11, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:825)");
        }
        g1 g1Var = new g1(jS, jK, jK2, jK2, jS2, jW, jW2, j22, jK3, jW3, jK4, jK5, j23, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g1Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final SelectableChipElevation e(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-757972185);
        float fO = (i11 & 1) != 0 ? t0.y.f140573a.o() : f10;
        float fV = (i11 & 2) != 0 ? t0.y.f140573a.v() : f11;
        float fS = (i11 & 4) != 0 ? t0.y.f140573a.s() : f12;
        float fT = (i11 & 8) != 0 ? t0.y.f140573a.t() : f13;
        float f16 = (i11 & 16) != 0 ? t0.y.f140573a.f() : f14;
        float f17 = (i11 & 32) != 0 ? fO : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-757972185, i10, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:871)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fO, fV, fS, fT, f16, f17, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return selectableChipElevation;
    }

    public final float f() {
        return Height;
    }

    public final float g() {
        return IconSize;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 h(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1598643637);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1598643637, i10, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:999)");
        }
        g2 g2VarD = ShapesKt.d(t0.y.f140573a.b(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }
}

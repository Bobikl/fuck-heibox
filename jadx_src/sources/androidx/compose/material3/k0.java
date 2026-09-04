package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J\u0097\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012JQ\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010$\u001a\u00020#2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%R \u0010)\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R \u0010+\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b*\u0010(R \u0010.\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010(R\u0011\u00101\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b,\u00100\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/material3/k0;", "", "Landroidx/compose/ui/graphics/l0;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "Landroidx/compose/material3/g1;", "f", "(JJJJJJJJJJJJJLandroidx/compose/runtime/p;III)Landroidx/compose/material3/g1;", "Ls1/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/SelectableChipElevation;", "g", "(FFFFFFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/SelectableChipElevation;", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "Landroidx/compose/material3/f1;", "e", "(JJJJFFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/f1;", "b", "F", "()F", "Height", ak.aF, "IconSize", "d", ak.av, "AvatarSize", "Landroidx/compose/ui/graphics/g2;", "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final k0 f11999a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float AvatarSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12003e = 0;

    static {
        t0.a0 a0Var = t0.a0.f139431a;
        Height = a0Var.d();
        IconSize = a0Var.m();
        AvatarSize = a0Var.b();
    }

    private k0() {
    }

    public final float a() {
        return AvatarSize;
    }

    public final float b() {
        return Height;
    }

    public final float c() {
        return IconSize;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 d(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1052444143);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1052444143, i10, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1138)");
        }
        g2 g2VarD = ShapesKt.d(t0.a0.f139431a.e(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final f1 e(long j10, long j11, long j12, long j13, float f10, float f11, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-324924235);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.a0.f139431a.R(), pVar, 6) : j10;
        long jS = (i11 & 2) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a0.f139431a.j(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jS2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j13;
        float fS = (i11 & 16) != 0 ? t0.a0.f139431a.S() : f10;
        float fZ = (i11 & 32) != 0 ? t0.a0.f139431a.z() : f11;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-324924235, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1120)");
        }
        f1 f1Var = new f1(jK, jS, jW, jS2, fS, fZ, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f1Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g1 f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, @dl.e androidx.compose.runtime.p pVar, int i10, int i11, int i12) {
        pVar.T(1312840646);
        long jS = (i12 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jK = (i12 & 2) != 0 ? ColorSchemeKt.k(t0.a0.f139431a.P(), pVar, 6) : j11;
        long jK2 = (i12 & 4) != 0 ? ColorSchemeKt.k(t0.a0.f139431a.Q(), pVar, 6) : j12;
        long jK3 = (i12 & 8) != 0 ? ColorSchemeKt.k(t0.a0.f139431a.W(), pVar, 6) : j13;
        long jS2 = (i12 & 16) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j14;
        long jW = (i12 & 32) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a0.f139431a.f(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jW2 = (i12 & 64) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a0.f139431a.g(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jW3 = (i12 & 128) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a0.f139431a.i(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jK4 = (i12 & 256) != 0 ? ColorSchemeKt.k(t0.a0.f139431a.n(), pVar, 6) : j18;
        long jW4 = (i12 & 512) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a0.f139431a.h(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long jK5 = (i12 & 1024) != 0 ? ColorSchemeKt.k(t0.a0.f139431a.x(), pVar, 6) : j20;
        long jK6 = (i12 & 2048) != 0 ? ColorSchemeKt.k(t0.a0.f139431a.y(), pVar, 6) : j21;
        long jK7 = (i12 & 4096) != 0 ? ColorSchemeKt.k(t0.a0.f139431a.D(), pVar, 6) : j22;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1312840646, i10, i11, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1043)");
        }
        g1 g1Var = new g1(jS, jK, jK2, jK3, jS2, jW, jW2, jW3, jK4, jW4, jK5, jK6, jK7, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g1Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final SelectableChipElevation g(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1745270109);
        float fC = (i11 & 1) != 0 ? t0.a0.f139431a.c() : f10;
        float f16 = (i11 & 2) != 0 ? fC : f11;
        float f17 = (i11 & 4) != 0 ? fC : f12;
        float f18 = (i11 & 8) != 0 ? fC : f13;
        float fK = (i11 & 16) != 0 ? t0.a0.f139431a.k() : f14;
        float f19 = (i11 & 32) != 0 ? fC : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1745270109, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1091)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fC, f16, f17, f18, fK, f19, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return selectableChipElevation;
    }
}

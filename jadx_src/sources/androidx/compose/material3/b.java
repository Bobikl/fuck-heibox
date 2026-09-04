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
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+Je\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJe\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\rJQ\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017R \u0010#\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R \u0010%\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b$\u0010\"R\u0011\u0010)\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/material3/b;", "", "Landroidx/compose/ui/graphics/l0;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "Landroidx/compose/material3/m;", "b", "(JJJJJJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/m;", "Ls1/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/ChipElevation;", ak.aF, "(FFFFFFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/ChipElevation;", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/material3/l;", ak.av, "(JJFLandroidx/compose/runtime/p;II)Landroidx/compose/material3/l;", "d", "e", "F", "f", "()F", "Height", "g", "IconSize", "Landroidx/compose/ui/graphics/g2;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f11796a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11799d = 0;

    static {
        t0.a aVar = t0.a.f139405a;
        Height = aVar.a();
        IconSize = aVar.z();
    }

    private b() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final l a(long j10, long j11, float f10, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(382372847);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.a.f139405a.s(), pVar, 6) : j10;
        long jW = (i11 & 2) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a.f139405a.q(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        float fT = (i11 & 4) != 0 ? t0.a.f139405a.t() : f10;
        if (ComposerKt.g0()) {
            ComposerKt.w0(382372847, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:708)");
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
    public final m b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-391745725);
        long jS = (i11 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j10;
        long jK = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.a.f139405a.A(), pVar, 6) : j11;
        long jK2 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.a.f139405a.y(), pVar, 6) : j12;
        long j18 = (i11 & 8) != 0 ? jK2 : j13;
        long jS2 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j14;
        long jW = (i11 & 32) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a.f139405a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jW2 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a.f139405a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long j19 = (i11 & 128) != 0 ? jW2 : j17;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-391745725, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:648)");
        }
        m mVar = new m(jS, jK, jK2, j18, jS2, jW, jW2, j19, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return mVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final ChipElevation c(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(245366099);
        float fP = (i11 & 1) != 0 ? t0.a.f139405a.p() : f10;
        float f16 = (i11 & 2) != 0 ? fP : f11;
        float f17 = (i11 & 4) != 0 ? fP : f12;
        float f18 = (i11 & 8) != 0 ? fP : f13;
        float f19 = (i11 & 16) != 0 ? t0.a.f139405a.f() : f14;
        float f20 = (i11 & 32) != 0 ? fP : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(245366099, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:684)");
        }
        ChipElevation chipElevation = new ChipElevation(fP, f16, f17, f18, f19, f20, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return chipElevation;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-535762675);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.a.f139405a.i(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.a.f139405a.A(), pVar, 6) : j11;
        long jK3 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.a.f139405a.y(), pVar, 6) : j12;
        long j18 = (i11 & 8) != 0 ? jK3 : j13;
        long jW = (i11 & 16) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a.f139405a.k(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jW2 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a.f139405a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jW3 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.a.f139405a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long j19 = (i11 & 128) != 0 ? jW3 : j17;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-535762675, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:733)");
        }
        m mVar = new m(jK, jK2, jK3, j18, jW, jW2, jW3, j19, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return mVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final ChipElevation e(float f10, float f11, float f12, float f13, float f14, float f15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1457698077);
        float fJ = (i11 & 1) != 0 ? t0.a.f139405a.j() : f10;
        float fO = (i11 & 2) != 0 ? t0.a.f139405a.o() : f11;
        float fM = (i11 & 4) != 0 ? t0.a.f139405a.m() : f12;
        float fN = (i11 & 8) != 0 ? t0.a.f139405a.n() : f13;
        float f16 = (i11 & 16) != 0 ? t0.a.f139405a.f() : f14;
        float fL = (i11 & 32) != 0 ? t0.a.f139405a.l() : f15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1457698077, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:770)");
        }
        ChipElevation chipElevation = new ChipElevation(fJ, fO, fM, fN, f16, fL, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return chipElevation;
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
        pVar.T(1988153916);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1988153916, i10, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:787)");
        }
        g2 g2VarD = ShapesKt.d(t0.a.f139405a.b(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }
}

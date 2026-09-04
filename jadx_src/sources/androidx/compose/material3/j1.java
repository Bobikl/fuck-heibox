package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\\\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001d\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u001d\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u001d\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001d\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001d\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001d\u0010\u001f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u001d\u0010!\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material3/j1;", "", "", "enabled", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.av, "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "active", ak.aF, "(ZZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "b", "other", "equals", "", "hashCode", "J", "thumbColor", "activeTrackColor", "activeTickColor", "d", "inactiveTrackColor", "e", "inactiveTickColor", "f", "disabledThumbColor", "g", "disabledActiveTrackColor", RXScreenCaptureService.KEY_HEIGHT, "disabledActiveTickColor", "i", "disabledInactiveTrackColor", "j", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long thumbColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long activeTrackColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long activeTickColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long inactiveTrackColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long inactiveTickColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledThumbColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveTrackColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveTickColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long disabledInactiveTrackColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledInactiveTickColor;

    private j1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.thumbColor = j10;
        this.activeTrackColor = j11;
        this.activeTickColor = j12;
        this.inactiveTrackColor = j13;
        this.inactiveTickColor = j14;
        this.disabledThumbColor = j15;
        this.disabledActiveTrackColor = j16;
        this.disabledActiveTickColor = j17;
        this.disabledInactiveTrackColor = j18;
        this.disabledInactiveTickColor = j19;
    }

    public /* synthetic */ j1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1917959445);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1917959445, i10, -1, "androidx.compose.material3.SliderColors.thumbColor (Slider.kt:1307)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.thumbColor : this.disabledThumbColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> b(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        pVar.T(337026738);
        if (ComposerKt.g0()) {
            ComposerKt.w0(337026738, i10, -1, "androidx.compose.material3.SliderColors.tickColor (Slider.kt:1323)");
        }
        if (z10) {
            j10 = z11 ? this.activeTickColor : this.inactiveTickColor;
        } else {
            j10 = z11 ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j10), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> c(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        pVar.T(760609284);
        if (ComposerKt.g0()) {
            ComposerKt.w0(760609284, i10, -1, "androidx.compose.material3.SliderColors.trackColor (Slider.kt:1312)");
        }
        if (z10) {
            j10 = z11 ? this.activeTrackColor : this.inactiveTrackColor;
        } else {
            j10 = z11 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j10), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) other;
        return androidx.compose.ui.graphics.l0.y(this.thumbColor, j1Var.thumbColor) && androidx.compose.ui.graphics.l0.y(this.activeTrackColor, j1Var.activeTrackColor) && androidx.compose.ui.graphics.l0.y(this.activeTickColor, j1Var.activeTickColor) && androidx.compose.ui.graphics.l0.y(this.inactiveTrackColor, j1Var.inactiveTrackColor) && androidx.compose.ui.graphics.l0.y(this.inactiveTickColor, j1Var.inactiveTickColor) && androidx.compose.ui.graphics.l0.y(this.disabledThumbColor, j1Var.disabledThumbColor) && androidx.compose.ui.graphics.l0.y(this.disabledActiveTrackColor, j1Var.disabledActiveTrackColor) && androidx.compose.ui.graphics.l0.y(this.disabledActiveTickColor, j1Var.disabledActiveTickColor) && androidx.compose.ui.graphics.l0.y(this.disabledInactiveTrackColor, j1Var.disabledInactiveTrackColor) && androidx.compose.ui.graphics.l0.y(this.disabledInactiveTickColor, j1Var.disabledInactiveTickColor);
    }

    public int hashCode() {
        return (((((((((((((((((androidx.compose.ui.graphics.l0.K(this.thumbColor) * 31) + androidx.compose.ui.graphics.l0.K(this.activeTrackColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.activeTickColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.inactiveTrackColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.inactiveTickColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledThumbColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledActiveTrackColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledActiveTickColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledInactiveTrackColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledInactiveTickColor);
    }
}

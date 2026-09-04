package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u008c\u0001\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b-\u0010.J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u001d\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u001d\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001d\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u001d\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u001d\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u001d\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u001d\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u001d\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u001d\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u001d\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u001d\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010\u0010R\u001d\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010\u0010R\u001d\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b)\u0010\u0010R\u001d\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/material3/t1;", "", "", "enabled", "checked", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.aF, "(ZZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "d", ak.av, "b", "other", "equals", "", "hashCode", "J", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "e", "uncheckedThumbColor", "f", "uncheckedTrackColor", "g", "uncheckedBorderColor", RXScreenCaptureService.KEY_HEIGHT, "uncheckedIconColor", "i", "disabledCheckedThumbColor", "j", "disabledCheckedTrackColor", "k", "disabledCheckedBorderColor", "l", "disabledCheckedIconColor", "m", "disabledUncheckedThumbColor", "n", "disabledUncheckedTrackColor", "o", "disabledUncheckedBorderColor", "p", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long checkedThumbColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long checkedTrackColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long checkedBorderColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long checkedIconColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedThumbColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedTrackColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBorderColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedThumbColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedTrackColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedBorderColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedThumbColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedTrackColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedBorderColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedIconColor;

    private t1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25) {
        this.checkedThumbColor = j10;
        this.checkedTrackColor = j11;
        this.checkedBorderColor = j12;
        this.checkedIconColor = j13;
        this.uncheckedThumbColor = j14;
        this.uncheckedTrackColor = j15;
        this.uncheckedBorderColor = j16;
        this.uncheckedIconColor = j17;
        this.disabledCheckedThumbColor = j18;
        this.disabledCheckedTrackColor = j19;
        this.disabledCheckedBorderColor = j20;
        this.disabledCheckedIconColor = j21;
        this.disabledUncheckedThumbColor = j22;
        this.disabledUncheckedTrackColor = j23;
        this.disabledUncheckedBorderColor = j24;
        this.disabledUncheckedIconColor = j25;
    }

    public /* synthetic */ t1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        pVar.T(462653665);
        if (ComposerKt.g0()) {
            ComposerKt.w0(462653665, i10, -1, "androidx.compose.material3.SwitchColors.borderColor (Switch.kt:402)");
        }
        if (z10) {
            j10 = z11 ? this.checkedBorderColor : this.uncheckedBorderColor;
        } else {
            j10 = z11 ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
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
    public final m2<androidx.compose.ui.graphics.l0> b(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        pVar.T(-153383122);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-153383122, i10, -1, "androidx.compose.material3.SwitchColors.iconColor (Switch.kt:419)");
        }
        if (z10) {
            j10 = z11 ? this.checkedIconColor : this.uncheckedIconColor;
        } else {
            j10 = z11 ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
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
        pVar.T(-1539933265);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1539933265, i10, -1, "androidx.compose.material3.SwitchColors.thumbColor (Switch.kt:368)");
        }
        if (z10) {
            j10 = z11 ? this.checkedThumbColor : this.uncheckedThumbColor;
        } else {
            j10 = z11 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
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
    public final m2<androidx.compose.ui.graphics.l0> d(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        pVar.T(961511844);
        if (ComposerKt.g0()) {
            ComposerKt.w0(961511844, i10, -1, "androidx.compose.material3.SwitchColors.trackColor (Switch.kt:385)");
        }
        if (z10) {
            j10 = z11 ? this.checkedTrackColor : this.uncheckedTrackColor;
        } else {
            j10 = z11 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
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
        if (other == null || !(other instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) other;
        return androidx.compose.ui.graphics.l0.y(this.checkedThumbColor, t1Var.checkedThumbColor) && androidx.compose.ui.graphics.l0.y(this.checkedTrackColor, t1Var.checkedTrackColor) && androidx.compose.ui.graphics.l0.y(this.checkedBorderColor, t1Var.checkedBorderColor) && androidx.compose.ui.graphics.l0.y(this.checkedIconColor, t1Var.checkedIconColor) && androidx.compose.ui.graphics.l0.y(this.uncheckedThumbColor, t1Var.uncheckedThumbColor) && androidx.compose.ui.graphics.l0.y(this.uncheckedTrackColor, t1Var.uncheckedTrackColor) && androidx.compose.ui.graphics.l0.y(this.uncheckedBorderColor, t1Var.uncheckedBorderColor) && androidx.compose.ui.graphics.l0.y(this.uncheckedIconColor, t1Var.uncheckedIconColor) && androidx.compose.ui.graphics.l0.y(this.disabledCheckedThumbColor, t1Var.disabledCheckedThumbColor) && androidx.compose.ui.graphics.l0.y(this.disabledCheckedTrackColor, t1Var.disabledCheckedTrackColor) && androidx.compose.ui.graphics.l0.y(this.disabledCheckedBorderColor, t1Var.disabledCheckedBorderColor) && androidx.compose.ui.graphics.l0.y(this.disabledCheckedIconColor, t1Var.disabledCheckedIconColor) && androidx.compose.ui.graphics.l0.y(this.disabledUncheckedThumbColor, t1Var.disabledUncheckedThumbColor) && androidx.compose.ui.graphics.l0.y(this.disabledUncheckedTrackColor, t1Var.disabledUncheckedTrackColor) && androidx.compose.ui.graphics.l0.y(this.disabledUncheckedBorderColor, t1Var.disabledUncheckedBorderColor) && androidx.compose.ui.graphics.l0.y(this.disabledUncheckedIconColor, t1Var.disabledUncheckedIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((androidx.compose.ui.graphics.l0.K(this.checkedThumbColor) * 31) + androidx.compose.ui.graphics.l0.K(this.checkedTrackColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.checkedBorderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.checkedIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.uncheckedThumbColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.uncheckedTrackColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.uncheckedBorderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.uncheckedIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledCheckedThumbColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledCheckedTrackColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledCheckedBorderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledCheckedIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledUncheckedThumbColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledUncheckedTrackColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledUncheckedBorderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledUncheckedIconColor);
    }
}

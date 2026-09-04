package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001Bt\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b'\u0010(J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001d\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001d\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u001d\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u001d\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u001d\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u001d\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u001d\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u001d\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u001d\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u001d\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u001d\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/material3/g1;", "", "", "enabled", "selected", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.av, "(ZZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "b", ak.aF, "d", "other", "equals", "", "hashCode", "J", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "e", "disabledContainerColor", "f", "disabledLabelColor", "g", "disabledLeadingIconColor", RXScreenCaptureService.KEY_HEIGHT, "disabledTrailingIconColor", "i", "selectedContainerColor", "j", "disabledSelectedContainerColor", "k", "selectedLabelColor", "l", "selectedLeadingIconColor", "m", "selectedTrailingIconColor", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long labelColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long selectedContainerColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedContainerColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long selectedLabelColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long selectedLeadingIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long selectedTrailingIconColor;

    private g1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        this.containerColor = j10;
        this.labelColor = j11;
        this.leadingIconColor = j12;
        this.trailingIconColor = j13;
        this.disabledContainerColor = j14;
        this.disabledLabelColor = j15;
        this.disabledLeadingIconColor = j16;
        this.disabledTrailingIconColor = j17;
        this.selectedContainerColor = j18;
        this.disabledSelectedContainerColor = j19;
        this.selectedLabelColor = j20;
        this.selectedLeadingIconColor = j21;
        this.selectedTrailingIconColor = j22;
    }

    public /* synthetic */ g1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        pVar.T(-2126903408);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2126903408, i10, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:1884)");
        }
        if (z10) {
            j10 = !z11 ? this.containerColor : this.selectedContainerColor;
        } else {
            j10 = z11 ? this.disabledSelectedContainerColor : this.disabledContainerColor;
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
        pVar.T(-829231549);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-829231549, i10, -1, "androidx.compose.material3.SelectableChipColors.labelColor (Chip.kt:1900)");
        }
        if (z10) {
            j10 = !z11 ? this.labelColor : this.selectedLabelColor;
        } else {
            j10 = this.disabledLabelColor;
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
        pVar.T(-1112029563);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1112029563, i10, -1, "androidx.compose.material3.SelectableChipColors.leadingIconContentColor (Chip.kt:1916)");
        }
        if (z10) {
            j10 = !z11 ? this.leadingIconColor : this.selectedLeadingIconColor;
        } else {
            j10 = this.disabledLeadingIconColor;
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
        pVar.T(963620819);
        if (ComposerKt.g0()) {
            ComposerKt.w0(963620819, i10, -1, "androidx.compose.material3.SelectableChipColors.trailingIconContentColor (Chip.kt:1932)");
        }
        if (z10) {
            j10 = !z11 ? this.trailingIconColor : this.selectedTrailingIconColor;
        } else {
            j10 = this.disabledTrailingIconColor;
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
        if (other == null || !(other instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) other;
        return androidx.compose.ui.graphics.l0.y(this.containerColor, g1Var.containerColor) && androidx.compose.ui.graphics.l0.y(this.labelColor, g1Var.labelColor) && androidx.compose.ui.graphics.l0.y(this.leadingIconColor, g1Var.leadingIconColor) && androidx.compose.ui.graphics.l0.y(this.trailingIconColor, g1Var.trailingIconColor) && androidx.compose.ui.graphics.l0.y(this.disabledContainerColor, g1Var.disabledContainerColor) && androidx.compose.ui.graphics.l0.y(this.disabledLabelColor, g1Var.disabledLabelColor) && androidx.compose.ui.graphics.l0.y(this.disabledLeadingIconColor, g1Var.disabledLeadingIconColor) && androidx.compose.ui.graphics.l0.y(this.disabledTrailingIconColor, g1Var.disabledTrailingIconColor) && androidx.compose.ui.graphics.l0.y(this.selectedContainerColor, g1Var.selectedContainerColor) && androidx.compose.ui.graphics.l0.y(this.disabledSelectedContainerColor, g1Var.disabledSelectedContainerColor) && androidx.compose.ui.graphics.l0.y(this.selectedLabelColor, g1Var.selectedLabelColor) && androidx.compose.ui.graphics.l0.y(this.selectedLeadingIconColor, g1Var.selectedLeadingIconColor) && androidx.compose.ui.graphics.l0.y(this.selectedTrailingIconColor, g1Var.selectedTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((androidx.compose.ui.graphics.l0.K(this.containerColor) * 31) + androidx.compose.ui.graphics.l0.K(this.labelColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.leadingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.trailingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledLabelColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledLeadingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledTrailingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledSelectedContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedLabelColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedLeadingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedTrailingIconColor);
    }
}

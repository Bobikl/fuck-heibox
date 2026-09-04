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
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BL\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001d\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001d\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001d\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u001d\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u001d\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/m;", "", "", "enabled", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.av, "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "b", ak.aF, "d", "other", "equals", "", "hashCode", "J", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "e", "disabledContainerColor", "f", "disabledLabelColor", "g", "disabledLeadingIconContentColor", RXScreenCaptureService.KEY_HEIGHT, "disabledTrailingIconContentColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long labelColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconContentColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconContentColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconContentColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconContentColor;

    private m(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.containerColor = j10;
        this.labelColor = j11;
        this.leadingIconContentColor = j12;
        this.trailingIconContentColor = j13;
        this.disabledContainerColor = j14;
        this.disabledLabelColor = j15;
        this.disabledLeadingIconContentColor = j16;
        this.disabledTrailingIconContentColor = j17;
    }

    public /* synthetic */ m(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-136683658);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-136683658, i10, -1, "androidx.compose.material3.ChipColors.containerColor (Chip.kt:1785)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.containerColor : this.disabledContainerColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> b(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(559848681);
        if (ComposerKt.g0()) {
            ComposerKt.w0(559848681, i10, -1, "androidx.compose.material3.ChipColors.labelColor (Chip.kt:1795)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.labelColor : this.disabledLabelColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> c(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(5136811);
        if (ComposerKt.g0()) {
            ComposerKt.w0(5136811, i10, -1, "androidx.compose.material3.ChipColors.leadingIconContentColor (Chip.kt:1805)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.leadingIconContentColor : this.disabledLeadingIconContentColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> d(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(96182905);
        if (ComposerKt.g0()) {
            ComposerKt.w0(96182905, i10, -1, "androidx.compose.material3.ChipColors.trailingIconContentColor (Chip.kt:1817)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.trailingIconContentColor : this.disabledTrailingIconContentColor), pVar, 0);
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
        if (other == null || !(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return androidx.compose.ui.graphics.l0.y(this.containerColor, mVar.containerColor) && androidx.compose.ui.graphics.l0.y(this.labelColor, mVar.labelColor) && androidx.compose.ui.graphics.l0.y(this.leadingIconContentColor, mVar.leadingIconContentColor) && androidx.compose.ui.graphics.l0.y(this.trailingIconContentColor, mVar.trailingIconContentColor) && androidx.compose.ui.graphics.l0.y(this.disabledContainerColor, mVar.disabledContainerColor) && androidx.compose.ui.graphics.l0.y(this.disabledLabelColor, mVar.disabledLabelColor) && androidx.compose.ui.graphics.l0.y(this.disabledLeadingIconContentColor, mVar.disabledLeadingIconContentColor) && androidx.compose.ui.graphics.l0.y(this.disabledTrailingIconContentColor, mVar.disabledTrailingIconContentColor);
    }

    public int hashCode() {
        return (((((((((((((androidx.compose.ui.graphics.l0.K(this.containerColor) * 31) + androidx.compose.ui.graphics.l0.K(this.labelColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.leadingIconContentColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.trailingIconContentColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledLabelColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledLeadingIconContentColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledTrailingIconContentColor);
    }
}

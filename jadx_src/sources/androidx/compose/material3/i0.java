package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001d\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u001d\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u001d\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u001d\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/i0;", "", "", "enabled", "checked", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.av, "(ZZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "b", "other", "equals", "", "hashCode", "J", "containerColor", "contentColor", ak.aF, "disabledContainerColor", "d", "disabledContentColor", "e", "checkedContainerColor", "f", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long checkedContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long checkedContentColor;

    private i0(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.containerColor = j10;
        this.contentColor = j11;
        this.disabledContainerColor = j12;
        this.disabledContentColor = j13;
        this.checkedContainerColor = j14;
        this.checkedContentColor = j15;
    }

    public /* synthetic */ i0(long j10, long j11, long j12, long j13, long j14, long j15, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        pVar.T(1175394478);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1175394478, i10, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:886)");
        }
        if (z10) {
            j10 = !z11 ? this.containerColor : this.checkedContainerColor;
        } else {
            j10 = this.disabledContainerColor;
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
        pVar.T(1340854054);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1340854054, i10, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:902)");
        }
        if (z10) {
            j10 = !z11 ? this.contentColor : this.checkedContentColor;
        } else {
            j10 = this.disabledContentColor;
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
        if (other == null || !(other instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) other;
        return androidx.compose.ui.graphics.l0.y(this.containerColor, i0Var.containerColor) && androidx.compose.ui.graphics.l0.y(this.contentColor, i0Var.contentColor) && androidx.compose.ui.graphics.l0.y(this.disabledContainerColor, i0Var.disabledContainerColor) && androidx.compose.ui.graphics.l0.y(this.disabledContentColor, i0Var.disabledContentColor) && androidx.compose.ui.graphics.l0.y(this.checkedContainerColor, i0Var.checkedContainerColor) && androidx.compose.ui.graphics.l0.y(this.checkedContentColor, i0Var.checkedContentColor);
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.graphics.l0.K(this.containerColor) * 31) + androidx.compose.ui.graphics.l0.K(this.contentColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledContentColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.checkedContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.checkedContentColor);
    }
}

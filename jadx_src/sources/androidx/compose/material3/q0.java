package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001d\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/q0;", "", "", "enabled", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", "b", "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", ak.av, ak.aF, "other", "equals", "", "hashCode", "J", "textColor", "leadingIconColor", "trailingIconColor", "d", "disabledTextColor", "e", "disabledLeadingIconColor", "f", "disabledTrailingIconColor", "<init>", "(JJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long textColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    private q0(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.textColor = j10;
        this.leadingIconColor = j11;
        this.trailingIconColor = j12;
        this.disabledTextColor = j13;
        this.disabledLeadingIconColor = j14;
        this.disabledTrailingIconColor = j15;
    }

    public /* synthetic */ q0(long j10, long j11, long j12, long j13, long j14, long j15, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1521013607);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1521013607, i10, -1, "androidx.compose.material3.MenuItemColors.leadingIconColor (Menu.kt:393)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.leadingIconColor : this.disabledLeadingIconColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> b(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1023108655);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1023108655, i10, -1, "androidx.compose.material3.MenuItemColors.textColor (Menu.kt:383)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.textColor : this.disabledTextColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> c(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1024062809);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1024062809, i10, -1, "androidx.compose.material3.MenuItemColors.trailingIconColor (Menu.kt:403)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.trailingIconColor : this.disabledTrailingIconColor), pVar, 0);
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
        if (other == null || !(other instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) other;
        return androidx.compose.ui.graphics.l0.y(this.textColor, q0Var.textColor) && androidx.compose.ui.graphics.l0.y(this.leadingIconColor, q0Var.leadingIconColor) && androidx.compose.ui.graphics.l0.y(this.trailingIconColor, q0Var.trailingIconColor) && androidx.compose.ui.graphics.l0.y(this.disabledTextColor, q0Var.disabledTextColor) && androidx.compose.ui.graphics.l0.y(this.disabledLeadingIconColor, q0Var.disabledLeadingIconColor) && androidx.compose.ui.graphics.l0.y(this.disabledTrailingIconColor, q0Var.disabledTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.graphics.l0.K(this.textColor) * 31) + androidx.compose.ui.graphics.l0.K(this.leadingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.trailingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledTextColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledLeadingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledTrailingIconColor);
    }
}

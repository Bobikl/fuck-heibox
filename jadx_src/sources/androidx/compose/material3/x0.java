package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001d\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0017\u001a\u00020\u00058AX\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/x0;", "", "", "selected", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", "b", "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", ak.aF, "other", "equals", "", "hashCode", ak.av, "J", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "d", "unselectedIconColor", "e", "unselectedTextColor", "(Landroidx/compose/runtime/p;I)J", "indicatorColor", "<init>", "(JJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectedIconColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long selectedTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long selectedIndicatorColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long unselectedIconColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long unselectedTextColor;

    private x0(long j10, long j11, long j12, long j13, long j14) {
        this.selectedIconColor = j10;
        this.selectedTextColor = j11;
        this.selectedIndicatorColor = j12;
        this.unselectedIconColor = j13;
        this.unselectedTextColor = j14;
    }

    public /* synthetic */ x0(long j10, long j11, long j12, long j13, long j14, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14);
    }

    @xh.h(name = "getIndicatorColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(618271448);
        if (ComposerKt.g0()) {
            ComposerKt.w0(618271448, i10, -1, "androidx.compose.material3.NavigationRailItemColors.<get-indicatorColor> (NavigationRail.kt:341)");
        }
        long j10 = this.selectedIndicatorColor;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return j10;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> b(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(665215869);
        if (ComposerKt.g0()) {
            ComposerKt.w0(665215869, i10, -1, "androidx.compose.material3.NavigationRailItemColors.iconColor (NavigationRail.kt:318)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarB = androidx.compose.animation.q.b(z10 ? this.selectedIconColor : this.unselectedIconColor, androidx.compose.animation.core.i.q(150, 0, null, 6, null), null, pVar, 48, 4);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarB;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> c(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(253888561);
        if (ComposerKt.g0()) {
            ComposerKt.w0(253888561, i10, -1, "androidx.compose.material3.NavigationRailItemColors.textColor (NavigationRail.kt:331)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarB = androidx.compose.animation.q.b(z10 ? this.selectedTextColor : this.unselectedTextColor, androidx.compose.animation.core.i.q(150, 0, null, 6, null), null, pVar, 48, 4);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarB;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) other;
        return androidx.compose.ui.graphics.l0.y(this.selectedIconColor, x0Var.selectedIconColor) && androidx.compose.ui.graphics.l0.y(this.unselectedIconColor, x0Var.unselectedIconColor) && androidx.compose.ui.graphics.l0.y(this.selectedTextColor, x0Var.selectedTextColor) && androidx.compose.ui.graphics.l0.y(this.unselectedTextColor, x0Var.unselectedTextColor) && androidx.compose.ui.graphics.l0.y(this.selectedIndicatorColor, x0Var.selectedIndicatorColor);
    }

    public int hashCode() {
        return (((((((androidx.compose.ui.graphics.l0.K(this.selectedIconColor) * 31) + androidx.compose.ui.graphics.l0.K(this.unselectedIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedTextColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.unselectedTextColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedIndicatorColor);
    }
}

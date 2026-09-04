package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R \u0010\u0013\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R \u0010\u0017\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R \u0010\u0019\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R \u0010\u001c\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R \u0010\u001e\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R \u0010\u001f\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R \u0010!\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b \u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material3/p;", "Landroidx/compose/material3/u0;", "", "selected", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.aF, "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "d", ak.av, "b", "", "other", "equals", "", "hashCode", "J", "g", "()J", "selectedIconColor", "k", "unselectedIconColor", RXScreenCaptureService.KEY_HEIGHT, "selectedTextColor", "l", "unselectedTextColor", "e", "f", "selectedContainerColor", "j", "unselectedContainerColor", "selectedBadgeColor", "i", "unselectedBadgeColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class p implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectedIconColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long unselectedIconColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long selectedTextColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long unselectedTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long selectedContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long unselectedContainerColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long selectedBadgeColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long unselectedBadgeColor;

    private p(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.selectedIconColor = j10;
        this.unselectedIconColor = j11;
        this.selectedTextColor = j12;
        this.unselectedTextColor = j13;
        this.selectedContainerColor = j14;
        this.unselectedContainerColor = j15;
        this.selectedBadgeColor = j16;
        this.unselectedBadgeColor = j17;
    }

    public /* synthetic */ p(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    @Override // androidx.compose.material3.u0
    @dl.d
    @androidx.compose.runtime.h
    public m2<androidx.compose.ui.graphics.l0> a(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-433512770);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-433512770, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:808)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.selectedContainerColor : this.unselectedContainerColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @Override // androidx.compose.material3.u0
    @dl.d
    @androidx.compose.runtime.h
    public m2<androidx.compose.ui.graphics.l0> b(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-561675044);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-561675044, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:815)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.selectedBadgeColor : this.unselectedBadgeColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @Override // androidx.compose.material3.u0
    @dl.d
    @androidx.compose.runtime.h
    public m2<androidx.compose.ui.graphics.l0> c(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1141354218);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1141354218, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:798)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.selectedIconColor : this.unselectedIconColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @Override // androidx.compose.material3.u0
    @dl.d
    @androidx.compose.runtime.h
    public m2<androidx.compose.ui.graphics.l0> d(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1275109558);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1275109558, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:803)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.selectedTextColor : this.unselectedTextColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSelectedBadgeColor() {
        return this.selectedBadgeColor;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return androidx.compose.ui.graphics.l0.y(this.selectedIconColor, pVar.selectedIconColor) && androidx.compose.ui.graphics.l0.y(this.unselectedIconColor, pVar.unselectedIconColor) && androidx.compose.ui.graphics.l0.y(this.selectedTextColor, pVar.selectedTextColor) && androidx.compose.ui.graphics.l0.y(this.unselectedTextColor, pVar.unselectedTextColor) && androidx.compose.ui.graphics.l0.y(this.selectedContainerColor, pVar.selectedContainerColor) && androidx.compose.ui.graphics.l0.y(this.unselectedContainerColor, pVar.unselectedContainerColor) && androidx.compose.ui.graphics.l0.y(this.selectedBadgeColor, pVar.selectedBadgeColor) && androidx.compose.ui.graphics.l0.y(this.unselectedBadgeColor, pVar.unselectedBadgeColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getSelectedContainerColor() {
        return this.selectedContainerColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSelectedIconColor() {
        return this.selectedIconColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getSelectedTextColor() {
        return this.selectedTextColor;
    }

    public int hashCode() {
        return (((((((((((((androidx.compose.ui.graphics.l0.K(this.selectedIconColor) * 31) + androidx.compose.ui.graphics.l0.K(this.unselectedIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedTextColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.unselectedTextColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.unselectedContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedBadgeColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.unselectedBadgeColor);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getUnselectedBadgeColor() {
        return this.unselectedBadgeColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getUnselectedContainerColor() {
        return this.unselectedContainerColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getUnselectedIconColor() {
        return this.unselectedIconColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getUnselectedTextColor() {
        return this.unselectedTextColor;
    }
}

package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@j2
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001d\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001d\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\fR#\u0010\u0012\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\u0011R#\u0010\u0016\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u000e\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/c2;", "", "", "colorTransitionFraction", "Landroidx/compose/ui/graphics/l0;", ak.av, "(FLandroidx/compose/runtime/p;I)J", "other", "", "equals", "", "hashCode", "J", "containerColor", "b", "scrolledContainerColor", ak.aF, "()J", "navigationIconContentColor", "d", "titleContentColor", "e", "actionIconContentColor", "<init>", "(JJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long scrolledContainerColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long navigationIconContentColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long titleContentColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long actionIconContentColor;

    private c2(long j10, long j11, long j12, long j13, long j14) {
        this.containerColor = j10;
        this.scrolledContainerColor = j11;
        this.navigationIconContentColor = j12;
        this.titleContentColor = j13;
        this.actionIconContentColor = j14;
    }

    public /* synthetic */ c2(long j10, long j11, long j12, long j13, long j14, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14);
    }

    @androidx.compose.runtime.h
    public final long a(float f10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1456204135);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1456204135, i10, -1, "androidx.compose.material3.TopAppBarColors.containerColor (AppBar.kt:896)");
        }
        long jO = androidx.compose.ui.graphics.n0.o(this.containerColor, this.scrolledContainerColor, androidx.compose.animation.core.d0.a().a(f10));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jO;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) other;
        return androidx.compose.ui.graphics.l0.y(this.containerColor, c2Var.containerColor) && androidx.compose.ui.graphics.l0.y(this.scrolledContainerColor, c2Var.scrolledContainerColor) && androidx.compose.ui.graphics.l0.y(this.navigationIconContentColor, c2Var.navigationIconContentColor) && androidx.compose.ui.graphics.l0.y(this.titleContentColor, c2Var.titleContentColor) && androidx.compose.ui.graphics.l0.y(this.actionIconContentColor, c2Var.actionIconContentColor);
    }

    public int hashCode() {
        return (((((((androidx.compose.ui.graphics.l0.K(this.containerColor) * 31) + androidx.compose.ui.graphics.l0.K(this.scrolledContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.navigationIconContentColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.titleContentColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.actionIconContentColor);
    }
}

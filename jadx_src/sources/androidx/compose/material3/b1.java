package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B,\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001d\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u001d\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001d\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001d\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/b1;", "", "", "enabled", "selected", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.av, "(ZZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "other", "equals", "", "hashCode", "J", "selectedColor", "b", "unselectedColor", ak.aF, "disabledSelectedColor", "d", "disabledUnselectedColor", "<init>", "(JJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectedColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long unselectedColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledUnselectedColor;

    private b1(long j10, long j11, long j12, long j13) {
        this.selectedColor = j10;
        this.unselectedColor = j11;
        this.disabledSelectedColor = j12;
        this.disabledUnselectedColor = j13;
    }

    public /* synthetic */ b1(long j10, long j11, long j12, long j13, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        m2<androidx.compose.ui.graphics.l0> m2VarT;
        pVar.T(-1840145292);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1840145292, i10, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:182)");
        }
        if (z10 && z11) {
            j10 = this.selectedColor;
        } else if (!z10 || z11) {
            j10 = (z10 || !z11) ? this.disabledUnselectedColor : this.disabledSelectedColor;
        } else {
            j10 = this.unselectedColor;
        }
        long j11 = j10;
        if (z10) {
            pVar.T(-1943770140);
            m2VarT = androidx.compose.animation.q.b(j11, androidx.compose.animation.core.i.q(100, 0, null, 6, null), null, pVar, 48, 4);
            pVar.c0();
        } else {
            pVar.T(-1943770035);
            m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j11), pVar, 0);
            pVar.c0();
        }
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
        if (other == null || !(other instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) other;
        return androidx.compose.ui.graphics.l0.y(this.selectedColor, b1Var.selectedColor) && androidx.compose.ui.graphics.l0.y(this.unselectedColor, b1Var.unselectedColor) && androidx.compose.ui.graphics.l0.y(this.disabledSelectedColor, b1Var.disabledSelectedColor) && androidx.compose.ui.graphics.l0.y(this.disabledUnselectedColor, b1Var.disabledUnselectedColor);
    }

    public int hashCode() {
        return (((((androidx.compose.ui.graphics.l0.K(this.selectedColor) * 31) + androidx.compose.ui.graphics.l0.K(this.unselectedColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledSelectedColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledUnselectedColor);
    }
}

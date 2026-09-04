package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001d\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/f1;", "", "", "enabled", "selected", "Landroidx/compose/runtime/m2;", "Landroidx/compose/foundation/g;", ak.av, "(ZZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "other", "equals", "", "hashCode", "Landroidx/compose/ui/graphics/l0;", "J", "borderColor", "b", "selectedBorderColor", ak.aF, "disabledBorderColor", "d", "disabledSelectedBorderColor", "Ls1/h;", "e", "F", "borderWidth", "f", "selectedBorderWidth", "<init>", "(JJJJFFLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long borderColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long selectedBorderColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledBorderColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedBorderColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float borderWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float selectedBorderWidth;

    private f1(long j10, long j11, long j12, long j13, float f10, float f11) {
        this.borderColor = j10;
        this.selectedBorderColor = j11;
        this.disabledBorderColor = j12;
        this.disabledSelectedBorderColor = j13;
        this.borderWidth = f10;
        this.selectedBorderWidth = f11;
    }

    public /* synthetic */ f1(long j10, long j11, long j12, long j13, float f10, float f11, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, f10, f11);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<BorderStroke> a(boolean z10, boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        pVar.T(670222826);
        if (ComposerKt.g0()) {
            ComposerKt.w0(670222826, i10, -1, "androidx.compose.material3.SelectableChipBorder.borderStroke (Chip.kt:2002)");
        }
        if (z10) {
            j10 = z11 ? this.selectedBorderColor : this.borderColor;
        } else {
            j10 = z11 ? this.disabledSelectedBorderColor : this.disabledBorderColor;
        }
        m2<BorderStroke> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.foundation.h.a(z11 ? this.selectedBorderWidth : this.borderWidth, j10), pVar, 0);
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
        if (other == null || !(other instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) other;
        return androidx.compose.ui.graphics.l0.y(this.borderColor, f1Var.borderColor) && androidx.compose.ui.graphics.l0.y(this.selectedBorderColor, f1Var.selectedBorderColor) && androidx.compose.ui.graphics.l0.y(this.disabledBorderColor, f1Var.disabledBorderColor) && androidx.compose.ui.graphics.l0.y(this.disabledSelectedBorderColor, f1Var.disabledSelectedBorderColor) && s1.h.l(this.borderWidth, f1Var.borderWidth) && s1.h.l(this.selectedBorderWidth, f1Var.selectedBorderWidth);
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.graphics.l0.K(this.borderColor) * 31) + androidx.compose.ui.graphics.l0.K(this.selectedBorderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledBorderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledSelectedBorderColor)) * 31) + s1.h.n(this.borderWidth)) * 31) + s1.h.n(this.selectedBorderWidth);
    }
}

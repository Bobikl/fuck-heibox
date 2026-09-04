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
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B$\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001d\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001d\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001d\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/l;", "", "", "enabled", "Landroidx/compose/runtime/m2;", "Landroidx/compose/foundation/g;", ak.av, "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "other", "equals", "", "hashCode", "Landroidx/compose/ui/graphics/l0;", "J", "borderColor", "b", "disabledBorderColor", "Ls1/h;", ak.aF, "F", "borderWidth", "<init>", "(JJFLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long borderColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long disabledBorderColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float borderWidth;

    private l(long j10, long j11, float f10) {
        this.borderColor = j10;
        this.disabledBorderColor = j11;
        this.borderWidth = f10;
    }

    public /* synthetic */ l(long j10, long j11, float f10, kotlin.jvm.internal.u uVar) {
        this(j10, j11, f10);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<BorderStroke> a(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1899621712);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1899621712, i10, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2055)");
        }
        m2<BorderStroke> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.foundation.h.a(this.borderWidth, z10 ? this.borderColor : this.disabledBorderColor), pVar, 0);
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
        if (other == null || !(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return androidx.compose.ui.graphics.l0.y(this.borderColor, lVar.borderColor) && androidx.compose.ui.graphics.l0.y(this.disabledBorderColor, lVar.disabledBorderColor) && s1.h.l(this.borderWidth, lVar.borderWidth);
    }

    public int hashCode() {
        return (((androidx.compose.ui.graphics.l0.K(this.borderColor) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledBorderColor)) * 31) + s1.h.n(this.borderWidth);
    }
}

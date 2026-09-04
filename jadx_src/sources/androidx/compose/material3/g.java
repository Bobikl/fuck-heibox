package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B,\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001d\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001d\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\b\u0010\rR\u001d\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001d\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/g;", "", "", "enabled", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.av, "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "b", "other", "equals", "", "hashCode", "J", "containerColor", "contentColor", ak.aF, "disabledContainerColor", "d", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    private g(long j10, long j11, long j12, long j13) {
        this.containerColor = j10;
        this.contentColor = j11;
        this.disabledContainerColor = j12;
        this.disabledContentColor = j13;
    }

    public /* synthetic */ g(long j10, long j11, long j12, long j13, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-2116091914);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2116091914, i10, -1, "androidx.compose.material3.CardColors.containerColor (Card.kt:737)");
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
        pVar.T(1779883118);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1779883118, i10, -1, "androidx.compose.material3.CardColors.contentColor (Card.kt:747)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.contentColor : this.disabledContentColor), pVar, 0);
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
        if (other == null || !(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return androidx.compose.ui.graphics.l0.y(this.containerColor, gVar.containerColor) && androidx.compose.ui.graphics.l0.y(this.contentColor, gVar.contentColor) && androidx.compose.ui.graphics.l0.y(this.disabledContainerColor, gVar.disabledContainerColor) && androidx.compose.ui.graphics.l0.y(this.disabledContentColor, gVar.disabledContentColor);
    }

    public int hashCode() {
        return (((((androidx.compose.ui.graphics.l0.K(this.containerColor) * 31) + androidx.compose.ui.graphics.l0.K(this.contentColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledContainerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledContentColor);
    }
}

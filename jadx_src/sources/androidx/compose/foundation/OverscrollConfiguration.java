package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.e0, reason: from toString */
/* JADX INFO: compiled from: OverscrollConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@t
@j2
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001e\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/e0;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/l0;", ak.av, "J", "b", "()J", "glowColor", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/foundation/layout/m0;", "()Landroidx/compose/foundation/layout/m0;", "drawPadding", "<init>", "(JLandroidx/compose/foundation/layout/m0;Lkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class OverscrollConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long glowColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.foundation.layout.m0 drawPadding;

    private OverscrollConfiguration(long j10, androidx.compose.foundation.layout.m0 m0Var) {
        this.glowColor = j10;
        this.drawPadding = m0Var;
    }

    public /* synthetic */ OverscrollConfiguration(long j10, androidx.compose.foundation.layout.m0 m0Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.n0.d(4284900966L) : j10, (i10 & 2) != 0 ? PaddingKt.c(0.0f, 0.0f, 3, null) : m0Var, null);
    }

    public /* synthetic */ OverscrollConfiguration(long j10, androidx.compose.foundation.layout.m0 m0Var, kotlin.jvm.internal.u uVar) {
        this(j10, m0Var);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.compose.foundation.layout.m0 getDrawPadding() {
        return this.drawPadding;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getGlowColor() {
        return this.glowColor;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.f0.g(OverscrollConfiguration.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.f0.n(other, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) other;
        return androidx.compose.ui.graphics.l0.y(this.glowColor, overscrollConfiguration.glowColor) && kotlin.jvm.internal.f0.g(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public int hashCode() {
        return (androidx.compose.ui.graphics.l0.K(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    @dl.d
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) androidx.compose.ui.graphics.l0.L(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }
}

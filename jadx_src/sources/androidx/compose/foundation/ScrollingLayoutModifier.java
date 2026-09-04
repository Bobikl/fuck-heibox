package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.e1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b/\u00100J)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000e\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u001d\u001a\u00020\u0018HÆ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\t\u0010!\u001a\u00020\fHÖ\u0001J\u0013\u0010$\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003R\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u001b\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u001c\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", "b", "width", "j", RXScreenCaptureService.KEY_HEIGHT, "i", "Landroidx/compose/foundation/ScrollState;", ak.av, "", ak.aF, "d", "Landroidx/compose/foundation/f0;", "e", "scrollerState", "isReversed", "isVertical", "overscrollEffect", "f", "", "toString", "hashCode", "", "other", "equals", "Landroidx/compose/foundation/ScrollState;", "n", "()Landroidx/compose/foundation/ScrollState;", "Z", "o", "()Z", "q", "Landroidx/compose/foundation/f0;", "m", "()Landroidx/compose/foundation/f0;", "<init>", "(Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/foundation/f0;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ScrollingLayoutModifier implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final ScrollState scrollerState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isReversed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVertical;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final f0 overscrollEffect;

    public ScrollingLayoutModifier(@dl.d ScrollState scrollerState, boolean z10, boolean z11, @dl.d f0 overscrollEffect) {
        kotlin.jvm.internal.f0.p(scrollerState, "scrollerState");
        kotlin.jvm.internal.f0.p(overscrollEffect, "overscrollEffect");
        this.scrollerState = scrollerState;
        this.isReversed = z10;
        this.isVertical = z11;
        this.overscrollEffect = overscrollEffect;
    }

    public static /* synthetic */ ScrollingLayoutModifier g(ScrollingLayoutModifier scrollingLayoutModifier, ScrollState scrollState, boolean z10, boolean z11, f0 f0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            scrollState = scrollingLayoutModifier.scrollerState;
        }
        if ((i10 & 2) != 0) {
            z10 = scrollingLayoutModifier.isReversed;
        }
        if ((i10 & 4) != 0) {
            z11 = scrollingLayoutModifier.isVertical;
        }
        if ((i10 & 8) != 0) {
            f0Var = scrollingLayoutModifier.overscrollEffect;
        }
        return scrollingLayoutModifier.f(scrollState, z10, z11, f0Var);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return this.isVertical ? measurable.l1(Integer.MAX_VALUE) : measurable.l1(i10);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final f0 getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) other;
        return kotlin.jvm.internal.f0.g(this.scrollerState, scrollingLayoutModifier.scrollerState) && this.isReversed == scrollingLayoutModifier.isReversed && this.isVertical == scrollingLayoutModifier.isVertical && kotlin.jvm.internal.f0.g(this.overscrollEffect, scrollingLayoutModifier.overscrollEffect);
    }

    @dl.d
    public final ScrollingLayoutModifier f(@dl.d ScrollState scrollerState, boolean isReversed, boolean isVertical, @dl.d f0 overscrollEffect) {
        kotlin.jvm.internal.f0.p(scrollerState, "scrollerState");
        kotlin.jvm.internal.f0.p(overscrollEffect, "overscrollEffect");
        return new ScrollingLayoutModifier(scrollerState, isReversed, isVertical, overscrollEffect);
    }

    @Override // androidx.compose.ui.layout.w
    public int h(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return this.isVertical ? measurable.w1(Integer.MAX_VALUE) : measurable.w1(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.scrollerState.hashCode() * 31;
        boolean z10 = this.isReversed;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.isVertical;
        return ((i10 + (z11 ? 1 : z11)) * 31) + this.overscrollEffect.hashCode();
    }

    @Override // androidx.compose.ui.layout.w
    public int i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return this.isVertical ? measurable.V(i10) : measurable.V(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.layout.w
    public int j(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return this.isVertical ? measurable.L0(i10) : measurable.L0(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public androidx.compose.ui.layout.j0 k(@dl.d androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        i.a(j10, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        final e1 e1VarZ1 = measurable.z1(s1.b.e(j10, 0, this.isVertical ? s1.b.p(j10) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : s1.b.o(j10), 5, null));
        int iB = fi.u.B(e1VarZ1.getWidth(), s1.b.p(j10));
        int iB2 = fi.u.B(e1VarZ1.getHeight(), s1.b.o(j10));
        final int height = e1VarZ1.getHeight() - iB2;
        int width = e1VarZ1.getWidth() - iB;
        if (!this.isVertical) {
            height = width;
        }
        this.overscrollEffect.setEnabled(height != 0);
        this.scrollerState.o(height);
        return androidx.compose.ui.layout.k0.p(measure, iB, iB2, null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.ScrollingLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                int I = fi.u.I(this.f5076b.n().m(), 0, height);
                int i10 = this.f5076b.o() ? I - height : -I;
                e1.a.z(layout, e1VarZ1, this.f5076b.q() ? 0 : i10, this.f5076b.q() ? i10 : 0, 0.0f, null, 12, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    @dl.d
    public final f0 m() {
        return this.overscrollEffect;
    }

    @dl.d
    public final ScrollState n() {
        return this.scrollerState;
    }

    public final boolean o() {
        return this.isReversed;
    }

    public final boolean q() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @dl.d
    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.scrollerState + ", isReversed=" + this.isReversed + ", isVertical=" + this.isVertical + ", overscrollEffect=" + this.overscrollEffect + ')';
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}

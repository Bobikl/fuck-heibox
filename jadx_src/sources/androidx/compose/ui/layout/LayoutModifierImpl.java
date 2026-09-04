package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.compose.ui.layout.x, reason: from toString */
/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BH\u0012#\u0010\u0015\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0014\u0012\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019¢\u0006\u0002\b\u0014ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R7\u0010\u0015\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u00148\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/layout/x;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/Function3;", "Lkotlin/t;", "measureBlock", "Lyh/q;", "f", "()Lyh/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "inspectorInfo", "<init>", "(Lyh/q;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class LayoutModifierImpl extends androidx.compose.ui.platform.y0 implements w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from toString */
    @dl.d
    private final yh.q<l0, g0, s1.b, j0> measureBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutModifierImpl(@dl.d yh.q<? super l0, ? super g0, ? super s1.b, ? extends j0> measureBlock, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(measureBlock, "measureBlock");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.measureBlock = measureBlock;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int b(n nVar, m mVar, int i10) {
        return v.d(this, nVar, mVar, i10);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        LayoutModifierImpl layoutModifierImpl = other instanceof LayoutModifierImpl ? (LayoutModifierImpl) other : null;
        if (layoutModifierImpl == null) {
            return false;
        }
        return kotlin.jvm.internal.f0.g(this.measureBlock, layoutModifierImpl.measureBlock);
    }

    @dl.d
    public final yh.q<l0, g0, s1.b, j0> f() {
        return this.measureBlock;
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(n nVar, m mVar, int i10) {
        return v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return this.measureBlock.hashCode();
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int i(n nVar, m mVar, int i10) {
        return v.a(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int j(n nVar, m mVar, int i10) {
        return v.c(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public j0 k(@dl.d l0 measure, @dl.d g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return this.measureBlock.invoke(measure, measurable, s1.b.b(j10));
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
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
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

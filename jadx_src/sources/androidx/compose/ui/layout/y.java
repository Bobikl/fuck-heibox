package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: IntermediateLayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B{\u0012V\u0010\u001e\u001aR\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u001d\u0012\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!¢\u0006\u0002\b\u001dø\u0001\u0001¢\u0006\u0004\b%\u0010&J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R+\u0010\u0018\u001a\u00020\u00118\u0016@\u0016X\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017Rj\u0010\u001e\u001aR\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u001d8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 \u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/layout/y;", "Landroidx/compose/ui/layout/l;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "other", "", "equals", "", "hashCode", "Ls1/r;", "f", "J", "l", "()J", "D", "(J)V", "targetSize", "Lkotlin/Function4;", "Lkotlin/m0;", "name", "lookaheadSize", "Lkotlin/t;", "measureBlock", "Lyh/r;", "()Lyh/r;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "inspectorInfo", "<init>", "(Lyh/r;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class y extends androidx.compose.ui.platform.y0 implements l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.r<l0, g0, s1.b, s1.r, j0> f15048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long targetSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(@dl.d yh.r<? super l0, ? super g0, ? super s1.b, ? super s1.r, ? extends j0> measureBlock, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(measureBlock, "measureBlock");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.f15048e = measureBlock;
        this.targetSize = s1.r.f139246b.a();
    }

    @Override // androidx.compose.ui.layout.l
    public void D(long j10) {
        this.targetSize = j10;
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
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return kotlin.jvm.internal.f0.g(this.f15048e, yVar.f15048e) && s1.r.h(getTargetSize(), yVar.getTargetSize());
    }

    @dl.d
    public final yh.r<l0, g0, s1.b, s1.r, j0> f() {
        return this.f15048e;
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(n nVar, m mVar, int i10) {
        return v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return (this.f15048e.hashCode() * 31) + s1.r.n(getTargetSize());
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
        return this.f15048e.U0(measure, measurable, s1.b.b(j10), s1.r.b(getTargetSize()));
    }

    @Override // androidx.compose.ui.layout.l
    /* JADX INFO: renamed from: l, reason: from getter */
    public long getTargetSize() {
        return this.targetSize;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
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

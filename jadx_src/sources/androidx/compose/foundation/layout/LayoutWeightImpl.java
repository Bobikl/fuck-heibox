package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.e0, reason: from toString */
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019¢\u0006\u0002\b\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/e0;", "Landroidx/compose/ui/layout/d1;", "Landroidx/compose/ui/platform/y0;", "Ls1/e;", "", "parentData", "Landroidx/compose/foundation/layout/v0;", "m", "other", "", "equals", "", "hashCode", "", "toString", "", "e", "F", "g", "()F", "weight", "f", "Z", "()Z", "fill", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(FZLyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class LayoutWeightImpl extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.d1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float weight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean fill;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutWeightImpl(float f10, boolean z10, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.weight = f10;
        this.fill = z10;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        LayoutWeightImpl layoutWeightImpl = other instanceof LayoutWeightImpl ? (LayoutWeightImpl) other : null;
        if (layoutWeightImpl == null) {
            return false;
        }
        return ((this.weight > layoutWeightImpl.weight ? 1 : (this.weight == layoutWeightImpl.weight ? 0 : -1)) == 0) && this.fill == layoutWeightImpl.fill;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.weight) * 31) + androidx.compose.foundation.b0.a(this.fill);
    }

    @Override // androidx.compose.ui.layout.d1
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData V(@dl.d s1.e eVar, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.k(this.weight);
        rowColumnParentData.j(this.fill);
        return rowColumnParentData;
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
        return "LayoutWeightImpl(weight=" + this.weight + ", fill=" + this.fill + ')';
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

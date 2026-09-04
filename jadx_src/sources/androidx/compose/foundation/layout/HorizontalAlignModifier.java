package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.w, reason: from toString */
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/w;", "Landroidx/compose/ui/layout/d1;", "Landroidx/compose/ui/platform/y0;", "Ls1/e;", "", "parentData", "Landroidx/compose/foundation/layout/v0;", "g", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/c$b;", "e", "Landroidx/compose/ui/c$b;", "f", "()Landroidx/compose/ui/c$b;", "horizontal", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/c$b;Lyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class HorizontalAlignModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.d1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.ui.c.b horizontal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalAlignModifier(@dl.d androidx.compose.ui.c.b horizontal, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(horizontal, "horizontal");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.horizontal = horizontal;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        HorizontalAlignModifier horizontalAlignModifier = other instanceof HorizontalAlignModifier ? (HorizontalAlignModifier) other : null;
        if (horizontalAlignModifier == null) {
            return false;
        }
        return kotlin.jvm.internal.f0.g(this.horizontal, horizontalAlignModifier.horizontal);
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final androidx.compose.ui.c.b getHorizontal() {
        return this.horizontal;
    }

    @Override // androidx.compose.ui.layout.d1
    @dl.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData V(@dl.d s1.e eVar, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.i(q.INSTANCE.i(this.horizontal));
        return rowColumnParentData;
    }

    public int hashCode() {
        return this.horizontal.hashCode();
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
        return "HorizontalAlignModifier(horizontal=" + this.horizontal + ')';
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

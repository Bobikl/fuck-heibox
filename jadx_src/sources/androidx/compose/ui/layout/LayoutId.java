package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.compose.ui.layout.s, reason: from toString */
/* JADX INFO: compiled from: LayoutId.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B(\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0013\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/d1;", "Landroidx/compose/ui/layout/t;", "Landroidx/compose/ui/platform/y0;", "Ls1/e;", "", "parentData", androidx.exifinterface.media.a.X4, "", "hashCode", "other", "", "equals", "", "toString", "e", "Ljava/lang/Object;", "getLayoutId", "()Ljava/lang/Object;", "layoutId", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Ljava/lang/Object;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class LayoutId extends androidx.compose.ui.platform.y0 implements d1, t {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object layoutId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutId(@dl.d Object layoutId, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(layoutId, "layoutId");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.layoutId = layoutId;
    }

    @Override // androidx.compose.ui.layout.d1
    @dl.e
    public Object V(@dl.d s1.e eVar, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        return this;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        LayoutId layoutId = other instanceof LayoutId ? (LayoutId) other : null;
        if (layoutId == null) {
            return false;
        }
        return kotlin.jvm.internal.f0.g(getLayoutId(), layoutId.getLayoutId());
    }

    @Override // androidx.compose.ui.layout.t
    @dl.d
    public Object getLayoutId() {
        return this.layoutId;
    }

    public int hashCode() {
        return getLayoutId().hashCode();
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
        return "LayoutId(id=" + getLayoutId() + ')';
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

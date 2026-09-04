package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: OnPlacedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r\u0012\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/layout/y0;", "Landroidx/compose/ui/layout/x0;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/q;", "coordinates", "Lkotlin/b2;", "p", "", "other", "", "equals", "", "hashCode", "Lkotlin/Function1;", "callback", "Lyh/l;", "f", "()Lyh/l;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Lyh/l;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class y0 extends androidx.compose.ui.platform.y0 implements x0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<q, b2> f15050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(@dl.d yh.l<? super q, b2> callback, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(callback, "callback");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.f15050e = callback;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof y0) {
            return kotlin.jvm.internal.f0.g(this.f15050e, ((y0) other).f15050e);
        }
        return false;
    }

    @dl.d
    public final yh.l<q, b2> f() {
        return this.f15050e;
    }

    public int hashCode() {
        return this.f15050e.hashCode();
    }

    @Override // androidx.compose.ui.layout.x0
    public void p(@dl.d q coordinates) {
        kotlin.jvm.internal.f0.p(coordinates, "coordinates");
        this.f15050e.invoke(coordinates);
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

package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LookaheadLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BM\u00126\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002RG\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/layout/e0;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/layout/a0;", "coordinates", "Lkotlin/b2;", "d", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "lookaheadScopeRootCoordinates", "callback", "Lyh/p;", ak.av, "()Lyh/p;", "Lkotlin/Function0;", "rootCoordinates", "Lyh/a;", ak.aF, "()Lyh/a;", "<init>", "(Lyh/p;Lyh/a;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e0 implements androidx.compose.ui.n.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<a0, a0, b2> f15004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.a<a0> f15005c;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@dl.d yh.p<? super a0, ? super a0, b2> callback, @dl.d yh.a<? extends a0> rootCoordinates) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        kotlin.jvm.internal.f0.p(rootCoordinates, "rootCoordinates");
        this.f15004b = callback;
        this.f15005c = rootCoordinates;
    }

    @dl.d
    public final yh.p<a0, a0, b2> a() {
        return this.f15004b;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @dl.d
    public final yh.a<a0> c() {
        return this.f15005c;
    }

    public final void d(@dl.d a0 coordinates) {
        kotlin.jvm.internal.f0.p(coordinates, "coordinates");
        this.f15004b.invoke(this.f15005c.invoke(), coordinates);
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

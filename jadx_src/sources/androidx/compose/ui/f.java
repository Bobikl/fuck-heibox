package androidx.compose.ui;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0002\b\u0006\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000e\u0010\u000fR-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/f;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/platform/y0;", "Lkotlin/Function1;", "Landroidx/compose/ui/n;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "factory", "Lyh/q;", "f", "()Lyh/q;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "inspectorInfo", "<init>", "(Lyh/l;Lyh/q;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public class f extends y0 implements n.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.q<n, androidx.compose.runtime.p, Integer, n> f13481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(@dl.d yh.l<? super x0, b2> inspectorInfo, @dl.d yh.q<? super n, ? super androidx.compose.runtime.p, ? super Integer, ? extends n> factory) {
        super(inspectorInfo);
        f0.p(inspectorInfo, "inspectorInfo");
        f0.p(factory, "factory");
        this.f13481e = factory;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return o.a(this, lVar);
    }

    @dl.d
    public final yh.q<n, androidx.compose.runtime.p, Integer, n> f() {
        return this.f13481e;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ n s0(n nVar) {
        return m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return o.c(this, obj, pVar);
    }
}

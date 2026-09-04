package androidx.compose.foundation;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001d\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/v;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/m;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/q;", "Lkotlin/b2;", "Landroidx/compose/ui/modifier/n;", "scope", "w1", "focusedBounds", ak.aF, "d", "Landroidx/compose/ui/layout/q;", "lastBounds", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", ak.av, "()Lyh/l;", "value", "handler", "<init>", "(Lyh/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class v implements androidx.compose.ui.modifier.e, androidx.compose.ui.modifier.m<yh.l<? super androidx.compose.ui.layout.q, ? extends b2>>, yh.l<androidx.compose.ui.layout.q, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<androidx.compose.ui.layout.q, b2> f8410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private yh.l<? super androidx.compose.ui.layout.q, b2> f8411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q lastBounds;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@dl.d yh.l<? super androidx.compose.ui.layout.q, b2> handler) {
        kotlin.jvm.internal.f0.p(handler, "handler");
        this.f8410b = handler;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yh.l<androidx.compose.ui.layout.q, b2> getValue() {
        return this;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public void c(@dl.e androidx.compose.ui.layout.q qVar) {
        this.lastBounds = qVar;
        this.f8410b.invoke(qVar);
        yh.l<? super androidx.compose.ui.layout.q, b2> lVar = this.f8411c;
        if (lVar != null) {
            lVar.invoke(qVar);
        }
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public androidx.compose.ui.modifier.p<yh.l<? super androidx.compose.ui.layout.q, ? extends b2>> getKey() {
        return FocusedBoundsKt.a();
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
        c(qVar);
        return b2.f124493a;
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

    @Override // androidx.compose.ui.modifier.e
    public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        yh.l<? super androidx.compose.ui.layout.q, b2> lVar = (yh.l) scope.a(FocusedBoundsKt.a());
        if (kotlin.jvm.internal.f0.g(lVar, this.f8411c)) {
            return;
        }
        this.f8411c = lVar;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}

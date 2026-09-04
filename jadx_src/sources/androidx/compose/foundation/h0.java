package androidx.compose.foundation;

import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@t
@j2
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R%\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/h0;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "", "other", "", "equals", "", "hashCode", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/t;", "onPinnableParentAvailable", "Lyh/l;", ak.av, "()Lyh/l;", "<init>", "(Lyh/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class h0 implements androidx.compose.ui.modifier.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<androidx.compose.foundation.lazy.layout.t, b2> f5835b;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(@dl.d yh.l<? super androidx.compose.foundation.lazy.layout.t, b2> onPinnableParentAvailable) {
        kotlin.jvm.internal.f0.p(onPinnableParentAvailable, "onPinnableParentAvailable");
        this.f5835b = onPinnableParentAvailable;
    }

    @dl.d
    public final yh.l<androidx.compose.foundation.lazy.layout.t, b2> a() {
        return this.f5835b;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof h0) && kotlin.jvm.internal.f0.g(((h0) other).f5835b, this.f5835b);
    }

    public int hashCode() {
        return this.f5835b.hashCode();
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
        this.f5835b.invoke((androidx.compose.foundation.lazy.layout.t) scope.a(PinnableParentKt.a()));
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}

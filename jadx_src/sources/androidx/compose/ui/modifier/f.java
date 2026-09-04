package androidx.compose.ui.modifier;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalConsumer.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u000e\u0012\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R(\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/modifier/f;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "", "other", "", "equals", "", "hashCode", "Lkotlin/Function1;", "Lkotlin/t;", "consumer", "Lyh/l;", "f", "()Lyh/l;", "Landroidx/compose/ui/platform/x0;", "debugInspectorInfo", "<init>", "(Lyh/l;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class f extends y0 implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<n, b2> f15065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(@dl.d yh.l<? super n, b2> consumer, @dl.d yh.l<? super x0, b2> debugInspectorInfo) {
        super(debugInspectorInfo);
        f0.p(consumer, "consumer");
        f0.p(debugInspectorInfo, "debugInspectorInfo");
        this.f15065e = consumer;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof f) && f0.g(((f) other).f15065e, this.f15065e);
    }

    @dl.d
    public final yh.l<n, b2> f() {
        return this.f15065e;
    }

    public int hashCode() {
        return this.f15065e.hashCode();
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
    public void w1(@dl.d n scope) {
        f0.p(scope, "scope");
        this.f15065e.invoke(scope);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}

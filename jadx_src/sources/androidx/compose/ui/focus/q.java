package androidx.compose.ui.focus;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B9\u0012\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u001e¢\u0006\u0002\b\u001f\u0012\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00060\u001e¢\u0006\u0002\b\u001f¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eR/\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u001e¢\u0006\u0002\b\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"R\u0014\u0010$\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0014¨\u0006)"}, d2 = {"Landroidx/compose/ui/focus/q;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/ui/focus/p;", "focusProperties", "f", "<set-?>", "Landroidx/compose/runtime/a1;", "m", "()Landroidx/compose/ui/focus/q;", "o", "(Landroidx/compose/ui/focus/q;)V", "parent", "Landroidx/compose/ui/modifier/p;", "g", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "Lkotlin/Function1;", "Lkotlin/t;", "focusPropertiesScope", "Lyh/l;", "()Lyh/l;", "n", "value", "Landroidx/compose/ui/platform/x0;", "inspectorInfo", "<init>", "(Lyh/l;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class q extends y0 implements androidx.compose.ui.modifier.e, androidx.compose.ui.modifier.m<q> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<p, b2> f13595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 parent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.modifier.p<q> key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(@dl.d yh.l<? super p, b2> focusPropertiesScope, @dl.d yh.l<? super x0, b2> inspectorInfo) {
        super(inspectorInfo);
        f0.p(focusPropertiesScope, "focusPropertiesScope");
        f0.p(inspectorInfo, "inspectorInfo");
        this.f13595e = focusPropertiesScope;
        this.parent = h2.g(null, null, 2, null);
        this.key = FocusPropertiesKt.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final q m() {
        return (q) this.parent.getValue();
    }

    private final void o(q qVar) {
        this.parent.setValue(qVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof q) && f0.g(this.f13595e, ((q) other).f13595e);
    }

    public final void f(@dl.d p focusProperties) {
        f0.p(focusProperties, "focusProperties");
        this.f13595e.invoke(focusProperties);
        q qVarM = m();
        if (qVarM != null) {
            qVarM.f(focusProperties);
        }
    }

    @dl.d
    public final yh.l<p, b2> g() {
        return this.f13595e;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public androidx.compose.ui.modifier.p<q> getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.f13595e.hashCode();
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public q getValue() {
        return this;
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
        f0.p(scope, "scope");
        o((q) scope.a(FocusPropertiesKt.c()));
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}

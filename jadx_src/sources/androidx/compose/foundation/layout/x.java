package androidx.compose.foundation.layout;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\"\b\u0004\u0012\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0002\b\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f\u0082\u0001\u0002\u001f ¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/x;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/foundation/layout/h1;", "modifierLocalInsets", "f", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "<set-?>", "e", "Landroidx/compose/runtime/a1;", "g", "()Landroidx/compose/foundation/layout/h1;", "n", "(Landroidx/compose/foundation/layout/h1;)V", "consumedInsets", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "m", "value", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Lyh/l;)V", "Landroidx/compose/foundation/layout/n0;", "Landroidx/compose/foundation/layout/e1;", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public abstract class x extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.modifier.e, androidx.compose.ui.modifier.m<h1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 consumedInsets;

    private x(yh.l<? super androidx.compose.ui.platform.x0, b2> lVar) {
        super(lVar);
        this.consumedInsets = h2.g(i1.a(0, 0, 0, 0), null, 2, null);
    }

    public /* synthetic */ x(yh.l lVar, kotlin.jvm.internal.u uVar) {
        this(lVar);
    }

    private final h1 g() {
        return (h1) this.consumedInsets.getValue();
    }

    private final void n(h1 h1Var) {
        this.consumedInsets.setValue(h1Var);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @dl.d
    public abstract h1 f(@dl.d h1 modifierLocalInsets);

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public androidx.compose.ui.modifier.p<h1> getKey() {
        return WindowInsetsPaddingKt.c();
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public h1 getValue() {
        return g();
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
        n(f((h1) scope.a(WindowInsetsPaddingKt.c())));
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}

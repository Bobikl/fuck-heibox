package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/p;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/modifier/e;", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "Landroidx/compose/foundation/layout/h1;", "f", "Landroidx/compose/foundation/layout/h1;", "oldWindowInsets", "Lkotlin/Function1;", "block", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Lyh/l;Lyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class p extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.modifier.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<h1, b2> f6368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private h1 oldWindowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(@dl.d yh.l<? super h1, b2> block, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(block, "block");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.f6368e = block;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof p) {
            return kotlin.jvm.internal.f0.g(((p) other).f6368e, this.f6368e);
        }
        return false;
    }

    public int hashCode() {
        return this.f6368e.hashCode();
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
        h1 h1Var = (h1) scope.a(WindowInsetsPaddingKt.c());
        if (kotlin.jvm.internal.f0.g(h1Var, this.oldWindowInsets)) {
            return;
        }
        this.oldWindowInsets = h1Var;
        this.f6368e.invoke(h1Var);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}

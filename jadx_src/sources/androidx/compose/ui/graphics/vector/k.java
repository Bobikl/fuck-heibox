package androidx.compose.ui.graphics.vector;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VectorCompose.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\bH\u0014J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/k;", "Landroidx/compose/runtime/a;", "Landroidx/compose/ui/graphics/vector/j;", "Landroidx/compose/ui/graphics/vector/b;", "n", "", UCropPlusActivity.ARG_INDEX, "instance", "Lkotlin/b2;", "p", "o", "count", "b", "k", "from", "to", "e", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/j;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class k extends androidx.compose.runtime.a<j> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14325e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@dl.d j root) {
        super(root);
        f0.p(root, "root");
    }

    private final b n(j jVar) {
        if (jVar instanceof b) {
            return (b) jVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // androidx.compose.runtime.e
    public void b(int i10, int i11) {
        n(getCurrent()).r(i10, i11);
    }

    @Override // androidx.compose.runtime.e
    public void e(int i10, int i11, int i12) {
        n(getCurrent()).q(i10, i11, i12);
    }

    @Override // androidx.compose.runtime.a
    protected void k() {
        b bVarN = n(i());
        bVarN.r(0, bVarN.g());
    }

    @Override // androidx.compose.runtime.e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void g(int i10, @dl.d j instance) {
        f0.p(instance, "instance");
    }

    @Override // androidx.compose.runtime.e
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void f(int i10, @dl.d j instance) {
        f0.p(instance, "instance");
        n(getCurrent()).p(i10, instance);
    }
}

package androidx.compose.ui.node;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: UiApplier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/m1;", "Landroidx/compose/runtime/a;", "Landroidx/compose/ui/node/LayoutNode;", "", UCropPlusActivity.ARG_INDEX, "instance", "Lkotlin/b2;", "o", "n", "count", "b", "from", "to", "e", "k", ak.aF, "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class m1 extends androidx.compose.runtime.a<LayoutNode> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(@dl.d LayoutNode root) {
        super(root);
        kotlin.jvm.internal.f0.p(root, "root");
    }

    @Override // androidx.compose.runtime.e
    public void b(int i10, int i11) {
        getCurrent().h1(i10, i11);
    }

    @Override // androidx.compose.runtime.a, androidx.compose.runtime.e
    public void c() {
        super.c();
        b1 owner = i().getOwner();
        if (owner != null) {
            owner.p();
        }
    }

    @Override // androidx.compose.runtime.e
    public void e(int i10, int i11, int i12) {
        getCurrent().X0(i10, i11, i12);
    }

    @Override // androidx.compose.runtime.a
    protected void k() {
        i().g1();
    }

    @Override // androidx.compose.runtime.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void g(int i10, @dl.d LayoutNode instance) {
        kotlin.jvm.internal.f0.p(instance, "instance");
        getCurrent().H0(i10, instance);
    }

    @Override // androidx.compose.runtime.e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void f(int i10, @dl.d LayoutNode instance) {
        kotlin.jvm.internal.f0.p(instance, "instance");
    }
}

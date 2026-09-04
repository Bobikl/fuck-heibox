package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroidx/compose/ui/focus/u;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", ak.av, "Landroidx/compose/runtime/collection/e;", "newModifiers", ak.aF, "f", "removedModifiers", "g", "d", "Landroidx/compose/ui/focus/FocusRequester;", "b", "Landroidx/compose/ui/focus/FocusRequester;", "i0", "()Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/u;", "parent", "Landroidx/compose/runtime/collection/e;", "focusModifiers", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "e", "()Landroidx/compose/ui/focus/u;", "value", "<init>", "(Landroidx/compose/ui/focus/FocusRequester;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class u implements androidx.compose.ui.modifier.e, androidx.compose.ui.modifier.m<u> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final FocusRequester focusRequester;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private u parent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<FocusModifier> focusModifiers;

    public u(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "focusRequester");
        this.focusRequester = focusRequester;
        this.focusModifiers = new androidx.compose.runtime.collection.e<>(new FocusModifier[16], 0);
        focusRequester.e().b(this);
    }

    public final void a(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "focusModifier");
        this.focusModifiers.b(focusModifier);
        u uVar = this.parent;
        if (uVar != null) {
            uVar.a(focusModifier);
        }
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public final void c(@dl.d androidx.compose.runtime.collection.e<FocusModifier> newModifiers) {
        f0.p(newModifiers, "newModifiers");
        androidx.compose.runtime.collection.e<FocusModifier> eVar = this.focusModifiers;
        eVar.c(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), newModifiers);
        u uVar = this.parent;
        if (uVar != null) {
            uVar.c(newModifiers);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    @dl.e
    public final FocusModifier d() {
        NodeCoordinator coordinator;
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        androidx.compose.runtime.collection.e<FocusModifier> eVar = this.focusModifiers;
        int size = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        FocusModifier focusModifier = null;
        if (size > 0) {
            int i10 = 0;
            FocusModifier[] focusModifierArrG = eVar.G();
            f0.n(focusModifierArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                FocusModifier focusModifier2 = focusModifierArrG[i10];
                if (focusModifier == null || (coordinator = focusModifier.getCoordinator()) == null || (layoutNode = coordinator.getLayoutNode()) == null) {
                    focusModifier = focusModifier2;
                } else {
                    NodeCoordinator coordinator2 = focusModifier2.getCoordinator();
                    if (coordinator2 != null && (layoutNode2 = coordinator2.getLayoutNode()) != null) {
                        while (layoutNode.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String() > layoutNode2.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String()) {
                            layoutNode = layoutNode.v0();
                            f0.m(layoutNode);
                        }
                        while (layoutNode2.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String() > layoutNode.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String()) {
                            layoutNode2 = layoutNode2.v0();
                            f0.m(layoutNode2);
                        }
                        while (!f0.g(layoutNode.v0(), layoutNode2.v0())) {
                            layoutNode = layoutNode.v0();
                            f0.m(layoutNode);
                            layoutNode2 = layoutNode2.v0();
                            f0.m(layoutNode2);
                        }
                        LayoutNode layoutNodeV0 = layoutNode.v0();
                        f0.m(layoutNodeV0);
                        List<LayoutNode> listV = layoutNodeV0.V();
                        if (listV.indexOf(layoutNode) >= listV.indexOf(layoutNode2)) {
                            focusModifier = focusModifier2;
                        }
                    }
                }
                i10++;
            } while (i10 < size);
        }
        return focusModifier;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public u getValue() {
        return this;
    }

    public final void f(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "focusModifier");
        this.focusModifiers.c0(focusModifier);
        u uVar = this.parent;
        if (uVar != null) {
            uVar.f(focusModifier);
        }
    }

    public final void g(@dl.d androidx.compose.runtime.collection.e<FocusModifier> removedModifiers) {
        f0.p(removedModifiers, "removedModifiers");
        this.focusModifiers.d0(removedModifiers);
        u uVar = this.parent;
        if (uVar != null) {
            uVar.g(removedModifiers);
        }
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public androidx.compose.ui.modifier.p<u> getKey() {
        return FocusRequesterModifierKt.b();
    }

    @dl.d
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
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
        u uVar = (u) scope.a(FocusRequesterModifierKt.b());
        if (f0.g(uVar, this.parent)) {
            return;
        }
        u uVar2 = this.parent;
        if (uVar2 != null) {
            uVar2.g(this.focusModifiers);
        }
        if (uVar != null) {
            uVar.c(this.focusModifiers);
        }
        this.parent = uVar;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}

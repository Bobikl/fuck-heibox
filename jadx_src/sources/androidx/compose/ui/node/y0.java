package androidx.compose.ui.node;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: OnPositionedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0004R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/y0;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lkotlin/b2;", "b", "node", ak.aF, "rootNode", "d", ak.av, "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/runtime/collection/e;", "layoutNodes", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<LayoutNode> layoutNodes = new androidx.compose.runtime.collection.e<>(new LayoutNode[16], 0);

    private final void b(LayoutNode layoutNode) {
        layoutNode.K();
        int i10 = 0;
        layoutNode.B1(false);
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = layoutNode.B0();
        int i11 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i11 > 0) {
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                b(layoutNodeArrG[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    public final void a() {
        this.layoutNodes.n0(Companion.C0093a.f15411b);
        androidx.compose.runtime.collection.e<LayoutNode> eVar = this.layoutNodes;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = i10 - 1;
            LayoutNode[] layoutNodeArrG = eVar.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = layoutNodeArrG[i11];
                if (layoutNode.getNeedsOnPositionedDispatch()) {
                    b(layoutNode);
                }
                i11--;
            } while (i11 >= 0);
        }
        this.layoutNodes.m();
    }

    public final void c(@dl.d LayoutNode node) {
        kotlin.jvm.internal.f0.p(node, "node");
        this.layoutNodes.b(node);
        node.B1(true);
    }

    public final void d(@dl.d LayoutNode rootNode) {
        kotlin.jvm.internal.f0.p(rootNode, "rootNode");
        this.layoutNodes.m();
        this.layoutNodes.b(rootNode);
        rootNode.B1(true);
    }
}

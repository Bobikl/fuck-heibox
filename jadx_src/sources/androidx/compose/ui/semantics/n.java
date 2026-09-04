package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.j1;
import androidx.compose.ui.node.t0;
import androidx.compose.ui.node.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\"\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002\u001a\f\u0010\r\u001a\u00020\u000b*\u00020\nH\u0002\" \u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\" \u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000f\"\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\n8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "Landroidx/compose/ui/node/j1;", "list", "", "g", "Lkotlin/Function1;", "", "selector", "f", "Landroidx/compose/ui/semantics/SemanticsNode;", "", "e", "n", "k", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/j1;", "getOuterSemantics$annotations", "(Landroidx/compose/ui/node/LayoutNode;)V", "outerSemantics", "i", "getOuterMergingSemantics$annotations", "outerMergingSemantics", "Landroidx/compose/ui/semantics/g;", "m", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/g;", "role", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode f(LayoutNode layoutNode, yh.l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode layoutNodeV0 = layoutNode.v0(); layoutNodeV0 != null; layoutNodeV0 = layoutNodeV0.v0()) {
            if (lVar.invoke(layoutNodeV0).booleanValue()) {
                return layoutNodeV0;
            }
        }
        return null;
    }

    private static final List<j1> g(LayoutNode layoutNode, List<j1> list) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarZ0 = layoutNode.z0();
        int i10 = eVarZ0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            LayoutNode[] layoutNodeArrG = eVarZ0.G();
            f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode2 = layoutNodeArrG[i11];
                j1 j1VarK = k(layoutNode2);
                if (j1VarK != null) {
                    list.add(j1VarK);
                } else {
                    g(layoutNode2, list);
                }
                i11++;
            } while (i11 < i10);
        }
        return list;
    }

    static /* synthetic */ List h(LayoutNode layoutNode, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return g(layoutNode, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.n$d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @dl.e
    public static final j1 i(@dl.d LayoutNode layoutNode) {
        ?? child;
        f0.p(layoutNode, "<this>");
        t0 nodes = layoutNode.getNodes();
        int iJ = x0.f15398a.j();
        if ((nodes.k() & iJ) != 0) {
            androidx.compose.ui.n.d head = nodes.getHead();
            while (true) {
                if (child == 0) {
                    child = head;
                    break;
                }
                if ((child.getKindSet() & iJ) == 0 || !(child instanceof j1) || !((j1) child).getSemanticsConfiguration().getIsMergingSemanticsOfDescendants()) {
                    child = head;
                    child = head;
                    child = head;
                    if ((child.getAggregateChildKindSet() & iJ) == 0) {
                        break;
                    }
                    child = child.getChild();
                } else {
                    child = head;
                }
            }
            child = 0;
        } else {
            child = 0;
        }
        return (j1) child;
    }

    public static /* synthetic */ void j(LayoutNode layoutNode) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.n$d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @dl.e
    public static final j1 k(@dl.d LayoutNode layoutNode) {
        ?? child;
        f0.p(layoutNode, "<this>");
        t0 nodes = layoutNode.getNodes();
        int iJ = x0.f15398a.j();
        if ((nodes.k() & iJ) != 0) {
            androidx.compose.ui.n.d head = nodes.getHead();
            while (true) {
                if (child == 0) {
                    child = head;
                    break;
                }
                if ((child.getKindSet() & iJ) == 0 || !(child instanceof j1)) {
                    child = head;
                    child = head;
                    if ((child.getAggregateChildKindSet() & iJ) == 0) {
                        break;
                    }
                    child = child.getChild();
                } else {
                    child = head;
                }
            }
            child = 0;
        } else {
            child = 0;
        }
        return (j1) child;
    }

    public static /* synthetic */ void l(LayoutNode layoutNode) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g m(SemanticsNode semanticsNode) {
        return (g) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsProperties.f16032a.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }
}

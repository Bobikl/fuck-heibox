package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.j1;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.w;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SemanticsSort.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\"\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "Landroidx/compose/ui/node/j1;", "list", "", ak.aF, "Lkotlin/Function1;", "", "predicate", "b", "Landroidx/compose/ui/node/NodeCoordinator;", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class s {
    @dl.d
    public static final NodeCoordinator a(@dl.d LayoutNode layoutNode) {
        androidx.compose.ui.n.d node;
        NodeCoordinator coordinator;
        f0.p(layoutNode, "<this>");
        j1 j1VarI = n.i(layoutNode);
        if (j1VarI == null) {
            j1VarI = n.k(layoutNode);
        }
        return (j1VarI == null || (node = j1VarI.getNode()) == null || (coordinator = node.getCoordinator()) == null) ? layoutNode.Y() : coordinator;
    }

    @dl.e
    public static final LayoutNode b(@dl.d LayoutNode layoutNode, @dl.d yh.l<? super LayoutNode, Boolean> predicate) {
        f0.p(layoutNode, "<this>");
        f0.p(predicate, "predicate");
        if (predicate.invoke(layoutNode).booleanValue()) {
            return layoutNode;
        }
        List<LayoutNode> listV = layoutNode.V();
        int size = listV.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNodeB = b(listV.get(i10), predicate);
            if (layoutNodeB != null) {
                return layoutNodeB;
            }
        }
        return null;
    }

    @dl.d
    public static final List<j1> c(@dl.d LayoutNode layoutNode, @dl.d List<j1> list) {
        f0.p(layoutNode, "<this>");
        f0.p(list, "list");
        if (!layoutNode.p()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        List<LayoutNode> listV = layoutNode.V();
        int size = listV.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = listV.get(i10);
            if (layoutNode2.p()) {
                arrayList.add(new NodeLocationHolder(layoutNode, layoutNode2));
            }
        }
        List<NodeLocationHolder> listE = e(arrayList);
        ArrayList arrayList2 = new ArrayList(listE.size());
        int size2 = listE.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(listE.get(i11).getNode());
        }
        int size3 = arrayList2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            LayoutNode layoutNode3 = (LayoutNode) arrayList2.get(i12);
            j1 j1VarK = n.k(layoutNode3);
            if (j1VarK != null) {
                list.add(j1VarK);
            } else {
                c(layoutNode3, list);
            }
        }
        return list;
    }

    public static /* synthetic */ List d(LayoutNode layoutNode, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return c(layoutNode, list);
    }

    private static final List<NodeLocationHolder> e(List<NodeLocationHolder> list) {
        try {
            NodeLocationHolder.INSTANCE.b(NodeLocationHolder.ComparisonStrategy.Stripe);
            List<NodeLocationHolder> listT5 = CollectionsKt___CollectionsKt.T5(list);
            w.j0(listT5);
            return listT5;
        } catch (IllegalArgumentException unused) {
            NodeLocationHolder.INSTANCE.b(NodeLocationHolder.ComparisonStrategy.Location);
            List<NodeLocationHolder> listT6 = CollectionsKt___CollectionsKt.T5(list);
            w.j0(listT6);
            return listT6;
        }
    }
}

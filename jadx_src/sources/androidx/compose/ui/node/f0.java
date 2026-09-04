package androidx.compose.ui.node;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutTreeConsistencyChecker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/f0;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", ak.aF, "b", "", "f", "d", "Lkotlin/b2;", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/DepthSortedSet;", "Landroidx/compose/ui/node/DepthSortedSet;", "relayoutNodes", "", "Landroidx/compose/ui/node/j0$a;", "Ljava/util/List;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSet;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final DepthSortedSet relayoutNodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<j0.a> postponedMeasureRequests;

    public f0(@dl.d LayoutNode root, @dl.d DepthSortedSet relayoutNodes, @dl.d List<j0.a> postponedMeasureRequests) {
        kotlin.jvm.internal.f0.p(root, "root");
        kotlin.jvm.internal.f0.p(relayoutNodes, "relayoutNodes");
        kotlin.jvm.internal.f0.p(postponedMeasureRequests, "postponedMeasureRequests");
        this.root = root;
        this.relayoutNodes = relayoutNodes;
        this.postponedMeasureRequests = postponedMeasureRequests;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x005b A[EDGE_INSN: B:123:0x005b->B:30:0x005b BREAK  A[LOOP:1: B:19:0x0038->B:28:0x0057], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057 A[LOOP:1: B:19:0x0038->B:28:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    private final boolean b(LayoutNode layoutNode) {
        boolean z10;
        List<j0.a> list;
        int size;
        int i10;
        j0.a aVar;
        j0.a aVar2;
        boolean z11;
        LayoutNode layoutNodeV0 = layoutNode.v0();
        j0.a aVar3 = null;
        LayoutNode.LayoutState layoutStateF0 = layoutNodeV0 != null ? layoutNodeV0.f0() : null;
        if (layoutNode.getIsPlaced()) {
            if (layoutNode.m0()) {
                list = this.postponedMeasureRequests;
                size = list.size();
                i10 = 0;
                while (true) {
                    if (i10 < size) {
                        aVar = null;
                        break;
                    }
                    aVar = list.get(i10);
                    aVar2 = aVar;
                    if (kotlin.jvm.internal.f0.g(aVar2.getNode(), layoutNode) || aVar2.getIsLookahead()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        break;
                    }
                    i10++;
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (layoutNode.m0()) {
                if (!this.relayoutNodes.b(layoutNode)) {
                    if (layoutNodeV0 == null && layoutNodeV0.m0()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && layoutStateF0 != LayoutNode.LayoutState.Measuring) {
                        return false;
                    }
                }
                return true;
            }
            if (layoutNode.e0()) {
                return !this.relayoutNodes.b(layoutNode) || layoutNodeV0 == null || layoutNodeV0.m0() || layoutNodeV0.e0() || layoutStateF0 == LayoutNode.LayoutState.Measuring || layoutStateF0 == LayoutNode.LayoutState.LayingOut;
            }
        } else if (layoutNode.getPlaceOrder() != Integer.MAX_VALUE) {
            if (layoutNodeV0 != null && layoutNodeV0.getIsPlaced()) {
                if (layoutNode.m0()) {
                    list = this.postponedMeasureRequests;
                    size = list.size();
                    i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            aVar = null;
                            break;
                        }
                        aVar = list.get(i10);
                        aVar2 = aVar;
                        if (kotlin.jvm.internal.f0.g(aVar2.getNode(), layoutNode)) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            break;
                            break;
                        }
                        i10++;
                    }
                    if (aVar != null) {
                        return true;
                    }
                }
                if (layoutNode.m0()) {
                    if (!this.relayoutNodes.b(layoutNode)) {
                        if (layoutNodeV0 == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            return false;
                        }
                    }
                    return true;
                }
                if (layoutNode.e0()) {
                    if (this.relayoutNodes.b(layoutNode)) {
                    }
                }
            }
        }
        if (kotlin.jvm.internal.f0.g(layoutNode.N0(), Boolean.TRUE)) {
            if (layoutNode.h0()) {
                List<j0.a> list2 = this.postponedMeasureRequests;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    j0.a aVar4 = list2.get(i11);
                    j0.a aVar5 = aVar4;
                    if (kotlin.jvm.internal.f0.g(aVar5.getNode(), layoutNode) && aVar5.getIsLookahead()) {
                        aVar3 = aVar4;
                        break;
                    }
                }
                if (aVar3 != null) {
                    return true;
                }
            }
            if (layoutNode.h0()) {
                if (!this.relayoutNodes.b(layoutNode)) {
                    if (!(layoutNodeV0 != null && layoutNodeV0.h0()) && layoutStateF0 != LayoutNode.LayoutState.LookaheadMeasuring) {
                        if (!(layoutNodeV0 != null && layoutNodeV0.m0())) {
                            return false;
                        }
                        androidx.compose.ui.layout.f0 mLookaheadScope = layoutNode.getMLookaheadScope();
                        kotlin.jvm.internal.f0.m(mLookaheadScope);
                        if (!kotlin.jvm.internal.f0.g(mLookaheadScope.getRoot(), layoutNode)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            if (layoutNode.g0()) {
                if (!this.relayoutNodes.b(layoutNode) && layoutNodeV0 != null && !layoutNodeV0.h0() && !layoutNodeV0.g0() && layoutStateF0 != LayoutNode.LayoutState.LookaheadMeasuring && layoutStateF0 != LayoutNode.LayoutState.LookaheadLayingOut) {
                    if (!layoutNodeV0.e0()) {
                        return false;
                    }
                    androidx.compose.ui.layout.f0 mLookaheadScope2 = layoutNode.getMLookaheadScope();
                    kotlin.jvm.internal.f0.m(mLookaheadScope2);
                    if (!kotlin.jvm.internal.f0.g(mLookaheadScope2.getRoot(), layoutNode)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    private final boolean c(LayoutNode node) {
        if (!b(node)) {
            return false;
        }
        List<LayoutNode> listV = node.V();
        int size = listV.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c(listV.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        kotlin.jvm.internal.f0.o(sb2, "append(value)");
        sb2.append('\n');
        kotlin.jvm.internal.f0.o(sb2, "append('\\n')");
        e(this, sb2, this.root, 0);
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "stringBuilder.toString()");
        return string;
    }

    private static final void e(f0 f0Var, StringBuilder sb2, LayoutNode layoutNode, int i10) {
        String strF = f0Var.f(layoutNode);
        if (strF.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strF);
            kotlin.jvm.internal.f0.o(sb2, "append(value)");
            sb2.append('\n');
            kotlin.jvm.internal.f0.o(sb2, "append('\\n')");
            i10++;
        }
        List<LayoutNode> listV = layoutNode.V();
        int size = listV.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(f0Var, sb2, listV.get(i12), i10);
        }
    }

    private final String f(LayoutNode node) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(node);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(node.f0());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!node.getIsPlaced()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + node.getMeasuredByParent() + ']');
        if (!b(node)) {
            sb2.append("[INCONSISTENT]");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "with(StringBuilder()) {\n…     toString()\n        }");
        return string;
    }

    public final void a() {
        if (!c(this.root)) {
            System.out.println((Object) d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}

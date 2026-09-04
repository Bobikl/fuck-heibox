package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SemanticsSort.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0013\u0014B\u0019\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder;", "", "other", "", ak.aF, "Landroidx/compose/ui/node/LayoutNode;", "b", "Landroidx/compose/ui/node/LayoutNode;", "e", "()Landroidx/compose/ui/node/LayoutNode;", "subtreeRoot", "d", "node", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V", "f", ak.av, "ComparisonStrategy", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class NodeLocationHolder implements Comparable<NodeLocationHolder> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static ComparisonStrategy f16008g = ComparisonStrategy.Stripe;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode subtreeRoot;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode node;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final b1.i f16011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutDirection layoutDirection;

    /* JADX INFO: compiled from: SemanticsSort.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "", "(Ljava/lang/String;I)V", "Stripe", "Location", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ComparisonStrategy {
        Stripe,
        Location
    }

    /* JADX INFO: renamed from: androidx.compose.ui.semantics.NodeLocationHolder$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SemanticsSort.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$a;", "", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "comparisonStrategy", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", ak.av, "()Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "b", "(Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;)V", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final ComparisonStrategy a() {
            return NodeLocationHolder.f16008g;
        }

        public final void b(@dl.d ComparisonStrategy comparisonStrategy) {
            f0.p(comparisonStrategy, "<set-?>");
            NodeLocationHolder.f16008g = comparisonStrategy;
        }
    }

    public NodeLocationHolder(@dl.d LayoutNode subtreeRoot, @dl.d LayoutNode node) {
        f0.p(subtreeRoot, "subtreeRoot");
        f0.p(node, "node");
        this.subtreeRoot = subtreeRoot;
        this.node = node;
        this.layoutDirection = subtreeRoot.getLayoutDirection();
        NodeCoordinator nodeCoordinatorY = subtreeRoot.Y();
        NodeCoordinator nodeCoordinatorA = s.a(node);
        b1.i iVarC = null;
        if (nodeCoordinatorY.p() && nodeCoordinatorA.p()) {
            iVarC = androidx.compose.ui.layout.p.c(nodeCoordinatorY, nodeCoordinatorA, false, 2, null);
        }
        this.f16011d = iVarC;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(@dl.d NodeLocationHolder other) {
        f0.p(other, "other");
        b1.i iVar = this.f16011d;
        if (iVar == null) {
            return 1;
        }
        if (other.f16011d == null) {
            return -1;
        }
        if (f16008g == ComparisonStrategy.Stripe) {
            if (iVar.j() - other.f16011d.getF30372b() <= 0.0f) {
                return -1;
            }
            if (this.f16011d.getF30372b() - other.f16011d.j() >= 0.0f) {
                return 1;
            }
        }
        if (this.layoutDirection == LayoutDirection.Ltr) {
            float fT = this.f16011d.t() - other.f16011d.t();
            if (!(fT == 0.0f)) {
                return fT < 0.0f ? -1 : 1;
            }
        } else {
            float fX = this.f16011d.x() - other.f16011d.x();
            if (!(fX == 0.0f)) {
                return fX < 0.0f ? 1 : -1;
            }
        }
        float f30372b = this.f16011d.getF30372b() - other.f16011d.getF30372b();
        if (!(f30372b == 0.0f)) {
            return f30372b < 0.0f ? -1 : 1;
        }
        final b1.i iVarB = androidx.compose.ui.layout.r.b(s.a(this.node));
        final b1.i iVarB2 = androidx.compose.ui.layout.r.b(s.a(other.node));
        LayoutNode layoutNodeB = s.b(this.node, new yh.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child1$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d LayoutNode it) {
                f0.p(it, "it");
                NodeCoordinator nodeCoordinatorA = s.a(it);
                return Boolean.valueOf(nodeCoordinatorA.p() && !f0.g(iVarB, androidx.compose.ui.layout.r.b(nodeCoordinatorA)));
            }
        });
        LayoutNode layoutNodeB2 = s.b(other.node, new yh.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child2$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d LayoutNode it) {
                f0.p(it, "it");
                NodeCoordinator nodeCoordinatorA = s.a(it);
                return Boolean.valueOf(nodeCoordinatorA.p() && !f0.g(iVarB2, androidx.compose.ui.layout.r.b(nodeCoordinatorA)));
            }
        });
        if (layoutNodeB != null && layoutNodeB2 != null) {
            return new NodeLocationHolder(this.subtreeRoot, layoutNodeB).compareTo(new NodeLocationHolder(other.subtreeRoot, layoutNodeB2));
        }
        if (layoutNodeB != null) {
            return 1;
        }
        if (layoutNodeB2 != null) {
            return -1;
        }
        int iCompare = LayoutNode.INSTANCE.c().compare(this.node, other.node);
        return iCompare != 0 ? -iCompare : this.node.getSemanticsId() - other.node.getSemanticsId();
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final LayoutNode getNode() {
        return this.node;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final LayoutNode getSubtreeRoot() {
        return this.subtreeRoot;
    }
}

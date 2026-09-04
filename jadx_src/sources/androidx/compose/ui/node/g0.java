package androidx.compose.ui.node;

import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J!\u0010\t\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/g0;", "Landroidx/compose/ui/node/AlignmentLines;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "i", "Lb1/f;", CommonNetImpl.POSITION, "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "", "e", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Landroidx/compose/ui/node/a;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/a;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class g0 extends AlignmentLines {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(@dl.d a alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
        kotlin.jvm.internal.f0.p(alignmentLinesOwner, "alignmentLinesOwner");
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected long d(@dl.d NodeCoordinator calculatePositionInParent, long j10) {
        kotlin.jvm.internal.f0.p(calculatePositionInParent, "$this$calculatePositionInParent");
        i0 lookaheadDelegate = calculatePositionInParent.getLookaheadDelegate();
        kotlin.jvm.internal.f0.m(lookaheadDelegate);
        long j11 = lookaheadDelegate.getCom.umeng.socialize.net.dplus.CommonNetImpl.POSITION java.lang.String();
        return b1.f.v(b1.g.a(s1.n.m(j11), s1.n.o(j11)), j10);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    @dl.d
    protected Map<androidx.compose.ui.layout.a, Integer> e(@dl.d NodeCoordinator nodeCoordinator) {
        kotlin.jvm.internal.f0.p(nodeCoordinator, "<this>");
        i0 lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        kotlin.jvm.internal.f0.m(lookaheadDelegate);
        return lookaheadDelegate.d2().i();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected int i(@dl.d NodeCoordinator nodeCoordinator, @dl.d androidx.compose.ui.layout.a alignmentLine) {
        kotlin.jvm.internal.f0.p(nodeCoordinator, "<this>");
        kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
        i0 lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        kotlin.jvm.internal.f0.m(lookaheadDelegate);
        return lookaheadDelegate.v(alignmentLine);
    }
}

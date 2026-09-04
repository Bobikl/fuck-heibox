package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeCoordinator;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: LookaheadLayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b6\u00107J%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\tJ%\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0002R\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010$R\u001d\u0010)\u001a\u00020&8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0014\u00105\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/ui/layout/b0;", "Landroidx/compose/ui/layout/a0;", "sourceCoordinates", "Lb1/f;", "relativeToSource", "F0", "(Landroidx/compose/ui/layout/a0;J)J", "relativeToWindow", "i0", "(J)J", "relativeToLocal", RXScreenCaptureService.KEY_WIDTH, "L", "Landroidx/compose/ui/layout/q;", "a0", "(Landroidx/compose/ui/layout/q;J)J", "", "clipBounds", "Lb1/i;", "x", "Landroidx/compose/ui/graphics/c1;", "matrix", "Lkotlin/b2;", "s0", "(Landroidx/compose/ui/layout/q;[F)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "v", "Landroidx/compose/ui/node/i0;", "b", "Landroidx/compose/ui/node/i0;", ak.aF, "()Landroidx/compose/ui/node/i0;", "lookaheadDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Ls1/r;", ak.av, "()J", UiKitSpanObj.TYPE_SIZE, "", "A1", "()Ljava/util/Set;", "providedAlignmentLines", "D", "()Landroidx/compose/ui/layout/q;", "parentLayoutCoordinates", "c0", "parentCoordinates", "p", "()Z", "isAttached", "<init>", "(Landroidx/compose/ui/node/i0;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b0 implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.node.i0 lookaheadDelegate;

    public b0(@dl.d androidx.compose.ui.node.i0 lookaheadDelegate) {
        kotlin.jvm.internal.f0.p(lookaheadDelegate, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.q
    @dl.d
    public Set<a> A1() {
        return b().A1();
    }

    @Override // androidx.compose.ui.layout.q
    @dl.e
    public q D() {
        return b().D();
    }

    @Override // androidx.compose.ui.layout.a0
    public long F0(@dl.d a0 sourceCoordinates, long relativeToSource) {
        kotlin.jvm.internal.f0.p(sourceCoordinates, "sourceCoordinates");
        androidx.compose.ui.node.i0 i0Var = ((b0) sourceCoordinates).lookaheadDelegate;
        androidx.compose.ui.node.i0 lookaheadDelegate = b().J2(i0Var.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            long jV2 = i0Var.v2(lookaheadDelegate);
            long jA = s1.o.a(di.d.L0(b1.f.p(relativeToSource)), di.d.L0(b1.f.r(relativeToSource)));
            long jA2 = s1.o.a(s1.n.m(jV2) + s1.n.m(jA), s1.n.o(jV2) + s1.n.o(jA));
            long jV3 = this.lookaheadDelegate.v2(lookaheadDelegate);
            long jA3 = s1.o.a(s1.n.m(jA2) - s1.n.m(jV3), s1.n.o(jA2) - s1.n.o(jV3));
            return b1.g.a(s1.n.m(jA3), s1.n.o(jA3));
        }
        androidx.compose.ui.node.i0 i0VarB = c0.b(i0Var);
        long jV4 = i0Var.v2(i0VarB);
        long position = i0VarB.getCom.umeng.socialize.net.dplus.CommonNetImpl.POSITION java.lang.String();
        long jA4 = s1.o.a(s1.n.m(jV4) + s1.n.m(position), s1.n.o(jV4) + s1.n.o(position));
        long jA5 = s1.o.a(di.d.L0(b1.f.p(relativeToSource)), di.d.L0(b1.f.r(relativeToSource)));
        long jA6 = s1.o.a(s1.n.m(jA4) + s1.n.m(jA5), s1.n.o(jA4) + s1.n.o(jA5));
        androidx.compose.ui.node.i0 i0Var2 = this.lookaheadDelegate;
        long jV5 = i0Var2.v2(c0.b(i0Var2));
        long position2 = c0.b(i0Var2).getCom.umeng.socialize.net.dplus.CommonNetImpl.POSITION java.lang.String();
        long jA7 = s1.o.a(s1.n.m(jV5) + s1.n.m(position2), s1.n.o(jV5) + s1.n.o(position2));
        long jA8 = s1.o.a(s1.n.m(jA6) - s1.n.m(jA7), s1.n.o(jA6) - s1.n.o(jA7));
        NodeCoordinator wrappedBy = c0.b(this.lookaheadDelegate).getCoordinator().getWrappedBy();
        kotlin.jvm.internal.f0.m(wrappedBy);
        NodeCoordinator wrappedBy2 = i0VarB.getCoordinator().getWrappedBy();
        kotlin.jvm.internal.f0.m(wrappedBy2);
        return wrappedBy.a0(wrappedBy2, b1.g.a(s1.n.m(jA8), s1.n.o(jA8)));
    }

    @Override // androidx.compose.ui.layout.q
    public long L(long relativeToLocal) {
        return b().L(relativeToLocal);
    }

    @Override // androidx.compose.ui.layout.q
    public long a() {
        return b().a();
    }

    @Override // androidx.compose.ui.layout.q
    public long a0(@dl.d q sourceCoordinates, long relativeToSource) {
        kotlin.jvm.internal.f0.p(sourceCoordinates, "sourceCoordinates");
        return b().a0(sourceCoordinates, relativeToSource);
    }

    @dl.d
    public final NodeCoordinator b() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.node.i0 getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.q
    @dl.e
    public q c0() {
        return b().c0();
    }

    @Override // androidx.compose.ui.layout.q
    public long i0(long relativeToWindow) {
        return b().i0(relativeToWindow);
    }

    @Override // androidx.compose.ui.layout.q
    public boolean p() {
        return b().p();
    }

    @Override // androidx.compose.ui.layout.q
    public void s0(@dl.d q sourceCoordinates, @dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(sourceCoordinates, "sourceCoordinates");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        b().s0(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.ui.layout.q
    public int v(@dl.d a alignmentLine) {
        kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
        return b().v(alignmentLine);
    }

    @Override // androidx.compose.ui.layout.q
    public long w(long relativeToLocal) {
        return b().w(relativeToLocal);
    }

    @Override // androidx.compose.ui.layout.q
    @dl.d
    public b1.i x(@dl.d q sourceCoordinates, boolean clipBounds) {
        kotlin.jvm.internal.f0.p(sourceCoordinates, "sourceCoordinates");
        return b().x(sourceCoordinates, clipBounds);
    }
}

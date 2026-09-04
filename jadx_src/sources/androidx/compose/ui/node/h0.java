package androidx.compose.ui.node;

import androidx.compose.ui.layout.t1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Map;
import kotlin.Metadata;
import s1.DpRect;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b4\u0010\nJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u000f\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\f\u0010\f\u001a\u00020\b*\u00020\u000bH\u0004R\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001d\u0010\u001c\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8 X \u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/layout/e1;", "Landroidx/compose/ui/node/l0;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "v", "Y1", "Lkotlin/b2;", "j2", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "g2", "", "g", "Z", "i2", "()Z", "l2", "(Z)V", "isShallowPlacing", RXScreenCaptureService.KEY_HEIGHT, "h2", "k2", "isPlacingForAlignment", "Ls1/n;", "f2", "()J", CommonNetImpl.POSITION, "a2", "()Landroidx/compose/ui/node/h0;", "child", "e2", "parent", "c2", "hasMeasureResult", "Landroidx/compose/ui/node/LayoutNode;", "P0", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/q;", "b2", "()Landroidx/compose/ui/layout/q;", "coordinates", "Landroidx/compose/ui/layout/j0;", "d2", "()Landroidx/compose/ui/layout/j0;", "measureResult", "Landroidx/compose/ui/node/a;", "Z1", "()Landroidx/compose/ui/node/a;", "alignmentLinesOwner", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class h0 extends androidx.compose.ui.layout.e1 implements l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isShallowPlacing;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacingForAlignment;

    @Override // s1.e
    public /* synthetic */ float E(int i10) {
        return s1.d.e(this, i10);
    }

    @Override // s1.e
    public /* synthetic */ float E1(float f10) {
        return s1.d.h(this, f10);
    }

    @Override // s1.e
    public /* synthetic */ float F(float f10) {
        return s1.d.d(this, f10);
    }

    @Override // s1.e
    public /* synthetic */ long J(long j10) {
        return s1.d.j(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ int J1(long j10) {
        return s1.d.a(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ long M(float f10) {
        return s1.d.k(this, f10);
    }

    @dl.d
    /* JADX INFO: renamed from: P0 */
    public abstract LayoutNode getLayoutNode();

    public abstract int Y1(@dl.d androidx.compose.ui.layout.a alignmentLine);

    @dl.d
    public abstract a Z1();

    @dl.e
    public abstract h0 a2();

    @dl.d
    public abstract androidx.compose.ui.layout.q b2();

    public abstract boolean c2();

    @dl.d
    public abstract androidx.compose.ui.layout.j0 d2();

    @Override // s1.e
    public /* synthetic */ int e1(float f10) {
        return s1.d.b(this, f10);
    }

    @dl.e
    public abstract h0 e2();

    /* JADX INFO: renamed from: f2 */
    public abstract long getPosition();

    protected final void g2(@dl.d NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLinesI;
        kotlin.jvm.internal.f0.p(nodeCoordinator, "<this>");
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (!kotlin.jvm.internal.f0.g(wrapped != null ? wrapped.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.Z1().i().q();
            return;
        }
        a aVarG0 = nodeCoordinator.Z1().g0();
        if (aVarG0 == null || (alignmentLinesI = aVarG0.i()) == null) {
            return;
        }
        alignmentLinesI.q();
    }

    @Override // s1.e
    public /* synthetic */ b1.i h0(DpRect dpRect) {
        return s1.d.i(this, dpRect);
    }

    /* JADX INFO: renamed from: h2, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    /* JADX INFO: renamed from: i2, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public abstract void j2();

    @Override // s1.e
    public /* synthetic */ float k1(long j10) {
        return s1.d.g(this, j10);
    }

    public final void k2(boolean z10) {
        this.isPlacingForAlignment = z10;
    }

    public final void l2(boolean z10) {
        this.isShallowPlacing = z10;
    }

    @Override // s1.e
    public /* synthetic */ long n(long j10) {
        return s1.d.f(this, j10);
    }

    @Override // androidx.compose.ui.layout.l0
    public /* synthetic */ androidx.compose.ui.layout.j0 p1(int i10, int i11, Map map, yh.l lVar) {
        return androidx.compose.ui.layout.k0.a(this, i10, i11, map, lVar);
    }

    @Override // s1.e
    public /* synthetic */ float q(long j10) {
        return s1.d.c(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ long r(int i10) {
        return s1.d.m(this, i10);
    }

    @Override // s1.e
    public /* synthetic */ long s(float f10) {
        return s1.d.l(this, f10);
    }

    @Override // androidx.compose.ui.layout.n0
    public final int v(@dl.d androidx.compose.ui.layout.a alignmentLine) {
        int iY1;
        kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
        if (c2() && (iY1 = Y1(alignmentLine)) != Integer.MIN_VALUE) {
            return iY1 + (alignmentLine instanceof t1 ? s1.n.m(P1()) : s1.n.o(P1()));
        }
        return Integer.MIN_VALUE;
    }
}

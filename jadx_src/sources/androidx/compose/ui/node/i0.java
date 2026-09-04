package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00102\u001a\u00020-¢\u0006\u0004\br\u0010sJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ@\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f¢\u0006\u0002\b\u0011H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\bH\u0014J/\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0016J \u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0000H\u0000ø\u0001\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R+\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR(\u0010H\u001a\u0004\u0018\u00010\u00192\b\u0010C\u001a\u0004\u0018\u00010\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005098\u0004X\u0084\u0004¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010KR\u0016\u0010O\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020\u00198PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u0016\u0010a\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010NR\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0016\u0010q\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\u0082\u0002\u0016\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/ui/node/i0;", "Landroidx/compose/ui/layout/g0;", "Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "o2", "(Landroidx/compose/ui/layout/a;)I", "Lkotlin/b2;", "j2", "()V", "Ls1/n;", CommonNetImpl.POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/t;", "layerBlock", "U1", "(JFLyh/l;)V", "u2", "Ls1/b;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/j0;", "block", "Landroidx/compose/ui/layout/e1;", "t2", "(JLyh/a;)Landroidx/compose/ui/layout/e1;", "height", "l1", "w1", "width", "L0", androidx.exifinterface.media.a.X4, "ancestor", "v2", "(Landroidx/compose/ui/node/i0;)J", "Landroidx/compose/ui/node/NodeCoordinator;", "i", "Landroidx/compose/ui/node/NodeCoordinator;", "q2", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/layout/f0;", "j", "Landroidx/compose/ui/layout/f0;", "s2", "()Landroidx/compose/ui/layout/f0;", "lookaheadScope", "k", "J", "f2", "()J", "w2", "(J)V", "", "l", "Ljava/util/Map;", "oldAlignmentLines", "Landroidx/compose/ui/layout/b0;", "m", "Landroidx/compose/ui/layout/b0;", "r2", "()Landroidx/compose/ui/layout/b0;", "lookaheadLayoutCoordinates", "result", "n", "Landroidx/compose/ui/layout/j0;", "x2", "(Landroidx/compose/ui/layout/j0;)V", "_measureResult", "o", "p2", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "a2", "()Landroidx/compose/ui/node/h0;", "child", "", "c2", "()Z", "hasMeasureResult", "d2", "()Landroidx/compose/ui/layout/j0;", "measureResult", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "C1", "fontScale", "e2", "parent", "Landroidx/compose/ui/node/LayoutNode;", "P0", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/q;", "b2", "()Landroidx/compose/ui/layout/q;", "coordinates", "Landroidx/compose/ui/node/a;", "Z1", "()Landroidx/compose/ui/node/a;", "alignmentLinesOwner", "", "b", "()Ljava/lang/Object;", "parentData", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/f0;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class i0 extends h0 implements androidx.compose.ui.layout.g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final NodeCoordinator coordinator;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.layout.f0 lookaheadScope;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long position;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Map<androidx.compose.ui.layout.a, Integer> oldAlignmentLines;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.layout.b0 lookaheadLayoutCoordinates;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.j0 _measureResult;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<androidx.compose.ui.layout.a, Integer> cachedAlignmentLinesMap;

    public i0(@dl.d NodeCoordinator coordinator, @dl.d androidx.compose.ui.layout.f0 lookaheadScope) {
        kotlin.jvm.internal.f0.p(coordinator, "coordinator");
        kotlin.jvm.internal.f0.p(lookaheadScope, "lookaheadScope");
        this.coordinator = coordinator;
        this.lookaheadScope = lookaheadScope;
        this.position = s1.n.f139237b.a();
        this.lookaheadLayoutCoordinates = new androidx.compose.ui.layout.b0(this);
        this.cachedAlignmentLinesMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(androidx.compose.ui.layout.j0 j0Var) {
        b2 b2Var;
        if (j0Var != null) {
            W1(s1.s.a(j0Var.getWidth(), j0Var.getHeight()));
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            W1(s1.r.f139246b.a());
        }
        if (!kotlin.jvm.internal.f0.g(this._measureResult, j0Var) && j0Var != null) {
            Map<androidx.compose.ui.layout.a, Integer> map = this.oldAlignmentLines;
            if ((!(map == null || map.isEmpty()) || (!j0Var.i().isEmpty())) && !kotlin.jvm.internal.f0.g(j0Var.i(), this.oldAlignmentLines)) {
                Z1().getAlignmentLines().q();
                Map linkedHashMap = this.oldAlignmentLines;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.oldAlignmentLines = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(j0Var.i());
            }
        }
        this._measureResult = j0Var;
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return this.coordinator.getF139218c();
    }

    @Override // androidx.compose.ui.layout.m
    public int L0(int width) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.f0.m(wrapped);
        i0 lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.f0.m(lookaheadDelegate);
        return lookaheadDelegate.L0(width);
    }

    @Override // androidx.compose.ui.node.h0, androidx.compose.ui.node.l0
    @dl.d
    /* JADX INFO: renamed from: P0 */
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.e1
    public final void U1(long position, float zIndex, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
        if (!s1.n.j(getCom.umeng.socialize.net.dplus.CommonNetImpl.POSITION java.lang.String(), position)) {
            w2(position);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateW = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (lookaheadPassDelegateW != null) {
                lookaheadPassDelegateW.h2();
            }
            g2(this.coordinator);
        }
        if (getIsShallowPlacing()) {
            return;
        }
        u2();
    }

    @Override // androidx.compose.ui.layout.m
    public int V(int width) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.f0.m(wrapped);
        i0 lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.f0.m(lookaheadDelegate);
        return lookaheadDelegate.V(width);
    }

    @Override // androidx.compose.ui.node.h0
    @dl.d
    public a Z1() {
        a aVarT = this.coordinator.getLayoutNode().getLayoutDelegate().t();
        kotlin.jvm.internal.f0.m(aVarT);
        return aVarT;
    }

    @Override // androidx.compose.ui.node.h0
    @dl.e
    public h0 a2() {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.n0
    @dl.e
    /* JADX INFO: renamed from: b */
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.node.h0
    @dl.d
    public androidx.compose.ui.layout.q b2() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.h0
    public boolean c2() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.node.h0
    @dl.d
    public androidx.compose.ui.layout.j0 d2() {
        androidx.compose.ui.layout.j0 j0Var = this._measureResult;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // androidx.compose.ui.node.h0
    @dl.e
    public h0 e2() {
        NodeCoordinator wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.h0
    /* JADX INFO: renamed from: f2, reason: from getter */
    public long getCom.umeng.socialize.net.dplus.CommonNetImpl.POSITION java.lang.String() {
        return this.position;
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return this.coordinator.getF139217b();
    }

    @Override // androidx.compose.ui.layout.n
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.h0
    public void j2() {
        U1(getCom.umeng.socialize.net.dplus.CommonNetImpl.POSITION java.lang.String(), 0.0f, null);
    }

    @Override // androidx.compose.ui.layout.m
    public int l1(int height) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.f0.m(wrapped);
        i0 lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.f0.m(lookaheadDelegate);
        return lookaheadDelegate.l1(height);
    }

    public final int o2(@dl.d androidx.compose.ui.layout.a alignmentLine) {
        kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @dl.d
    protected final Map<androidx.compose.ui.layout.a, Integer> p2() {
        return this.cachedAlignmentLinesMap;
    }

    @dl.d
    /* JADX INFO: renamed from: q2, reason: from getter */
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @dl.d
    /* JADX INFO: renamed from: r2, reason: from getter */
    public final androidx.compose.ui.layout.b0 getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @dl.d
    /* JADX INFO: renamed from: s2, reason: from getter */
    public final androidx.compose.ui.layout.f0 getLookaheadScope() {
        return this.lookaheadScope;
    }

    @dl.d
    public final androidx.compose.ui.layout.e1 t2(long constraints, @dl.d yh.a<? extends androidx.compose.ui.layout.j0> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        X1(constraints);
        x2(block.invoke());
        return this;
    }

    protected void u2() {
        androidx.compose.ui.layout.e1.a.Companion companion = androidx.compose.ui.layout.e1.a.INSTANCE;
        int width = d2().getWidth();
        LayoutDirection layoutDirection = this.coordinator.getLayoutDirection();
        androidx.compose.ui.layout.q qVar = androidx.compose.ui.layout.e1.a.f15015e;
        int iN = companion.n();
        LayoutDirection layoutDirectionM = companion.m();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = androidx.compose.ui.layout.e1.a.f15016f;
        androidx.compose.ui.layout.e1.a.f15014d = width;
        androidx.compose.ui.layout.e1.a.f15013c = layoutDirection;
        boolean zJ = companion.J(this);
        d2().k();
        k2(zJ);
        androidx.compose.ui.layout.e1.a.f15014d = iN;
        androidx.compose.ui.layout.e1.a.f15013c = layoutDirectionM;
        androidx.compose.ui.layout.e1.a.f15015e = qVar;
        androidx.compose.ui.layout.e1.a.f15016f = layoutNodeLayoutDelegate;
    }

    public final long v2(@dl.d i0 ancestor) {
        kotlin.jvm.internal.f0.p(ancestor, "ancestor");
        long jA = s1.n.f139237b.a();
        i0 lookaheadDelegate = this;
        while (!kotlin.jvm.internal.f0.g(lookaheadDelegate, ancestor)) {
            long position = lookaheadDelegate.getCom.umeng.socialize.net.dplus.CommonNetImpl.POSITION java.lang.String();
            jA = s1.o.a(s1.n.m(jA) + s1.n.m(position), s1.n.o(jA) + s1.n.o(position));
            NodeCoordinator wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            kotlin.jvm.internal.f0.m(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
        }
        return jA;
    }

    @Override // androidx.compose.ui.layout.m
    public int w1(int height) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.f0.m(wrapped);
        i0 lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.f0.m(lookaheadDelegate);
        return lookaheadDelegate.w1(height);
    }

    public void w2(long j10) {
        this.position = j10;
    }
}

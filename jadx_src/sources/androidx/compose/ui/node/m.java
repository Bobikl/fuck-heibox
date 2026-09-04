package androidx.compose.ui.node;

import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: InnerNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 <2\u00020\u0001:\u0002=>B\u000f\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J@\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u0019H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 H\u0016JS\u0010.\u001a\u00020\u0018\"\b\b\u0000\u0010$*\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010(\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/R \u00107\u001a\u0002008\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006?"}, d2 = {"Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/layout/f0;", "scope", "Landroidx/compose/ui/node/i0;", "D2", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/e1;", "z1", "(J)Landroidx/compose/ui/layout/e1;", "", "height", "l1", "width", "L0", "w1", androidx.exifinterface.media.a.X4, "Ls1/n;", CommonNetImpl.POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/b2;", "Lkotlin/t;", "layerBlock", "U1", "(JFLyh/l;)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Y1", "Landroidx/compose/ui/graphics/d0;", "canvas", "q3", "Landroidx/compose/ui/node/c;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/node/NodeCoordinator$d;", "hitTestSource", "Lb1/f;", "pointerPosition", "Landroidx/compose/ui/node/k;", "hitTestResult", "", "isTouchEvent", "isInLayer", "e3", "(Landroidx/compose/ui/node/NodeCoordinator$d;JLandroidx/compose/ui/node/k;ZZ)V", "Landroidx/compose/ui/n$d;", "K", "Landroidx/compose/ui/n$d;", "T2", "()Landroidx/compose/ui/n$d;", "getTail$annotations", "()V", "tail", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "L", ak.av, "b", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class m extends NodeCoordinator {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    private static final androidx.compose.ui.graphics.h1 M;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.n.d tail;

    /* JADX INFO: renamed from: androidx.compose.ui.node.m$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/m$a;", "", "Landroidx/compose/ui/graphics/h1;", "innerBoundsPaint", "Landroidx/compose/ui/graphics/h1;", ak.av, "()Landroidx/compose/ui/graphics/h1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.ui.graphics.h1 a() {
            return m.M;
        }
    }

    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/m$b;", "Landroidx/compose/ui/node/i0;", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/e1;", "z1", "(J)Landroidx/compose/ui/layout/e1;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "Y1", "Lkotlin/b2;", "u2", "height", "l1", "width", "L0", "w1", androidx.exifinterface.media.a.X4, "Landroidx/compose/ui/layout/f0;", "scope", "<init>", "(Landroidx/compose/ui/node/m;Landroidx/compose/ui/layout/f0;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class b extends i0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m f15346p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d m mVar, androidx.compose.ui.layout.f0 scope) {
            super(mVar, scope);
            kotlin.jvm.internal.f0.p(scope, "scope");
            this.f15346p = mVar;
        }

        @Override // androidx.compose.ui.node.i0, androidx.compose.ui.layout.m
        public int L0(int width) {
            return getLayoutNode().getIntrinsicsPolicy().j(width);
        }

        @Override // androidx.compose.ui.node.i0, androidx.compose.ui.layout.m
        public int V(int width) {
            return getLayoutNode().getIntrinsicsPolicy().e(width);
        }

        @Override // androidx.compose.ui.node.h0
        public int Y1(@dl.d androidx.compose.ui.layout.a alignmentLine) {
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            Integer num = Z1().h().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            p2().put(alignmentLine, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.i0, androidx.compose.ui.layout.m
        public int l1(int height) {
            return getLayoutNode().getIntrinsicsPolicy().k(height);
        }

        @Override // androidx.compose.ui.node.i0
        protected void u2() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateW = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            kotlin.jvm.internal.f0.m(lookaheadPassDelegateW);
            lookaheadPassDelegateW.k2();
            Z1().I0();
        }

        @Override // androidx.compose.ui.node.i0, androidx.compose.ui.layout.m
        public int w1(int height) {
            return getLayoutNode().getIntrinsicsPolicy().f(height);
        }

        @Override // androidx.compose.ui.layout.g0
        @dl.d
        public androidx.compose.ui.layout.e1 z1(long constraints) {
            X1(constraints);
            androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = getLayoutNode().B0();
            int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i10 > 0) {
                int i11 = 0;
                LayoutNode[] layoutNodeArrG = eVarB0.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    layoutNodeArrG[i11].A1(LayoutNode.UsageByParent.NotUsed);
                    i11++;
                } while (i11 < i10);
            }
            x2(getLayoutNode().getMeasurePolicy().a(this, getLayoutNode().T(), constraints));
            return this;
        }
    }

    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/node/m$c", "Landroidx/compose/ui/n$d;", "", "toString", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends androidx.compose.ui.n.d {
        c() {
        }

        @dl.d
        public String toString() {
            return "<tail>";
        }
    }

    static {
        androidx.compose.ui.graphics.h1 h1VarA = androidx.compose.ui.graphics.i.a();
        h1VarA.i(androidx.compose.ui.graphics.l0.INSTANCE.q());
        h1VarA.q(1.0f);
        h1VarA.p(androidx.compose.ui.graphics.j1.INSTANCE.b());
        M = h1VarA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@dl.d LayoutNode layoutNode) {
        super(layoutNode);
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.tail = new c();
        getTail().O(this);
    }

    public static /* synthetic */ void Q3() {
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @dl.d
    public i0 D2(@dl.d androidx.compose.ui.layout.f0 scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        return new b(this, scope);
    }

    @Override // androidx.compose.ui.layout.m
    public int L0(int width) {
        return getLayoutNode().getIntrinsicsPolicy().h(width);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @dl.d
    /* JADX INFO: renamed from: T2, reason: from getter */
    public androidx.compose.ui.n.d getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.e1
    protected void U1(long position, float zIndex, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
        super.U1(position, zIndex, layerBlock);
        if (getIsShallowPlacing()) {
            return;
        }
        p3();
        getLayoutNode().a1();
    }

    @Override // androidx.compose.ui.layout.m
    public int V(int width) {
        return getLayoutNode().getIntrinsicsPolicy().c(width);
    }

    @Override // androidx.compose.ui.node.h0
    public int Y1(@dl.d androidx.compose.ui.layout.a alignmentLine) {
        kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
        i0 lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.Y1(alignmentLine);
        }
        Integer num = Z1().h().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.node.NodeCoordinator
    public <T extends androidx.compose.ui.node.c> void e3(@dl.d NodeCoordinator.d<T> hitTestSource, long pointerPosition, @dl.d k<T> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        boolean z10;
        boolean z11;
        LayoutNode[] layoutNodeArr;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.f0.p(hitTestSource, "hitTestSource");
        kotlin.jvm.internal.f0.p(hitTestResult, "hitTestResult");
        if (hitTestSource.d(getLayoutNode())) {
            if (O3(pointerPosition)) {
                z10 = isInLayer;
            } else {
                if (isTouchEvent) {
                    float fF2 = F2(pointerPosition, Q2());
                    if ((Float.isInfinite(fF2) || Float.isNaN(fF2)) ? false : true) {
                        z10 = false;
                    }
                }
                z10 = isInLayer;
                z11 = false;
            }
            z11 = true;
        } else {
            z10 = isInLayer;
            z11 = false;
        }
        if (z11) {
            int i10 = ((k) hitTestResult).hitDepth;
            androidx.compose.runtime.collection.e<LayoutNode> eVarZ0 = getLayoutNode().z0();
            int i11 = eVarZ0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i11 > 0) {
                LayoutNode[] layoutNodeArrG = eVarZ0.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i12 = i11 - 1;
                while (true) {
                    LayoutNode layoutNode = layoutNodeArrG[i12];
                    if (layoutNode.getIsPlaced()) {
                        layoutNodeArr = layoutNodeArrG;
                        hitTestSource.b(layoutNode, pointerPosition, hitTestResult, isTouchEvent, z10);
                        if (!hitTestResult.l()) {
                            z13 = true;
                        } else if (layoutNode.t0().B3()) {
                            hitTestResult.a();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            z12 = true;
                        }
                        if (!!z12 || (i12 = i12 - 1) < 0) {
                            break;
                        } else {
                            layoutNodeArrG = layoutNodeArr;
                        }
                    } else {
                        layoutNodeArr = layoutNodeArrG;
                    }
                    z12 = false;
                    if (!z12) {
                        break;
                    }
                    break;
                    break;
                }
            }
            ((k) hitTestResult).hitDepth = i10;
        }
    }

    @Override // androidx.compose.ui.layout.m
    public int l1(int height) {
        return getLayoutNode().getIntrinsicsPolicy().i(height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void q3(@dl.d androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        b1 b1VarB = d0.b(getLayoutNode());
        androidx.compose.runtime.collection.e<LayoutNode> eVarZ0 = getLayoutNode().z0();
        int i10 = eVarZ0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            LayoutNode[] layoutNodeArrG = eVarZ0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = layoutNodeArrG[i11];
                if (layoutNode.getIsPlaced()) {
                    layoutNode.L(canvas);
                }
                i11++;
            } while (i11 < i10);
        }
        if (b1VarB.getShowLayoutBounds()) {
            H2(canvas, M);
        }
    }

    @Override // androidx.compose.ui.layout.m
    public int w1(int height) {
        return getLayoutNode().getIntrinsicsPolicy().d(height);
    }

    @Override // androidx.compose.ui.layout.g0
    @dl.d
    public androidx.compose.ui.layout.e1 z1(long constraints) {
        X1(constraints);
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = getLayoutNode().B0();
        int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                layoutNodeArrG[i11].z1(LayoutNode.UsageByParent.NotUsed);
                i11++;
            } while (i11 < i10);
        }
        w3(getLayoutNode().getMeasurePolicy().a(this, getLayoutNode().U(), constraints));
        o3();
        return this;
    }
}

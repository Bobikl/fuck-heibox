package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;

/* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\bL\u0010MJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0082\bJ\b\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0006J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0006J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0006J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u001b\u001a\u00020\u00062\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fJ\u0006\u0010\u001c\u001a\u00020\nJ#\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010$\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0002R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R$\u0010<\u001a\u0002072\u0006\u00108\u001a\u0002078F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0016\u0010B\u001a\u0004\u0018\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0018\u0010F\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010DR\u0018\u0010H\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010DR\u0011\u0010K\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006N"}, d2 = {"Landroidx/compose/ui/node/j0;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Ls1/b;", "constraints", "", "f", "(Landroidx/compose/ui/node/LayoutNode;Ls1/b;)Z", "g", "Lkotlin/b2;", "t", "Lkotlin/Function0;", "block", ak.aB, ak.aF, "v", RXScreenCaptureService.KEY_WIDTH, "G", "(J)V", "forced", ak.aD, androidx.exifinterface.media.a.S4, "x", "C", "B", "onLayout", "n", "q", "p", "(Landroidx/compose/ui/node/LayoutNode;J)V", "Landroidx/compose/ui/node/b1$b;", com.google.android.gms.common.internal.s.a.f52543a, ak.aG, RXScreenCaptureService.KEY_HEIGHT, "forceDispatch", "d", "node", "r", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/DepthSortedSet;", "b", "Landroidx/compose/ui/node/DepthSortedSet;", "relayoutNodes", "Z", "duringMeasureLayout", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/node/y0;", "onPositionedDispatcher", "Landroidx/compose/runtime/collection/e;", "e", "Landroidx/compose/runtime/collection/e;", "onLayoutCompletedListeners", "", "<set-?>", "J", "m", "()J", "measureIteration", "Landroidx/compose/ui/node/j0$a;", "postponedMeasureRequests", "Landroidx/compose/ui/node/f0;", "i", "Landroidx/compose/ui/node/f0;", "consistencyChecker", "l", "(Landroidx/compose/ui/node/LayoutNode;)Z", "measureAffectsParent", "canAffectParent", "j", "canAffectParentInLookahead", "k", "()Z", "hasPendingMeasureOrLayout", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final DepthSortedSet relayoutNodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean duringMeasureLayout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final y0 onPositionedDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<b1.b> onLayoutCompletedListeners;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long measureIteration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<a> postponedMeasureRequests;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private s1.b f15327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final f0 consistencyChecker;

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/j0$a;", "", "Landroidx/compose/ui/node/LayoutNode;", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "node", "", "b", "Z", ak.aF, "()Z", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f15329d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final LayoutNode node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isLookahead;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isForced;

        public a(@dl.d LayoutNode node, boolean z10, boolean z11) {
            kotlin.jvm.internal.f0.p(node, "node");
            this.node = node;
            this.isLookahead = z10;
            this.isForced = z11;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final LayoutNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15333a;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            f15333a = iArr;
        }
    }

    public j0(@dl.d LayoutNode root) {
        kotlin.jvm.internal.f0.p(root, "root");
        this.root = root;
        b1.Companion companion = b1.INSTANCE;
        DepthSortedSet depthSortedSet = new DepthSortedSet(companion.a());
        this.relayoutNodes = depthSortedSet;
        this.onPositionedDispatcher = new y0();
        this.onLayoutCompletedListeners = new androidx.compose.runtime.collection.e<>(new b1.b[16], 0);
        this.measureIteration = 1L;
        androidx.compose.runtime.collection.e<a> eVar = new androidx.compose.runtime.collection.e<>(new a[16], 0);
        this.postponedMeasureRequests = eVar;
        this.consistencyChecker = companion.a() ? new f0(root, depthSortedSet, eVar.l()) : null;
    }

    public static /* synthetic */ boolean A(j0 j0Var, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j0Var.z(layoutNode, z10);
    }

    public static /* synthetic */ boolean D(j0 j0Var, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j0Var.C(layoutNode, z10);
    }

    public static /* synthetic */ boolean F(j0 j0Var, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j0Var.E(layoutNode, z10);
    }

    private final void c() {
        androidx.compose.runtime.collection.e<b1.b> eVar = this.onLayoutCompletedListeners;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            b1.b[] bVarArrG = eVar.G();
            kotlin.jvm.internal.f0.n(bVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                bVarArrG[i11].n();
                i11++;
            } while (i11 < i10);
        }
        this.onLayoutCompletedListeners.m();
    }

    public static /* synthetic */ void e(j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        j0Var.d(z10);
    }

    private final boolean f(LayoutNode layoutNode, s1.b constraints) {
        if (layoutNode.getMLookaheadScope() == null) {
            return false;
        }
        boolean zO0 = constraints != null ? layoutNode.O0(constraints) : LayoutNode.P0(layoutNode, null, 1, null);
        LayoutNode layoutNodeV0 = layoutNode.v0();
        if (zO0 && layoutNodeV0 != null) {
            if (layoutNodeV0.getMLookaheadScope() == null) {
                F(this, layoutNodeV0, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead() == LayoutNode.UsageByParent.InMeasureBlock) {
                A(this, layoutNodeV0, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead() == LayoutNode.UsageByParent.InLayoutBlock) {
                y(this, layoutNodeV0, false, 2, null);
            }
        }
        return zO0;
    }

    private final boolean g(LayoutNode layoutNode, s1.b constraints) {
        boolean zE1 = constraints != null ? layoutNode.e1(constraints) : LayoutNode.f1(layoutNode, null, 1, null);
        LayoutNode layoutNodeV0 = layoutNode.v0();
        if (zE1 && layoutNodeV0 != null) {
            if (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock) {
                F(this, layoutNodeV0, false, 2, null);
            } else if (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InLayoutBlock) {
                D(this, layoutNodeV0, false, 2, null);
            }
        }
        return zE1;
    }

    private final boolean i(LayoutNode layoutNode) {
        return layoutNode.m0() && l(layoutNode);
    }

    private final boolean j(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (layoutNode.g0()) {
            if (layoutNode.getMeasuredByParentInLookahead() == LayoutNode.UsageByParent.InMeasureBlock) {
                return true;
            }
            androidx.compose.ui.node.a aVarT = layoutNode.getLayoutDelegate().t();
            if ((aVarT == null || (alignmentLines = aVarT.getAlignmentLines()) == null || !alignmentLines.l()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private final boolean l(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate().l().getAlignmentLines().l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean o(j0 j0Var, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        return j0Var.n(aVar);
    }

    private final void s(yh.a<b2> aVar) {
        if (!this.root.p()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f15327h != null) {
            this.duringMeasureLayout = true;
            try {
                aVar.invoke();
                kotlin.jvm.internal.c0.d(1);
                this.duringMeasureLayout = false;
                kotlin.jvm.internal.c0.c(1);
                f0 f0Var = this.consistencyChecker;
                if (f0Var != null) {
                    f0Var.a();
                }
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                this.duringMeasureLayout = false;
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }
    }

    private final void t(LayoutNode layoutNode) {
        w(layoutNode);
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = layoutNode.B0();
        int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode2 = layoutNodeArrG[i11];
                if (l(layoutNode2)) {
                    t(layoutNode2);
                }
                i11++;
            } while (i11 < i10);
        }
        w(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v(LayoutNode layoutNode) {
        s1.b bVar;
        boolean zF;
        boolean zG;
        int i10 = 0;
        if (!layoutNode.getIsPlaced() && !i(layoutNode) && !kotlin.jvm.internal.f0.g(layoutNode.N0(), Boolean.TRUE) && !j(layoutNode) && !layoutNode.Q()) {
            return false;
        }
        if (layoutNode.h0() || layoutNode.m0()) {
            if (layoutNode == this.root) {
                bVar = this.f15327h;
                kotlin.jvm.internal.f0.m(bVar);
            } else {
                bVar = null;
            }
            zF = layoutNode.h0() ? f(layoutNode, bVar) : false;
            zG = g(layoutNode, bVar);
        } else {
            zG = false;
            zF = false;
        }
        if ((zF || layoutNode.g0()) && kotlin.jvm.internal.f0.g(layoutNode.N0(), Boolean.TRUE)) {
            layoutNode.Q0();
        }
        if (layoutNode.e0() && layoutNode.getIsPlaced()) {
            if (layoutNode == this.root) {
                layoutNode.c1(0, 0);
            } else {
                layoutNode.i1();
            }
            this.onPositionedDispatcher.c(layoutNode);
            f0 f0Var = this.consistencyChecker;
            if (f0Var != null) {
                f0Var.a();
            }
        }
        if (this.postponedMeasureRequests.Q()) {
            androidx.compose.runtime.collection.e<a> eVar = this.postponedMeasureRequests;
            int i11 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i11 > 0) {
                a[] aVarArrG = eVar.G();
                kotlin.jvm.internal.f0.n(aVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    a aVar = aVarArrG[i10];
                    if (aVar.getNode().p()) {
                        if (aVar.getIsLookahead()) {
                            z(aVar.getNode(), aVar.getIsForced());
                        } else {
                            E(aVar.getNode(), aVar.getIsForced());
                        }
                    }
                    i10++;
                } while (i10 < i11);
            }
            this.postponedMeasureRequests.m();
        }
        return zG;
    }

    private final void w(LayoutNode layoutNode) {
        s1.b bVar;
        if (layoutNode.m0() || layoutNode.h0()) {
            if (layoutNode == this.root) {
                bVar = this.f15327h;
                kotlin.jvm.internal.f0.m(bVar);
            } else {
                bVar = null;
            }
            if (layoutNode.h0()) {
                f(layoutNode, bVar);
            }
            g(layoutNode, bVar);
        }
    }

    public static /* synthetic */ boolean y(j0 j0Var, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j0Var.x(layoutNode, z10);
    }

    public final void B(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.onPositionedDispatcher.c(layoutNode);
    }

    public final boolean C(@dl.d LayoutNode layoutNode, boolean forced) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        int i10 = b.f15333a[layoutNode.f0().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            f0 f0Var = this.consistencyChecker;
            if (f0Var != null) {
                f0Var.a();
            }
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (forced || !(layoutNode.m0() || layoutNode.e0())) {
                layoutNode.R0();
                if (layoutNode.getIsPlaced()) {
                    LayoutNode layoutNodeV0 = layoutNode.v0();
                    if (!(layoutNodeV0 != null && layoutNodeV0.e0())) {
                        if (!(layoutNodeV0 != null && layoutNodeV0.m0())) {
                            this.relayoutNodes.a(layoutNode);
                        }
                    }
                }
                if (!this.duringMeasureLayout) {
                    return true;
                }
            } else {
                f0 f0Var2 = this.consistencyChecker;
                if (f0Var2 != null) {
                    f0Var2.a();
                }
            }
        }
        return false;
    }

    public final boolean E(@dl.d LayoutNode layoutNode, boolean forced) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        int i10 = b.f15333a[layoutNode.f0().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                this.postponedMeasureRequests.b(new a(layoutNode, false, forced));
                f0 f0Var = this.consistencyChecker;
                if (f0Var != null) {
                    f0Var.a();
                }
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.m0() || forced) {
                    layoutNode.U0();
                    if (layoutNode.getIsPlaced() || i(layoutNode)) {
                        LayoutNode layoutNodeV0 = layoutNode.v0();
                        if (!(layoutNodeV0 != null && layoutNodeV0.m0())) {
                            this.relayoutNodes.a(layoutNode);
                        }
                    }
                    if (!this.duringMeasureLayout) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void G(long constraints) {
        s1.b bVar = this.f15327h;
        if (bVar == null ? false : s1.b.g(bVar.getF139216a(), constraints)) {
            return;
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f15327h = s1.b.b(constraints);
        this.root.U0();
        this.relayoutNodes.a(this.root);
    }

    public final void d(boolean z10) {
        if (z10) {
            this.onPositionedDispatcher.d(this.root);
        }
        this.onPositionedDispatcher.a();
    }

    public final void h(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        if (this.relayoutNodes.d()) {
            return;
        }
        if (!this.duringMeasureLayout) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(!layoutNode.m0())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = layoutNode.B0();
        int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode2 = layoutNodeArrG[i11];
                if (layoutNode2.m0() && this.relayoutNodes.h(layoutNode2)) {
                    v(layoutNode2);
                }
                if (!layoutNode2.m0()) {
                    h(layoutNode2);
                }
                i11++;
            } while (i11 < i10);
        }
        if (layoutNode.m0() && this.relayoutNodes.h(layoutNode)) {
            v(layoutNode);
        }
    }

    public final boolean k() {
        return !this.relayoutNodes.d();
    }

    public final long m() {
        if (this.duringMeasureLayout) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean n(@dl.e yh.a<b2> aVar) {
        boolean z10;
        if (!this.root.p()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        boolean z11 = false;
        if (this.f15327h != null) {
            this.duringMeasureLayout = true;
            try {
                if (!this.relayoutNodes.d()) {
                    DepthSortedSet depthSortedSet = this.relayoutNodes;
                    z10 = false;
                    while (!depthSortedSet.d()) {
                        LayoutNode layoutNodeF = depthSortedSet.f();
                        boolean zV = v(layoutNodeF);
                        if (layoutNodeF == this.root && zV) {
                            z10 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.duringMeasureLayout = false;
                f0 f0Var = this.consistencyChecker;
                if (f0Var != null) {
                    f0Var.a();
                }
                z11 = z10;
            } catch (Throwable th2) {
                this.duringMeasureLayout = false;
                throw th2;
            }
        }
        c();
        return z11;
    }

    public final void p(@dl.d LayoutNode layoutNode, long constraints) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        if (!(!kotlin.jvm.internal.f0.g(layoutNode, this.root))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.p()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f15327h != null) {
            this.duringMeasureLayout = true;
            try {
                this.relayoutNodes.h(layoutNode);
                boolean zF = f(layoutNode, s1.b.b(constraints));
                g(layoutNode, s1.b.b(constraints));
                if ((zF || layoutNode.g0()) && kotlin.jvm.internal.f0.g(layoutNode.N0(), Boolean.TRUE)) {
                    layoutNode.Q0();
                }
                if (layoutNode.e0() && layoutNode.getIsPlaced()) {
                    layoutNode.i1();
                    this.onPositionedDispatcher.c(layoutNode);
                }
                this.duringMeasureLayout = false;
                f0 f0Var = this.consistencyChecker;
                if (f0Var != null) {
                    f0Var.a();
                }
            } catch (Throwable th2) {
                this.duringMeasureLayout = false;
                throw th2;
            }
        }
        c();
    }

    public final void q() {
        if (!this.root.p()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f15327h != null) {
            this.duringMeasureLayout = true;
            try {
                t(this.root);
                this.duringMeasureLayout = false;
                f0 f0Var = this.consistencyChecker;
                if (f0Var != null) {
                    f0Var.a();
                }
            } catch (Throwable th2) {
                this.duringMeasureLayout = false;
                throw th2;
            }
        }
    }

    public final void r(@dl.d LayoutNode node) {
        kotlin.jvm.internal.f0.p(node, "node");
        this.relayoutNodes.h(node);
    }

    public final void u(@dl.d b1.b listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.onLayoutCompletedListeners.b(listener);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    public final boolean x(@dl.d LayoutNode layoutNode, boolean forced) {
        f0 f0Var;
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        int i10 = b.f15333a[layoutNode.f0().ordinal()];
        if (i10 == 1) {
            f0Var = this.consistencyChecker;
            if (f0Var != null) {
                f0Var.a();
            }
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    f0Var = this.consistencyChecker;
                    if (f0Var != null) {
                        f0Var.a();
                    }
                } else if (i10 != 4 && i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if ((layoutNode.h0() || layoutNode.g0()) && !forced) {
                f0 f0Var2 = this.consistencyChecker;
                if (f0Var2 != null) {
                    f0Var2.a();
                }
            } else {
                layoutNode.S0();
                layoutNode.R0();
                if (kotlin.jvm.internal.f0.g(layoutNode.N0(), Boolean.TRUE)) {
                    LayoutNode layoutNodeV0 = layoutNode.v0();
                    if (!(layoutNodeV0 != null && layoutNodeV0.h0())) {
                        if (!(layoutNodeV0 != null && layoutNodeV0.g0())) {
                            this.relayoutNodes.a(layoutNode);
                        }
                    }
                }
                if (!this.duringMeasureLayout) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean z(@dl.d LayoutNode layoutNode, boolean forced) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        if (!(layoutNode.getMLookaheadScope() != null)) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
        }
        int i10 = b.f15333a[layoutNode.f0().ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                this.postponedMeasureRequests.b(new a(layoutNode, true, forced));
                f0 f0Var = this.consistencyChecker;
                if (f0Var != null) {
                    f0Var.a();
                }
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.h0() || forced) {
                    layoutNode.T0();
                    layoutNode.U0();
                    if (kotlin.jvm.internal.f0.g(layoutNode.N0(), Boolean.TRUE) || j(layoutNode)) {
                        LayoutNode layoutNodeV0 = layoutNode.v0();
                        if (!(layoutNodeV0 != null && layoutNodeV0.h0())) {
                            this.relayoutNodes.a(layoutNode);
                        }
                    }
                    if (!this.duringMeasureLayout) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

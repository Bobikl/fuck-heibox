package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 =2\u00020\u0001:\u0003>?@B\u0017\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010:\u001a\u00020$¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J@\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u0019H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0016R*\u0010,\u001a\u00020$2\u0006\u0010%\u001a\u00020$8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00107\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"Landroidx/compose/ui/node/w;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/layout/f0;", "scope", "Landroidx/compose/ui/node/i0;", "D2", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/e1;", "z1", "(J)Landroidx/compose/ui/layout/e1;", "", "height", "l1", "w1", "width", "L0", androidx.exifinterface.media.a.X4, "Ls1/n;", CommonNetImpl.POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/b2;", "Lkotlin/t;", "layerBlock", "U1", "(JFLyh/l;)V", "m3", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Y1", "Landroidx/compose/ui/graphics/d0;", "canvas", "q3", "Landroidx/compose/ui/node/v;", "<set-?>", "K", "Landroidx/compose/ui/node/v;", "Q3", "()Landroidx/compose/ui/node/v;", "S3", "(Landroidx/compose/ui/node/v;)V", "layoutModifierNode", "Landroidx/compose/ui/node/o;", "L", "Landroidx/compose/ui/node/o;", "lookAheadTransientMeasureNode", "Landroidx/compose/ui/n$d;", "T2", "()Landroidx/compose/ui/n$d;", "tail", "R3", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/v;)V", "M", ak.av, "b", ak.aF, "ui_release"}, k = 1, mv = {1, 7, 1})
public final class w extends NodeCoordinator {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    private static final androidx.compose.ui.graphics.h1 N;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @dl.d
    private v layoutModifierNode;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @dl.e
    private o lookAheadTransientMeasureNode;

    /* JADX INFO: renamed from: androidx.compose.ui.node.w$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/w$a;", "", "Landroidx/compose/ui/graphics/h1;", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/h1;", ak.av, "()Landroidx/compose/ui/graphics/h1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.ui.graphics.h1 a() {
            return w.N;
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\n0\u0011R\u00060\u0000R\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/w$b;", "Landroidx/compose/ui/node/i0;", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/e1;", "z1", "(J)Landroidx/compose/ui/layout/e1;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "Y1", "Landroidx/compose/ui/node/o;", "p", "Landroidx/compose/ui/node/o;", "y2", "()Landroidx/compose/ui/node/o;", "intermediateMeasureNode", "Landroidx/compose/ui/node/w$b$a;", "Landroidx/compose/ui/node/w;", "q", "Landroidx/compose/ui/node/w$b$a;", "passThroughMeasureResult", "Landroidx/compose/ui/layout/f0;", "scope", "<init>", "(Landroidx/compose/ui/node/w;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/node/o;)V", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class b extends i0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final o intermediateMeasureNode;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final a passThroughMeasureResult;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ w f15394r;

        /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/w$b$a;", "Landroidx/compose/ui/layout/j0;", "Lkotlin/b2;", "k", "", "Landroidx/compose/ui/layout/a;", "", ak.av, "Ljava/util/Map;", "i", "()Ljava/util/Map;", "alignmentLines", "getWidth", "()I", "width", "getHeight", "height", "<init>", "(Landroidx/compose/ui/node/w$b;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
        public final class a implements androidx.compose.ui.layout.j0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final Map<androidx.compose.ui.layout.a, Integer> alignmentLines = kotlin.collections.s0.z();

            public a() {
            }

            @Override // androidx.compose.ui.layout.j0
            public int getHeight() {
                i0 lookaheadDelegate = b.this.f15394r.R3().getLookaheadDelegate();
                kotlin.jvm.internal.f0.m(lookaheadDelegate);
                return lookaheadDelegate.d2().getHeight();
            }

            @Override // androidx.compose.ui.layout.j0
            public int getWidth() {
                i0 lookaheadDelegate = b.this.f15394r.R3().getLookaheadDelegate();
                kotlin.jvm.internal.f0.m(lookaheadDelegate);
                return lookaheadDelegate.d2().getWidth();
            }

            @Override // androidx.compose.ui.layout.j0
            @dl.d
            public Map<androidx.compose.ui.layout.a, Integer> i() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.j0
            public void k() {
                androidx.compose.ui.layout.e1.a.Companion companion = androidx.compose.ui.layout.e1.a.INSTANCE;
                i0 lookaheadDelegate = b.this.f15394r.R3().getLookaheadDelegate();
                kotlin.jvm.internal.f0.m(lookaheadDelegate);
                androidx.compose.ui.layout.e1.a.p(companion, lookaheadDelegate, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d w wVar, @dl.d androidx.compose.ui.layout.f0 scope, o intermediateMeasureNode) {
            super(wVar, scope);
            kotlin.jvm.internal.f0.p(scope, "scope");
            kotlin.jvm.internal.f0.p(intermediateMeasureNode, "intermediateMeasureNode");
            this.f15394r = wVar;
            this.intermediateMeasureNode = intermediateMeasureNode;
            this.passThroughMeasureResult = new a();
        }

        @Override // androidx.compose.ui.node.h0
        public int Y1(@dl.d androidx.compose.ui.layout.a alignmentLine) {
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            int iB = x.b(this, alignmentLine);
            p2().put(alignmentLine, Integer.valueOf(iB));
            return iB;
        }

        @dl.d
        /* JADX INFO: renamed from: y2, reason: from getter */
        public final o getIntermediateMeasureNode() {
            return this.intermediateMeasureNode;
        }

        @Override // androidx.compose.ui.layout.g0
        @dl.d
        public androidx.compose.ui.layout.e1 z1(long constraints) {
            o oVar = this.intermediateMeasureNode;
            w wVar = this.f15394r;
            X1(constraints);
            i0 lookaheadDelegate = wVar.R3().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            lookaheadDelegate.z1(constraints);
            oVar.D(s1.s.a(lookaheadDelegate.d2().getWidth(), lookaheadDelegate.d2().getHeight()));
            x2(this.passThroughMeasureResult);
            return this;
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/w$c;", "Landroidx/compose/ui/node/i0;", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/e1;", "z1", "(J)Landroidx/compose/ui/layout/e1;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "Y1", "height", "l1", "w1", "width", "L0", androidx.exifinterface.media.a.X4, "Landroidx/compose/ui/layout/f0;", "scope", "<init>", "(Landroidx/compose/ui/node/w;Landroidx/compose/ui/layout/f0;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class c extends i0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ w f15397p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d w wVar, androidx.compose.ui.layout.f0 scope) {
            super(wVar, scope);
            kotlin.jvm.internal.f0.p(scope, "scope");
            this.f15397p = wVar;
        }

        @Override // androidx.compose.ui.node.i0, androidx.compose.ui.layout.m
        public int L0(int width) {
            v layoutModifierNode = this.f15397p.getLayoutModifierNode();
            i0 lookaheadDelegate = this.f15397p.R3().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return layoutModifierNode.j(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.i0, androidx.compose.ui.layout.m
        public int V(int width) {
            v layoutModifierNode = this.f15397p.getLayoutModifierNode();
            i0 lookaheadDelegate = this.f15397p.R3().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return layoutModifierNode.i(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.h0
        public int Y1(@dl.d androidx.compose.ui.layout.a alignmentLine) {
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            int iB = x.b(this, alignmentLine);
            p2().put(alignmentLine, Integer.valueOf(iB));
            return iB;
        }

        @Override // androidx.compose.ui.node.i0, androidx.compose.ui.layout.m
        public int l1(int height) {
            v layoutModifierNode = this.f15397p.getLayoutModifierNode();
            i0 lookaheadDelegate = this.f15397p.R3().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return layoutModifierNode.b(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.node.i0, androidx.compose.ui.layout.m
        public int w1(int height) {
            v layoutModifierNode = this.f15397p.getLayoutModifierNode();
            i0 lookaheadDelegate = this.f15397p.R3().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return layoutModifierNode.h(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.layout.g0
        @dl.d
        public androidx.compose.ui.layout.e1 z1(long constraints) {
            w wVar = this.f15397p;
            X1(constraints);
            v layoutModifierNode = wVar.getLayoutModifierNode();
            i0 lookaheadDelegate = wVar.R3().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            x2(layoutModifierNode.k(this, lookaheadDelegate, constraints));
            return this;
        }
    }

    static {
        androidx.compose.ui.graphics.h1 h1VarA = androidx.compose.ui.graphics.i.a();
        h1VarA.i(androidx.compose.ui.graphics.l0.INSTANCE.c());
        h1VarA.q(1.0f);
        h1VarA.p(androidx.compose.ui.graphics.j1.INSTANCE.b());
        N = h1VarA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@dl.d LayoutNode layoutNode, @dl.d v measureNode) {
        super(layoutNode);
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        kotlin.jvm.internal.f0.p(measureNode, "measureNode");
        this.layoutModifierNode = measureNode;
        this.lookAheadTransientMeasureNode = (((measureNode.getNode().getKindSet() & x0.f15398a.d()) != 0) && (measureNode instanceof o)) ? (o) measureNode : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @dl.d
    public i0 D2(@dl.d androidx.compose.ui.layout.f0 scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        o oVar = this.lookAheadTransientMeasureNode;
        return oVar != null ? new b(this, scope, oVar) : new c(this, scope);
    }

    @Override // androidx.compose.ui.layout.m
    public int L0(int width) {
        return this.layoutModifierNode.j(this, R3(), width);
    }

    @dl.d
    /* JADX INFO: renamed from: Q3, reason: from getter */
    public final v getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    @dl.d
    public final NodeCoordinator R3() {
        NodeCoordinator wrapped = getWrapped();
        kotlin.jvm.internal.f0.m(wrapped);
        return wrapped;
    }

    public final void S3(@dl.d v vVar) {
        kotlin.jvm.internal.f0.p(vVar, "<set-?>");
        this.layoutModifierNode = vVar;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @dl.d
    /* JADX INFO: renamed from: T2 */
    public androidx.compose.ui.n.d getTail() {
        return this.layoutModifierNode.getNode();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.e1
    protected void U1(long position, float zIndex, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
        super.U1(position, zIndex, layerBlock);
        if (getIsShallowPlacing()) {
            return;
        }
        p3();
        androidx.compose.ui.layout.e1.a.Companion companion = androidx.compose.ui.layout.e1.a.INSTANCE;
        int iM = s1.r.m(getMeasuredSize());
        LayoutDirection layoutDirection = getLayoutDirection();
        androidx.compose.ui.layout.q qVar = androidx.compose.ui.layout.e1.a.f15015e;
        int iN = companion.n();
        LayoutDirection layoutDirectionM = companion.m();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = androidx.compose.ui.layout.e1.a.f15016f;
        androidx.compose.ui.layout.e1.a.f15014d = iM;
        androidx.compose.ui.layout.e1.a.f15013c = layoutDirection;
        boolean zJ = companion.J(this);
        d2().k();
        k2(zJ);
        androidx.compose.ui.layout.e1.a.f15014d = iN;
        androidx.compose.ui.layout.e1.a.f15013c = layoutDirectionM;
        androidx.compose.ui.layout.e1.a.f15015e = qVar;
        androidx.compose.ui.layout.e1.a.f15016f = layoutNodeLayoutDelegate;
    }

    @Override // androidx.compose.ui.layout.m
    public int V(int width) {
        return this.layoutModifierNode.i(this, R3(), width);
    }

    @Override // androidx.compose.ui.node.h0
    public int Y1(@dl.d androidx.compose.ui.layout.a alignmentLine) {
        kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
        i0 lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.o2(alignmentLine) : x.b(this, alignmentLine);
    }

    @Override // androidx.compose.ui.layout.m
    public int l1(int height) {
        return this.layoutModifierNode.b(this, R3(), height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void m3() {
        super.m3();
        v vVar = this.layoutModifierNode;
        if (!((vVar.getNode().getKindSet() & x0.f15398a.d()) != 0) || !(vVar instanceof o)) {
            this.lookAheadTransientMeasureNode = null;
            i0 lookaheadDelegate = getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                J3(new c(this, lookaheadDelegate.getLookaheadScope()));
                return;
            }
            return;
        }
        o oVar = (o) vVar;
        this.lookAheadTransientMeasureNode = oVar;
        i0 lookaheadDelegate2 = getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            J3(new b(this, lookaheadDelegate2.getLookaheadScope(), oVar));
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void q3(@dl.d androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        R3().G2(canvas);
        if (d0.b(getLayoutNode()).getShowLayoutBounds()) {
            H2(canvas, N);
        }
    }

    @Override // androidx.compose.ui.layout.m
    public int w1(int height) {
        return this.layoutModifierNode.h(this, R3(), height);
    }

    @Override // androidx.compose.ui.layout.g0
    @dl.d
    public androidx.compose.ui.layout.e1 z1(long constraints) {
        X1(constraints);
        w3(this.layoutModifierNode.k(this, R3(), constraints));
        z0 layer = getLayer();
        if (layer != null) {
            layer.g(getMeasuredSize());
        }
        o3();
        return this;
    }
}

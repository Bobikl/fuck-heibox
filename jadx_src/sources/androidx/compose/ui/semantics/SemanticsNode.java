package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.b1;
import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.j1;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.x0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\b\b\u0002\u0010/\u001a\u00020+¢\u0006\u0004\bh\u0010iJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002J8\u0010\u0017\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0002\b\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019J)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!R\u001a\u0010&\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010*\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010:\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b8\u00109R\u0017\u0010?\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010)R\u0011\u0010E\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010I\u001a\u0004\u0018\u00010F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010M\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010Q\u001a\u00020N8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010R\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\b;\u0010LR\u001a\u0010U\u001a\u00020S8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bT\u0010PR\u0011\u0010W\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bV\u0010LR\u001a\u0010Y\u001a\u00020S8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bX\u0010PR\u0011\u0010[\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bZ\u00109R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000\n8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00000\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00000\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010]R\u0011\u0010d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bc\u0010)R\u0013\u0010g\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/semantics/j;", "mergedConfig", "Lkotlin/b2;", "C", "", "sortByBounds", "includeReplacedSemantics", "includeFakeNodes", "", "j", "", "list", "d", "unmergedChildren", ak.av, "Landroidx/compose/ui/semantics/g;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/r;", "Lkotlin/t;", "properties", "b", "(Landroidx/compose/ui/semantics/g;Lyh/l;)Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "f", androidx.exifinterface.media.a.S4, "(ZZ)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", ak.aF, "()Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/j1;", "Landroidx/compose/ui/node/j1;", "p", "()Landroidx/compose/ui/node/j1;", "outerSemanticsNode", "Z", "o", "()Z", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LayoutNode;", "n", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", ak.aD, "D", "(Z)V", "isFake", "e", "Landroidx/compose/ui/semantics/SemanticsNode;", "fakeNodeParent", "Landroidx/compose/ui/semantics/j;", "y", "()Landroidx/compose/ui/semantics/j;", "unmergedConfig", "g", "I", "l", "()I", "id", androidx.exifinterface.media.a.W4, "isMergingSemanticsOfDescendants", "Landroidx/compose/ui/layout/u;", "m", "()Landroidx/compose/ui/layout/u;", "layoutInfo", "Landroidx/compose/ui/node/i1;", "v", "()Landroidx/compose/ui/node/i1;", "root", "Lb1/i;", "x", "()Lb1/i;", "touchBoundsInRoot", "Ls1/r;", RXScreenCaptureService.KEY_WIDTH, "()J", UiKitSpanObj.TYPE_SIZE, "boundsInRoot", "Lb1/f;", "r", "positionInRoot", RXScreenCaptureService.KEY_HEIGHT, "boundsInWindow", ak.aB, "positionInWindow", "k", "config", "i", "()Ljava/util/List;", "children", "t", "replacedChildren", ak.aG, "replacedChildrenSortedByBounds", "B", "isRoot", "q", "()Landroidx/compose/ui/semantics/SemanticsNode;", "parent", "<init>", "(Landroidx/compose/ui/node/j1;ZLandroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class SemanticsNode {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16019h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j1 outerSemanticsNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean mergingEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isFake;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private SemanticsNode fakeNodeParent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j unmergedConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: compiled from: SemanticsNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"androidx/compose/ui/semantics/SemanticsNode$a", "Landroidx/compose/ui/node/j1;", "Landroidx/compose/ui/n$d;", "Landroidx/compose/ui/semantics/j;", "j", "Landroidx/compose/ui/semantics/j;", "c0", "()Landroidx/compose/ui/semantics/j;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends androidx.compose.ui.n.d implements j1 {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final j semanticsConfiguration;

        a(yh.l<? super r, b2> lVar) {
            j jVar = new j();
            jVar.v(false);
            jVar.u(false);
            lVar.invoke(jVar);
            this.semanticsConfiguration = jVar;
        }

        @Override // androidx.compose.ui.node.j1
        @dl.d
        /* JADX INFO: renamed from: c0, reason: from getter */
        public j getSemanticsConfiguration() {
            return this.semanticsConfiguration;
        }
    }

    public SemanticsNode(@dl.d j1 outerSemanticsNode, boolean z10, @dl.d LayoutNode layoutNode) {
        f0.p(outerSemanticsNode, "outerSemanticsNode");
        f0.p(layoutNode, "layoutNode");
        this.outerSemanticsNode = outerSemanticsNode;
        this.mergingEnabled = z10;
        this.layoutNode = layoutNode;
        this.unmergedConfig = k1.a(outerSemanticsNode);
        this.id = layoutNode.getSemanticsId();
    }

    public /* synthetic */ SemanticsNode(j1 j1Var, boolean z10, LayoutNode layoutNode, int i10, u uVar) {
        this(j1Var, z10, (i10 & 4) != 0 ? androidx.compose.ui.node.d.k(j1Var) : layoutNode);
    }

    private final boolean A() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    private final void C(j jVar) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        List listF = F(this, false, false, 3, null);
        int size = listF.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listF.get(i10);
            if (!semanticsNode.A()) {
                jVar.s(semanticsNode.unmergedConfig);
                semanticsNode.C(jVar);
            }
        }
    }

    public static /* synthetic */ List F(SemanticsNode semanticsNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return semanticsNode.E(z10, z11);
    }

    private final void a(List<SemanticsNode> list) {
        final g gVarM = n.m(this);
        if (gVarM != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && (!list.isEmpty())) {
            list.add(b(gVarM, new yh.l<r, b2>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                public final void a(@dl.d r fakeSemanticsNode) {
                    f0.p(fakeSemanticsNode, "$this$fakeSemanticsNode");
                    SemanticsPropertiesKt.p0(fakeSemanticsNode, gVarM.getValue());
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                    a(rVar);
                    return b2.f124493a;
                }
            }));
        }
        j jVar = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        if (jVar.e(semanticsProperties.c()) && (!list.isEmpty()) && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.a(this.unmergedConfig, semanticsProperties.c());
            final String str = list2 != null ? (String) CollectionsKt___CollectionsKt.B2(list2) : null;
            if (str != null) {
                list.add(0, b(null, new yh.l<r, b2>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d r fakeSemanticsNode) {
                        f0.p(fakeSemanticsNode, "$this$fakeSemanticsNode");
                        SemanticsPropertiesKt.e0(fakeSemanticsNode, str);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                        a(rVar);
                        return b2.f124493a;
                    }
                }));
            }
        }
    }

    private final SemanticsNode b(g role, yh.l<? super r, b2> properties) {
        SemanticsNode semanticsNode = new SemanticsNode(new a(properties), false, new LayoutNode(true, role != null ? n.n(this) : n.e(this)));
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final List<SemanticsNode> d(List<SemanticsNode> list, boolean sortByBounds) {
        List listF = F(this, sortByBounds, false, 2, null);
        int size = listF.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listF.get(i10);
            if (semanticsNode.A()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                e(semanticsNode, list, false, 2, null);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List e(SemanticsNode semanticsNode, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return semanticsNode.d(list, z10);
    }

    private final List<SemanticsNode> j(boolean sortByBounds, boolean includeReplacedSemantics, boolean includeFakeNodes) {
        if (includeReplacedSemantics || !this.unmergedConfig.getIsClearingSemantics()) {
            return A() ? e(this, null, sortByBounds, 1, null) : E(sortByBounds, includeFakeNodes);
        }
        return CollectionsKt__CollectionsKt.E();
    }

    public final boolean B() {
        return q() == null;
    }

    public final void D(boolean z10) {
        this.isFake = z10;
    }

    @dl.d
    public final List<SemanticsNode> E(boolean sortByBounds, boolean includeFakeNodes) {
        if (this.isFake) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList();
        List listD = sortByBounds ? s.d(this.layoutNode, null, 1, null) : n.h(this.layoutNode, null, 1, null);
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new SemanticsNode((j1) listD.get(i10), this.mergingEnabled, null, 4, null));
        }
        if (includeFakeNodes) {
            a(arrayList);
        }
        return arrayList;
    }

    @dl.d
    public final NodeCoordinator c() {
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            return androidx.compose.ui.node.d.j(this.outerSemanticsNode, x0.f15398a.j());
        }
        j1 j1VarI = n.i(this.layoutNode);
        if (j1VarI == null) {
            j1VarI = this.outerSemanticsNode;
        }
        return androidx.compose.ui.node.d.j(j1VarI, x0.f15398a.j());
    }

    public final int f(@dl.d androidx.compose.ui.layout.a alignmentLine) {
        f0.p(alignmentLine, "alignmentLine");
        return c().v(alignmentLine);
    }

    @dl.d
    public final b1.i g() {
        return !this.layoutNode.p() ? b1.i.f30369e.a() : androidx.compose.ui.layout.r.b(c());
    }

    @dl.d
    public final b1.i h() {
        return !this.layoutNode.p() ? b1.i.f30369e.a() : androidx.compose.ui.layout.r.c(c());
    }

    @dl.d
    public final List<SemanticsNode> i() {
        return j(false, !this.mergingEnabled, false);
    }

    @dl.d
    public final j k() {
        if (!A()) {
            return this.unmergedConfig;
        }
        j jVarG = this.unmergedConfig.g();
        C(jVarG);
        return jVarG;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @dl.d
    public final androidx.compose.ui.layout.u m() {
        return this.layoutNode;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    @dl.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public final j1 getOuterSemanticsNode() {
        return this.outerSemanticsNode;
    }

    @dl.e
    public final SemanticsNode q() {
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNodeF = this.mergingEnabled ? n.f(this.layoutNode, new yh.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d LayoutNode it) {
                j jVarA;
                f0.p(it, "it");
                j1 j1VarK = n.k(it);
                return Boolean.valueOf((j1VarK == null || (jVarA = k1.a(j1VarK)) == null || !jVarA.getIsMergingSemanticsOfDescendants()) ? false : true);
            }
        }) : null;
        if (layoutNodeF == null) {
            layoutNodeF = n.f(this.layoutNode, new yh.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d LayoutNode it) {
                    f0.p(it, "it");
                    return Boolean.valueOf(n.k(it) != null);
                }
            });
        }
        j1 j1VarK = layoutNodeF != null ? n.k(layoutNodeF) : null;
        if (j1VarK == null) {
            return null;
        }
        return new SemanticsNode(j1VarK, this.mergingEnabled, null, 4, null);
    }

    public final long r() {
        return !this.layoutNode.p() ? b1.f.f30364b.e() : androidx.compose.ui.layout.r.f(c());
    }

    public final long s() {
        return !this.layoutNode.p() ? b1.f.f30364b.e() : androidx.compose.ui.layout.r.g(c());
    }

    @dl.d
    public final List<SemanticsNode> t() {
        return j(false, false, true);
    }

    @dl.d
    public final List<SemanticsNode> u() {
        return j(true, false, true);
    }

    @dl.e
    public final i1 v() {
        b1 owner = this.layoutNode.getOwner();
        if (owner != null) {
            return owner.getRootForTest();
        }
        return null;
    }

    public final long w() {
        return c().a();
    }

    @dl.d
    public final b1.i x() {
        j1 j1VarI;
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants() || (j1VarI = n.i(this.layoutNode)) == null) {
            j1VarI = this.outerSemanticsNode;
        }
        return k1.e(j1VarI);
    }

    @dl.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public final j getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }
}

package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLineKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\n\u001a\u00020\bJ\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bJ\u0014\u0010\r\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H$J\u0006\u0010\u000e\u001a\u00020\bJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\bJ!\u0010\u0014\u001a\u00020\u0012*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010)\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\"\u0010-\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\"\u00100\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\"\u00103\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u0018\u00104\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u00109\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0014\u0010;\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010 R$\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b*\u00020\u00068$X¤\u0004¢\u0006\u0006\u001a\u0004\b*\u0010<\u0082\u0001\u0002@A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "initialPosition", "Landroidx/compose/ui/node/NodeCoordinator;", "initialCoordinator", "Lkotlin/b2;", ak.aF, ak.aB, "", RXScreenCaptureService.KEY_HEIGHT, "i", "r", "t", "()V", "q", "Lb1/f;", CommonNetImpl.POSITION, "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "Landroidx/compose/ui/node/a;", ak.av, "Landroidx/compose/ui/node/a;", "f", "()Landroidx/compose/ui/node/a;", "alignmentLinesOwner", "", "b", "Z", "g", "()Z", ak.aG, "(Z)V", "dirty", "p", ak.aD, "usedDuringParentMeasurement", "o", "y", "usedDuringParentLayout", "e", "j", "v", "previousUsedDuringParentLayout", "n", "x", "usedByModifierMeasurement", "m", RXScreenCaptureService.KEY_WIDTH, "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "k", "queried", "l", "required", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "<init>", "(Landroidx/compose/ui/node/a;)V", "Landroidx/compose/ui/node/a0;", "Landroidx/compose/ui/node/g0;", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class AlignmentLines {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a alignmentLinesOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean dirty;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentMeasurement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean previousUsedDuringParentLayout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierMeasurement;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private a queryOwner;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<androidx.compose.ui.layout.a, Integer> alignmentLineMap;

    private AlignmentLines(a aVar) {
        this.alignmentLinesOwner = aVar;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }

    public /* synthetic */ AlignmentLines(a aVar, kotlin.jvm.internal.u uVar) {
        this(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(androidx.compose.ui.layout.a aVar, int i10, NodeCoordinator nodeCoordinator) {
        float f10 = i10;
        long jA = b1.g.a(f10, f10);
        while (true) {
            jA = d(nodeCoordinator, jA);
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            kotlin.jvm.internal.f0.m(nodeCoordinator);
            if (kotlin.jvm.internal.f0.g(nodeCoordinator, this.alignmentLinesOwner.R0())) {
                break;
            } else if (e(nodeCoordinator).containsKey(aVar)) {
                float fI = i(nodeCoordinator, aVar);
                jA = b1.g.a(fI, fI);
            }
        }
        int iL0 = aVar instanceof androidx.compose.ui.layout.k ? di.d.L0(b1.f.r(jA)) : di.d.L0(b1.f.p(jA));
        Map<androidx.compose.ui.layout.a, Integer> map = this.alignmentLineMap;
        if (map.containsKey(aVar)) {
            iL0 = AlignmentLineKt.c(aVar, ((Number) kotlin.collections.s0.K(this.alignmentLineMap, aVar)).intValue(), iL0);
        }
        map.put(aVar, Integer.valueOf(iL0));
    }

    protected abstract long d(@dl.d NodeCoordinator nodeCoordinator, long j10);

    @dl.d
    protected abstract Map<androidx.compose.ui.layout.a, Integer> e(@dl.d NodeCoordinator nodeCoordinator);

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    @dl.d
    public final Map<androidx.compose.ui.layout.a, Integer> h() {
        return this.alignmentLineMap;
    }

    protected abstract int i(@dl.d NodeCoordinator nodeCoordinator, @dl.d androidx.compose.ui.layout.a aVar);

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getPreviousUsedDuringParentLayout() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean k() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean l() {
        s();
        return this.queryOwner != null;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getUsedByModifierLayout() {
        return this.usedByModifierLayout;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getUsedByModifierMeasurement() {
        return this.usedByModifierMeasurement;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getUsedDuringParentMeasurement() {
        return this.usedDuringParentMeasurement;
    }

    public final void q() {
        this.dirty = true;
        a aVarG0 = this.alignmentLinesOwner.g0();
        if (aVarG0 == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            aVarG0.l();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            aVarG0.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.l();
        }
        if (this.usedByModifierLayout) {
            aVarG0.requestLayout();
        }
        aVarG0.getAlignmentLines().q();
    }

    public final void r() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.j(new yh.l<a, b2>() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            public final void a(@dl.d a childOwner) {
                kotlin.jvm.internal.f0.p(childOwner, "childOwner");
                if (childOwner.getIsPlaced()) {
                    if (childOwner.getAlignmentLines().getDirty()) {
                        childOwner.I0();
                    }
                    Map map = childOwner.getAlignmentLines().alignmentLineMap;
                    AlignmentLines alignmentLines = this.f15089b;
                    for (Map.Entry entry : map.entrySet()) {
                        alignmentLines.c((androidx.compose.ui.layout.a) entry.getKey(), ((Number) entry.getValue()).intValue(), childOwner.R0());
                    }
                    NodeCoordinator wrappedBy = childOwner.R0().getWrappedBy();
                    kotlin.jvm.internal.f0.m(wrappedBy);
                    while (!kotlin.jvm.internal.f0.g(wrappedBy, this.f15089b.getAlignmentLinesOwner().R0())) {
                        Set<androidx.compose.ui.layout.a> setKeySet = this.f15089b.e(wrappedBy).keySet();
                        AlignmentLines alignmentLines2 = this.f15089b;
                        for (androidx.compose.ui.layout.a aVar : setKeySet) {
                            alignmentLines2.c(aVar, alignmentLines2.i(wrappedBy, aVar), wrappedBy);
                        }
                        wrappedBy = wrappedBy.getWrappedBy();
                        kotlin.jvm.internal.f0.m(wrappedBy);
                    }
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        });
        this.alignmentLineMap.putAll(e(this.alignmentLinesOwner.R0()));
        this.dirty = false;
    }

    public final void s() {
        a aVar;
        AlignmentLines alignmentLinesI;
        AlignmentLines alignmentLinesI2;
        if (k()) {
            aVar = this.alignmentLinesOwner;
        } else {
            a aVarG0 = this.alignmentLinesOwner.g0();
            if (aVarG0 == null) {
                return;
            }
            aVar = aVarG0.getAlignmentLines().queryOwner;
            if (aVar == null || !aVar.getAlignmentLines().k()) {
                a aVar2 = this.queryOwner;
                if (aVar2 == null || aVar2.getAlignmentLines().k()) {
                    return;
                }
                a aVarG1 = aVar2.g0();
                if (aVarG1 != null && (alignmentLinesI2 = aVarG1.getAlignmentLines()) != null) {
                    alignmentLinesI2.s();
                }
                a aVarG2 = aVar2.g0();
                aVar = (aVarG2 == null || (alignmentLinesI = aVarG2.getAlignmentLines()) == null) ? null : alignmentLinesI.queryOwner;
            }
        }
        this.queryOwner = aVar;
    }

    public final void t() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void u(boolean z10) {
        this.dirty = z10;
    }

    public final void v(boolean z10) {
        this.previousUsedDuringParentLayout = z10;
    }

    public final void w(boolean z10) {
        this.usedByModifierLayout = z10;
    }

    public final void x(boolean z10) {
        this.usedByModifierMeasurement = z10;
    }

    public final void y(boolean z10) {
        this.usedDuringParentLayout = z10;
    }

    public final void z(boolean z10) {
        this.usedDuringParentMeasurement = z10;
    }
}

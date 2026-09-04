package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u001a\"\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\f\u0010\n\u001a\u00020\u0002*\u00020\u0005H\u0002\u001a\f\u0010\u000b\u001a\u00020\u0002*\u00020\u0005H\u0002\u001a\u001a\u0010\u000f\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u001a\u0018\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011*\u00020\u0010H\u0000\u001a\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0000\"\u0018\u0010\u001b\u001a\u00020\u0002*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001d\u001a\u00020\u0002*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u0002*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "selector", "n", "Landroidx/compose/ui/semantics/SemanticsNode;", "k", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "oldNode", ak.aG, "q", "l", "Landroidx/compose/ui/semantics/a;", "", "other", "j", "Landroidx/compose/ui/semantics/o;", "", "", "Landroidx/compose/ui/platform/r1;", "o", "", "Landroidx/compose/ui/platform/q1;", "id", "m", "r", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isPassword", "t", "isTextField", ak.aB, "isRtl", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!kotlin.jvm.internal.f0.g(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.a() != null || accessibilityAction2.a() == null) {
            return accessibilityAction.a() == null || accessibilityAction2.a() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.a(semanticsNode.k(), SemanticsProperties.f16032a.d()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(SemanticsNode semanticsNode) {
        androidx.compose.ui.semantics.j jVarA;
        if (t(semanticsNode) && !kotlin.jvm.internal.f0.g(SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsProperties.f16032a.g()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeN = n(semanticsNode.getLayoutNode(), new yh.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d LayoutNode it) {
                kotlin.jvm.internal.f0.p(it, "it");
                androidx.compose.ui.node.j1 j1VarK = androidx.compose.ui.semantics.n.k(it);
                androidx.compose.ui.semantics.j jVarA2 = j1VarK != null ? androidx.compose.ui.node.k1.a(j1VarK) : null;
                return Boolean.valueOf((jVarA2 != null && jVarA2.getIsMergingSemanticsOfDescendants()) && jVarA2.e(androidx.compose.ui.semantics.i.f16129a.p()));
            }
        });
        if (layoutNodeN != null) {
            androidx.compose.ui.node.j1 j1VarK = androidx.compose.ui.semantics.n.k(layoutNodeN);
            if (!((j1VarK == null || (jVarA = androidx.compose.ui.node.k1.a(j1VarK)) == null) ? false : kotlin.jvm.internal.f0.g(SemanticsConfigurationKt.a(jVarA, SemanticsProperties.f16032a.g()), Boolean.TRUE))) {
                return true;
            }
        }
        return false;
    }

    @dl.e
    public static final q1 m(@dl.d List<q1> list, int i10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).getSemanticsNodeId() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode n(LayoutNode layoutNode, yh.l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode layoutNodeV0 = layoutNode.v0(); layoutNodeV0 != null; layoutNodeV0 = layoutNodeV0.v0()) {
            if (lVar.invoke(layoutNodeV0).booleanValue()) {
                return layoutNodeV0;
            }
        }
        return null;
    }

    @dl.d
    public static final Map<Integer, r1> o(@dl.d androidx.compose.ui.semantics.o oVar) {
        kotlin.jvm.internal.f0.p(oVar, "<this>");
        SemanticsNode semanticsNodeB = oVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (semanticsNodeB.getLayoutNode().getIsPlaced() && semanticsNodeB.getLayoutNode().p()) {
            Region region = new Region();
            region.set(androidx.compose.ui.graphics.w1.a(semanticsNodeB.g()));
            p(region, semanticsNodeB, linkedHashMap, semanticsNodeB);
        }
        return linkedHashMap;
    }

    private static final void p(Region region, SemanticsNode semanticsNode, Map<Integer, r1> map, SemanticsNode semanticsNode2) {
        androidx.compose.ui.layout.u uVarM;
        boolean z10 = false;
        boolean z11 = (semanticsNode2.getLayoutNode().getIsPlaced() && semanticsNode2.getLayoutNode().p()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z11 || semanticsNode2.getIsFake()) {
                Rect rectA = androidx.compose.ui.graphics.w1.a(semanticsNode2.x());
                Region region2 = new Region();
                region2.set(rectA);
                int id2 = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(id2);
                    Rect bounds = region2.getBounds();
                    kotlin.jvm.internal.f0.o(bounds, "region.bounds");
                    map.put(numValueOf, new r1(semanticsNode2, bounds));
                    List<SemanticsNode> listT = semanticsNode2.t();
                    for (int size = listT.size() - 1; -1 < size; size--) {
                        p(region, semanticsNode, map, listT.get(size));
                    }
                    region.op(rectA, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (semanticsNode2.getIsFake()) {
                    SemanticsNode semanticsNodeQ = semanticsNode2.q();
                    if (semanticsNodeQ != null && (uVarM = semanticsNodeQ.m()) != null && uVarM.getIsPlaced()) {
                        z10 = true;
                    }
                    map.put(Integer.valueOf(id2), new r1(semanticsNode2, androidx.compose.ui.graphics.w1.a(z10 ? semanticsNodeQ.g() : new b1.i(0.0f, 0.0f, 10.0f, 10.0f))));
                    return;
                }
                if (id2 == -1) {
                    Integer numValueOf2 = Integer.valueOf(id2);
                    Rect bounds2 = region2.getBounds();
                    kotlin.jvm.internal.f0.o(bounds2, "region.bounds");
                    map.put(numValueOf2, new r1(semanticsNode2, bounds2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(SemanticsNode semanticsNode) {
        return semanticsNode.k().e(SemanticsProperties.f16032a.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(SemanticsNode semanticsNode) {
        return semanticsNode.k().e(SemanticsProperties.f16032a.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(SemanticsNode semanticsNode) {
        return semanticsNode.m().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig().e(androidx.compose.ui.semantics.i.f16129a.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.g gVar) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = gVar.getUnmergedConfig().iterator();
        while (it.hasNext()) {
            if (!semanticsNode.k().e(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}

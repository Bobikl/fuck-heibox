package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.b;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.j;
import androidx.core.view.accessibility.a0;
import b1.f;
import b1.g;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import yh.a;

/* JADX INFO: compiled from: CollectionInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0002\u001a\u0014\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r*\u00020\fH\u0002\u001a\u001c\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\u00120\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0002\"\u0018\u0010\u0016\u001a\u00020\u0007*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/core/view/accessibility/a0;", "info", "Lkotlin/b2;", "d", "e", "", "b", "", "items", ak.av, "Landroidx/compose/ui/semantics/b;", "Landroidx/core/view/accessibility/a0$d;", "kotlin.jvm.PlatformType", "f", "Landroidx/compose/ui/semantics/c;", "itemNode", "Landroidx/core/view/accessibility/a0$e;", "g", ak.aF, "(Landroidx/compose/ui/semantics/b;)Z", "isLazyCollection", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class CollectionInfoKt {
    private static final boolean a(List<SemanticsNode> list) {
        List listE;
        long f30368a;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listE = CollectionsKt__CollectionsKt.E();
        } else {
            listE = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int iG = CollectionsKt__CollectionsKt.G(list);
            int i10 = 0;
            while (i10 < iG) {
                i10++;
                SemanticsNode semanticsNode2 = list.get(i10);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                listE.add(f.d(g.a(Math.abs(f.p(semanticsNode4.g().o()) - f.p(semanticsNode3.g().o())), Math.abs(f.r(semanticsNode4.g().o()) - f.r(semanticsNode3.g().o())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (listE.size() == 1) {
            f30368a = ((f) CollectionsKt___CollectionsKt.w2(listE)).getF30368a();
        } else {
            if (listE.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objW2 = CollectionsKt___CollectionsKt.w2(listE);
            int iG2 = CollectionsKt__CollectionsKt.G(listE);
            if (1 <= iG2) {
                int i11 = 1;
                while (true) {
                    objW2 = f.d(f.v(((f) objW2).getF30368a(), ((f) listE.get(i11)).getF30368a()));
                    if (i11 == iG2) {
                        break;
                    }
                    i11++;
                }
            }
            f30368a = ((f) objW2).getF30368a();
        }
        return f.f(f30368a) < f.e(f30368a);
    }

    public static final boolean b(@d SemanticsNode semanticsNode) {
        f0.p(semanticsNode, "<this>");
        j jVarK = semanticsNode.k();
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        return (SemanticsConfigurationKt.a(jVarK, semanticsProperties.a()) == null && SemanticsConfigurationKt.a(semanticsNode.k(), semanticsProperties.u()) == null) ? false : true;
    }

    private static final boolean c(b bVar) {
        return bVar.getRowCount() < 0 || bVar.getColumnCount() < 0;
    }

    public static final void d(@d SemanticsNode node, @d a0 info) {
        f0.p(node, "node");
        f0.p(info, "info");
        j jVarK = node.k();
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        b bVar = (b) SemanticsConfigurationKt.a(jVarK, semanticsProperties.a());
        if (bVar != null) {
            info.d1(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.a(node.k(), semanticsProperties.u()) != null) {
            List<SemanticsNode> listT = node.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode = listT.get(i10);
                if (semanticsNode.k().e(SemanticsProperties.f16032a.v())) {
                    arrayList.add(semanticsNode);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean zA = a(arrayList);
            info.d1(a0.d.f(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
        }
    }

    public static final void e(@d SemanticsNode node, @d a0 info) {
        f0.p(node, "node");
        f0.p(info, "info");
        j jVarK = node.k();
        SemanticsProperties semanticsProperties = SemanticsProperties.f16032a;
        c cVar = (c) SemanticsConfigurationKt.a(jVarK, semanticsProperties.b());
        if (cVar != null) {
            info.e1(g(cVar, node));
        }
        SemanticsNode semanticsNodeQ = node.q();
        if (semanticsNodeQ == null || SemanticsConfigurationKt.a(semanticsNodeQ.k(), semanticsProperties.u()) == null) {
            return;
        }
        b bVar = (b) SemanticsConfigurationKt.a(semanticsNodeQ.k(), semanticsProperties.a());
        if ((bVar == null || !c(bVar)) && node.k().e(semanticsProperties.v())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> listT = semanticsNodeQ.t();
            int size = listT.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                SemanticsNode semanticsNode = listT.get(i11);
                if (semanticsNode.k().e(SemanticsProperties.f16032a.v())) {
                    arrayList.add(semanticsNode);
                    if (semanticsNode.getLayoutNode().getPlaceOrder() < node.getLayoutNode().getPlaceOrder()) {
                        i10++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean zA = a(arrayList);
                a0.e eVarH = a0.e.h(zA ? 0 : i10, 1, zA ? i10 : 0, 1, false, ((Boolean) node.k().i(SemanticsProperties.f16032a.v(), new a<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfoKt$setCollectionItemInfo$itemInfo$1
                    @Override // yh.a
                    @d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        return Boolean.FALSE;
                    }
                })).booleanValue());
                if (eVarH != null) {
                    info.e1(eVarH);
                }
            }
        }
    }

    private static final a0.d f(b bVar) {
        return a0.d.f(bVar.getRowCount(), bVar.getColumnCount(), false, 0);
    }

    private static final a0.e g(c cVar, SemanticsNode semanticsNode) {
        return a0.e.h(cVar.getRowIndex(), cVar.getRowSpan(), cVar.getColumnIndex(), cVar.getColumnSpan(), false, ((Boolean) semanticsNode.k().i(SemanticsProperties.f16032a.v(), new a<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfoKt$toAccessibilityCollectionItemInfo$1
            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }
}

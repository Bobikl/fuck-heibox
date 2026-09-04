package androidx.compose.ui.semantics;

import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SemanticsOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/semantics/o;", "", "mergingEnabled", "", "Landroidx/compose/ui/semantics/SemanticsNode;", ak.av, "useUnmergedTree", "", "", "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class p {
    @dl.d
    public static final List<SemanticsNode> a(@dl.d o oVar, boolean z10) {
        f0.p(oVar, "<this>");
        return CollectionsKt___CollectionsKt.Q5(b(oVar, !z10).values());
    }

    @dl.d
    public static final Map<Integer, SemanticsNode> b(@dl.d o oVar, boolean z10) {
        f0.p(oVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, z10 ? oVar.b() : oVar.a());
        return linkedHashMap;
    }

    public static /* synthetic */ Map c(o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(oVar, z10);
    }

    private static final void d(Map<Integer, SemanticsNode> map, SemanticsNode semanticsNode) {
        map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
        List<SemanticsNode> listI = semanticsNode.i();
        int size = listI.size();
        for (int i10 = 0; i10 < size; i10++) {
            d(map, listI.get(i10));
        }
    }
}

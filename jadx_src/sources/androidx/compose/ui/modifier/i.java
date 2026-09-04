package androidx.compose.ui.modifier;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.t0;
import androidx.compose.ui.node.x0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    public static Object a(j jVar, @dl.d c cVar) {
        t0 nodes;
        f0.p(cVar, "<this>");
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iG = x0.f15398a.g();
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d parent = jVar.getNode().getParent();
        LayoutNode layoutNodeK = androidx.compose.ui.node.d.k(jVar);
        while (layoutNodeK != null) {
            if ((layoutNodeK.getNodes().getHead().getAggregateChildKindSet() & iG) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iG) != 0 && (parent instanceof j)) {
                        j jVar2 = (j) parent;
                        if (jVar2.g().a(cVar)) {
                            return jVar2.g().b(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeK = layoutNodeK.v0();
            parent = (layoutNodeK == null || (nodes = layoutNodeK.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar.a().invoke();
    }

    @dl.d
    public static h b(j jVar) {
        return b.f15063b;
    }

    public static void c(j jVar, @dl.d c key, Object obj) {
        f0.p(key, "key");
        if (!(jVar.g() != b.f15063b)) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
        }
        if (jVar.g().a(key)) {
            jVar.g().c(key, obj);
            return;
        }
        throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.").toString());
    }
}

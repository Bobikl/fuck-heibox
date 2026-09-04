package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutNodeDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/node/h;", "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class c0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final h b(c cVar) {
        androidx.compose.ui.n.d child;
        x0 x0Var = x0.f15398a;
        int iB = x0Var.b();
        int iE = x0Var.e();
        androidx.compose.ui.n.d child2 = cVar.getNode().getChild();
        if (child2 == null) {
            return null;
        }
        if ((child2.getAggregateChildKindSet() & iB) == 0) {
            return null;
        }
        for (child = child2; child != 0 && (child.getKindSet() & iE) == 0; child = child.getChild()) {
            if ((child.getKindSet() & iB) != 0) {
                return (h) child;
            }
        }
        return null;
    }
}

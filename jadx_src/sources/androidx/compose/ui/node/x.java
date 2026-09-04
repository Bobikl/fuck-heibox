package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class x {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(h0 h0Var, androidx.compose.ui.layout.a aVar) {
        h0 h0VarA2 = h0Var.a2();
        if (!(h0VarA2 != null)) {
            throw new IllegalStateException(("Child of " + h0Var + " cannot be null when calculating alignment line").toString());
        }
        if (h0Var.d2().i().containsKey(aVar)) {
            Integer num = h0Var.d2().i().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iV = h0VarA2.v(aVar);
        if (iV == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        h0VarA2.l2(true);
        h0Var.k2(true);
        h0Var.j2();
        h0VarA2.l2(false);
        h0Var.k2(false);
        return iV + (aVar instanceof androidx.compose.ui.layout.k ? s1.n.o(h0VarA2.getPosition()) : s1.n.m(h0VarA2.getPosition()));
    }
}

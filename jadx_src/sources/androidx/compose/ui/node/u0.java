package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/node/v0;", "type", "stopType", "b", "(Landroidx/compose/ui/node/c;II)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class u0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T b(c cVar, int i10, int i11) {
        Object obj;
        androidx.compose.ui.n.d dVar = (T) cVar.getNode().getChild();
        if (dVar == null) {
            return null;
        }
        if ((dVar.getAggregateChildKindSet() & i10) == 0) {
            return null;
        }
        for (obj = dVar; obj != null; obj = (T) ((androidx.compose.ui.n.d) obj).getChild()) {
            int kindSet = ((androidx.compose.ui.n.d) obj).getKindSet();
            if ((kindSet & i11) != 0) {
                return null;
            }
            if ((kindSet & i10) != 0) {
                return (T) obj;
            }
        }
        return null;
    }
}

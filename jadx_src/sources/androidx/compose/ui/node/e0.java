package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/ui/layout/g0;", "destination", "Lkotlin/Function1;", "transform", "Lkotlin/b2;", "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class e0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LayoutNode layoutNode, androidx.compose.runtime.collection.e<androidx.compose.ui.layout.g0> eVar, yh.l<? super LayoutNode, ? extends androidx.compose.ui.layout.g0> lVar) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = layoutNode.B0();
        int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode2 = layoutNodeArrG[i11];
                if (eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() <= i11) {
                    eVar.b(lVar.invoke(layoutNode2));
                } else {
                    eVar.l0(i11, lVar.invoke(layoutNode2));
                }
                i11++;
            } while (i11 < i10);
        }
        eVar.h0(layoutNode.V().size(), eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String());
    }
}

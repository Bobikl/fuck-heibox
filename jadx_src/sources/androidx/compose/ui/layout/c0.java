package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: LookaheadLayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/i0;", "b", "(Landroidx/compose/ui/node/i0;)Landroidx/compose/ui/node/i0;", "rootLookaheadDelegate", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class c0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.node.i0 b(androidx.compose.ui.node.i0 i0Var) {
        androidx.compose.ui.node.i0 lookaheadDelegate = i0Var.getLookaheadScope().getRoot().t0().getLookaheadDelegate();
        kotlin.jvm.internal.f0.m(lookaheadDelegate);
        return lookaheadDelegate;
    }
}

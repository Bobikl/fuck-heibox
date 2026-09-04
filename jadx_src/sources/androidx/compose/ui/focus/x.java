package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import com.umeng.analytics.pro.ak;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/x;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusModifier;", "Lkotlin/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/runtime/collection/e;", "b", "focusModifier1", "focusModifier2", "", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class x implements Comparator<FocusModifier> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final x f13605b = new x();

    private x() {
    }

    private final androidx.compose.runtime.collection.e<LayoutNode> b(LayoutNode layoutNode) {
        androidx.compose.runtime.collection.e<LayoutNode> eVar = new androidx.compose.runtime.collection.e<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            eVar.a(0, layoutNode);
            layoutNode = layoutNode.v0();
        }
        return eVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@dl.e FocusModifier focusModifier1, @dl.e FocusModifier focusModifier2) {
        if (focusModifier1 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (focusModifier2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int i10 = 0;
        if (!w.g(focusModifier1) || !w.g(focusModifier2)) {
            return 0;
        }
        NodeCoordinator coordinator = focusModifier1.getCoordinator();
        LayoutNode layoutNode = coordinator != null ? coordinator.getLayoutNode() : null;
        if (layoutNode == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        NodeCoordinator coordinator2 = focusModifier2.getCoordinator();
        LayoutNode layoutNode2 = coordinator2 != null ? coordinator2.getLayoutNode() : null;
        if (layoutNode2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (f0.g(layoutNode, layoutNode2)) {
            return 0;
        }
        androidx.compose.runtime.collection.e<LayoutNode> eVarB = b(layoutNode);
        androidx.compose.runtime.collection.e<LayoutNode> eVarB2 = b(layoutNode2);
        int iMin = Math.min(eVarB.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1, eVarB2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
        if (iMin >= 0) {
            while (f0.g(eVarB.G()[i10], eVarB2.G()[i10])) {
                if (i10 != iMin) {
                    i10++;
                }
            }
            return f0.t(eVarB.G()[i10].getPlaceOrder(), eVarB2.G()[i10].getPlaceOrder());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }
}

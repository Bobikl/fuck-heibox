package androidx.compose.ui.node;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: MeasureScopeWithLayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"Landroidx/compose/ui/layout/n;", "scope", "", "Landroidx/compose/ui/layout/g0;", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "", "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class m0 {

    /* JADX INFO: compiled from: MeasureScopeWithLayoutNode.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15347a;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 3;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            f15347a = iArr;
        }
    }

    @dl.d
    public static final List<List<androidx.compose.ui.layout.g0>> a(@dl.d androidx.compose.ui.layout.n scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        LayoutNode layoutNode = ((l0) scope).getLayoutNode();
        boolean zB = b(layoutNode);
        List<LayoutNode> listX = layoutNode.X();
        ArrayList arrayList = new ArrayList(listX.size());
        int size = listX.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = listX.get(i10);
            arrayList.add(zB ? layoutNode2.T() : layoutNode2.U());
        }
        return arrayList;
    }

    private static final boolean b(LayoutNode layoutNode) {
        int i10 = a.f15347a[layoutNode.f0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LayoutNode layoutNodeV0 = layoutNode.v0();
        if (layoutNodeV0 != null) {
            return b(layoutNodeV0);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 {

    /* JADX INFO: compiled from: MeasureScope.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"androidx/compose/ui/layout/k0$a", "Landroidx/compose/ui/layout/j0;", "Lkotlin/b2;", "k", "", ak.av, "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", ak.aF, "Ljava/util/Map;", "i", "()Ljava/util/Map;", "alignmentLines", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Map<androidx.compose.ui.layout.a, Integer> alignmentLines;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l0 f15027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ yh.l<e1.a, b2> f15028f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<androidx.compose.ui.layout.a, Integer> map, l0 l0Var, yh.l<? super e1.a, b2> lVar) {
            this.f15026d = i10;
            this.f15027e = l0Var;
            this.f15028f = lVar;
            this.width = i10;
            this.height = i11;
            this.alignmentLines = map;
        }

        @Override // androidx.compose.ui.layout.j0
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.j0
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.j0
        @dl.d
        public Map<androidx.compose.ui.layout.a, Integer> i() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.j0
        public void k() {
            e1.a.Companion companion = e1.a.INSTANCE;
            int i10 = this.f15026d;
            LayoutDirection layoutDirection = this.f15027e.getLayoutDirection();
            l0 l0Var = this.f15027e;
            androidx.compose.ui.node.h0 h0Var = l0Var instanceof androidx.compose.ui.node.h0 ? (androidx.compose.ui.node.h0) l0Var : null;
            yh.l<e1.a, b2> lVar = this.f15028f;
            q qVar = e1.a.f15015e;
            int iN = companion.n();
            LayoutDirection layoutDirectionM = companion.m();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = e1.a.f15016f;
            e1.a.f15014d = i10;
            e1.a.f15013c = layoutDirection;
            boolean zJ = companion.J(h0Var);
            lVar.invoke(companion);
            if (h0Var != null) {
                h0Var.k2(zJ);
            }
            e1.a.f15014d = iN;
            e1.a.f15013c = layoutDirectionM;
            e1.a.f15015e = qVar;
            e1.a.f15016f = layoutNodeLayoutDelegate;
        }
    }

    @dl.d
    public static j0 a(l0 l0Var, int i10, int i11, @dl.d Map alignmentLines, @dl.d yh.l placementBlock) {
        kotlin.jvm.internal.f0.p(alignmentLines, "alignmentLines");
        kotlin.jvm.internal.f0.p(placementBlock, "placementBlock");
        return new a(i10, i11, alignmentLines, l0Var, placementBlock);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j0 p(l0 l0Var, int i10, int i11, Map map, yh.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = kotlin.collections.s0.z();
        }
        return l0Var.p1(i10, i11, map, lVar);
    }
}

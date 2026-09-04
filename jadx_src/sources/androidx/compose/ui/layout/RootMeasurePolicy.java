package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: RootMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$d;", "Landroidx/compose/ui/layout/l0;", "", "Landroidx/compose/ui/layout/g0;", "measurables", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.av, "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class RootMeasurePolicy extends LayoutNode.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final RootMeasurePolicy f14946b = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.i0
    @dl.d
    public j0 a(@dl.d l0 measure, @dl.d List<? extends g0> measurables, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        if (measurables.isEmpty()) {
            return k0.p(measure, s1.b.r(j10), s1.b.q(j10), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                public final void a(@dl.d e1.a layout) {
                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            }, 4, null);
        }
        if (measurables.size() == 1) {
            final e1 e1VarZ1 = measurables.get(0).z1(j10);
            return k0.p(measure, s1.c.g(j10, e1VarZ1.getWidth()), s1.c.f(j10, e1VarZ1.getHeight()), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                public final void a(@dl.d e1.a layout) {
                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                    e1.a.z(layout, e1VarZ1, 0, 0, 0.0f, null, 12, null);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(measurables.get(i10).z1(j10));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            e1 e1Var = (e1) arrayList.get(i11);
            iMax = Math.max(e1Var.getWidth(), iMax);
            iMax2 = Math.max(e1Var.getHeight(), iMax2);
        }
        return k0.p(measure, s1.c.g(j10, iMax), s1.c.f(j10, iMax2), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                List<e1> list = arrayList;
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    e1.a.z(layout, list.get(i12), 0, 0, 0.0f, null, 12, null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }
}

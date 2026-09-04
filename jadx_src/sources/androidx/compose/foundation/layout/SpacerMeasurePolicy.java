package androidx.compose.foundation.layout;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Spacer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/SpacerMeasurePolicy;", "Landroidx/compose/ui/layout/i0;", "Landroidx/compose/ui/layout/l0;", "", "Landroidx/compose/ui/layout/g0;", "measurables", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.av, "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class SpacerMeasurePolicy implements androidx.compose.ui.layout.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final SpacerMeasurePolicy f6152a = new SpacerMeasurePolicy();

    private SpacerMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.i0
    @dl.d
    public androidx.compose.ui.layout.j0 a(@dl.d androidx.compose.ui.layout.l0 measure, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        return androidx.compose.ui.layout.k0.p(measure, s1.b.n(j10) ? s1.b.p(j10) : 0, s1.b.l(j10) ? s1.b.o(j10) : 0, null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.SpacerMeasurePolicy$measure$1$1
            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.i0
    public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i10) {
        return androidx.compose.ui.layout.h0.c(this, nVar, list, i10);
    }

    @Override // androidx.compose.ui.layout.i0
    public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i10) {
        return androidx.compose.ui.layout.h0.d(this, nVar, list, i10);
    }

    @Override // androidx.compose.ui.layout.i0
    public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i10) {
        return androidx.compose.ui.layout.h0.a(this, nVar, list, i10);
    }

    @Override // androidx.compose.ui.layout.i0
    public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i10) {
        return androidx.compose.ui.layout.h0.b(this, nVar, list, i10);
    }
}

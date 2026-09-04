package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MultiContentMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/q0;", "measurePolicy", "Landroidx/compose/ui/layout/i0;", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class r0 {

    /* JADX INFO: compiled from: MultiContentMeasurePolicy.kt */
    @Metadata(bv = {}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"androidx/compose/ui/layout/r0$a", "Landroidx/compose/ui/layout/i0;", "Landroidx/compose/ui/layout/l0;", "", "Landroidx/compose/ui/layout/g0;", "measurables", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.av, "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", ak.aF, "width", "b", "e", "d", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0 f15038a;

        a(q0 q0Var) {
            this.f15038a = q0Var;
        }

        @Override // androidx.compose.ui.layout.i0
        @dl.d
        public j0 a(@dl.d l0 measure, @dl.d List<? extends g0> measurables, long j10) {
            kotlin.jvm.internal.f0.p(measure, "$this$measure");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return this.f15038a.a(measure, androidx.compose.ui.node.m0.a(measure), j10);
        }

        @Override // androidx.compose.ui.layout.i0
        public int b(@dl.d n nVar, @dl.d List<? extends m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(nVar, "<this>");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return this.f15038a.b(nVar, androidx.compose.ui.node.m0.a(nVar), i10);
        }

        @Override // androidx.compose.ui.layout.i0
        public int c(@dl.d n nVar, @dl.d List<? extends m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(nVar, "<this>");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return this.f15038a.c(nVar, androidx.compose.ui.node.m0.a(nVar), i10);
        }

        @Override // androidx.compose.ui.layout.i0
        public int d(@dl.d n nVar, @dl.d List<? extends m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(nVar, "<this>");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return this.f15038a.d(nVar, androidx.compose.ui.node.m0.a(nVar), i10);
        }

        @Override // androidx.compose.ui.layout.i0
        public int e(@dl.d n nVar, @dl.d List<? extends m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(nVar, "<this>");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return this.f15038a.e(nVar, androidx.compose.ui.node.m0.a(nVar), i10);
        }
    }

    @androidx.compose.ui.g
    @dl.d
    @kotlin.r0
    public static final i0 a(@dl.d q0 measurePolicy) {
        kotlin.jvm.internal.f0.p(measurePolicy, "measurePolicy");
        return new a(measurePolicy);
    }
}

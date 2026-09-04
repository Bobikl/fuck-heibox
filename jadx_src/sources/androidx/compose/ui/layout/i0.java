package androidx.compose.ui.layout;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bç\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/i0;", "", "Landroidx/compose/ui/layout/l0;", "", "Landroidx/compose/ui/layout/g0;", "measurables", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.av, "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", ak.aF, "width", "b", "e", "d", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface i0 {

    /* JADX INFO: compiled from: MeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static int a(@dl.d i0 i0Var, @dl.d n receiver, @dl.d List<? extends m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return h0.a(i0Var, receiver, measurables, i10);
        }

        @Deprecated
        public static int b(@dl.d i0 i0Var, @dl.d n receiver, @dl.d List<? extends m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return h0.b(i0Var, receiver, measurables, i10);
        }

        @Deprecated
        public static int c(@dl.d i0 i0Var, @dl.d n receiver, @dl.d List<? extends m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return h0.c(i0Var, receiver, measurables, i10);
        }

        @Deprecated
        public static int d(@dl.d i0 i0Var, @dl.d n receiver, @dl.d List<? extends m> measurables, int i10) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return h0.d(i0Var, receiver, measurables, i10);
        }
    }

    @dl.d
    j0 a(@dl.d l0 l0Var, @dl.d List<? extends g0> list, long j10);

    int b(@dl.d n nVar, @dl.d List<? extends m> list, int i10);

    int c(@dl.d n nVar, @dl.d List<? extends m> list, int i10);

    int d(@dl.d n nVar, @dl.d List<? extends m> list, int i10);

    int e(@dl.d n nVar, @dl.d List<? extends m> list, int i10);
}

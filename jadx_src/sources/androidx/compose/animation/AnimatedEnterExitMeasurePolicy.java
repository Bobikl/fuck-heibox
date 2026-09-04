package androidx.compose.animation;

import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/i0;", "Landroidx/compose/ui/layout/l0;", "", "Landroidx/compose/ui/layout/g0;", "measurables", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.av, "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", ak.aF, "width", "b", "e", "d", "Landroidx/compose/animation/d;", "Landroidx/compose/animation/d;", "f", "()Landroidx/compose/animation/d;", "scope", "<init>", "(Landroidx/compose/animation/d;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class AnimatedEnterExitMeasurePolicy implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d scope;

    public AnimatedEnterExitMeasurePolicy(@dl.d d scope) {
        f0.p(scope, "scope");
        this.scope = scope;
    }

    @Override // androidx.compose.ui.layout.i0
    @dl.d
    public j0 a(@dl.d l0 measure, @dl.d List<? extends g0> measurables, long j10) {
        Object obj;
        f0.p(measure, "$this$measure");
        f0.p(measurables, "measurables");
        final ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(measurables, 10));
        Iterator<T> it = measurables.iterator();
        while (it.hasNext()) {
            arrayList.add(((g0) it.next()).z1(j10));
        }
        Object obj2 = null;
        int i10 = 1;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int width = ((e1) obj).getWidth();
            int iG = CollectionsKt__CollectionsKt.G(arrayList);
            if (1 <= iG) {
                int i11 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i11);
                    int width2 = ((e1) obj3).getWidth();
                    if (width < width2) {
                        obj = obj3;
                        width = width2;
                    }
                    if (i11 == iG) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            obj = null;
        }
        e1 e1Var = (e1) obj;
        int width3 = e1Var != null ? e1Var.getWidth() : 0;
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int height = ((e1) obj4).getHeight();
            int iG2 = CollectionsKt__CollectionsKt.G(arrayList);
            if (1 <= iG2) {
                while (true) {
                    Object obj5 = arrayList.get(i10);
                    int height2 = ((e1) obj5).getHeight();
                    if (height < height2) {
                        obj4 = obj5;
                        height = height2;
                    }
                    if (i10 == iG2) {
                        break;
                    }
                    i10++;
                }
            }
            obj2 = obj4;
        }
        e1 e1Var2 = (e1) obj2;
        int height3 = e1Var2 != null ? e1Var2.getHeight() : 0;
        this.scope.c().setValue(s1.r.b(s1.s.a(width3, height3)));
        return k0.p(measure, width3, height3, null, new yh.l<e1.a, b2>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                f0.p(layout, "$this$layout");
                List<e1> list = arrayList;
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    e1.a.p(layout, list.get(i12), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.i0
    public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, final int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.C1(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(measurables), new yh.l<androidx.compose.ui.layout.m, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d androidx.compose.ui.layout.m it) {
                f0.p(it, "it");
                return Integer.valueOf(it.L0(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.i0
    public int c(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, final int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.C1(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(measurables), new yh.l<androidx.compose.ui.layout.m, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d androidx.compose.ui.layout.m it) {
                f0.p(it, "it");
                return Integer.valueOf(it.l1(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.i0
    public int d(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, final int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.C1(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(measurables), new yh.l<androidx.compose.ui.layout.m, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d androidx.compose.ui.layout.m it) {
                f0.p(it, "it");
                return Integer.valueOf(it.V(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.i0
    public int e(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, final int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.C1(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(measurables), new yh.l<androidx.compose.ui.layout.m, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d androidx.compose.ui.layout.m it) {
                f0.p(it, "it");
                return Integer.valueOf(it.w1(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getScope() {
        return this.scope;
    }
}

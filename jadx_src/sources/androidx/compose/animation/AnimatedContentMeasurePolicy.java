package androidx.compose.animation;

import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u001b\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00148\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/i0;", "Landroidx/compose/ui/layout/l0;", "", "Landroidx/compose/ui/layout/g0;", "measurables", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.av, "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", ak.aF, "width", "b", "e", "d", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/AnimatedContentScope;", "f", "()Landroidx/compose/animation/AnimatedContentScope;", "rootScope", "<init>", "(Landroidx/compose/animation/AnimatedContentScope;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class AnimatedContentMeasurePolicy implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AnimatedContentScope<?> rootScope;

    public AnimatedContentMeasurePolicy(@dl.d AnimatedContentScope<?> rootScope) {
        f0.p(rootScope, "rootScope");
        this.rootScope = rootScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.i0
    @dl.d
    public j0 a(@dl.d l0 measure, @dl.d List<? extends g0> measurables, long j10) {
        e1 e1Var;
        e1 e1Var2;
        f0.p(measure, "$this$measure");
        f0.p(measurables, "measurables");
        int size = measurables.size();
        final e1[] e1VarArr = new e1[size];
        int size2 = measurables.size();
        int i10 = 0;
        while (true) {
            e1Var = null;
            if (i10 >= size2) {
                break;
            }
            g0 g0Var = measurables.get(i10);
            Object objB = g0Var.b();
            AnimatedContentScope.ChildData childData = objB instanceof AnimatedContentScope.ChildData ? (AnimatedContentScope.ChildData) objB : null;
            if (childData != null && childData.e()) {
                e1VarArr[i10] = g0Var.z1(j10);
            }
            i10++;
        }
        int size3 = measurables.size();
        for (int i11 = 0; i11 < size3; i11++) {
            g0 g0Var2 = measurables.get(i11);
            if (e1VarArr[i11] == null) {
                e1VarArr[i11] = g0Var2.z1(j10);
            }
        }
        if ((size == 0) == true) {
            e1Var2 = null;
        } else {
            e1Var2 = e1VarArr[0];
            int iXe = ArraysKt___ArraysKt.Xe(e1VarArr);
            if (iXe != 0) {
                int width = e1Var2 != null ? e1Var2.getWidth() : 0;
                k0 it = new fi.l(1, iXe).iterator();
                while (it.hasNext()) {
                    e1 e1Var3 = e1VarArr[it.nextInt()];
                    int width2 = e1Var3 != null ? e1Var3.getWidth() : 0;
                    if (width < width2) {
                        e1Var2 = e1Var3;
                        width = width2;
                    }
                }
            }
        }
        final int width3 = e1Var2 != null ? e1Var2.getWidth() : 0;
        if ((size == 0) == false) {
            e1Var = e1VarArr[0];
            int iXe2 = ArraysKt___ArraysKt.Xe(e1VarArr);
            if (iXe2 != 0) {
                int height = e1Var != null ? e1Var.getHeight() : 0;
                k0 it2 = new fi.l(1, iXe2).iterator();
                while (it2.hasNext()) {
                    e1 e1Var4 = e1VarArr[it2.nextInt()];
                    int height2 = e1Var4 != null ? e1Var4.getHeight() : 0;
                    if (height < height2) {
                        e1Var = e1Var4;
                        height = height2;
                    }
                }
            }
        }
        final int height3 = e1Var != null ? e1Var.getHeight() : 0;
        this.rootScope.v(s1.s.a(width3, height3));
        return androidx.compose.ui.layout.k0.p(measure, width3, height3, null, new yh.l<e1.a, b2>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                f0.p(layout, "$this$layout");
                e1[] e1VarArr2 = e1VarArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i12 = width3;
                int i13 = height3;
                for (e1 e1Var5 : e1VarArr2) {
                    if (e1Var5 != null) {
                        long jA = animatedContentMeasurePolicy.f().getContentAlignment().a(s1.s.a(e1Var5.getWidth(), e1Var5.getHeight()), s1.s.a(i12, i13), LayoutDirection.Ltr);
                        e1.a.p(layout, e1Var5, s1.n.m(jA), s1.n.o(jA), 0.0f, 4, null);
                    }
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
        Integer num = (Integer) SequencesKt___SequencesKt.C1(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(measurables), new yh.l<androidx.compose.ui.layout.m, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$minIntrinsicHeight$1
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
        Integer num = (Integer) SequencesKt___SequencesKt.C1(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(measurables), new yh.l<androidx.compose.ui.layout.m, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$minIntrinsicWidth$1
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
        Integer num = (Integer) SequencesKt___SequencesKt.C1(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(measurables), new yh.l<androidx.compose.ui.layout.m, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$maxIntrinsicHeight$1
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
        Integer num = (Integer) SequencesKt___SequencesKt.C1(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(measurables), new yh.l<androidx.compose.ui.layout.m, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$maxIntrinsicWidth$1
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
    public final AnimatedContentScope<?> f() {
        return this.rootScope;
    }
}

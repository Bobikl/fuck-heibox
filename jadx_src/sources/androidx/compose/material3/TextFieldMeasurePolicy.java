package androidx.compose.material3;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J8\u0010\t\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\u0002J<\u0010\f\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\u0002J/\u0010\u0012\u001a\u00020\u0011*\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\"\u0010\u0015\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\"\u0010\u0016\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010\u0017\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/i0;", "", "Landroidx/compose/ui/layout/m;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "j", "Landroidx/compose/ui/layout/n;", "width", "i", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.av, "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "d", "b", "e", ak.aF, "", "Z", "singleLine", "", "F", "animationProgress", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/foundation/layout/m0;", "paddingValues", "<init>", "(ZFLandroidx/compose/foundation/layout/m0;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class TextFieldMeasurePolicy implements androidx.compose.ui.layout.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float animationProgress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.layout.m0 paddingValues;

    public TextFieldMeasurePolicy(boolean z10, float f10, @dl.d androidx.compose.foundation.layout.m0 paddingValues) {
        kotlin.jvm.internal.f0.p(paddingValues, "paddingValues");
        this.singleLine = z10;
        this.animationProgress = f10;
        this.paddingValues = paddingValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int i(androidx.compose.ui.layout.n nVar, List<? extends androidx.compose.ui.layout.m> list, int i10, yh.p<? super androidx.compose.ui.layout.m, ? super Integer, Integer> pVar) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        for (Object obj2 : list) {
            if (kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) obj2), TextFieldImplKt.f11414a)) {
                int iIntValue = pVar.invoke(obj2, Integer.valueOf(i10)).intValue();
                Iterator<T> it = list.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) next), "Label"));
                androidx.compose.ui.layout.m mVar = (androidx.compose.ui.layout.m) next;
                int iIntValue2 = mVar != null ? pVar.invoke(mVar, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) next2), TextFieldImplKt.f11418e));
                androidx.compose.ui.layout.m mVar2 = (androidx.compose.ui.layout.m) next2;
                int iIntValue3 = mVar2 != null ? pVar.invoke(mVar2, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) next3), TextFieldImplKt.f11417d));
                androidx.compose.ui.layout.m mVar3 = (androidx.compose.ui.layout.m) next3;
                int iIntValue4 = mVar3 != null ? pVar.invoke(mVar3, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it4 = list.iterator();
                do {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (!kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) next4), TextFieldImplKt.f11415b));
                androidx.compose.ui.layout.m mVar4 = (androidx.compose.ui.layout.m) next4;
                int iIntValue5 = mVar4 != null ? pVar.invoke(mVar4, Integer.valueOf(i10)).intValue() : 0;
                for (Object obj3 : list) {
                    if (kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) obj3), TextFieldImplKt.f11419f)) {
                        obj = obj3;
                        break;
                    }
                }
                androidx.compose.ui.layout.m mVar5 = (androidx.compose.ui.layout.m) obj;
                return TextFieldKt.h(iIntValue, iIntValue2 > 0, iIntValue2, iIntValue4, iIntValue3, iIntValue5, mVar5 != null ? pVar.invoke(mVar5, Integer.valueOf(i10)).intValue() : 0, TextFieldImplKt.h(), nVar.getF139217b(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int j(List<? extends androidx.compose.ui.layout.m> list, int i10, yh.p<? super androidx.compose.ui.layout.m, ? super Integer, Integer> pVar) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        for (Object obj2 : list) {
            if (kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) obj2), TextFieldImplKt.f11414a)) {
                int iIntValue = pVar.invoke(obj2, Integer.valueOf(i10)).intValue();
                Iterator<T> it = list.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) next), "Label"));
                androidx.compose.ui.layout.m mVar = (androidx.compose.ui.layout.m) next;
                int iIntValue2 = mVar != null ? pVar.invoke(mVar, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) next2), TextFieldImplKt.f11418e));
                androidx.compose.ui.layout.m mVar2 = (androidx.compose.ui.layout.m) next2;
                int iIntValue3 = mVar2 != null ? pVar.invoke(mVar2, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) next3), TextFieldImplKt.f11417d));
                androidx.compose.ui.layout.m mVar3 = (androidx.compose.ui.layout.m) next3;
                int iIntValue4 = mVar3 != null ? pVar.invoke(mVar3, Integer.valueOf(i10)).intValue() : 0;
                for (Object obj3 : list) {
                    if (kotlin.jvm.internal.f0.g(TextFieldImplKt.e((androidx.compose.ui.layout.m) obj3), TextFieldImplKt.f11415b)) {
                        obj = obj3;
                        break;
                    }
                }
                androidx.compose.ui.layout.m mVar4 = (androidx.compose.ui.layout.m) obj;
                return TextFieldKt.i(iIntValue4, iIntValue3, iIntValue, iIntValue2, mVar4 != null ? pVar.invoke(mVar4, Integer.valueOf(i10)).intValue() : 0, TextFieldImplKt.h());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.i0
    @dl.d
    public androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.l0 measure, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
        Object next;
        Object next2;
        Object next3;
        int iV;
        Object obj;
        Object next4;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        final int iE1 = measure.e1(textFieldMeasurePolicy.paddingValues.getTop());
        int iE2 = measure.e1(textFieldMeasurePolicy.paddingValues.getBottom());
        final int iE3 = measure.e1(TextFieldKt.m());
        long jE = s1.b.e(j10, 0, 0, 0, 0, 10, null);
        Iterator<T> it = measurables.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a((androidx.compose.ui.layout.g0) next), TextFieldImplKt.f11417d));
        androidx.compose.ui.layout.g0 g0Var = (androidx.compose.ui.layout.g0) next;
        final androidx.compose.ui.layout.e1 e1VarZ1 = g0Var != null ? g0Var.z1(jE) : null;
        int iJ = TextFieldImplKt.j(e1VarZ1) + 0;
        int iMax = Math.max(0, TextFieldImplKt.i(e1VarZ1));
        Iterator<T> it2 = measurables.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a((androidx.compose.ui.layout.g0) next2), TextFieldImplKt.f11418e));
        androidx.compose.ui.layout.g0 g0Var2 = (androidx.compose.ui.layout.g0) next2;
        androidx.compose.ui.layout.e1 e1VarZ2 = g0Var2 != null ? g0Var2.z1(s1.c.j(jE, -iJ, 0, 2, null)) : null;
        int iJ2 = iJ + TextFieldImplKt.j(e1VarZ2);
        int iMax2 = Math.max(iMax, TextFieldImplKt.i(e1VarZ2));
        int i10 = -iJ2;
        long jI = s1.c.i(jE, i10, -iE2);
        Iterator<T> it3 = measurables.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a((androidx.compose.ui.layout.g0) next3), "Label"));
        androidx.compose.ui.layout.g0 g0Var3 = (androidx.compose.ui.layout.g0) next3;
        androidx.compose.ui.layout.e1 e1VarZ3 = g0Var3 != null ? g0Var3.z1(jI) : null;
        if (e1VarZ3 != null) {
            iV = e1VarZ3.v(AlignmentLineKt.b());
            if (iV == Integer.MIN_VALUE) {
                iV = e1VarZ3.getHeight();
            }
        } else {
            iV = 0;
        }
        final int iMax3 = Math.max(iV, iE1);
        int i11 = e1VarZ3 != null ? iMax3 + iE3 : iE1;
        long jI2 = s1.c.i(s1.b.e(j10, 0, 0, 0, 0, 11, null), i10, (-i11) - iE2);
        Iterator it4 = measurables.iterator();
        while (it4.hasNext()) {
            androidx.compose.ui.layout.g0 g0Var4 = (androidx.compose.ui.layout.g0) it4.next();
            Iterator it5 = it4;
            if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var4), TextFieldImplKt.f11414a)) {
                final androidx.compose.ui.layout.e1 e1VarZ4 = g0Var4.z1(jI2);
                long jE2 = s1.b.e(jI2, 0, 0, 0, 0, 14, null);
                Iterator it6 = measurables.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next5 = it6.next();
                    Iterator it7 = it6;
                    if (kotlin.jvm.internal.f0.g(LayoutIdKt.a((androidx.compose.ui.layout.g0) next5), TextFieldImplKt.f11415b)) {
                        obj = next5;
                        break;
                    }
                    it6 = it7;
                }
                androidx.compose.ui.layout.g0 g0Var5 = (androidx.compose.ui.layout.g0) obj;
                androidx.compose.ui.layout.e1 e1VarZ5 = g0Var5 != null ? g0Var5.z1(jE2) : null;
                long jE3 = s1.b.e(s1.c.j(jE, 0, -Math.max(iMax2, Math.max(TextFieldImplKt.i(e1VarZ4), TextFieldImplKt.i(e1VarZ5)) + i11 + iE2), 1, null), 0, 0, 0, 0, 11, null);
                Iterator<T> it8 = measurables.iterator();
                do {
                    if (!it8.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it8.next();
                } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a((androidx.compose.ui.layout.g0) next4), TextFieldImplKt.f11419f));
                androidx.compose.ui.layout.g0 g0Var6 = (androidx.compose.ui.layout.g0) next4;
                final androidx.compose.ui.layout.e1 e1VarZ6 = g0Var6 != null ? g0Var6.z1(jE3) : null;
                int i12 = TextFieldImplKt.i(e1VarZ6);
                final int i13 = TextFieldKt.i(TextFieldImplKt.j(e1VarZ1), TextFieldImplKt.j(e1VarZ2), e1VarZ4.getWidth(), TextFieldImplKt.j(e1VarZ3), TextFieldImplKt.j(e1VarZ5), j10);
                final int iH = TextFieldKt.h(e1VarZ4.getHeight(), e1VarZ3 != null, iMax3, TextFieldImplKt.i(e1VarZ1), TextFieldImplKt.i(e1VarZ2), TextFieldImplKt.i(e1VarZ5), TextFieldImplKt.i(e1VarZ6), j10, measure.getF139217b(), textFieldMeasurePolicy.paddingValues);
                int i14 = iH - i12;
                for (androidx.compose.ui.layout.g0 g0Var7 : measurables) {
                    if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var7), TextFieldImplKt.f11420g)) {
                        final androidx.compose.ui.layout.e1 e1VarZ7 = g0Var7.z1(s1.c.a(i13 != Integer.MAX_VALUE ? i13 : 0, i13, i14 != Integer.MAX_VALUE ? i14 : 0, i14));
                        final androidx.compose.ui.layout.e1 e1Var = e1VarZ3;
                        final int i15 = iV;
                        final androidx.compose.ui.layout.e1 e1Var2 = e1VarZ5;
                        final androidx.compose.ui.layout.e1 e1Var3 = e1VarZ2;
                        return androidx.compose.ui.layout.k0.p(measure, i13, iH, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                if (e1Var == null) {
                                    TextFieldKt.o(layout, i13, iH, e1VarZ4, e1Var2, e1VarZ1, e1Var3, e1VarZ7, e1VarZ6, this.singleLine, measure.getF139217b(), this.paddingValues);
                                    return;
                                }
                                int iU = fi.u.u(iE1 - i15, 0);
                                TextFieldKt.n(layout, i13, iH, e1VarZ4, e1Var, e1Var2, e1VarZ1, e1Var3, e1VarZ7, e1VarZ6, this.singleLine, iU, iE3 + iMax3, this.animationProgress, measure.getF139217b());
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                a(aVar);
                                return kotlin.b2.f124493a;
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            textFieldMeasurePolicy = this;
            it4 = it5;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.i0
    public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        return i(nVar, measurables, i10, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$minIntrinsicHeight$1
            @dl.d
            public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicMeasurable, int i11) {
                kotlin.jvm.internal.f0.p(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.L0(i11));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        });
    }

    @Override // androidx.compose.ui.layout.i0
    public int c(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        return j(measurables, i10, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$minIntrinsicWidth$1
            @dl.d
            public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicMeasurable, int i11) {
                kotlin.jvm.internal.f0.p(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.l1(i11));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        });
    }

    @Override // androidx.compose.ui.layout.i0
    public int d(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        return i(nVar, measurables, i10, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$maxIntrinsicHeight$1
            @dl.d
            public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicMeasurable, int i11) {
                kotlin.jvm.internal.f0.p(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.V(i11));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        });
    }

    @Override // androidx.compose.ui.layout.i0
    public int e(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        return j(measurables, i10, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$maxIntrinsicWidth$1
            @dl.d
            public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicMeasurable, int i11) {
                kotlin.jvm.internal.f0.p(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.w1(i11));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        });
    }
}

package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÚ\u0001\u0010&\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2/\u0010$\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"\u0012\u0004\u0012\u00020#0\u001eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001ap\u00102\u001a\b\u0012\u0004\u0012\u000201002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/z;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/x;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/a0;", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Ls1/b;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$d;", "horizontalArrangement", "reverseLayout", "Ls1/e;", "density", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/e1$a;", "Lkotlin/b2;", "Lkotlin/t;", "Landroidx/compose/ui/layout/j0;", com.google.android.exoplayer2.text.ttml.d.f49813w, "Landroidx/compose/foundation/lazy/grid/o;", ak.aF, "(ILandroidx/compose/foundation/lazy/grid/z;Landroidx/compose/foundation/lazy/grid/x;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/layout/Arrangement$d;ZLs1/e;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Lyh/q;)Landroidx/compose/foundation/lazy/grid/o;", "", "Landroidx/compose/foundation/lazy/grid/y;", "lines", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "Landroidx/compose/foundation/lazy/grid/q;", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyGridMeasureKt {
    private static final List<q> a(List<y> list, int i10, int i11, int i12, int i13, int i14, boolean z10, Arrangement.l lVar, Arrangement.d dVar, boolean z11, s1.e eVar) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        int size = list.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += list.get(i16).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z12) {
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i17 = 0; i17 < size2; i17++) {
                iArr[i17] = list.get(b(i17, z11, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                iArr2[i18] = 0;
            }
            if (z10) {
                if (lVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                lVar.c(eVar, i15, iArr, iArr2);
            } else {
                if (dVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                dVar.b(eVar, i15, iArr, LayoutDirection.Ltr, iArr2);
            }
            fi.j jVarMe = ArraysKt___ArraysKt.Me(iArr2);
            if (z11) {
                jVarMe = fi.u.q1(jVarMe);
            }
            int iH = jVarMe.h();
            int i19 = jVarMe.i();
            int iJ = jVarMe.j();
            if ((iJ > 0 && iH <= i19) || (iJ < 0 && i19 <= iH)) {
                while (true) {
                    int mainAxisSize = iArr2[iH];
                    y yVar = list.get(b(iH, z11, size2));
                    if (z11) {
                        mainAxisSize = (i15 - mainAxisSize) - yVar.getMainAxisSize();
                    }
                    arrayList.addAll(yVar.f(mainAxisSize, i10, i11));
                    if (iH == i19) {
                        break;
                    }
                    iH += iJ;
                }
            }
        } else {
            int size3 = list.size();
            int mainAxisSizeWithSpacings = i14;
            for (int i20 = 0; i20 < size3; i20++) {
                y yVar2 = list.get(i20);
                arrayList.addAll(yVar2.f(mainAxisSizeWithSpacings, i10, i11));
                mainAxisSizeWithSpacings += yVar2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int b(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01bf A[ADDED_TO_REGION, EDGE_INSN: B:121:0x01bf->B:80:0x01bf BREAK  A[LOOP:4: B:73:0x019f->B:79:0x01b5], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x017e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0182  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:66:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0210  */
    /* JADX WARN: Code duplicated, block: B:91:0x0213  */
    /* JADX WARN: Code duplicated, block: B:94:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:0x022e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0246  */
    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final o c(int i10, @dl.d z measuredLineProvider, @dl.d x measuredItemProvider, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, boolean z10, @dl.e Arrangement.l lVar, @dl.e Arrangement.d dVar, boolean z11, @dl.d s1.e density, @dl.d LazyGridItemPlacementAnimator placementAnimator, @dl.d LazyGridSpanLayoutProvider spanLayoutProvider, @dl.d yh.q<? super Integer, ? super Integer, ? super yh.l<? super e1.a, b2>, ? extends j0> layout) {
        int iC;
        int i17;
        int i18;
        float f11;
        int i19;
        y yVar;
        int size;
        int i20;
        y yVar2;
        int iG;
        int iO;
        int i21;
        int i22;
        boolean z12;
        Orientation orientation;
        f0.p(measuredLineProvider, "measuredLineProvider");
        f0.p(measuredItemProvider, "measuredItemProvider");
        f0.p(density, "density");
        f0.p(placementAnimator, "placementAnimator");
        f0.p(spanLayoutProvider, "spanLayoutProvider");
        f0.p(layout, "layout");
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i10 <= 0) {
            return new o(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(s1.b.r(j10)), Integer.valueOf(s1.b.q(j10)), new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1
                public final void a(@dl.d e1.a invoke) {
                    f0.p(invoke, "$this$invoke");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            }), CollectionsKt__CollectionsKt.E(), -i12, i11 + i13, 0, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i13);
        }
        int iL0 = di.d.L0(f10);
        int i23 = i16 - iL0;
        if (a0.f(i15, a0.c(0)) && i23 < 0) {
            iL0 += i23;
            i23 = 0;
        }
        ArrayList arrayList = new ArrayList();
        int i24 = -i12;
        int i25 = i24 + (i14 < 0 ? i14 : 0);
        int i26 = i24;
        int mainAxisSizeWithSpacings = i23 + i25;
        int i27 = i15;
        while (mainAxisSizeWithSpacings < 0 && i27 - a0.c(0) > 0) {
            int iC2 = a0.c(i27 - 1);
            y yVarB = measuredLineProvider.b(iC2);
            arrayList.add(0, yVarB);
            mainAxisSizeWithSpacings += yVarB.getMainAxisSizeWithSpacings();
            i27 = iC2;
        }
        if (mainAxisSizeWithSpacings < i25) {
            iL0 += mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i25;
        }
        int i28 = mainAxisSizeWithSpacings - i25;
        int i29 = i11 + i13;
        int i30 = i27;
        int iU = fi.u.u(i29, 0);
        int mainAxisSizeWithSpacings2 = -i28;
        int size2 = arrayList.size();
        int iC3 = i30;
        for (int i31 = 0; i31 < size2; i31++) {
            y yVar3 = (y) arrayList.get(i31);
            iC3 = a0.c(iC3 + 1);
            mainAxisSizeWithSpacings2 += yVar3.getMainAxisSizeWithSpacings();
        }
        int mainAxisSizeWithSpacings3 = i28;
        int i32 = i29;
        int mainAxisSizeWithSpacings4 = mainAxisSizeWithSpacings2;
        int iC4 = iC3;
        while (true) {
            if (mainAxisSizeWithSpacings4 > iU && !arrayList.isEmpty()) {
                break;
            }
            int i33 = iU;
            y yVarB2 = measuredLineProvider.b(iC4);
            if (yVarB2.e()) {
                a0.c(iC4 - 1);
                break;
            }
            int i34 = i32;
            int i35 = i26;
            mainAxisSizeWithSpacings4 += yVarB2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings4 > i25 || ((w) ArraysKt___ArraysKt.bi(yVarB2.getItems())).getIndex() == i10 - 1) {
                arrayList.add(yVarB2);
                iC = i30;
            } else {
                iC = a0.c(iC4 + 1);
                mainAxisSizeWithSpacings3 -= yVarB2.getMainAxisSizeWithSpacings();
            }
            iC4 = a0.c(iC4 + 1);
            i30 = iC;
            iU = i33;
            i26 = i35;
            i32 = i34;
        }
        if (mainAxisSizeWithSpacings4 < i11) {
            int i36 = i11 - mainAxisSizeWithSpacings4;
            mainAxisSizeWithSpacings3 -= i36;
            mainAxisSizeWithSpacings4 += i36;
            int iC5 = i30;
            while (true) {
                i17 = 0;
                if (mainAxisSizeWithSpacings3 >= i12 || iC5 - a0.c(0) <= 0) {
                    break;
                }
                iC5 = a0.c(iC5 - 1);
                y yVarB3 = measuredLineProvider.b(iC5);
                arrayList.add(0, yVarB3);
                mainAxisSizeWithSpacings3 += yVarB3.getMainAxisSizeWithSpacings();
            }
            iL0 += i36;
            if (mainAxisSizeWithSpacings3 < 0) {
                iL0 += mainAxisSizeWithSpacings3;
                i18 = mainAxisSizeWithSpacings4 + mainAxisSizeWithSpacings3;
                mainAxisSizeWithSpacings3 = 0;
            }
            if (di.d.U(di.d.L0(f10)) == di.d.U(iL0) || Math.abs(di.d.L0(f10)) < Math.abs(iL0)) {
                f11 = f10;
            } else {
                f11 = iL0;
            }
            if (mainAxisSizeWithSpacings3 >= 0) {
                i19 = 1;
            } else {
                i19 = i17;
            }
            if (i19 != 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i37 = -mainAxisSizeWithSpacings3;
            yVar = (y) CollectionsKt___CollectionsKt.w2(arrayList);
            if (i12 <= 0 || i14 < 0) {
                size = arrayList.size();
                y yVar4 = yVar;
                i20 = i17;
                while (i20 < size) {
                    int mainAxisSizeWithSpacings5 = ((y) arrayList.get(i20)).getMainAxisSizeWithSpacings();
                    if (mainAxisSizeWithSpacings3 != 0 || mainAxisSizeWithSpacings5 > mainAxisSizeWithSpacings3 || i20 == CollectionsKt__CollectionsKt.G(arrayList)) {
                        break;
                    }
                    mainAxisSizeWithSpacings3 -= mainAxisSizeWithSpacings5;
                    i20++;
                    yVar4 = (y) arrayList.get(i20);
                }
                yVar2 = yVar4;
            } else {
                yVar2 = yVar;
            }
            int i38 = mainAxisSizeWithSpacings3;
            if (z10) {
                iG = s1.b.p(j10);
            } else {
                iG = s1.c.g(j10, i18);
            }
            int i39 = iG;
            if (z10) {
                iO = s1.c.f(j10, i18);
            } else {
                iO = s1.b.o(j10);
            }
            int i40 = iO;
            i21 = i17;
            int i41 = i26;
            int i42 = i32;
            float f12 = f11;
            final List<q> listA = a(arrayList, i39, i40, i18, i11, i37, z10, lVar, dVar, z11, density);
            i22 = i18;
            placementAnimator.e((int) f12, i39, i40, z11, listA, measuredItemProvider, spanLayoutProvider);
            if (i22 > i11) {
                z12 = 1;
            } else {
                z12 = i21;
            }
            j0 j0VarInvoke = layout.invoke(Integer.valueOf(i39), Integer.valueOf(i40), new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d e1.a invoke) {
                    f0.p(invoke, "$this$invoke");
                    List<q> list = listA;
                    int size3 = list.size();
                    for (int i43 = 0; i43 < size3; i43++) {
                        list.get(i43).p(invoke);
                    }
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            });
            if (z10) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            return new o(yVar2, i38, z12, f12, j0VarInvoke, listA, i41, i42, i10, z11, orientation, i13);
        }
        i17 = 0;
        i18 = mainAxisSizeWithSpacings4;
        if (di.d.U(di.d.L0(f10)) == di.d.U(iL0)) {
            f11 = f10;
        } else {
            f11 = f10;
        }
        if (mainAxisSizeWithSpacings3 >= 0) {
            i19 = 1;
        } else {
            i19 = i17;
        }
        if (i19 != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i310 = -mainAxisSizeWithSpacings3;
        yVar = (y) CollectionsKt___CollectionsKt.w2(arrayList);
        if (i12 <= 0) {
            size = arrayList.size();
            y yVar5 = yVar;
            i20 = i17;
            while (i20 < size) {
                int mainAxisSizeWithSpacings6 = ((y) arrayList.get(i20)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings3 != 0) {
                    break;
                }
                break;
            }
            yVar2 = yVar5;
        } else {
            size = arrayList.size();
            y yVar6 = yVar;
            i20 = i17;
            while (i20 < size) {
                int mainAxisSizeWithSpacings7 = ((y) arrayList.get(i20)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings3 != 0) {
                    break;
                    break;
                }
                break;
                break;
            }
            yVar2 = yVar6;
        }
        int i311 = mainAxisSizeWithSpacings3;
        if (z10) {
            iG = s1.b.p(j10);
        } else {
            iG = s1.c.g(j10, i18);
        }
        int i312 = iG;
        if (z10) {
            iO = s1.c.f(j10, i18);
        } else {
            iO = s1.b.o(j10);
        }
        int i43 = iO;
        i21 = i17;
        int i44 = i26;
        int i45 = i32;
        float f13 = f11;
        final List<q> listA2 = a(arrayList, i312, i43, i18, i11, i310, z10, lVar, dVar, z11, density);
        i22 = i18;
        placementAnimator.e((int) f13, i312, i43, z11, listA2, measuredItemProvider, spanLayoutProvider);
        if (i22 > i11) {
            z12 = 1;
        } else {
            z12 = i21;
        }
        j0 j0VarInvoke2 = layout.invoke(Integer.valueOf(i312), Integer.valueOf(i43), new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d e1.a invoke) {
                f0.p(invoke, "$this$invoke");
                List<q> list = listA2;
                int size3 = list.size();
                for (int i46 = 0; i46 < size3; i46++) {
                    list.get(i46).p(invoke);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        });
        if (z10) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        return new o(yVar2, i311, z12, f13, j0VarInvoke2, listA2, i44, i45, i10, z11, orientation, i13);
    }
}

package androidx.compose.foundation.lazy;

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

/* JADX INFO: compiled from: LazyListMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aà\u0001\u0010&\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2/\u0010$\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"\u0012\u0004\u0012\u00020#0\u001eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a\u008c\u0001\u00103\u001a\b\u0012\u0004\u0012\u000202012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00112\f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00112\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/z;", "itemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "Landroidx/compose/foundation/lazy/b;", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Ls1/b;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$d;", "horizontalArrangement", "reverseLayout", "Ls1/e;", "density", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/i;", "beyondBoundsInfo", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/e1$a;", "Lkotlin/b2;", "Lkotlin/t;", "Landroidx/compose/ui/layout/j0;", com.google.android.exoplayer2.text.ttml.d.f49813w, "Landroidx/compose/foundation/lazy/r;", ak.aF, "(ILandroidx/compose/foundation/lazy/z;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/layout/Arrangement$d;ZLs1/e;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/i;Lyh/q;)Landroidx/compose/foundation/lazy/r;", "Landroidx/compose/foundation/lazy/y;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "", "Landroidx/compose/foundation/lazy/v;", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyListMeasureKt {
    private static final List<v> a(List<y> list, List<y> list2, List<y> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, Arrangement.l lVar, Arrangement.d dVar, boolean z11, s1.e eVar) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i16 = 0; i16 < size; i16++) {
                iArr[i16] = list.get(b(i16, z11, size)).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            }
            int[] iArr2 = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr2[i17] = 0;
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
            int i18 = jVarMe.i();
            int iJ = jVarMe.j();
            if ((iJ > 0 && iH <= i18) || (iJ < 0 && i18 <= iH)) {
                while (true) {
                    int i19 = iArr2[iH];
                    y yVar = list.get(b(iH, z11, size));
                    if (z11) {
                        i19 = (i15 - i19) - yVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                    }
                    arrayList.add(yVar.f(i19, i10, i11));
                    if (iH == i18) {
                        break;
                    }
                    iH += iJ;
                }
            }
        } else {
            int size2 = list2.size();
            int sizeWithSpacings = i14;
            for (int i20 = 0; i20 < size2; i20++) {
                y yVar2 = list2.get(i20);
                sizeWithSpacings -= yVar2.getSizeWithSpacings();
                arrayList.add(yVar2.f(sizeWithSpacings, i10, i11));
            }
            int size3 = list.size();
            int sizeWithSpacings2 = i14;
            for (int i21 = 0; i21 < size3; i21++) {
                y yVar3 = list.get(i21);
                arrayList.add(yVar3.f(sizeWithSpacings2, i10, i11));
                sizeWithSpacings2 += yVar3.getSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i22 = 0; i22 < size4; i22++) {
                y yVar4 = list3.get(i22);
                arrayList.add(yVar4.f(sizeWithSpacings2, i10, i11));
                sizeWithSpacings2 += yVar4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int b(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    @dl.d
    public static final r c(int i10, @dl.d z itemProvider, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, boolean z10, @dl.d List<Integer> headerIndexes, @dl.e Arrangement.l lVar, @dl.e Arrangement.d dVar, boolean z11, @dl.d s1.e density, @dl.d LazyListItemPlacementAnimator placementAnimator, @dl.d i beyondBoundsInfo, @dl.d yh.q<? super Integer, ? super Integer, ? super yh.l<? super e1.a, b2>, ? extends j0> layout) {
        int i17;
        int i18;
        int iC;
        int iMax;
        int i19;
        int sizeWithSpacings;
        int i20;
        y yVar;
        List listE;
        List listE2;
        List<v> list;
        f0.p(itemProvider, "itemProvider");
        f0.p(headerIndexes, "headerIndexes");
        f0.p(density, "density");
        f0.p(placementAnimator, "placementAnimator");
        f0.p(beyondBoundsInfo, "beyondBoundsInfo");
        f0.p(layout, "layout");
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i10 <= 0) {
            return new r(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(s1.b.r(j10)), Integer.valueOf(s1.b.q(j10)), new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1
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
        int iC2 = i15;
        if (iC2 >= i10) {
            iC2 = b.c(i10 - 1);
            i17 = 0;
        } else {
            i17 = i16;
        }
        int iL0 = di.d.L0(f10);
        int i21 = i17 - iL0;
        if (b.f(iC2, b.c(0)) && i21 < 0) {
            iL0 += i21;
            i21 = 0;
        }
        ArrayList arrayList = new ArrayList();
        int i22 = -i12;
        int i23 = i22 + (i14 < 0 ? i14 : 0);
        int sizeWithSpacings2 = i21 + i23;
        int iMax2 = 0;
        while (sizeWithSpacings2 < 0 && iC2 - b.c(0) > 0) {
            int iC3 = b.c(iC2 - 1);
            y yVarA = itemProvider.a(iC3);
            arrayList.add(0, yVarA);
            iMax2 = Math.max(iMax2, yVarA.getCrossAxisSize());
            sizeWithSpacings2 += yVarA.getSizeWithSpacings();
            iC2 = iC3;
        }
        if (sizeWithSpacings2 < i23) {
            iL0 += sizeWithSpacings2;
            sizeWithSpacings2 = i23;
        }
        int i24 = sizeWithSpacings2 - i23;
        int i25 = i11 + i13;
        int i26 = iMax2;
        int i27 = iC2;
        int iU = fi.u.u(i25, 0);
        int sizeWithSpacings3 = -i24;
        int size = arrayList.size();
        int iC4 = i27;
        int sizeWithSpacings4 = i24;
        for (int i28 = 0; i28 < size; i28++) {
            y yVar2 = (y) arrayList.get(i28);
            iC4 = b.c(iC4 + 1);
            sizeWithSpacings3 += yVar2.getSizeWithSpacings();
        }
        int iMax3 = i26;
        int sizeWithSpacings5 = sizeWithSpacings3;
        int iC5 = iC4;
        while (true) {
            if ((sizeWithSpacings5 > iU && !arrayList.isEmpty()) || iC5 >= i10) {
                break;
            }
            int i29 = iU;
            y yVarA2 = itemProvider.a(iC5);
            sizeWithSpacings5 += yVarA2.getSizeWithSpacings();
            if (sizeWithSpacings5 <= i23) {
                i18 = i23;
                if (iC5 != i10 - 1) {
                    iC = b.c(iC5 + 1);
                    sizeWithSpacings4 -= yVarA2.getSizeWithSpacings();
                }
                iC5 = b.c(iC5 + 1);
                i27 = iC;
                iU = i29;
                i23 = i18;
            } else {
                i18 = i23;
            }
            iMax3 = Math.max(iMax3, yVarA2.getCrossAxisSize());
            arrayList.add(yVarA2);
            iC = i27;
            iC5 = b.c(iC5 + 1);
            i27 = iC;
            iU = i29;
            i23 = i18;
        }
        if (sizeWithSpacings5 < i11) {
            int i30 = i11 - sizeWithSpacings5;
            int i31 = sizeWithSpacings5 + i30;
            int iC6 = i27;
            iMax = iMax3;
            sizeWithSpacings = sizeWithSpacings4 - i30;
            while (sizeWithSpacings < i12 && iC6 - b.c(0) > 0) {
                iC6 = b.c(iC6 - 1);
                y yVarA3 = itemProvider.a(iC6);
                arrayList.add(0, yVarA3);
                iMax = Math.max(iMax, yVarA3.getCrossAxisSize());
                sizeWithSpacings += yVarA3.getSizeWithSpacings();
            }
            iL0 += i30;
            if (sizeWithSpacings < 0) {
                iL0 += sizeWithSpacings;
                i19 = i31 + sizeWithSpacings;
                sizeWithSpacings = 0;
            } else {
                i19 = i31;
            }
        } else {
            iMax = iMax3;
            i19 = sizeWithSpacings5;
            sizeWithSpacings = sizeWithSpacings4;
        }
        float f11 = (di.d.U(di.d.L0(f10)) != di.d.U(iL0) || Math.abs(di.d.L0(f10)) < Math.abs(iL0)) ? f10 : iL0;
        if (!(sizeWithSpacings >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i32 = -sizeWithSpacings;
        y yVar3 = (y) CollectionsKt___CollectionsKt.w2(arrayList);
        if (i12 > 0 || i14 < 0) {
            int size2 = arrayList.size();
            y yVar4 = yVar3;
            int i33 = sizeWithSpacings;
            int i34 = 0;
            while (i34 < size2) {
                int sizeWithSpacings6 = ((y) arrayList.get(i34)).getSizeWithSpacings();
                if (i33 == 0 || sizeWithSpacings6 > i33 || i34 == CollectionsKt__CollectionsKt.G(arrayList)) {
                    break;
                }
                i33 -= sizeWithSpacings6;
                i34++;
                yVar4 = (y) arrayList.get(i34);
            }
            i20 = i33;
            yVar = yVar4;
        } else {
            i20 = sizeWithSpacings;
            yVar = yVar3;
        }
        if (!beyondBoundsInfo.d() || ((y) CollectionsKt___CollectionsKt.w2(arrayList)).getIndex() <= e(beyondBoundsInfo, i10)) {
            listE = CollectionsKt__CollectionsKt.E();
        } else {
            listE = new ArrayList();
            int index = ((y) CollectionsKt___CollectionsKt.w2(arrayList)).getIndex() - 1;
            int iE = e(beyondBoundsInfo, i10);
            if (iE <= index) {
                while (true) {
                    listE.add(itemProvider.a(b.c(index)));
                    if (index == iE) {
                        break;
                    }
                    index--;
                }
            }
            b2 b2Var = b2.f124493a;
        }
        List list2 = listE;
        if (!beyondBoundsInfo.d() || ((y) CollectionsKt___CollectionsKt.k3(arrayList)).getIndex() >= d(beyondBoundsInfo, i10)) {
            listE2 = CollectionsKt__CollectionsKt.E();
        } else {
            ArrayList arrayList2 = new ArrayList();
            int index2 = ((y) CollectionsKt___CollectionsKt.k3(arrayList)).getIndex();
            int iD = d(beyondBoundsInfo, i10);
            while (index2 < iD) {
                index2++;
                arrayList2.add(itemProvider.a(b.c(index2)));
            }
            b2 b2Var2 = b2.f124493a;
            listE2 = arrayList2;
        }
        boolean z12 = f0.g(yVar, CollectionsKt___CollectionsKt.w2(arrayList)) && list2.isEmpty() && listE2.isEmpty();
        int iG = s1.c.g(j10, z10 ? iMax : i19);
        if (z10) {
            iMax = i19;
        }
        int iF = s1.c.f(j10, iMax);
        final List<v> listA = a(arrayList, list2, listE2, iG, iF, i19, i11, i32, z10, lVar, dVar, z11, density);
        float f12 = f11;
        y yVar5 = yVar;
        placementAnimator.e((int) f11, iG, iF, z11, listA, itemProvider);
        final v vVarA = headerIndexes.isEmpty() ^ true ? k.a(listA, itemProvider, headerIndexes, i12, iG, iF) : null;
        boolean z13 = i19 > i11;
        j0 j0VarInvoke = layout.invoke(Integer.valueOf(iG), Integer.valueOf(iF), new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d e1.a invoke) {
                f0.p(invoke, "$this$invoke");
                List<v> list3 = listA;
                v vVar = vVarA;
                int size3 = list3.size();
                for (int i35 = 0; i35 < size3; i35++) {
                    v vVar2 = list3.get(i35);
                    if (vVar2 != vVar) {
                        vVar2.i(invoke);
                    }
                }
                v vVar3 = vVarA;
                if (vVar3 != null) {
                    vVar3.i(invoke);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        });
        if (z12) {
            list = listA;
        } else {
            ArrayList arrayList3 = new ArrayList(listA.size());
            int size3 = listA.size();
            for (int i35 = 0; i35 < size3; i35++) {
                v vVar = listA.get(i35);
                v vVar2 = vVar;
                if ((vVar2.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() >= ((y) CollectionsKt___CollectionsKt.w2(arrayList)).getIndex() && vVar2.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() <= ((y) CollectionsKt___CollectionsKt.k3(arrayList)).getIndex()) || vVar2 == vVarA) {
                    arrayList3.add(vVar);
                }
            }
            list = arrayList3;
        }
        return new r(yVar5, i20, z13, f12, j0VarInvoke, list, i22, i25, i10, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i13);
    }

    private static final int d(i iVar, int i10) {
        return Math.min(iVar.b(), i10 - 1);
    }

    private static final int e(i iVar, int i10) {
        return Math.min(iVar.c(), i10 - 1);
    }
}

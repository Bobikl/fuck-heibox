package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.k0;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\u001aq\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a,\u0010\u001b\u001a\u00020\u0013*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\tH\u0003\u001a\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\rH\u0002\u001a\f\u0010\u001f\u001a\u00020\r*\u00020\u0005H\u0000\u001a4\u0010$\u001a\u00020\r\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\"H\u0082\b¢\u0006\u0004\b$\u0010%\u001a\f\u0010&\u001a\u00020\r*\u00020\u0005H\u0002\u001a!\u0010'\u001a\u00020\u0005*\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\"H\u0082\b\u001a\u001c\u0010*\u001a\u00020\u001d*\u00020\u00162\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\rH\u0002\u001a\u001c\u0010-\u001a\u00020\r*\u00020\u00162\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rH\u0002\u001a\u001c\u0010.\u001a\u00020\r*\u00020\u00162\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/layout/m;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "", "resolvedSlotSums", "Ls1/b;", "constraints", "", "isVertical", "Ls1/n;", "contentOffset", "", "mainAxisAvailableSize", "mainAxisSpacing", "crossAxisSpacing", "beforeContentPadding", "afterContentPadding", "Landroidx/compose/foundation/lazy/staggeredgrid/k;", "j", "(Landroidx/compose/foundation/lazy/layout/m;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/layout/i;[IJZJIIIII)Landroidx/compose/foundation/lazy/staggeredgrid/k;", "Landroidx/compose/foundation/lazy/staggeredgrid/i;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "g", "delta", "Lkotlin/b2;", "k", "f", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/Function1;", "block", "e", "([Ljava/lang/Object;Lyh/l;)I", "d", "l", "indices", "itemCount", ak.av, ChannelListActivity.q.f79586f, "lane", ak.aF, "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyStaggeredGridMeasureKt {
    private static final void a(i iVar, int[] iArr, int i10) {
        int i11;
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i12 = length - 1;
            while (true) {
                i11 = iArr[length];
                if (i11 < i10) {
                    break;
                } else {
                    iArr[length] = c(iVar, i11, length);
                }
            }
            if (i11 != -1) {
                iVar.getSpans().i(iArr[length], length);
            }
            if (i12 < 0) {
                return;
            } else {
                length = i12;
            }
        }
    }

    private static final int b(i iVar, int i10, int i11) {
        return iVar.getSpans().d(i10, i11);
    }

    private static final int c(i iVar, int i10, int i11) {
        return iVar.getSpans().e(i10, i11);
    }

    private static final int d(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 < i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    private static final <T> int e(T[] tArr, yh.l<? super T, Integer> lVar) {
        int length = tArr.length;
        int i10 = -1;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int iIntValue = lVar.invoke(tArr[i12]).intValue();
            if (i11 > iIntValue) {
                i10 = i12;
                i11 = iIntValue;
            }
        }
        return i10;
    }

    public static final int f(@dl.d int[] iArr) {
        f0.p(iArr, "<this>");
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 > i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:226:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:228:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:244:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b2 A[LOOP:26: B:82:0x01b0->B:83:0x01b2, LOOP_END] */
    @androidx.compose.foundation.t
    private static final k g(i iVar, int i10, int[] iArr, int[] iArr2, boolean z10) {
        int iHg;
        int i11;
        boolean z11;
        int iF;
        int iB;
        int length;
        int i12;
        int i13;
        int i14;
        int i15;
        int index;
        int i16;
        int iB2;
        int[] iArr3;
        boolean z12;
        int[] iArr4;
        int[] iArr5;
        int i17;
        boolean z13;
        boolean z14;
        boolean z15;
        int i18;
        boolean z16;
        boolean z17;
        i iVar2 = iVar;
        androidx.compose.foundation.lazy.layout.m mVarI = iVar.getMeasureScope();
        int iA = iVar.getItemProvider().a();
        if (iA > 0) {
            if (!(iVar.getResolvedSlotSums().length == 0)) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                String str = "copyOf(this, size)";
                f0.o(iArrCopyOf, "copyOf(this, size)");
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
                f0.o(iArrCopyOf2, "copyOf(this, size)");
                a(iVar2, iArrCopyOf, iA);
                k(iArrCopyOf2, -i10);
                int length2 = iVar.getResolvedSlotSums().length;
                kotlin.collections.i[] iVarArr = new kotlin.collections.i[length2];
                for (int i19 = 0; i19 < length2; i19++) {
                    iVarArr[i19] = new kotlin.collections.i();
                }
                k(iArrCopyOf2, -iVar.getBeforeContentPadding());
                while (true) {
                    if (!h(iArrCopyOf, iArrCopyOf2, iVar2)) {
                        iHg = -1;
                        break;
                    }
                    iHg = f(iArrCopyOf2);
                    int iC = c(iVar2, iArrCopyOf[iHg], iHg);
                    if (iC < 0) {
                        break;
                    }
                    if (iVar.getSpans().f(iC) == -1) {
                        iVar.getSpans().i(iC, iHg);
                    }
                    l lVarB = iVar.getMeasuredItemProvider().b(iC, iHg);
                    iVarArr[iHg].addFirst(lVarB);
                    iArrCopyOf[iHg] = iC;
                    iArrCopyOf2[iHg] = iArrCopyOf2[iHg] + lVarB.getSizeWithSpacings();
                }
                int i20 = -iVar.getBeforeContentPadding();
                int i21 = iArrCopyOf2[0];
                if (i21 < i20) {
                    k(iArrCopyOf2, i20 - i21);
                    i11 = i10 + i21;
                } else {
                    i11 = i10;
                }
                k(iArrCopyOf2, iVar.getBeforeContentPadding());
                if (iHg == -1) {
                    iHg = ArraysKt___ArraysKt.hg(iArrCopyOf, 0);
                }
                if (iHg != -1 && i(iArrCopyOf, iVar2, iArrCopyOf2, iHg) && z10) {
                    iVar.getSpans().h();
                    int length3 = iArrCopyOf.length;
                    int[] iArr6 = new int[length3];
                    for (int i22 = 0; i22 < length3; i22++) {
                        iArr6[i22] = -1;
                    }
                    int length4 = iArrCopyOf2.length;
                    int[] iArr7 = new int[length4];
                    for (int i23 = 0; i23 < length4; i23++) {
                        iArr7[i23] = iArrCopyOf2[iHg];
                    }
                    return g(iVar2, i11, iArr6, iArr7, false);
                }
                int[] iArrCopyOf3 = Arrays.copyOf(iArr, iArr.length);
                f0.o(iArrCopyOf3, "copyOf(this, size)");
                a(iVar2, iArrCopyOf3, iA);
                b2 b2Var = b2.f124493a;
                int length5 = iArr2.length;
                int[] iArr8 = new int[length5];
                int i24 = 0;
                while (i24 < length5) {
                    iArr8[i24] = -(iArr2[i24] - i11);
                    i24++;
                    str = str;
                }
                String str2 = str;
                int iU = u.u(iVar.getMainAxisAvailableSize() + iVar.getAfterContentPadding(), 0);
                int length6 = iArrCopyOf3.length;
                int i25 = i11;
                int[] iArr9 = iArrCopyOf;
                int i26 = 0;
                int i27 = 0;
                while (i26 < length6) {
                    int i28 = length6;
                    int i29 = iArrCopyOf3[i26];
                    int i30 = i27 + 1;
                    int[] iArr10 = iArrCopyOf2;
                    if (i29 >= 0) {
                        l lVarB2 = iVar.getMeasuredItemProvider().b(i29, i27);
                        iArr8[i27] = iArr8[i27] + lVarB2.getSizeWithSpacings();
                        iVarArr[i27].addLast(lVarB2);
                        iVar.getSpans().i(i29, i27);
                    }
                    i26++;
                    length6 = i28;
                    i27 = i30;
                    iArrCopyOf2 = iArr10;
                    i20 = i20;
                }
                int[] iArr11 = iArrCopyOf2;
                int i31 = i20;
                while (true) {
                    int i32 = 0;
                    while (true) {
                        if (i32 >= length5) {
                            z11 = false;
                            break;
                        }
                        if (iArr8[i32] <= iU) {
                            z11 = true;
                            break;
                        }
                        i32++;
                    }
                    if (!z11) {
                        int i33 = 0;
                        while (true) {
                            if (i33 >= length2) {
                                z17 = true;
                                break;
                            }
                            if (!iVarArr[i33].isEmpty()) {
                                z17 = false;
                                break;
                            }
                            i33++;
                        }
                        if (!z17) {
                            i12 = iU;
                            index = Integer.MAX_VALUE;
                            break;
                        }
                        iF = f(iArr8);
                        iB = b(iVar2, iArrCopyOf3[iF], iF);
                        if (iB >= iA) {
                            length = iArrCopyOf3.length;
                            i12 = iU;
                            i13 = Integer.MAX_VALUE;
                            i14 = 0;
                            i15 = 0;
                            while (i14 < length) {
                                i16 = iArrCopyOf3[i14];
                                int i34 = i15 + 1;
                                if (i15 != iF) {
                                    iB2 = b(iVar2, i16, i15);
                                    while (iB2 < iA) {
                                        int iMin = Math.min(iB2, i13);
                                        iVar.getSpans().i(iB2, -1);
                                        iB2 = b(iVar2, iB2, i15);
                                        i13 = iMin;
                                        length = length;
                                    }
                                }
                                i14++;
                                i15 = i34;
                                length = length;
                            }
                            index = Integer.MAX_VALUE;
                            if (i13 != Integer.MAX_VALUE || !z10) {
                                break;
                                break;
                            }
                            iArr[iF] = Math.min(iArr[iF], i13);
                            return g(iVar2, i10, iArr, iArr2, false);
                        }
                        iArr3 = iArr9;
                        int[] iArr12 = iArr11;
                        int i35 = i31;
                        String str3 = str2;
                        int i36 = iU;
                        if (iArr3[iF] == -1) {
                            iArr3[iF] = iB;
                        }
                        iVar.getSpans().i(iB, iF);
                        l lVarB3 = iVar.getMeasuredItemProvider().b(iB, iF);
                        iArr8[iF] = iArr8[iF] + lVarB3.getSizeWithSpacings();
                        iVarArr[iF].addLast(lVarB3);
                        iArrCopyOf3[iF] = iB;
                        iVar2 = iVar;
                        iArr11 = iArr12;
                        iArr9 = iArr3;
                        i31 = i35;
                        str2 = str3;
                        iU = i36;
                    } else {
                        iF = f(iArr8);
                        iB = b(iVar2, iArrCopyOf3[iF], iF);
                        if (iB >= iA) {
                            length = iArrCopyOf3.length;
                            i12 = iU;
                            i13 = Integer.MAX_VALUE;
                            i14 = 0;
                            i15 = 0;
                            while (i14 < length) {
                                i16 = iArrCopyOf3[i14];
                                int i37 = i15 + 1;
                                if (i15 != iF) {
                                    iB2 = b(iVar2, i16, i15);
                                    while (iB2 < iA) {
                                        int iMin2 = Math.min(iB2, i13);
                                        iVar.getSpans().i(iB2, -1);
                                        iB2 = b(iVar2, iB2, i15);
                                        i13 = iMin2;
                                        length = length;
                                    }
                                }
                                i14++;
                                i15 = i37;
                                length = length;
                            }
                            index = Integer.MAX_VALUE;
                            if (i13 != Integer.MAX_VALUE) {
                                break;
                            }
                            iArr[iF] = Math.min(iArr[iF], i13);
                            return g(iVar2, i10, iArr, iArr2, false);
                        }
                        iArr3 = iArr9;
                        int[] iArr13 = iArr11;
                        int i38 = i31;
                        String str4 = str2;
                        int i39 = iU;
                        if (iArr3[iF] == -1) {
                            iArr3[iF] = iB;
                        }
                        iVar.getSpans().i(iB, iF);
                        l lVarB4 = iVar.getMeasuredItemProvider().b(iB, iF);
                        iArr8[iF] = iArr8[iF] + lVarB4.getSizeWithSpacings();
                        iVarArr[iF].addLast(lVarB4);
                        iArrCopyOf3[iF] = iB;
                        iVar2 = iVar;
                        iArr11 = iArr13;
                        iArr9 = iArr3;
                        i31 = i38;
                        str2 = str4;
                        iU = i39;
                    }
                }
                for (int i40 = 0; i40 < length2; i40++) {
                    kotlin.collections.i iVar3 = iVarArr[i40];
                    int sizeWithSpacings = iArr8[i40];
                    int iG = CollectionsKt__CollectionsKt.G(iVar3);
                    int i41 = 0;
                    int i42 = -1;
                    while (true) {
                        if (i42 >= iG) {
                            iG = i41;
                            break;
                        }
                        sizeWithSpacings -= ((l) iVar3.get(iG)).getSizeWithSpacings();
                        if (sizeWithSpacings <= i31 + iVar.getMainAxisSpacing()) {
                            break;
                        }
                        i42 = -1;
                        i41 = iG;
                        iG--;
                    }
                    for (int i43 = 0; i43 < iG; i43++) {
                        iArr11[i40] = iArr11[i40] - ((l) iVar3.removeFirst()).getSizeWithSpacings();
                    }
                    if (!iVar3.isEmpty()) {
                        iArr9[i40] = ((l) iVar3.first()).getIndex();
                    }
                }
                int i44 = 0;
                while (true) {
                    if (i44 >= length5) {
                        z12 = true;
                        break;
                    }
                    if (!(iArr8[i44] < iVar.getMainAxisAvailableSize())) {
                        z12 = false;
                        break;
                    }
                    i44++;
                }
                if (z12) {
                    int iG2 = iVar.getMainAxisAvailableSize() - iArr8[d(iArr8)];
                    iArr5 = iArr11;
                    k(iArr5, -iG2);
                    k(iArr8, iG2);
                    while (true) {
                        int length7 = iArr5.length;
                        int i45 = 0;
                        while (true) {
                            if (i45 >= length7) {
                                z16 = false;
                                break;
                            }
                            if (iArr5[i45] < iVar.getBeforeContentPadding()) {
                                z16 = true;
                                break;
                            }
                            i45++;
                        }
                        if (!z16) {
                            iArr4 = iArr9;
                            break;
                        }
                        int iF2 = f(iArr5);
                        int i46 = iArr9[iF2];
                        if (i46 == -1) {
                            i46 = iA;
                        }
                        int iC2 = c(iVar2, i46, iF2);
                        if (iC2 < 0) {
                            iArr4 = iArr9;
                            if (!i(iArr4, iVar2, iArr5, iF2) || !z10) {
                                break;
                            }
                            iVar.getSpans().h();
                            int length8 = iArr4.length;
                            int[] iArr14 = new int[length8];
                            for (int i47 = 0; i47 < length8; i47++) {
                                iArr14[i47] = -1;
                            }
                            int length9 = iArr5.length;
                            int[] iArr15 = new int[length9];
                            for (int i48 = 0; i48 < length9; i48++) {
                                iArr15[i48] = iArr5[iF2];
                            }
                            return g(iVar2, i25, iArr14, iArr15, false);
                        }
                        iVar.getSpans().i(iC2, iF2);
                        l lVarB5 = iVar.getMeasuredItemProvider().b(iC2, iF2);
                        iVarArr[iF2].addFirst(lVarB5);
                        iArr5[iF2] = iArr5[iF2] + lVarB5.getSizeWithSpacings();
                        iArr9[iF2] = iC2;
                    }
                    i17 = i25 + iG2;
                    int i49 = iArr5[f(iArr5)];
                    if (i49 < 0) {
                        i17 += i49;
                        k(iArr8, i49);
                        k(iArr5, -i49);
                    }
                } else {
                    iArr4 = iArr9;
                    iArr5 = iArr11;
                    i17 = i25;
                }
                float fA = (di.d.U(di.d.L0(iVar.getState().getScrollToBeConsumed())) != di.d.U(i17) || Math.abs(di.d.L0(iVar.getState().getScrollToBeConsumed())) < Math.abs(i17)) ? iVar.getState().getScrollToBeConsumed() : i17;
                int[] iArrCopyOf4 = Arrays.copyOf(iArr5, iArr5.length);
                f0.o(iArrCopyOf4, str2);
                int length10 = iArrCopyOf4.length;
                for (int i50 = 0; i50 < length10; i50++) {
                    iArrCopyOf4[i50] = -iArrCopyOf4[i50];
                }
                if (iVar.getBeforeContentPadding() > 0) {
                    for (int i51 = 0; i51 < length2; i51++) {
                        kotlin.collections.i iVar4 = iVarArr[i51];
                        int size = iVar4.size();
                        int i52 = 0;
                        while (i52 < size) {
                            int sizeWithSpacings2 = ((l) iVar4.get(i52)).getSizeWithSpacings();
                            if (i52 == CollectionsKt__CollectionsKt.G(iVar4) || (i18 = iArr5[i51]) == 0 || i18 < sizeWithSpacings2) {
                                break;
                            }
                            iArr5[i51] = i18 - sizeWithSpacings2;
                            i52++;
                            iArr4[i51] = ((l) iVar4.get(i52)).getIndex();
                        }
                    }
                }
                int iP = iVar.getIsVertical() ? s1.b.p(iVar.getConstraints()) : s1.c.g(iVar.getConstraints(), ArraysKt___ArraysKt.yl(iArr8));
                int iF3 = iVar.getIsVertical() ? s1.c.f(iVar.getConstraints(), ArraysKt___ArraysKt.yl(iArr8)) : s1.b.o(iVar.getConstraints());
                int size2 = 0;
                for (int i53 = 0; i53 < length2; i53++) {
                    size2 += iVarArr[i53].size();
                }
                final androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new m[size2], 0);
                while (true) {
                    int i54 = 0;
                    while (true) {
                        if (i54 >= length2) {
                            z13 = true;
                            z14 = false;
                            break;
                        }
                        z13 = true;
                        if (!iVarArr[i54].isEmpty()) {
                            z14 = true;
                            break;
                        }
                        i54++;
                    }
                    if (!z14) {
                        break;
                    }
                    int i55 = index;
                    int i56 = 0;
                    int i57 = -1;
                    while (i56 < length2) {
                        l lVar = (l) iVarArr[i56].l();
                        if (lVar != null) {
                            index = lVar.getIndex();
                        }
                        if (i55 > index) {
                            i57 = i56;
                            i55 = index;
                        }
                        i56++;
                        index = Integer.MAX_VALUE;
                    }
                    l lVar2 = (l) iVarArr[i57].removeFirst();
                    eVar.b(lVar2.j(i57, iArrCopyOf4[i57], i57 == 0 ? 0 : iVar.getResolvedSlotSums()[i57 - 1] + (iVar.getCrossAxisSpacing() * i57)));
                    iArrCopyOf4[i57] = iArrCopyOf4[i57] + lVar2.getSizeWithSpacings();
                    index = Integer.MAX_VALUE;
                }
                boolean z18 = (iArr4[0] != 0 || iArr5[0] > 0) ? z13 : false;
                for (int i58 = 0; i58 < length5; i58++) {
                    if (iArr8[i58] > iVar.getMainAxisAvailableSize() ? z13 : false) {
                        z15 = z13;
                        return new k(iArr4, iArr5, fA, k0.p(mVarI, iP, iF3, null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$13
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(@dl.d e1.a layout) {
                                f0.p(layout, "$this$layout");
                                androidx.compose.runtime.collection.e<m> eVar2 = eVar;
                                int i59 = eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                                if (i59 > 0) {
                                    int i60 = 0;
                                    m[] mVarArrG = eVar2.G();
                                    f0.n(mVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                                    do {
                                        mVarArrG[i60].d(layout);
                                        i60++;
                                    } while (i60 < i59);
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                                a(aVar);
                                return b2.f124493a;
                            }
                        }, 4, null), z15, z18, iA, eVar.l(), s1.s.a(iP, iF3), i31, i12, iVar.getBeforeContentPadding(), iVar.getAfterContentPadding(), null);
                    }
                }
                z15 = false;
                return new k(iArr4, iArr5, fA, k0.p(mVarI, iP, iF3, null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d e1.a layout) {
                        f0.p(layout, "$this$layout");
                        androidx.compose.runtime.collection.e<m> eVar2 = eVar;
                        int i59 = eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                        if (i59 > 0) {
                            int i60 = 0;
                            m[] mVarArrG = eVar2.G();
                            f0.n(mVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            do {
                                mVarArrG[i60].d(layout);
                                i60++;
                            } while (i60 < i59);
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                }, 4, null), z15, z18, iA, eVar.l(), s1.s.a(iP, iF3), i31, i12, iVar.getBeforeContentPadding(), iVar.getAfterContentPadding(), null);
            }
        }
        return new k(iArr, iArr2, 0.0f, k0.p(mVarI, s1.b.r(iVar.getConstraints()), s1.b.q(iVar.getConstraints()), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
            public final void a(@dl.d e1.a layout) {
                f0.p(layout, "$this$layout");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null), false, false, iA, CollectionsKt__CollectionsKt.E(), s1.s.a(s1.b.r(iVar.getConstraints()), s1.b.q(iVar.getConstraints())), -iVar.getBeforeContentPadding(), iVar.getMainAxisAvailableSize() + iVar.getAfterContentPadding(), iVar.getBeforeContentPadding(), iVar.getAfterContentPadding(), null);
    }

    private static final boolean h(int[] iArr, int[] iArr2, i iVar) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (iArr2[i10] < (-iVar.getMainAxisSpacing()) && i11 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean i(int[] iArr, i iVar, int[] iArr2, int i10) {
        boolean z10;
        boolean z11;
        Iterable iterableMe = ArraysKt___ArraysKt.Me(iArr);
        boolean z12 = iterableMe instanceof Collection;
        if (!z12 || !((Collection) iterableMe).isEmpty()) {
            Iterator it = iterableMe.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                int iNextInt = ((kotlin.collections.k0) it).nextInt();
                if (c(iVar, iArr[iNextInt], iNextInt) == -1 && iArr2[iNextInt] != iArr2[i10]) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (!z12 || !((Collection) iterableMe).isEmpty()) {
            Iterator it2 = iterableMe.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = false;
                    break;
                }
                int iNextInt2 = ((kotlin.collections.k0) it2).nextInt();
                if (c(iVar, iArr[iNextInt2], iNextInt2) != -1 && iArr2[iNextInt2] >= iArr2[i10]) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        return z10 || z11 || (iVar.getSpans().f(0) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.foundation.t
    @dl.d
    public static final k j(@dl.d androidx.compose.foundation.lazy.layout.m measureStaggeredGrid, @dl.d LazyStaggeredGridState state, @dl.d androidx.compose.foundation.lazy.layout.i itemProvider, @dl.d int[] resolvedSlotSums, long j10, boolean z10, long j11, int i10, int i11, int i12, int i13, int i14) {
        i iVar;
        T t10;
        i iVar2;
        int iB;
        T t11;
        int i15;
        f0.p(measureStaggeredGrid, "$this$measureStaggeredGrid");
        f0.p(state, "state");
        f0.p(itemProvider, "itemProvider");
        f0.p(resolvedSlotSums, "resolvedSlotSums");
        i iVar3 = iVar;
        i iVar4 = new i(state, itemProvider, resolvedSlotSums, j10, z10, measureStaggeredGrid, i10, j11, i13, i14, i11, i12, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        androidx.compose.runtime.snapshots.f fVarA = androidx.compose.runtime.snapshots.f.INSTANCE.a();
        try {
            androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
            try {
                int[] iArrA = state.getScrollPosition().a();
                int[] iArrB = state.getScrollPosition().b();
                if (iArrA.length == resolvedSlotSums.length) {
                    iVar = iVar3;
                    t10 = iArrA;
                } else {
                    iVar3.getSpans().h();
                    int length = resolvedSlotSums.length;
                    int[] iArr = new int[length];
                    int i16 = 0;
                    while (i16 < length) {
                        if (i16 < iArrA.length) {
                            iB = iArrA[i16];
                            iVar2 = iVar3;
                        } else if (i16 == 0) {
                            iVar2 = iVar3;
                            iB = 0;
                        } else {
                            iVar2 = iVar3;
                            iB = b(iVar2, iArr[i16 - 1], i16);
                        }
                        iArr[i16] = iB;
                        iVar2.getSpans().i(iArr[i16], i16);
                        i16++;
                        iVar3 = iVar2;
                    }
                    iVar = iVar3;
                    t10 = iArr;
                }
                objectRef.f124891b = t10;
                if (iArrB.length == resolvedSlotSums.length) {
                    t11 = iArrB;
                } else {
                    int length2 = resolvedSlotSums.length;
                    int[] iArr2 = new int[length2];
                    int i17 = 0;
                    while (i17 < length2) {
                        if (i17 < iArrB.length) {
                            i15 = iArrB[i17];
                        } else {
                            i15 = i17 == 0 ? 0 : iArr2[i17 - 1];
                        }
                        iArr2[i17] = i15;
                        i17++;
                    }
                    t11 = iArr2;
                }
                objectRef2.f124891b = t11;
                b2 b2Var = b2.f124493a;
                fVarA.w(fVarP);
                fVarA.d();
                return g(iVar, di.d.L0(state.getScrollToBeConsumed()), (int[]) objectRef.f124891b, (int[]) objectRef2.f124891b, true);
            } catch (Throwable th2) {
                fVarA.w(fVarP);
                throw th2;
            }
        } catch (Throwable th3) {
            fVarA.d();
            throw th3;
        }
    }

    private static final void k(int[] iArr, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = iArr[i11] + i10;
        }
    }

    private static final int[] l(int[] iArr, yh.l<? super Integer, Integer> lVar) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = lVar.invoke(Integer.valueOf(iArr[i10])).intValue();
        }
        return iArr;
    }
}

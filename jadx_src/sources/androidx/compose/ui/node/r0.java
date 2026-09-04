package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a(\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001aU\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a]\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a]\u0010\u001a\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0019\u001a8\u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0013H\u0000\u001a\u001c\u0010\"\u001a\u00020\t*\u00020\u00132\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/e;", "cb", "Landroidx/compose/ui/node/n;", "d", "diagonals", "callback", "Lkotlin/b2;", "b", "e", "oldStart", "oldEnd", "newStart", "newEnd", "Landroidx/compose/ui/node/b;", "forward", "backward", "", "snake", "", RXScreenCaptureService.KEY_HEIGHT, "(IIIILandroidx/compose/ui/node/e;[I[I[I)Z", "g", "(IIIILandroidx/compose/ui/node/e;[I[II[I)Z", ak.aF, "startX", "startY", "endX", "endY", "reverse", "data", "f", "i", "j", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class r0 {
    private static final void b(int i10, int i11, n nVar, e eVar) {
        while (nVar.b()) {
            int iD = nVar.d();
            int iD2 = nVar.d();
            int iD3 = nVar.d();
            while (i10 > iD3) {
                i10--;
                eVar.remove(i10);
            }
            while (i11 > iD2) {
                i11--;
                eVar.b(i10, i11);
            }
            while (true) {
                int i12 = iD - 1;
                if (iD > 0) {
                    i10--;
                    i11--;
                    eVar.c(i10, i11);
                    iD = i12;
                }
            }
        }
        while (i10 > 0) {
            i10--;
            eVar.remove(i10);
        }
        while (i11 > 0) {
            i11--;
            eVar.b(i10, i11);
        }
    }

    private static final boolean c(int i10, int i11, int i12, int i13, e eVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iE;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = i17 % 2 == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && b.e(iArr2, i19 + 1) < b.e(iArr2, i19 - 1))) {
                iE = b.e(iArr2, i19 + 1);
                i15 = iE;
            } else {
                iE = b.e(iArr2, i19 - 1);
                i15 = iE - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = (i14 == 0 || i15 != iE) ? i20 : i20 + 1;
            while (true) {
                if (i15 <= i10 || i20 <= i12) {
                    break;
                }
                if (!eVar.a(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            b.h(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (b.e(iArr, i16) >= i15) {
                    f(i15, i20, iE, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final n d(int i10, int i11, e eVar) {
        int i12 = ((i10 + i11) + 1) / 2;
        n nVar = new n(i12 * 3);
        n nVar2 = new n(i12 * 4);
        nVar2.f(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrB = b.b(new int[i13]);
        int[] iArrB2 = b.b(new int[i13]);
        int[] iArrC = l1.c(new int[5]);
        while (nVar2.b()) {
            int iD = nVar2.d();
            int iD2 = nVar2.d();
            int iD3 = nVar2.d();
            int iD4 = nVar2.d();
            int[] iArr = iArrB;
            int[] iArr2 = iArrB2;
            if (h(iD4, iD3, iD2, iD, eVar, iArrB, iArrB2, iArrC)) {
                if (l1.g(iArrC) > 0) {
                    l1.a(iArrC, nVar);
                }
                nVar2.f(iD4, l1.l(iArrC), iD2, l1.m(iArrC));
                nVar2.f(l1.h(iArrC), iD3, l1.i(iArrC), iD);
            }
            iArrB = iArr;
            iArrB2 = iArr2;
        }
        nVar.h();
        nVar.e(i10, i11, 0);
        return nVar;
    }

    public static final void e(int i10, int i11, @dl.d e callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        b(i10, i11, d(i10, i11, callback), callback);
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z10, @dl.d int[] data) {
        kotlin.jvm.internal.f0.p(data, "data");
        data[0] = i10;
        data[1] = i11;
        data[2] = i12;
        data[3] = i13;
        data[4] = z10 ? 1 : 0;
    }

    private static final boolean g(int i10, int i11, int i12, int i13, e eVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iE;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = Math.abs(i17) % 2 == 1;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && b.e(iArr, i19 + 1) > b.e(iArr, i19 - 1))) {
                iE = b.e(iArr, i19 + 1);
                i15 = iE;
            } else {
                iE = b.e(iArr, i19 - 1);
                i15 = iE + 1;
            }
            int i20 = (i12 + (i15 - i10)) - i19;
            int i21 = (i14 == 0 || i15 != iE) ? i20 : i20 - 1;
            while (true) {
                if (i15 >= i11 || i20 >= i13) {
                    break;
                }
                if (!eVar.a(i15, i20)) {
                    break;
                }
                i15++;
                i20++;
            }
            b.h(iArr, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 + 1 && i16 <= i14 - 1) {
                if (b.e(iArr2, i16) <= i15) {
                    f(iE, i21, i15, i20, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, e eVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            b.h(iArr, 1, i10);
            b.h(iArr2, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                int i18 = i17;
                if (g(i10, i11, i12, i13, eVar, iArr, iArr2, i17, iArr3) || c(i10, i11, i12, i13, eVar, iArr, iArr2, i18, iArr3)) {
                    return true;
                }
                i17 = i18 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}

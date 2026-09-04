package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerWu implements e6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f53765g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53766h = 33;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f53767i = 35937;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f53768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f53769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f53770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f53771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double[] f53772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    b[] f53773f;

    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53774a;

        static {
            int[] iArr = new int[Direction.values().length];
            f53774a = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53774a[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53774a[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f53775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f53776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f53777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f53778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f53780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f53781g;

        private b() {
            this.f53775a = 0;
            this.f53776b = 0;
            this.f53777c = 0;
            this.f53778d = 0;
            this.f53779e = 0;
            this.f53780f = 0;
            this.f53781g = 0;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f53782a;

        c(int i10, int i11) {
            this.f53782a = i11;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f53783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f53784b;

        d(int i10, double d10) {
            this.f53783a = i10;
            this.f53784b = d10;
        }
    }

    static int b(b bVar, Direction direction, int[] iArr) {
        int i10;
        int i11;
        int i12 = a.f53774a[direction.ordinal()];
        if (i12 == 1) {
            i10 = (-iArr[h(bVar.f53775a, bVar.f53778d, bVar.f53780f)]) + iArr[h(bVar.f53775a, bVar.f53778d, bVar.f53779e)] + iArr[h(bVar.f53775a, bVar.f53777c, bVar.f53780f)];
            i11 = iArr[h(bVar.f53775a, bVar.f53777c, bVar.f53779e)];
        } else if (i12 == 2) {
            i10 = (-iArr[h(bVar.f53776b, bVar.f53777c, bVar.f53780f)]) + iArr[h(bVar.f53776b, bVar.f53777c, bVar.f53779e)] + iArr[h(bVar.f53775a, bVar.f53777c, bVar.f53780f)];
            i11 = iArr[h(bVar.f53775a, bVar.f53777c, bVar.f53779e)];
        } else {
            if (i12 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i10 = (-iArr[h(bVar.f53776b, bVar.f53778d, bVar.f53779e)]) + iArr[h(bVar.f53776b, bVar.f53777c, bVar.f53779e)] + iArr[h(bVar.f53775a, bVar.f53778d, bVar.f53779e)];
            i11 = iArr[h(bVar.f53775a, bVar.f53777c, bVar.f53779e)];
        }
        return i10 - i11;
    }

    static int h(int i10, int i11, int i12) {
        return (i10 << 10) + (i10 << 6) + i10 + (i11 << 5) + i11 + i12;
    }

    static int j(b bVar, Direction direction, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13 = a.f53774a[direction.ordinal()];
        if (i13 == 1) {
            i11 = (iArr[h(i10, bVar.f53778d, bVar.f53780f)] - iArr[h(i10, bVar.f53778d, bVar.f53779e)]) - iArr[h(i10, bVar.f53777c, bVar.f53780f)];
            i12 = iArr[h(i10, bVar.f53777c, bVar.f53779e)];
        } else if (i13 == 2) {
            i11 = (iArr[h(bVar.f53776b, i10, bVar.f53780f)] - iArr[h(bVar.f53776b, i10, bVar.f53779e)]) - iArr[h(bVar.f53775a, i10, bVar.f53780f)];
            i12 = iArr[h(bVar.f53775a, i10, bVar.f53779e)];
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i11 = (iArr[h(bVar.f53776b, bVar.f53778d, i10)] - iArr[h(bVar.f53776b, bVar.f53777c, i10)]) - iArr[h(bVar.f53775a, bVar.f53778d, i10)];
            i12 = iArr[h(bVar.f53775a, bVar.f53777c, i10)];
        }
        return i11 + i12;
    }

    static int l(b bVar, int[] iArr) {
        return ((((((iArr[h(bVar.f53776b, bVar.f53778d, bVar.f53780f)] - iArr[h(bVar.f53776b, bVar.f53778d, bVar.f53779e)]) - iArr[h(bVar.f53776b, bVar.f53777c, bVar.f53780f)]) + iArr[h(bVar.f53776b, bVar.f53777c, bVar.f53779e)]) - iArr[h(bVar.f53775a, bVar.f53778d, bVar.f53780f)]) + iArr[h(bVar.f53775a, bVar.f53778d, bVar.f53779e)]) + iArr[h(bVar.f53775a, bVar.f53777c, bVar.f53780f)]) - iArr[h(bVar.f53775a, bVar.f53777c, bVar.f53779e)];
    }

    @Override // com.google.android.material.color.utilities.e6
    public h6 a(int[] iArr, int i10) {
        c(new g6().a(iArr, i10).f53864a);
        e();
        List<Integer> listF = f(d(i10).f53782a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(it.next().intValue()), 0);
        }
        return new h6(linkedHashMap);
    }

    void c(Map<Integer, Integer> map) {
        this.f53768a = new int[f53767i];
        this.f53769b = new int[f53767i];
        this.f53770c = new int[f53767i];
        this.f53771d = new int[f53767i];
        this.f53772e = new double[f53767i];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iQ = com.google.android.material.color.utilities.c.q(iIntValue);
            int i10 = com.google.android.material.color.utilities.c.i(iIntValue);
            int iG = com.google.android.material.color.utilities.c.g(iIntValue);
            int iH = h((iQ >> 3) + 1, (i10 >> 3) + 1, (iG >> 3) + 1);
            int[] iArr = this.f53768a;
            iArr[iH] = iArr[iH] + iIntValue2;
            int[] iArr2 = this.f53769b;
            iArr2[iH] = iArr2[iH] + (iQ * iIntValue2);
            int[] iArr3 = this.f53770c;
            iArr3[iH] = iArr3[iH] + (i10 * iIntValue2);
            int[] iArr4 = this.f53771d;
            iArr4[iH] = iArr4[iH] + (iG * iIntValue2);
            double[] dArr = this.f53772e;
            dArr[iH] = dArr[iH] + ((double) (iIntValue2 * ((iQ * iQ) + (i10 * i10) + (iG * iG))));
        }
    }

    c d(int i10) {
        int i11;
        this.f53773f = new b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            this.f53773f[i12] = new b(null);
        }
        double[] dArr = new double[i10];
        b bVar = this.f53773f[0];
        bVar.f53776b = 32;
        bVar.f53778d = 32;
        bVar.f53780f = 32;
        int i13 = 0;
        int i14 = 1;
        while (i14 < i10) {
            b[] bVarArr = this.f53773f;
            if (g(bVarArr[i13], bVarArr[i14]).booleanValue()) {
                b bVar2 = this.f53773f[i13];
                dArr[i13] = bVar2.f53781g > 1 ? k(bVar2) : 0.0d;
                b bVar3 = this.f53773f[i14];
                dArr[i14] = bVar3.f53781g > 1 ? k(bVar3) : 0.0d;
            } else {
                dArr[i13] = 0.0d;
                i14--;
            }
            double d10 = dArr[0];
            int i15 = 0;
            for (int i16 = 1; i16 <= i14; i16++) {
                double d11 = dArr[i16];
                if (d11 > d10) {
                    i15 = i16;
                    d10 = d11;
                }
            }
            if (d10 <= 0.0d) {
                i11 = i14 + 1;
                return new c(i10, i11);
            }
            i14++;
            i13 = i15;
        }
        i11 = i10;
        return new c(i10, i11);
    }

    void e() {
        int i10 = 1;
        while (true) {
            int i11 = 33;
            if (i10 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i12 = 1;
            while (i12 < i11) {
                double d10 = 0.0d;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 1;
                while (i17 < i11) {
                    int iH = h(i10, i12, i17);
                    i13 += this.f53768a[iH];
                    i14 += this.f53769b[iH];
                    i15 += this.f53770c[iH];
                    i16 += this.f53771d[iH];
                    double d11 = d10 + this.f53772e[iH];
                    iArr[i17] = iArr[i17] + i13;
                    iArr2[i17] = iArr2[i17] + i14;
                    iArr3[i17] = iArr3[i17] + i15;
                    iArr4[i17] = iArr4[i17] + i16;
                    dArr[i17] = dArr[i17] + d11;
                    int iH2 = h(i10 - 1, i12, i17);
                    int[] iArr5 = this.f53768a;
                    iArr5[iH] = iArr5[iH2] + iArr[i17];
                    int[] iArr6 = this.f53769b;
                    iArr6[iH] = iArr6[iH2] + iArr2[i17];
                    int[] iArr7 = this.f53770c;
                    iArr7[iH] = iArr7[iH2] + iArr3[i17];
                    int[] iArr8 = this.f53771d;
                    iArr8[iH] = iArr8[iH2] + iArr4[i17];
                    double[] dArr2 = this.f53772e;
                    dArr2[iH] = dArr2[iH2] + dArr[i17];
                    i17++;
                    d10 = d11;
                    i11 = 33;
                }
                i12++;
                i11 = 33;
            }
            i10++;
        }
    }

    List<Integer> f(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = this.f53773f[i11];
            int iL = l(bVar, this.f53768a);
            if (iL > 0) {
                int iL2 = l(bVar, this.f53769b) / iL;
                int iL3 = l(bVar, this.f53770c) / iL;
                arrayList.add(Integer.valueOf(((l(bVar, this.f53771d) / iL) & 255) | (-16777216) | ((iL2 & 255) << 16) | ((iL3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    Boolean g(b bVar, b bVar2) {
        int iL = l(bVar, this.f53769b);
        int iL2 = l(bVar, this.f53770c);
        int iL3 = l(bVar, this.f53771d);
        int iL4 = l(bVar, this.f53768a);
        Direction direction = Direction.RED;
        d dVarI = i(bVar, direction, bVar.f53775a + 1, bVar.f53776b, iL, iL2, iL3, iL4);
        Direction direction2 = Direction.GREEN;
        d dVarI2 = i(bVar, direction2, bVar.f53777c + 1, bVar.f53778d, iL, iL2, iL3, iL4);
        Direction direction3 = Direction.BLUE;
        d dVarI3 = i(bVar, direction3, bVar.f53779e + 1, bVar.f53780f, iL, iL2, iL3, iL4);
        double d10 = dVarI.f53784b;
        double d11 = dVarI2.f53784b;
        double d12 = dVarI3.f53784b;
        if (d10 < d11 || d10 < d12) {
            direction = (d11 < d10 || d11 < d12) ? direction3 : direction2;
        } else if (dVarI.f53783a < 0) {
            return Boolean.FALSE;
        }
        bVar2.f53776b = bVar.f53776b;
        bVar2.f53778d = bVar.f53778d;
        bVar2.f53780f = bVar.f53780f;
        int i10 = a.f53774a[direction.ordinal()];
        if (i10 == 1) {
            int i11 = dVarI.f53783a;
            bVar.f53776b = i11;
            bVar2.f53775a = i11;
            bVar2.f53777c = bVar.f53777c;
            bVar2.f53779e = bVar.f53779e;
        } else if (i10 == 2) {
            int i12 = dVarI2.f53783a;
            bVar.f53778d = i12;
            bVar2.f53775a = bVar.f53775a;
            bVar2.f53777c = i12;
            bVar2.f53779e = bVar.f53779e;
        } else if (i10 == 3) {
            int i13 = dVarI3.f53783a;
            bVar.f53780f = i13;
            bVar2.f53775a = bVar.f53775a;
            bVar2.f53777c = bVar.f53777c;
            bVar2.f53779e = i13;
        }
        bVar.f53781g = (bVar.f53776b - bVar.f53775a) * (bVar.f53778d - bVar.f53777c) * (bVar.f53780f - bVar.f53779e);
        bVar2.f53781g = (bVar2.f53776b - bVar2.f53775a) * (bVar2.f53778d - bVar2.f53777c) * (bVar2.f53780f - bVar2.f53779e);
        return Boolean.TRUE;
    }

    d i(b bVar, Direction direction, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        QuantizerWu quantizerWu = this;
        b bVar2 = bVar;
        Direction direction2 = direction;
        int iB = b(bVar2, direction2, quantizerWu.f53769b);
        int iB2 = b(bVar2, direction2, quantizerWu.f53770c);
        int iB3 = b(bVar2, direction2, quantizerWu.f53771d);
        int iB4 = b(bVar2, direction2, quantizerWu.f53768a);
        int i17 = -1;
        double d10 = 0.0d;
        int i18 = i10;
        while (i18 < i11) {
            int iJ = j(bVar2, direction2, i18, quantizerWu.f53769b) + iB;
            int iJ2 = j(bVar2, direction2, i18, quantizerWu.f53770c) + iB2;
            int iJ3 = j(bVar2, direction2, i18, quantizerWu.f53771d) + iB3;
            int iJ4 = j(bVar2, direction2, i18, quantizerWu.f53768a) + iB4;
            if (iJ4 == 0) {
                i16 = iB;
            } else {
                i16 = iB;
                double d11 = ((double) (((iJ * iJ) + (iJ2 * iJ2)) + (iJ3 * iJ3))) / ((double) iJ4);
                int i19 = i12 - iJ;
                int i20 = i13 - iJ2;
                int i21 = i14 - iJ3;
                int i22 = i15 - iJ4;
                if (i22 != 0) {
                    double d12 = d11 + (((double) (((i19 * i19) + (i20 * i20)) + (i21 * i21))) / ((double) i22));
                    if (d12 > d10) {
                        d10 = d12;
                        i17 = i18;
                    }
                }
            }
            i18++;
            quantizerWu = this;
            bVar2 = bVar;
            direction2 = direction;
            iB = i16;
        }
        return new d(i17, d10);
    }

    double k(b bVar) {
        int iL = l(bVar, this.f53769b);
        int iL2 = l(bVar, this.f53770c);
        int iL3 = l(bVar, this.f53771d);
        return (((((((this.f53772e[h(bVar.f53776b, bVar.f53778d, bVar.f53780f)] - this.f53772e[h(bVar.f53776b, bVar.f53778d, bVar.f53779e)]) - this.f53772e[h(bVar.f53776b, bVar.f53777c, bVar.f53780f)]) + this.f53772e[h(bVar.f53776b, bVar.f53777c, bVar.f53779e)]) - this.f53772e[h(bVar.f53775a, bVar.f53778d, bVar.f53780f)]) + this.f53772e[h(bVar.f53775a, bVar.f53778d, bVar.f53779e)]) + this.f53772e[h(bVar.f53775a, bVar.f53777c, bVar.f53780f)]) - this.f53772e[h(bVar.f53775a, bVar.f53777c, bVar.f53779e)]) - (((double) (((iL * iL) + (iL2 * iL2)) + (iL3 * iL3))) / ((double) l(bVar, this.f53768a)));
    }
}

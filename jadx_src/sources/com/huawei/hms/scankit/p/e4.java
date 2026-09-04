package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: HybridBinarizer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e4 extends q3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f61761f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f61762g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f61763h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f61764i = 40;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f61765j = 24;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s f61766e;

    public e4(p4 p4Var) {
        super(p4Var);
        a(r3.f62288n);
    }

    private static int a(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private static s a(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr) {
        int i14;
        int i15;
        int i16;
        int[] iArr2 = new int[i10 * i11];
        for (int i17 = 0; i17 < i11; i17++) {
            int iA = a(i17, 2, i11 - 3);
            for (int i18 = 0; i18 < i10; i18++) {
                int iA2 = a(i18, 2, i10 - 3);
                int[] iArr3 = iArr[iA + 2];
                int i19 = iA2 + 2;
                int i20 = iArr3[i19];
                if (iA == 2 && iA2 == 2) {
                    i16 = 0;
                    i15 = 0;
                } else {
                    if (iA == 2) {
                        i14 = 0;
                        i15 = iArr3[iA2 - 3];
                        i16 = 0;
                    } else if (iA2 == 2) {
                        i16 = iArr[iA - 3][i19];
                        i15 = 0;
                    } else {
                        int[] iArr4 = iArr[iA - 3];
                        int i21 = iA2 - 3;
                        i14 = iArr4[i21];
                        int i22 = iArr4[i19];
                        i15 = iArr3[i21];
                        i16 = i22;
                    }
                    iArr2[(i17 * i10) + i18] = (((i20 + i14) - i16) - i15) / 25;
                }
                i14 = i15;
                iArr2[(i17 * i10) + i18] = (((i20 + i14) - i16) - i15) / 25;
            }
        }
        return new s(i12, i13, (i12 + 31) / 32, a(bArr, iArr2, i10, i11, i12, i13));
    }

    private void a(boolean z10) {
        if (z10) {
            f61761f = 2;
            f61762g = 4;
            f61763h = 3;
            f61764i = 20;
            return;
        }
        f61761f = 3;
        f61762g = 8;
        f61763h = 7;
        f61764i = 40;
    }

    private static int[] a(int i10, int i11, int i12, byte[] bArr) {
        int i13 = (i11 * i12) + i10;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < f61762g) {
            for (int i18 = 0; i18 < f61762g; i18++) {
                int i19 = bArr[i13 + i18] & 255;
                i16 += i19;
                if (i19 < i14) {
                    i14 = i19;
                }
                if (i19 > i17) {
                    i17 = i19;
                }
            }
            if (i17 - i14 > f61765j) {
                while (true) {
                    i15++;
                    i13 += i12;
                    if (i15 < f61762g) {
                        for (int i20 = 0; i20 < f61762g; i20++) {
                            i16 += bArr[i13 + i20] & 255;
                        }
                    }
                }
            }
            i15++;
            i13 += i12;
        }
        return new int[]{i16, i14, i17};
    }

    private static int[] a(byte[] bArr, int[] iArr, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = (i12 + 31) / 32;
        int i16 = i15 * i13;
        int[] iArr2 = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            iArr2[i17] = 0;
        }
        int i18 = f61762g;
        for (int i19 = 0; i19 < i13; i19++) {
            int i20 = i19 / i18;
            for (int i21 = 0; i21 < i12; i21++) {
                if ((bArr[(i19 * i12) + i21] & 255) <= iArr[(i20 * i10) + (i21 / i18)] && (i14 = (i19 * i15) + (i21 / 32)) < i16) {
                    iArr2[i14] = iArr2[i14] | (1 << (i21 & 31));
                }
            }
        }
        return iArr2;
    }

    private static int[][] a(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = f61762g;
        int i15 = i13 - i14;
        int i16 = i12 - i14;
        char c10 = 1;
        int i17 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, i11, i10);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, i11, i10);
        int i18 = 0;
        while (i18 < i11) {
            int i19 = i18 << f61761f;
            if (i19 > i15) {
                i19 = i15;
            }
            int i20 = i17;
            int i21 = i20;
            while (i20 < i10) {
                int i22 = i20 << f61761f;
                if (i22 > i16) {
                    i22 = i16;
                }
                int[] iArrA = a(i22, i19, i12, bArr);
                int i23 = iArrA[i17];
                int i24 = iArrA[c10];
                int i25 = iArrA[2];
                int i26 = i23 >> (f61761f * 2);
                if (i25 - i24 <= f61765j) {
                    i26 = i24 / 2;
                    if (i18 > 0 && i20 > 0) {
                        int[] iArr3 = iArr2[i18 - 1];
                        int i27 = i20 - 1;
                        int i28 = ((iArr3[i20] + (iArr2[i18][i27] * 2)) + iArr3[i27]) / 4;
                        if (i24 < i28) {
                            i26 = i28;
                        }
                    }
                }
                i21 += i26;
                iArr2[i18][i20] = i26;
                if (i18 == 0 && i20 == 0) {
                    iArr[i18][i20] = i26;
                } else if (i18 == 0) {
                    iArr[i18][i20] = i21;
                } else {
                    iArr[i18][i20] = iArr[i18 - 1][i20] + i21;
                }
                i20++;
                c10 = 1;
                i17 = 0;
            }
            i18++;
            c10 = 1;
            i17 = 0;
        }
        return iArr;
    }

    @Override // com.huawei.hms.scankit.p.q3, com.huawei.hms.scankit.p.o
    public o a(p4 p4Var) {
        return new e4(p4Var);
    }

    @Override // com.huawei.hms.scankit.p.q3, com.huawei.hms.scankit.p.o
    public s a() throws a {
        s sVar = this.f61766e;
        if (sVar != null) {
            return sVar;
        }
        p4 p4VarC = c();
        int iC = p4VarC.c();
        int iA = p4VarC.a();
        int i10 = f61764i;
        if (iC < i10 || iA < i10) {
            this.f61766e = super.a();
        } else {
            byte[] bArrB = p4VarC.b();
            int i11 = f61761f;
            int i12 = iC >> i11;
            int i13 = f61763h;
            if ((iC & i13) != 0) {
                i12++;
            }
            int i14 = iA >> i11;
            if ((i13 & iA) != 0) {
                i14++;
            }
            int i15 = i14;
            this.f61766e = a(bArrB, i12, i15, iC, iA, a(bArrB, i12, i15, iC, iA));
        }
        return this.f61766e;
    }
}

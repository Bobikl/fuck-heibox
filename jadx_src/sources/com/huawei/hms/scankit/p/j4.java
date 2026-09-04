package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: ITFReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j4 extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f61992c = {6, 8, 10, 12, 14};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f61993d = {1, 1, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[][] f61994e = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[][] f61995f = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f61996a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61997b = -1;

    private static void a(r rVar, int i10, int i11, StringBuilder sb2) throws a {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            g5.a(rVar, i10, iArr);
            int i12 = -1;
            int i13 = 10000;
            for (int i14 = 0; i14 < 10; i14++) {
                int i15 = iArr[i14];
                if (i12 <= i15) {
                    i12 = i15;
                }
                if (i13 >= i15) {
                    i13 = i15;
                }
            }
            if (i12 / i13 > 8) {
                throw a.a();
            }
            for (int i16 = 0; i16 < 5; i16++) {
                int i17 = i16 * 2;
                iArr2[i16] = iArr[i17];
                iArr3[i16] = iArr[i17 + 1];
            }
            sb2.append((char) (b(iArr2) + 48));
            sb2.append((char) (b(iArr3) + 48));
            for (int i18 = 0; i18 < 10; i18++) {
                i10 += iArr[i18];
            }
        }
        if (i10 != i11) {
            throw a.a();
        }
    }

    private boolean a(r rVar, int i10) {
        int i11 = this.f61996a * 10;
        int i12 = (int) (((double) this.f61997b) * 1.5d);
        if (i11 < i12) {
            i11 = i12;
        }
        for (int i13 = i10 - 1; i11 > 0 && i13 >= 0 && !rVar.b(i13); i13--) {
            i11--;
        }
        return i11 == 0;
    }

    private int[] a(r rVar) throws a {
        try {
            rVar.h();
            int iC = c(rVar);
            while (true) {
                int[] iArrB = b(rVar, iC, f61994e[0]);
                if (a(rVar, iArrB[0])) {
                    int i10 = iArrB[0];
                    iArrB[0] = rVar.e() - iArrB[1];
                    iArrB[1] = rVar.e() - i10;
                    return iArrB;
                }
                iC = iArrB[2];
            }
        } finally {
            rVar.h();
        }
    }

    private static int b(int[] iArr) throws a {
        int length = f61995f.length;
        float f10 = 0.3f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float fA = g5.a(iArr, f61995f[i11], 0.75f);
            if (fA < f10) {
                i10 = i11;
                f10 = fA;
            } else if (Math.abs(fA - f10) < 1.0E-7d) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw a.a();
    }

    private int[] b(r rVar) throws a {
        int iC = c(rVar);
        while (true) {
            int[] iArrC = c(rVar, iC, f61993d);
            int i10 = iArrC[1];
            int i11 = iArrC[0];
            this.f61996a = (i10 - i11) / 4;
            if (a(rVar, i11)) {
                return iArrC;
            }
            iC = iArrC[2];
        }
    }

    private int[] b(r rVar, int i10, int[] iArr) throws a {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int iE = rVar.e();
        int i11 = i10;
        int i12 = i11;
        boolean z10 = false;
        int i13 = 0;
        while (i11 < iE) {
            if (rVar.b(i11) == z10) {
                if (i13 != length - 1) {
                    i13++;
                } else {
                    if (Math.min(iArr2[0], iArr2[1]) == 0 || Math.max(iArr2[0], iArr2[1]) == 0) {
                        throw a.a();
                    }
                    float fMax = Math.max(iArr2[0], iArr2[1]) / Math.min(iArr2[0], iArr2[1]);
                    float f10 = iArr2[2] * 2.0f;
                    int i14 = iArr2[0];
                    int i15 = iArr2[1];
                    float f11 = f10 / (i14 + i15);
                    if (fMax <= 3.0f && ((double) f11) > 1.5d && f11 < 4.0f) {
                        return new int[]{i12, i11, i12 + iArr2[0] + iArr2[1]};
                    }
                    i12 += i14 + i15;
                    int i16 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i16);
                    iArr2[i16] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z10 = !z10;
            } else {
                if (i13 < 0 || i13 >= length) {
                    throw a.a();
                }
                iArr2[i13] = iArr2[i13] + 1;
            }
            i11++;
        }
        throw a.a();
    }

    private static int c(r rVar) throws a {
        int iE = rVar.e();
        int iC = rVar.c(0);
        if (iC != iE) {
            return iC;
        }
        throw a.a();
    }

    private int[] c(r rVar, int i10, int[] iArr) throws a {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int iE = rVar.e();
        char c10 = 0;
        int i11 = i10;
        int i12 = i11;
        boolean z10 = false;
        int i13 = 0;
        while (i11 < iE) {
            if (rVar.b(i11) == z10) {
                if (i13 == length - 1) {
                    int[] iArr3 = (int[]) iArr2.clone();
                    Arrays.sort(iArr3);
                    int i14 = iArr3[c10];
                    double d10 = ((double) (iArr3[1] + i14)) * 0.5d;
                    int i15 = iArr3[2];
                    int i16 = iArr3[3];
                    if ((((double) (i15 + i16)) * 0.5d) / d10 < 4.0d && (((double) i16) * 1.0d) / ((double) i14) <= 3.0d) {
                        int[] iArr4 = new int[10];
                        g5.a(rVar, i11, iArr4);
                        this.f61997b = -1;
                        for (int i17 = 0; i17 < 10; i17++) {
                            int i18 = iArr4[i17];
                            if (i18 > this.f61997b) {
                                this.f61997b = i18;
                            }
                        }
                        return new int[]{i12, i11, i12 + iArr2[0] + iArr2[1]};
                    }
                    c10 = 0;
                    i12 += iArr2[0] + iArr2[1];
                    int i19 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i19);
                    iArr2[i19] = 0;
                    iArr2[i13] = 0;
                    i13--;
                } else {
                    i13++;
                }
                iArr2[i13] = 1;
                z10 = !z10;
            } else {
                if (i13 < 0 || i13 >= length) {
                    throw a.a();
                }
                iArr2[i13] = iArr2[i13] + 1;
            }
            i11++;
        }
        throw a.a();
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i10, r rVar, Map<l1, ?> map) throws a {
        boolean z10;
        int[] iArrB = b(rVar);
        int[] iArrA = a(rVar);
        StringBuilder sb2 = new StringBuilder(20);
        a(rVar, iArrB[1], iArrA[0], sb2);
        String string = sb2.toString();
        int[] iArr = f61992c;
        int length = string.length();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= length2) {
                z10 = false;
                break;
            }
            int i13 = iArr[i11];
            if (length == i13) {
                z10 = true;
                break;
            }
            if (i13 > i12) {
                i12 = i13;
            }
            i11++;
        }
        if (!z10 && length > i12) {
            z10 = true;
        }
        if (!z10) {
            throw a.a();
        }
        float f10 = i10;
        return new s6(string, null, new u6[]{new u6(iArrB[0], f10), new u6(iArrA[1], f10)}, BarcodeFormat.ITF);
    }
}

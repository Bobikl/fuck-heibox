package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: Code39Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t0 extends g5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f62363e = {52, bb.c.b.D2, 97, bb.c.b.O3, 49, 304, 112, 37, bb.c.b.G2, 100, bb.c.b.f30623f2, 73, bb.c.b.f30877q3, 25, bb.c.b.f30964u2, 88, 13, bb.c.b.f30692i2, 76, 28, bb.c.b.Z1, 67, bb.c.b.f30739k3, 19, bb.c.b.f30830o2, 82, 7, bb.c.b.f30553c2, 70, 22, bb.c.b.f30988v4, 193, bb.c.b.G5, 145, 400, 208, 133, bb.c.b.f31054y4, bb.c.b.O0, bb.c.b.f30782m0, 162, 138, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f62364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f62365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StringBuilder f62366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f62367d;

    public t0() {
        this(false);
    }

    public t0(boolean z10) {
        this(z10, false);
    }

    public t0(boolean z10, boolean z11) {
        this.f62364a = z10;
        this.f62365b = z11;
        this.f62366c = new StringBuilder(20);
        this.f62367d = new int[9];
    }

    private static char a(char c10, char c11) throws a {
        int i10;
        if (c10 != '$') {
            if (c10 != '%') {
                if (c10 != '+') {
                    if (c10 == '/') {
                        if (c11 < 'A' || c11 > 'O') {
                            if (c11 == 'Z') {
                                return ':';
                            }
                            throw a.a();
                        }
                        i10 = c11 - ' ';
                    }
                    return (char) 0;
                }
                if (c11 < 'A' || c11 > 'Z') {
                    throw a.a();
                }
                i10 = c11 + ' ';
            } else if (c11 >= 'A' && c11 <= 'E') {
                i10 = c11 - '&';
            } else if (c11 >= 'F' && c11 <= 'J') {
                i10 = c11 - 11;
            } else if (c11 >= 'K' && c11 <= 'O') {
                i10 = c11 + 16;
            } else {
                if (c11 < 'P' || c11 > 'T') {
                    if (c11 != 'U') {
                        if (c11 == 'V') {
                            return '@';
                        }
                        if (c11 == 'W') {
                            return '`';
                        }
                        if (c11 == 'X' || c11 == 'Y' || c11 == 'Z') {
                            return com.google.common.base.a.N;
                        }
                        throw a.a();
                    }
                    return (char) 0;
                }
                i10 = c11 + '+';
            }
        } else {
            if (c11 < 'A' || c11 > 'Z') {
                throw a.a();
            }
            i10 = c11 - '@';
        }
        return (char) i10;
    }

    private static char a(int i10) throws a {
        int i11 = 0;
        while (true) {
            int[] iArr = f62363e;
            if (i11 >= iArr.length) {
                if (i10 == 148) {
                    return '*';
                }
                throw a.a();
            }
            if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
            }
            i11++;
        }
    }

    private s6 a(StringBuilder sb2, int[] iArr, int i10, int i11, int i12) throws a {
        if (this.f62364a) {
            int length = sb2.length() - 1;
            int iIndexOf = 0;
            for (int i13 = 0; i13 < length; i13++) {
                iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f62366c.charAt(i13));
            }
            if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                throw a.a();
            }
            sb2.setLength(length);
        }
        if (sb2.length() == 0) {
            throw a.a();
        }
        float f10 = i12;
        return new s6(this.f62365b ? a(sb2) : sb2.toString(), null, new u6[]{new u6(iArr[0], f10), new u6(i10 + i11, f10)}, BarcodeFormat.CODE_39);
    }

    private static String a(CharSequence charSequence) throws a {
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '+' || cCharAt == '$' || cCharAt == '%' || cCharAt == '/') {
                i10++;
                sb2.append(a(cCharAt, charSequence.charAt(i10)));
            } else {
                sb2.append(cCharAt);
            }
            i10++;
        }
        return sb2.toString();
    }

    private static int[] a(r rVar, int[] iArr) throws a {
        int iE = rVar.e();
        int iC = rVar.c(0);
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = iC;
        while (iC < iE) {
            if (rVar.b(iC) == z10) {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (c(iArr) == 148 && rVar.a(Math.max(0, i11 - ((iC - i11) / 5)), i11, false, true)) {
                        return new int[]{i11, iC};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i10] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z10 = !z10;
            } else {
                if (i10 < 0 || i10 >= iArr.length) {
                    throw a.a();
                }
                iArr[i10] = iArr[i10] + 1;
            }
            iC++;
        }
        throw a.a();
    }

    private static boolean b(int[] iArr) {
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 < i10) {
                i10 = i12;
            }
            if (i12 > i11) {
                i11 = i12;
            }
        }
        return i11 / i10 > 6;
    }

    private static int c(int[] iArr) {
        int length = iArr.length;
        if (b(iArr)) {
            return -1;
        }
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i15 |= 1 << ((length - 1) - i16);
                    i13++;
                    i14 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if (i19 * 2 >= i14) {
                            return -1;
                        }
                    }
                }
                return i15;
            }
            if (i13 <= 3) {
                return -1;
            }
            i10 = i11;
        }
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i10, r rVar, Map<l1, ?> map) throws a {
        int[] iArr = this.f62367d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f62366c;
        sb2.setLength(0);
        int[] iArrA = a(rVar, iArr);
        int iC = rVar.c(iArrA[1]);
        int iE = rVar.e();
        while (true) {
            g5.a(rVar, iC, iArr);
            int iC2 = c(iArr);
            if (iC2 < 0) {
                throw a.a();
            }
            char cA = a(iC2);
            sb2.append(cA);
            int i11 = iC;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int iC3 = rVar.c(i11);
            if (cA == '*') {
                sb2.setLength(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                int i15 = (iC3 - iC) - i13;
                if (iC3 == iE || i15 * 5 >= i13) {
                    return a(sb2, iArrA, iC, i13, i10);
                }
                throw a.a();
            }
            iC = iC3;
        }
    }
}

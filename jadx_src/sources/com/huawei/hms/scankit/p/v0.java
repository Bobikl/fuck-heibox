package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: Code93Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v0 extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f62430c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f62431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f62432e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f62433a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f62434b = new int[6];

    static {
        int[] iArr = {bb.c.b.f30876q2, bb.c.b.f30877q3, bb.c.b.f30785m3, bb.c.b.f30739k3, bb.c.b.K2, bb.c.b.G2, bb.c.b.E2, bb.c.b.f31053y3, bb.c.b.f30830o2, bb.c.b.f30646g2, 424, 420, 418, 404, 402, bb.c.b.E4, 360, bb.c.b.S3, bb.c.b.Q3, 308, bb.c.b.f31008w2, bb.c.b.G3, bb.c.b.f30965u3, bb.c.b.f30831o3, 300, bb.c.b.f30920s2, bb.c.b.f30967u5, bb.c.b.f30923s5, bb.c.b.f30787m5, 422, 406, bb.c.b.U4, bb.c.b.f30509a4, bb.c.b.U3, 310, 314, 302, 468, bb.c.b.Y5, bb.c.b.Q5, bb.c.b.f30555c4, bb.c.b.f30740k4, bb.c.b.f30833o5, bb.c.b.I2, bb.c.b.f30650g6, bb.c.b.f30557c6, 306, bb.c.b.M3};
        f62431d = iArr;
        f62432e = iArr[47];
    }

    private static char a(char c10, char c11) throws a {
        int i10;
        switch (c10) {
            case 'a':
                if (c11 < 'A' || c11 > 'Z') {
                    throw a.a();
                }
                i10 = c11 - '@';
                break;
            case 'b':
                if (c11 >= 'A' && c11 <= 'E') {
                    i10 = c11 - '&';
                } else if (c11 >= 'F' && c11 <= 'J') {
                    i10 = c11 - 11;
                } else if (c11 >= 'K' && c11 <= 'O') {
                    i10 = c11 + 16;
                } else {
                    if (c11 < 'P' || c11 > 'S') {
                        if (c11 < 'T' || c11 > 'Z') {
                            throw a.a();
                        }
                        return com.google.common.base.a.N;
                    }
                    i10 = c11 + '+';
                }
                break;
            case 'c':
                if (c11 < 'A' || c11 > 'O') {
                    if (c11 == 'Z') {
                        return ':';
                    }
                    throw a.a();
                }
                i10 = c11 - ' ';
                break;
            case 'd':
                if (c11 < 'A' || c11 > 'Z') {
                    throw a.a();
                }
                i10 = c11 + ' ';
                break;
            default:
                return (char) 0;
        }
        return (char) i10;
    }

    private static char a(int i10) throws a {
        int i11 = 0;
        while (true) {
            int[] iArr = f62431d;
            if (i11 >= iArr.length) {
                throw a.a();
            }
            if (iArr[i11] == i10) {
                return f62430c[i11];
            }
            i11++;
        }
    }

    private static void a(CharSequence charSequence) throws a {
        int length = charSequence.length();
        a(charSequence, length - 2, 20);
        a(charSequence, length - 1, 15);
    }

    private static void a(CharSequence charSequence, int i10, int i11) throws a {
        int iIndexOf = 0;
        int i12 = 1;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i13)) * i12;
            i12++;
            if (i12 > i11) {
                i12 = 1;
            }
        }
        if (charSequence.charAt(i10) != f62430c[iIndexOf % 47]) {
            throw a.a();
        }
    }

    private int[] a(r rVar) throws a {
        int iE = rVar.e();
        int iC = rVar.c(0);
        Arrays.fill(this.f62434b, 0);
        int[] iArr = this.f62434b;
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = iC;
        while (iC < iE) {
            if (rVar.b(iC) == z10) {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (b(iArr) == f62432e) {
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

    private static int b(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int iRound = Math.round((iArr[i13] * 9.0f) / i10);
            if (iRound < 1 || iRound > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < iRound; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= iRound;
            }
        }
        return i12;
    }

    private static String b(CharSequence charSequence) throws a {
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'd') {
                sb2.append(cCharAt);
            } else {
                if (i10 >= length - 1) {
                    throw a.a();
                }
                i10++;
                sb2.append(a(cCharAt, charSequence.charAt(i10)));
            }
            i10++;
        }
        return sb2.toString();
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i10, r rVar, Map<l1, ?> map) throws a {
        int[] iArrA = a(rVar);
        int iC = rVar.c(iArrA[1]);
        int iE = rVar.e();
        int[] iArr = this.f62434b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f62433a;
        sb2.setLength(0);
        while (true) {
            g5.a(rVar, iC, iArr);
            int iB = b(iArr);
            if (iB < 0) {
                throw a.a();
            }
            char cA = a(iB);
            sb2.append(cA);
            int i11 = iC;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int iC2 = rVar.c(i11);
            if (cA == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                if (iC2 == iE || !rVar.b(iC2)) {
                    throw a.a();
                }
                if (sb2.length() < 2) {
                    throw a.a();
                }
                a(sb2);
                sb2.setLength(sb2.length() - 2);
                float f10 = i10;
                return new s6(b(sb2), null, new u6[]{new u6(iArrA[0], f10), new u6(iC + ((i13 * 10) / 9), f10)}, BarcodeFormat.CODE_93);
            }
            iC = iC2;
        }
    }
}

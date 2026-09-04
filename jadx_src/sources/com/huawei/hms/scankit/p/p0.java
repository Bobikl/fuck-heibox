package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: CodaBarReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends g5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f62213e = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f62214f = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char[] f62215g = {'A', 'B', 'C', 'D'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f62216a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f62217b = new int[80];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62218c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62219d;

    private void a(int i10) throws a {
        try {
            int[] iArr = this.f62217b;
            int i11 = this.f62218c;
            iArr[i11] = i10;
            int i12 = i11 + 1;
            this.f62218c = i12;
            if (i12 >= iArr.length) {
                int[] iArr2 = new int[i12 * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i12);
                this.f62217b = iArr2;
            }
        } catch (NumberFormatException unused) {
            throw a.a();
        }
    }

    private void a(r rVar) throws a {
        int i10 = 0;
        this.f62218c = 0;
        int iD = rVar.d(0);
        this.f62219d = iD;
        int iE = rVar.e();
        if (iD >= iE) {
            throw a.a();
        }
        boolean z10 = true;
        while (iD < iE) {
            if (rVar.b(iD) != z10) {
                i10++;
            } else {
                a(i10);
                z10 = !z10;
                i10 = 1;
            }
            iD++;
        }
        a(i10);
    }

    public static boolean a(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[] a() throws a {
        int iB = b();
        this.f62216a.setLength(0);
        int i10 = iB;
        do {
            int iB2 = b(i10);
            if (iB2 == -1) {
                throw a.a();
            }
            this.f62216a.append((char) iB2);
            i10 += 8;
            if (this.f62216a.length() > 1 && a(f62215g, f62213e[iB2])) {
                break;
            }
        } while (i10 < this.f62218c);
        int i11 = this.f62217b[i10 - 1];
        int i12 = 0;
        for (int i13 = -8; i13 < -1; i13++) {
            i12 += this.f62217b[i10 + i13];
        }
        if (i10 < this.f62218c && i11 < i12 / 2) {
            throw a.a();
        }
        c(iB);
        return new int[]{iB, i10};
    }

    private int b() throws a {
        for (int i10 = 1; i10 < this.f62218c; i10 += 2) {
            int iB = b(i10);
            if (iB != -1 && a(f62215g, f62213e[iB])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f62217b[i12];
                }
                if (i10 == 1 || this.f62217b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw a.a();
    }

    private int b(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f62218c) {
            return -1;
        }
        int[] iArr = this.f62217b;
        HashSet hashSet = new HashSet();
        for (int i12 = i10; i12 < i11; i12++) {
            hashSet.add(Integer.valueOf(iArr[i12]));
        }
        Iterator it = hashSet.iterator();
        int i13 = 0;
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        if (hashSet.size() > 0) {
            int size = iIntValue / hashSet.size();
            int i14 = 128;
            int i15 = 0;
            for (int i16 = 0; i16 < 7; i16++) {
                i14 >>= 1;
                if (iArr[i10 + i16] > size) {
                    i15 |= i14;
                }
            }
            while (true) {
                int[] iArr2 = f62214f;
                if (i13 >= iArr2.length) {
                    break;
                }
                if (iArr2[i13] == i15) {
                    return i13;
                }
                i13++;
            }
        }
        return -1;
    }

    private void c(int i10) throws a {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f62216a.length() - 1;
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (true) {
            int i14 = f62214f[this.f62216a.charAt(i13)];
            for (int i15 = 6; i15 >= 0; i15--) {
                int i16 = (i15 & 1) + ((i14 & 1) * 2);
                iArr[i16] = iArr[i16] + this.f62217b[i12 + i15];
                iArr2[i16] = iArr2[i16] + 1;
                i14 >>= 1;
            }
            if (i13 >= length) {
                break;
            }
            i12 += 8;
            i13++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i17 = 0; i17 < 2; i17++) {
            fArr2[i17] = 0.0f;
            int i18 = i17 + 2;
            float f10 = iArr[i17] / iArr2[i17];
            int i19 = iArr[i18];
            int i20 = iArr2[i18];
            float f11 = (f10 + (i19 / i20)) / 2.0f;
            fArr2[i18] = f11;
            fArr[i17] = f11;
            fArr[i18] = ((i19 * 2.0f) + 1.5f) / i20;
        }
        int i21 = i10;
        loop3: while (true) {
            int i22 = f62214f[this.f62216a.charAt(i11)];
            for (int i23 = 6; i23 >= 0; i23--) {
                int i24 = (i23 & 1) + ((i22 & 1) * 2);
                float f12 = this.f62217b[i21 + i23];
                if (f12 < fArr2[i24] || f12 > fArr[i24]) {
                    break loop3;
                }
                i22 >>= 1;
            }
            if (i11 >= length) {
                return;
            }
            i21 += 8;
            i11++;
        }
        throw a.a();
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i10, r rVar, Map<l1, ?> map) throws a {
        Arrays.fill(this.f62217b, 0);
        a(rVar);
        int[] iArrA = a();
        int i11 = iArrA[0];
        int i12 = iArrA[1];
        for (int i13 = 0; i13 < this.f62216a.length(); i13++) {
            StringBuilder sb2 = this.f62216a;
            sb2.setCharAt(i13, f62213e[sb2.charAt(i13)]);
        }
        char cCharAt = this.f62216a.charAt(0);
        char[] cArr = f62215g;
        if (!a(cArr, cCharAt)) {
            throw a.a();
        }
        StringBuilder sb3 = this.f62216a;
        if (!a(cArr, sb3.charAt(sb3.length() - 1))) {
            throw a.a();
        }
        if (this.f62216a.length() <= 3) {
            throw a.a();
        }
        int i14 = this.f62219d;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 += this.f62217b[i15];
        }
        float f10 = i14;
        while (i11 < i12 - 1) {
            i14 += this.f62217b[i11];
            i11++;
        }
        float f11 = i10;
        return new s6(this.f62216a.toString(), null, new u6[]{new u6(f10, f11), new u6(i14, f11)}, BarcodeFormat.CODABAR);
    }
}

package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ErrorCorrection.java */
/* JADX INFO: loaded from: classes7.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f62611a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f62612b = {new int[]{bb.c.b.f30963u1, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, bb.c.b.f30852p1, bb.c.b.O1, 116, 255, 110, 61}, new int[]{bb.c.b.f30940t0, 138, 205, 12, 194, bb.c.b.f30782m0, 39, bb.c.b.L1, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, bb.c.b.I1}, new int[]{156, 97, 192, 252, 95, 9, bb.c.b.f30528b0, 119, 138, 45, 18, bb.c.b.E0, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, bb.c.b.H1, 213, 109, 129, 94, 254, bb.c.b.f30897r1, 48, 90, 188}, new int[]{15, 195, 244, 9, bb.c.b.f31073z1, 71, bb.c.b.f30782m0, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, bb.c.b.f30918s0, bb.c.b.E0, 172}, new int[]{52, bb.c.b.I0, 88, 205, 109, 39, 176, 21, 155, bb.c.b.P0, 251, bb.c.b.f30852p1, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, bb.c.b.f31029x1, 43, 97, 71, 96, 103, bb.c.b.f30918s0, 37, 151, bb.c.b.f30828o0, 53, 75, 34, bb.c.b.P1, 121, 17, 138, 110, 213, 141, 136, 120, 151, bb.c.b.f31073z1, bb.c.b.f30782m0, 93, 255}, new int[]{bb.c.b.L1, 127, bb.c.b.I1, 218, 130, 250, 162, 181, 102, 120, 84, bb.c.b.f31028x0, 220, 251, 80, 182, bb.c.b.f30985v1, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, bb.c.b.f30940t0, 184, 59, 25, bb.c.b.f30897r1, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, bb.c.b.L1, 133, bb.c.b.I1, 8, bb.c.b.f30940t0, 95, 100, 9, 167, 105, bb.c.b.f30645g1, 111, 57, 121, 21, 1, 253, 57, 54, 101, bb.c.b.O1, 202, 69, 50, 150, 177, bb.c.b.f30919s1, 5, 9, 5}, new int[]{bb.c.b.L1, 132, 172, bb.c.b.f30852p1, 96, 32, 117, 22, bb.c.b.E1, 133, bb.c.b.E1, bb.c.b.f31029x1, 205, 188, bb.c.b.D1, 87, bb.c.b.J0, 106, 16, 147, 118, 23, 37, 90, bb.c.b.f30828o0, 205, 131, 88, 120, 100, 66, 138, bb.c.b.E0, 240, 82, 44, 176, 87, 187, 147, 160, bb.c.b.f30940t0, 69, 213, 92, 253, bb.c.b.f30897r1, 19}, new int[]{bb.c.b.f30940t0, 9, bb.c.b.f30852p1, bb.c.b.E1, 12, 17, 220, 208, 100, 29, bb.c.b.f30940t0, bb.c.b.f30828o0, bb.c.b.f31007w1, 192, 215, bb.c.b.B1, 150, 159, 36, bb.c.b.f30852p1, 38, 200, 132, 54, bb.c.b.f30963u1, 146, 218, bb.c.b.A1, 117, 203, 29, bb.c.b.f31051y1, 144, bb.c.b.E1, 22, 150, 201, 117, 62, 207, bb.c.b.f30690i0, 13, 137, bb.c.b.L1, 127, 67, 247, 28, 155, 43, 203, 107, bb.c.b.f31073z1, 53, 143, 46}, new int[]{bb.c.b.I1, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, bb.c.b.O0, 37, 185, 112, 134, bb.c.b.f31007w1, bb.c.b.L1, 63, bb.c.b.P0, bb.c.b.I0, 250, 106, 185, 221, bb.c.b.f30940t0, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, bb.c.b.f30828o0, 4, 107, bb.c.b.f31051y1, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, bb.c.b.f30963u1, bb.c.b.f30896r0, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, bb.c.b.O1, 180, bb.c.b.A1, bb.c.b.P0, 158, 177, 68, 122, 93, 213, 15, 160, bb.c.b.f30941t1, bb.c.b.C1, 66, 139, 153, 185, 202, 167, bb.c.b.f31028x0, 25, 220, bb.c.b.f31051y1, 96, 210, bb.c.b.f31029x1, 136, bb.c.b.f30852p1, bb.c.b.F1, 181, bb.c.b.H1, 59, 52, 172, 25, 49, bb.c.b.f31051y1, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, bb.c.b.E0}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f62613c = new int[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f62614d = new int[255];

    static {
        int i10 = 1;
        for (int i11 = 0; i11 < 255; i11++) {
            try {
                int[] iArr = f62614d;
                if (w7.a(iArr, i11)) {
                    iArr[i11] = i10;
                }
                int[] iArr2 = f62613c;
                if (w7.a(iArr2, i10)) {
                    iArr2[i10] = i11;
                }
                i10 *= 2;
                if (i10 >= 256) {
                    i10 ^= 301;
                }
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw e10;
            }
        }
    }

    private static String a(CharSequence charSequence, int i10) {
        return a(charSequence, 0, charSequence.length(), i10);
    }

    private static String a(CharSequence charSequence, int i10, int i11, int i12) throws Exception {
        int i13;
        int i14;
        int i15 = 0;
        while (true) {
            int[] iArr = f62611a;
            if (i15 >= iArr.length) {
                i15 = -1;
                break;
            }
            if (iArr[i15] == i12) {
                break;
            }
            i15++;
        }
        if (i15 < 0) {
            try {
                throw new IllegalArgumentException("Illegal number of error correction codewords specified: " + i12);
            } catch (Exception e10) {
                throw e10;
            }
        }
        int[] iArr2 = f62612b[i15];
        char[] cArr = new char[i12];
        for (int i16 = 0; i16 < i12; i16++) {
            cArr[i16] = 0;
        }
        for (int i17 = i10; i17 < i10 + i11; i17++) {
            int i18 = i12 - 1;
            int iCharAt = cArr[i18] ^ charSequence.charAt(i17);
            while (i18 > 0) {
                if (iCharAt == 0 || (i14 = iArr2[i18]) == 0) {
                    cArr[i18] = cArr[i18 - 1];
                } else {
                    char c10 = cArr[i18 - 1];
                    int[] iArr3 = f62614d;
                    int[] iArr4 = f62613c;
                    cArr[i18] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i14]) % 255] ^ c10);
                }
                i18--;
            }
            if (iCharAt == 0 || (i13 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = f62614d;
                int[] iArr6 = f62613c;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i13]) % 255];
            }
        }
        char[] cArr2 = new char[i12];
        for (int i19 = 0; i19 < i12; i19++) {
            cArr2[i19] = cArr[(i12 - i19) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String a(String str, d7 d7Var) throws Exception {
        if (str.length() != d7Var.a()) {
            try {
                throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
            } catch (Exception e10) {
                throw e10;
            }
        }
        StringBuilder sb2 = new StringBuilder(d7Var.a() + d7Var.b());
        sb2.append(str);
        int iD = d7Var.d();
        if (iD == 1) {
            sb2.append(a(str, d7Var.b()));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr = new int[iD];
            int[] iArr2 = new int[iD];
            int[] iArr3 = new int[iD];
            int i10 = 0;
            while (i10 < iD) {
                int i11 = i10 + 1;
                iArr[i10] = d7Var.a(i11);
                iArr2[i10] = d7Var.b(i11);
                iArr3[i10] = 0;
                if (i10 > 0) {
                    iArr3[i10] = iArr3[i10 - 1] + iArr[i10];
                }
                i10 = i11;
            }
            for (int i12 = 0; i12 < iD; i12++) {
                StringBuilder sb3 = new StringBuilder(iArr[i12]);
                for (int i13 = i12; i13 < d7Var.a(); i13 += iD) {
                    sb3.append(str.charAt(i13));
                }
                String strA = a(sb3.toString(), iArr2[i12]);
                int i14 = i12;
                int i15 = 0;
                while (i14 < iArr2[i12] * iD) {
                    sb2.setCharAt(d7Var.a() + i14, strA.charAt(i15));
                    i14 += iD;
                    i15++;
                }
            }
        }
        return sb2.toString();
    }
}

package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: compiled from: TsUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j0 {
    private j0() {
    }

    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static boolean b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(com.google.android.exoplayer2.util.e0 e0Var, int i10, int i11) {
        e0Var.S(i10);
        if (e0Var.a() < 5) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        int iO = e0Var.o();
        if ((8388608 & iO) != 0 || ((2096896 & iO) >> 8) != i11) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        if (((iO & 32) != 0) && e0Var.G() >= 7 && e0Var.a() >= 7) {
            if ((e0Var.G() & 16) == 16) {
                byte[] bArr = new byte[6];
                e0Var.k(bArr, 0, 6);
                return d(bArr);
            }
        }
        return com.google.android.exoplayer2.j.f46377b;
    }

    private static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}

package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: MaskUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r4 {
    static int a(c0 c0Var) {
        return a(c0Var, true) + a(c0Var, false);
    }

    private static int a(c0 c0Var, boolean z10) {
        int iB = z10 ? c0Var.b() : c0Var.c();
        int iC = z10 ? c0Var.c() : c0Var.b();
        byte[][] bArrA = c0Var.a();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            byte b10 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < iC; i13++) {
                byte b11 = z10 ? bArrA[i11][i13] : bArrA[i13][i11];
                if (b11 == b10) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += (i12 - 5) + 3;
                    }
                    i12 = 1;
                    b10 = b11;
                }
            }
            if (i12 >= 5) {
                i10 += (i12 - 5) + 3;
            }
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    static boolean a(int i10, int i11, int i12) throws Exception {
        int i13;
        int i14;
        switch (i10) {
            case 0:
                i12 += i11;
                i13 = i12 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 1:
                i13 = i12 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 2:
                i13 = i11 % 3;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 3:
                i13 = (i12 + i11) % 3;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 4:
                i12 /= 2;
                i11 /= 3;
                i12 += i11;
                i13 = i12 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i15 = i12 * i11;
                i13 = (i15 & 1) + (i15 % 3);
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i16 = i12 * i11;
                i14 = (i16 & 1) + (i16 % 3);
                i13 = i14 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 7:
                i14 = ((i12 * i11) % 3) + ((i12 + i11) & 1);
                i13 = i14 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            default:
                try {
                    throw new IllegalArgumentException("Invalid mask pattern: " + i10);
                } catch (Exception e10) {
                    throw e10;
                }
        }
    }

    private static boolean a(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, bArr.length);
        for (int iMax = Math.max(i10, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(byte[][] bArr, int i10, int i11, int i12) {
        int iMin = Math.min(i12, bArr.length);
        for (int iMax = Math.max(i11, 0); iMax < iMin; iMax++) {
            if (iMax < bArr.length && i10 < bArr[0].length && bArr[iMax][i10] == 1) {
                return false;
            }
        }
        return true;
    }

    static int b(c0 c0Var) {
        byte[][] bArrA = c0Var.a();
        int iC = c0Var.c();
        int iB = c0Var.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB - 1; i11++) {
            byte[] bArr = bArrA[i11];
            int i12 = 0;
            while (i12 < iC - 1) {
                byte b10 = bArr[i12];
                int i13 = i12 + 1;
                if (b10 == bArr[i13]) {
                    byte[] bArr2 = bArrA[i11 + 1];
                    if (b10 == bArr2[i12] && b10 == bArr2[i13]) {
                        i10++;
                    }
                }
                i12 = i13;
            }
        }
        return i10 * 3;
    }

    static int c(c0 c0Var) {
        byte[][] bArrA = c0Var.a();
        int iC = c0Var.c();
        int iB = c0Var.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            for (int i12 = 0; i12 < iC; i12++) {
                byte[] bArr = bArrA[i11];
                int i13 = i12 + 6;
                if (i13 < iC && bArr[i12] == 1 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 1 && bArr[i12 + 3] == 1 && bArr[i12 + 4] == 1 && bArr[i12 + 5] == 0 && bArr[i13] == 1 && (a(bArr, i12 - 4, i12) || a(bArr, i12 + 7, i12 + 11))) {
                    i10++;
                }
                int i14 = i11 + 6;
                if (i14 < iB && bArrA[i11][i12] == 1 && bArrA[i11 + 1][i12] == 0 && bArrA[i11 + 2][i12] == 1 && bArrA[i11 + 3][i12] == 1 && bArrA[i11 + 4][i12] == 1 && bArrA[i11 + 5][i12] == 0 && bArrA[i14][i12] == 1 && (a(bArrA, i12, i11 - 4, i11) || a(bArrA, i12, i11 + 7, i11 + 11))) {
                    i10++;
                }
            }
        }
        return i10 * 40;
    }

    static int d(c0 c0Var) {
        byte[][] bArrA = c0Var.a();
        int iC = c0Var.c();
        int iB = c0Var.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            byte[] bArr = bArrA[i11];
            for (int i12 = 0; i12 < iC; i12++) {
                if (bArr[i12] == 1) {
                    i10++;
                }
            }
        }
        int iB2 = c0Var.b() * c0Var.c();
        return ((Math.abs((i10 * 2) - iB2) * 10) / iB2) * 10;
    }
}

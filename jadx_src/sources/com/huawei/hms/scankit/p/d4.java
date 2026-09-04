package com.huawei.hms.scankit.p;

import java.util.Arrays;

/* JADX INFO: compiled from: HighLevelEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d4 {
    private static char a(char c10, int i10) {
        int i11 = c10 + ((i10 * 149) % 253) + 1;
        if (i11 > 254) {
            i11 -= 254;
        }
        return (char) i11;
    }

    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            while (b(cCharAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    cCharAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    static int a(CharSequence charSequence, int i10, int i11) {
        float[] fArr;
        if (i10 >= charSequence.length()) {
            return i11;
        }
        int i12 = 6;
        if (i11 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i11] = 0.0f;
        }
        int i13 = 0;
        while (true) {
            int i14 = i10 + i13;
            if (i14 == charSequence.length()) {
                byte[] bArr = new byte[i12];
                int[] iArr = new int[i12];
                int iA = a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iA2 = a(bArr);
                try {
                    if (w7.a(iArr, 0) && iArr[0] == iA) {
                        return 0;
                    }
                    if (iA2 == 1 && w7.a(bArr, 5) && bArr[5] > 0) {
                        return 5;
                    }
                    if (iA2 == 1 && w7.a(bArr, 4) && bArr[4] > 0) {
                        return 4;
                    }
                    if (iA2 == 1 && w7.a(bArr, 2) && bArr[2] > 0) {
                        return 2;
                    }
                    return (iA2 == 1 && w7.a(bArr, 3) && bArr[3] > 0) ? 3 : 1;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw e10;
                }
            }
            char cCharAt = charSequence.charAt(i14);
            i13++;
            if (b(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (c(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + 2.0f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (1 < fArr.length) {
                if (d(cCharAt)) {
                    fArr[1] = fArr[1] + 0.6666667f;
                } else if (c(cCharAt)) {
                    fArr[1] = fArr[1] + 2.6666667f;
                } else {
                    fArr[1] = fArr[1] + 1.3333334f;
                }
            }
            if (2 < fArr.length) {
                if (f(cCharAt)) {
                    fArr[2] = fArr[2] + 0.6666667f;
                } else if (c(cCharAt)) {
                    fArr[2] = fArr[2] + 2.6666667f;
                } else {
                    fArr[2] = fArr[2] + 1.3333334f;
                }
            }
            if (3 < fArr.length) {
                if (g(cCharAt)) {
                    fArr[3] = fArr[3] + 0.6666667f;
                } else if (c(cCharAt)) {
                    fArr[3] = fArr[3] + 4.3333335f;
                } else {
                    fArr[3] = fArr[3] + 3.3333333f;
                }
            }
            if (4 < fArr.length) {
                if (e(cCharAt)) {
                    fArr[4] = fArr[4] + 0.75f;
                } else if (c(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            if (5 < fArr.length) {
                if (h(cCharAt)) {
                    fArr[5] = fArr[5] + 4.0f;
                } else {
                    fArr[5] = fArr[5] + 1.0f;
                }
            }
            if (i13 >= 4) {
                int[] iArr2 = new int[i12];
                byte[] bArr2 = new byte[i12];
                a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iA3 = a(bArr2);
                try {
                    int i15 = iArr2[0];
                    int i16 = iArr2[5];
                    if (i15 < i16 && i15 < iArr2[1] && i15 < iArr2[2] && i15 < iArr2[3] && i15 < iArr2[4]) {
                        return 0;
                    }
                    if (i16 < i15) {
                        return 5;
                    }
                    byte b10 = bArr2[1];
                    byte b11 = bArr2[2];
                    byte b12 = bArr2[3];
                    byte b13 = bArr2[4];
                    if (b10 + b11 + b12 + b13 == 0) {
                        return 5;
                    }
                    if (iA3 == 1 && b13 > 0) {
                        return 4;
                    }
                    if (iA3 == 1 && b11 > 0) {
                        return 2;
                    }
                    if (iA3 == 1 && b12 > 0) {
                        return 3;
                    }
                    int i17 = iArr2[1];
                    if (i17 + 1 < i15 && i17 + 1 < i16 && i17 + 1 < iArr2[4] && i17 + 1 < iArr2[2]) {
                        int i18 = iArr2[3];
                        if (i17 < i18) {
                            return 1;
                        }
                        if (i17 == i18) {
                            for (int i19 = i10 + i13 + 1; i19 < charSequence.length(); i19++) {
                                char cCharAt2 = charSequence.charAt(i19);
                                if (i(cCharAt2)) {
                                    return 3;
                                }
                                if (!g(cCharAt2)) {
                                    break;
                                }
                            }
                            return 1;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw e11;
                }
            }
            i12 = 6;
        }
    }

    private static int a(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    private static int a(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 6; i11++) {
            int iCeil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = iCeil;
            if (i10 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = iCeil;
            }
            if (i10 == iCeil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    public static String a(String str, e7 e7Var, l2 l2Var, l2 l2Var2) {
        int iE = 0;
        v2[] v2VarArr = {new b(), new d0(), new g7(), new n8(), new s2(), new n()};
        y2 y2Var = new y2(str);
        y2Var.a(e7Var);
        y2Var.a(l2Var, l2Var2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            y2Var.a((char) 236);
            y2Var.a(2);
            y2Var.f62582f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            y2Var.a((char) 237);
            y2Var.a(2);
            y2Var.f62582f += 7;
        }
        while (y2Var.i()) {
            if (iE >= 0 && iE < 6) {
                v2VarArr[iE].a(y2Var);
            }
            if (y2Var.e() >= 0) {
                iE = y2Var.e();
                y2Var.j();
            }
        }
        int iA = y2Var.a();
        y2Var.l();
        int iA2 = y2Var.g().a();
        if (iA < iA2 && iE != 0 && iE != 5 && iE != 4) {
            y2Var.a((char) 254);
        }
        StringBuilder sbB = y2Var.b();
        if (sbB.length() < iA2) {
            sbB.append((char) 129);
        }
        while (sbB.length() < iA2) {
            sbB.append(a((char) 129, sbB.length() + 1));
        }
        return y2Var.b().toString();
    }

    static void a(char c10) throws Exception {
        String hexString = Integer.toHexString(c10);
        try {
            throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
        } catch (Exception e10) {
            throw e10;
        }
    }

    static boolean b(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    static boolean c(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    private static boolean d(char c10) {
        return c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean e(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    private static boolean f(char c10) {
        return c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'a' && c10 <= 'z');
    }

    private static boolean g(char c10) {
        return i(c10) || c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean h(char c10) {
        return false;
    }

    private static boolean i(char c10) {
        return c10 == '\r' || c10 == '*' || c10 == '>';
    }
}

package com.huawei.hms.scankit.p;

import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f61636b;

    static {
        String strName = Charset.defaultCharset().name();
        f61635a = strName;
        f61636b = "SJIS".equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
    }

    public static Boolean a(byte[] bArr) {
        int length = bArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            if ((b10 & 128) != 0) {
                int i11 = b10 & 255;
                if ((i11 < 170 && i11 > 160) || (i11 < 248 && i11 > 175)) {
                    i10++;
                    if (i10 < length) {
                        byte b11 = bArr[i10];
                        if ((b11 & 255) >= 255 || (b11 & 255) <= 160 || (b11 & 255) == 127) {
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                if (i11 < 161 && i11 > 128) {
                    i10++;
                    if (i10 < length) {
                        byte b12 = bArr[i10];
                        if ((b12 & 255) >= 255 || (b12 & 255) <= 63 || (b12 & 255) == 127) {
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                if (((i11 < 255 && i11 > 169) || (i11 < 170 && i11 > 167)) && (i10 = i10 + 1) < length) {
                    byte b13 = bArr[i10];
                    if ((b13 & 255) >= 161 || (b13 & 255) <= 63 || (b13 & 255) == 127) {
                    }
                }
                return Boolean.valueOf(z10);
            }
            i10++;
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }

    public static String a(byte[] bArr, Map<l1, ?> map) {
        int i10;
        if (map != null) {
            l1 l1Var = l1.CHARACTER_SET;
            if (map.containsKey(l1Var)) {
                return map.get(l1Var).toString();
            }
        }
        int[] iArr = new int[15];
        iArr[0] = bArr.length;
        iArr[1] = 1;
        iArr[2] = 1;
        iArr[3] = 1;
        boolean z10 = bArr.length > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
        int i11 = 0;
        while (true) {
            i10 = iArr[0];
            if (i11 >= i10 || !(iArr[1] == 1 || iArr[2] == 1 || iArr[3] == 1)) {
                break;
            }
            int i12 = bArr[i11] & 255;
            c(i12, iArr);
            b(i12, iArr);
            a(i12, iArr);
            i11++;
        }
        return a(bArr, iArr[3] == 1, iArr[2] == 1, iArr[1] == 1, iArr[4], iArr[8], z10, iArr[5], iArr[6], iArr[7], iArr[12], iArr[13], iArr[9], iArr[14], i10);
    }

    public static String a(byte[] bArr, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        if (z10 && i10 > 0) {
            z10 = false;
        }
        if (z11 && i11 > 0) {
            z11 = false;
        }
        if (z10 && (z13 || i12 + i13 + i14 > 0)) {
            return "UTF8";
        }
        if (a(bArr).booleanValue()) {
            return "GBK";
        }
        if (z11 && (f61636b || i15 >= 3 || i16 >= 3)) {
            return "SJIS";
        }
        if (z12 && z11) {
            return (!(i15 == 2 && i17 == 2) && i18 * 10 < i19) ? "ISO8859_1" : "SJIS";
        }
        if (z12 && i18 * 10 < i19) {
            return "ISO8859_1";
        }
        if (z11) {
            return "SJIS";
        }
        if (z10) {
            return "UTF8";
        }
        return (z10 || !"UTF-8".equals(f61635a)) ? f61635a : "GB2312";
    }

    private static void a(int i10, int[] iArr) {
        if (iArr[1] == 1) {
            if (i10 > 127 && i10 < 160) {
                iArr[1] = 0;
                return;
            }
            if (i10 > 159) {
                if (i10 < 192 || i10 == 215 || i10 == 247) {
                    iArr[14] = iArr[14] + 1;
                }
            }
        }
    }

    private static void b(int i10, int[] iArr) {
        if (iArr[2] == 1) {
            int i11 = iArr[8];
            if (i11 > 0) {
                if (i10 < 64 || i10 == 127 || i10 > 252) {
                    iArr[2] = 0;
                    return;
                } else {
                    iArr[8] = i11 - 1;
                    return;
                }
            }
            if (i10 == 128 || i10 == 160 || i10 > 239) {
                iArr[2] = 0;
                return;
            }
            if (i10 > 160 && i10 < 224) {
                iArr[9] = iArr[9] + 1;
                iArr[11] = 0;
                int i12 = iArr[10] + 1;
                iArr[10] = i12;
                if (i12 > iArr[12]) {
                    iArr[12] = i12;
                    return;
                }
                return;
            }
            if (i10 <= 127) {
                iArr[10] = 0;
                iArr[11] = 0;
                return;
            }
            iArr[8] = i11 + 1;
            iArr[10] = 0;
            int i13 = iArr[11] + 1;
            iArr[11] = i13;
            if (i13 > iArr[13]) {
                iArr[13] = i13;
            }
        }
    }

    private static void c(int i10, int[] iArr) {
        if (iArr[3] == 1) {
            int i11 = iArr[4];
            if (i11 > 0) {
                if ((i10 & 128) == 0) {
                    iArr[3] = 0;
                    return;
                } else {
                    iArr[4] = i11 - 1;
                    return;
                }
            }
            if ((i10 & 128) != 0) {
                if ((i10 & 64) == 0) {
                    iArr[3] = 0;
                    return;
                }
                int i12 = i11 + 1;
                iArr[4] = i12;
                if ((i10 & 32) == 0) {
                    iArr[5] = iArr[5] + 1;
                    return;
                }
                int i13 = i12 + 1;
                iArr[4] = i13;
                if ((i10 & 16) == 0) {
                    iArr[6] = iArr[6] + 1;
                    return;
                }
                iArr[4] = i13 + 1;
                if ((i10 & 8) == 0) {
                    iArr[7] = iArr[7] + 1;
                } else {
                    iArr[3] = 0;
                }
            }
        }
    }
}

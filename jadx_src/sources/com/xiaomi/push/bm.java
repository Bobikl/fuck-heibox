package com.xiaomi.push;

import com.tencent.qcloud.core.util.IOUtils;

/* JADX INFO: loaded from: classes4.dex */
public class bm {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static byte[] f219a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f106878a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static char[] f220a = new char[64];

    static {
        char c10 = 'A';
        int i10 = 0;
        while (c10 <= 'Z') {
            f220a[i10] = c10;
            c10 = (char) (c10 + 1);
            i10++;
        }
        char c11 = 'a';
        while (c11 <= 'z') {
            f220a[i10] = c11;
            c11 = (char) (c11 + 1);
            i10++;
        }
        char c12 = '0';
        while (c12 <= '9') {
            f220a[i10] = c12;
            c12 = (char) (c12 + 1);
            i10++;
        }
        char[] cArr = f220a;
        cArr[i10] = '+';
        cArr[i10 + 1] = IOUtils.DIR_SEPARATOR_UNIX;
        f219a = new byte[128];
        int i11 = 0;
        while (true) {
            byte[] bArr = f219a;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        for (int i12 = 0; i12 < 64; i12++) {
            f219a[f220a[i12]] = (byte) i12;
        }
    }

    public static String a(String str) {
        return new String(a(str.getBytes()));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m189a(String str) {
        return a(str.toCharArray());
    }

    public static byte[] a(char[] cArr) {
        return a(cArr, 0, cArr.length);
    }

    public static byte[] a(char[] cArr, int i10, int i11) {
        int i12;
        char c10;
        char c11;
        int i13;
        if (i11 % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (i11 > 0 && cArr[(i10 + i11) - 1] == '=') {
            i11--;
        }
        int i14 = (i11 * 3) / 4;
        byte[] bArr = new byte[i14];
        int i15 = i11 + i10;
        int i16 = 0;
        while (i10 < i15) {
            int i17 = i10 + 1;
            char c12 = cArr[i10];
            int i18 = i17 + 1;
            char c13 = cArr[i17];
            if (i18 < i15) {
                i12 = i18 + 1;
                c10 = cArr[i18];
            } else {
                i12 = i18;
                c10 = 'A';
            }
            if (i12 < i15) {
                i13 = i12 + 1;
                c11 = cArr[i12];
            } else {
                int i19 = i12;
                c11 = 'A';
                i13 = i19;
            }
            if (c12 > 127 || c13 > 127 || c10 > 127 || c11 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = f219a;
            byte b10 = bArr2[c12];
            byte b11 = bArr2[c13];
            byte b12 = bArr2[c10];
            byte b13 = bArr2[c11];
            if (b10 < 0 || b11 < 0 || b12 < 0 || b13 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i20 = (b10 << 2) | (b11 >>> 4);
            int i21 = ((b11 & 15) << 4) | (b12 >>> 2);
            int i22 = ((b12 & 3) << 6) | b13;
            int i23 = i16 + 1;
            bArr[i16] = (byte) i20;
            if (i23 < i14) {
                bArr[i23] = (byte) i21;
                i23++;
            }
            if (i23 < i14) {
                bArr[i23] = (byte) i22;
                i16 = i23 + 1;
            } else {
                i16 = i23;
            }
            i10 = i13;
        }
        return bArr;
    }

    public static char[] a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static char[] a(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15 = ((i11 * 4) + 2) / 3;
        char[] cArr = new char[((i11 + 2) / 3) * 4];
        int i16 = i11 + i10;
        int i17 = 0;
        while (i10 < i16) {
            int i18 = i10 + 1;
            int i19 = bArr[i10] & 255;
            if (i18 < i16) {
                i12 = i18 + 1;
                i13 = bArr[i18] & 255;
            } else {
                i12 = i18;
                i13 = 0;
            }
            if (i12 < i16) {
                i14 = bArr[i12] & 255;
                i12++;
            } else {
                i14 = 0;
            }
            int i20 = i19 >>> 2;
            int i21 = ((i19 & 3) << 4) | (i13 >>> 4);
            int i22 = ((i13 & 15) << 2) | (i14 >>> 6);
            int i23 = i14 & 63;
            int i24 = i17 + 1;
            char[] cArr2 = f220a;
            cArr[i17] = cArr2[i20];
            int i25 = i24 + 1;
            cArr[i24] = cArr2[i21];
            char c10 = n5.a.f132013h;
            cArr[i25] = i25 < i15 ? cArr2[i22] : '=';
            int i26 = i25 + 1;
            if (i26 < i15) {
                c10 = cArr2[i23];
            }
            cArr[i26] = c10;
            i17 = i26 + 1;
            i10 = i12;
        }
        return cArr;
    }

    public static String b(String str) {
        return new String(m189a(str));
    }
}

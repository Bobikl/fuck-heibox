package com.igexin.a.a.a;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static void a(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }

    public static boolean a(byte[] bArr) {
        int length = bArr.length;
        if (length <= 0 || length > 256) {
            return false;
        }
        int i10 = 0;
        for (byte b10 : bArr) {
            if ((b10 & 255) == 14 && (i10 = i10 + 1) > 3) {
                return false;
            }
        }
        return true;
    }

    public static byte[] a(byte[] bArr, String str) {
        return c(bArr, str);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (!a(bArr2)) {
            throw new IllegalArgumentException("key is fail!");
        }
        if (bArr.length < 1) {
            throw new IllegalArgumentException("data is fail!");
        }
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            i11 = ((i11 + iArr[i12]) + (bArr2[i12 % bArr2.length] & 255)) % 256;
            a(iArr, i12, i11);
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            i13 = (i13 + 1) % 256;
            i14 = (i14 + iArr[i13]) % 256;
            a(iArr, i13, i14);
            bArr3[i15] = (byte) (iArr[(iArr[i13] + iArr[i14]) % 256] ^ bArr[i15]);
        }
        return bArr3;
    }

    public static byte[] b(byte[] bArr, String str) {
        return d(bArr, str);
    }

    public static byte[] c(byte[] bArr, String str) {
        return a(bArr, str.getBytes());
    }

    public static byte[] d(byte[] bArr, String str) {
        return a(bArr, str.getBytes());
    }
}

package z8;

import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@com.google.android.gms.common.internal.t
@v8.a
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f141947a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f141948b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @n0
    @v8.a
    public static String a(@n0 byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 & 255;
            int i12 = i10 + 1;
            char[] cArr2 = f141948b;
            cArr[i10] = cArr2[i11 >>> 4];
            i10 = i12 + 1;
            cArr[i12] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    @n0
    @v8.a
    public static String b(@n0 byte[] bArr) {
        return c(bArr, false);
    }

    @n0
    @v8.a
    public static String c(@n0 byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length && (!z10 || i10 != length - 1 || (bArr[i10] & 255) != 0); i10++) {
            char[] cArr = f141947a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    @n0
    @v8.a
    public static byte[] d(@n0 String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
            i10 = i11;
        }
        return bArr;
    }
}

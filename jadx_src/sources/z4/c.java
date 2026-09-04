package z4;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile SecureRandom f141847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f141848b = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    public static SecureRandom b() {
        if (f141847a != null) {
            return f141847a;
        }
        synchronized (c.class) {
            if (f141847a == null) {
                f141847a = new SecureRandom();
            }
        }
        return f141847a;
    }

    public static byte[] c(byte b10) {
        return new byte[]{b10};
    }

    public static byte[] d(char c10) {
        return new byte[]{(byte) (c10 & 255)};
    }

    public static byte[] e(char c10, char c11) {
        return new byte[]{(byte) (c10 & 255), (byte) (c11 & 255)};
    }

    public static byte[] f(int i10) {
        return new byte[]{(byte) i10, (byte) (i10 >> 8), (byte) (i10 >> 16), (byte) (i10 >> 24)};
    }

    public static byte[] g(long j10) {
        return new byte[]{(byte) j10, (byte) (j10 >> 8), (byte) (j10 >> 16), (byte) (j10 >> 24), (byte) (j10 >> 32), (byte) (j10 >> 40), (byte) (j10 >> 48), (byte) (j10 >> 56)};
    }

    public static byte[] h(short s10) {
        return new byte[]{(byte) s10, (byte) (s10 >> 8)};
    }

    public static byte[] i(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = null;
        int length2 = 0;
        for (byte[] bArr3 : bArr) {
            if (bArrCopyOf == null) {
                bArrCopyOf = Arrays.copyOf(bArr3, length);
                length2 = bArr3.length;
            } else {
                System.arraycopy(bArr3, 0, bArrCopyOf, length2, bArr3.length);
                length2 += bArr3.length;
            }
        }
        return bArrCopyOf;
    }

    public static String j(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f141848b;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static byte[] k() {
        byte[] bArr = new byte[2];
        b().nextBytes(bArr);
        return bArr;
    }

    public static byte[] l() {
        byte[] bArr = new byte[4];
        b().nextBytes(bArr);
        return bArr;
    }
}

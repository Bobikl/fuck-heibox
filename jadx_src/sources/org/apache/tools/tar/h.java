package org.apache.tools.tar;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.apache.tools.zip.r;
import org.apache.tools.zip.s;

/* JADX INFO: compiled from: TarUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f137366a = 255;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final r f137367b = s.b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final r f137368c = new a();

    /* JADX INFO: compiled from: TarUtils.java */
    public class a implements r {
        a() {
        }

        @Override // org.apache.tools.zip.r
        public ByteBuffer a(String str) {
            int length = str.length();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                bArr[i10] = (byte) str.charAt(i10);
            }
            return ByteBuffer.wrap(bArr);
        }

        @Override // org.apache.tools.zip.r
        public boolean b(String str) {
            return true;
        }

        @Override // org.apache.tools.zip.r
        public String decode(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder(bArr.length);
            for (byte b10 : bArr) {
                if (b10 == 0) {
                    break;
                }
                sb2.append((char) (b10 & 255));
            }
            return sb2.toString();
        }
    }

    private h() {
    }

    public static long a(byte[] bArr) {
        long j10 = 0;
        for (byte b10 : bArr) {
            j10 += (long) (b10 & 255);
        }
        return j10;
    }

    private static String b(byte[] bArr, int i10, int i11, int i12, byte b10) {
        return String.format("Invalid byte %s at offset %d in '%s' len=%d", Byte.valueOf(b10), Integer.valueOf(i12 - i10), new String(bArr, i10, i11).replaceAll("\u0000", "{NUL}"), Integer.valueOf(i11));
    }

    private static void c(long j10, byte[] bArr, int i10, int i11, boolean z10) {
        byte[] byteArray = BigInteger.valueOf(j10).toByteArray();
        int length = byteArray.length;
        int i12 = (i11 + i10) - length;
        System.arraycopy(byteArray, 0, bArr, i12, length);
        byte b10 = (byte) (z10 ? 255 : 0);
        while (true) {
            i10++;
            if (i10 >= i12) {
                return;
            } else {
                bArr[i10] = b10;
            }
        }
    }

    public static int d(long j10, byte[] bArr, int i10, int i11) {
        int i12 = i11 - 2;
        k(j10, bArr, i10, i12);
        bArr[i12 + i10] = 0;
        bArr[i12 + 1 + i10] = 32;
        return i10 + i11;
    }

    private static void e(long j10, byte[] bArr, int i10, int i11, boolean z10) {
        int i12 = (i11 - 1) * 8;
        long j11 = 1 << i12;
        long jAbs = Math.abs(j10);
        if (jAbs >= j11) {
            throw new IllegalArgumentException("Value " + j10 + " is too large for " + i11 + " byte field.");
        }
        if (z10) {
            jAbs = ((jAbs ^ (j11 - 1)) | ((long) (255 << i12))) + 1;
        }
        for (int i13 = (i11 + i10) - 1; i13 >= i10; i13--) {
            bArr[i13] = (byte) jAbs;
            jAbs >>= 8;
        }
    }

    public static int f(long j10, byte[] bArr, int i10, int i11) {
        int i12 = i11 - 1;
        k(j10, bArr, i10, i12);
        bArr[i12 + i10] = 32;
        return i10 + i11;
    }

    public static int g(long j10, byte[] bArr, int i10, int i11) {
        long j11 = i11 == 8 ? c.f137285g : c.f137288j;
        boolean z10 = j10 < 0;
        if (!z10 && j10 <= j11) {
            return f(j10, bArr, i10, i11);
        }
        if (i11 < 9) {
            e(j10, bArr, i10, i11, z10);
        }
        c(j10, bArr, i10, i11, z10);
        bArr[i10] = (byte) (z10 ? 255 : 128);
        return i10 + i11;
    }

    public static int h(String str, byte[] bArr, int i10, int i11) {
        try {
            try {
                return i(str, bArr, i10, i11, f137367b);
            } catch (IOException unused) {
                return i(str, bArr, i10, i11, f137368c);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int i(String str, byte[] bArr, int i10, int i11, r rVar) throws IOException {
        int length = str.length();
        ByteBuffer byteBufferA = rVar.a(str);
        while (byteBufferA.limit() > i11 && length > 0) {
            length--;
            byteBufferA = rVar.a(str.substring(0, length));
        }
        int iLimit = byteBufferA.limit() - byteBufferA.position();
        System.arraycopy(byteBufferA.array(), byteBufferA.arrayOffset(), bArr, i10, iLimit);
        while (iLimit < i11) {
            bArr[i10 + iLimit] = 0;
            iLimit++;
        }
        return i10 + i11;
    }

    public static int j(long j10, byte[] bArr, int i10, int i11) {
        int i12 = i11 - 2;
        k(j10, bArr, i10, i12);
        bArr[i12 + i10] = 32;
        bArr[i12 + 1 + i10] = 0;
        return i10 + i11;
    }

    public static void k(long j10, byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = i11 - 1;
        if (j10 == 0) {
            i12 = i13 - 1;
            bArr[i13 + i10] = c.F;
        } else {
            long j11 = j10;
            while (i13 >= 0 && j11 != 0) {
                bArr[i10 + i13] = (byte) (((byte) (7 & j11)) + c.F);
                j11 >>>= 3;
                i13--;
            }
            if (j11 != 0) {
                throw new IllegalArgumentException(String.format("%d=%s will not fit in octal number buffer of length %d", Long.valueOf(j10), Long.toOctalString(j10), Integer.valueOf(i11)));
            }
            i12 = i13;
        }
        while (i12 >= 0) {
            bArr[i10 + i12] = c.F;
            i12--;
        }
    }

    private static long l(byte[] bArr, int i10, int i11, boolean z10) {
        int i12 = i11 - 1;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i10 + 1, bArr2, 0, i12);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z10) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException(String.format("At offset %d, %d byte binary number exceeds maximum signed long value", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        long jLongValue = bigInteger.longValue();
        return z10 ? -jLongValue : jLongValue;
    }

    private static long m(byte[] bArr, int i10, int i11, boolean z10) {
        if (i11 >= 9) {
            throw new IllegalArgumentException(String.format("At offset %d, %d byte binary number exceeds maximum signed long value", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        long jPow = 0;
        for (int i12 = 1; i12 < i11; i12++) {
            jPow = (jPow << 8) + ((long) (bArr[i10 + i12] & 255));
        }
        if (z10) {
            jPow = (jPow - 1) ^ (((long) Math.pow(2.0d, ((double) (i11 - 1)) * 8.0d)) - 1);
        }
        return z10 ? -jPow : jPow;
    }

    public static boolean n(byte[] bArr, int i10) {
        return bArr[i10] == 1;
    }

    public static String o(byte[] bArr, int i10, int i11) {
        try {
            try {
                return p(bArr, i10, i11, f137367b);
            } catch (IOException unused) {
                return p(bArr, i10, i11, f137368c);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String p(byte[] bArr, int i10, int i11, r rVar) throws IOException {
        while (i11 > 0 && bArr[(i10 + i11) - 1] == 0) {
            i11--;
        }
        if (i11 <= 0) {
            return "";
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return rVar.decode(bArr2);
    }

    public static long q(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        if (i11 < 2) {
            throw new IllegalArgumentException("Length " + i11 + " must be at least 2");
        }
        long j10 = 0;
        if (bArr[i10] == 0) {
            return 0L;
        }
        int i13 = i10;
        while (i13 < i12 && bArr[i13] == 32) {
            i13++;
        }
        byte b10 = bArr[i12 - 1];
        while (i13 < i12 && (b10 == 0 || b10 == 32)) {
            i12--;
            b10 = bArr[i12 - 1];
        }
        while (i13 < i12) {
            byte b11 = bArr[i13];
            if (b11 < 48 || b11 > 55) {
                throw new IllegalArgumentException(b(bArr, i10, i11, i13, b11));
            }
            j10 = (j10 << 3) + ((long) (b11 - 48));
            i13++;
        }
        return j10;
    }

    public static long r(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10];
        if ((b10 & 128) == 0) {
            return q(bArr, i10, i11);
        }
        boolean z10 = b10 == -1;
        return i11 < 9 ? m(bArr, i10, i11, z10) : l(bArr, i10, i11, z10);
    }
}

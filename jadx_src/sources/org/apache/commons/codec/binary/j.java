package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: BinaryCodec.java */
/* JADX INFO: loaded from: classes5.dex */
public class j implements mj.a, mj.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f132903c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f132904d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f132905e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f132906f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f132907g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f132908h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f132909i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f132910j = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f132901a = new char[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f132902b = new byte[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f132911k = {1, 2, 4, 8, 16, 32, 64, 128};

    public static byte[] b(byte[] bArr) {
        if (d(bArr)) {
            return f132902b;
        }
        int length = bArr.length >> 3;
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = 0;
            while (true) {
                int[] iArr = f132911k;
                if (i11 < iArr.length) {
                    if (bArr[length2 - i11] == 49) {
                        bArr2[i10] = (byte) (iArr[i11] | bArr2[i10]);
                    }
                    i11++;
                }
            }
            i10++;
            length2 -= 8;
        }
        return bArr2;
    }

    public static byte[] c(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return f132902b;
        }
        int length = cArr.length >> 3;
        byte[] bArr = new byte[length];
        int length2 = cArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = 0;
            while (true) {
                int[] iArr = f132911k;
                if (i11 < iArr.length) {
                    if (cArr[length2 - i11] == '1') {
                        bArr[i10] = (byte) (iArr[i11] | bArr[i10]);
                    }
                    i11++;
                }
            }
            i10++;
            length2 -= 8;
        }
        return bArr;
    }

    private static boolean d(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static byte[] e(byte[] bArr) {
        if (d(bArr)) {
            return f132902b;
        }
        int length = bArr.length << 3;
        byte[] bArr2 = new byte[length];
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = 0;
            while (true) {
                int[] iArr = f132911k;
                if (i12 < iArr.length) {
                    if ((iArr[i12] & bArr[i11]) == 0) {
                        bArr2[i10 - i12] = org.apache.tools.tar.c.F;
                    } else {
                        bArr2[i10 - i12] = org.apache.tools.tar.c.G;
                    }
                    i12++;
                }
            }
            i11++;
            i10 -= 8;
        }
        return bArr2;
    }

    public static char[] f(byte[] bArr) {
        if (d(bArr)) {
            return f132901a;
        }
        int length = bArr.length << 3;
        char[] cArr = new char[length];
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = 0;
            while (true) {
                int[] iArr = f132911k;
                if (i12 < iArr.length) {
                    if ((iArr[i12] & bArr[i11]) == 0) {
                        cArr[i10 - i12] = '0';
                    } else {
                        cArr[i10 - i12] = '1';
                    }
                    i12++;
                }
            }
            i11++;
            i10 -= 8;
        }
        return cArr;
    }

    public static String g(byte[] bArr) {
        return new String(f(bArr));
    }

    @Override // mj.d
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return f132902b;
        }
        if (obj instanceof byte[]) {
            return b((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return c((char[]) obj);
        }
        if (obj instanceof String) {
            return c(((String) obj).toCharArray());
        }
        throw new DecoderException("argument not a byte array");
    }

    @Override // mj.a
    public byte[] decode(byte[] bArr) {
        return b(bArr);
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return f((byte[]) obj);
        }
        throw new EncoderException("argument not a byte array");
    }

    @Override // mj.b
    public byte[] encode(byte[] bArr) {
        return e(bArr);
    }

    public byte[] h(String str) {
        return str == null ? f132902b : c(str.toCharArray());
    }
}

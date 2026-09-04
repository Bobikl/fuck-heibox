package com.google.common.primitives;

import com.google.common.base.w;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b
public final class SignedBytes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f59068a = 64;

    public enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int iMin = Math.min(bArr.length, bArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iB = SignedBytes.b(bArr[i10], bArr2[i10]);
                if (iB != 0) {
                    return iB;
                }
            }
            return bArr.length - bArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    private SignedBytes() {
    }

    public static byte a(long j10) {
        byte b10 = (byte) j10;
        w.p(((long) b10) == j10, "Out of range: %s", j10);
        return b10;
    }

    public static int b(byte b10, byte b11) {
        return b10 - b11;
    }

    public static String c(String str, byte... bArr) {
        w.E(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 5);
        sb2.append((int) bArr[0]);
        for (int i10 = 1; i10 < bArr.length; i10++) {
            sb2.append(str);
            sb2.append((int) bArr[i10]);
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> d() {
        return LexicographicalComparator.INSTANCE;
    }

    public static byte e(byte... bArr) {
        w.d(bArr.length > 0);
        byte b10 = bArr[0];
        for (int i10 = 1; i10 < bArr.length; i10++) {
            byte b11 = bArr[i10];
            if (b11 > b10) {
                b10 = b11;
            }
        }
        return b10;
    }

    public static byte f(byte... bArr) {
        w.d(bArr.length > 0);
        byte b10 = bArr[0];
        for (int i10 = 1; i10 < bArr.length; i10++) {
            byte b11 = bArr[i10];
            if (b11 < b10) {
                b10 = b11;
            }
        }
        return b10;
    }

    public static byte g(long j10) {
        if (j10 > 127) {
            return (byte) 127;
        }
        if (j10 < -128) {
            return (byte) -128;
        }
        return (byte) j10;
    }

    public static void h(byte[] bArr) {
        w.E(bArr);
        i(bArr, 0, bArr.length);
    }

    public static void i(byte[] bArr, int i10, int i11) {
        w.E(bArr);
        w.f0(i10, i11, bArr.length);
        Arrays.sort(bArr, i10, i11);
        Bytes.n(bArr, i10, i11);
    }
}

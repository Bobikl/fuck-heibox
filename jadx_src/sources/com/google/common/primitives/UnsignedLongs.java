package com.google.common.primitives;

import com.google.common.base.w;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@b
@o9.b
public final class UnsignedLongs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f59084a = -1;

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                long j10 = jArr[i10];
                long j11 = jArr2[i10];
                if (j10 != j11) {
                    return UnsignedLongs.a(j10, j11);
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final long[] f59085a = new long[37];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int[] f59086b = new int[37];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int[] f59087c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i10 = 2; i10 <= 36; i10++) {
                long j10 = i10;
                f59085a[i10] = UnsignedLongs.c(-1L, j10);
                f59086b[i10] = (int) UnsignedLongs.k(-1L, j10);
                f59087c[i10] = bigInteger.toString(i10).length() - 1;
            }
        }

        private a() {
        }

        static boolean a(long j10, int i10, int i11) {
            if (j10 < 0) {
                return true;
            }
            long j11 = f59085a[i11];
            if (j10 < j11) {
                return false;
            }
            return j10 > j11 || i10 > f59086b[i11];
        }
    }

    private UnsignedLongs() {
    }

    public static int a(long j10, long j11) {
        return Longs.d(d(j10), d(j11));
    }

    @s9.a
    public static long b(String str) {
        f fVarA = f.a(str);
        try {
            return j(fVarA.f59088a, fVarA.f59089b);
        } catch (NumberFormatException e10) {
            String strValueOf = String.valueOf(str);
            NumberFormatException numberFormatException = new NumberFormatException(strValueOf.length() != 0 ? "Error parsing value: ".concat(strValueOf) : new String("Error parsing value: "));
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }

    public static long c(long j10, long j11) {
        if (j11 < 0) {
            return a(j10, j11) < 0 ? 0L : 1L;
        }
        if (j10 >= 0) {
            return j10 / j11;
        }
        long j12 = ((j10 >>> 1) / j11) << 1;
        return j12 + ((long) (a(j10 - (j12 * j11), j11) < 0 ? 0 : 1));
    }

    private static long d(long j10) {
        return j10 ^ Long.MIN_VALUE;
    }

    public static String e(String str, long... jArr) {
        w.E(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 5);
        sb2.append(p(jArr[0]));
        for (int i10 = 1; i10 < jArr.length; i10++) {
            sb2.append(str);
            sb2.append(p(jArr[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<long[]> f() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long g(long... jArr) {
        w.d(jArr.length > 0);
        long jD = d(jArr[0]);
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long jD2 = d(jArr[i10]);
            if (jD2 > jD) {
                jD = jD2;
            }
        }
        return d(jD);
    }

    public static long h(long... jArr) {
        w.d(jArr.length > 0);
        long jD = d(jArr[0]);
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long jD2 = d(jArr[i10]);
            if (jD2 < jD) {
                jD = jD2;
            }
        }
        return d(jD);
    }

    @s9.a
    public static long i(String str) {
        return j(str, 10);
    }

    @s9.a
    public static long j(String str, int i10) {
        w.E(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i10 < 2 || i10 > 36) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("illegal radix: ");
            sb2.append(i10);
            throw new NumberFormatException(sb2.toString());
        }
        int i11 = a.f59087c[i10] - 1;
        long j10 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            int iDigit = Character.digit(str.charAt(i12), i10);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i12 > i11 && a.a(j10, iDigit, i10)) {
                throw new NumberFormatException(str.length() != 0 ? "Too large for unsigned long: ".concat(str) : new String("Too large for unsigned long: "));
            }
            j10 = (j10 * ((long) i10)) + ((long) iDigit);
        }
        return j10;
    }

    public static long k(long j10, long j11) {
        if (j11 < 0) {
            return a(j10, j11) < 0 ? j10 : j10 - j11;
        }
        if (j10 >= 0) {
            return j10 % j11;
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if (a(j12, j11) < 0) {
            j11 = 0;
        }
        return j12 - j11;
    }

    public static void l(long[] jArr) {
        w.E(jArr);
        m(jArr, 0, jArr.length);
    }

    public static void m(long[] jArr, int i10, int i11) {
        w.E(jArr);
        w.f0(i10, i11, jArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            jArr[i12] = d(jArr[i12]);
        }
        Arrays.sort(jArr, i10, i11);
        while (i10 < i11) {
            jArr[i10] = d(jArr[i10]);
            i10++;
        }
    }

    public static void n(long[] jArr) {
        w.E(jArr);
        o(jArr, 0, jArr.length);
    }

    public static void o(long[] jArr, int i10, int i11) {
        w.E(jArr);
        w.f0(i10, i11, jArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            jArr[i12] = Long.MAX_VALUE ^ jArr[i12];
        }
        Arrays.sort(jArr, i10, i11);
        while (i10 < i11) {
            jArr[i10] = jArr[i10] ^ Long.MAX_VALUE;
            i10++;
        }
    }

    public static String p(long j10) {
        return q(j10, 10);
    }

    public static String q(long j10, int i10) {
        w.k(i10 >= 2 && i10 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i10);
        if (j10 == 0) {
            return "0";
        }
        if (j10 > 0) {
            return Long.toString(j10, i10);
        }
        int i11 = 64;
        char[] cArr = new char[64];
        int i12 = i10 - 1;
        if ((i10 & i12) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10);
            do {
                i11--;
                cArr[i11] = Character.forDigit(((int) j10) & i12, i10);
                j10 >>>= iNumberOfTrailingZeros;
            } while (j10 != 0);
        } else {
            long jC = (i10 & 1) == 0 ? (j10 >>> 1) / ((long) (i10 >>> 1)) : c(j10, i10);
            long j11 = i10;
            cArr[63] = Character.forDigit((int) (j10 - (jC * j11)), i10);
            i11 = 63;
            while (jC > 0) {
                i11--;
                cArr[i11] = Character.forDigit((int) (jC % j11), i10);
                jC /= j11;
            }
        }
        return new String(cArr, i11, 64 - i11);
    }
}

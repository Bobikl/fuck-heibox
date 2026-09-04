package com.google.common.math;

import com.google.android.exoplayer2.q2;
import com.google.common.base.w;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedLongs;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes7.dex */
@e
@o9.b(emulated = true)
public final class LongMath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @o9.d
    static final long f58725a = 4611686018427387904L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @o9.d
    static final long f58726b = -5402926248376769404L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @o9.d
    static final long f58730f = 3037000499L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f58734j = -545925251;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @o9.d
    static final byte[] f58727c = {19, com.google.common.base.a.f56668u, com.google.common.base.a.f56668u, com.google.common.base.a.f56668u, com.google.common.base.a.f56668u, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @o9.c
    @o9.d
    static final long[] f58728d = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, com.google.android.exoplayer2.j.f46409j, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, q2.f47326n, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @o9.c
    @o9.d
    static final long[] f58729e = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long[] f58731g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f58732h = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, bb.c.e.Je, bb.c.b.su, bb.c.b.f30589de, bb.c.b.f30835o7, bb.c.b.X3, bb.c.b.f30623f2, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @o9.d
    static final int[] f58733i = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, bb.c.m.f34930oa, bb.c.d.Tl, bb.c.b.nm, bb.c.b.f30700ia, 419, bb.c.b.B2, bb.c.b.f30645g1, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long[][] f58735k = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long j10, long j11, long j12) {
                return (j10 * j11) % j12;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long j10, long j11) {
                return (j10 * j10) % j11;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j10, long j11, long j12) {
                long j13 = j10 + j11;
                return j10 >= j12 - j11 ? j13 - j12 : j13;
            }

            private long times2ToThe32Mod(long j10, long j11) {
                int i10 = 32;
                do {
                    int iMin = Math.min(i10, Long.numberOfLeadingZeros(j10));
                    j10 = UnsignedLongs.k(j10 << iMin, j11);
                    i10 -= iMin;
                } while (i10 > 0);
                return j10;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long j10, long j11, long j12) {
                long j13 = j10 >>> 32;
                long j14 = j11 >>> 32;
                long j15 = j10 & KeyboardMap.kValueMask;
                long j16 = j11 & KeyboardMap.kValueMask;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j13 * j14, j12) + (j13 * j16);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = UnsignedLongs.k(jTimes2ToThe32Mod, j12);
                }
                Long.signum(j15);
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + (j14 * j15), j12), UnsignedLongs.k(j15 * j16, j12), j12);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long j10, long j11) {
                long j12 = j10 >>> 32;
                long j13 = j10 & KeyboardMap.kValueMask;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j12 * j12, j11);
                long jK = j12 * j13 * 2;
                if (jK < 0) {
                    jK = UnsignedLongs.k(jK, j11);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jK, j11), UnsignedLongs.k(j13 * j13, j11), j11);
            }
        };

        /* synthetic */ MillerRabinTester(a aVar) {
            this();
        }

        private long powMod(long j10, long j11, long j12) {
            long jMulMod = 1;
            while (j11 != 0) {
                if ((j11 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, j10, j12);
                }
                j10 = squareMod(j10, j12);
                j11 >>= 1;
            }
            return jMulMod;
        }

        static boolean test(long j10, long j11) {
            return (j11 <= LongMath.f58730f ? SMALL : LARGE).testWitness(j10, j11);
        }

        private boolean testWitness(long j10, long j11) {
            long j12 = j11 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
            long j13 = j12 >> iNumberOfTrailingZeros;
            long j14 = j10 % j11;
            if (j14 == 0) {
                return true;
            }
            long jPowMod = powMod(j14, j13, j11);
            if (jPowMod == 1) {
                return true;
            }
            int i10 = 0;
            while (jPowMod != j12) {
                i10++;
                if (i10 == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = squareMod(jPowMod, j11);
            }
            return true;
        }

        abstract long mulMod(long j10, long j11, long j12);

        abstract long squareMod(long j10, long j11);
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58736a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f58736a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58736a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58736a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58736a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58736a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58736a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58736a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f58736a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private LongMath() {
    }

    @o9.a
    public static long A(long j10, long j11) {
        long j12 = j10 - j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) >= 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @o9.c
    public static long B(long j10, RoundingMode roundingMode) {
        h.f("x", j10);
        if (i(j10)) {
            return f.x((int) j10, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j10);
        long j11 = jSqrt * jSqrt;
        switch (a.f58736a[roundingMode.ordinal()]) {
            case 1:
                h.k(j11 == j10);
                return jSqrt;
            case 2:
            case 3:
                return j10 < j11 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j10 > j11 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j12 = jSqrt - ((long) (j10 >= j11 ? 0 : 1));
                return j12 + ((long) n((j12 * j12) + j12, j10));
            default:
                throw new AssertionError();
        }
    }

    public static long a(int i10, int i11) {
        h.e("n", i10);
        h.e("k", i11);
        w.m(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        long jU = 1;
        if (i11 == 0) {
            return 1L;
        }
        if (i11 == 1) {
            return i10;
        }
        long[] jArr = f58731g;
        if (i10 < jArr.length) {
            return jArr[i10] / (jArr[i11] * jArr[i10 - i11]);
        }
        int[] iArr = f58732h;
        if (i11 >= iArr.length || i10 > iArr[i11]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = f58733i;
        if (i11 < iArr2.length && i10 <= iArr2[i11]) {
            int i12 = i10 - 1;
            long j10 = i10;
            for (int i13 = 2; i13 <= i11; i13++) {
                j10 = (j10 * ((long) i12)) / ((long) i13);
                i12--;
            }
            return j10;
        }
        long j11 = i10;
        int iQ = q(j11, RoundingMode.CEILING);
        int i14 = i10 - 1;
        int i15 = iQ;
        int i16 = 2;
        long j12 = j11;
        long j13 = 1;
        while (i16 <= i11) {
            i15 += iQ;
            if (i15 < 63) {
                j12 *= (long) i14;
                j13 *= (long) i16;
            } else {
                jU = u(jU, j12, j13);
                j12 = i14;
                j13 = i16;
                i15 = iQ;
            }
            i16++;
            i14--;
        }
        return u(jU, j12, j13);
    }

    @o9.a
    public static long b(long j10) {
        h.i("x", j10);
        if (j10 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j10 - 1));
        }
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append("ceilingPowerOfTwo(");
        sb2.append(j10);
        sb2.append(") is not representable as a long");
        throw new ArithmeticException(sb2.toString());
    }

    @o9.c
    public static long c(long j10, long j11) {
        long j12 = j10 + j11;
        h.c(((j10 ^ j11) < 0) | ((j10 ^ j12) >= 0), "checkedAdd", j10, j11);
        return j12;
    }

    public static long d(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        h.c(iNumberOfLeadingZeros >= 64, "checkedMultiply", j10, j11);
        h.c((j10 >= 0) | (j11 != Long.MIN_VALUE), "checkedMultiply", j10, j11);
        long j12 = j10 * j11;
        h.c(j10 == 0 || j12 / j10 == j11, "checkedMultiply", j10, j11);
        return j12;
    }

    @o9.c
    public static long e(long j10, int i10) {
        h.e("exponent", i10);
        long jD = 1;
        if ((j10 >= -2) && (j10 <= 2)) {
            int i11 = (int) j10;
            if (i11 == -2) {
                h.c(i10 < 64, "checkedPow", j10, i10);
                return (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
            }
            if (i11 == -1) {
                return (i10 & 1) == 0 ? 1L : -1L;
            }
            if (i11 == 0) {
                return i10 == 0 ? 1L : 0L;
            }
            if (i11 == 1) {
                return 1L;
            }
            if (i11 != 2) {
                throw new AssertionError();
            }
            h.c(i10 < 63, "checkedPow", j10, i10);
            return 1 << i10;
        }
        long j11 = j10;
        int i12 = i10;
        while (i12 != 0) {
            if (i12 == 1) {
                return d(jD, j11);
            }
            if ((i12 & 1) != 0) {
                jD = d(jD, j11);
            }
            long j12 = jD;
            int i13 = i12 >> 1;
            if (i13 > 0) {
                h.c(-3037000499L <= j11 && j11 <= f58730f, "checkedPow", j11, i13);
                j11 *= j11;
            }
            i12 = i13;
            jD = j12;
        }
        return jD;
    }

    @o9.c
    public static long f(long j10, long j11) {
        long j12 = j10 - j11;
        h.c(((j10 ^ j11) >= 0) | ((j10 ^ j12) >= 0), "checkedSubtract", j10, j11);
        return j12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @o9.c
    public static long g(long j10, long j11, RoundingMode roundingMode) {
        w.E(roundingMode);
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        boolean z10 = true;
        int i10 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (a.f58736a[roundingMode.ordinal()]) {
            case 1:
                h.k(j13 == 0);
                z10 = false;
                if (z10) {
                    return j12 + ((long) i10);
                }
                return j12;
            case 2:
                z10 = false;
                if (z10) {
                    return j12 + ((long) i10);
                }
                return j12;
            case 3:
                if (i10 >= 0) {
                    z10 = false;
                }
                if (z10) {
                    return j12 + ((long) i10);
                }
                return j12;
            case 4:
                if (z10) {
                    return j12 + ((long) i10);
                }
                return j12;
            case 5:
                if (i10 <= 0) {
                    z10 = false;
                }
                if (z10) {
                    return j12 + ((long) i10);
                }
                return j12;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j13);
                long jAbs2 = jAbs - (Math.abs(j11) - jAbs);
                if (jAbs2 != 0 ? jAbs2 <= 0 : roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                    z10 = false;
                }
                if (z10) {
                    return j12 + ((long) i10);
                }
                return j12;
            default:
                throw new AssertionError();
        }
    }

    @o9.c
    public static long h(int i10) {
        h.e("n", i10);
        long[] jArr = f58731g;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        return Long.MAX_VALUE;
    }

    static boolean i(long j10) {
        return ((long) ((int) j10)) == j10;
    }

    @o9.a
    public static long j(long j10) {
        h.i("x", j10);
        return 1 << (63 - Long.numberOfLeadingZeros(j10));
    }

    public static long k(long j10, long j11) {
        h.f(ak.av, j10);
        h.f("b", j11);
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean l(long j10) {
        return (j10 > 0) & ((j10 & (j10 - 1)) == 0);
    }

    @o9.a
    @o9.c
    public static boolean m(long j10) {
        if (j10 < 2) {
            h.f("n", j10);
            return false;
        }
        if (j10 < 66) {
            return ((722865708377213483 >> (((int) j10) + (-2))) & 1) != 0;
        }
        if ((f58734j & (1 << ((int) (j10 % 30)))) != 0 || j10 % 7 == 0 || j10 % 11 == 0 || j10 % 13 == 0) {
            return false;
        }
        if (j10 < 289) {
            return true;
        }
        for (long[] jArr : f58735k) {
            if (j10 <= jArr[0]) {
                for (int i10 = 1; i10 < jArr.length; i10++) {
                    if (!MillerRabinTester.test(jArr[i10], j10)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @o9.d
    static int n(long j10, long j11) {
        return (int) ((~(~(j10 - j11))) >>> 63);
    }

    @o9.c
    public static int o(long j10, RoundingMode roundingMode) {
        int iN;
        h.i("x", j10);
        int iP = p(j10);
        long j11 = f58728d[iP];
        switch (a.f58736a[roundingMode.ordinal()]) {
            case 1:
                h.k(j10 == j11);
            case 2:
            case 3:
                return iP;
            case 4:
            case 5:
                iN = n(j11, j10);
                return iP + iN;
            case 6:
            case 7:
            case 8:
                iN = n(f58729e[iP], j10);
                return iP + iN;
            default:
                throw new AssertionError();
        }
    }

    @o9.c
    static int p(long j10) {
        byte b10 = f58727c[Long.numberOfLeadingZeros(j10)];
        return b10 - n(j10, f58728d[b10]);
    }

    public static int q(long j10, RoundingMode roundingMode) {
        h.i("x", j10);
        switch (a.f58736a[roundingMode.ordinal()]) {
            case 1:
                h.k(l(j10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10);
                return (63 - iNumberOfLeadingZeros) + n(f58726b >>> iNumberOfLeadingZeros, j10);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j10);
    }

    public static long r(long j10, long j11) {
        return (j10 & j11) + ((j10 ^ j11) >> 1);
    }

    @o9.c
    public static int s(long j10, int i10) {
        return (int) t(j10, i10);
    }

    @o9.c
    public static long t(long j10, long j11) {
        if (j11 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }

    static long u(long j10, long j11, long j12) {
        if (j10 == 1) {
            return j11 / j12;
        }
        long jK = k(j10, j12);
        return (j10 / jK) * (j11 / (j12 / jK));
    }

    @o9.c
    public static long v(long j10, int i10) {
        h.e("exponent", i10);
        if (-2 > j10 || j10 > 2) {
            long j11 = 1;
            while (i10 != 0) {
                if (i10 == 1) {
                    return j11 * j10;
                }
                j11 *= (i10 & 1) == 0 ? 1L : j10;
                j10 *= j10;
                i10 >>= 1;
            }
            return j11;
        }
        int i11 = (int) j10;
        if (i11 == -2) {
            if (i10 < 64) {
                return (i10 & 1) == 0 ? 1 << i10 : -(1 << i10);
            }
            return 0L;
        }
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (i10 < 64) {
            return 1 << i10;
        }
        return 0L;
    }

    @o9.c
    public static double w(long j10, RoundingMode roundingMode) {
        double dNextUp;
        long jCeil;
        double d10 = j10;
        long jFloor = (long) d10;
        int iD = jFloor == Long.MAX_VALUE ? -1 : Longs.d(j10, jFloor);
        int[] iArr = a.f58736a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                h.k(iD == 0);
                return d10;
            case 2:
                if (j10 >= 0) {
                    return iD >= 0 ? d10 : d.f(d10);
                }
                return iD <= 0 ? d10 : Math.nextUp(d10);
            case 3:
                return iD >= 0 ? d10 : d.f(d10);
            case 4:
                if (j10 >= 0) {
                    return iD <= 0 ? d10 : Math.nextUp(d10);
                }
                return iD >= 0 ? d10 : d.f(d10);
            case 5:
                return iD <= 0 ? d10 : Math.nextUp(d10);
            case 6:
            case 7:
            case 8:
                if (iD >= 0) {
                    dNextUp = Math.nextUp(d10);
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    double dF = d.f(d10);
                    jFloor = (long) Math.floor(dF);
                    dNextUp = d10;
                    d10 = dF;
                    jCeil = jFloor;
                }
                long j11 = j10 - jFloor;
                long j12 = jCeil - j10;
                if (jCeil == Long.MAX_VALUE) {
                    j12++;
                }
                int iD2 = Longs.d(j11, j12);
                if (iD2 < 0) {
                    return d10;
                }
                if (iD2 > 0) {
                    return dNextUp;
                }
                int i10 = iArr[roundingMode.ordinal()];
                if (i10 == 6) {
                    return j10 >= 0 ? d10 : dNextUp;
                }
                if (i10 == 7) {
                    return j10 >= 0 ? dNextUp : d10;
                }
                if (i10 == 8) {
                    return (d.c(d10) & 1) == 0 ? d10 : dNextUp;
                }
                throw new AssertionError("impossible");
            default:
                throw new AssertionError("impossible");
        }
    }

    @o9.a
    public static long x(long j10, long j11) {
        long j12 = j10 + j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @o9.a
    public static long y(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = ((j10 ^ j11) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j11 == Long.MIN_VALUE) & (j10 < 0))) {
            return j12;
        }
        long j13 = j10 * j11;
        return (j10 == 0 || j13 / j10 == j11) ? j13 : j12;
    }

    @o9.a
    public static long z(long j10, int i10) {
        h.e("exponent", i10);
        long jY = 1;
        if (!(j10 >= -2) || !(j10 <= 2)) {
            long j11 = ((j10 >>> 63) & ((long) (i10 & 1))) + Long.MAX_VALUE;
            while (i10 != 0) {
                if (i10 == 1) {
                    return y(jY, j10);
                }
                if ((i10 & 1) != 0) {
                    jY = y(jY, j10);
                }
                i10 >>= 1;
                if (i10 > 0) {
                    if ((-3037000499L > j10) || (j10 > f58730f)) {
                        return j11;
                    }
                    j10 *= j10;
                }
            }
            return jY;
        }
        int i11 = (int) j10;
        if (i11 == -2) {
            if (i10 >= 64) {
                return ((long) (i10 & 1)) + Long.MAX_VALUE;
            }
            return (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
        }
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (i10 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i10;
    }
}

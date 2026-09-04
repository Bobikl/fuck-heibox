package com.google.common.math;

import com.google.common.base.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BigIntegerMath.java */
/* JADX INFO: loaded from: classes7.dex */
@e
@o9.b(emulated = true)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @o9.d
    static final int f58748a = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @o9.d
    static final BigInteger f58749b = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f58750c = Math.log(10.0d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double f58751d = Math.log(2.0d);

    /* JADX INFO: compiled from: BigIntegerMath.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58752a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f58752a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58752a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58752a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58752a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58752a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58752a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58752a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f58752a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BigIntegerMath.java */
    @o9.c
    public static class C0481b extends m<BigInteger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0481b f58753a = new C0481b();

        private C0481b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger.subtract(bigInteger2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigInteger bigInteger) {
            return d.a(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.m
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.m
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigInteger e(double d10, RoundingMode roundingMode) {
            return c.o(d10, roundingMode);
        }
    }

    private b() {
    }

    public static BigInteger a(int i10, int i11) {
        h.e("n", i10);
        h.e("k", i11);
        int i12 = 1;
        w.m(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        int[] iArr = LongMath.f58732h;
        if (i11 < iArr.length && i10 <= iArr[i11]) {
            return BigInteger.valueOf(LongMath.a(i10, i11));
        }
        BigInteger bigIntegerDivide = BigInteger.ONE;
        long j10 = i10;
        long j11 = 1;
        int iQ = LongMath.q(j10, RoundingMode.CEILING);
        while (true) {
            int i13 = iQ;
            while (i12 < i11) {
                int i14 = i10 - i12;
                i12++;
                i13 += iQ;
                if (i13 >= 63) {
                    bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(j10)).divide(BigInteger.valueOf(j11));
                    j10 = i14;
                    j11 = i12;
                } else {
                    j10 *= (long) i14;
                    j11 *= (long) i12;
                }
            }
            return bigIntegerDivide.multiply(BigInteger.valueOf(j10)).divide(BigInteger.valueOf(j11));
        }
    }

    @o9.a
    public static BigInteger b(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(k(bigInteger, RoundingMode.CEILING));
    }

    @o9.c
    public static BigInteger c(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    public static BigInteger d(int i10) {
        h.e("n", i10);
        long[] jArr = LongMath.f58731g;
        if (i10 < jArr.length) {
            return BigInteger.valueOf(jArr[i10]);
        }
        ArrayList arrayList = new ArrayList(f.g(f.p(i10, RoundingMode.CEILING) * i10, 64, RoundingMode.CEILING));
        int length = jArr.length;
        long j10 = jArr[length - 1];
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros;
        int iQ = LongMath.q(j11, RoundingMode.FLOOR) + 1;
        long j12 = length;
        int iQ2 = LongMath.q(j12, RoundingMode.FLOOR) + 1;
        int i11 = 1 << (iQ2 - 1);
        while (j12 <= i10) {
            if ((j12 & ((long) i11)) != 0) {
                i11 <<= 1;
                iQ2++;
            }
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j12);
            long j13 = j12 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((iQ2 - iNumberOfTrailingZeros2) + iQ >= 64) {
                arrayList.add(BigInteger.valueOf(j11));
                j11 = 1;
            }
            j11 *= j13;
            iQ = LongMath.q(j11, RoundingMode.FLOOR) + 1;
            j12++;
        }
        if (j11 > 1) {
            arrayList.add(BigInteger.valueOf(j11));
        }
        return h(arrayList).shiftLeft(iNumberOfTrailingZeros);
    }

    @o9.c
    static boolean e(BigInteger bigInteger) {
        return bigInteger.bitLength() <= 63;
    }

    @o9.a
    public static BigInteger f(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(k(bigInteger, RoundingMode.FLOOR));
    }

    public static boolean g(BigInteger bigInteger) {
        w.E(bigInteger);
        return bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1;
    }

    static BigInteger h(List<BigInteger> list) {
        return i(list, 0, list.size());
    }

    static BigInteger i(List<BigInteger> list, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 == 0) {
            return BigInteger.ONE;
        }
        if (i12 == 1) {
            return list.get(i10);
        }
        if (i12 == 2) {
            return list.get(i10).multiply(list.get(i10 + 1));
        }
        if (i12 == 3) {
            return list.get(i10).multiply(list.get(i10 + 1)).multiply(list.get(i10 + 2));
        }
        int i13 = (i11 + i10) >>> 1;
        return i(list, i10, i13).multiply(i(list, i13, i11));
    }

    @o9.c
    public static int j(BigInteger bigInteger, RoundingMode roundingMode) {
        int iCompareTo;
        h.j("x", bigInteger);
        if (e(bigInteger)) {
            return LongMath.o(bigInteger.longValue(), roundingMode);
        }
        int iK = (int) ((((double) k(bigInteger, RoundingMode.FLOOR)) * f58751d) / f58750c);
        BigInteger bigIntegerPow = BigInteger.TEN.pow(iK);
        int iCompareTo2 = bigIntegerPow.compareTo(bigInteger);
        if (iCompareTo2 > 0) {
            do {
                iK--;
                bigIntegerPow = bigIntegerPow.divide(BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(bigInteger);
            } while (iCompareTo > 0);
        } else {
            BigInteger bigIntegerMultiply = BigInteger.TEN.multiply(bigIntegerPow);
            int i10 = iCompareTo2;
            int iCompareTo3 = bigIntegerMultiply.compareTo(bigInteger);
            while (iCompareTo3 <= 0) {
                iK++;
                BigInteger bigIntegerMultiply2 = BigInteger.TEN.multiply(bigIntegerMultiply);
                int iCompareTo4 = bigIntegerMultiply2.compareTo(bigInteger);
                BigInteger bigInteger2 = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
                bigIntegerPow = bigInteger2;
                i10 = iCompareTo3;
                iCompareTo3 = iCompareTo4;
            }
            iCompareTo = i10;
        }
        switch (a.f58752a[roundingMode.ordinal()]) {
            case 1:
                h.k(iCompareTo == 0);
            case 2:
            case 3:
                return iK;
            case 4:
            case 5:
                return bigIntegerPow.equals(bigInteger) ? iK : iK + 1;
            case 6:
            case 7:
            case 8:
                return bigInteger.pow(2).compareTo(bigIntegerPow.pow(2).multiply(BigInteger.TEN)) <= 0 ? iK : iK + 1;
            default:
                throw new AssertionError();
        }
    }

    public static int k(BigInteger bigInteger, RoundingMode roundingMode) {
        h.j("x", (BigInteger) w.E(bigInteger));
        int iBitLength = bigInteger.bitLength() - 1;
        switch (a.f58752a[roundingMode.ordinal()]) {
            case 1:
                h.k(g(bigInteger));
            case 2:
            case 3:
                return iBitLength;
            case 4:
            case 5:
                return g(bigInteger) ? iBitLength : iBitLength + 1;
            case 6:
            case 7:
            case 8:
                if (iBitLength < 256) {
                    return bigInteger.compareTo(f58749b.shiftRight(256 - iBitLength)) <= 0 ? iBitLength : iBitLength + 1;
                }
                return bigInteger.pow(2).bitLength() + (-1) < (iBitLength * 2) + 1 ? iBitLength : iBitLength + 1;
            default:
                throw new AssertionError();
        }
    }

    @o9.c
    public static double l(BigInteger bigInteger, RoundingMode roundingMode) {
        return C0481b.f58753a.b(bigInteger, roundingMode);
    }

    @o9.c
    public static BigInteger m(BigInteger bigInteger, RoundingMode roundingMode) {
        h.g("x", bigInteger);
        if (e(bigInteger)) {
            return BigInteger.valueOf(LongMath.B(bigInteger.longValue(), roundingMode));
        }
        BigInteger bigIntegerO = o(bigInteger);
        switch (a.f58752a[roundingMode.ordinal()]) {
            case 1:
                h.k(bigIntegerO.pow(2).equals(bigInteger));
            case 2:
            case 3:
                return bigIntegerO;
            case 4:
            case 5:
                int iIntValue = bigIntegerO.intValue();
                return iIntValue * iIntValue == bigInteger.intValue() && bigIntegerO.pow(2).equals(bigInteger) ? bigIntegerO : bigIntegerO.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return bigIntegerO.pow(2).add(bigIntegerO).compareTo(bigInteger) >= 0 ? bigIntegerO : bigIntegerO.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    @o9.c
    private static BigInteger n(BigInteger bigInteger) {
        return c.o(Math.sqrt(d.a(bigInteger)), RoundingMode.HALF_EVEN);
    }

    @o9.c
    private static BigInteger o(BigInteger bigInteger) {
        BigInteger bigIntegerShiftLeft;
        int iK = k(bigInteger, RoundingMode.FLOOR);
        if (iK < 1023) {
            bigIntegerShiftLeft = n(bigInteger);
        } else {
            int i10 = (iK - 52) & (-2);
            bigIntegerShiftLeft = n(bigInteger.shiftRight(i10)).shiftLeft(i10 >> 1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(bigInteger.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            return bigIntegerShiftLeft;
        }
        while (true) {
            BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight.add(bigInteger.divide(bigIntegerShiftRight)).shiftRight(1);
            if (bigIntegerShiftRight2.compareTo(bigIntegerShiftRight) >= 0) {
                return bigIntegerShiftRight;
            }
            bigIntegerShiftRight = bigIntegerShiftRight2;
        }
    }
}

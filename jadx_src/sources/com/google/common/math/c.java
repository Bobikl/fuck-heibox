package com.google.common.math;

import com.google.common.base.w;
import com.google.common.primitives.Booleans;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

/* JADX INFO: compiled from: DoubleMath.java */
/* JADX INFO: loaded from: classes7.dex */
@e
@o9.b(emulated = true)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f58754a = -2.147483648E9d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f58755b = 2.147483647E9d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f58756c = -9.223372036854776E18d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double f58757d = 9.223372036854776E18d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @o9.d
    static final int f58759f = 170;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double f58758e = Math.log(2.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @o9.d
    static final double[] f58760g = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: compiled from: DoubleMath.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58761a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f58761a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58761a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58761a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58761a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58761a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58761a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58761a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f58761a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private c() {
    }

    @s9.a
    @o9.c
    private static double a(double d10) {
        w.d(d.d(d10));
        return d10;
    }

    public static double b(int i10) {
        h.e("n", i10);
        if (i10 > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d10 = 1.0d;
        int i11 = i10 & (-16);
        while (true) {
            i11++;
            if (i11 > i10) {
                return d10 * f58760g[i10 >> 4];
            }
            d10 *= (double) i11;
        }
    }

    public static int c(double d10, double d11, double d12) {
        if (d(d10, d11, d12)) {
            return 0;
        }
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        return Booleans.d(Double.isNaN(d10), Double.isNaN(d11));
    }

    public static boolean d(double d10, double d11, double d12) {
        h.d("tolerance", d12);
        return Math.copySign(d10 - d11, 1.0d) <= d12 || d10 == d11 || (Double.isNaN(d10) && Double.isNaN(d11));
    }

    @o9.c
    public static boolean e(double d10) {
        return d.d(d10) && (d10 == 0.0d || 52 - Long.numberOfTrailingZeros(d.c(d10)) <= Math.getExponent(d10));
    }

    @o9.c
    public static boolean f(double d10) {
        if (d10 <= 0.0d || !d.d(d10)) {
            return false;
        }
        long jC = d.c(d10);
        return (jC & (jC - 1)) == 0;
    }

    public static double g(double d10) {
        return Math.log(d10) / f58758e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @o9.c
    public static int h(double d10, RoundingMode roundingMode) {
        boolean zF;
        boolean z10 = false;
        w.e(d10 > 0.0d && d.d(d10), "x must be positive and finite");
        int exponent = Math.getExponent(d10);
        if (!d.e(d10)) {
            return h(d10 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (a.f58761a[roundingMode.ordinal()]) {
            case 1:
                h.k(f(d10));
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z10 = !f(d10);
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z10 = exponent < 0;
                zF = f(d10);
                z10 &= !zF;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z10 = exponent >= 0;
                zF = f(d10);
                z10 &= !zF;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dG = d.g(d10);
                if (dG * dG > 2.0d) {
                    z10 = true;
                }
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    @o9.c
    @Deprecated
    public static double i(Iterable<? extends Number> iterable) {
        return j(iterable.iterator());
    }

    @o9.c
    @Deprecated
    public static double j(Iterator<? extends Number> it) {
        w.e(it.hasNext(), "Cannot take mean of 0 values");
        double dA = a(it.next().doubleValue());
        long j10 = 1;
        while (it.hasNext()) {
            j10++;
            dA += (a(it.next().doubleValue()) - dA) / j10;
        }
        return dA;
    }

    @o9.c
    @Deprecated
    public static double k(double... dArr) {
        w.e(dArr.length > 0, "Cannot take mean of 0 values");
        double dA = a(dArr[0]);
        long j10 = 1;
        for (int i10 = 1; i10 < dArr.length; i10++) {
            a(dArr[i10]);
            j10++;
            dA += (dArr[i10] - dA) / j10;
        }
        return dA;
    }

    @Deprecated
    public static double l(int... iArr) {
        w.e(iArr.length > 0, "Cannot take mean of 0 values");
        long j10 = 0;
        for (int i10 : iArr) {
            j10 += (long) i10;
        }
        return j10 / ((double) iArr.length);
    }

    @Deprecated
    public static double m(long... jArr) {
        w.e(jArr.length > 0, "Cannot take mean of 0 values");
        double d10 = jArr[0];
        long j10 = 1;
        for (int i10 = 1; i10 < jArr.length; i10++) {
            j10++;
            d10 += (jArr[i10] - d10) / j10;
        }
        return d10;
    }

    @o9.c
    static double n(double d10, RoundingMode roundingMode) {
        if (!d.d(d10)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f58761a[roundingMode.ordinal()]) {
            case 1:
                h.k(e(d10));
                return d10;
            case 2:
                return (d10 >= 0.0d || e(d10)) ? d10 : ((long) d10) - 1;
            case 3:
                return (d10 <= 0.0d || e(d10)) ? d10 : ((long) d10) + 1;
            case 4:
                return d10;
            case 5:
                if (e(d10)) {
                    return d10;
                }
                return ((long) d10) + ((long) (d10 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d10);
            case 7:
                double dRint = Math.rint(d10);
                return Math.abs(d10 - dRint) == 0.5d ? d10 + Math.copySign(0.5d, d10) : dRint;
            case 8:
                double dRint2 = Math.rint(d10);
                return Math.abs(d10 - dRint2) == 0.5d ? d10 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    @o9.c
    public static BigInteger o(double d10, RoundingMode roundingMode) {
        double dN = n(d10, roundingMode);
        if ((f58756c - dN < 1.0d) && (dN < f58757d)) {
            return BigInteger.valueOf((long) dN);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(d.c(dN)).shiftLeft(Math.getExponent(dN) - 52);
        return dN < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    @o9.c
    public static int p(double d10, RoundingMode roundingMode) {
        double dN = n(d10, roundingMode);
        h.a((dN > -2.147483649E9d) & (dN < 2.147483648E9d), d10, roundingMode);
        return (int) dN;
    }

    @o9.c
    public static long q(double d10, RoundingMode roundingMode) {
        double dN = n(d10, roundingMode);
        h.a((f58756c - dN < 1.0d) & (dN < f58757d), d10, roundingMode);
        return (long) dN;
    }
}

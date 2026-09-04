package com.google.common.math;

import com.google.common.base.w;
import java.math.BigInteger;

/* JADX INFO: compiled from: DoubleUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@e
@o9.c
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f58762a = 4503599627370495L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f58763b = 9218868437227405312L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f58764c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f58765d = 52;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f58766e = 1023;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f58767f = 4503599627370496L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @o9.d
    static final long f58768g = 4607182418800017408L;

    private d() {
    }

    static double a(BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        boolean z10 = true;
        int iBitLength = bigIntegerAbs.bitLength() - 1;
        if (iBitLength < 63) {
            return bigInteger.longValue();
        }
        if (iBitLength > 1023) {
            return ((double) bigInteger.signum()) * Double.POSITIVE_INFINITY;
        }
        int i10 = (iBitLength - 52) - 1;
        long jLongValue = bigIntegerAbs.shiftRight(i10).longValue();
        long j10 = (jLongValue >> 1) & f58762a;
        if ((jLongValue & 1) == 0 || ((j10 & 1) == 0 && bigIntegerAbs.getLowestSetBit() >= i10)) {
            z10 = false;
        }
        if (z10) {
            j10++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1023)) << 52) + j10) | (((long) bigInteger.signum()) & Long.MIN_VALUE));
    }

    static double b(double d10) {
        w.d(!Double.isNaN(d10));
        return Math.max(d10, 0.0d);
    }

    static long c(double d10) {
        w.e(d(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & f58762a;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | f58767f;
    }

    static boolean d(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    static boolean e(double d10) {
        return Math.getExponent(d10) >= -1022;
    }

    static double f(double d10) {
        return -Math.nextUp(-d10);
    }

    static double g(double d10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & f58762a) | f58768g);
    }
}

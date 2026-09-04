package com.google.common.math;

import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: compiled from: MathPreconditions.java */
/* JADX INFO: loaded from: classes7.dex */
@e
@s9.a
@o9.b
public final class h {
    private h() {
    }

    static void a(boolean z10, double d10, RoundingMode roundingMode) {
        if (z10) {
            return;
        }
        String strValueOf = String.valueOf(roundingMode);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 83);
        sb2.append("rounded value is out of range for input ");
        sb2.append(d10);
        sb2.append(" and rounding mode ");
        sb2.append(strValueOf);
        throw new ArithmeticException(sb2.toString());
    }

    static void b(boolean z10, String str, int i10, int i11) {
        if (z10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(")");
        throw new ArithmeticException(sb2.toString());
    }

    static void c(boolean z10, String str, long j10, long j11) {
        if (z10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 54);
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(")");
        throw new ArithmeticException(sb2.toString());
    }

    static double d(String str, double d10) {
        if (d10 >= 0.0d) {
            return d10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(d10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    static int e(String str, int i10) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    static long f(String str, long j10) {
        if (j10 >= 0) {
            return j10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    static BigInteger g(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        String strValueOf = String.valueOf(bigInteger);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + strValueOf.length());
        sb2.append(str);
        sb2.append(" (");
        sb2.append(strValueOf);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    static int h(String str, int i10) {
        if (i10 > 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    static long i(String str, long j10) {
        if (j10 > 0) {
            return j10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 35);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j10);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    static BigInteger j(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        String strValueOf = String.valueOf(bigInteger);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 15 + strValueOf.length());
        sb2.append(str);
        sb2.append(" (");
        sb2.append(strValueOf);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    static void k(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}

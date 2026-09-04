package com.google.common.math;

import com.google.common.base.w;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

/* JADX INFO: compiled from: ToDoubleRounder.java */
/* JADX INFO: loaded from: classes7.dex */
@e
@o9.c
public abstract class m<X extends Number & Comparable<X>> {

    /* JADX INFO: compiled from: ToDoubleRounder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58799a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f58799a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58799a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58799a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58799a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58799a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58799a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58799a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f58799a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    m() {
    }

    abstract X a(X x10, X x11);

    final double b(X x10, RoundingMode roundingMode) {
        Number numberE;
        double dNextUp;
        w.F(x10, "x");
        w.F(roundingMode, "mode");
        double dC = c(x10);
        if (Double.isInfinite(dC)) {
            switch (a.f58799a[roundingMode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return ((double) d(x10)) * Double.MAX_VALUE;
                case 5:
                    return dC == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : Double.NEGATIVE_INFINITY;
                case 6:
                    return dC == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : -1.7976931348623157E308d;
                case 7:
                    return dC;
                case 8:
                    String strValueOf = String.valueOf(x10);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 44);
                    sb2.append(strValueOf);
                    sb2.append(" cannot be represented precisely as a double");
                    throw new ArithmeticException(sb2.toString());
            }
        }
        Number numberE2 = e(dC, RoundingMode.UNNECESSARY);
        int iCompareTo = ((Comparable) x10).compareTo(numberE2);
        int[] iArr = a.f58799a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                if (d(x10) >= 0) {
                    return iCompareTo >= 0 ? dC : d.f(dC);
                }
                return iCompareTo <= 0 ? dC : Math.nextUp(dC);
            case 2:
            case 3:
            case 4:
                if (iCompareTo >= 0) {
                    dNextUp = Math.nextUp(dC);
                    if (dNextUp == Double.POSITIVE_INFINITY) {
                        return dC;
                    }
                    numberE = e(dNextUp, RoundingMode.CEILING);
                } else {
                    double dF = d.f(dC);
                    if (dF == Double.NEGATIVE_INFINITY) {
                        return dC;
                    }
                    Number numberE3 = e(dF, RoundingMode.FLOOR);
                    numberE = numberE2;
                    numberE2 = numberE3;
                    dNextUp = dC;
                    dC = dF;
                }
                int iCompareTo2 = ((Comparable) a(x10, numberE2)).compareTo(a(numberE, x10));
                if (iCompareTo2 < 0) {
                    return dC;
                }
                if (iCompareTo2 > 0) {
                    return dNextUp;
                }
                int i10 = iArr[roundingMode.ordinal()];
                if (i10 == 2) {
                    return (Double.doubleToRawLongBits(dC) & 1) == 0 ? dC : dNextUp;
                }
                if (i10 == 3) {
                    return d(x10) >= 0 ? dC : dNextUp;
                }
                if (i10 == 4) {
                    return d(x10) >= 0 ? dNextUp : dC;
                }
                throw new AssertionError("impossible");
            case 5:
                return iCompareTo >= 0 ? dC : d.f(dC);
            case 6:
                return iCompareTo <= 0 ? dC : Math.nextUp(dC);
            case 7:
                if (d(x10) >= 0) {
                    return iCompareTo <= 0 ? dC : Math.nextUp(dC);
                }
                return iCompareTo >= 0 ? dC : d.f(dC);
            case 8:
                h.k(iCompareTo == 0);
                return dC;
            default:
                throw new AssertionError("impossible");
        }
    }

    abstract double c(X x10);

    abstract int d(X x10);

    abstract X e(double d10, RoundingMode roundingMode);
}

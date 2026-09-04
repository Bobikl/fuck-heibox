package com.google.common.math;

import com.google.common.base.w;
import com.google.common.primitives.Ints;
import com.huawei.hms.framework.common.ExceptionCode;
import com.umeng.analytics.pro.ak;
import java.math.RoundingMode;

/* JADX INFO: compiled from: IntMath.java */
/* JADX INFO: loaded from: classes7.dex */
@e
@o9.b(emulated = true)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @o9.d
    static final int f58769a = 1073741824;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @o9.d
    static final int f58770b = -1257966797;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @o9.d
    static final int f58774f = 46340;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @o9.d
    static final byte[] f58771c = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @o9.d
    static final int[] f58772d = {1, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @o9.d
    static final int[] f58773e = {3, 31, 316, bb.c.d.Pk, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f58775g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @o9.d
    static int[] f58776h = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, bb.c.d.f31202e5, bb.c.b.f30719j6, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: compiled from: IntMath.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58777a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f58777a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58777a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58777a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58777a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58777a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58777a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58777a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f58777a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f() {
    }

    public static int a(int i10, int i11) {
        h.e("n", i10);
        h.e("k", i11);
        int i12 = 0;
        w.m(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        int[] iArr = f58776h;
        if (i11 >= iArr.length || i10 > iArr[i11]) {
            return Integer.MAX_VALUE;
        }
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return i10;
        }
        long j10 = 1;
        while (i12 < i11) {
            long j11 = j10 * ((long) (i10 - i12));
            i12++;
            j10 = j11 / ((long) i12);
        }
        return (int) j10;
    }

    @o9.a
    public static int b(int i10) {
        h.h("x", i10);
        if (i10 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i10 - 1));
        }
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("ceilingPowerOfTwo(");
        sb2.append(i10);
        sb2.append(") not representable as an int");
        throw new ArithmeticException(sb2.toString());
    }

    public static int c(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        int i12 = (int) j10;
        h.b(j10 == ((long) i12), "checkedAdd", i10, i11);
        return i12;
    }

    public static int d(int i10, int i11) {
        long j10 = ((long) i10) * ((long) i11);
        int i12 = (int) j10;
        h.b(j10 == ((long) i12), "checkedMultiply", i10, i11);
        return i12;
    }

    public static int e(int i10, int i11) {
        h.e("exponent", i11);
        if (i10 == -2) {
            h.b(i11 < 32, "checkedPow", i10, i11);
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i10 == -1) {
            return (i11 & 1) == 0 ? 1 : -1;
        }
        if (i10 == 0) {
            return i11 == 0 ? 1 : 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            h.b(i11 < 31, "checkedPow", i10, i11);
            return 1 << i11;
        }
        int iD = 1;
        while (i11 != 0) {
            if (i11 == 1) {
                return d(iD, i10);
            }
            if ((i11 & 1) != 0) {
                iD = d(iD, i10);
            }
            i11 >>= 1;
            if (i11 > 0) {
                h.b((-46340 <= i10) & (i10 <= f58774f), "checkedPow", i10, i11);
                i10 *= i10;
            }
        }
        return iD;
    }

    public static int f(int i10, int i11) {
        long j10 = ((long) i10) - ((long) i11);
        int i12 = (int) j10;
        h.b(j10 == ((long) i12), "checkedSubtract", i10, i11);
        return i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x005a  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public static int g(int i10, int i11, RoundingMode roundingMode) {
        w.E(roundingMode);
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        boolean z10 = true;
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (a.f58777a[roundingMode.ordinal()]) {
            case 1:
                h.k(i13 == 0);
                z10 = false;
                if (z10) {
                    return i12 + i14;
                }
                return i12;
            case 2:
                z10 = false;
                if (z10) {
                    return i12 + i14;
                }
                return i12;
            case 3:
                if (i14 >= 0) {
                    z10 = false;
                }
                if (z10) {
                    return i12 + i14;
                }
                return i12;
            case 4:
                if (z10) {
                    return i12 + i14;
                }
                return i12;
            case 5:
                if (i14 <= 0) {
                    z10 = false;
                }
                if (z10) {
                    return i12 + i14;
                }
                return i12;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i12 & 1) != 0))) {
                            z10 = false;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    z10 = false;
                }
                if (z10) {
                    return i12 + i14;
                }
                return i12;
            default:
                throw new AssertionError();
        }
    }

    public static int h(int i10) {
        h.e("n", i10);
        int[] iArr = f58775g;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return Integer.MAX_VALUE;
    }

    @o9.a
    public static int i(int i10) {
        h.h("x", i10);
        return Integer.highestOneBit(i10);
    }

    public static int j(int i10, int i11) {
        h.e(ak.av, i10);
        h.e("b", i11);
        if (i10 == 0) {
            return i11;
        }
        if (i11 == 0) {
            return i10;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10);
        int iNumberOfTrailingZeros2 = i10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(i11);
        int i12 = i11 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i12) {
            int i13 = iNumberOfTrailingZeros2 - i12;
            int i14 = (i13 >> 31) & i13;
            int i15 = (i13 - i14) - i14;
            i12 += i14;
            iNumberOfTrailingZeros2 = i15 >> Integer.numberOfTrailingZeros(i15);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static boolean k(int i10) {
        return (i10 > 0) & ((i10 & (i10 + (-1))) == 0);
    }

    @o9.a
    @o9.c
    public static boolean l(int i10) {
        return LongMath.m(i10);
    }

    @o9.d
    static int m(int i10, int i11) {
        return (~(~(i10 - i11))) >>> 31;
    }

    @o9.c
    public static int n(int i10, RoundingMode roundingMode) {
        int iM;
        h.h("x", i10);
        int iO = o(i10);
        int i11 = f58772d[iO];
        switch (a.f58777a[roundingMode.ordinal()]) {
            case 1:
                h.k(i10 == i11);
            case 2:
            case 3:
                return iO;
            case 4:
            case 5:
                iM = m(i11, i10);
                return iO + iM;
            case 6:
            case 7:
            case 8:
                iM = m(f58773e[iO], i10);
                return iO + iM;
            default:
                throw new AssertionError();
        }
    }

    private static int o(int i10) {
        byte b10 = f58771c[Integer.numberOfLeadingZeros(i10)];
        return b10 - m(i10, f58772d[b10]);
    }

    public static int p(int i10, RoundingMode roundingMode) {
        h.h("x", i10);
        switch (a.f58777a[roundingMode.ordinal()]) {
            case 1:
                h.k(k(i10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return (31 - iNumberOfLeadingZeros) + m(f58770b >>> iNumberOfLeadingZeros, i10);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static int q(int i10, int i11) {
        return (i10 & i11) + ((i10 ^ i11) >> 1);
    }

    public static int r(int i10, int i11) {
        if (i11 > 0) {
            int i12 = i10 % i11;
            return i12 >= 0 ? i12 : i12 + i11;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Modulus ");
        sb2.append(i11);
        sb2.append(" must be > 0");
        throw new ArithmeticException(sb2.toString());
    }

    @o9.c
    public static int s(int i10, int i11) {
        h.e("exponent", i11);
        if (i10 == -2) {
            if (i11 < 32) {
                return (i11 & 1) == 0 ? 1 << i11 : -(1 << i11);
            }
            return 0;
        }
        if (i10 == -1) {
            return (i11 & 1) == 0 ? 1 : -1;
        }
        if (i10 == 0) {
            return i11 == 0 ? 1 : 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            if (i11 < 32) {
                return 1 << i11;
            }
            return 0;
        }
        int i12 = 1;
        while (i11 != 0) {
            if (i11 == 1) {
                return i10 * i12;
            }
            i12 *= (i11 & 1) == 0 ? 1 : i10;
            i10 *= i10;
            i11 >>= 1;
        }
        return i12;
    }

    @o9.a
    public static int t(int i10, int i11) {
        return Ints.x(((long) i10) + ((long) i11));
    }

    @o9.a
    public static int u(int i10, int i11) {
        return Ints.x(((long) i10) * ((long) i11));
    }

    @o9.a
    public static int v(int i10, int i11) {
        h.e("exponent", i11);
        if (i10 == -2) {
            if (i11 >= 32) {
                return (i11 & 1) + Integer.MAX_VALUE;
            }
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i10 == -1) {
            return (i11 & 1) == 0 ? 1 : -1;
        }
        if (i10 == 0) {
            return i11 == 0 ? 1 : 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            if (i11 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << i11;
        }
        int i12 = ((i10 >>> 31) & i11 & 1) + Integer.MAX_VALUE;
        int iU = 1;
        while (i11 != 0) {
            if (i11 == 1) {
                return u(iU, i10);
            }
            if ((i11 & 1) != 0) {
                iU = u(iU, i10);
            }
            i11 >>= 1;
            if (i11 > 0) {
                if ((-46340 > i10) || (i10 > f58774f)) {
                    return i12;
                }
                i10 *= i10;
            }
        }
        return iU;
    }

    @o9.a
    public static int w(int i10, int i11) {
        return Ints.x(((long) i10) - ((long) i11));
    }

    @o9.c
    public static int x(int i10, RoundingMode roundingMode) {
        int iM;
        h.e("x", i10);
        int iY = y(i10);
        switch (a.f58777a[roundingMode.ordinal()]) {
            case 1:
                h.k(iY * iY == i10);
            case 2:
            case 3:
                return iY;
            case 4:
            case 5:
                iM = m(iY * iY, i10);
                return iY + iM;
            case 6:
            case 7:
            case 8:
                iM = m((iY * iY) + iY, i10);
                return iY + iM;
            default:
                throw new AssertionError();
        }
    }

    private static int y(int i10) {
        return (int) Math.sqrt(i10);
    }
}

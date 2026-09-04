package a2;

/* JADX INFO: compiled from: MathUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private a() {
    }

    public static int a(int i10, int i11) {
        int i12 = i10 + i11;
        if (((i10 ^ i12) & (i11 ^ i12)) >= 0) {
            return i12;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long b(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j10 ^ j12) & (j11 ^ j12)) >= 0) {
            return j12;
        }
        throw new ArithmeticException("long overflow");
    }

    public static double c(double d10, double d11, double d12) {
        if (d10 < d11) {
            return d11;
        }
        return d10 > d12 ? d12 : d10;
    }

    public static float d(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static int e(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static long f(long j10, long j11, long j12) {
        if (j10 < j11) {
            return j11;
        }
        return j10 > j12 ? j12 : j10;
    }

    public static int g(int i10) {
        if (i10 != Integer.MIN_VALUE) {
            return i10 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long h(long j10) {
        if (j10 != Long.MIN_VALUE) {
            return j10 - 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int i(int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return i10 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long j(long j10) {
        if (j10 != Long.MAX_VALUE) {
            return j10 + 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int k(int i10, int i11) {
        long j10 = ((long) i10) * ((long) i11);
        int i12 = (int) j10;
        if (i12 == j10) {
            return i12;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long l(long j10, long j11) {
        long j12 = j10 * j11;
        if (((Math.abs(j10) | Math.abs(j11)) >>> 31) == 0 || ((j11 == 0 || j12 / j11 == j10) && !(j10 == Long.MIN_VALUE && j11 == -1))) {
            return j12;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int m(int i10) {
        if (i10 != Integer.MIN_VALUE) {
            return -i10;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long n(long j10) {
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int o(int i10, int i11) {
        int i12 = i10 - i11;
        if (((i10 ^ i12) & (i11 ^ i10)) >= 0) {
            return i12;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long p(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j10 ^ j12) & (j11 ^ j10)) >= 0) {
            return j12;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int q(long j10) {
        int i10 = (int) j10;
        if (i10 == j10) {
            return i10;
        }
        throw new ArithmeticException("integer overflow");
    }
}

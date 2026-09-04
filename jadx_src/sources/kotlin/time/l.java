package kotlin.time;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {
    private static final long a(long j10, long j11, long j12) {
        if (!e.i0(j11) || (j10 ^ j12) >= 0) {
            return j10;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final boolean b(long j10) {
        return ((j10 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long c(long j10, long j11) {
        long jS = e.S(j11);
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            return a(j10, j11, jS);
        }
        if ((1 | (jS - 1)) == Long.MAX_VALUE) {
            return d(j10, j11);
        }
        long j12 = j10 + jS;
        if (((j10 ^ j12) & (jS ^ j12)) < 0) {
            return j10 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j12;
    }

    private static final long d(long j10, long j11) {
        long jL = e.l(j11, 2);
        return (((e.S(jL) - 1) | 1) > Long.MAX_VALUE ? 1 : (((e.S(jL) - 1) | 1) == Long.MAX_VALUE ? 0 : -1)) == 0 ? (long) (j10 + e.t0(j11, DurationUnit.NANOSECONDS)) : c(c(j10, jL), e.l0(j11, jL));
    }

    public static final long e(long j10, long j11) {
        return ((1 | (j11 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j11 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? e.C0(g.n0(j11, DurationUnit.DAYS)) : f(j10, j11);
    }

    private static final long f(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            e.a aVar = e.f128628c;
            return g.n0(j12, DurationUnit.NANOSECONDS);
        }
        long j13 = 1000000;
        long j14 = (j10 / j13) - (j11 / j13);
        long j15 = (j10 % j13) - (j11 % j13);
        e.a aVar2 = e.f128628c;
        return e.m0(g.n0(j14, DurationUnit.MILLISECONDS), g.n0(j15, DurationUnit.NANOSECONDS));
    }

    public static final long g(long j10, long j11) {
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            return j10 == j11 ? e.f128628c.W() : e.C0(g.n0(j11, DurationUnit.DAYS));
        }
        return (1 | (j10 - 1)) == Long.MAX_VALUE ? g.n0(j10, DurationUnit.DAYS) : f(j10, j11);
    }
}

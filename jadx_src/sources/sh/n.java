package sh;

import kotlin.r0;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n {
    private static final int a(int i10, int i11, int i12) {
        return e(e(i10, i12) - e(i11, i12), i12);
    }

    private static final long b(long j10, long j11, long j12) {
        return f(f(j10, j12) - f(j11, j12), j12);
    }

    @r0
    public static final int c(int i10, int i11, int i12) {
        if (i12 > 0) {
            return i10 >= i11 ? i11 : i11 - a(i11, i10, i12);
        }
        if (i12 < 0) {
            return i10 <= i11 ? i11 : i11 + a(i10, i11, -i12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @r0
    public static final long d(long j10, long j11, long j12) {
        if (j12 > 0) {
            return j10 >= j11 ? j11 : j11 - b(j11, j10, j12);
        }
        if (j12 < 0) {
            return j10 <= j11 ? j11 : j11 + b(j10, j11, -j12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int e(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    private static final long f(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }
}

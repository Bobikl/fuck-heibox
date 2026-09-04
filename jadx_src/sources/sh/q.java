package sh;

import kotlin.e1;
import kotlin.h1;
import kotlin.n1;
import kotlin.r0;
import kotlin.r1;
import kotlin.u0;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {
    private static final int a(int i10, int i11, int i12) {
        int iA = e1.a(i10, i12);
        int iA2 = e1.a(i11, i12);
        int iCompare = Integer.compare(iA ^ Integer.MIN_VALUE, iA2 ^ Integer.MIN_VALUE);
        int iH = n1.h(iA - iA2);
        return iCompare >= 0 ? iH : n1.h(iH + i12);
    }

    private static final long b(long j10, long j11, long j12) {
        long jA = h1.a(j10, j12);
        long jA2 = h1.a(j11, j12);
        int iCompare = Long.compare(jA ^ Long.MIN_VALUE, jA2 ^ Long.MIN_VALUE);
        long jH = r1.h(jA - jA2);
        return iCompare >= 0 ? jH : r1.h(jH + j12);
    }

    @u0(version = "1.3")
    @r0
    public static final long c(long j10, long j11, long j12) {
        if (j12 > 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j11 : r1.h(j11 - b(j11, j10, r1.h(j12)));
        }
        if (j12 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j11 : r1.h(j11 + b(j10, j11, r1.h(-j12)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @u0(version = "1.3")
    @r0
    public static final int d(int i10, int i11, int i12) {
        if (i12 > 0) {
            return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) >= 0 ? i11 : n1.h(i11 - a(i11, i10, n1.h(i12)));
        }
        if (i12 < 0) {
            return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) <= 0 ? i11 : n1.h(i11 + a(i10, i11, n1.h(-i12)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}

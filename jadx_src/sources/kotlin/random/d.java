package kotlin.random;

import fi.l;
import fi.o;
import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    @u0(version = "1.3")
    @dl.d
    public static final Random a(int i10) {
        return new XorWowRandom(i10, i10 >> 31);
    }

    @u0(version = "1.3")
    @dl.d
    public static final Random b(long j10) {
        return new XorWowRandom((int) j10, (int) (j10 >> 32));
    }

    @dl.d
    public static final String c(@dl.d Object from, @dl.d Object until) {
        f0.p(from, "from");
        f0.p(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void d(double d10, double d11) {
        if (!(d11 > d10)) {
            throw new IllegalArgumentException(c(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }

    public static final void e(int i10, int i11) {
        if (!(i11 > i10)) {
            throw new IllegalArgumentException(c(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void f(long j10, long j11) {
        if (!(j11 > j10)) {
            throw new IllegalArgumentException(c(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int g(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    @u0(version = "1.3")
    public static final int h(@dl.d Random random, @dl.d l range) {
        f0.p(random, "<this>");
        f0.p(range, "range");
        if (!range.isEmpty()) {
            if (range.i() < Integer.MAX_VALUE) {
                return random.n(range.h(), range.i() + 1);
            }
            return range.h() > Integer.MIN_VALUE ? random.n(range.h() - 1, range.i()) + 1 : random.l();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @u0(version = "1.3")
    public static final long i(@dl.d Random random, @dl.d o range) {
        f0.p(random, "<this>");
        f0.p(range, "range");
        if (!range.isEmpty()) {
            if (range.i() < Long.MAX_VALUE) {
                return random.q(range.h(), range.i() + 1);
            }
            return range.h() > Long.MIN_VALUE ? random.q(range.h() - 1, range.i()) + 1 : random.o();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int j(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}

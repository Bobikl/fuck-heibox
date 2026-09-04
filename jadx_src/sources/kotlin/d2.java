package kotlin;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: compiled from: UnsignedUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "UnsignedKt")
public final class d2 {
    @r0
    public static final int a(double d10) {
        if (Double.isNaN(d10) || d10 <= f(0)) {
            return 0;
        }
        if (d10 >= f(-1)) {
            return -1;
        }
        return d10 <= 2.147483647E9d ? n1.h((int) d10) : n1.h(n1.h((int) (d10 - ((double) Integer.MAX_VALUE))) + n1.h(Integer.MAX_VALUE));
    }

    @r0
    public static final long b(double d10) {
        if (Double.isNaN(d10) || d10 <= j(0L)) {
            return 0L;
        }
        if (d10 >= j(-1L)) {
            return -1L;
        }
        return d10 < 9.223372036854776E18d ? r1.h((long) d10) : r1.h(r1.h((long) (d10 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @r0
    public static final int c(int i10, int i11) {
        return kotlin.jvm.internal.f0.t(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    @r0
    public static final int d(int i10, int i11) {
        return n1.h((int) ((((long) i10) & KeyboardMap.kValueMask) / (((long) i11) & KeyboardMap.kValueMask)));
    }

    @r0
    public static final int e(int i10, int i11) {
        return n1.h((int) ((((long) i10) & KeyboardMap.kValueMask) % (((long) i11) & KeyboardMap.kValueMask)));
    }

    @r0
    public static final double f(int i10) {
        return ((double) (Integer.MAX_VALUE & i10)) + (((double) ((i10 >>> 31) << 30)) * ((double) 2));
    }

    @r0
    public static final int g(long j10, long j11) {
        return kotlin.jvm.internal.f0.u(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    @r0
    public static final long h(long j10, long j11) {
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? r1.h(0L) : r1.h(1L);
        }
        if (j10 >= 0) {
            return r1.h(j10 / j11);
        }
        long j12 = ((j10 >>> 1) / j11) << 1;
        return r1.h(j12 + ((long) (Long.compare(r1.h(j10 - (j12 * j11)) ^ Long.MIN_VALUE, r1.h(j11) ^ Long.MIN_VALUE) < 0 ? 0 : 1)));
    }

    @r0
    public static final long i(long j10, long j11) {
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j10 : r1.h(j10 - j11);
        }
        if (j10 >= 0) {
            return r1.h(j10 % j11);
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if (Long.compare(r1.h(j12) ^ Long.MIN_VALUE, r1.h(j11) ^ Long.MIN_VALUE) < 0) {
            j11 = 0;
        }
        return r1.h(j12 - j11);
    }

    @r0
    public static final double j(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    @dl.d
    public static final String k(long j10) {
        return l(j10, 10);
    }

    @dl.d
    public static final String l(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, kotlin.text.b.a(i10));
            kotlin.jvm.internal.f0.o(string, "toString(this, checkRadix(radix))");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, kotlin.text.b.a(i10));
        kotlin.jvm.internal.f0.o(string2, "toString(this, checkRadix(radix))");
        sb2.append(string2);
        String string3 = Long.toString(j13, kotlin.text.b.a(i10));
        kotlin.jvm.internal.f0.o(string3, "toString(this, checkRadix(radix))");
        sb2.append(string3);
        return sb2.toString();
    }
}

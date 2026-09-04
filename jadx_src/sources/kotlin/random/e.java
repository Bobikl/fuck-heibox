package kotlin.random;

import fi.a0;
import fi.x;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.k1;
import kotlin.n1;
import kotlin.r1;
import kotlin.s;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: URandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public static final void a(int i10, int i11) {
        if (!(Integer.compare(i11 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) > 0)) {
            throw new IllegalArgumentException(d.c(n1.b(i10), n1.b(i11)).toString());
        }
    }

    public static final void b(long j10, long j11) {
        if (!(Long.compare(j11 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) > 0)) {
            throw new IllegalArgumentException(d.c(r1.b(j10), r1.b(j11)).toString());
        }
    }

    @u0(version = "1.3")
    @dl.d
    @s
    public static final byte[] c(@dl.d Random random, int i10) {
        f0.p(random, "<this>");
        return k1.g(random.d(i10));
    }

    @u0(version = "1.3")
    @dl.d
    @s
    public static final byte[] d(@dl.d Random nextUBytes, @dl.d byte[] array) {
        f0.p(nextUBytes, "$this$nextUBytes");
        f0.p(array, "array");
        nextUBytes.e(array);
        return array;
    }

    @u0(version = "1.3")
    @dl.d
    @s
    public static final byte[] e(@dl.d Random nextUBytes, @dl.d byte[] array, int i10, int i11) {
        f0.p(nextUBytes, "$this$nextUBytes");
        f0.p(array, "array");
        nextUBytes.f(array, i10, i11);
        return array;
    }

    public static /* synthetic */ byte[] f(Random random, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = k1.v(bArr);
        }
        return e(random, bArr, i10, i11);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final int g(@dl.d Random random) {
        f0.p(random, "<this>");
        return n1.h(random.l());
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final int h(@dl.d Random random, @dl.d x range) {
        f0.p(random, "<this>");
        f0.p(range, "range");
        if (!range.isEmpty()) {
            if (Integer.compare(range.i() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE) < 0) {
                return i(random, range.h(), n1.h(range.i() + 1));
            }
            return Integer.compare(range.h() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0 ? n1.h(i(random, n1.h(range.h() - 1), range.i()) + 1) : g(random);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final int i(@dl.d Random nextUInt, int i10, int i11) {
        f0.p(nextUInt, "$this$nextUInt");
        a(i10, i11);
        return n1.h(nextUInt.n(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final int j(@dl.d Random nextUInt, int i10) {
        f0.p(nextUInt, "$this$nextUInt");
        return i(nextUInt, 0, i10);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final long k(@dl.d Random random) {
        f0.p(random, "<this>");
        return r1.h(random.o());
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final long l(@dl.d Random random, @dl.d a0 range) {
        f0.p(random, "<this>");
        f0.p(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compare(range.i() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE) < 0) {
            return n(random, range.h(), r1.h(range.i() + r1.h(((long) 1) & KeyboardMap.kValueMask)));
        }
        if (Long.compare(range.h() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
            return k(random);
        }
        long jH = range.h();
        long j10 = ((long) 1) & KeyboardMap.kValueMask;
        return r1.h(n(random, r1.h(jH - r1.h(j10)), range.i()) + r1.h(j10));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final long m(@dl.d Random nextULong, long j10) {
        f0.p(nextULong, "$this$nextULong");
        return n(nextULong, 0L, j10);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final long n(@dl.d Random nextULong, long j10, long j11) {
        f0.p(nextULong, "$this$nextULong");
        b(j10, j11);
        return r1.h(nextULong.q(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}

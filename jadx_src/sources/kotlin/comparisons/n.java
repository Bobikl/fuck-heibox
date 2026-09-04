package kotlin.comparisons;

import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.k1;
import kotlin.o1;
import kotlin.s;
import kotlin.s1;
import kotlin.u0;
import kotlin.x1;
import kotlin.y1;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: _UComparisons.kt */
/* JADX INFO: loaded from: classes5.dex */
public class n {
    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final short a(short s10, short s11) {
        return f0.t(s10 & x1.f128661e, 65535 & s11) >= 0 ? s10 : s11;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final int b(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) >= 0 ? i10 : i11;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final byte c(byte b10, byte b11) {
        return f0.t(b10 & 255, b11 & 255) >= 0 ? b10 : b11;
    }

    @u0(version = "1.4")
    @s
    public static final int d(int i10, @dl.d int... other) {
        f0.p(other, "other");
        int iV = o1.v(other);
        for (int i11 = 0; i11 < iV; i11++) {
            i10 = b(i10, o1.s(other, i11));
        }
        return i10;
    }

    @u0(version = "1.4")
    @s
    public static final long e(long j10, @dl.d long... other) {
        f0.p(other, "other");
        int iV = s1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            j10 = j(j10, s1.s(other, i10));
        }
        return j10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    @sh.f
    private static final short f(short s10, short s11, short s12) {
        return a(s10, a(s11, s12));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    @sh.f
    private static final int g(int i10, int i11, int i12) {
        return b(i10, b(i11, i12));
    }

    @u0(version = "1.4")
    @s
    public static final byte h(byte b10, @dl.d byte... other) {
        f0.p(other, "other");
        int iV = k1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            b10 = c(b10, k1.s(other, i10));
        }
        return b10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    @sh.f
    private static final byte i(byte b10, byte b11, byte b12) {
        return c(b10, c(b11, b12));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final long j(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j10 : j11;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    @sh.f
    private static final long k(long j10, long j11, long j12) {
        return j(j10, j(j11, j12));
    }

    @u0(version = "1.4")
    @s
    public static final short l(short s10, @dl.d short... other) {
        f0.p(other, "other");
        int iV = y1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            s10 = a(s10, y1.s(other, i10));
        }
        return s10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final short m(short s10, short s11) {
        return f0.t(s10 & x1.f128661e, 65535 & s11) <= 0 ? s10 : s11;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final int n(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) <= 0 ? i10 : i11;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final byte o(byte b10, byte b11) {
        return f0.t(b10 & 255, b11 & 255) <= 0 ? b10 : b11;
    }

    @u0(version = "1.4")
    @s
    public static final int p(int i10, @dl.d int... other) {
        f0.p(other, "other");
        int iV = o1.v(other);
        for (int i11 = 0; i11 < iV; i11++) {
            i10 = n(i10, o1.s(other, i11));
        }
        return i10;
    }

    @u0(version = "1.4")
    @s
    public static final long q(long j10, @dl.d long... other) {
        f0.p(other, "other");
        int iV = s1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            j10 = v(j10, s1.s(other, i10));
        }
        return j10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    @sh.f
    private static final short r(short s10, short s11, short s12) {
        return m(s10, m(s11, s12));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    @sh.f
    private static final int s(int i10, int i11, int i12) {
        return n(i10, n(i11, i12));
    }

    @u0(version = "1.4")
    @s
    public static final byte t(byte b10, @dl.d byte... other) {
        f0.p(other, "other");
        int iV = k1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            b10 = o(b10, k1.s(other, i10));
        }
        return b10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    @sh.f
    private static final byte u(byte b10, byte b11, byte b12) {
        return o(b10, o(b11, b12));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    public static final long v(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j10 : j11;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {s.class})
    @sh.f
    private static final long w(long j10, long j11, long j12) {
        return v(j10, v(j11, j12));
    }

    @u0(version = "1.4")
    @s
    public static final short x(short s10, @dl.d short... other) {
        f0.p(other, "other");
        int iV = y1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            s10 = m(s10, y1.s(other, i10));
        }
        return s10;
    }
}

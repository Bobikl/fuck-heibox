package kotlin;

/* JADX INFO: compiled from: UNumbers.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "UNumbersKt")
public final class w1 {
    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int A(int i10) {
        return n1.h(Integer.lowestOneBit(i10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final short B(short s10) {
        return x1.h((short) Integer.lowestOneBit(s10 & x1.f128661e));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int a(byte b10) {
        return Integer.numberOfLeadingZeros(b10 & 255) - 24;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int b(long j10) {
        return Long.numberOfLeadingZeros(j10);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int c(int i10) {
        return Integer.numberOfLeadingZeros(i10);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int d(short s10) {
        return Integer.numberOfLeadingZeros(s10 & x1.f128661e) - 16;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int e(byte b10) {
        return Integer.bitCount(n1.h(b10 & 255));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int f(long j10) {
        return Long.bitCount(j10);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int g(int i10) {
        return Integer.bitCount(i10);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int h(short s10) {
        return Integer.bitCount(n1.h(s10 & x1.f128661e));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int i(byte b10) {
        return Integer.numberOfTrailingZeros(b10 | 256);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int j(long j10) {
        return Long.numberOfTrailingZeros(j10);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int k(int i10) {
        return Integer.numberOfTrailingZeros(i10);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int l(short s10) {
        return Integer.numberOfTrailingZeros(s10 | 65536);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class, s.class})
    @sh.f
    private static final long m(long j10, int i10) {
        return r1.h(Long.rotateLeft(j10, i10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class, s.class})
    @sh.f
    private static final byte n(byte b10, int i10) {
        return j1.h(i0.Z0(b10, i10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class, s.class})
    @sh.f
    private static final int o(int i10, int i11) {
        return n1.h(Integer.rotateLeft(i10, i11));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class, s.class})
    @sh.f
    private static final short p(short s10, int i10) {
        return x1.h(i0.a1(s10, i10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class, s.class})
    @sh.f
    private static final long q(long j10, int i10) {
        return r1.h(Long.rotateRight(j10, i10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class, s.class})
    @sh.f
    private static final byte r(byte b10, int i10) {
        return j1.h(i0.b1(b10, i10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class, s.class})
    @sh.f
    private static final int s(int i10, int i11) {
        return n1.h(Integer.rotateRight(i10, i11));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class, s.class})
    @sh.f
    private static final short t(short s10, int i10) {
        return x1.h(i0.c1(s10, i10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final byte u(byte b10) {
        return j1.h((byte) Integer.highestOneBit(b10 & 255));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final long v(long j10) {
        return r1.h(Long.highestOneBit(j10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final int w(int i10) {
        return n1.h(Integer.highestOneBit(i10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final short x(short s10) {
        return x1.h((short) Integer.highestOneBit(s10 & x1.f128661e));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final byte y(byte b10) {
        return j1.h((byte) Integer.lowestOneBit(b10 & 255));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {s.class, q.class})
    @sh.f
    private static final long z(long j10) {
        return r1.h(Long.lowestOneBit(j10));
    }
}

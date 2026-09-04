package kotlin;

/* JADX INFO: compiled from: FloorDivMod.kt */
/* JADX INFO: loaded from: classes5.dex */
public class g0 extends f0 {
    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int J(byte b10, byte b11) {
        int i10 = b10 / b11;
        return ((b10 ^ b11) >= 0 || b11 * i10 == b10) ? i10 : i10 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int K(byte b10, int i10) {
        int i11 = b10 / i10;
        return ((b10 ^ i10) >= 0 || i10 * i11 == b10) ? i11 : i11 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int L(byte b10, short s10) {
        int i10 = b10 / s10;
        return ((b10 ^ s10) >= 0 || s10 * i10 == b10) ? i10 : i10 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int M(int i10, byte b10) {
        int i11 = i10 / b10;
        return ((i10 ^ b10) >= 0 || b10 * i11 == i10) ? i11 : i11 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int N(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int O(int i10, short s10) {
        int i11 = i10 / s10;
        return ((i10 ^ s10) >= 0 || s10 * i11 == i10) ? i11 : i11 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int P(short s10, byte b10) {
        int i10 = s10 / b10;
        return ((s10 ^ b10) >= 0 || b10 * i10 == s10) ? i10 : i10 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int Q(short s10, int i10) {
        int i11 = s10 / i10;
        return ((s10 ^ i10) >= 0 || i10 * i11 == s10) ? i11 : i11 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int R(short s10, short s11) {
        int i10 = s10 / s11;
        return ((s10 ^ s11) >= 0 || s11 * i10 == s10) ? i10 : i10 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long S(byte b10, long j10) {
        long j11 = b10;
        long j12 = j11 / j10;
        return ((j11 ^ j10) >= 0 || j10 * j12 == j11) ? j12 : j12 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long T(int i10, long j10) {
        long j11 = i10;
        long j12 = j11 / j10;
        return ((j11 ^ j10) >= 0 || j10 * j12 == j11) ? j12 : j12 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long U(long j10, byte b10) {
        long j11 = b10;
        long j12 = j10 / j11;
        return ((j10 ^ j11) >= 0 || j11 * j12 == j10) ? j12 : j12 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long V(long j10, int i10) {
        long j11 = i10;
        long j12 = j10 / j11;
        return ((j10 ^ j11) >= 0 || j11 * j12 == j10) ? j12 : j12 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long W(long j10, long j11) {
        long j12 = j10 / j11;
        return ((j10 ^ j11) >= 0 || j11 * j12 == j10) ? j12 : j12 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long X(long j10, short s10) {
        long j11 = s10;
        long j12 = j10 / j11;
        return ((j10 ^ j11) >= 0 || j11 * j12 == j10) ? j12 : j12 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long Y(short s10, long j10) {
        long j11 = s10;
        long j12 = j11 / j10;
        return ((j11 ^ j10) >= 0 || j10 * j12 == j11) ? j12 : j12 - 1;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final byte Z(byte b10, byte b11) {
        int i10 = b10 % b11;
        return (byte) (i10 + (b11 & (((i10 ^ b11) & ((-i10) | i10)) >> 31)));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final byte a0(int i10, byte b10) {
        int i11 = i10 % b10;
        return (byte) (i11 + (b10 & (((i11 ^ b10) & ((-i11) | i11)) >> 31)));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final byte b0(long j10, byte b10) {
        long j11 = b10;
        long j12 = j10 % j11;
        return (byte) (j12 + (j11 & (((j12 ^ j11) & ((-j12) | j12)) >> 63)));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final byte c0(short s10, byte b10) {
        int i10 = s10 % b10;
        return (byte) (i10 + (b10 & (((i10 ^ b10) & ((-i10) | i10)) >> 31)));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final double d0(double d10, double d11) {
        double d12 = d10 % d11;
        if (d12 == 0.0d) {
            return d12;
        }
        return !(Math.signum(d12) == Math.signum(d11)) ? d12 + d11 : d12;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final double e0(double d10, float f10) {
        double d11 = f10;
        double d12 = d10 % d11;
        if (d12 == 0.0d) {
            return d12;
        }
        return !(Math.signum(d12) == Math.signum(d11)) ? d12 + d11 : d12;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final double f0(float f10, double d10) {
        double d11 = ((double) f10) % d10;
        if (d11 == 0.0d) {
            return d11;
        }
        return !(Math.signum(d11) == Math.signum(d10)) ? d11 + d10 : d11;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final float g0(float f10, float f11) {
        float f12 = f10 % f11;
        if (f12 == 0.0f) {
            return f12;
        }
        return !(Math.signum(f12) == Math.signum(f11)) ? f12 + f11 : f12;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int h0(byte b10, int i10) {
        int i11 = b10 % i10;
        return i11 + (i10 & (((i11 ^ i10) & ((-i11) | i11)) >> 31));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int i0(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 + (i11 & (((i12 ^ i11) & ((-i12) | i12)) >> 31));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int j0(long j10, int i10) {
        long j11 = i10;
        long j12 = j10 % j11;
        return (int) (j12 + (j11 & (((j12 ^ j11) & ((-j12) | j12)) >> 63)));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final int k0(short s10, int i10) {
        int i11 = s10 % i10;
        return i11 + (i10 & (((i11 ^ i10) & ((-i11) | i11)) >> 31));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long l0(byte b10, long j10) {
        long j11 = ((long) b10) % j10;
        return j11 + (j10 & (((j11 ^ j10) & ((-j11) | j11)) >> 63));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long m0(int i10, long j10) {
        long j11 = ((long) i10) % j10;
        return j11 + (j10 & (((j11 ^ j10) & ((-j11) | j11)) >> 63));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long n0(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 + (j11 & (((j12 ^ j11) & ((-j12) | j12)) >> 63));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final long o0(short s10, long j10) {
        long j11 = ((long) s10) % j10;
        return j11 + (j10 & (((j11 ^ j10) & ((-j11) | j11)) >> 63));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final short p0(byte b10, short s10) {
        int i10 = b10 % s10;
        return (short) (i10 + (s10 & (((i10 ^ s10) & ((-i10) | i10)) >> 31)));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final short q0(int i10, short s10) {
        int i11 = i10 % s10;
        return (short) (i11 + (s10 & (((i11 ^ s10) & ((-i11) | i11)) >> 31)));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final short r0(long j10, short s10) {
        long j11 = s10;
        long j12 = j10 % j11;
        return (short) (j12 + (j11 & (((j12 ^ j11) & ((-j12) | j12)) >> 63)));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.g
    @sh.f
    private static final short s0(short s10, short s11) {
        int i10 = s10 % s11;
        return (short) (i10 + (s11 & (((i10 ^ s11) & ((-i10) | i10)) >> 31)));
    }
}

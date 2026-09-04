package kotlin.comparisons;

import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h extends g {
    @u0(version = "1.1")
    @sh.f
    private static final byte I(byte b10, byte b11) {
        return (byte) Math.max((int) b10, (int) b11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final byte J(byte b10, byte b11, byte b12) {
        return (byte) Math.max((int) b10, Math.max((int) b11, (int) b12));
    }

    @u0(version = "1.4")
    public static final byte K(byte b10, @dl.d byte... other) {
        f0.p(other, "other");
        for (byte b11 : other) {
            b10 = (byte) Math.max((int) b10, (int) b11);
        }
        return b10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final double L(double d10, double d11) {
        return Math.max(d10, d11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final double M(double d10, double d11, double d12) {
        return Math.max(d10, Math.max(d11, d12));
    }

    @u0(version = "1.4")
    public static final double N(double d10, @dl.d double... other) {
        f0.p(other, "other");
        for (double d11 : other) {
            d10 = Math.max(d10, d11);
        }
        return d10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final float O(float f10, float f11) {
        return Math.max(f10, f11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final float P(float f10, float f11, float f12) {
        return Math.max(f10, Math.max(f11, f12));
    }

    @u0(version = "1.4")
    public static final float Q(float f10, @dl.d float... other) {
        f0.p(other, "other");
        for (float f11 : other) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final int R(int i10, int i11) {
        return Math.max(i10, i11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final int S(int i10, int i11, int i12) {
        return Math.max(i10, Math.max(i11, i12));
    }

    @u0(version = "1.4")
    public static final int T(int i10, @dl.d int... other) {
        f0.p(other, "other");
        for (int i11 : other) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final long U(long j10, long j11) {
        return Math.max(j10, j11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final long V(long j10, long j11, long j12) {
        return Math.max(j10, Math.max(j11, j12));
    }

    @u0(version = "1.4")
    public static final long W(long j10, @dl.d long... other) {
        f0.p(other, "other");
        for (long j11 : other) {
            j10 = Math.max(j10, j11);
        }
        return j10;
    }

    @u0(version = "1.1")
    @dl.d
    public static final <T extends Comparable<? super T>> T X(@dl.d T a10, @dl.d T b10) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        return a10.compareTo(b10) >= 0 ? a10 : b10;
    }

    @u0(version = "1.1")
    @dl.d
    public static final <T extends Comparable<? super T>> T Y(@dl.d T a10, @dl.d T b10, @dl.d T c10) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        f0.p(c10, "c");
        return (T) X(a10, X(b10, c10));
    }

    @u0(version = "1.4")
    @dl.d
    public static final <T extends Comparable<? super T>> T Z(@dl.d T a10, @dl.d T... other) {
        f0.p(a10, "a");
        f0.p(other, "other");
        for (T t10 : other) {
            a10 = (T) X(a10, t10);
        }
        return a10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final short a0(short s10, short s11) {
        return (short) Math.max((int) s10, (int) s11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final short b0(short s10, short s11, short s12) {
        return (short) Math.max((int) s10, Math.max((int) s11, (int) s12));
    }

    @u0(version = "1.4")
    public static final short c0(short s10, @dl.d short... other) {
        f0.p(other, "other");
        for (short s11 : other) {
            s10 = (short) Math.max((int) s10, (int) s11);
        }
        return s10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final byte d0(byte b10, byte b11) {
        return (byte) Math.min((int) b10, (int) b11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final byte e0(byte b10, byte b11, byte b12) {
        return (byte) Math.min((int) b10, Math.min((int) b11, (int) b12));
    }

    @u0(version = "1.4")
    public static final byte f0(byte b10, @dl.d byte... other) {
        f0.p(other, "other");
        for (byte b11 : other) {
            b10 = (byte) Math.min((int) b10, (int) b11);
        }
        return b10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final double g0(double d10, double d11) {
        return Math.min(d10, d11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final double h0(double d10, double d11, double d12) {
        return Math.min(d10, Math.min(d11, d12));
    }

    @u0(version = "1.4")
    public static final double i0(double d10, @dl.d double... other) {
        f0.p(other, "other");
        for (double d11 : other) {
            d10 = Math.min(d10, d11);
        }
        return d10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final float j0(float f10, float f11) {
        return Math.min(f10, f11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final float k0(float f10, float f11, float f12) {
        return Math.min(f10, Math.min(f11, f12));
    }

    @u0(version = "1.4")
    public static final float l0(float f10, @dl.d float... other) {
        f0.p(other, "other");
        for (float f11 : other) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final int m0(int i10, int i11) {
        return Math.min(i10, i11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final int n0(int i10, int i11, int i12) {
        return Math.min(i10, Math.min(i11, i12));
    }

    @u0(version = "1.4")
    public static final int o0(int i10, @dl.d int... other) {
        f0.p(other, "other");
        for (int i11 : other) {
            i10 = Math.min(i10, i11);
        }
        return i10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final long p0(long j10, long j11) {
        return Math.min(j10, j11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final long q0(long j10, long j11, long j12) {
        return Math.min(j10, Math.min(j11, j12));
    }

    @u0(version = "1.4")
    public static final long r0(long j10, @dl.d long... other) {
        f0.p(other, "other");
        for (long j11 : other) {
            j10 = Math.min(j10, j11);
        }
        return j10;
    }

    @u0(version = "1.1")
    @dl.d
    public static final <T extends Comparable<? super T>> T s0(@dl.d T a10, @dl.d T b10) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        return a10.compareTo(b10) <= 0 ? a10 : b10;
    }

    @u0(version = "1.1")
    @dl.d
    public static final <T extends Comparable<? super T>> T t0(@dl.d T a10, @dl.d T b10, @dl.d T c10) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        f0.p(c10, "c");
        return (T) s0(a10, s0(b10, c10));
    }

    @u0(version = "1.4")
    @dl.d
    public static final <T extends Comparable<? super T>> T u0(@dl.d T a10, @dl.d T... other) {
        f0.p(a10, "a");
        f0.p(other, "other");
        for (T t10 : other) {
            a10 = (T) s0(a10, t10);
        }
        return a10;
    }

    @u0(version = "1.1")
    @sh.f
    private static final short v0(short s10, short s11) {
        return (short) Math.min((int) s10, (int) s11);
    }

    @u0(version = "1.1")
    @sh.f
    private static final short w0(short s10, short s11, short s12) {
        return (short) Math.min((int) s10, Math.min((int) s11, (int) s12));
    }

    @u0(version = "1.4")
    public static final short x0(short s10, @dl.d short... other) {
        f0.p(other, "other");
        for (short s11 : other) {
            s10 = (short) Math.min((int) s10, (int) s11);
        }
        return s10;
    }
}

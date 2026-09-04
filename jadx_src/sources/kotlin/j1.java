package kotlin;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = org.apache.tools.ant.util.s0.f136928s)
@e2(markerClass = {s.class})
@xh.f
public final class j1 implements Comparable<j1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f124867c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte f124868d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte f124869e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f124870f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f124871g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f124872b;

    /* JADX INFO: compiled from: UByte.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    @r0
    @sh.g
    private /* synthetic */ j1(byte b10) {
        this.f124872b = b10;
    }

    @sh.f
    private static final long A(byte b10, long j10) {
        return r1.h(r1.h(((long) b10) & 255) - j10);
    }

    @sh.f
    private static final int C(byte b10, int i10) {
        return n1.h(n1.h(b10 & 255) - i10);
    }

    @sh.f
    private static final int I(byte b10, short s10) {
        return n1.h(n1.h(b10 & 255) - n1.h(s10 & x1.f128661e));
    }

    @sh.f
    private static final byte J(byte b10, byte b11) {
        return h((byte) e1.a(n1.h(b10 & 255), n1.h(b11 & 255)));
    }

    @sh.f
    private static final long K(byte b10, long j10) {
        return h1.a(r1.h(((long) b10) & 255), j10);
    }

    @sh.f
    private static final int L(byte b10, int i10) {
        return e1.a(n1.h(b10 & 255), i10);
    }

    @sh.f
    private static final short M(byte b10, short s10) {
        return x1.h((short) e1.a(n1.h(b10 & 255), n1.h(s10 & x1.f128661e)));
    }

    @sh.f
    private static final byte N(byte b10, byte b11) {
        return h((byte) (b10 | b11));
    }

    @sh.f
    private static final int O(byte b10, byte b11) {
        return n1.h(n1.h(b10 & 255) + n1.h(b11 & 255));
    }

    @sh.f
    private static final long P(byte b10, long j10) {
        return r1.h(r1.h(((long) b10) & 255) + j10);
    }

    @sh.f
    private static final int Q(byte b10, int i10) {
        return n1.h(n1.h(b10 & 255) + i10);
    }

    @sh.f
    private static final int R(byte b10, short s10) {
        return n1.h(n1.h(b10 & 255) + n1.h(s10 & x1.f128661e));
    }

    @sh.f
    private static final fi.x S(byte b10, byte b11) {
        return new fi.x(n1.h(b10 & 255), n1.h(b11 & 255), null);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136932w)
    @q
    @sh.f
    private static final fi.x U(byte b10, byte b11) {
        return fi.c0.V(n1.h(b10 & 255), n1.h(b11 & 255));
    }

    @sh.f
    private static final int V(byte b10, byte b11) {
        return e1.a(n1.h(b10 & 255), n1.h(b11 & 255));
    }

    @sh.f
    private static final long W(byte b10, long j10) {
        return h1.a(r1.h(((long) b10) & 255), j10);
    }

    @sh.f
    private static final int X(byte b10, int i10) {
        return e1.a(n1.h(b10 & 255), i10);
    }

    @sh.f
    private static final int Y(byte b10, short s10) {
        return e1.a(n1.h(b10 & 255), n1.h(s10 & x1.f128661e));
    }

    @sh.f
    private static final int Z(byte b10, byte b11) {
        return n1.h(n1.h(b10 & 255) * n1.h(b11 & 255));
    }

    @sh.f
    private static final byte a(byte b10, byte b11) {
        return h((byte) (b10 & b11));
    }

    @sh.f
    private static final long a0(byte b10, long j10) {
        return r1.h(r1.h(((long) b10) & 255) * j10);
    }

    public static final /* synthetic */ j1 b(byte b10) {
        return new j1(b10);
    }

    @sh.f
    private static final int b0(byte b10, int i10) {
        return n1.h(n1.h(b10 & 255) * i10);
    }

    @sh.f
    private int c(byte b10) {
        return kotlin.jvm.internal.f0.t(o0() & 255, b10 & 255);
    }

    @sh.f
    private static final int c0(byte b10, short s10) {
        return n1.h(n1.h(b10 & 255) * n1.h(s10 & x1.f128661e));
    }

    @sh.f
    private static int d(byte b10, byte b11) {
        return kotlin.jvm.internal.f0.t(b10 & 255, b11 & 255);
    }

    @sh.f
    private static final byte d0(byte b10) {
        return b10;
    }

    @sh.f
    private static final int e(byte b10, long j10) {
        return Long.compare(r1.h(((long) b10) & 255) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @sh.f
    private static final double e0(byte b10) {
        return b10 & 255;
    }

    @sh.f
    private static final int f(byte b10, int i10) {
        return Integer.compare(n1.h(b10 & 255) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @sh.f
    private static final float f0(byte b10) {
        return b10 & 255;
    }

    @sh.f
    private static final int g(byte b10, short s10) {
        return kotlin.jvm.internal.f0.t(b10 & 255, s10 & x1.f128661e);
    }

    @sh.f
    private static final int g0(byte b10) {
        return b10 & 255;
    }

    @r0
    @sh.g
    public static byte h(byte b10) {
        return b10;
    }

    @sh.f
    private static final long h0(byte b10) {
        return ((long) b10) & 255;
    }

    @sh.f
    private static final byte i(byte b10) {
        return h((byte) (b10 - 1));
    }

    @sh.f
    private static final short i0(byte b10) {
        return (short) (b10 & 255);
    }

    @sh.f
    private static final int j(byte b10, byte b11) {
        return f1.a(n1.h(b10 & 255), n1.h(b11 & 255));
    }

    @dl.d
    public static String j0(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @sh.f
    private static final long k(byte b10, long j10) {
        return i1.a(r1.h(((long) b10) & 255), j10);
    }

    @sh.f
    private static final byte k0(byte b10) {
        return b10;
    }

    @sh.f
    private static final int l(byte b10, int i10) {
        return f1.a(n1.h(b10 & 255), i10);
    }

    @sh.f
    private static final int l0(byte b10) {
        return n1.h(b10 & 255);
    }

    @sh.f
    private static final int m(byte b10, short s10) {
        return f1.a(n1.h(b10 & 255), n1.h(s10 & x1.f128661e));
    }

    @sh.f
    private static final long m0(byte b10) {
        return r1.h(((long) b10) & 255);
    }

    public static boolean n(byte b10, Object obj) {
        return (obj instanceof j1) && b10 == ((j1) obj).o0();
    }

    @sh.f
    private static final short n0(byte b10) {
        return x1.h((short) (b10 & 255));
    }

    public static final boolean o(byte b10, byte b11) {
        return b10 == b11;
    }

    @sh.f
    private static final int p(byte b10, byte b11) {
        return f1.a(n1.h(b10 & 255), n1.h(b11 & 255));
    }

    @sh.f
    private static final byte p0(byte b10, byte b11) {
        return h((byte) (b10 ^ b11));
    }

    @sh.f
    private static final long q(byte b10, long j10) {
        return i1.a(r1.h(((long) b10) & 255), j10);
    }

    @sh.f
    private static final int r(byte b10, int i10) {
        return f1.a(n1.h(b10 & 255), i10);
    }

    @sh.f
    private static final int s(byte b10, short s10) {
        return f1.a(n1.h(b10 & 255), n1.h(s10 & x1.f128661e));
    }

    @r0
    public static /* synthetic */ void t() {
    }

    public static int w(byte b10) {
        return b10;
    }

    @sh.f
    private static final byte x(byte b10) {
        return h((byte) (b10 + 1));
    }

    @sh.f
    private static final byte y(byte b10) {
        return h((byte) (~b10));
    }

    @sh.f
    private static final int z(byte b10, byte b11) {
        return n1.h(n1.h(b10 & 255) - n1.h(b11 & 255));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(j1 j1Var) {
        return kotlin.jvm.internal.f0.t(o0() & 255, j1Var.o0() & 255);
    }

    public boolean equals(Object obj) {
        return n(this.f124872b, obj);
    }

    public int hashCode() {
        return w(this.f124872b);
    }

    public final /* synthetic */ byte o0() {
        return this.f124872b;
    }

    @dl.d
    public String toString() {
        return j0(this.f124872b);
    }
}

package kotlin;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = org.apache.tools.ant.util.s0.f136928s)
@e2(markerClass = {s.class})
@xh.f
public final class x1 implements Comparable<x1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f128659c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final short f128660d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final short f128661e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f128662f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f128663g = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f128664b;

    /* JADX INFO: compiled from: UShort.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    @r0
    @sh.g
    private /* synthetic */ x1(short s10) {
        this.f128664b = s10;
    }

    @sh.f
    private static final long A(short s10, long j10) {
        return r1.h(r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j10);
    }

    @sh.f
    private static final int C(short s10, int i10) {
        return n1.h(n1.h(s10 & f128661e) - i10);
    }

    @sh.f
    private static final int I(short s10, short s11) {
        return n1.h(n1.h(s10 & f128661e) - n1.h(s11 & f128661e));
    }

    @sh.f
    private static final byte J(short s10, byte b10) {
        return j1.h((byte) e1.a(n1.h(s10 & f128661e), n1.h(b10 & 255)));
    }

    @sh.f
    private static final long K(short s10, long j10) {
        return h1.a(r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j10);
    }

    @sh.f
    private static final int L(short s10, int i10) {
        return e1.a(n1.h(s10 & f128661e), i10);
    }

    @sh.f
    private static final short M(short s10, short s11) {
        return h((short) e1.a(n1.h(s10 & f128661e), n1.h(s11 & f128661e)));
    }

    @sh.f
    private static final short N(short s10, short s11) {
        return h((short) (s10 | s11));
    }

    @sh.f
    private static final int O(short s10, byte b10) {
        return n1.h(n1.h(s10 & f128661e) + n1.h(b10 & 255));
    }

    @sh.f
    private static final long P(short s10, long j10) {
        return r1.h(r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j10);
    }

    @sh.f
    private static final int Q(short s10, int i10) {
        return n1.h(n1.h(s10 & f128661e) + i10);
    }

    @sh.f
    private static final int R(short s10, short s11) {
        return n1.h(n1.h(s10 & f128661e) + n1.h(s11 & f128661e));
    }

    @sh.f
    private static final fi.x S(short s10, short s11) {
        return new fi.x(n1.h(s10 & f128661e), n1.h(s11 & f128661e), null);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136932w)
    @q
    @sh.f
    private static final fi.x U(short s10, short s11) {
        return fi.c0.V(n1.h(s10 & f128661e), n1.h(s11 & f128661e));
    }

    @sh.f
    private static final int V(short s10, byte b10) {
        return e1.a(n1.h(s10 & f128661e), n1.h(b10 & 255));
    }

    @sh.f
    private static final long W(short s10, long j10) {
        return h1.a(r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j10);
    }

    @sh.f
    private static final int X(short s10, int i10) {
        return e1.a(n1.h(s10 & f128661e), i10);
    }

    @sh.f
    private static final int Y(short s10, short s11) {
        return e1.a(n1.h(s10 & f128661e), n1.h(s11 & f128661e));
    }

    @sh.f
    private static final int Z(short s10, byte b10) {
        return n1.h(n1.h(s10 & f128661e) * n1.h(b10 & 255));
    }

    @sh.f
    private static final short a(short s10, short s11) {
        return h((short) (s10 & s11));
    }

    @sh.f
    private static final long a0(short s10, long j10) {
        return r1.h(r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j10);
    }

    public static final /* synthetic */ x1 b(short s10) {
        return new x1(s10);
    }

    @sh.f
    private static final int b0(short s10, int i10) {
        return n1.h(n1.h(s10 & f128661e) * i10);
    }

    @sh.f
    private static final int c(short s10, byte b10) {
        return kotlin.jvm.internal.f0.t(s10 & f128661e, b10 & 255);
    }

    @sh.f
    private static final int c0(short s10, short s11) {
        return n1.h(n1.h(s10 & f128661e) * n1.h(s11 & f128661e));
    }

    @sh.f
    private static final int d(short s10, long j10) {
        return Long.compare(r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @sh.f
    private static final byte d0(short s10) {
        return (byte) s10;
    }

    @sh.f
    private static final int e(short s10, int i10) {
        return Integer.compare(n1.h(s10 & f128661e) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @sh.f
    private static final double e0(short s10) {
        return s10 & f128661e;
    }

    @sh.f
    private int f(short s10) {
        return kotlin.jvm.internal.f0.t(o0() & f128661e, s10 & f128661e);
    }

    @sh.f
    private static final float f0(short s10) {
        return s10 & f128661e;
    }

    @sh.f
    private static int g(short s10, short s11) {
        return kotlin.jvm.internal.f0.t(s10 & f128661e, s11 & f128661e);
    }

    @sh.f
    private static final int g0(short s10) {
        return s10 & f128661e;
    }

    @r0
    @sh.g
    public static short h(short s10) {
        return s10;
    }

    @sh.f
    private static final long h0(short s10) {
        return ((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @sh.f
    private static final short i(short s10) {
        return h((short) (s10 - 1));
    }

    @sh.f
    private static final short i0(short s10) {
        return s10;
    }

    @sh.f
    private static final int j(short s10, byte b10) {
        return f1.a(n1.h(s10 & f128661e), n1.h(b10 & 255));
    }

    @dl.d
    public static String j0(short s10) {
        return String.valueOf(s10 & f128661e);
    }

    @sh.f
    private static final long k(short s10, long j10) {
        return i1.a(r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j10);
    }

    @sh.f
    private static final byte k0(short s10) {
        return j1.h((byte) s10);
    }

    @sh.f
    private static final int l(short s10, int i10) {
        return f1.a(n1.h(s10 & f128661e), i10);
    }

    @sh.f
    private static final int l0(short s10) {
        return n1.h(s10 & f128661e);
    }

    @sh.f
    private static final int m(short s10, short s11) {
        return f1.a(n1.h(s10 & f128661e), n1.h(s11 & f128661e));
    }

    @sh.f
    private static final long m0(short s10) {
        return r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    public static boolean n(short s10, Object obj) {
        return (obj instanceof x1) && s10 == ((x1) obj).o0();
    }

    @sh.f
    private static final short n0(short s10) {
        return s10;
    }

    public static final boolean o(short s10, short s11) {
        return s10 == s11;
    }

    @sh.f
    private static final int p(short s10, byte b10) {
        return f1.a(n1.h(s10 & f128661e), n1.h(b10 & 255));
    }

    @sh.f
    private static final short p0(short s10, short s11) {
        return h((short) (s10 ^ s11));
    }

    @sh.f
    private static final long q(short s10, long j10) {
        return i1.a(r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j10);
    }

    @sh.f
    private static final int r(short s10, int i10) {
        return f1.a(n1.h(s10 & f128661e), i10);
    }

    @sh.f
    private static final int s(short s10, short s11) {
        return f1.a(n1.h(s10 & f128661e), n1.h(s11 & f128661e));
    }

    @r0
    public static /* synthetic */ void t() {
    }

    public static int w(short s10) {
        return s10;
    }

    @sh.f
    private static final short x(short s10) {
        return h((short) (s10 + 1));
    }

    @sh.f
    private static final short y(short s10) {
        return h((short) (~s10));
    }

    @sh.f
    private static final int z(short s10, byte b10) {
        return n1.h(n1.h(s10 & f128661e) - n1.h(b10 & 255));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(x1 x1Var) {
        return kotlin.jvm.internal.f0.t(o0() & f128661e, x1Var.o0() & f128661e);
    }

    public boolean equals(Object obj) {
        return n(this.f128664b, obj);
    }

    public int hashCode() {
        return w(this.f128664b);
    }

    public final /* synthetic */ short o0() {
        return this.f128664b;
    }

    @dl.d
    public String toString() {
        return j0(this.f128664b);
    }
}

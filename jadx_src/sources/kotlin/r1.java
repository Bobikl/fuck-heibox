package kotlin;

import io.flutter.embedding.android.KeyboardMap;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = org.apache.tools.ant.util.s0.f136928s)
@e2(markerClass = {s.class})
@xh.f
public final class r1 implements Comparable<r1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f125022c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f125023d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f125024e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f125025f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f125026g = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f125027b;

    /* JADX INFO: compiled from: ULong.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    @r0
    @sh.g
    private /* synthetic */ r1(long j10) {
        this.f125027b = j10;
    }

    @sh.f
    private static final long A(long j10, long j11) {
        return h(j10 - j11);
    }

    @sh.f
    private static final long C(long j10, int i10) {
        return h(j10 - h(((long) i10) & KeyboardMap.kValueMask));
    }

    @sh.f
    private static final long I(long j10, short s10) {
        return h(j10 - h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @sh.f
    private static final byte J(long j10, byte b10) {
        return j1.h((byte) h1.a(j10, h(((long) b10) & 255)));
    }

    @sh.f
    private static final long K(long j10, long j11) {
        return h1.a(j10, j11);
    }

    @sh.f
    private static final int L(long j10, int i10) {
        return n1.h((int) h1.a(j10, h(((long) i10) & KeyboardMap.kValueMask)));
    }

    @sh.f
    private static final short M(long j10, short s10) {
        return x1.h((short) h1.a(j10, h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @sh.f
    private static final long N(long j10, long j11) {
        return h(j10 | j11);
    }

    @sh.f
    private static final long O(long j10, byte b10) {
        return h(j10 + h(((long) b10) & 255));
    }

    @sh.f
    private static final long P(long j10, long j11) {
        return h(j10 + j11);
    }

    @sh.f
    private static final long Q(long j10, int i10) {
        return h(j10 + h(((long) i10) & KeyboardMap.kValueMask));
    }

    @sh.f
    private static final long R(long j10, short s10) {
        return h(j10 + h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @sh.f
    private static final fi.a0 S(long j10, long j11) {
        return new fi.a0(j10, j11, null);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136932w)
    @q
    @sh.f
    private static final fi.a0 U(long j10, long j11) {
        return fi.c0.X(j10, j11);
    }

    @sh.f
    private static final long V(long j10, byte b10) {
        return h1.a(j10, h(((long) b10) & 255));
    }

    @sh.f
    private static final long W(long j10, long j11) {
        return d2.i(j10, j11);
    }

    @sh.f
    private static final long X(long j10, int i10) {
        return h1.a(j10, h(((long) i10) & KeyboardMap.kValueMask));
    }

    @sh.f
    private static final long Y(long j10, short s10) {
        return h1.a(j10, h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @sh.f
    private static final long Z(long j10, int i10) {
        return h(j10 << i10);
    }

    @sh.f
    private static final long a(long j10, long j11) {
        return h(j10 & j11);
    }

    @sh.f
    private static final long a0(long j10, int i10) {
        return h(j10 >>> i10);
    }

    public static final /* synthetic */ r1 b(long j10) {
        return new r1(j10);
    }

    @sh.f
    private static final long b0(long j10, byte b10) {
        return h(j10 * h(((long) b10) & 255));
    }

    @sh.f
    private static final int c(long j10, byte b10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, h(((long) b10) & 255) ^ Long.MIN_VALUE);
    }

    @sh.f
    private static final long c0(long j10, long j11) {
        return h(j10 * j11);
    }

    @sh.f
    private int d(long j10) {
        return d2.g(q0(), j10);
    }

    @sh.f
    private static final long d0(long j10, int i10) {
        return h(j10 * h(((long) i10) & KeyboardMap.kValueMask));
    }

    @sh.f
    private static int e(long j10, long j11) {
        return d2.g(j10, j11);
    }

    @sh.f
    private static final long e0(long j10, short s10) {
        return h(j10 * h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @sh.f
    private static final int f(long j10, int i10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, h(((long) i10) & KeyboardMap.kValueMask) ^ Long.MIN_VALUE);
    }

    @sh.f
    private static final byte f0(long j10) {
        return (byte) j10;
    }

    @sh.f
    private static final int g(long j10, short s10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
    }

    @sh.f
    private static final double g0(long j10) {
        return d2.j(j10);
    }

    @r0
    @sh.g
    public static long h(long j10) {
        return j10;
    }

    @sh.f
    private static final float h0(long j10) {
        return (float) d2.j(j10);
    }

    @sh.f
    private static final long i(long j10) {
        return h(j10 - 1);
    }

    @sh.f
    private static final int i0(long j10) {
        return (int) j10;
    }

    @sh.f
    private static final long j(long j10, byte b10) {
        return i1.a(j10, h(((long) b10) & 255));
    }

    @sh.f
    private static final long j0(long j10) {
        return j10;
    }

    @sh.f
    private static final long k(long j10, long j11) {
        return d2.h(j10, j11);
    }

    @sh.f
    private static final short k0(long j10) {
        return (short) j10;
    }

    @sh.f
    private static final long l(long j10, int i10) {
        return i1.a(j10, h(((long) i10) & KeyboardMap.kValueMask));
    }

    @dl.d
    public static String l0(long j10) {
        return d2.k(j10);
    }

    @sh.f
    private static final long m(long j10, short s10) {
        return i1.a(j10, h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @sh.f
    private static final byte m0(long j10) {
        return j1.h((byte) j10);
    }

    public static boolean n(long j10, Object obj) {
        return (obj instanceof r1) && j10 == ((r1) obj).q0();
    }

    @sh.f
    private static final int n0(long j10) {
        return n1.h((int) j10);
    }

    public static final boolean o(long j10, long j11) {
        return j10 == j11;
    }

    @sh.f
    private static final long o0(long j10) {
        return j10;
    }

    @sh.f
    private static final long p(long j10, byte b10) {
        return i1.a(j10, h(((long) b10) & 255));
    }

    @sh.f
    private static final short p0(long j10) {
        return x1.h((short) j10);
    }

    @sh.f
    private static final long q(long j10, long j11) {
        return i1.a(j10, j11);
    }

    @sh.f
    private static final long r(long j10, int i10) {
        return i1.a(j10, h(((long) i10) & KeyboardMap.kValueMask));
    }

    @sh.f
    private static final long r0(long j10, long j11) {
        return h(j10 ^ j11);
    }

    @sh.f
    private static final long s(long j10, short s10) {
        return i1.a(j10, h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @r0
    public static /* synthetic */ void t() {
    }

    public static int w(long j10) {
        return androidx.collection.k.a(j10);
    }

    @sh.f
    private static final long x(long j10) {
        return h(j10 + 1);
    }

    @sh.f
    private static final long y(long j10) {
        return h(~j10);
    }

    @sh.f
    private static final long z(long j10, byte b10) {
        return h(j10 - h(((long) b10) & 255));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(r1 r1Var) {
        return d2.g(q0(), r1Var.q0());
    }

    public boolean equals(Object obj) {
        return n(this.f125027b, obj);
    }

    public int hashCode() {
        return w(this.f125027b);
    }

    public final /* synthetic */ long q0() {
        return this.f125027b;
    }

    @dl.d
    public String toString() {
        return l0(this.f125027b);
    }
}

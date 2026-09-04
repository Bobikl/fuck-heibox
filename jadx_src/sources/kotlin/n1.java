package kotlin;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = org.apache.tools.ant.util.s0.f136928s)
@e2(markerClass = {s.class})
@xh.f
public final class n1 implements Comparable<n1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f125008c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f125009d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f125010e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f125011f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f125012g = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f125013b;

    /* JADX INFO: compiled from: UInt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    @r0
    @sh.g
    private /* synthetic */ n1(int i10) {
        this.f125013b = i10;
    }

    @sh.f
    private static final long A(int i10, long j10) {
        return r1.h(r1.h(((long) i10) & KeyboardMap.kValueMask) - j10);
    }

    @sh.f
    private static final int C(int i10, int i11) {
        return h(i10 - i11);
    }

    @sh.f
    private static final int I(int i10, short s10) {
        return h(i10 - h(s10 & x1.f128661e));
    }

    @sh.f
    private static final byte J(int i10, byte b10) {
        return j1.h((byte) e1.a(i10, h(b10 & 255)));
    }

    @sh.f
    private static final long K(int i10, long j10) {
        return h1.a(r1.h(((long) i10) & KeyboardMap.kValueMask), j10);
    }

    @sh.f
    private static final int L(int i10, int i11) {
        return e1.a(i10, i11);
    }

    @sh.f
    private static final short M(int i10, short s10) {
        return x1.h((short) e1.a(i10, h(s10 & x1.f128661e)));
    }

    @sh.f
    private static final int N(int i10, int i11) {
        return h(i10 | i11);
    }

    @sh.f
    private static final int O(int i10, byte b10) {
        return h(i10 + h(b10 & 255));
    }

    @sh.f
    private static final long P(int i10, long j10) {
        return r1.h(r1.h(((long) i10) & KeyboardMap.kValueMask) + j10);
    }

    @sh.f
    private static final int Q(int i10, int i11) {
        return h(i10 + i11);
    }

    @sh.f
    private static final int R(int i10, short s10) {
        return h(i10 + h(s10 & x1.f128661e));
    }

    @sh.f
    private static final fi.x S(int i10, int i11) {
        return new fi.x(i10, i11, null);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136932w)
    @q
    @sh.f
    private static final fi.x U(int i10, int i11) {
        return fi.c0.V(i10, i11);
    }

    @sh.f
    private static final int V(int i10, byte b10) {
        return e1.a(i10, h(b10 & 255));
    }

    @sh.f
    private static final long W(int i10, long j10) {
        return h1.a(r1.h(((long) i10) & KeyboardMap.kValueMask), j10);
    }

    @sh.f
    private static final int X(int i10, int i11) {
        return d2.e(i10, i11);
    }

    @sh.f
    private static final int Y(int i10, short s10) {
        return e1.a(i10, h(s10 & x1.f128661e));
    }

    @sh.f
    private static final int Z(int i10, int i11) {
        return h(i10 << i11);
    }

    @sh.f
    private static final int a(int i10, int i11) {
        return h(i10 & i11);
    }

    @sh.f
    private static final int a0(int i10, int i11) {
        return h(i10 >>> i11);
    }

    public static final /* synthetic */ n1 b(int i10) {
        return new n1(i10);
    }

    @sh.f
    private static final int b0(int i10, byte b10) {
        return h(i10 * h(b10 & 255));
    }

    @sh.f
    private static final int c(int i10, byte b10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, h(b10 & 255) ^ Integer.MIN_VALUE);
    }

    @sh.f
    private static final long c0(int i10, long j10) {
        return r1.h(r1.h(((long) i10) & KeyboardMap.kValueMask) * j10);
    }

    @sh.f
    private static final int d(int i10, long j10) {
        return Long.compare(r1.h(((long) i10) & KeyboardMap.kValueMask) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @sh.f
    private static final int d0(int i10, int i11) {
        return h(i10 * i11);
    }

    @sh.f
    private int e(int i10) {
        return d2.c(q0(), i10);
    }

    @sh.f
    private static final int e0(int i10, short s10) {
        return h(i10 * h(s10 & x1.f128661e));
    }

    @sh.f
    private static int f(int i10, int i11) {
        return d2.c(i10, i11);
    }

    @sh.f
    private static final byte f0(int i10) {
        return (byte) i10;
    }

    @sh.f
    private static final int g(int i10, short s10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, h(s10 & x1.f128661e) ^ Integer.MIN_VALUE);
    }

    @sh.f
    private static final double g0(int i10) {
        return d2.f(i10);
    }

    @r0
    @sh.g
    public static int h(int i10) {
        return i10;
    }

    @sh.f
    private static final float h0(int i10) {
        return (float) d2.f(i10);
    }

    @sh.f
    private static final int i(int i10) {
        return h(i10 - 1);
    }

    @sh.f
    private static final int i0(int i10) {
        return i10;
    }

    @sh.f
    private static final int j(int i10, byte b10) {
        return f1.a(i10, h(b10 & 255));
    }

    @sh.f
    private static final long j0(int i10) {
        return ((long) i10) & KeyboardMap.kValueMask;
    }

    @sh.f
    private static final long k(int i10, long j10) {
        return i1.a(r1.h(((long) i10) & KeyboardMap.kValueMask), j10);
    }

    @sh.f
    private static final short k0(int i10) {
        return (short) i10;
    }

    @sh.f
    private static final int l(int i10, int i11) {
        return d2.d(i10, i11);
    }

    @dl.d
    public static String l0(int i10) {
        return String.valueOf(((long) i10) & KeyboardMap.kValueMask);
    }

    @sh.f
    private static final int m(int i10, short s10) {
        return f1.a(i10, h(s10 & x1.f128661e));
    }

    @sh.f
    private static final byte m0(int i10) {
        return j1.h((byte) i10);
    }

    public static boolean n(int i10, Object obj) {
        return (obj instanceof n1) && i10 == ((n1) obj).q0();
    }

    @sh.f
    private static final int n0(int i10) {
        return i10;
    }

    public static final boolean o(int i10, int i11) {
        return i10 == i11;
    }

    @sh.f
    private static final long o0(int i10) {
        return r1.h(((long) i10) & KeyboardMap.kValueMask);
    }

    @sh.f
    private static final int p(int i10, byte b10) {
        return f1.a(i10, h(b10 & 255));
    }

    @sh.f
    private static final short p0(int i10) {
        return x1.h((short) i10);
    }

    @sh.f
    private static final long q(int i10, long j10) {
        return i1.a(r1.h(((long) i10) & KeyboardMap.kValueMask), j10);
    }

    @sh.f
    private static final int r(int i10, int i11) {
        return f1.a(i10, i11);
    }

    @sh.f
    private static final int r0(int i10, int i11) {
        return h(i10 ^ i11);
    }

    @sh.f
    private static final int s(int i10, short s10) {
        return f1.a(i10, h(s10 & x1.f128661e));
    }

    @r0
    public static /* synthetic */ void t() {
    }

    public static int w(int i10) {
        return i10;
    }

    @sh.f
    private static final int x(int i10) {
        return h(i10 + 1);
    }

    @sh.f
    private static final int y(int i10) {
        return h(~i10);
    }

    @sh.f
    private static final int z(int i10, byte b10) {
        return h(i10 - h(b10 & 255));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(n1 n1Var) {
        return d2.c(q0(), n1Var.q0());
    }

    public boolean equals(Object obj) {
        return n(this.f125013b, obj);
    }

    public int hashCode() {
        return w(this.f125013b);
    }

    public final /* synthetic */ int q0() {
        return this.f125013b;
    }

    @dl.d
    public String toString() {
        return l0(this.f125013b);
    }
}

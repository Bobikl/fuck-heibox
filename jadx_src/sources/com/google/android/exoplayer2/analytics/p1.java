package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.z3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: AnalyticsListener.java */
/* JADX INFO: loaded from: classes7.dex */
public interface p1 {
    public static final int A = 1007;
    public static final int B = 1008;
    public static final int C = 1009;
    public static final int D = 1010;
    public static final int E = 1011;
    public static final int F = 1012;
    public static final int G = 1013;
    public static final int H = 1014;
    public static final int I = 1015;
    public static final int J = 1016;
    public static final int K = 1017;
    public static final int L = 1018;
    public static final int M = 1019;
    public static final int N = 1020;
    public static final int O = 1021;
    public static final int P = 1022;
    public static final int Q = 1023;
    public static final int R = 1024;
    public static final int S = 1025;
    public static final int T = 1026;
    public static final int U = 1027;
    public static final int V = 1028;
    public static final int W = 1029;
    public static final int X = 1030;
    public static final int Y = 1031;
    public static final int Z = 1032;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f43749a = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f43750a0 = 1033;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f43751b = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f43752b0 = 1034;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f43753c = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f43754c0 = 1035;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43755d = 3;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f43756d0 = 1036;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43757e = 4;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f43758e0 = 1037;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f43759f = 5;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f43760f0 = 1038;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f43761g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f43762h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f43763i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f43764j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f43765k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f43766l = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f43767m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f43768n = 13;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f43769o = 14;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f43770p = 15;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f43771q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f43772r = 17;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f43773s = 18;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f43774t = 1000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f43775u = 1001;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f43776v = 1002;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f43777w = 1003;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f43778x = 1004;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f43779y = 1005;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f43780z = 1006;

    /* JADX INFO: compiled from: AnalyticsListener.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f43781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z3 f43782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public final com.google.android.exoplayer2.source.f0.a f43784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f43785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final z3 f43786f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f43787g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        public final com.google.android.exoplayer2.source.f0.a f43788h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f43789i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f43790j;

        public b(long j10, z3 z3Var, int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, long j11, z3 z3Var2, int i11, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar2, long j12, long j13) {
            this.f43781a = j10;
            this.f43782b = z3Var;
            this.f43783c = i10;
            this.f43784d = aVar;
            this.f43785e = j11;
            this.f43786f = z3Var2;
            this.f43787g = i11;
            this.f43788h = aVar2;
            this.f43789i = j12;
            this.f43790j = j13;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f43781a == bVar.f43781a && this.f43783c == bVar.f43783c && this.f43785e == bVar.f43785e && this.f43787g == bVar.f43787g && this.f43789i == bVar.f43789i && this.f43790j == bVar.f43790j && com.google.common.base.s.a(this.f43782b, bVar.f43782b) && com.google.common.base.s.a(this.f43784d, bVar.f43784d) && com.google.common.base.s.a(this.f43786f, bVar.f43786f) && com.google.common.base.s.a(this.f43788h, bVar.f43788h);
        }

        public int hashCode() {
            return com.google.common.base.s.b(Long.valueOf(this.f43781a), this.f43782b, Integer.valueOf(this.f43783c), this.f43784d, Long.valueOf(this.f43785e), this.f43786f, Integer.valueOf(this.f43787g), this.f43788h, Long.valueOf(this.f43789i), Long.valueOf(this.f43790j));
        }
    }

    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.o f43791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<b> f43792b;

        public c(com.google.android.exoplayer2.util.o oVar, SparseArray<b> sparseArray) {
            this.f43791a = oVar;
            SparseArray<b> sparseArray2 = new SparseArray<>(oVar.d());
            for (int i10 = 0; i10 < oVar.d(); i10++) {
                int iC = oVar.c(i10);
                sparseArray2.append(iC, (b) com.google.android.exoplayer2.util.a.g(sparseArray.get(iC)));
            }
            this.f43792b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f43791a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f43791a.b(iArr);
        }

        public int c(int i10) {
            return this.f43791a.c(i10);
        }

        public b d(int i10) {
            return (b) com.google.android.exoplayer2.util.a.g(this.f43792b.get(i10));
        }

        public int e() {
            return this.f43791a.d();
        }
    }

    void A(b bVar);

    void A0(b bVar, long j10);

    void B(b bVar, int i10, long j10, long j11);

    void C(b bVar, String str, long j10, long j11);

    void D(b bVar, com.google.android.exoplayer2.audio.f fVar);

    void E(b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar);

    @Deprecated
    void F(b bVar, com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar);

    void G(b bVar, boolean z10);

    void H(b bVar, Exception exc);

    void I(b bVar, com.google.android.exoplayer2.source.y yVar);

    void J(b bVar, com.google.android.exoplayer2.source.y yVar);

    void K(b bVar, c3.l lVar, c3.l lVar2, int i10);

    void L(b bVar, c3.c cVar);

    void M(b bVar, Object obj, long j10);

    @Deprecated
    void N(b bVar, int i10, com.google.android.exoplayer2.decoder.g gVar);

    void O(b bVar, String str);

    void P(b bVar, int i10);

    void Q(b bVar, Exception exc);

    @Deprecated
    void R(b bVar, boolean z10);

    void S(b bVar, m2 m2Var);

    @Deprecated
    void T(b bVar, String str, long j10);

    void U(c3 c3Var, c cVar);

    void V(b bVar, int i10);

    void W(b bVar, int i10, int i11);

    void X(b bVar, boolean z10, int i10);

    void Y(b bVar, a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.decoder.i iVar);

    void Z(b bVar, int i10);

    void a(b bVar, long j10, int i10);

    @Deprecated
    void a0(b bVar);

    void b(b bVar);

    @Deprecated
    void b0(b bVar);

    void c(b bVar, int i10);

    void c0(b bVar);

    void d(b bVar, com.google.android.exoplayer2.decoder.g gVar);

    void d0(b bVar, int i10, long j10, long j11);

    void e(b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar, IOException iOException, boolean z10);

    @Deprecated
    void e0(b bVar, int i10, int i11, int i12, float f10);

    @Deprecated
    void f(b bVar, int i10, com.google.android.exoplayer2.decoder.g gVar);

    @Deprecated
    void f0(b bVar, int i10, String str, long j10);

    void g(b bVar, e4 e4Var);

    @Deprecated
    void g0(b bVar, int i10);

    void h(b bVar, Metadata metadata);

    void h0(b bVar, b3 b3Var);

    @Deprecated
    void i(b bVar, boolean z10, int i10);

    void i0(b bVar, com.google.android.exoplayer2.decoder.g gVar);

    void j(b bVar, int i10);

    void j0(b bVar, com.google.android.exoplayer2.decoder.g gVar);

    @Deprecated
    void k(b bVar, a2 a2Var);

    void k0(b bVar, int i10);

    void l(b bVar, long j10);

    void l0(b bVar);

    void m(b bVar, boolean z10);

    void m0(b bVar, com.google.android.exoplayer2.video.a0 a0Var);

    void n(b bVar, int i10, long j10);

    void o(b bVar, Exception exc);

    void p(b bVar, boolean z10);

    @Deprecated
    void p0(b bVar, a2 a2Var);

    void q(b bVar, String str, long j10, long j11);

    void q0(b bVar);

    void r(b bVar, long j10);

    void r0(b bVar, float f10);

    void s(b bVar, Exception exc);

    void s0(b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar);

    void t(b bVar, @androidx.annotation.p0 i2 i2Var, int i10);

    void t0(b bVar, String str);

    void u(b bVar, long j10);

    void v(b bVar, com.google.android.exoplayer2.decoder.g gVar);

    @Deprecated
    void v0(b bVar, String str, long j10);

    @Deprecated
    void w(b bVar, int i10, a2 a2Var);

    void w0(b bVar, a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.decoder.i iVar);

    @Deprecated
    void x(b bVar);

    void x0(b bVar, m2 m2Var);

    void y(b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar);

    void y0(b bVar, boolean z10);

    void z(b bVar, PlaybackException playbackException);
}

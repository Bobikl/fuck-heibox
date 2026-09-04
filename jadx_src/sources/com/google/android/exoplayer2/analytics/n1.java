package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.z3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: AnalyticsCollector.java */
/* JADX INFO: loaded from: classes7.dex */
public class n1 implements c3.h, com.google.android.exoplayer2.audio.t, com.google.android.exoplayer2.video.y, com.google.android.exoplayer2.source.n0, com.google.android.exoplayer2.upstream.e.a, com.google.android.exoplayer2.drm.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e f43727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z3.b f43728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z3.d f43729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f43730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray<p1.b> f43731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.exoplayer2.util.t<p1> f43732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c3 f43733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.exoplayer2.util.p f43734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f43735j;

    /* JADX INFO: compiled from: AnalyticsCollector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z3.b f43736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImmutableList<com.google.android.exoplayer2.source.f0.a> f43737b = ImmutableList.B();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImmutableMap<com.google.android.exoplayer2.source.f0.a, z3> f43738c = ImmutableMap.v();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.source.f0.a f43739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.android.exoplayer2.source.f0.a f43740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.android.exoplayer2.source.f0.a f43741f;

        public a(z3.b bVar) {
            this.f43736a = bVar;
        }

        private void b(ImmutableMap.b<com.google.android.exoplayer2.source.f0.a, z3> bVar, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, z3 z3Var) {
            if (aVar == null) {
                return;
            }
            if (z3Var.g(aVar.f47719a) != -1) {
                bVar.i(aVar, z3Var);
                return;
            }
            z3 z3Var2 = this.f43738c.get(aVar);
            if (z3Var2 != null) {
                bVar.i(aVar, z3Var2);
            }
        }

        @androidx.annotation.p0
        private static com.google.android.exoplayer2.source.f0.a c(c3 c3Var, ImmutableList<com.google.android.exoplayer2.source.f0.a> immutableList, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, z3.b bVar) {
            z3 z3VarW1 = c3Var.w1();
            int iX0 = c3Var.x0();
            Object objT = z3VarW1.x() ? null : z3VarW1.t(iX0);
            int iH = (c3Var.O() || z3VarW1.x()) ? -1 : z3VarW1.k(iX0, bVar).h(com.google.android.exoplayer2.util.u0.U0(c3Var.getCurrentPosition()) - bVar.s());
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                com.google.android.exoplayer2.source.f0.a aVar2 = immutableList.get(i10);
                if (i(aVar2, objT, c3Var.O(), c3Var.f0(), c3Var.A0(), iH)) {
                    return aVar2;
                }
            }
            if (immutableList.isEmpty() && aVar != null) {
                if (i(aVar, objT, c3Var.O(), c3Var.f0(), c3Var.A0(), iH)) {
                    return aVar;
                }
            }
            return null;
        }

        private static boolean i(com.google.android.exoplayer2.source.f0.a aVar, @androidx.annotation.p0 Object obj, boolean z10, int i10, int i11, int i12) {
            if (aVar.f47719a.equals(obj)) {
                return (z10 && aVar.f47720b == i10 && aVar.f47721c == i11) || (!z10 && aVar.f47720b == -1 && aVar.f47723e == i12);
            }
            return false;
        }

        private void m(z3 z3Var) {
            ImmutableMap.b<com.google.android.exoplayer2.source.f0.a, z3> bVarB = ImmutableMap.b();
            if (this.f43737b.isEmpty()) {
                b(bVarB, this.f43740e, z3Var);
                if (!com.google.common.base.s.a(this.f43741f, this.f43740e)) {
                    b(bVarB, this.f43741f, z3Var);
                }
                if (!com.google.common.base.s.a(this.f43739d, this.f43740e) && !com.google.common.base.s.a(this.f43739d, this.f43741f)) {
                    b(bVarB, this.f43739d, z3Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f43737b.size(); i10++) {
                    b(bVarB, this.f43737b.get(i10), z3Var);
                }
                if (!this.f43737b.contains(this.f43739d)) {
                    b(bVarB, this.f43739d, z3Var);
                }
            }
            this.f43738c = bVarB.a();
        }

        @androidx.annotation.p0
        public com.google.android.exoplayer2.source.f0.a d() {
            return this.f43739d;
        }

        @androidx.annotation.p0
        public com.google.android.exoplayer2.source.f0.a e() {
            if (this.f43737b.isEmpty()) {
                return null;
            }
            return (com.google.android.exoplayer2.source.f0.a) com.google.common.collect.l1.w(this.f43737b);
        }

        @androidx.annotation.p0
        public z3 f(com.google.android.exoplayer2.source.f0.a aVar) {
            return this.f43738c.get(aVar);
        }

        @androidx.annotation.p0
        public com.google.android.exoplayer2.source.f0.a g() {
            return this.f43740e;
        }

        @androidx.annotation.p0
        public com.google.android.exoplayer2.source.f0.a h() {
            return this.f43741f;
        }

        public void j(c3 c3Var) {
            this.f43739d = c(c3Var, this.f43737b, this.f43740e, this.f43736a);
        }

        public void k(List<com.google.android.exoplayer2.source.f0.a> list, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, c3 c3Var) {
            this.f43737b = ImmutableList.v(list);
            if (!list.isEmpty()) {
                this.f43740e = list.get(0);
                this.f43741f = (com.google.android.exoplayer2.source.f0.a) com.google.android.exoplayer2.util.a.g(aVar);
            }
            if (this.f43739d == null) {
                this.f43739d = c(c3Var, this.f43737b, this.f43740e, this.f43736a);
            }
            m(c3Var.w1());
        }

        public void l(c3 c3Var) {
            this.f43739d = c(c3Var, this.f43737b, this.f43740e, this.f43736a);
            m(c3Var.w1());
        }
    }

    public n1(com.google.android.exoplayer2.util.e eVar) {
        this.f43727b = (com.google.android.exoplayer2.util.e) com.google.android.exoplayer2.util.a.g(eVar);
        this.f43732g = new com.google.android.exoplayer2.util.t<>(com.google.android.exoplayer2.util.u0.X(), eVar, new com.google.android.exoplayer2.util.t.b() { // from class: com.google.android.exoplayer2.analytics.j
            @Override // com.google.android.exoplayer2.util.t.b
            public final void a(Object obj, com.google.android.exoplayer2.util.o oVar) {
                n1.O1((p1) obj, oVar);
            }
        });
        z3.b bVar = new z3.b();
        this.f43728c = bVar;
        this.f43729d = new z3.d();
        this.f43730e = new a(bVar);
        this.f43731f = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C2(p1.b bVar, int i10, c3.l lVar, c3.l lVar2, p1 p1Var) {
        p1Var.g0(bVar, i10);
        p1Var.K(bVar, lVar, lVar2, i10);
    }

    private p1.b J1(@androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
        com.google.android.exoplayer2.util.a.g(this.f43733h);
        z3 z3VarF = aVar == null ? null : this.f43730e.f(aVar);
        if (aVar != null && z3VarF != null) {
            return I1(z3VarF, z3VarF.m(aVar.f47719a, this.f43728c).f52095d, aVar);
        }
        int iZ1 = this.f43733h.Z1();
        z3 z3VarW1 = this.f43733h.w1();
        if (!(iZ1 < z3VarW1.w())) {
            z3VarW1 = z3.f52082b;
        }
        return I1(z3VarW1, iZ1, null);
    }

    private p1.b K1() {
        return J1(this.f43730e.e());
    }

    private p1.b L1(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
        com.google.android.exoplayer2.util.a.g(this.f43733h);
        if (aVar != null) {
            return this.f43730e.f(aVar) != null ? J1(aVar) : I1(z3.f52082b, i10, aVar);
        }
        z3 z3VarW1 = this.f43733h.w1();
        if (!(i10 < z3VarW1.w())) {
            z3VarW1 = z3.f52082b;
        }
        return I1(z3VarW1, i10, null);
    }

    private p1.b M1() {
        return J1(this.f43730e.g());
    }

    private p1.b N1() {
        return J1(this.f43730e.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O1(p1 p1Var, com.google.android.exoplayer2.util.o oVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q2(p1.b bVar, String str, long j10, long j11, p1 p1Var) {
        p1Var.v0(bVar, str, j10);
        p1Var.q(bVar, str, j11, j10);
        p1Var.f0(bVar, 2, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S1(p1.b bVar, String str, long j10, long j11, p1 p1Var) {
        p1Var.T(bVar, str, j10);
        p1Var.C(bVar, str, j11, j10);
        p1Var.f0(bVar, 1, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S2(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar, p1 p1Var) {
        p1Var.v(bVar, gVar);
        p1Var.N(bVar, 2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T2(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar, p1 p1Var) {
        p1Var.j0(bVar, gVar);
        p1Var.f(bVar, 2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U1(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar, p1 p1Var) {
        p1Var.i0(bVar, gVar);
        p1Var.N(bVar, 1, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V1(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar, p1 p1Var) {
        p1Var.d(bVar, gVar);
        p1Var.f(bVar, 1, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V2(p1.b bVar, a2 a2Var, com.google.android.exoplayer2.decoder.i iVar, p1 p1Var) {
        p1Var.k(bVar, a2Var);
        p1Var.Y(bVar, a2Var, iVar);
        p1Var.w(bVar, 2, a2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W1(p1.b bVar, a2 a2Var, com.google.android.exoplayer2.decoder.i iVar, p1 p1Var) {
        p1Var.p0(bVar, a2Var);
        p1Var.w0(bVar, a2Var, iVar);
        p1Var.w(bVar, 1, a2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W2(p1.b bVar, com.google.android.exoplayer2.video.a0 a0Var, p1 p1Var) {
        p1Var.m0(bVar, a0Var);
        p1Var.e0(bVar, a0Var.f51712b, a0Var.f51713c, a0Var.f51714d, a0Var.f51715e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z2(c3 c3Var, p1 p1Var, com.google.android.exoplayer2.util.o oVar) {
        p1Var.U(c3Var, new p1.c(oVar, this.f43731f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3() {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 1036, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.u0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).l0(bVarH1);
            }
        });
        this.f43732g.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h2(p1.b bVar, int i10, p1 p1Var) {
        p1Var.b0(bVar);
        p1Var.P(bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l2(p1.b bVar, boolean z10, p1 p1Var) {
        p1Var.R(bVar, z10);
        p1Var.y0(bVar, z10);
    }

    @Override // com.google.android.exoplayer2.source.n0
    public final void A(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, final com.google.android.exoplayer2.source.u uVar, final com.google.android.exoplayer2.source.y yVar) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1002, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.d1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).E(bVarL1, uVar, yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h
    public final void B(final int i10) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1015, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.b1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).V(bVarN1, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.e.a
    public final void C(final int i10, final long j10, final long j11) {
        final p1.b bVarK1 = K1();
        e3(bVarK1, 1006, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.m0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).d0(bVarK1, i10, j10, j11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.t
    public final void D(final String str) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1013, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.i0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).t0(bVarN1, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.t
    public final void E(final String str, final long j10, final long j11) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1009, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.b0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.S1(bVarN1, str, j11, j10, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void F(int i10, boolean z10) {
        f3.f(this, i10, z10);
    }

    @Override // com.google.android.exoplayer2.source.n0
    public final void G(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, final com.google.android.exoplayer2.source.y yVar) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1005, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.l0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).J(bVarL1, yVar);
            }
        });
    }

    @androidx.annotation.i
    public void G1(p1 p1Var) {
        com.google.android.exoplayer2.util.a.g(p1Var);
        this.f43732g.c(p1Var);
    }

    @Override // com.google.android.exoplayer2.c3.f
    public final void H() {
        final p1.b bVarH1 = H1();
        e3(bVarH1, -1, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.a
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).x(bVarH1);
            }
        });
    }

    protected final p1.b H1() {
        return J1(this.f43730e.d());
    }

    @Override // com.google.android.exoplayer2.video.y
    public final void I(final int i10, final long j10) {
        final p1.b bVarM1 = M1();
        e3(bVarM1, 1023, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.l1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).n(bVarM1, i10, j10);
            }
        });
    }

    @mk.m({"player"})
    protected final p1.b I1(z3 z3Var, int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
        long jQ1;
        com.google.android.exoplayer2.source.f0.a aVar2 = z3Var.x() ? null : aVar;
        long jB = this.f43727b.b();
        boolean z10 = z3Var.equals(this.f43733h.w1()) && i10 == this.f43733h.Z1();
        long jF = 0;
        if (aVar2 == null || !aVar2.c()) {
            if (z10) {
                jQ1 = this.f43733h.Q1();
            } else if (!z3Var.x()) {
                jF = z3Var.u(i10, this.f43729d).f();
            }
            return new p1.b(jB, z3Var, i10, aVar2, jQ1, this.f43733h.w1(), this.f43733h.Z1(), this.f43730e.d(), this.f43733h.getCurrentPosition(), this.f43733h.Q());
        }
        if (z10 && this.f43733h.f0() == aVar2.f47720b && this.f43733h.A0() == aVar2.f47721c) {
            jF = this.f43733h.getCurrentPosition();
        }
        jQ1 = jF;
        return new p1.b(jB, z3Var, i10, aVar2, jQ1, this.f43733h.w1(), this.f43733h.Z1(), this.f43730e.d(), this.f43733h.getCurrentPosition(), this.f43733h.Q());
    }

    @Override // com.google.android.exoplayer2.audio.t
    public final void J(final a2 a2Var, @androidx.annotation.p0 final com.google.android.exoplayer2.decoder.i iVar) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1010, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.q
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.W1(bVarN1, a2Var, iVar, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h
    public final void K(final com.google.android.exoplayer2.audio.f fVar) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1016, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.p0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).D(bVarN1, fVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.s
    public final void L(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1031, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.o
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).q0(bVarL1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.t
    public final void M(final Exception exc) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1037, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.e1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).H(bVarN1, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.s
    public final void N(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, final int i11) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1030, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.c0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.h2(bVarL1, i11, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.n0
    public final void O(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, final com.google.android.exoplayer2.source.u uVar, final com.google.android.exoplayer2.source.y yVar, final IOException iOException, final boolean z10) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1003, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.r
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).e(bVarL1, uVar, yVar, iOException, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.y
    public final void P(final long j10, final int i10) {
        final p1.b bVarM1 = M1();
        e3(bVarM1, 1026, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.m
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).a(bVarM1, j10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.s
    public final void Q(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1033, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.y
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).b(bVarL1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.t
    public final void R(final com.google.android.exoplayer2.decoder.g gVar) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1008, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.t
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.V1(bVarN1, gVar, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.y
    public final void S(final String str, final long j10, final long j11) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1021, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.i1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.Q2(bVarN1, str, j11, j10, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.n0
    public final void T(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, final com.google.android.exoplayer2.source.y yVar) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1004, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.a1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).I(bVarL1, yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.n0
    public final void U(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, final com.google.android.exoplayer2.source.u uVar, final com.google.android.exoplayer2.source.y yVar) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1000, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.u
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).y(bVarL1, uVar, yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void V(com.google.android.exoplayer2.p pVar) {
        f3.e(this, pVar);
    }

    @Override // com.google.android.exoplayer2.drm.s
    public final void W(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1034, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.i
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).c0(bVarL1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void X() {
        f3.u(this);
    }

    @Override // com.google.android.exoplayer2.drm.s
    public /* synthetic */ void Y(int i10, com.google.android.exoplayer2.source.f0.a aVar) {
        com.google.android.exoplayer2.drm.l.d(this, i10, aVar);
    }

    @Override // com.google.android.exoplayer2.video.y
    public /* synthetic */ void Z(a2 a2Var) {
        com.google.android.exoplayer2.video.n.i(this, a2Var);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.audio.t
    public final void a(final boolean z10) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1017, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.w
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).p(bVarN1, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.y
    public final void a0(final a2 a2Var, @androidx.annotation.p0 final com.google.android.exoplayer2.decoder.i iVar) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1022, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.g
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.V2(bVarN1, a2Var, iVar, (p1) obj);
            }
        });
    }

    public final void a3() {
        if (this.f43735j) {
            return;
        }
        final p1.b bVarH1 = H1();
        this.f43735j = true;
        e3(bVarH1, -1, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.o0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).a0(bVarH1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void b(final b3 b3Var) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 12, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.j0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).h0(bVarH1, b3Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.t
    public final void b0(final long j10) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1011, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.g1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).l(bVarN1, j10);
            }
        });
    }

    @androidx.annotation.i
    public void b3() {
        ((com.google.android.exoplayer2.util.p) com.google.android.exoplayer2.util.a.k(this.f43734i)).k(new Runnable() { // from class: com.google.android.exoplayer2.analytics.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f43678b.c3();
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void c(final c3.l lVar, final c3.l lVar2, final int i10) {
        if (i10 == 1) {
            this.f43735j = false;
        }
        this.f43730e.j((c3) com.google.android.exoplayer2.util.a.g(this.f43733h));
        final p1.b bVarH1 = H1();
        e3(bVarH1, 11, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.q0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.C2(bVarH1, i10, lVar, lVar2, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.y
    public final void c0(final Exception exc) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1038, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.k0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).s(bVarN1, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void d(z3 z3Var, final int i10) {
        this.f43730e.l((c3) com.google.android.exoplayer2.util.a.g(this.f43733h));
        final p1.b bVarH1 = H1();
        e3(bVarH1, 0, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.f
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).Z(bVarH1, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.f
    public final void d0(final com.google.android.exoplayer2.source.p1 p1Var, final com.google.android.exoplayer2.trackselection.p pVar) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 2, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.h1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).F(bVarH1, p1Var, pVar);
            }
        });
    }

    @androidx.annotation.i
    public void d3(p1 p1Var) {
        this.f43732g.j(p1Var);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public void e(final m2 m2Var) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 14, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.d0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).S(bVarH1, m2Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.y
    public final void e0(final com.google.android.exoplayer2.decoder.g gVar) {
        final p1.b bVarM1 = M1();
        e3(bVarM1, 1025, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.e0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.S2(bVarM1, gVar, (p1) obj);
            }
        });
    }

    protected final void e3(p1.b bVar, int i10, com.google.android.exoplayer2.util.t.a<p1> aVar) {
        this.f43731f.put(i10, bVar);
        this.f43732g.k(i10, aVar);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void f(final boolean z10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 9, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.s
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).m(bVarH1, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void f0(com.google.android.exoplayer2.trackselection.u uVar) {
        e3.y(this, uVar);
    }

    @androidx.annotation.i
    public void f3(final c3 c3Var, Looper looper) {
        com.google.android.exoplayer2.util.a.i(this.f43733h == null || this.f43730e.f43737b.isEmpty());
        this.f43733h = (c3) com.google.android.exoplayer2.util.a.g(c3Var);
        this.f43734i = this.f43727b.e(looper, null);
        this.f43732g = this.f43732g.d(looper, new com.google.android.exoplayer2.util.t.b() { // from class: com.google.android.exoplayer2.analytics.k
            @Override // com.google.android.exoplayer2.util.t.b
            public final void a(Object obj, com.google.android.exoplayer2.util.o oVar) {
                this.f43700a.Z2(c3Var, (p1) obj, oVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.video.y
    public final void g(final com.google.android.exoplayer2.video.a0 a0Var) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1028, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.s0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.W2(bVarN1, a0Var, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h
    public void g0(final int i10, final int i11) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1029, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.p
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).W(bVarN1, i10, i11);
            }
        });
    }

    public final void g3(List<com.google.android.exoplayer2.source.f0.a> list, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
        this.f43730e.k(list, aVar, (c3) com.google.android.exoplayer2.util.a.g(this.f43733h));
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void h(PlaybackException playbackException) {
        f3.r(this, playbackException);
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void h0(int i10) {
        e3.q(this, i10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void i(final PlaybackException playbackException) {
        com.google.android.exoplayer2.source.d0 d0Var;
        final p1.b bVarJ1 = (!(playbackException instanceof ExoPlaybackException) || (d0Var = ((ExoPlaybackException) playbackException).Y) == null) ? null : J1(new com.google.android.exoplayer2.source.f0.a(d0Var));
        if (bVarJ1 == null) {
            bVarJ1 = H1();
        }
        e3(bVarJ1, 10, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.l
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).z(bVarJ1, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.t
    public final void i0(final com.google.android.exoplayer2.decoder.g gVar) {
        final p1.b bVarM1 = M1();
        e3(bVarM1, 1014, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.j1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.U1(bVarM1, gVar, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public void j(final long j10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 17, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.x
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).r(bVarH1, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.s
    public final void j0(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, final Exception exc) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1032, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.a0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).Q(bVarL1, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void k(final boolean z10, final int i10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 5, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.m1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).X(bVarH1, z10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h
    public final void k0(final float f10) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1019, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.n0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).r0(bVarN1, f10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public void l(final boolean z10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 7, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.f1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).G(bVarH1, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.f
    public final void l0(final boolean z10, final int i10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, -1, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.c
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).i(bVarH1, z10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void m(final int i10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 6, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.h0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).c(bVarH1, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.y
    public final void m0(final Object obj, final long j10) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1027, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.h
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj2) {
                ((p1) obj2).M(bVarN1, obj, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public void n(final e4 e4Var) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 2, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.k1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).g(bVarH1, e4Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.y
    public final void n0(final com.google.android.exoplayer2.decoder.g gVar) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1020, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.v0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.T2(bVarN1, gVar, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public void o(final c3.c cVar) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 13, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.x0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).L(bVarH1, cVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.t
    public /* synthetic */ void o0(a2 a2Var) {
        com.google.android.exoplayer2.audio.i.f(this, a2Var);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void onRepeatModeChanged(final int i10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 8, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.b
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).k0(bVarH1, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void p(final int i10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 4, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.y0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).j(bVarH1, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.f
    public void p0(final long j10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 18, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.z
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).A0(bVarH1, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h
    public final void q(final Metadata metadata) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 1007, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.n
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).h(bVarH1, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.n0
    public final void q0(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, final com.google.android.exoplayer2.source.u uVar, final com.google.android.exoplayer2.source.y yVar) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1001, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.f0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).s0(bVarL1, uVar, yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public void r(final long j10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 16, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.e
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).u(bVarH1, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.s
    public final void r0(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
        final p1.b bVarL1 = L1(i10, aVar);
        e3(bVarL1, 1035, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.z0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).A(bVarL1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.t
    public final void s(final Exception exc) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1018, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.r0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).o(bVarN1, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.t
    public final void s0(final int i10, final long j10, final long j11) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1012, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.c1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).B(bVarN1, i10, j10, j11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void t(List list) {
        f3.d(this, list);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void u(final boolean z10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 3, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.t0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                n1.l2(bVarH1, z10, (p1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void v(c3 c3Var, c3.g gVar) {
        f3.g(this, c3Var, gVar);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void w(@androidx.annotation.p0 final i2 i2Var, final int i10) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 1, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.v
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).t(bVarH1, i2Var, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public void x(final m2 m2Var) {
        final p1.b bVarH1 = H1();
        e3(bVarH1, 15, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.w0
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).x0(bVarH1, m2Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void y(boolean z10) {
        e3.e(this, z10);
    }

    @Override // com.google.android.exoplayer2.video.y
    public final void z(final String str) {
        final p1.b bVarN1 = N1();
        e3(bVarN1, 1024, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.analytics.d
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((p1) obj).O(bVarN1, str);
            }
        });
    }
}

package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t1 extends d {

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private static final String f49321r1 = "ExoPlayerImpl";
    final com.google.android.exoplayer2.trackselection.x G0;
    final c3.c H0;
    private final m3[] I0;
    private final com.google.android.exoplayer2.trackselection.w J0;
    private final com.google.android.exoplayer2.util.p K0;
    private final x1.f L0;
    private final x1 M0;
    private final com.google.android.exoplayer2.util.t<c3.f> N0;
    private final CopyOnWriteArraySet<t.b> O0;
    private final z3.b P0;
    private final List<a> Q0;
    private final boolean R0;
    private final com.google.android.exoplayer2.source.p0 S0;

    @androidx.annotation.p0
    private final com.google.android.exoplayer2.analytics.n1 T0;
    private final Looper U0;
    private final com.google.android.exoplayer2.upstream.e V0;
    private final long W0;
    private final long X0;
    private final com.google.android.exoplayer2.util.e Y0;
    private int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private boolean f49322a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f49323b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f49324c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private boolean f49325d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f49326e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f49327f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private r3 f49328g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private com.google.android.exoplayer2.source.f1 f49329h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private boolean f49330i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private c3.c f49331j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private m2 f49332k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private m2 f49333l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private m2 f49334m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private z2 f49335n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f49336o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f49337p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private long f49338q1;

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class a implements r2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f49339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private z3 f49340b;

        public a(Object obj, z3 z3Var) {
            this.f49339a = obj;
            this.f49340b = z3Var;
        }

        @Override // com.google.android.exoplayer2.r2
        public z3 a() {
            return this.f49340b;
        }

        @Override // com.google.android.exoplayer2.r2
        public Object getUid() {
            return this.f49339a;
        }
    }

    static {
        y1.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public t1(m3[] m3VarArr, com.google.android.exoplayer2.trackselection.w wVar, com.google.android.exoplayer2.source.p0 p0Var, g2 g2Var, com.google.android.exoplayer2.upstream.e eVar, @androidx.annotation.p0 com.google.android.exoplayer2.analytics.n1 n1Var, boolean z10, r3 r3Var, long j10, long j11, f2 f2Var, long j12, boolean z11, com.google.android.exoplayer2.util.e eVar2, Looper looper, @androidx.annotation.p0 c3 c3Var, c3.c cVar) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = com.google.android.exoplayer2.util.u0.f51540e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb2.append("Init ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append(y1.f52054c);
        sb2.append("] [");
        sb2.append(str);
        sb2.append("]");
        com.google.android.exoplayer2.util.u.h(f49321r1, sb2.toString());
        com.google.android.exoplayer2.util.a.i(m3VarArr.length > 0);
        this.I0 = (m3[]) com.google.android.exoplayer2.util.a.g(m3VarArr);
        this.J0 = (com.google.android.exoplayer2.trackselection.w) com.google.android.exoplayer2.util.a.g(wVar);
        this.S0 = p0Var;
        this.V0 = eVar;
        this.T0 = n1Var;
        this.R0 = z10;
        this.f49328g1 = r3Var;
        this.W0 = j10;
        this.X0 = j11;
        this.f49330i1 = z11;
        this.U0 = looper;
        this.Y0 = eVar2;
        this.Z0 = 0;
        final c3 c3Var2 = c3Var != null ? c3Var : this;
        this.N0 = new com.google.android.exoplayer2.util.t<>(looper, eVar2, new com.google.android.exoplayer2.util.t.b() { // from class: com.google.android.exoplayer2.j1
            @Override // com.google.android.exoplayer2.util.t.b
            public final void a(Object obj, com.google.android.exoplayer2.util.o oVar) {
                t1.e3(c3Var2, (c3.f) obj, oVar);
            }
        });
        this.O0 = new CopyOnWriteArraySet<>();
        this.Q0 = new ArrayList();
        this.f49329h1 = new com.google.android.exoplayer2.source.f1.a(0);
        com.google.android.exoplayer2.trackselection.x xVar = new com.google.android.exoplayer2.trackselection.x(new p3[m3VarArr.length], new com.google.android.exoplayer2.trackselection.j[m3VarArr.length], e4.f44783c, null);
        this.G0 = xVar;
        this.P0 = new z3.b();
        c3.c cVarF = new c3.c.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30).e(29, wVar.e()).b(cVar).f();
        this.H0 = cVarF;
        this.f49331j1 = new c3.c.a().b(cVarF).a(4).a(10).f();
        m2 m2Var = m2.f46588p3;
        this.f49332k1 = m2Var;
        this.f49333l1 = m2Var;
        this.f49334m1 = m2Var;
        this.f49336o1 = -1;
        this.K0 = eVar2.e(looper, null);
        x1.f fVar = new x1.f() { // from class: com.google.android.exoplayer2.k1
            @Override // com.google.android.exoplayer2.x1.f
            public final void a(x1.e eVar3) {
                this.f46513a.g3(eVar3);
            }
        };
        this.L0 = fVar;
        this.f49335n1 = z2.k(xVar);
        if (n1Var != null) {
            n1Var.f3(c3Var2, looper);
            S1(n1Var);
            eVar.e(new Handler(looper), n1Var);
        }
        this.M0 = new x1(m3VarArr, wVar, xVar, g2Var, eVar, this.Z0, this.f49322a1, n1Var, r3Var, f2Var, j12, z11, looper, eVar2, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A3(z2 z2Var, c3.f fVar) {
        fVar.l(d3(z2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B3(z2 z2Var, c3.f fVar) {
        fVar.b(z2Var.f52076n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C3(z2 z2Var, int i10, c3.f fVar) {
        fVar.d(z2Var.f52063a, i10);
    }

    private z2 D3(z2 z2Var, z3 z3Var, @androidx.annotation.p0 Pair<Object, Long> pair) {
        com.google.android.exoplayer2.util.a.a(z3Var.x() || pair != null);
        z3 z3Var2 = z2Var.f52063a;
        z2 z2VarJ = z2Var.j(z3Var);
        if (z3Var.x()) {
            com.google.android.exoplayer2.source.f0.a aVarL = z2.l();
            long jU0 = com.google.android.exoplayer2.util.u0.U0(this.f49338q1);
            z2 z2VarB = z2VarJ.c(aVarL, jU0, jU0, jU0, 0L, com.google.android.exoplayer2.source.p1.f48606e, this.G0, ImmutableList.B()).b(aVarL);
            z2VarB.f52079q = z2VarB.f52081s;
            return z2VarB;
        }
        Object obj = z2VarJ.f52064b.f47719a;
        boolean z10 = !obj.equals(((Pair) com.google.android.exoplayer2.util.u0.k(pair)).first);
        com.google.android.exoplayer2.source.f0.a aVar = z10 ? new com.google.android.exoplayer2.source.f0.a(pair.first) : z2VarJ.f52064b;
        long jLongValue = ((Long) pair.second).longValue();
        long jU1 = com.google.android.exoplayer2.util.u0.U0(Q1());
        if (!z3Var2.x()) {
            jU1 -= z3Var2.m(obj, this.P0).s();
        }
        if (z10 || jLongValue < jU1) {
            com.google.android.exoplayer2.util.a.i(!aVar.c());
            z2 z2VarB2 = z2VarJ.c(aVar, jLongValue, jLongValue, jLongValue, 0L, z10 ? com.google.android.exoplayer2.source.p1.f48606e : z2VarJ.f52070h, z10 ? this.G0 : z2VarJ.f52071i, z10 ? ImmutableList.B() : z2VarJ.f52072j).b(aVar);
            z2VarB2.f52079q = jLongValue;
            return z2VarB2;
        }
        if (jLongValue == jU1) {
            int iG = z3Var.g(z2VarJ.f52073k.f47719a);
            if (iG == -1 || z3Var.k(iG, this.P0).f52095d != z3Var.m(aVar.f47719a, this.P0).f52095d) {
                z3Var.m(aVar.f47719a, this.P0);
                long jF = aVar.c() ? this.P0.f(aVar.f47720b, aVar.f47721c) : this.P0.f52096e;
                z2VarJ = z2VarJ.c(aVar, z2VarJ.f52081s, z2VarJ.f52081s, z2VarJ.f52066d, jF - z2VarJ.f52081s, z2VarJ.f52070h, z2VarJ.f52071i, z2VarJ.f52072j).b(aVar);
                z2VarJ.f52079q = jF;
            }
        } else {
            com.google.android.exoplayer2.util.a.i(!aVar.c());
            long jMax = Math.max(0L, z2VarJ.f52080r - (jLongValue - jU1));
            long j10 = z2VarJ.f52079q;
            if (z2VarJ.f52073k.equals(z2VarJ.f52064b)) {
                j10 = jLongValue + jMax;
            }
            z2VarJ = z2VarJ.c(aVar, jLongValue, jLongValue, jLongValue, jMax, z2VarJ.f52070h, z2VarJ.f52071i, z2VarJ.f52072j);
            z2VarJ.f52079q = j10;
        }
        return z2VarJ;
    }

    private long F3(z3 z3Var, com.google.android.exoplayer2.source.f0.a aVar, long j10) {
        z3Var.m(aVar.f47719a, this.P0);
        return j10 + this.P0.s();
    }

    private z2 H3(int i10, int i11) {
        boolean z10 = false;
        com.google.android.exoplayer2.util.a.a(i10 >= 0 && i11 >= i10 && i11 <= this.Q0.size());
        int iZ1 = Z1();
        z3 z3VarW1 = w1();
        int size = this.Q0.size();
        this.f49323b1++;
        I3(i10, i11);
        z3 z3VarQ2 = Q2();
        z2 z2VarD3 = D3(this.f49335n1, z3VarQ2, X2(z3VarW1, z3VarQ2));
        int i12 = z2VarD3.f52067e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && iZ1 >= z2VarD3.f52063a.w()) {
            z10 = true;
        }
        if (z10) {
            z2VarD3 = z2VarD3.h(4);
        }
        this.M0.r0(i10, i11, this.f49329h1);
        return z2VarD3;
    }

    private void I3(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.Q0.remove(i12);
        }
        this.f49329h1 = this.f49329h1.f(i10, i11);
    }

    private void J3(List<com.google.android.exoplayer2.source.f0> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int iW2 = W2();
        long currentPosition = getCurrentPosition();
        this.f49323b1++;
        if (!this.Q0.isEmpty()) {
            I3(0, this.Q0.size());
        }
        List<t2.c> listO2 = O2(0, list);
        z3 z3VarQ2 = Q2();
        if (!z3VarQ2.x() && i10 >= z3VarQ2.w()) {
            throw new IllegalSeekPositionException(z3VarQ2, i10, j10);
        }
        if (z10) {
            int iF = z3VarQ2.f(this.f49322a1);
            j11 = j.f46377b;
            i11 = iF;
        } else if (i10 == -1) {
            i11 = iW2;
            j11 = currentPosition;
        } else {
            i11 = i10;
            j11 = j10;
        }
        z2 z2VarD3 = D3(this.f49335n1, z3VarQ2, Y2(z3VarQ2, i11, j11));
        int i12 = z2VarD3.f52067e;
        if (i11 != -1 && i12 != 1) {
            i12 = (z3VarQ2.x() || i11 >= z3VarQ2.w()) ? 4 : 2;
        }
        z2 z2VarH = z2VarD3.h(i12);
        this.M0.R0(listO2, i11, com.google.android.exoplayer2.util.u0.U0(j11), this.f49329h1);
        N3(z2VarH, 0, 1, false, (this.f49335n1.f52064b.f47719a.equals(z2VarH.f52064b.f47719a) || this.f49335n1.f52063a.x()) ? false : true, 4, V2(z2VarH), -1);
    }

    private void M3() {
        c3.c cVar = this.f49331j1;
        c3.c cVarL2 = l2(this.H0);
        this.f49331j1 = cVarL2;
        if (cVarL2.equals(cVar)) {
            return;
        }
        this.N0.h(13, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.h1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                this.f46244a.n3((c3.f) obj);
            }
        });
    }

    private void N3(final z2 z2Var, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13) {
        z2 z2Var2 = this.f49335n1;
        this.f49335n1 = z2Var;
        Pair<Boolean, Integer> pairS2 = S2(z2Var, z2Var2, z11, i12, !z2Var2.f52063a.equals(z2Var.f52063a));
        boolean zBooleanValue = ((Boolean) pairS2.first).booleanValue();
        final int iIntValue = ((Integer) pairS2.second).intValue();
        m2 m2VarP2 = this.f49332k1;
        final i2 i2Var = null;
        if (zBooleanValue) {
            if (!z2Var.f52063a.x()) {
                i2Var = z2Var.f52063a.u(z2Var.f52063a.m(z2Var.f52064b.f47719a, this.P0).f52095d, this.F0).f52114d;
            }
            this.f49334m1 = m2.f46588p3;
        }
        if (zBooleanValue || !z2Var2.f52072j.equals(z2Var.f52072j)) {
            this.f49334m1 = this.f49334m1.c().J(z2Var.f52072j).F();
            m2VarP2 = P2();
        }
        boolean z12 = !m2VarP2.equals(this.f49332k1);
        this.f49332k1 = m2VarP2;
        if (!z2Var2.f52063a.equals(z2Var.f52063a)) {
            this.N0.h(0, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.m1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.C3(z2Var, i10, (c3.f) obj);
                }
            });
        }
        if (z11) {
            final c3.l lVarA3 = a3(i12, z2Var2, i13);
            final c3.l lVarZ2 = Z2(j10);
            this.N0.h(11, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.u0
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.o3(i12, lVarA3, lVarZ2, (c3.f) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.N0.h(1, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.v0
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    ((c3.f) obj).w(i2Var, iIntValue);
                }
            });
        }
        if (z2Var2.f52068f != z2Var.f52068f) {
            this.N0.h(10, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.w0
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.q3(z2Var, (c3.f) obj);
                }
            });
            if (z2Var.f52068f != null) {
                this.N0.h(10, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.x0
                    @Override // com.google.android.exoplayer2.util.t.a
                    public final void invoke(Object obj) {
                        t1.r3(z2Var, (c3.f) obj);
                    }
                });
            }
        }
        com.google.android.exoplayer2.trackselection.x xVar = z2Var2.f52071i;
        com.google.android.exoplayer2.trackselection.x xVar2 = z2Var.f52071i;
        if (xVar != xVar2) {
            this.J0.f(xVar2.f50194e);
            final com.google.android.exoplayer2.trackselection.p pVar = new com.google.android.exoplayer2.trackselection.p(z2Var.f52071i.f50192c);
            this.N0.h(2, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.y0
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.s3(z2Var, pVar, (c3.f) obj);
                }
            });
            this.N0.h(2, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.z0
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.t3(z2Var, (c3.f) obj);
                }
            });
        }
        if (z12) {
            final m2 m2Var = this.f49332k1;
            this.N0.h(14, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.a1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    ((c3.f) obj).e(m2Var);
                }
            });
        }
        if (z2Var2.f52069g != z2Var.f52069g) {
            this.N0.h(3, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.b1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.v3(z2Var, (c3.f) obj);
                }
            });
        }
        if (z2Var2.f52067e != z2Var.f52067e || z2Var2.f52074l != z2Var.f52074l) {
            this.N0.h(-1, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.c1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.w3(z2Var, (c3.f) obj);
                }
            });
        }
        if (z2Var2.f52067e != z2Var.f52067e) {
            this.N0.h(4, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.n1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.x3(z2Var, (c3.f) obj);
                }
            });
        }
        if (z2Var2.f52074l != z2Var.f52074l) {
            this.N0.h(5, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.o1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.y3(z2Var, i11, (c3.f) obj);
                }
            });
        }
        if (z2Var2.f52075m != z2Var.f52075m) {
            this.N0.h(6, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.p1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.z3(z2Var, (c3.f) obj);
                }
            });
        }
        if (d3(z2Var2) != d3(z2Var)) {
            this.N0.h(7, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.q1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.A3(z2Var, (c3.f) obj);
                }
            });
        }
        if (!z2Var2.f52076n.equals(z2Var.f52076n)) {
            this.N0.h(12, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.r1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.B3(z2Var, (c3.f) obj);
                }
            });
        }
        if (z10) {
            this.N0.h(-1, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.s1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    ((c3.f) obj).H();
                }
            });
        }
        M3();
        this.N0.e();
        if (z2Var2.f52077o != z2Var.f52077o) {
            Iterator<t.b> it = this.O0.iterator();
            while (it.hasNext()) {
                it.next().U(z2Var.f52077o);
            }
        }
        if (z2Var2.f52078p != z2Var.f52078p) {
            Iterator<t.b> it2 = this.O0.iterator();
            while (it2.hasNext()) {
                it2.next().C(z2Var.f52078p);
            }
        }
    }

    private List<t2.c> O2(int i10, List<com.google.android.exoplayer2.source.f0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            t2.c cVar = new t2.c(list.get(i11), this.R0);
            arrayList.add(cVar);
            this.Q0.add(i11 + i10, new a(cVar.f49361b, cVar.f49360a.d0()));
        }
        this.f49329h1 = this.f49329h1.g(i10, arrayList.size());
        return arrayList;
    }

    private m2 P2() {
        i2 i2VarW0 = W0();
        return i2VarW0 == null ? this.f49334m1 : this.f49334m1.c().H(i2VarW0.f46272f).F();
    }

    private z3 Q2() {
        return new i3(this.Q0, this.f49329h1);
    }

    private List<com.google.android.exoplayer2.source.f0> R2(List<i2> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.S0.g(list.get(i10)));
        }
        return arrayList;
    }

    private Pair<Boolean, Integer> S2(z2 z2Var, z2 z2Var2, boolean z10, int i10, boolean z11) {
        z3 z3Var = z2Var2.f52063a;
        z3 z3Var2 = z2Var.f52063a;
        if (z3Var2.x() && z3Var.x()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (z3Var2.x() != z3Var.x()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (z3Var.u(z3Var.m(z2Var2.f52064b.f47719a, this.P0).f52095d, this.F0).f52112b.equals(z3Var2.u(z3Var2.m(z2Var.f52064b.f47719a, this.P0).f52095d, this.F0).f52112b)) {
            return (z10 && i10 == 0 && z2Var2.f52064b.f47722d < z2Var.f52064b.f47722d) ? new Pair<>(Boolean.TRUE, 0) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private long V2(z2 z2Var) {
        if (z2Var.f52063a.x()) {
            return com.google.android.exoplayer2.util.u0.U0(this.f49338q1);
        }
        return z2Var.f52064b.c() ? z2Var.f52081s : F3(z2Var.f52063a, z2Var.f52064b, z2Var.f52081s);
    }

    private int W2() {
        if (this.f49335n1.f52063a.x()) {
            return this.f49336o1;
        }
        z2 z2Var = this.f49335n1;
        return z2Var.f52063a.m(z2Var.f52064b.f47719a, this.P0).f52095d;
    }

    @androidx.annotation.p0
    private Pair<Object, Long> X2(z3 z3Var, z3 z3Var2) {
        long jQ1 = Q1();
        if (z3Var.x() || z3Var2.x()) {
            boolean z10 = !z3Var.x() && z3Var2.x();
            int iW2 = z10 ? -1 : W2();
            if (z10) {
                jQ1 = -9223372036854775807L;
            }
            return Y2(z3Var2, iW2, jQ1);
        }
        Pair<Object, Long> pairO = z3Var.o(this.F0, this.P0, Z1(), com.google.android.exoplayer2.util.u0.U0(jQ1));
        Object obj = ((Pair) com.google.android.exoplayer2.util.u0.k(pairO)).first;
        if (z3Var2.g(obj) != -1) {
            return pairO;
        }
        Object objC0 = x1.C0(this.F0, this.P0, this.Z0, this.f49322a1, obj, z3Var, z3Var2);
        if (objC0 == null) {
            return Y2(z3Var2, -1, j.f46377b);
        }
        z3Var2.m(objC0, this.P0);
        int i10 = this.P0.f52095d;
        return Y2(z3Var2, i10, z3Var2.u(i10, this.F0).f());
    }

    @androidx.annotation.p0
    private Pair<Object, Long> Y2(z3 z3Var, int i10, long j10) {
        if (z3Var.x()) {
            this.f49336o1 = i10;
            if (j10 == j.f46377b) {
                j10 = 0;
            }
            this.f49338q1 = j10;
            this.f49337p1 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= z3Var.w()) {
            i10 = z3Var.f(this.f49322a1);
            j10 = z3Var.u(i10, this.F0).f();
        }
        return z3Var.o(this.F0, this.P0, i10, com.google.android.exoplayer2.util.u0.U0(j10));
    }

    private c3.l Z2(long j10) {
        int iG;
        i2 i2Var;
        Object obj;
        int iZ1 = Z1();
        Object obj2 = null;
        if (this.f49335n1.f52063a.x()) {
            iG = -1;
            i2Var = null;
            obj = null;
        } else {
            z2 z2Var = this.f49335n1;
            Object obj3 = z2Var.f52064b.f47719a;
            z2Var.f52063a.m(obj3, this.P0);
            iG = this.f49335n1.f52063a.g(obj3);
            obj = obj3;
            obj2 = this.f49335n1.f52063a.u(iZ1, this.F0).f52112b;
            i2Var = this.F0.f52114d;
        }
        long jB1 = com.google.android.exoplayer2.util.u0.B1(j10);
        long jB2 = this.f49335n1.f52064b.c() ? com.google.android.exoplayer2.util.u0.B1(b3(this.f49335n1)) : jB1;
        com.google.android.exoplayer2.source.f0.a aVar = this.f49335n1.f52064b;
        return new c3.l(obj2, iZ1, i2Var, obj, iG, jB1, jB2, aVar.f47720b, aVar.f47721c);
    }

    private c3.l a3(int i10, z2 z2Var, int i11) {
        int i12;
        int iG;
        Object obj;
        i2 i2Var;
        Object obj2;
        long jB3;
        long jB4;
        z3.b bVar = new z3.b();
        if (z2Var.f52063a.x()) {
            i12 = i11;
            iG = -1;
            obj = null;
            i2Var = null;
            obj2 = null;
        } else {
            Object obj3 = z2Var.f52064b.f47719a;
            z2Var.f52063a.m(obj3, bVar);
            int i13 = bVar.f52095d;
            i12 = i13;
            obj2 = obj3;
            iG = z2Var.f52063a.g(obj3);
            obj = z2Var.f52063a.u(i13, this.F0).f52112b;
            i2Var = this.F0.f52114d;
        }
        if (i10 == 0) {
            jB3 = bVar.f52097f + bVar.f52096e;
            if (z2Var.f52064b.c()) {
                com.google.android.exoplayer2.source.f0.a aVar = z2Var.f52064b;
                jB3 = bVar.f(aVar.f47720b, aVar.f47721c);
                jB4 = b3(z2Var);
            } else {
                if (z2Var.f52064b.f47723e != -1 && this.f49335n1.f52064b.c()) {
                    jB3 = b3(this.f49335n1);
                }
                jB4 = jB3;
            }
        } else if (z2Var.f52064b.c()) {
            jB3 = z2Var.f52081s;
            jB4 = b3(z2Var);
        } else {
            jB3 = bVar.f52097f + z2Var.f52081s;
            jB4 = jB3;
        }
        long jB1 = com.google.android.exoplayer2.util.u0.B1(jB3);
        long jB2 = com.google.android.exoplayer2.util.u0.B1(jB4);
        com.google.android.exoplayer2.source.f0.a aVar2 = z2Var.f52064b;
        return new c3.l(obj, i12, i2Var, obj2, iG, jB1, jB2, aVar2.f47720b, aVar2.f47721c);
    }

    private static long b3(z2 z2Var) {
        z3.d dVar = new z3.d();
        z3.b bVar = new z3.b();
        z2Var.f52063a.m(z2Var.f52064b.f47719a, bVar);
        return z2Var.f52065c == j.f46377b ? z2Var.f52063a.u(bVar.f52095d, dVar).g() : bVar.s() + z2Var.f52065c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3, reason: merged with bridge method [inline-methods] */
    public void f3(x1.e eVar) {
        long j10;
        boolean z10;
        long jF3;
        int i10 = this.f49323b1 - eVar.f52025c;
        this.f49323b1 = i10;
        boolean z11 = true;
        if (eVar.f52026d) {
            this.f49324c1 = eVar.f52027e;
            this.f49325d1 = true;
        }
        if (eVar.f52028f) {
            this.f49326e1 = eVar.f52029g;
        }
        if (i10 == 0) {
            z3 z3Var = eVar.f52024b.f52063a;
            if (!this.f49335n1.f52063a.x() && z3Var.x()) {
                this.f49336o1 = -1;
                this.f49338q1 = 0L;
                this.f49337p1 = 0;
            }
            if (!z3Var.x()) {
                List<z3> listN = ((i3) z3Var).N();
                com.google.android.exoplayer2.util.a.i(listN.size() == this.Q0.size());
                for (int i11 = 0; i11 < listN.size(); i11++) {
                    this.Q0.get(i11).f49340b = listN.get(i11);
                }
            }
            if (this.f49325d1) {
                if (eVar.f52024b.f52064b.equals(this.f49335n1.f52064b) && eVar.f52024b.f52066d == this.f49335n1.f52081s) {
                    z11 = false;
                }
                if (z11) {
                    if (z3Var.x() || eVar.f52024b.f52064b.c()) {
                        jF3 = eVar.f52024b.f52066d;
                    } else {
                        z2 z2Var = eVar.f52024b;
                        jF3 = F3(z3Var, z2Var.f52064b, z2Var.f52066d);
                    }
                    j10 = jF3;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.f49325d1 = false;
            N3(eVar.f52024b, 1, this.f49326e1, false, z10, this.f49324c1, j10, -1);
        }
    }

    private static boolean d3(z2 z2Var) {
        return z2Var.f52067e == 3 && z2Var.f52074l && z2Var.f52075m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e3(c3 c3Var, c3.f fVar, com.google.android.exoplayer2.util.o oVar) {
        fVar.v(c3Var, new c3.g(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g3(final x1.e eVar) {
        this.K0.k(new Runnable() { // from class: com.google.android.exoplayer2.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f49319b.f3(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h3(c3.f fVar) {
        fVar.e(this.f49332k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i3(c3.f fVar) {
        fVar.i(ExoPlaybackException.o(new ExoTimeoutException(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j3(c3.f fVar) {
        fVar.x(this.f49333l1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n3(c3.f fVar) {
        fVar.o(this.f49331j1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o3(int i10, c3.l lVar, c3.l lVar2, c3.f fVar) {
        fVar.h0(i10);
        fVar.c(lVar, lVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q3(z2 z2Var, c3.f fVar) {
        fVar.h(z2Var.f52068f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r3(z2 z2Var, c3.f fVar) {
        fVar.i(z2Var.f52068f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s3(z2 z2Var, com.google.android.exoplayer2.trackselection.p pVar, c3.f fVar) {
        fVar.d0(z2Var.f52070h, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t3(z2 z2Var, c3.f fVar) {
        fVar.n(z2Var.f52071i.f50193d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v3(z2 z2Var, c3.f fVar) {
        fVar.y(z2Var.f52069g);
        fVar.u(z2Var.f52069g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w3(z2 z2Var, c3.f fVar) {
        fVar.l0(z2Var.f52074l, z2Var.f52067e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x3(z2 z2Var, c3.f fVar) {
        fVar.p(z2Var.f52067e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y3(z2 z2Var, int i10, c3.f fVar) {
        fVar.k(z2Var.f52074l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z3(z2 z2Var, c3.f fVar) {
        fVar.m(z2Var.f52075m);
    }

    @Override // com.google.android.exoplayer2.c3
    public void A() {
    }

    @Override // com.google.android.exoplayer2.c3
    public int A0() {
        if (O()) {
            return this.f49335n1.f52064b.f47721c;
        }
        return -1;
    }

    public int A1(int i10) {
        return this.I0[i10].d();
    }

    public void B0(List<com.google.android.exoplayer2.source.f0> list) {
        v0(this.Q0.size(), list);
    }

    @Deprecated
    public void B1(com.google.android.exoplayer2.source.f0 f0Var, boolean z10, boolean z11) {
        R0(f0Var, z10);
        prepare();
    }

    public boolean C1() {
        return this.f49330i1;
    }

    @Override // com.google.android.exoplayer2.c3
    public void D0(List<i2> list, int i10, long j10) {
        i0(R2(list), i10, j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void D1(int i10, long j10) {
        z3 z3Var = this.f49335n1.f52063a;
        if (i10 < 0 || (!z3Var.x() && i10 >= z3Var.w())) {
            throw new IllegalSeekPositionException(z3Var, i10, j10);
        }
        this.f49323b1++;
        if (O()) {
            com.google.android.exoplayer2.util.u.m(f49321r1, "seekTo ignored because an ad is playing");
            x1.e eVar = new x1.e(this.f49335n1);
            eVar.b(1);
            this.L0.a(eVar);
            return;
        }
        int i11 = getPlaybackState() != 1 ? 2 : 1;
        int iZ1 = Z1();
        z2 z2VarD3 = D3(this.f49335n1.h(i11), z3Var, Y2(z3Var, i10, j10));
        this.M0.E0(z3Var, i10, com.google.android.exoplayer2.util.u0.U0(j10));
        N3(z2VarD3, 0, 1, true, true, 1, V2(z2VarD3), iZ1);
    }

    @Override // com.google.android.exoplayer2.c3
    public c3.c E1() {
        return this.f49331j1;
    }

    public void E3(Metadata metadata) {
        this.f49334m1 = this.f49334m1.c().I(metadata).F();
        m2 m2VarP2 = P2();
        if (m2VarP2.equals(this.f49332k1)) {
            return;
        }
        this.f49332k1 = m2VarP2;
        this.N0.k(14, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.i1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                this.f46260a.h3((c3.f) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3
    public void F(@androidx.annotation.p0 TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.c3
    public long F0() {
        return this.X0;
    }

    public void G1(@androidx.annotation.p0 r3 r3Var) {
        if (r3Var == null) {
            r3Var = r3.f47347g;
        }
        if (this.f49328g1.equals(r3Var)) {
            return;
        }
        this.f49328g1 = r3Var;
        this.M0.b1(r3Var);
    }

    public void G3(c3.f fVar) {
        this.N0.j(fVar);
    }

    @Deprecated
    public void H() {
        prepare();
    }

    @Override // com.google.android.exoplayer2.c3
    public void I0(final com.google.android.exoplayer2.trackselection.u uVar) {
        if (!this.J0.e() || uVar.equals(this.J0.b())) {
            return;
        }
        this.J0.h(uVar);
        this.N0.h(19, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.g1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                ((c3.f) obj).f0(uVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.video.a0 J() {
        return com.google.android.exoplayer2.video.a0.f51706j;
    }

    @Override // com.google.android.exoplayer2.c3
    public m2 J0() {
        return this.f49333l1;
    }

    @Override // com.google.android.exoplayer2.c3
    public float K() {
        return 1.0f;
    }

    public r3 K0() {
        return this.f49328g1;
    }

    public void K3(boolean z10, int i10, int i11) {
        z2 z2Var = this.f49335n1;
        if (z2Var.f52074l == z10 && z2Var.f52075m == i10) {
            return;
        }
        this.f49323b1++;
        z2 z2VarE = z2Var.e(z10, i10);
        this.M0.V0(z10, i10);
        N3(z2VarE, 0, i11, false, false, 5, j.f46377b, -1);
    }

    @Override // com.google.android.exoplayer2.c3
    public void L() {
    }

    public void L3(boolean z10, @androidx.annotation.p0 ExoPlaybackException exoPlaybackException) {
        z2 z2VarB;
        if (z10) {
            z2VarB = H3(0, this.Q0.size()).f(null);
        } else {
            z2 z2Var = this.f49335n1;
            z2VarB = z2Var.b(z2Var.f52064b);
            z2VarB.f52079q = z2VarB.f52081s;
            z2VarB.f52080r = 0L;
        }
        z2 z2VarH = z2VarB.h(1);
        if (exoPlaybackException != null) {
            z2VarH = z2VarH.f(exoPlaybackException);
        }
        z2 z2Var2 = z2VarH;
        this.f49323b1++;
        this.M0.o1();
        N3(z2Var2, 0, 1, false, z2Var2.f52063a.x() && !this.f49335n1.f52063a.x(), 4, V2(z2Var2), -1);
    }

    @Override // com.google.android.exoplayer2.c3
    public void M(@androidx.annotation.p0 SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.c3
    public void N(int i10) {
    }

    public void N1(t.b bVar) {
        this.O0.remove(bVar);
    }

    public void N2(c3.f fVar) {
        this.N0.c(fVar);
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean O() {
        return this.f49335n1.f52064b.c();
    }

    @Override // com.google.android.exoplayer2.c3
    public long O0() {
        if (this.f49335n1.f52063a.x()) {
            return this.f49338q1;
        }
        z2 z2Var = this.f49335n1;
        if (z2Var.f52073k.f47722d != z2Var.f52064b.f47722d) {
            return z2Var.f52063a.u(Z1(), this.F0).h();
        }
        long j10 = z2Var.f52079q;
        if (this.f49335n1.f52073k.c()) {
            z2 z2Var2 = this.f49335n1;
            z3.b bVarM = z2Var2.f52063a.m(z2Var2.f52073k.f47719a, this.P0);
            long j11 = bVarM.j(this.f49335n1.f52073k.f47720b);
            j10 = j11 == Long.MIN_VALUE ? bVarM.f52096e : j11;
        }
        z2 z2Var3 = this.f49335n1;
        return com.google.android.exoplayer2.util.u0.B1(F3(z2Var3.f52063a, z2Var3.f52073k, j10));
    }

    @Override // com.google.android.exoplayer2.c3
    public void P1(m2 m2Var) {
        com.google.android.exoplayer2.util.a.g(m2Var);
        if (m2Var.equals(this.f49333l1)) {
            return;
        }
        this.f49333l1 = m2Var;
        this.N0.k(15, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.e1
            @Override // com.google.android.exoplayer2.util.t.a
            public final void invoke(Object obj) {
                this.f44776a.j3((c3.f) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c3
    public long Q() {
        return com.google.android.exoplayer2.util.u0.B1(this.f49335n1.f52080r);
    }

    @Override // com.google.android.exoplayer2.c3
    public long Q1() {
        if (!O()) {
            return getCurrentPosition();
        }
        z2 z2Var = this.f49335n1;
        z2Var.f52063a.m(z2Var.f52064b.f47719a, this.P0);
        z2 z2Var2 = this.f49335n1;
        return z2Var2.f52065c == j.f46377b ? z2Var2.f52063a.u(Z1(), this.F0).f() : this.P0.r() + com.google.android.exoplayer2.util.u0.B1(this.f49335n1.f52065c);
    }

    public com.google.android.exoplayer2.util.e R() {
        return this.Y0;
    }

    public void R0(com.google.android.exoplayer2.source.f0 f0Var, boolean z10) {
        p1(Collections.singletonList(f0Var), z10);
    }

    @androidx.annotation.p0
    public com.google.android.exoplayer2.trackselection.w S() {
        return this.J0;
    }

    @Override // com.google.android.exoplayer2.c3
    public void S1(c3.h hVar) {
        N2(hVar);
    }

    public void T(com.google.android.exoplayer2.source.f0 f0Var) {
        k1(Collections.singletonList(f0Var));
    }

    @Override // com.google.android.exoplayer2.c3
    public void T1(int i10, List<i2> list) {
        v0(Math.min(i10, this.Q0.size()), R2(list));
    }

    public void T2(long j10) {
        this.M0.w(j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void U(c3.h hVar) {
        G3(hVar);
    }

    @Override // com.google.android.exoplayer2.c3
    /* JADX INFO: renamed from: U2, reason: merged with bridge method [inline-methods] */
    public ImmutableList<com.google.android.exoplayer2.text.b> C() {
        return ImmutableList.B();
    }

    @Override // com.google.android.exoplayer2.c3
    public void V(List<i2> list, boolean z10) {
        p1(R2(list), z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public long V1() {
        if (!O()) {
            return O0();
        }
        z2 z2Var = this.f49335n1;
        return z2Var.f52073k.equals(z2Var.f52064b) ? com.google.android.exoplayer2.util.u0.B1(this.f49335n1.f52079q) : getDuration();
    }

    public Looper W1() {
        return this.M0.E();
    }

    public void X0(com.google.android.exoplayer2.source.f0 f0Var) {
        B0(Collections.singletonList(f0Var));
    }

    public void X1(com.google.android.exoplayer2.source.f1 f1Var) {
        z3 z3VarQ2 = Q2();
        z2 z2VarD3 = D3(this.f49335n1, z3VarQ2, Y2(z3VarQ2, Z1(), getCurrentPosition()));
        this.f49323b1++;
        this.f49329h1 = f1Var;
        this.M0.f1(f1Var);
        N3(z2VarD3, 0, 1, false, false, 5, j.f46377b, -1);
    }

    @Override // com.google.android.exoplayer2.c3
    public void Y(int i10, int i11) {
        z2 z2VarH3 = H3(i10, Math.min(i11, this.Q0.size()));
        N3(z2VarH3, 0, 1, false, !z2VarH3.f52064b.f47719a.equals(this.f49335n1.f52064b.f47719a), 4, V2(z2VarH3), -1);
    }

    public boolean Y1() {
        return this.f49335n1.f52078p;
    }

    @Override // com.google.android.exoplayer2.c3
    public int Z1() {
        int iW2 = W2();
        if (iW2 == -1) {
            return 0;
        }
        return iW2;
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean a() {
        return this.f49335n1.f52069g;
    }

    @Override // com.google.android.exoplayer2.c3
    @androidx.annotation.p0
    public ExoPlaybackException b() {
        return this.f49335n1.f52068f;
    }

    public void d0(boolean z10) {
        this.M0.x(z10);
    }

    public void d1(boolean z10) {
        if (this.f49327f1 != z10) {
            this.f49327f1 = z10;
            if (this.M0.O0(z10)) {
                return;
            }
            L3(false, ExoPlaybackException.o(new ExoTimeoutException(2), 1003));
        }
    }

    @Override // com.google.android.exoplayer2.c3
    public void e(b3 b3Var) {
        if (b3Var == null) {
            b3Var = b3.f44367e;
        }
        if (this.f49335n1.f52076n.equals(b3Var)) {
            return;
        }
        z2 z2VarG = this.f49335n1.g(b3Var);
        this.f49323b1++;
        this.M0.X0(b3Var);
        N3(z2VarG, 0, 1, false, false, 5, j.f46377b, -1);
    }

    public void e1(int i10, com.google.android.exoplayer2.source.f0 f0Var) {
        v0(i10, Collections.singletonList(f0Var));
    }

    @Override // com.google.android.exoplayer2.c3
    public void e2(int i10, int i11, int i12) {
        com.google.android.exoplayer2.util.a.a(i10 >= 0 && i10 <= i11 && i11 <= this.Q0.size() && i12 >= 0);
        z3 z3VarW1 = w1();
        this.f49323b1++;
        int iMin = Math.min(i12, this.Q0.size() - (i11 - i10));
        com.google.android.exoplayer2.util.u0.T0(this.Q0, i10, i11, iMin);
        z3 z3VarQ2 = Q2();
        z2 z2VarD3 = D3(this.f49335n1, z3VarQ2, X2(z3VarW1, z3VarQ2));
        this.M0.h0(i10, i11, iMin, this.f49329h1);
        N3(z2VarD3, 0, 1, false, false, 5, j.f46377b, -1);
    }

    @Override // com.google.android.exoplayer2.c3
    public int f0() {
        if (O()) {
            return this.f49335n1.f52064b.f47720b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.c3
    public b3 g() {
        return this.f49335n1.f52076n;
    }

    public h3 g2(h3.b bVar) {
        return new h3(this.M0, bVar, this.f49335n1.f52063a, Z1(), this.Y0, this.M0.E());
    }

    @Override // com.google.android.exoplayer2.c3
    public long getCurrentPosition() {
        return com.google.android.exoplayer2.util.u0.B1(V2(this.f49335n1));
    }

    @Override // com.google.android.exoplayer2.c3
    public long getDuration() {
        if (!O()) {
            return w0();
        }
        z2 z2Var = this.f49335n1;
        com.google.android.exoplayer2.source.f0.a aVar = z2Var.f52064b;
        z2Var.f52063a.m(aVar.f47719a, this.P0);
        return com.google.android.exoplayer2.util.u0.B1(this.P0.f(aVar.f47720b, aVar.f47721c));
    }

    @Override // com.google.android.exoplayer2.c3
    public int getPlaybackState() {
        return this.f49335n1.f52067e;
    }

    @Override // com.google.android.exoplayer2.c3
    public int getRepeatMode() {
        return this.Z0;
    }

    public void h0(boolean z10) {
        if (this.f49330i1 == z10) {
            return;
        }
        this.f49330i1 = z10;
        this.M0.T0(z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean h2() {
        return this.f49322a1;
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.audio.f i() {
        return com.google.android.exoplayer2.audio.f.f44114g;
    }

    public void i0(List<com.google.android.exoplayer2.source.f0> list, int i10, long j10) {
        J3(list, i10, j10, false);
    }

    @Override // com.google.android.exoplayer2.c3
    public void j(float f10) {
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.source.p1 j0() {
        return this.f49335n1.f52070h;
    }

    public void j1(t.b bVar) {
        this.O0.add(bVar);
    }

    @Override // com.google.android.exoplayer2.c3
    public m2 j2() {
        return this.f49332k1;
    }

    public void k1(List<com.google.android.exoplayer2.source.f0> list) {
        p1(list, true);
    }

    @Override // com.google.android.exoplayer2.c3
    public long k2() {
        return this.W0;
    }

    @Override // com.google.android.exoplayer2.c3
    public void l(@androidx.annotation.p0 Surface surface) {
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.trackselection.u l0() {
        return this.J0.b();
    }

    @Override // com.google.android.exoplayer2.c3
    public void m(@androidx.annotation.p0 SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.c3
    public void n(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
    }

    public void n0(com.google.android.exoplayer2.source.f0 f0Var, long j10) {
        i0(Collections.singletonList(f0Var), 0, j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void n1(boolean z10) {
        K3(z10, 0, 1);
    }

    @Override // com.google.android.exoplayer2.c3
    public void o(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.c3
    public void p() {
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean p0() {
        return this.f49335n1.f52074l;
    }

    public void p1(List<com.google.android.exoplayer2.source.f0> list, boolean z10) {
        J3(list, -1, j.f46377b, z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void prepare() {
        z2 z2Var = this.f49335n1;
        if (z2Var.f52067e != 1) {
            return;
        }
        z2 z2VarF = z2Var.f(null);
        z2 z2VarH = z2VarF.h(z2VarF.f52063a.x() ? 4 : 2);
        this.f49323b1++;
        this.M0.m0();
        N3(z2VarH, 1, 1, false, false, 5, j.f46377b, -1);
    }

    @Override // com.google.android.exoplayer2.c3
    public void q(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.c3
    public void q0(final boolean z10) {
        if (this.f49322a1 != z10) {
            this.f49322a1 = z10;
            this.M0.d1(z10);
            this.N0.h(9, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.l1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    ((c3.f) obj).f(z10);
                }
            });
            M3();
            this.N0.e();
        }
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public void r0(boolean z10) {
        L3(z10, null);
    }

    @Override // com.google.android.exoplayer2.c3
    public void release() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = com.google.android.exoplayer2.util.u0.f51540e;
        String strB = y1.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(strB).length());
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append(y1.f52054c);
        sb2.append("] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(strB);
        sb2.append("]");
        com.google.android.exoplayer2.util.u.h(f49321r1, sb2.toString());
        if (!this.M0.o0()) {
            this.N0.k(10, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.d1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    t1.i3((c3.f) obj);
                }
            });
        }
        this.N0.i();
        this.K0.f(null);
        com.google.android.exoplayer2.analytics.n1 n1Var = this.T0;
        if (n1Var != null) {
            this.V0.h(n1Var);
        }
        z2 z2VarH = this.f49335n1.h(1);
        this.f49335n1 = z2VarH;
        z2 z2VarB = z2VarH.b(z2VarH.f52064b);
        this.f49335n1 = z2VarB;
        z2VarB.f52079q = z2VarB.f52081s;
        this.f49335n1.f52080r = 0L;
    }

    @Override // com.google.android.exoplayer2.c3
    public int s() {
        return 0;
    }

    public int s0() {
        return this.I0.length;
    }

    @Deprecated
    public void s1(com.google.android.exoplayer2.source.f0 f0Var) {
        T(f0Var);
        prepare();
    }

    @Override // com.google.android.exoplayer2.c3
    public void setRepeatMode(final int i10) {
        if (this.Z0 != i10) {
            this.Z0 = i10;
            this.M0.Z0(i10);
            this.N0.h(8, new com.google.android.exoplayer2.util.t.a() { // from class: com.google.android.exoplayer2.f1
                @Override // com.google.android.exoplayer2.util.t.a
                public final void invoke(Object obj) {
                    ((c3.f) obj).onRepeatModeChanged(i10);
                }
            });
            M3();
            this.N0.e();
        }
    }

    @Override // com.google.android.exoplayer2.c3
    public void stop() {
        r0(false);
    }

    @Override // com.google.android.exoplayer2.c3
    public long u0() {
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.c3
    public int u1() {
        return this.f49335n1.f52075m;
    }

    @Override // com.google.android.exoplayer2.c3
    public void v(@androidx.annotation.p0 TextureView textureView) {
    }

    public void v0(int i10, List<com.google.android.exoplayer2.source.f0> list) {
        com.google.android.exoplayer2.util.a.a(i10 >= 0);
        z3 z3VarW1 = w1();
        this.f49323b1++;
        List<t2.c> listO2 = O2(i10, list);
        z3 z3VarQ2 = Q2();
        z2 z2VarD3 = D3(this.f49335n1, z3VarQ2, X2(z3VarW1, z3VarQ2));
        this.M0.k(i10, listO2, this.f49329h1);
        N3(z2VarD3, 0, 1, false, false, 5, j.f46377b, -1);
    }

    @Override // com.google.android.exoplayer2.c3
    public e4 v1() {
        return this.f49335n1.f52071i.f50193d;
    }

    @Override // com.google.android.exoplayer2.c3
    public p w() {
        return p.f47310g;
    }

    @Override // com.google.android.exoplayer2.c3
    public z3 w1() {
        return this.f49335n1.f52063a;
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean x() {
        return false;
    }

    @Override // com.google.android.exoplayer2.c3
    public int x0() {
        if (this.f49335n1.f52063a.x()) {
            return this.f49337p1;
        }
        z2 z2Var = this.f49335n1;
        return z2Var.f52063a.g(z2Var.f52064b.f47719a);
    }

    @Override // com.google.android.exoplayer2.c3
    public Looper x1() {
        return this.U0;
    }

    @Override // com.google.android.exoplayer2.c3
    public void z(@androidx.annotation.p0 Surface surface) {
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.trackselection.p z1() {
        return new com.google.android.exoplayer2.trackselection.p(this.f49335n1.f52071i.f50192c);
    }
}

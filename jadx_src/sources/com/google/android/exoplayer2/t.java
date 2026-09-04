package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.util.List;

/* JADX INFO: compiled from: ExoPlayer.java */
/* JADX INFO: loaded from: classes7.dex */
public interface t extends c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f49291a = 500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f49292b = 2000;

    /* JADX INFO: compiled from: ExoPlayer.java */
    @Deprecated
    public interface a {
        @Deprecated
        void G(com.google.android.exoplayer2.audio.f fVar, boolean z10);

        @Deprecated
        float K();

        @Deprecated
        boolean d();

        @Deprecated
        void f(int i10);

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        void h(com.google.android.exoplayer2.audio.x xVar);

        @Deprecated
        com.google.android.exoplayer2.audio.f i();

        @Deprecated
        void j(float f10);

        @Deprecated
        void k(boolean z10);

        @Deprecated
        void r();
    }

    /* JADX INFO: compiled from: ExoPlayer.java */
    public interface b {
        void C(boolean z10);

        void U(boolean z10);
    }

    /* JADX INFO: compiled from: ExoPlayer.java */
    public static final class c {
        boolean A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f49293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.google.android.exoplayer2.util.e f49294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f49295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.google.common.base.c0<q3> f49296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.google.common.base.c0<com.google.android.exoplayer2.source.p0> f49297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.common.base.c0<com.google.android.exoplayer2.trackselection.w> f49298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        com.google.common.base.c0<g2> f49299g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        com.google.common.base.c0<com.google.android.exoplayer2.upstream.e> f49300h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        com.google.common.base.c0<com.google.android.exoplayer2.analytics.n1> f49301i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f49302j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        PriorityTaskManager f49303k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        com.google.android.exoplayer2.audio.f f49304l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f49305m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49306n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f49307o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f49308p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f49309q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f49310r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f49311s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        r3 f49312t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        long f49313u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        long f49314v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        f2 f49315w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f49316x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        long f49317y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f49318z;

        public c(final Context context) {
            this(context, (com.google.common.base.c0<q3>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.e0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.A(context);
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.source.p0>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.f0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.B(context);
                }
            });
        }

        public c(final Context context, final q3 q3Var) {
            this(context, (com.google.common.base.c0<q3>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.i0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.J(q3Var);
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.source.p0>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.j0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.K(context);
                }
            });
        }

        public c(Context context, final q3 q3Var, final com.google.android.exoplayer2.source.p0 p0Var) {
            this(context, (com.google.common.base.c0<q3>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.c0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.N(q3Var);
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.source.p0>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.d0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.O(p0Var);
                }
            });
        }

        public c(Context context, final q3 q3Var, final com.google.android.exoplayer2.source.p0 p0Var, final com.google.android.exoplayer2.trackselection.w wVar, final g2 g2Var, final com.google.android.exoplayer2.upstream.e eVar, final com.google.android.exoplayer2.analytics.n1 n1Var) {
            this(context, (com.google.common.base.c0<q3>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.r0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.P(q3Var);
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.source.p0>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.s0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.Q(p0Var);
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.trackselection.w>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.w
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.C(wVar);
                }
            }, (com.google.common.base.c0<g2>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.x
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.D(g2Var);
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.upstream.e>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.y
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.E(eVar);
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.analytics.n1>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.z
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.F(n1Var);
                }
            });
        }

        public c(final Context context, final com.google.android.exoplayer2.source.p0 p0Var) {
            this(context, (com.google.common.base.c0<q3>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.a0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.L(context);
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.source.p0>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.b0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.M(p0Var);
                }
            });
        }

        private c(final Context context, com.google.common.base.c0<q3> c0Var, com.google.common.base.c0<com.google.android.exoplayer2.source.p0> c0Var2) {
            this(context, c0Var, c0Var2, (com.google.common.base.c0<com.google.android.exoplayer2.trackselection.w>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.o0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.G(context);
                }
            }, (com.google.common.base.c0<g2>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.p0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return new l();
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.upstream.e>) new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.q0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return com.google.android.exoplayer2.upstream.u.n(context);
                }
            }, (com.google.common.base.c0<com.google.android.exoplayer2.analytics.n1>) null);
        }

        private c(Context context, com.google.common.base.c0<q3> c0Var, com.google.common.base.c0<com.google.android.exoplayer2.source.p0> c0Var2, com.google.common.base.c0<com.google.android.exoplayer2.trackselection.w> c0Var3, com.google.common.base.c0<g2> c0Var4, com.google.common.base.c0<com.google.android.exoplayer2.upstream.e> c0Var5, @androidx.annotation.p0 com.google.common.base.c0<com.google.android.exoplayer2.analytics.n1> c0Var6) {
            this.f49293a = context;
            this.f49296d = c0Var;
            this.f49297e = c0Var2;
            this.f49298f = c0Var3;
            this.f49299g = c0Var4;
            this.f49300h = c0Var5;
            this.f49301i = c0Var6 == null ? new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.v
                @Override // com.google.common.base.c0
                public final Object get() {
                    return this.f51652b.I();
                }
            } : c0Var6;
            this.f49302j = com.google.android.exoplayer2.util.u0.X();
            this.f49304l = com.google.android.exoplayer2.audio.f.f44114g;
            this.f49306n = 0;
            this.f49309q = 1;
            this.f49310r = 0;
            this.f49311s = true;
            this.f49312t = r3.f47347g;
            this.f49313u = 5000L;
            this.f49314v = 15000L;
            this.f49315w = new k.b().a();
            this.f49294b = com.google.android.exoplayer2.util.e.f51387a;
            this.f49316x = 500L;
            this.f49317y = 2000L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ q3 A(Context context) {
            return new n(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.source.p0 B(Context context) {
            return new com.google.android.exoplayer2.source.l(context, new com.google.android.exoplayer2.extractor.h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.trackselection.w C(com.google.android.exoplayer2.trackselection.w wVar) {
            return wVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ g2 D(g2 g2Var) {
            return g2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.upstream.e E(com.google.android.exoplayer2.upstream.e eVar) {
            return eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.analytics.n1 F(com.google.android.exoplayer2.analytics.n1 n1Var) {
            return n1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.trackselection.w G(Context context) {
            return new com.google.android.exoplayer2.trackselection.f(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ com.google.android.exoplayer2.analytics.n1 I() {
            return new com.google.android.exoplayer2.analytics.n1((com.google.android.exoplayer2.util.e) com.google.android.exoplayer2.util.a.g(this.f49294b));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ q3 J(q3 q3Var) {
            return q3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.source.p0 K(Context context) {
            return new com.google.android.exoplayer2.source.l(context, new com.google.android.exoplayer2.extractor.h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ q3 L(Context context) {
            return new n(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.source.p0 M(com.google.android.exoplayer2.source.p0 p0Var) {
            return p0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ q3 N(q3 q3Var) {
            return q3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.source.p0 O(com.google.android.exoplayer2.source.p0 p0Var) {
            return p0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ q3 P(q3 q3Var) {
            return q3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.source.p0 Q(com.google.android.exoplayer2.source.p0 p0Var) {
            return p0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.analytics.n1 R(com.google.android.exoplayer2.analytics.n1 n1Var) {
            return n1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.upstream.e S(com.google.android.exoplayer2.upstream.e eVar) {
            return eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ g2 T(g2 g2Var) {
            return g2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.source.p0 U(com.google.android.exoplayer2.source.p0 p0Var) {
            return p0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ q3 V(q3 q3Var) {
            return q3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.trackselection.w W(com.google.android.exoplayer2.trackselection.w wVar) {
            return wVar;
        }

        public c X(final com.google.android.exoplayer2.analytics.n1 n1Var) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49301i = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.l0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.R(n1Var);
                }
            };
            return this;
        }

        public c Y(com.google.android.exoplayer2.audio.f fVar, boolean z10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49304l = fVar;
            this.f49305m = z10;
            return this;
        }

        public c Z(final com.google.android.exoplayer2.upstream.e eVar) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49300h = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.m0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.S(eVar);
                }
            };
            return this;
        }

        @androidx.annotation.j1
        public c a0(com.google.android.exoplayer2.util.e eVar) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49294b = eVar;
            return this;
        }

        public c b0(long j10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49317y = j10;
            return this;
        }

        public c c0(boolean z10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49307o = z10;
            return this;
        }

        public c d0(f2 f2Var) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49315w = f2Var;
            return this;
        }

        public c e0(final g2 g2Var) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49299g = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.n0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.T(g2Var);
                }
            };
            return this;
        }

        public c f0(Looper looper) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49302j = looper;
            return this;
        }

        public c g0(final com.google.android.exoplayer2.source.p0 p0Var) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49297e = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.k0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.U(p0Var);
                }
            };
            return this;
        }

        public c h0(boolean z10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49318z = z10;
            return this;
        }

        public c i0(@androidx.annotation.p0 PriorityTaskManager priorityTaskManager) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49303k = priorityTaskManager;
            return this;
        }

        public c j0(long j10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49316x = j10;
            return this;
        }

        public c k0(final q3 q3Var) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49296d = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.h0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.V(q3Var);
                }
            };
            return this;
        }

        public c l0(@androidx.annotation.f0(from = 1) long j10) {
            com.google.android.exoplayer2.util.a.a(j10 > 0);
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49313u = j10;
            return this;
        }

        public c m0(@androidx.annotation.f0(from = 1) long j10) {
            com.google.android.exoplayer2.util.a.a(j10 > 0);
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49314v = j10;
            return this;
        }

        public c n0(r3 r3Var) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49312t = r3Var;
            return this;
        }

        public c o0(boolean z10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49308p = z10;
            return this;
        }

        public c p0(final com.google.android.exoplayer2.trackselection.w wVar) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49298f = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.g0
                @Override // com.google.common.base.c0
                public final Object get() {
                    return t.c.W(wVar);
                }
            };
            return this;
        }

        public c q0(boolean z10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49311s = z10;
            return this;
        }

        public c r0(int i10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49310r = i10;
            return this;
        }

        public c s0(int i10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49309q = i10;
            return this;
        }

        public c t0(int i10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49306n = i10;
            return this;
        }

        public t x() {
            return y();
        }

        s3 y() {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.A = true;
            return new s3(this);
        }

        public c z(long j10) {
            com.google.android.exoplayer2.util.a.i(!this.A);
            this.f49295c = j10;
            return this;
        }
    }

    /* JADX INFO: compiled from: ExoPlayer.java */
    @Deprecated
    public interface d {
        @Deprecated
        void A();

        @Deprecated
        void N(int i10);

        @Deprecated
        void o(boolean z10);

        @Deprecated
        void p();

        @Deprecated
        int s();

        @Deprecated
        p w();

        @Deprecated
        boolean x();
    }

    /* JADX INFO: compiled from: ExoPlayer.java */
    @Deprecated
    public interface e {
        @Deprecated
        List<com.google.android.exoplayer2.text.b> C();
    }

    /* JADX INFO: compiled from: ExoPlayer.java */
    @Deprecated
    public interface f {
        @Deprecated
        int B();

        @Deprecated
        void D(com.google.android.exoplayer2.video.j jVar);

        @Deprecated
        void E(int i10);

        @Deprecated
        void F(@androidx.annotation.p0 TextureView textureView);

        @Deprecated
        void I(com.google.android.exoplayer2.video.spherical.a aVar);

        @Deprecated
        com.google.android.exoplayer2.video.a0 J();

        @Deprecated
        void L();

        @Deprecated
        void M(@androidx.annotation.p0 SurfaceView surfaceView);

        @Deprecated
        void c(int i10);

        @Deprecated
        void l(@androidx.annotation.p0 Surface surface);

        @Deprecated
        void m(@androidx.annotation.p0 SurfaceView surfaceView);

        @Deprecated
        void n(@androidx.annotation.p0 SurfaceHolder surfaceHolder);

        @Deprecated
        void q(@androidx.annotation.p0 SurfaceHolder surfaceHolder);

        @Deprecated
        void t(com.google.android.exoplayer2.video.j jVar);

        @Deprecated
        void u(com.google.android.exoplayer2.video.spherical.a aVar);

        @Deprecated
        void v(@androidx.annotation.p0 TextureView textureView);

        @Deprecated
        int y();

        @Deprecated
        void z(@androidx.annotation.p0 Surface surface);
    }

    int A1(int i10);

    int B();

    void B0(List<com.google.android.exoplayer2.source.f0> list);

    @Deprecated
    void B1(com.google.android.exoplayer2.source.f0 f0Var, boolean z10, boolean z11);

    @androidx.annotation.p0
    @Deprecated
    a C0();

    boolean C1();

    void D(com.google.android.exoplayer2.video.j jVar);

    void E(int i10);

    void G(com.google.android.exoplayer2.audio.f fVar, boolean z10);

    @androidx.annotation.p0
    com.google.android.exoplayer2.decoder.g G0();

    void G1(@androidx.annotation.p0 r3 r3Var);

    @Deprecated
    void H();

    void I(com.google.android.exoplayer2.video.spherical.a aVar);

    void J1(com.google.android.exoplayer2.analytics.p1 p1Var);

    r3 K0();

    @androidx.annotation.p0
    @Deprecated
    d L1();

    com.google.android.exoplayer2.analytics.n1 M0();

    void M1(@androidx.annotation.p0 PriorityTaskManager priorityTaskManager);

    void N0(com.google.android.exoplayer2.analytics.p1 p1Var);

    void N1(b bVar);

    @androidx.annotation.p0
    com.google.android.exoplayer2.decoder.g Q0();

    com.google.android.exoplayer2.util.e R();

    void R0(com.google.android.exoplayer2.source.f0 f0Var, boolean z10);

    @androidx.annotation.p0
    a2 R1();

    @androidx.annotation.p0
    com.google.android.exoplayer2.trackselection.w S();

    void T(com.google.android.exoplayer2.source.f0 f0Var);

    Looper W1();

    @Deprecated
    void X(c3.f fVar);

    void X0(com.google.android.exoplayer2.source.f0 f0Var);

    void X1(com.google.android.exoplayer2.source.f1 f1Var);

    boolean Y1();

    @androidx.annotation.p0
    @Deprecated
    f Z();

    @Override // com.google.android.exoplayer2.c3
    ExoPlaybackException b();

    @Override // com.google.android.exoplayer2.c3
    /* bridge */ /* synthetic */ PlaybackException b();

    void b2(int i10);

    void c(int i10);

    @Deprecated
    void c2(boolean z10);

    boolean d();

    void d0(boolean z10);

    void d1(boolean z10);

    void e1(int i10, com.google.android.exoplayer2.source.f0 f0Var);

    void f(int i10);

    h3 g2(h3.b bVar);

    int getAudioSessionId();

    void h(com.google.android.exoplayer2.audio.x xVar);

    void h0(boolean z10);

    void i0(List<com.google.android.exoplayer2.source.f0> list, int i10, long j10);

    void j1(b bVar);

    void k(boolean z10);

    @Deprecated
    void k0(boolean z10);

    void k1(List<com.google.android.exoplayer2.source.f0> list);

    @androidx.annotation.p0
    @Deprecated
    e m0();

    void n0(com.google.android.exoplayer2.source.f0 f0Var, long j10);

    @androidx.annotation.p0
    a2 o1();

    void p1(List<com.google.android.exoplayer2.source.f0> list, boolean z10);

    void r();

    void r1(boolean z10);

    int s0();

    @Deprecated
    void s1(com.google.android.exoplayer2.source.f0 f0Var);

    void t(com.google.android.exoplayer2.video.j jVar);

    void u(com.google.android.exoplayer2.video.spherical.a aVar);

    void v0(int i10, List<com.google.android.exoplayer2.source.f0> list);

    int y();

    @Deprecated
    void z0(c3.f fVar);
}

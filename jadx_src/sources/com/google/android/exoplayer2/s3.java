package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: SimpleExoPlayer.java */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class s3 extends com.google.android.exoplayer2.d implements t, t.a, t.f, t.e, t.d {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final String f47352x1 = "SimpleExoPlayer";
    protected final m3[] G0;
    private final com.google.android.exoplayer2.util.h H0;
    private final Context I0;
    private final t1 J0;
    private final c K0;
    private final d L0;
    private final CopyOnWriteArraySet<c3.h> M0;
    private final com.google.android.exoplayer2.analytics.n1 N0;
    private final AudioBecomingNoisyManager O0;
    private final com.google.android.exoplayer2.c P0;
    private final StreamVolumeManager Q0;
    private final f4 R0;
    private final g4 S0;
    private final long T0;

    @androidx.annotation.p0
    private a2 U0;

    @androidx.annotation.p0
    private a2 V0;

    @androidx.annotation.p0
    private AudioTrack W0;

    @androidx.annotation.p0
    private Object X0;

    @androidx.annotation.p0
    private Surface Y0;

    @androidx.annotation.p0
    private SurfaceHolder Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @androidx.annotation.p0
    private SphericalGLSurfaceView f47353a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private boolean f47354b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @androidx.annotation.p0
    private TextureView f47355c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f47356d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f47357e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f47358f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f47359g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.decoder.g f47360h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.decoder.g f47361i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f47362j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.f f47363k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private float f47364l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private boolean f47365m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private List<com.google.android.exoplayer2.text.b> f47366n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.video.j f47367o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.video.spherical.a f47368p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private boolean f47369q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private boolean f47370r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    @androidx.annotation.p0
    private PriorityTaskManager f47371s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private boolean f47372t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private boolean f47373u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private p f47374v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private com.google.android.exoplayer2.video.a0 f47375w1;

    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t.c f47376a;

        @Deprecated
        public b(Context context) {
            this.f47376a = new t.c(context);
        }

        @Deprecated
        public b(Context context, com.google.android.exoplayer2.extractor.q qVar) {
            this.f47376a = new t.c(context, new com.google.android.exoplayer2.source.l(context, qVar));
        }

        @Deprecated
        public b(Context context, q3 q3Var) {
            this.f47376a = new t.c(context, q3Var);
        }

        @Deprecated
        public b(Context context, q3 q3Var, com.google.android.exoplayer2.extractor.q qVar) {
            this.f47376a = new t.c(context, q3Var, new com.google.android.exoplayer2.source.l(context, qVar));
        }

        @Deprecated
        public b(Context context, q3 q3Var, com.google.android.exoplayer2.trackselection.w wVar, com.google.android.exoplayer2.source.p0 p0Var, g2 g2Var, com.google.android.exoplayer2.upstream.e eVar, com.google.android.exoplayer2.analytics.n1 n1Var) {
            this.f47376a = new t.c(context, q3Var, p0Var, wVar, g2Var, eVar, n1Var);
        }

        @Deprecated
        public s3 b() {
            return this.f47376a.y();
        }

        @Deprecated
        public b c(long j10) {
            this.f47376a.z(j10);
            return this;
        }

        @Deprecated
        public b d(com.google.android.exoplayer2.analytics.n1 n1Var) {
            this.f47376a.X(n1Var);
            return this;
        }

        @Deprecated
        public b e(com.google.android.exoplayer2.audio.f fVar, boolean z10) {
            this.f47376a.Y(fVar, z10);
            return this;
        }

        @Deprecated
        public b f(com.google.android.exoplayer2.upstream.e eVar) {
            this.f47376a.Z(eVar);
            return this;
        }

        @androidx.annotation.j1
        @Deprecated
        public b g(com.google.android.exoplayer2.util.e eVar) {
            this.f47376a.a0(eVar);
            return this;
        }

        @Deprecated
        public b h(long j10) {
            this.f47376a.b0(j10);
            return this;
        }

        @Deprecated
        public b i(boolean z10) {
            this.f47376a.c0(z10);
            return this;
        }

        @Deprecated
        public b j(f2 f2Var) {
            this.f47376a.d0(f2Var);
            return this;
        }

        @Deprecated
        public b k(g2 g2Var) {
            this.f47376a.e0(g2Var);
            return this;
        }

        @Deprecated
        public b l(Looper looper) {
            this.f47376a.f0(looper);
            return this;
        }

        @Deprecated
        public b m(com.google.android.exoplayer2.source.p0 p0Var) {
            this.f47376a.g0(p0Var);
            return this;
        }

        @Deprecated
        public b n(boolean z10) {
            this.f47376a.h0(z10);
            return this;
        }

        @Deprecated
        public b o(@androidx.annotation.p0 PriorityTaskManager priorityTaskManager) {
            this.f47376a.i0(priorityTaskManager);
            return this;
        }

        @Deprecated
        public b p(long j10) {
            this.f47376a.j0(j10);
            return this;
        }

        @Deprecated
        public b q(@androidx.annotation.f0(from = 1) long j10) {
            this.f47376a.l0(j10);
            return this;
        }

        @Deprecated
        public b r(@androidx.annotation.f0(from = 1) long j10) {
            this.f47376a.m0(j10);
            return this;
        }

        @Deprecated
        public b s(r3 r3Var) {
            this.f47376a.n0(r3Var);
            return this;
        }

        @Deprecated
        public b t(boolean z10) {
            this.f47376a.o0(z10);
            return this;
        }

        @Deprecated
        public b u(com.google.android.exoplayer2.trackselection.w wVar) {
            this.f47376a.p0(wVar);
            return this;
        }

        @Deprecated
        public b v(boolean z10) {
            this.f47376a.q0(z10);
            return this;
        }

        @Deprecated
        public b w(int i10) {
            this.f47376a.r0(i10);
            return this;
        }

        @Deprecated
        public b x(int i10) {
            this.f47376a.s0(i10);
            return this;
        }

        @Deprecated
        public b y(int i10) {
            this.f47376a.t0(i10);
            return this;
        }
    }

    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    public final class c implements com.google.android.exoplayer2.video.y, com.google.android.exoplayer2.audio.t, com.google.android.exoplayer2.text.m, com.google.android.exoplayer2.metadata.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, com.google.android.exoplayer2.c.InterfaceC0372c, AudioBecomingNoisyManager.a, StreamVolumeManager.b, c3.f, t.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.a
        public void A() {
            s3.this.b3(false, -1, 3);
        }

        @Override // com.google.android.exoplayer2.t.b
        public void C(boolean z10) {
            s3.this.c3();
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void D(String str) {
            s3.this.N0.D(str);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void E(String str, long j10, long j11) {
            s3.this.N0.E(str, j10, j11);
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.b
        public void G(int i10) {
            p pVarQ2 = s3.Q2(s3.this.Q0);
            if (pVarQ2.equals(s3.this.f47374v1)) {
                return;
            }
            s3.this.f47374v1 = pVarQ2;
            Iterator it = s3.this.M0.iterator();
            while (it.hasNext()) {
                ((c3.h) it.next()).V(pVarQ2);
            }
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void H() {
            e3.v(this);
        }

        @Override // com.google.android.exoplayer2.video.y
        public void I(int i10, long j10) {
            s3.this.N0.I(i10, j10);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void J(a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.decoder.i iVar) {
            s3.this.V0 = a2Var;
            s3.this.N0.J(a2Var, iVar);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public void L(Surface surface) {
            s3.this.a3(null);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void M(Exception exc) {
            s3.this.N0.M(exc);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public void N(Surface surface) {
            s3.this.a3(surface);
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.b
        public void O(int i10, boolean z10) {
            Iterator it = s3.this.M0.iterator();
            while (it.hasNext()) {
                ((c3.h) it.next()).F(i10, z10);
            }
        }

        @Override // com.google.android.exoplayer2.video.y
        public void P(long j10, int i10) {
            s3.this.N0.P(j10, i10);
        }

        @Override // com.google.android.exoplayer2.c.InterfaceC0372c
        public void Q(float f10) {
            s3.this.X2();
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void R(com.google.android.exoplayer2.decoder.g gVar) {
            s3.this.f47361i1 = gVar;
            s3.this.N0.R(gVar);
        }

        @Override // com.google.android.exoplayer2.video.y
        public void S(String str, long j10, long j11) {
            s3.this.N0.S(str, j10, j11);
        }

        @Override // com.google.android.exoplayer2.c.InterfaceC0372c
        public void T(int i10) {
            boolean zP0 = s3.this.p0();
            s3.this.b3(zP0, i10, s3.R2(zP0, i10));
        }

        @Override // com.google.android.exoplayer2.t.b
        public /* synthetic */ void U(boolean z10) {
            u.a(this, z10);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void Z(a2 a2Var) {
            com.google.android.exoplayer2.video.n.i(this, a2Var);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void a(boolean z10) {
            if (s3.this.f47365m1 == z10) {
                return;
            }
            s3.this.f47365m1 = z10;
            s3.this.U2();
        }

        @Override // com.google.android.exoplayer2.video.y
        public void a0(a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.decoder.i iVar) {
            s3.this.U0 = a2Var;
            s3.this.N0.a0(a2Var, iVar);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void b(b3 b3Var) {
            e3.j(this, b3Var);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void b0(long j10) {
            s3.this.N0.b0(j10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void c(c3.l lVar, c3.l lVar2, int i10) {
            e3.r(this, lVar, lVar2, i10);
        }

        @Override // com.google.android.exoplayer2.video.y
        public void c0(Exception exc) {
            s3.this.N0.c0(exc);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void d(z3 z3Var, int i10) {
            e3.x(this, z3Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void d0(com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar) {
            e3.z(this, p1Var, pVar);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void e(m2 m2Var) {
            e3.h(this, m2Var);
        }

        @Override // com.google.android.exoplayer2.video.y
        public void e0(com.google.android.exoplayer2.decoder.g gVar) {
            s3.this.N0.e0(gVar);
            s3.this.U0 = null;
            s3.this.f47360h1 = null;
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void f(boolean z10) {
            e3.w(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void f0(com.google.android.exoplayer2.trackselection.u uVar) {
            e3.y(this, uVar);
        }

        @Override // com.google.android.exoplayer2.video.y
        public void g(com.google.android.exoplayer2.video.a0 a0Var) {
            s3.this.f47375w1 = a0Var;
            s3.this.N0.g(a0Var);
            Iterator it = s3.this.M0.iterator();
            while (it.hasNext()) {
                ((c3.h) it.next()).g(a0Var);
            }
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void h(PlaybackException playbackException) {
            e3.n(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void h0(int i10) {
            e3.q(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void i(PlaybackException playbackException) {
            e3.m(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void i0(com.google.android.exoplayer2.decoder.g gVar) {
            s3.this.N0.i0(gVar);
            s3.this.V0 = null;
            s3.this.f47361i1 = null;
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void j(long j10) {
            e3.u(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void k(boolean z10, int i10) {
            s3.this.c3();
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void l(boolean z10) {
            e3.d(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void l0(boolean z10, int i10) {
            e3.o(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void m(int i10) {
            e3.l(this, i10);
        }

        @Override // com.google.android.exoplayer2.video.y
        public void m0(Object obj, long j10) {
            s3.this.N0.m0(obj, j10);
            if (s3.this.X0 == obj) {
                Iterator it = s3.this.M0.iterator();
                while (it.hasNext()) {
                    ((c3.h) it.next()).X();
                }
            }
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void n(e4 e4Var) {
            e3.A(this, e4Var);
        }

        @Override // com.google.android.exoplayer2.video.y
        public void n0(com.google.android.exoplayer2.decoder.g gVar) {
            s3.this.f47360h1 = gVar;
            s3.this.N0.n0(gVar);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void o(c3.c cVar) {
            e3.a(this, cVar);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void o0(a2 a2Var) {
            com.google.android.exoplayer2.audio.i.f(this, a2Var);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            e3.s(this, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            s3.this.Z2(surfaceTexture);
            s3.this.T2(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            s3.this.a3(null);
            s3.this.T2(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            s3.this.T2(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void p(int i10) {
            s3.this.c3();
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void p0(long j10) {
            e3.f(this, j10);
        }

        @Override // com.google.android.exoplayer2.metadata.e
        public void q(Metadata metadata) {
            s3.this.N0.q(metadata);
            s3.this.J0.E3(metadata);
            Iterator it = s3.this.M0.iterator();
            while (it.hasNext()) {
                ((c3.h) it.next()).q(metadata);
            }
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void r(long j10) {
            e3.t(this, j10);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void s(Exception exc) {
            s3.this.N0.s(exc);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public void s0(int i10, long j10, long j11) {
            s3.this.N0.s0(i10, j10, j11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            s3.this.T2(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (s3.this.f47354b1) {
                s3.this.a3(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (s3.this.f47354b1) {
                s3.this.a3(null);
            }
            s3.this.T2(0, 0);
        }

        @Override // com.google.android.exoplayer2.text.m
        public void t(List<com.google.android.exoplayer2.text.b> list) {
            s3.this.f47366n1 = list;
            Iterator it = s3.this.M0.iterator();
            while (it.hasNext()) {
                ((c3.h) it.next()).t(list);
            }
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void u(boolean z10) {
            if (s3.this.f47371s1 != null) {
                if (z10 && !s3.this.f47372t1) {
                    s3.this.f47371s1.a(0);
                    s3.this.f47372t1 = true;
                } else {
                    if (z10 || !s3.this.f47372t1) {
                        return;
                    }
                    s3.this.f47371s1.e(0);
                    s3.this.f47372t1 = false;
                }
            }
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void v(c3 c3Var, c3.g gVar) {
            e3.b(this, c3Var, gVar);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void w(i2 i2Var, int i10) {
            e3.g(this, i2Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void x(m2 m2Var) {
            e3.p(this, m2Var);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void y(boolean z10) {
            e3.e(this, z10);
        }

        @Override // com.google.android.exoplayer2.video.y
        public void z(String str) {
            s3.this.N0.z(str);
        }
    }

    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    public static final class d implements com.google.android.exoplayer2.video.j, com.google.android.exoplayer2.video.spherical.a, h3.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f47378f = 7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f47379g = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f47380h = 10000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.video.j f47381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.video.spherical.a f47382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.video.j f47383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.video.spherical.a f47384e;

        private d() {
        }

        @Override // com.google.android.exoplayer2.video.j
        public void a(long j10, long j11, a2 a2Var, @androidx.annotation.p0 MediaFormat mediaFormat) {
            com.google.android.exoplayer2.video.j jVar = this.f47383d;
            if (jVar != null) {
                jVar.a(j10, j11, a2Var, mediaFormat);
            }
            com.google.android.exoplayer2.video.j jVar2 = this.f47381b;
            if (jVar2 != null) {
                jVar2.a(j10, j11, a2Var, mediaFormat);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.a
        public void e(long j10, float[] fArr) {
            com.google.android.exoplayer2.video.spherical.a aVar = this.f47384e;
            if (aVar != null) {
                aVar.e(j10, fArr);
            }
            com.google.android.exoplayer2.video.spherical.a aVar2 = this.f47382c;
            if (aVar2 != null) {
                aVar2.e(j10, fArr);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.a
        public void g() {
            com.google.android.exoplayer2.video.spherical.a aVar = this.f47384e;
            if (aVar != null) {
                aVar.g();
            }
            com.google.android.exoplayer2.video.spherical.a aVar2 = this.f47382c;
            if (aVar2 != null) {
                aVar2.g();
            }
        }

        @Override // com.google.android.exoplayer2.h3.b
        public void h(int i10, @androidx.annotation.p0 Object obj) {
            if (i10 == 7) {
                this.f47381b = (com.google.android.exoplayer2.video.j) obj;
                return;
            }
            if (i10 == 8) {
                this.f47382c = (com.google.android.exoplayer2.video.spherical.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f47383d = null;
                this.f47384e = null;
            } else {
                this.f47383d = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f47384e = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    @Deprecated
    protected s3(Context context, q3 q3Var, com.google.android.exoplayer2.trackselection.w wVar, com.google.android.exoplayer2.source.p0 p0Var, g2 g2Var, com.google.android.exoplayer2.upstream.e eVar, com.google.android.exoplayer2.analytics.n1 n1Var, boolean z10, com.google.android.exoplayer2.util.e eVar2, Looper looper) {
        this(new t.c(context, q3Var, p0Var, wVar, g2Var, eVar, n1Var).q0(z10).a0(eVar2).f0(looper));
    }

    protected s3(b bVar) {
        this(bVar.f47376a);
    }

    s3(t.c cVar) throws Throwable {
        s3 s3Var;
        com.google.android.exoplayer2.util.h hVar = new com.google.android.exoplayer2.util.h();
        this.H0 = hVar;
        try {
            Context applicationContext = cVar.f49293a.getApplicationContext();
            this.I0 = applicationContext;
            com.google.android.exoplayer2.analytics.n1 n1Var = cVar.f49301i.get();
            this.N0 = n1Var;
            this.f47371s1 = cVar.f49303k;
            this.f47363k1 = cVar.f49304l;
            this.f47356d1 = cVar.f49309q;
            this.f47357e1 = cVar.f49310r;
            this.f47365m1 = cVar.f49308p;
            this.T0 = cVar.f49317y;
            c cVar2 = new c();
            this.K0 = cVar2;
            d dVar = new d();
            this.L0 = dVar;
            this.M0 = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(cVar.f49302j);
            m3[] m3VarArrA = cVar.f49296d.get().a(handler, cVar2, cVar2, cVar2, cVar2);
            this.G0 = m3VarArrA;
            this.f47364l1 = 1.0f;
            if (com.google.android.exoplayer2.util.u0.f51536a < 21) {
                this.f47362j1 = S2(0);
            } else {
                this.f47362j1 = com.google.android.exoplayer2.util.u0.K(applicationContext);
            }
            this.f47366n1 = Collections.emptyList();
            this.f47369q1 = true;
            c3.c.a aVar = new c3.c.a();
            int[] iArr = new int[8];
            iArr[0] = 21;
            iArr[1] = 22;
            iArr[2] = 23;
            try {
                iArr[3] = 24;
                iArr[4] = 25;
                iArr[5] = 26;
                iArr[6] = 27;
                iArr[7] = 28;
                t1 t1Var = new t1(m3VarArrA, cVar.f49298f.get(), cVar.f49297e.get(), cVar.f49299g.get(), cVar.f49300h.get(), n1Var, cVar.f49311s, cVar.f49312t, cVar.f49313u, cVar.f49314v, cVar.f49315w, cVar.f49316x, cVar.f49318z, cVar.f49294b, cVar.f49302j, this, aVar.c(iArr).f());
                s3Var = this;
                try {
                    s3Var.J0 = t1Var;
                    t1Var.N2(cVar2);
                    t1Var.j1(cVar2);
                    long j10 = cVar.f49295c;
                    if (j10 > 0) {
                        t1Var.T2(j10);
                    }
                    AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(cVar.f49293a, handler, cVar2);
                    s3Var.O0 = audioBecomingNoisyManager;
                    audioBecomingNoisyManager.b(cVar.f49307o);
                    com.google.android.exoplayer2.c cVar3 = new com.google.android.exoplayer2.c(cVar.f49293a, handler, cVar2);
                    s3Var.P0 = cVar3;
                    cVar3.n(cVar.f49305m ? s3Var.f47363k1 : null);
                    StreamVolumeManager streamVolumeManager = new StreamVolumeManager(cVar.f49293a, handler, cVar2);
                    s3Var.Q0 = streamVolumeManager;
                    streamVolumeManager.m(com.google.android.exoplayer2.util.u0.q0(s3Var.f47363k1.f44122d));
                    f4 f4Var = new f4(cVar.f49293a);
                    s3Var.R0 = f4Var;
                    f4Var.a(cVar.f49306n != 0);
                    g4 g4Var = new g4(cVar.f49293a);
                    s3Var.S0 = g4Var;
                    g4Var.a(cVar.f49306n == 2);
                    s3Var.f47374v1 = Q2(streamVolumeManager);
                    s3Var.f47375w1 = com.google.android.exoplayer2.video.a0.f51706j;
                    s3Var.W2(1, 10, Integer.valueOf(s3Var.f47362j1));
                    s3Var.W2(2, 10, Integer.valueOf(s3Var.f47362j1));
                    s3Var.W2(1, 3, s3Var.f47363k1);
                    s3Var.W2(2, 4, Integer.valueOf(s3Var.f47356d1));
                    s3Var.W2(2, 5, Integer.valueOf(s3Var.f47357e1));
                    s3Var.W2(1, 9, Boolean.valueOf(s3Var.f47365m1));
                    s3Var.W2(2, 7, dVar);
                    s3Var.W2(6, 8, dVar);
                    hVar.f();
                } catch (Throwable th2) {
                    th = th2;
                    s3Var.H0.f();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                s3Var = this;
            }
        } catch (Throwable th4) {
            th = th4;
            s3Var = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p Q2(StreamVolumeManager streamVolumeManager) {
        return new p(0, streamVolumeManager.e(), streamVolumeManager.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int R2(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private int S2(int i10) {
        AudioTrack audioTrack = this.W0;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.W0.release();
            this.W0 = null;
        }
        if (this.W0 == null) {
            this.W0 = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.W0.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2(int i10, int i11) {
        if (i10 == this.f47358f1 && i11 == this.f47359g1) {
            return;
        }
        this.f47358f1 = i10;
        this.f47359g1 = i11;
        this.N0.g0(i10, i11);
        Iterator<c3.h> it = this.M0.iterator();
        while (it.hasNext()) {
            it.next().g0(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2() {
        this.N0.a(this.f47365m1);
        Iterator<c3.h> it = this.M0.iterator();
        while (it.hasNext()) {
            it.next().a(this.f47365m1);
        }
    }

    private void V2() {
        if (this.f47353a1 != null) {
            this.J0.g2(this.L0).u(10000).r(null).n();
            this.f47353a1.i(this.K0);
            this.f47353a1 = null;
        }
        TextureView textureView = this.f47355c1;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.K0) {
                com.google.android.exoplayer2.util.u.m(f47352x1, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f47355c1.setSurfaceTextureListener(null);
            }
            this.f47355c1 = null;
        }
        SurfaceHolder surfaceHolder = this.Z0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.K0);
            this.Z0 = null;
        }
    }

    private void W2(int i10, int i11, @androidx.annotation.p0 Object obj) {
        for (m3 m3Var : this.G0) {
            if (m3Var.d() == i10) {
                this.J0.g2(m3Var).u(i11).r(obj).n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X2() {
        W2(1, 2, Float.valueOf(this.f47364l1 * this.P0.h()));
    }

    private void Y2(SurfaceHolder surfaceHolder) {
        this.f47354b1 = false;
        this.Z0 = surfaceHolder;
        surfaceHolder.addCallback(this.K0);
        Surface surface = this.Z0.getSurface();
        if (surface == null || !surface.isValid()) {
            T2(0, 0);
        } else {
            Rect surfaceFrame = this.Z0.getSurfaceFrame();
            T2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a3(surface);
        this.Y0 = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(@androidx.annotation.p0 Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        m3[] m3VarArr = this.G0;
        int length = m3VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            m3 m3Var = m3VarArr[i10];
            if (m3Var.d() == 2) {
                arrayList.add(this.J0.g2(m3Var).u(1).r(obj).n());
            }
            i10++;
        }
        Object obj2 = this.X0;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((h3) it.next()).b(this.T0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.X0;
            Surface surface = this.Y0;
            if (obj3 == surface) {
                surface.release();
                this.Y0 = null;
            }
        }
        this.X0 = obj;
        if (z10) {
            this.J0.L3(false, ExoPlaybackException.o(new ExoTimeoutException(3), 1003));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.J0.K3(z11, i12, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.R0.b(p0() && !Y1());
                this.S0.b(p0());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.R0.b(false);
        this.S0.b(false);
    }

    private void d3() {
        this.H0.c();
        if (Thread.currentThread() != x1().getThread()) {
            String strH = com.google.android.exoplayer2.util.u0.H("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), x1().getThread().getName());
            if (this.f47369q1) {
                throw new IllegalStateException(strH);
            }
            com.google.android.exoplayer2.util.u.n(f47352x1, strH, this.f47370r1 ? null : new IllegalStateException());
            this.f47370r1 = true;
        }
    }

    @Override // com.google.android.exoplayer2.c3
    public void A() {
        d3();
        this.Q0.c();
    }

    @Override // com.google.android.exoplayer2.c3
    public int A0() {
        d3();
        return this.J0.A0();
    }

    @Override // com.google.android.exoplayer2.t
    public int A1(int i10) {
        d3();
        return this.J0.A1(i10);
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.f
    public int B() {
        return this.f47357e1;
    }

    @Override // com.google.android.exoplayer2.t
    public void B0(List<com.google.android.exoplayer2.source.f0> list) {
        d3();
        this.J0.B0(list);
    }

    @Override // com.google.android.exoplayer2.t
    @Deprecated
    public void B1(com.google.android.exoplayer2.source.f0 f0Var, boolean z10, boolean z11) {
        d3();
        p1(Collections.singletonList(f0Var), z10);
        prepare();
    }

    @Override // com.google.android.exoplayer2.c3
    public List<com.google.android.exoplayer2.text.b> C() {
        d3();
        return this.f47366n1;
    }

    @Override // com.google.android.exoplayer2.t
    @androidx.annotation.p0
    public t.a C0() {
        return this;
    }

    @Override // com.google.android.exoplayer2.t
    public boolean C1() {
        d3();
        return this.J0.C1();
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.f
    public void D(com.google.android.exoplayer2.video.j jVar) {
        d3();
        if (this.f47367o1 != jVar) {
            return;
        }
        this.J0.g2(this.L0).u(7).r(null).n();
    }

    @Override // com.google.android.exoplayer2.c3
    public void D0(List<i2> list, int i10, long j10) {
        d3();
        this.J0.D0(list, i10, j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void D1(int i10, long j10) {
        d3();
        this.N0.a3();
        this.J0.D1(i10, j10);
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.f
    public void E(int i10) {
        d3();
        if (this.f47357e1 == i10) {
            return;
        }
        this.f47357e1 = i10;
        W2(2, 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.exoplayer2.c3
    public c3.c E1() {
        d3();
        return this.J0.E1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void F(@androidx.annotation.p0 TextureView textureView) {
        d3();
        if (textureView == null) {
            L();
            return;
        }
        V2();
        this.f47355c1 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.google.android.exoplayer2.util.u.m(f47352x1, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.K0);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a3(null);
            T2(0, 0);
        } else {
            Z2(surfaceTexture);
            T2(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.c3
    public long F0() {
        d3();
        return this.J0.F0();
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.a
    public void G(com.google.android.exoplayer2.audio.f fVar, boolean z10) {
        d3();
        if (this.f47373u1) {
            return;
        }
        if (!com.google.android.exoplayer2.util.u0.c(this.f47363k1, fVar)) {
            this.f47363k1 = fVar;
            W2(1, 3, fVar);
            this.Q0.m(com.google.android.exoplayer2.util.u0.q0(fVar.f44122d));
            this.N0.K(fVar);
            Iterator<c3.h> it = this.M0.iterator();
            while (it.hasNext()) {
                it.next().K(fVar);
            }
        }
        com.google.android.exoplayer2.c cVar = this.P0;
        if (!z10) {
            fVar = null;
        }
        cVar.n(fVar);
        boolean zP0 = p0();
        int iQ = this.P0.q(zP0, getPlaybackState());
        b3(zP0, iQ, R2(zP0, iQ));
    }

    @Override // com.google.android.exoplayer2.t
    @androidx.annotation.p0
    public com.google.android.exoplayer2.decoder.g G0() {
        return this.f47360h1;
    }

    @Override // com.google.android.exoplayer2.t
    public void G1(@androidx.annotation.p0 r3 r3Var) {
        d3();
        this.J0.G1(r3Var);
    }

    @Override // com.google.android.exoplayer2.t
    @Deprecated
    public void H() {
        d3();
        prepare();
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.f
    public void I(com.google.android.exoplayer2.video.spherical.a aVar) {
        d3();
        this.f47368p1 = aVar;
        this.J0.g2(this.L0).u(8).r(aVar).n();
    }

    @Override // com.google.android.exoplayer2.c3
    public void I0(com.google.android.exoplayer2.trackselection.u uVar) {
        d3();
        this.J0.I0(uVar);
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.video.a0 J() {
        return this.f47375w1;
    }

    @Override // com.google.android.exoplayer2.c3
    public m2 J0() {
        return this.J0.J0();
    }

    @Override // com.google.android.exoplayer2.t
    public void J1(com.google.android.exoplayer2.analytics.p1 p1Var) {
        this.N0.d3(p1Var);
    }

    @Override // com.google.android.exoplayer2.c3
    public float K() {
        return this.f47364l1;
    }

    @Override // com.google.android.exoplayer2.t
    public r3 K0() {
        d3();
        return this.J0.K0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void L() {
        d3();
        V2();
        a3(null);
        T2(0, 0);
    }

    @Override // com.google.android.exoplayer2.t
    @androidx.annotation.p0
    public t.d L1() {
        return this;
    }

    @Override // com.google.android.exoplayer2.c3
    public void M(@androidx.annotation.p0 SurfaceView surfaceView) {
        d3();
        q(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.t
    public com.google.android.exoplayer2.analytics.n1 M0() {
        return this.N0;
    }

    @Override // com.google.android.exoplayer2.t
    public void M1(@androidx.annotation.p0 PriorityTaskManager priorityTaskManager) {
        d3();
        if (com.google.android.exoplayer2.util.u0.c(this.f47371s1, priorityTaskManager)) {
            return;
        }
        if (this.f47372t1) {
            ((PriorityTaskManager) com.google.android.exoplayer2.util.a.g(this.f47371s1)).e(0);
        }
        if (priorityTaskManager == null || !a()) {
            this.f47372t1 = false;
        } else {
            priorityTaskManager.a(0);
            this.f47372t1 = true;
        }
        this.f47371s1 = priorityTaskManager;
    }

    @Override // com.google.android.exoplayer2.c3
    public void N(int i10) {
        d3();
        this.Q0.n(i10);
    }

    @Override // com.google.android.exoplayer2.t
    public void N0(com.google.android.exoplayer2.analytics.p1 p1Var) {
        com.google.android.exoplayer2.util.a.g(p1Var);
        this.N0.G1(p1Var);
    }

    @Override // com.google.android.exoplayer2.t
    public void N1(t.b bVar) {
        this.J0.N1(bVar);
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean O() {
        d3();
        return this.J0.O();
    }

    @Override // com.google.android.exoplayer2.c3
    public long O0() {
        d3();
        return this.J0.O0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void P1(m2 m2Var) {
        this.J0.P1(m2Var);
    }

    @Override // com.google.android.exoplayer2.c3
    public long Q() {
        d3();
        return this.J0.Q();
    }

    @Override // com.google.android.exoplayer2.t
    @androidx.annotation.p0
    public com.google.android.exoplayer2.decoder.g Q0() {
        return this.f47361i1;
    }

    @Override // com.google.android.exoplayer2.c3
    public long Q1() {
        d3();
        return this.J0.Q1();
    }

    @Override // com.google.android.exoplayer2.t
    public com.google.android.exoplayer2.util.e R() {
        return this.J0.R();
    }

    @Override // com.google.android.exoplayer2.t
    public void R0(com.google.android.exoplayer2.source.f0 f0Var, boolean z10) {
        d3();
        this.J0.R0(f0Var, z10);
    }

    @Override // com.google.android.exoplayer2.t
    @androidx.annotation.p0
    public a2 R1() {
        return this.V0;
    }

    @Override // com.google.android.exoplayer2.t
    @androidx.annotation.p0
    public com.google.android.exoplayer2.trackselection.w S() {
        d3();
        return this.J0.S();
    }

    @Override // com.google.android.exoplayer2.c3
    public void S1(c3.h hVar) {
        com.google.android.exoplayer2.util.a.g(hVar);
        this.M0.add(hVar);
        z0(hVar);
    }

    @Override // com.google.android.exoplayer2.t
    public void T(com.google.android.exoplayer2.source.f0 f0Var) {
        d3();
        this.J0.T(f0Var);
    }

    @Override // com.google.android.exoplayer2.c3
    public void T1(int i10, List<i2> list) {
        d3();
        this.J0.T1(i10, list);
    }

    @Override // com.google.android.exoplayer2.c3
    public void U(c3.h hVar) {
        com.google.android.exoplayer2.util.a.g(hVar);
        this.M0.remove(hVar);
        X(hVar);
    }

    @Override // com.google.android.exoplayer2.c3
    public void V(List<i2> list, boolean z10) {
        d3();
        this.J0.V(list, z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public long V1() {
        d3();
        return this.J0.V1();
    }

    @Override // com.google.android.exoplayer2.t
    public Looper W1() {
        return this.J0.W1();
    }

    @Override // com.google.android.exoplayer2.t
    @Deprecated
    public void X(c3.f fVar) {
        this.J0.G3(fVar);
    }

    @Override // com.google.android.exoplayer2.t
    public void X0(com.google.android.exoplayer2.source.f0 f0Var) {
        d3();
        this.J0.X0(f0Var);
    }

    @Override // com.google.android.exoplayer2.t
    public void X1(com.google.android.exoplayer2.source.f1 f1Var) {
        d3();
        this.J0.X1(f1Var);
    }

    @Override // com.google.android.exoplayer2.c3
    public void Y(int i10, int i11) {
        d3();
        this.J0.Y(i10, i11);
    }

    @Override // com.google.android.exoplayer2.t
    public boolean Y1() {
        d3();
        return this.J0.Y1();
    }

    @Override // com.google.android.exoplayer2.t
    @androidx.annotation.p0
    public t.f Z() {
        return this;
    }

    @Override // com.google.android.exoplayer2.c3
    public int Z1() {
        d3();
        return this.J0.Z1();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean a() {
        d3();
        return this.J0.a();
    }

    @Override // com.google.android.exoplayer2.c3
    @androidx.annotation.p0
    public ExoPlaybackException b() {
        d3();
        return this.J0.b();
    }

    @Override // com.google.android.exoplayer2.t
    public void b2(int i10) {
        d3();
        if (i10 == 0) {
            this.R0.a(false);
            this.S0.a(false);
        } else if (i10 == 1) {
            this.R0.a(true);
            this.S0.a(false);
        } else {
            if (i10 != 2) {
                return;
            }
            this.R0.a(true);
            this.S0.a(true);
        }
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.f
    public void c(int i10) {
        d3();
        this.f47356d1 = i10;
        W2(2, 4, Integer.valueOf(i10));
    }

    @Override // com.google.android.exoplayer2.t
    @Deprecated
    public void c2(boolean z10) {
        this.f47369q1 = z10;
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.a
    public boolean d() {
        return this.f47365m1;
    }

    @Override // com.google.android.exoplayer2.t
    public void d0(boolean z10) {
        d3();
        this.J0.d0(z10);
    }

    @Override // com.google.android.exoplayer2.t
    public void d1(boolean z10) {
        d3();
        this.J0.d1(z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void e(b3 b3Var) {
        d3();
        this.J0.e(b3Var);
    }

    @Override // com.google.android.exoplayer2.t
    public void e1(int i10, com.google.android.exoplayer2.source.f0 f0Var) {
        d3();
        this.J0.e1(i10, f0Var);
    }

    @Override // com.google.android.exoplayer2.c3
    public void e2(int i10, int i11, int i12) {
        d3();
        this.J0.e2(i10, i11, i12);
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.a
    public void f(int i10) {
        d3();
        if (this.f47362j1 == i10) {
            return;
        }
        if (i10 == 0) {
            i10 = com.google.android.exoplayer2.util.u0.f51536a < 21 ? S2(0) : com.google.android.exoplayer2.util.u0.K(this.I0);
        } else if (com.google.android.exoplayer2.util.u0.f51536a < 21) {
            S2(i10);
        }
        this.f47362j1 = i10;
        W2(1, 10, Integer.valueOf(i10));
        W2(2, 10, Integer.valueOf(i10));
        this.N0.B(i10);
        Iterator<c3.h> it = this.M0.iterator();
        while (it.hasNext()) {
            it.next().B(i10);
        }
    }

    @Override // com.google.android.exoplayer2.c3
    public int f0() {
        d3();
        return this.J0.f0();
    }

    @Override // com.google.android.exoplayer2.c3
    public b3 g() {
        d3();
        return this.J0.g();
    }

    @Override // com.google.android.exoplayer2.t
    public h3 g2(h3.b bVar) {
        d3();
        return this.J0.g2(bVar);
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.a
    public int getAudioSessionId() {
        return this.f47362j1;
    }

    @Override // com.google.android.exoplayer2.c3
    public long getCurrentPosition() {
        d3();
        return this.J0.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.c3
    public long getDuration() {
        d3();
        return this.J0.getDuration();
    }

    @Override // com.google.android.exoplayer2.c3
    public int getPlaybackState() {
        d3();
        return this.J0.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.c3
    public int getRepeatMode() {
        d3();
        return this.J0.getRepeatMode();
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.a
    public void h(com.google.android.exoplayer2.audio.x xVar) {
        d3();
        W2(1, 6, xVar);
    }

    @Override // com.google.android.exoplayer2.t
    public void h0(boolean z10) {
        d3();
        this.J0.h0(z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean h2() {
        d3();
        return this.J0.h2();
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.audio.f i() {
        return this.f47363k1;
    }

    @Override // com.google.android.exoplayer2.t
    public void i0(List<com.google.android.exoplayer2.source.f0> list, int i10, long j10) {
        d3();
        this.J0.i0(list, i10, j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void j(float f10) {
        d3();
        float fR = com.google.android.exoplayer2.util.u0.r(f10, 0.0f, 1.0f);
        if (this.f47364l1 == fR) {
            return;
        }
        this.f47364l1 = fR;
        X2();
        this.N0.k0(fR);
        Iterator<c3.h> it = this.M0.iterator();
        while (it.hasNext()) {
            it.next().k0(fR);
        }
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.source.p1 j0() {
        d3();
        return this.J0.j0();
    }

    @Override // com.google.android.exoplayer2.t
    public void j1(t.b bVar) {
        this.J0.j1(bVar);
    }

    @Override // com.google.android.exoplayer2.c3
    public m2 j2() {
        return this.J0.j2();
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.a
    public void k(boolean z10) {
        d3();
        if (this.f47365m1 == z10) {
            return;
        }
        this.f47365m1 = z10;
        W2(1, 9, Boolean.valueOf(z10));
        U2();
    }

    @Override // com.google.android.exoplayer2.t
    @Deprecated
    public void k0(boolean z10) {
        b2(z10 ? 1 : 0);
    }

    @Override // com.google.android.exoplayer2.t
    public void k1(List<com.google.android.exoplayer2.source.f0> list) {
        d3();
        this.J0.k1(list);
    }

    @Override // com.google.android.exoplayer2.c3
    public long k2() {
        d3();
        return this.J0.k2();
    }

    @Override // com.google.android.exoplayer2.c3
    public void l(@androidx.annotation.p0 Surface surface) {
        d3();
        V2();
        a3(surface);
        int i10 = surface == null ? 0 : -1;
        T2(i10, i10);
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.trackselection.u l0() {
        d3();
        return this.J0.l0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void m(@androidx.annotation.p0 SurfaceView surfaceView) {
        d3();
        if (surfaceView instanceof com.google.android.exoplayer2.video.i) {
            V2();
            a3(surfaceView);
            Y2(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                n(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            V2();
            this.f47353a1 = (SphericalGLSurfaceView) surfaceView;
            this.J0.g2(this.L0).u(10000).r(this.f47353a1).n();
            this.f47353a1.d(this.K0);
            a3(this.f47353a1.getVideoSurface());
            Y2(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.t
    @androidx.annotation.p0
    public t.e m0() {
        return this;
    }

    @Override // com.google.android.exoplayer2.c3
    public void n(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        d3();
        if (surfaceHolder == null) {
            L();
            return;
        }
        V2();
        this.f47354b1 = true;
        this.Z0 = surfaceHolder;
        surfaceHolder.addCallback(this.K0);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            a3(null);
            T2(0, 0);
        } else {
            a3(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            T2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.t
    public void n0(com.google.android.exoplayer2.source.f0 f0Var, long j10) {
        d3();
        this.J0.n0(f0Var, j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void n1(boolean z10) {
        d3();
        int iQ = this.P0.q(z10, getPlaybackState());
        b3(z10, iQ, R2(z10, iQ));
    }

    @Override // com.google.android.exoplayer2.c3
    public void o(boolean z10) {
        d3();
        this.Q0.l(z10);
    }

    @Override // com.google.android.exoplayer2.t
    @androidx.annotation.p0
    public a2 o1() {
        return this.U0;
    }

    @Override // com.google.android.exoplayer2.c3
    public void p() {
        d3();
        this.Q0.i();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean p0() {
        d3();
        return this.J0.p0();
    }

    @Override // com.google.android.exoplayer2.t
    public void p1(List<com.google.android.exoplayer2.source.f0> list, boolean z10) {
        d3();
        this.J0.p1(list, z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void prepare() {
        d3();
        boolean zP0 = p0();
        int iQ = this.P0.q(zP0, 2);
        b3(zP0, iQ, R2(zP0, iQ));
        this.J0.prepare();
    }

    @Override // com.google.android.exoplayer2.c3
    public void q(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        d3();
        if (surfaceHolder == null || surfaceHolder != this.Z0) {
            return;
        }
        L();
    }

    @Override // com.google.android.exoplayer2.c3
    public void q0(boolean z10) {
        d3();
        this.J0.q0(z10);
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.a
    public void r() {
        h(new com.google.android.exoplayer2.audio.x(0, 0.0f));
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public void r0(boolean z10) {
        d3();
        this.P0.q(p0(), 1);
        this.J0.r0(z10);
        this.f47366n1 = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.t
    public void r1(boolean z10) {
        d3();
        if (this.f47373u1) {
            return;
        }
        this.O0.b(z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void release() {
        AudioTrack audioTrack;
        d3();
        if (com.google.android.exoplayer2.util.u0.f51536a < 21 && (audioTrack = this.W0) != null) {
            audioTrack.release();
            this.W0 = null;
        }
        this.O0.b(false);
        this.Q0.k();
        this.R0.b(false);
        this.S0.b(false);
        this.P0.j();
        this.J0.release();
        this.N0.b3();
        V2();
        Surface surface = this.Y0;
        if (surface != null) {
            surface.release();
            this.Y0 = null;
        }
        if (this.f47372t1) {
            ((PriorityTaskManager) com.google.android.exoplayer2.util.a.g(this.f47371s1)).e(0);
            this.f47372t1 = false;
        }
        this.f47366n1 = Collections.emptyList();
        this.f47373u1 = true;
    }

    @Override // com.google.android.exoplayer2.c3
    public int s() {
        d3();
        return this.Q0.g();
    }

    @Override // com.google.android.exoplayer2.t
    public int s0() {
        d3();
        return this.J0.s0();
    }

    @Override // com.google.android.exoplayer2.t
    @Deprecated
    public void s1(com.google.android.exoplayer2.source.f0 f0Var) {
        B1(f0Var, true, true);
    }

    @Override // com.google.android.exoplayer2.c3
    public void setRepeatMode(int i10) {
        d3();
        this.J0.setRepeatMode(i10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void stop() {
        r0(false);
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.f
    public void t(com.google.android.exoplayer2.video.j jVar) {
        d3();
        this.f47367o1 = jVar;
        this.J0.g2(this.L0).u(7).r(jVar).n();
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.f
    public void u(com.google.android.exoplayer2.video.spherical.a aVar) {
        d3();
        if (this.f47368p1 != aVar) {
            return;
        }
        this.J0.g2(this.L0).u(8).r(null).n();
    }

    @Override // com.google.android.exoplayer2.c3
    public long u0() {
        d3();
        return this.J0.u0();
    }

    @Override // com.google.android.exoplayer2.c3
    public int u1() {
        d3();
        return this.J0.u1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void v(@androidx.annotation.p0 TextureView textureView) {
        d3();
        if (textureView == null || textureView != this.f47355c1) {
            return;
        }
        L();
    }

    @Override // com.google.android.exoplayer2.t
    public void v0(int i10, List<com.google.android.exoplayer2.source.f0> list) {
        d3();
        this.J0.v0(i10, list);
    }

    @Override // com.google.android.exoplayer2.c3
    public e4 v1() {
        d3();
        return this.J0.v1();
    }

    @Override // com.google.android.exoplayer2.c3
    public p w() {
        d3();
        return this.f47374v1;
    }

    @Override // com.google.android.exoplayer2.c3
    public z3 w1() {
        d3();
        return this.J0.w1();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean x() {
        d3();
        return this.Q0.j();
    }

    @Override // com.google.android.exoplayer2.c3
    public int x0() {
        d3();
        return this.J0.x0();
    }

    @Override // com.google.android.exoplayer2.c3
    public Looper x1() {
        return this.J0.x1();
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.t.f
    public int y() {
        return this.f47356d1;
    }

    @Override // com.google.android.exoplayer2.c3
    public void z(@androidx.annotation.p0 Surface surface) {
        d3();
        if (surface == null || surface != this.X0) {
            return;
        }
        L();
    }

    @Override // com.google.android.exoplayer2.t
    @Deprecated
    public void z0(c3.f fVar) {
        com.google.android.exoplayer2.util.a.g(fVar);
        this.J0.N2(fVar);
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.trackselection.p z1() {
        d3();
        return this.J0.z1();
    }
}

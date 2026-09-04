package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* JADX INFO: compiled from: ForwardingPlayer.java */
/* JADX INFO: loaded from: classes7.dex */
public class c2 implements c3 {
    private final c3 F0;

    /* JADX INFO: compiled from: ForwardingPlayer.java */
    public static class b implements c3.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c2 f44397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c3.f f44398c;

        private b(c2 c2Var, c3.f fVar) {
            this.f44397b = c2Var;
            this.f44398c = fVar;
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void H() {
            this.f44398c.H();
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void b(b3 b3Var) {
            this.f44398c.b(b3Var);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void c(c3.l lVar, c3.l lVar2, int i10) {
            this.f44398c.c(lVar, lVar2, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void d(z3 z3Var, int i10) {
            this.f44398c.d(z3Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void d0(com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar) {
            this.f44398c.d0(p1Var, pVar);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void e(m2 m2Var) {
            this.f44398c.e(m2Var);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f44397b.equals(bVar.f44397b)) {
                return this.f44398c.equals(bVar.f44398c);
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void f(boolean z10) {
            this.f44398c.f(z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void f0(com.google.android.exoplayer2.trackselection.u uVar) {
            this.f44398c.f0(uVar);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void h(@androidx.annotation.p0 PlaybackException playbackException) {
            this.f44398c.h(playbackException);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void h0(int i10) {
            this.f44398c.h0(i10);
        }

        public int hashCode() {
            return (this.f44397b.hashCode() * 31) + this.f44398c.hashCode();
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void i(PlaybackException playbackException) {
            this.f44398c.i(playbackException);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void j(long j10) {
            this.f44398c.j(j10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void k(boolean z10, int i10) {
            this.f44398c.k(z10, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void l(boolean z10) {
            this.f44398c.l(z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void l0(boolean z10, int i10) {
            this.f44398c.l0(z10, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void m(int i10) {
            this.f44398c.m(i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void n(e4 e4Var) {
            this.f44398c.n(e4Var);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void o(c3.c cVar) {
            this.f44398c.o(cVar);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void onRepeatModeChanged(int i10) {
            this.f44398c.onRepeatModeChanged(i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void p(int i10) {
            this.f44398c.p(i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void p0(long j10) {
            this.f44398c.p0(j10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void r(long j10) {
            this.f44398c.r(j10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void u(boolean z10) {
            this.f44398c.u(z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void v(c3 c3Var, c3.g gVar) {
            this.f44398c.v(this.f44397b, gVar);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void w(@androidx.annotation.p0 i2 i2Var, int i10) {
            this.f44398c.w(i2Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void x(m2 m2Var) {
            this.f44398c.x(m2Var);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public void y(boolean z10) {
            this.f44398c.u(z10);
        }
    }

    /* JADX INFO: compiled from: ForwardingPlayer.java */
    public static final class c extends b implements c3.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c3.h f44399d;

        public c(c2 c2Var, c3.h hVar) {
            super(hVar);
            this.f44399d = hVar;
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void B(int i10) {
            this.f44399d.B(i10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void F(int i10, boolean z10) {
            this.f44399d.F(i10, z10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void K(com.google.android.exoplayer2.audio.f fVar) {
            this.f44399d.K(fVar);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void V(p pVar) {
            this.f44399d.V(pVar);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void X() {
            this.f44399d.X();
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.audio.t
        public void a(boolean z10) {
            this.f44399d.a(z10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.video.y
        public void g(com.google.android.exoplayer2.video.a0 a0Var) {
            this.f44399d.g(a0Var);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void g0(int i10, int i11) {
            this.f44399d.g0(i10, i11);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void k0(float f10) {
            this.f44399d.k0(f10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void q(Metadata metadata) {
            this.f44399d.q(metadata);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public void t(List<com.google.android.exoplayer2.text.b> list) {
            this.f44399d.t(list);
        }
    }

    public c2(c3 c3Var) {
        this.F0 = c3Var;
    }

    @Override // com.google.android.exoplayer2.c3
    public void A() {
        this.F0.A();
    }

    @Override // com.google.android.exoplayer2.c3
    public int A0() {
        return this.F0.A0();
    }

    @Override // com.google.android.exoplayer2.c3
    public List<com.google.android.exoplayer2.text.b> C() {
        return this.F0.C();
    }

    @Override // com.google.android.exoplayer2.c3
    public void D0(List<i2> list, int i10, long j10) {
        this.F0.D0(list, i10, j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void D1(int i10, long j10) {
        this.F0.D1(i10, j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void E0(int i10) {
        this.F0.E0(i10);
    }

    @Override // com.google.android.exoplayer2.c3
    public c3.c E1() {
        return this.F0.E1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void F(@androidx.annotation.p0 TextureView textureView) {
        this.F0.F(textureView);
    }

    @Override // com.google.android.exoplayer2.c3
    public long F0() {
        return this.F0.F0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void F1(i2 i2Var) {
        this.F0.F1(i2Var);
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean H0() {
        return this.F0.H0();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean H1() {
        return this.F0.H1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void I0(com.google.android.exoplayer2.trackselection.u uVar) {
        this.F0.I0(uVar);
    }

    @Override // com.google.android.exoplayer2.c3
    public void I1(i2 i2Var, long j10) {
        this.F0.I1(i2Var, j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.video.a0 J() {
        return this.F0.J();
    }

    @Override // com.google.android.exoplayer2.c3
    public m2 J0() {
        return this.F0.J0();
    }

    @Override // com.google.android.exoplayer2.c3
    public float K() {
        return this.F0.K();
    }

    @Override // com.google.android.exoplayer2.c3
    public void K1(i2 i2Var, boolean z10) {
        this.F0.K1(i2Var, z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void L() {
        this.F0.L();
    }

    @Override // com.google.android.exoplayer2.c3
    public void L0(int i10, int i11) {
        this.F0.L0(i10, i11);
    }

    @Override // com.google.android.exoplayer2.c3
    public void M(@androidx.annotation.p0 SurfaceView surfaceView) {
        this.F0.M(surfaceView);
    }

    @Override // com.google.android.exoplayer2.c3
    public void N(int i10) {
        this.F0.N(i10);
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean O() {
        return this.F0.O();
    }

    @Override // com.google.android.exoplayer2.c3
    public long O0() {
        return this.F0.O0();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public boolean O1() {
        return this.F0.O1();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public boolean P() {
        return this.F0.P();
    }

    @Override // com.google.android.exoplayer2.c3
    public void P0() {
        this.F0.P0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void P1(m2 m2Var) {
        this.F0.P1(m2Var);
    }

    @Override // com.google.android.exoplayer2.c3
    public long Q() {
        return this.F0.Q();
    }

    @Override // com.google.android.exoplayer2.c3
    public long Q1() {
        return this.F0.Q1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void S0(int i10, i2 i2Var) {
        this.F0.S0(i10, i2Var);
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public void S1(c3.h hVar) {
        this.F0.S1(new c(this, hVar));
    }

    @Override // com.google.android.exoplayer2.c3
    public void T0(List<i2> list) {
        this.F0.T0(list);
    }

    @Override // com.google.android.exoplayer2.c3
    public void T1(int i10, List<i2> list) {
        this.F0.T1(i10, list);
    }

    @Override // com.google.android.exoplayer2.c3
    public void U(c3.h hVar) {
        this.F0.U(new c(this, hVar));
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean U0() {
        return this.F0.U0();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public int U1() {
        return this.F0.U1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void V(List<i2> list, boolean z10) {
        this.F0.V(list, z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void V0() {
        this.F0.V0();
    }

    @Override // com.google.android.exoplayer2.c3
    public long V1() {
        return this.F0.V1();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean W() {
        return this.F0.W();
    }

    @Override // com.google.android.exoplayer2.c3
    @androidx.annotation.p0
    public i2 W0() {
        return this.F0.W0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void Y(int i10, int i11) {
        this.F0.Y(i10, i11);
    }

    @Override // com.google.android.exoplayer2.c3
    public int Y0() {
        return this.F0.Y0();
    }

    @Override // com.google.android.exoplayer2.c3
    public int Z0() {
        return this.F0.Z0();
    }

    @Override // com.google.android.exoplayer2.c3
    public int Z1() {
        return this.F0.Z1();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean a() {
        return this.F0.a();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public void a0() {
        this.F0.a0();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public boolean a1() {
        return this.F0.a1();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public int a2() {
        return this.F0.a2();
    }

    @Override // com.google.android.exoplayer2.c3
    @androidx.annotation.p0
    public PlaybackException b() {
        return this.F0.b();
    }

    @Override // com.google.android.exoplayer2.c3
    @androidx.annotation.p0
    public Object b0() {
        return this.F0.b0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void b1() {
        this.F0.b1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void c0() {
        this.F0.c0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void c1() {
        this.F0.c1();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public boolean d2() {
        return this.F0.d2();
    }

    @Override // com.google.android.exoplayer2.c3
    public void e(b3 b3Var) {
        this.F0.e(b3Var);
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean e0() {
        return this.F0.e0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void e2(int i10, int i11, int i12) {
        this.F0.e2(i10, i11, i12);
    }

    @Override // com.google.android.exoplayer2.c3
    public int f0() {
        return this.F0.f0();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public void f1() {
        this.F0.f1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void f2(List<i2> list) {
        this.F0.f2(list);
    }

    @Override // com.google.android.exoplayer2.c3
    public b3 g() {
        return this.F0.g();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean g0(int i10) {
        return this.F0.g0(i10);
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public boolean g1() {
        return this.F0.g1();
    }

    @Override // com.google.android.exoplayer2.c3
    public long getCurrentPosition() {
        return this.F0.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.c3
    public long getDuration() {
        return this.F0.getDuration();
    }

    @Override // com.google.android.exoplayer2.c3
    public int getPlaybackState() {
        return this.F0.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.c3
    public int getRepeatMode() {
        return this.F0.getRepeatMode();
    }

    @Override // com.google.android.exoplayer2.c3
    public void h1(int i10) {
        this.F0.h1(i10);
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean h2() {
        return this.F0.h2();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public boolean hasNext() {
        return this.F0.hasNext();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public boolean hasPrevious() {
        return this.F0.hasPrevious();
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.audio.f i() {
        return this.F0.i();
    }

    @Override // com.google.android.exoplayer2.c3
    public int i1() {
        return this.F0.i1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void i2() {
        this.F0.i2();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean isPlaying() {
        return this.F0.isPlaying();
    }

    @Override // com.google.android.exoplayer2.c3
    public void j(float f10) {
        this.F0.j(f10);
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.source.p1 j0() {
        return this.F0.j0();
    }

    @Override // com.google.android.exoplayer2.c3
    public m2 j2() {
        return this.F0.j2();
    }

    @Override // com.google.android.exoplayer2.c3
    public long k2() {
        return this.F0.k2();
    }

    @Override // com.google.android.exoplayer2.c3
    public void l(@androidx.annotation.p0 Surface surface) {
        this.F0.l(surface);
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.trackselection.u l0() {
        return this.F0.l0();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public int l1() {
        return this.F0.l1();
    }

    public c3 l2() {
        return this.F0;
    }

    @Override // com.google.android.exoplayer2.c3
    public void m(@androidx.annotation.p0 SurfaceView surfaceView) {
        this.F0.m(surfaceView);
    }

    @Override // com.google.android.exoplayer2.c3
    public void m1() {
        this.F0.m1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void n(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        this.F0.n(surfaceHolder);
    }

    @Override // com.google.android.exoplayer2.c3
    public void n1(boolean z10) {
        this.F0.n1(z10);
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public void next() {
        this.F0.next();
    }

    @Override // com.google.android.exoplayer2.c3
    public void o(boolean z10) {
        this.F0.o(z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public long o0() {
        return this.F0.o0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void p() {
        this.F0.p();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean p0() {
        return this.F0.p0();
    }

    @Override // com.google.android.exoplayer2.c3
    public void pause() {
        this.F0.pause();
    }

    @Override // com.google.android.exoplayer2.c3
    public void play() {
        this.F0.play();
    }

    @Override // com.google.android.exoplayer2.c3
    public void prepare() {
        this.F0.prepare();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public void previous() {
        this.F0.previous();
    }

    @Override // com.google.android.exoplayer2.c3
    public void q(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        this.F0.q(surfaceHolder);
    }

    @Override // com.google.android.exoplayer2.c3
    public void q0(boolean z10) {
        this.F0.q0(z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public int q1() {
        return this.F0.q1();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public void r0(boolean z10) {
        this.F0.r0(z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void release() {
        this.F0.release();
    }

    @Override // com.google.android.exoplayer2.c3
    public int s() {
        return this.F0.s();
    }

    @Override // com.google.android.exoplayer2.c3
    public void seekTo(long j10) {
        this.F0.seekTo(j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void setPlaybackSpeed(float f10) {
        this.F0.setPlaybackSpeed(f10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void setRepeatMode(int i10) {
        this.F0.setRepeatMode(i10);
    }

    @Override // com.google.android.exoplayer2.c3
    public void stop() {
        this.F0.stop();
    }

    @Override // com.google.android.exoplayer2.c3
    public i2 t0(int i10) {
        return this.F0.t0(i10);
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean t1() {
        return this.F0.t1();
    }

    @Override // com.google.android.exoplayer2.c3
    public long u0() {
        return this.F0.u0();
    }

    @Override // com.google.android.exoplayer2.c3
    public int u1() {
        return this.F0.u1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void v(@androidx.annotation.p0 TextureView textureView) {
        this.F0.v(textureView);
    }

    @Override // com.google.android.exoplayer2.c3
    public e4 v1() {
        return this.F0.v1();
    }

    @Override // com.google.android.exoplayer2.c3
    public p w() {
        return this.F0.w();
    }

    @Override // com.google.android.exoplayer2.c3
    public long w0() {
        return this.F0.w0();
    }

    @Override // com.google.android.exoplayer2.c3
    public z3 w1() {
        return this.F0.w1();
    }

    @Override // com.google.android.exoplayer2.c3
    public boolean x() {
        return this.F0.x();
    }

    @Override // com.google.android.exoplayer2.c3
    public int x0() {
        return this.F0.x0();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public Looper x1() {
        return this.F0.x1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void y0(i2 i2Var) {
        this.F0.y0(i2Var);
    }

    @Override // com.google.android.exoplayer2.c3
    public void y1() {
        this.F0.y1();
    }

    @Override // com.google.android.exoplayer2.c3
    public void z(@androidx.annotation.p0 Surface surface) {
        this.F0.z(surface);
    }

    @Override // com.google.android.exoplayer2.c3
    public com.google.android.exoplayer2.trackselection.p z1() {
        return this.F0.z1();
    }
}

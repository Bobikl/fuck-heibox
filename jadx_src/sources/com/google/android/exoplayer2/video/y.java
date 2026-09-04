package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: VideoRendererEventListener.java */
/* JADX INFO: loaded from: classes7.dex */
public interface y {

    /* JADX INFO: compiled from: VideoRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final Handler f51968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final y f51969b;

        public a(@p0 Handler handler, @p0 y yVar) {
            this.f51968a = yVar != null ? (Handler) com.google.android.exoplayer2.util.a.g(handler) : null;
            this.f51969b = yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((y) u0.k(this.f51969b)).S(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((y) u0.k(this.f51969b)).z(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(com.google.android.exoplayer2.decoder.g gVar) {
            gVar.c();
            ((y) u0.k(this.f51969b)).e0(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((y) u0.k(this.f51969b)).I(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(com.google.android.exoplayer2.decoder.g gVar) {
            ((y) u0.k(this.f51969b)).n0(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(a2 a2Var, com.google.android.exoplayer2.decoder.i iVar) {
            ((y) u0.k(this.f51969b)).Z(a2Var);
            ((y) u0.k(this.f51969b)).a0(a2Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((y) u0.k(this.f51969b)).m0(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((y) u0.k(this.f51969b)).P(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((y) u0.k(this.f51969b)).c0(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(a0 a0Var) {
            ((y) u0.k(this.f51969b)).g(a0Var);
        }

        public void A(final Object obj) {
            if (this.f51968a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f51968a.post(new Runnable() { // from class: com.google.android.exoplayer2.video.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51958b.w(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j10, final int i10) {
            Handler handler = this.f51968a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51836b.x(j10, i10);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f51968a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51956b.y(exc);
                    }
                });
            }
        }

        public void D(final a0 a0Var) {
            Handler handler = this.f51968a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51834b.z(a0Var);
                    }
                });
            }
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f51968a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51964b.q(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f51968a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51832b.r(str);
                    }
                });
            }
        }

        public void m(final com.google.android.exoplayer2.decoder.g gVar) {
            gVar.c();
            Handler handler = this.f51968a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51828b.s(gVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f51968a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51961b.t(i10, j10);
                    }
                });
            }
        }

        public void o(final com.google.android.exoplayer2.decoder.g gVar) {
            Handler handler = this.f51968a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51830b.u(gVar);
                    }
                });
            }
        }

        public void p(final a2 a2Var, @p0 final com.google.android.exoplayer2.decoder.i iVar) {
            Handler handler = this.f51968a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51953b.v(a2Var, iVar);
                    }
                });
            }
        }
    }

    void I(int i10, long j10);

    void P(long j10, int i10);

    void S(String str, long j10, long j11);

    @Deprecated
    void Z(a2 a2Var);

    void a0(a2 a2Var, @p0 com.google.android.exoplayer2.decoder.i iVar);

    void c0(Exception exc);

    void e0(com.google.android.exoplayer2.decoder.g gVar);

    void g(a0 a0Var);

    void m0(Object obj, long j10);

    void n0(com.google.android.exoplayer2.decoder.g gVar);

    void z(String str);
}

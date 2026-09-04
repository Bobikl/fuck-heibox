package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: AudioRendererEventListener.java */
/* JADX INFO: loaded from: classes7.dex */
public interface t {

    /* JADX INFO: compiled from: AudioRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private final Handler f44269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private final t f44270b;

        public a(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 t tVar) {
            this.f44269a = tVar != null ? (Handler) com.google.android.exoplayer2.util.a.g(handler) : null;
            this.f44270b = tVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).s0(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).M(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).s(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j10, long j11) {
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).E(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).D(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(com.google.android.exoplayer2.decoder.g gVar) {
            gVar.c();
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).i0(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(com.google.android.exoplayer2.decoder.g gVar) {
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).R(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(a2 a2Var, com.google.android.exoplayer2.decoder.i iVar) {
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).o0(a2Var);
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).J(a2Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(long j10) {
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).b0(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(boolean z10) {
            ((t) com.google.android.exoplayer2.util.u0.k(this.f44270b)).a(z10);
        }

        public void B(final long j10) {
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44160b.y(j10);
                    }
                });
            }
        }

        public void C(final boolean z10) {
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44157b.z(z10);
                    }
                });
            }
        }

        public void D(final int i10, final long j10, final long j11) {
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44195b.A(i10, j10, j11);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44219b.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44199b.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j10, final long j11) {
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44247b.t(str, j10, j11);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44137b.u(str);
                    }
                });
            }
        }

        public void o(final com.google.android.exoplayer2.decoder.g gVar) {
            gVar.c();
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44168b.v(gVar);
                    }
                });
            }
        }

        public void p(final com.google.android.exoplayer2.decoder.g gVar) {
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44190b.w(gVar);
                    }
                });
            }
        }

        public void q(final a2 a2Var, @androidx.annotation.p0 final com.google.android.exoplayer2.decoder.i iVar) {
            Handler handler = this.f44269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44152b.x(a2Var, iVar);
                    }
                });
            }
        }
    }

    void D(String str);

    void E(String str, long j10, long j11);

    void J(a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.decoder.i iVar);

    void M(Exception exc);

    void R(com.google.android.exoplayer2.decoder.g gVar);

    void a(boolean z10);

    void b0(long j10);

    void i0(com.google.android.exoplayer2.decoder.g gVar);

    @Deprecated
    void o0(a2 a2Var);

    void s(Exception exc);

    void s0(int i10, long j10, long j11);
}

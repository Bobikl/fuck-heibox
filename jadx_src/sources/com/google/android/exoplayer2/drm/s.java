package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.util.u0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: DrmSessionEventListener.java */
/* JADX INFO: loaded from: classes7.dex */
public interface s {

    /* JADX INFO: compiled from: DrmSessionEventListener.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final com.google.android.exoplayer2.source.f0.a f44753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0373a> f44754c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DrmSessionEventListener.java */
        public static final class C0373a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f44755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public s f44756b;

            public C0373a(Handler handler, s sVar) {
                this.f44755a = handler;
                this.f44756b = sVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0373a> copyOnWriteArrayList, int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            this.f44754c = copyOnWriteArrayList;
            this.f44752a = i10;
            this.f44753b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(s sVar) {
            sVar.L(this.f44752a, this.f44753b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(s sVar) {
            sVar.W(this.f44752a, this.f44753b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(s sVar) {
            sVar.Q(this.f44752a, this.f44753b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(s sVar, int i10) {
            sVar.Y(this.f44752a, this.f44753b);
            sVar.N(this.f44752a, this.f44753b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(s sVar, Exception exc) {
            sVar.j0(this.f44752a, this.f44753b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(s sVar) {
            sVar.r0(this.f44752a, this.f44753b);
        }

        public void g(Handler handler, s sVar) {
            com.google.android.exoplayer2.util.a.g(handler);
            com.google.android.exoplayer2.util.a.g(sVar);
            this.f44754c.add(new C0373a(handler, sVar));
        }

        public void h() {
            for (C0373a c0373a : this.f44754c) {
                final s sVar = c0373a.f44756b;
                u0.e1(c0373a.f44755a, new Runnable() { // from class: com.google.android.exoplayer2.drm.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44748b.n(sVar);
                    }
                });
            }
        }

        public void i() {
            for (C0373a c0373a : this.f44754c) {
                final s sVar = c0373a.f44756b;
                u0.e1(c0373a.f44755a, new Runnable() { // from class: com.google.android.exoplayer2.drm.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44746b.o(sVar);
                    }
                });
            }
        }

        public void j() {
            for (C0373a c0373a : this.f44754c) {
                final s sVar = c0373a.f44756b;
                u0.e1(c0373a.f44755a, new Runnable() { // from class: com.google.android.exoplayer2.drm.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44750b.p(sVar);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0373a c0373a : this.f44754c) {
                final s sVar = c0373a.f44756b;
                u0.e1(c0373a.f44755a, new Runnable() { // from class: com.google.android.exoplayer2.drm.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44741b.q(sVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0373a c0373a : this.f44754c) {
                final s sVar = c0373a.f44756b;
                u0.e1(c0373a.f44755a, new Runnable() { // from class: com.google.android.exoplayer2.drm.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44732b.r(sVar, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0373a c0373a : this.f44754c) {
                final s sVar = c0373a.f44756b;
                u0.e1(c0373a.f44755a, new Runnable() { // from class: com.google.android.exoplayer2.drm.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44730b.s(sVar);
                    }
                });
            }
        }

        public void t(s sVar) {
            for (C0373a c0373a : this.f44754c) {
                if (c0373a.f44756b == sVar) {
                    this.f44754c.remove(c0373a);
                }
            }
        }

        @androidx.annotation.j
        public a u(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            return new a(this.f44754c, i10, aVar);
        }
    }

    void L(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar);

    void N(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, int i11);

    void Q(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar);

    void W(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar);

    @Deprecated
    void Y(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar);

    void j0(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, Exception exc);

    void r0(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar);
}

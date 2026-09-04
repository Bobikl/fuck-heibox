package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: BandwidthMeter.java */
/* JADX INFO: loaded from: classes7.dex */
public interface e {

    /* JADX INFO: compiled from: BandwidthMeter.java */
    public interface a {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BandwidthMeter.java */
        public static final class C0405a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0406a> f51097a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.e$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BandwidthMeter.java */
            public static final class C0406a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f51098a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f51099b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f51100c;

                public C0406a(Handler handler, a aVar) {
                    this.f51098a = handler;
                    this.f51099b = aVar;
                }

                public void d() {
                    this.f51100c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void d(C0406a c0406a, int i10, long j10, long j11) {
                c0406a.f51099b.C(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                com.google.android.exoplayer2.util.a.g(handler);
                com.google.android.exoplayer2.util.a.g(aVar);
                e(aVar);
                this.f51097a.add(new C0406a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                for (final C0406a c0406a : this.f51097a) {
                    if (!c0406a.f51100c) {
                        c0406a.f51098a.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.a.C0405a.d(c0406a, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                for (C0406a c0406a : this.f51097a) {
                    if (c0406a.f51099b == aVar) {
                        c0406a.d();
                        this.f51097a.remove(c0406a);
                    }
                }
            }
        }

        void C(int i10, long j10, long j11);
    }

    long a();

    long c();

    void e(Handler handler, a aVar);

    @androidx.annotation.p0
    u0 g();

    void h(a aVar);
}

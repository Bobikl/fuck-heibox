package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.s0;
import io.reactivex.h0;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ComputationScheduler.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends h0 implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final b f123664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123665f = "RxComputationThreadPool";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final RxThreadFactory f123666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f123667h = "rx2.computation-threads";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f123668i = m(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f123667h, 0).intValue());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final c f123669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f123670k = "rx2.computation-priority";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ThreadFactory f123671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<b> f123672d;

    /* JADX INFO: renamed from: io.reactivex.internal.schedulers.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class C1111a extends h0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.internal.disposables.b f123673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.disposables.a f123674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.reactivex.internal.disposables.b f123675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final c f123676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f123677f;

        C1111a(c cVar) {
            this.f123676e = cVar;
            io.reactivex.internal.disposables.b bVar = new io.reactivex.internal.disposables.b();
            this.f123673b = bVar;
            io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
            this.f123674c = aVar;
            io.reactivex.internal.disposables.b bVar2 = new io.reactivex.internal.disposables.b();
            this.f123675d = bVar2;
            bVar2.c(bVar);
            bVar2.c(aVar);
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b b(@jh.e Runnable runnable) {
            return this.f123677f ? EmptyDisposable.INSTANCE : this.f123676e.f(runnable, 0L, TimeUnit.MILLISECONDS, this.f123673b);
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b c(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit) {
            return this.f123677f ? EmptyDisposable.INSTANCE : this.f123676e.f(runnable, j10, timeUnit, this.f123674c);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f123677f) {
                return;
            }
            this.f123677f = true;
            this.f123675d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123677f;
        }
    }

    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class b implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f123678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c[] f123679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f123680d;

        b(int i10, ThreadFactory threadFactory) {
            this.f123678b = i10;
            this.f123679c = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f123679c[i11] = new c(threadFactory);
            }
        }

        @Override // io.reactivex.internal.schedulers.i
        public void a(int i10, i.a aVar) {
            int i11 = this.f123678b;
            if (i11 == 0) {
                for (int i12 = 0; i12 < i10; i12++) {
                    aVar.a(i12, a.f123669j);
                }
                return;
            }
            int i13 = ((int) this.f123680d) % i11;
            for (int i14 = 0; i14 < i10; i14++) {
                aVar.a(i14, new C1111a(this.f123679c[i13]));
                i13++;
                if (i13 == i11) {
                    i13 = 0;
                }
            }
            this.f123680d = i13;
        }

        public c b() {
            int i10 = this.f123678b;
            if (i10 == 0) {
                return a.f123669j;
            }
            c[] cVarArr = this.f123679c;
            long j10 = this.f123680d;
            this.f123680d = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }

        public void c() {
            for (c cVar : this.f123679c) {
                cVar.dispose();
            }
        }
    }

    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class c extends g {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        f123669j = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory(f123665f, Math.max(1, Math.min(10, Integer.getInteger(f123670k, 5).intValue())), true);
        f123666g = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        f123664e = bVar;
        bVar.c();
    }

    public a() {
        this(f123666g);
    }

    public a(ThreadFactory threadFactory) {
        this.f123671c = threadFactory;
        this.f123672d = new AtomicReference<>(f123664e);
        k();
    }

    static int m(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // io.reactivex.internal.schedulers.i
    public void a(int i10, i.a aVar) {
        io.reactivex.internal.functions.a.h(i10, "number > 0 required");
        this.f123672d.get().a(i10, aVar);
    }

    @Override // io.reactivex.h0
    @jh.e
    public h0.c c() {
        return new C1111a(this.f123672d.get().b());
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b g(@jh.e Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f123672d.get().b().g(runnable, j10, timeUnit);
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b h(@jh.e Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f123672d.get().b().h(runnable, j10, j11, timeUnit);
    }

    @Override // io.reactivex.h0
    public void j() {
        b bVar;
        b bVar2;
        do {
            bVar = this.f123672d.get();
            bVar2 = f123664e;
            if (bVar == bVar2) {
                return;
            }
        } while (!s0.a(this.f123672d, bVar, bVar2));
        bVar.c();
    }

    @Override // io.reactivex.h0
    public void k() {
        b bVar = new b(f123668i, this.f123671c);
        if (s0.a(this.f123672d, f123664e, bVar)) {
            return;
        }
        bVar.c();
    }
}

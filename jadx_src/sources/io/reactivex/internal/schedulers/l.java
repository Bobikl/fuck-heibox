package io.reactivex.internal.schedulers;

import io.reactivex.h0;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: TrampolineScheduler.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final l f123738c = new l();

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f123739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f123740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f123741d;

        a(Runnable runnable, c cVar, long j10) {
            this.f123739b = runnable;
            this.f123740c = cVar;
            this.f123741d = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f123740c.f123749e) {
                return;
            }
            long jA = this.f123740c.a(TimeUnit.MILLISECONDS);
            long j10 = this.f123741d;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    io.reactivex.plugins.a.Y(e10);
                    return;
                }
            }
            if (this.f123740c.f123749e) {
                return;
            }
            this.f123739b.run();
        }
    }

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f123742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f123743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f123744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f123745e;

        b(Runnable runnable, Long l10, int i10) {
            this.f123742b = runnable;
            this.f123743c = l10.longValue();
            this.f123744d = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = io.reactivex.internal.functions.a.b(this.f123743c, bVar.f123743c);
            return iB == 0 ? io.reactivex.internal.functions.a.a(this.f123744d, bVar.f123744d) : iB;
        }
    }

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class c extends h0.c implements io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final PriorityBlockingQueue<b> f123746b = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f123747c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f123748d = new AtomicInteger();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f123749e;

        /* JADX INFO: compiled from: TrampolineScheduler.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final b f123750b;

            a(b bVar) {
                this.f123750b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f123750b.f123745e = true;
                c.this.f123746b.remove(this.f123750b);
            }
        }

        c() {
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b b(@jh.e Runnable runnable) {
            return f(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b c(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return f(new a(runnable, this, jA), jA);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123749e = true;
        }

        io.reactivex.disposables.b f(Runnable runnable, long j10) {
            if (this.f123749e) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f123748d.incrementAndGet());
            this.f123746b.add(bVar);
            if (this.f123747c.getAndIncrement() != 0) {
                return io.reactivex.disposables.c.f(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f123749e) {
                b bVarPoll = this.f123746b.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f123747c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.f123745e) {
                    bVarPoll.f123742b.run();
                }
            }
            this.f123746b.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123749e;
        }
    }

    l() {
    }

    public static l m() {
        return f123738c;
    }

    @Override // io.reactivex.h0
    @jh.e
    public h0.c c() {
        return new c();
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b f(@jh.e Runnable runnable) {
        io.reactivex.plugins.a.b0(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b g(@jh.e Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            io.reactivex.plugins.a.b0(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            io.reactivex.plugins.a.Y(e10);
        }
        return EmptyDisposable.INSTANCE;
    }
}

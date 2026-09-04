package io.reactivex;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.SchedulerWhen;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Scheduler.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f119540b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: compiled from: Scheduler.java */
    public static final class a implements io.reactivex.disposables.b, Runnable, io.reactivex.schedulers.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @jh.e
        final Runnable f119541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @jh.e
        final c f119542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @jh.f
        Thread f119543d;

        a(@jh.e Runnable runnable, @jh.e c cVar) {
            this.f119541b = runnable;
            this.f119542c = cVar;
        }

        @Override // io.reactivex.schedulers.a
        public Runnable a() {
            return this.f119541b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f119543d == Thread.currentThread()) {
                c cVar = this.f119542c;
                if (cVar instanceof io.reactivex.internal.schedulers.g) {
                    ((io.reactivex.internal.schedulers.g) cVar).j();
                    return;
                }
            }
            this.f119542c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119542c.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f119543d = Thread.currentThread();
            try {
                this.f119541b.run();
            } finally {
                dispose();
                this.f119543d = null;
            }
        }
    }

    /* JADX INFO: compiled from: Scheduler.java */
    public static final class b implements io.reactivex.disposables.b, Runnable, io.reactivex.schedulers.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @jh.e
        final Runnable f119544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @jh.e
        final c f119545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f119546d;

        b(@jh.e Runnable runnable, @jh.e c cVar) {
            this.f119544b = runnable;
            this.f119545c = cVar;
        }

        @Override // io.reactivex.schedulers.a
        public Runnable a() {
            return this.f119544b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119546d = true;
            this.f119545c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119546d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f119546d) {
                return;
            }
            try {
                this.f119544b.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f119545c.dispose();
                throw ExceptionHelper.f(th2);
            }
        }
    }

    /* JADX INFO: compiled from: Scheduler.java */
    public static abstract class c implements io.reactivex.disposables.b {

        /* JADX INFO: compiled from: Scheduler.java */
        public final class a implements Runnable, io.reactivex.schedulers.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @jh.e
            final Runnable f119547b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @jh.e
            final SequentialDisposable f119548c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final long f119549d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            long f119550e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            long f119551f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            long f119552g;

            a(@jh.e long j10, Runnable runnable, @jh.e long j11, SequentialDisposable sequentialDisposable, long j12) {
                this.f119547b = runnable;
                this.f119548c = sequentialDisposable;
                this.f119549d = j12;
                this.f119551f = j11;
                this.f119552g = j10;
            }

            @Override // io.reactivex.schedulers.a
            public Runnable a() {
                return this.f119547b;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // java.lang.Runnable
            public void run() {
                long j10;
                this.f119547b.run();
                if (this.f119548c.isDisposed()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = cVar.a(timeUnit);
                long j11 = h0.f119540b;
                long j12 = jA + j11;
                long j13 = this.f119551f;
                if (j12 >= j13) {
                    long j14 = this.f119549d;
                    if (jA >= j13 + j14 + j11) {
                        long j15 = this.f119549d;
                        long j16 = jA + j15;
                        long j17 = this.f119550e + 1;
                        this.f119550e = j17;
                        this.f119552g = j16 - (j15 * j17);
                        j10 = j16;
                    } else {
                        long j18 = this.f119552g;
                        long j19 = this.f119550e + 1;
                        this.f119550e = j19;
                        j10 = j18 + (j19 * j14);
                    }
                } else {
                    long j110 = this.f119549d;
                    long j111 = jA + j110;
                    long j112 = this.f119550e + 1;
                    this.f119550e = j112;
                    this.f119552g = j111 - (j110 * j112);
                    j10 = j111;
                }
                this.f119551f = jA;
                this.f119548c.a(c.this.c(this, j10 - jA, timeUnit));
            }
        }

        public long a(@jh.e TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @jh.e
        public io.reactivex.disposables.b b(@jh.e Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @jh.e
        public abstract io.reactivex.disposables.b c(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit);

        @jh.e
        public io.reactivex.disposables.b d(@jh.e Runnable runnable, long j10, long j11, @jh.e TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            io.reactivex.disposables.b bVarC = c(new a(jA + timeUnit.toNanos(j10), runnableB0, jA, sequentialDisposable2, nanos), j10, timeUnit);
            if (bVarC == EmptyDisposable.INSTANCE) {
                return bVarC;
            }
            sequentialDisposable.a(bVarC);
            return sequentialDisposable2;
        }
    }

    public static long b() {
        return f119540b;
    }

    @jh.e
    public abstract c c();

    public long d(@jh.e TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @jh.e
    public io.reactivex.disposables.b f(@jh.e Runnable runnable) {
        return g(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @jh.e
    public io.reactivex.disposables.b g(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit) {
        c cVarC = c();
        a aVar = new a(io.reactivex.plugins.a.b0(runnable), cVarC);
        cVarC.c(aVar, j10, timeUnit);
        return aVar;
    }

    @jh.e
    public io.reactivex.disposables.b h(@jh.e Runnable runnable, long j10, long j11, @jh.e TimeUnit timeUnit) {
        c cVarC = c();
        b bVar = new b(io.reactivex.plugins.a.b0(runnable), cVarC);
        io.reactivex.disposables.b bVarD = cVarC.d(bVar, j10, j11, timeUnit);
        return bVarD == EmptyDisposable.INSTANCE ? bVarD : bVar;
    }

    public void j() {
    }

    public void k() {
    }

    @jh.e
    public <S extends h0 & io.reactivex.disposables.b> S l(@jh.e kh.o<j<j<io.reactivex.a>>, io.reactivex.a> oVar) {
        return new SchedulerWhen(oVar, this);
    }
}

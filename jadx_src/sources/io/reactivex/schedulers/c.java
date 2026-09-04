package io.reactivex.schedulers;

import io.reactivex.h0;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import jh.e;

/* JADX INFO: compiled from: TestScheduler.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Queue<b> f124055c = new PriorityBlockingQueue(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f124056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile long f124057e;

    /* JADX INFO: compiled from: TestScheduler.java */
    public final class a extends h0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile boolean f124058b;

        /* JADX INFO: renamed from: io.reactivex.schedulers.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TestScheduler.java */
        public final class RunnableC1114a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final b f124060b;

            RunnableC1114a(b bVar) {
                this.f124060b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f124055c.remove(this.f124060b);
            }
        }

        a() {
        }

        @Override // io.reactivex.h0.c
        public long a(@e TimeUnit timeUnit) {
            return c.this.d(timeUnit);
        }

        @Override // io.reactivex.h0.c
        @e
        public io.reactivex.disposables.b b(@e Runnable runnable) {
            if (this.f124058b) {
                return EmptyDisposable.INSTANCE;
            }
            c cVar = c.this;
            long j10 = cVar.f124056d;
            cVar.f124056d = 1 + j10;
            b bVar = new b(this, 0L, runnable, j10);
            c.this.f124055c.add(bVar);
            return io.reactivex.disposables.c.f(new RunnableC1114a(bVar));
        }

        @Override // io.reactivex.h0.c
        @e
        public io.reactivex.disposables.b c(@e Runnable runnable, long j10, @e TimeUnit timeUnit) {
            if (this.f124058b) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = c.this.f124057e + timeUnit.toNanos(j10);
            c cVar = c.this;
            long j11 = cVar.f124056d;
            cVar.f124056d = 1 + j11;
            b bVar = new b(this, nanos, runnable, j11);
            c.this.f124055c.add(bVar);
            return io.reactivex.disposables.c.f(new RunnableC1114a(bVar));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f124058b = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f124058b;
        }
    }

    /* JADX INFO: compiled from: TestScheduler.java */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f124062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Runnable f124063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a f124064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f124065e;

        b(a aVar, long j10, Runnable runnable, long j11) {
            this.f124062b = j10;
            this.f124063c = runnable;
            this.f124064d = aVar;
            this.f124065e = j11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j10 = this.f124062b;
            long j11 = bVar.f124062b;
            return j10 == j11 ? io.reactivex.internal.functions.a.b(this.f124065e, bVar.f124065e) : io.reactivex.internal.functions.a.b(j10, j11);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f124062b), this.f124063c.toString());
        }
    }

    public c() {
    }

    public c(long j10, TimeUnit timeUnit) {
        this.f124057e = timeUnit.toNanos(j10);
    }

    private void p(long j10) {
        while (true) {
            b bVarPeek = this.f124055c.peek();
            if (bVarPeek == null) {
                break;
            }
            long j11 = bVarPeek.f124062b;
            if (j11 > j10) {
                break;
            }
            if (j11 == 0) {
                j11 = this.f124057e;
            }
            this.f124057e = j11;
            this.f124055c.remove(bVarPeek);
            if (!bVarPeek.f124064d.f124058b) {
                bVarPeek.f124063c.run();
            }
        }
        this.f124057e = j10;
    }

    @Override // io.reactivex.h0
    @e
    public h0.c c() {
        return new a();
    }

    @Override // io.reactivex.h0
    public long d(@e TimeUnit timeUnit) {
        return timeUnit.convert(this.f124057e, TimeUnit.NANOSECONDS);
    }

    public void m(long j10, TimeUnit timeUnit) {
        n(this.f124057e + timeUnit.toNanos(j10), TimeUnit.NANOSECONDS);
    }

    public void n(long j10, TimeUnit timeUnit) {
        p(timeUnit.toNanos(j10));
    }

    public void o() {
        p(this.f124057e);
    }
}

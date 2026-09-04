package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.s0;
import io.reactivex.h0;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: IoScheduler.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f123691e = "RxCachedThreadScheduler";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final RxThreadFactory f123692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f123693g = "RxCachedWorkerPoolEvictor";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final RxThreadFactory f123694h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f123696j = 60;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final c f123699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f123700n = "rx2.io-priority";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final a f123701o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ThreadFactory f123702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<a> f123703d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final TimeUnit f123698l = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f123695i = "rx2.io-keep-alive-time";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f123697k = Long.getLong(f123695i, 60).longValue();

    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f123704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f123705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.disposables.a f123706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f123707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Future<?> f123708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ThreadFactory f123709g;

        a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f123704b = nanos;
            this.f123705c = new ConcurrentLinkedQueue<>();
            this.f123706d = new io.reactivex.disposables.a();
            this.f123709g = threadFactory;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, e.f123694h);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f123707e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f123708f = scheduledFutureScheduleWithFixedDelay;
        }

        void a() {
            if (this.f123705c.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : this.f123705c) {
                if (cVar.k() > jC) {
                    return;
                }
                if (this.f123705c.remove(cVar)) {
                    this.f123706d.a(cVar);
                }
            }
        }

        c b() {
            if (this.f123706d.isDisposed()) {
                return e.f123699m;
            }
            while (!this.f123705c.isEmpty()) {
                c cVarPoll = this.f123705c.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f123709g);
            this.f123706d.c(cVar);
            return cVar;
        }

        long c() {
            return System.nanoTime();
        }

        void d(c cVar) {
            cVar.l(c() + this.f123704b);
            this.f123705c.offer(cVar);
        }

        void e() {
            this.f123706d.dispose();
            Future<?> future = this.f123708f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f123707e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class b extends h0.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f123711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f123712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f123713e = new AtomicBoolean();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.disposables.a f123710b = new io.reactivex.disposables.a();

        b(a aVar) {
            this.f123711c = aVar;
            this.f123712d = aVar.b();
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b c(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit) {
            return this.f123710b.isDisposed() ? EmptyDisposable.INSTANCE : this.f123712d.f(runnable, j10, timeUnit, this.f123710b);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f123713e.compareAndSet(false, true)) {
                this.f123710b.dispose();
                this.f123711c.d(this.f123712d);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123713e.get();
        }
    }

    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class c extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f123714d;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f123714d = 0L;
        }

        public long k() {
            return this.f123714d;
        }

        public void l(long j10) {
            this.f123714d = j10;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f123699m = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger(f123700n, 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory(f123691e, iMax);
        f123692f = rxThreadFactory;
        f123694h = new RxThreadFactory(f123693g, iMax);
        a aVar = new a(0L, null, rxThreadFactory);
        f123701o = aVar;
        aVar.e();
    }

    public e() {
        this(f123692f);
    }

    public e(ThreadFactory threadFactory) {
        this.f123702c = threadFactory;
        this.f123703d = new AtomicReference<>(f123701o);
        k();
    }

    @Override // io.reactivex.h0
    @jh.e
    public h0.c c() {
        return new b(this.f123703d.get());
    }

    @Override // io.reactivex.h0
    public void j() {
        a aVar;
        a aVar2;
        do {
            aVar = this.f123703d.get();
            aVar2 = f123701o;
            if (aVar == aVar2) {
                return;
            }
        } while (!s0.a(this.f123703d, aVar, aVar2));
        aVar.e();
    }

    @Override // io.reactivex.h0
    public void k() {
        a aVar = new a(f123697k, f123698l, this.f123702c);
        if (s0.a(this.f123703d, f123701o, aVar)) {
            return;
        }
        aVar.e();
    }

    public int m() {
        return this.f123703d.get().f123706d.h();
    }
}

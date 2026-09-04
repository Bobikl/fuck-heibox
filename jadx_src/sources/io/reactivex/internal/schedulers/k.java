package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.s0;
import io.reactivex.h0;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: SingleScheduler.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f123729e = "rx2.single-priority";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123730f = "RxSingleScheduler";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final RxThreadFactory f123731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final ScheduledExecutorService f123732h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ThreadFactory f123733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f123734d;

    /* JADX INFO: compiled from: SingleScheduler.java */
    public static final class a extends h0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ScheduledExecutorService f123735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.a f123736c = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f123737d;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f123735b = scheduledExecutorService;
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b c(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit) {
            if (this.f123737d) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(io.reactivex.plugins.a.b0(runnable), this.f123736c);
            this.f123736c.c(scheduledRunnable);
            try {
                scheduledRunnable.a(j10 <= 0 ? this.f123735b.submit((Callable) scheduledRunnable) : this.f123735b.schedule((Callable) scheduledRunnable, j10, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e10) {
                dispose();
                io.reactivex.plugins.a.Y(e10);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f123737d) {
                return;
            }
            this.f123737d = true;
            this.f123736c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123737d;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f123732h = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f123731g = new RxThreadFactory(f123730f, Math.max(1, Math.min(10, Integer.getInteger(f123729e, 5).intValue())), true);
    }

    public k() {
        this(f123731g);
    }

    public k(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f123734d = atomicReference;
        this.f123733c = threadFactory;
        atomicReference.lazySet(m(threadFactory));
    }

    static ScheduledExecutorService m(ThreadFactory threadFactory) {
        return j.a(threadFactory);
    }

    @Override // io.reactivex.h0
    @jh.e
    public h0.c c() {
        return new a(this.f123734d.get());
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b g(@jh.e Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(io.reactivex.plugins.a.b0(runnable));
        try {
            scheduledDirectTask.b(j10 <= 0 ? this.f123734d.get().submit(scheduledDirectTask) : this.f123734d.get().schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b h(@jh.e Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
        if (j11 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableB0);
            try {
                scheduledDirectPeriodicTask.b(this.f123734d.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e10) {
                io.reactivex.plugins.a.Y(e10);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f123734d.get();
        d dVar = new d(runnableB0, scheduledExecutorService);
        try {
            dVar.b(j10 <= 0 ? scheduledExecutorService.submit(dVar) : scheduledExecutorService.schedule(dVar, j10, timeUnit));
            return dVar;
        } catch (RejectedExecutionException e11) {
            io.reactivex.plugins.a.Y(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.h0
    public void j() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.f123734d.get();
        ScheduledExecutorService scheduledExecutorService2 = f123732h;
        if (scheduledExecutorService == scheduledExecutorService2 || (andSet = this.f123734d.getAndSet(scheduledExecutorService2)) == scheduledExecutorService2) {
            return;
        }
        andSet.shutdownNow();
    }

    @Override // io.reactivex.h0
    public void k() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceM = null;
        do {
            scheduledExecutorService = this.f123734d.get();
            if (scheduledExecutorService != f123732h) {
                if (scheduledExecutorServiceM != null) {
                    scheduledExecutorServiceM.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceM == null) {
                scheduledExecutorServiceM = m(this.f123733c);
            }
        } while (!s0.a(this.f123734d, scheduledExecutorService, scheduledExecutorServiceM));
    }
}

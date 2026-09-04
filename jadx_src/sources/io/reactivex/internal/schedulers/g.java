package io.reactivex.internal.schedulers;

import io.reactivex.h0;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: NewThreadWorker.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends h0.c implements io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f123719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f123720c;

    public g(ThreadFactory threadFactory) {
        this.f123719b = j.a(threadFactory);
    }

    @Override // io.reactivex.h0.c
    @jh.e
    public io.reactivex.disposables.b b(@jh.e Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // io.reactivex.h0.c
    @jh.e
    public io.reactivex.disposables.b c(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit) {
        return this.f123720c ? EmptyDisposable.INSTANCE : f(runnable, j10, timeUnit, null);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (this.f123720c) {
            return;
        }
        this.f123720c = true;
        this.f123719b.shutdownNow();
    }

    @jh.e
    public ScheduledRunnable f(Runnable runnable, long j10, @jh.e TimeUnit timeUnit, @jh.f io.reactivex.internal.disposables.a aVar) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(io.reactivex.plugins.a.b0(runnable), aVar);
        if (aVar != null && !aVar.c(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.a(j10 <= 0 ? this.f123719b.submit((Callable) scheduledRunnable) : this.f123719b.schedule((Callable) scheduledRunnable, j10, timeUnit));
        } catch (RejectedExecutionException e10) {
            if (aVar != null) {
                aVar.a(scheduledRunnable);
            }
            io.reactivex.plugins.a.Y(e10);
        }
        return scheduledRunnable;
    }

    public io.reactivex.disposables.b g(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(io.reactivex.plugins.a.b0(runnable));
        try {
            scheduledDirectTask.b(j10 <= 0 ? this.f123719b.submit(scheduledDirectTask) : this.f123719b.schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    public io.reactivex.disposables.b h(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
        if (j11 <= 0) {
            d dVar = new d(runnableB0, this.f123719b);
            try {
                dVar.b(j10 <= 0 ? this.f123719b.submit(dVar) : this.f123719b.schedule(dVar, j10, timeUnit));
                return dVar;
            } catch (RejectedExecutionException e10) {
                io.reactivex.plugins.a.Y(e10);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableB0);
        try {
            scheduledDirectPeriodicTask.b(this.f123719b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e11) {
            io.reactivex.plugins.a.Y(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f123720c;
    }

    public void j() {
        if (this.f123720c) {
            return;
        }
        this.f123720c = true;
        this.f123719b.shutdown();
    }
}

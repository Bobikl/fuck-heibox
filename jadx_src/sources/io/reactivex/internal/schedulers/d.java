package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.s0;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: InstantPeriodicTask.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements Callable<Void>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final FutureTask<Void> f123685g = new FutureTask<>(Functions.f119557b, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Runnable f123686b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ExecutorService f123689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Thread f123690f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<Future<?>> f123688d = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<Future<?>> f123687c = new AtomicReference<>();

    d(Runnable runnable, ExecutorService executorService) {
        this.f123686b = runnable;
        this.f123689e = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.f123690f = Thread.currentThread();
        try {
            this.f123686b.run();
            c(this.f123689e.submit(this));
            this.f123690f = null;
        } catch (Throwable th2) {
            this.f123690f = null;
            io.reactivex.plugins.a.Y(th2);
        }
        return null;
    }

    void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f123688d.get();
            if (future2 == f123685g) {
                future.cancel(this.f123690f != Thread.currentThread());
                return;
            }
        } while (!s0.a(this.f123688d, future2, future));
    }

    void c(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f123687c.get();
            if (future2 == f123685g) {
                future.cancel(this.f123690f != Thread.currentThread());
                return;
            }
        } while (!s0.a(this.f123687c, future2, future));
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f123688d;
        FutureTask<Void> futureTask = f123685g;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f123690f != Thread.currentThread());
        }
        Future<?> andSet2 = this.f123687c.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f123690f != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f123688d.get() == f123685g;
    }
}

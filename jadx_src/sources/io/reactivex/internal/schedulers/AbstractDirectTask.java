package io.reactivex.internal.schedulers;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements io.reactivex.disposables.b, io.reactivex.schedulers.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final FutureTask<Void> f123607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final FutureTask<Void> f123608e;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Runnable f123609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Thread f123610c;

    static {
        Runnable runnable = Functions.f119557b;
        f123607d = new FutureTask<>(runnable, null);
        f123608e = new FutureTask<>(runnable, null);
    }

    AbstractDirectTask(Runnable runnable) {
        this.f123609b = runnable;
    }

    @Override // io.reactivex.schedulers.a
    public Runnable a() {
        return this.f123609b;
    }

    public final void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f123607d) {
                return;
            }
            if (future2 == f123608e) {
                future.cancel(this.f123610c != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f123607d || future == (futureTask = f123608e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f123610c != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f123607d || future == f123608e;
    }
}

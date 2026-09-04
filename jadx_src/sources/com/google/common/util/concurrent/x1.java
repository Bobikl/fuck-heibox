package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: WrappingExecutorService.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@s9.a
@o9.c
public abstract class x1 implements ExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f59570b;

    protected x1(ExecutorService executorService) {
        this.f59570b = (ExecutorService) com.google.common.base.w.E(executorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Callable callable) {
        try {
            callable.call();
        } catch (Exception e10) {
            com.google.common.base.d0.w(e10);
            throw new RuntimeException(e10);
        }
    }

    private <T> ImmutableList<Callable<T>> e(Collection<? extends Callable<T>> collection) {
        ImmutableList.a aVarQ = ImmutableList.q();
        Iterator<? extends Callable<T>> it = collection.iterator();
        while (it.hasNext()) {
            aVarQ.a(d(it.next()));
        }
        return aVarQ.e();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f59570b.awaitTermination(j10, timeUnit);
    }

    protected Runnable c(Runnable runnable) {
        final Callable callableD = d(Executors.callable(runnable, null));
        return new Runnable() { // from class: com.google.common.util.concurrent.w1
            @Override // java.lang.Runnable
            public final void run() {
                x1.b(callableD);
            }
        };
    }

    protected abstract <T> Callable<T> d(Callable<T> callable);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f59570b.execute(c(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f59570b.invokeAll(e(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f59570b.invokeAll(e(collection), j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f59570b.invokeAny(e(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f59570b.invokeAny(e(collection), j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f59570b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f59570b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f59570b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f59570b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f59570b.submit(c(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, @b1 T t10) {
        return this.f59570b.submit(c(runnable), t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f59570b.submit(d((Callable) com.google.common.base.w.E(callable)));
    }
}

package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ListenableFutureTask.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public class q0<V> extends FutureTask<V> implements p0<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f59526b;

    q0(Runnable runnable, @b1 V v10) {
        super(runnable, v10);
        this.f59526b = new v();
    }

    q0(Callable<V> callable) {
        super(callable);
        this.f59526b = new v();
    }

    public static <V> q0<V> a(Runnable runnable, @b1 V v10) {
        return new q0<>(runnable, v10);
    }

    public static <V> q0<V> b(Callable<V> callable) {
        return new q0<>(callable);
    }

    @Override // com.google.common.util.concurrent.p0
    public void V(Runnable runnable, Executor executor) {
        this.f59526b.a(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        this.f59526b.b();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @s9.a
    @b1
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        return nanos <= 2147483647999999999L ? (V) super.get(j10, timeUnit) : (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}

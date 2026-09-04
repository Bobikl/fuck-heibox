package com.google.common.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: AbstractListeningExecutorService.java */
/* JADX INFO: loaded from: classes7.dex */
@s9.a
@u
@o9.a
@o9.c
public abstract class e extends AbstractExecutorService implements u0 {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, @b1 T t10) {
        return TrustedListenableFutureTask.O(runnable, t10);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return TrustedListenableFutureTask.P(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.u0
    public p0<?> submit(Runnable runnable) {
        return (p0) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.u0
    public <T> p0<T> submit(Runnable runnable, @b1 T t10) {
        return (p0) super.submit(runnable, (Object) t10);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.u0
    public <T> p0<T> submit(Callable<T> callable) {
        return (p0) super.submit((Callable) callable);
    }
}

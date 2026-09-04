package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ListeningExecutorService.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@s9.f("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
@o9.c
public interface u0 extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException;

    p0<?> submit(Runnable runnable);

    <T> p0<T> submit(Runnable runnable, @b1 T t10);

    <T> p0<T> submit(Callable<T> callable);

    /* bridge */ /* synthetic */ Future submit(Runnable runnable);

    /* bridge */ /* synthetic */ Future submit(Runnable runnable, @b1 Object obj);

    /* bridge */ /* synthetic */ Future submit(Callable callable);
}

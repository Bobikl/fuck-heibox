package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ListeningScheduledExecutorService.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public interface w0 extends ScheduledExecutorService, u0 {
    @Override // java.util.concurrent.ScheduledExecutorService
    r0<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> r0<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    r0<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    r0<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit);
}

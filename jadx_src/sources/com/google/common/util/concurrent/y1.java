package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WrappingScheduledExecutorService.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@s9.a
@o9.c
public abstract class y1 extends x1 implements ScheduledExecutorService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ScheduledExecutorService f59589c;

    protected y1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f59589c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f59589c.schedule(c(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        return this.f59589c.schedule(d(callable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f59589c.scheduleAtFixedRate(c(runnable), j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f59589c.scheduleWithFixedDelay(c(runnable), j10, j11, timeUnit);
    }
}

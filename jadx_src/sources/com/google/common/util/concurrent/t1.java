package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: TimeLimiter.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.a
@s9.f("Use FakeTimeLimiter")
@o9.c
public interface t1 {
    void a(Runnable runnable, long j10, TimeUnit timeUnit) throws TimeoutException;

    @s9.a
    <T> T b(Callable<T> callable, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException;

    @s9.a
    <T> T c(Callable<T> callable, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException;

    void d(Runnable runnable, long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException;

    <T> T e(T t10, Class<T> cls, long j10, TimeUnit timeUnit);
}

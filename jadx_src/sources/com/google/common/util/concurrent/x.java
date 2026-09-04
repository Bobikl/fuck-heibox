package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: FakeTimeLimiter.java */
/* JADX INFO: loaded from: classes7.dex */
@s9.a
@u
@o9.a
@o9.c
public final class x implements t1 {
    @Override // com.google.common.util.concurrent.t1
    public void a(Runnable runnable, long j10, TimeUnit timeUnit) {
        d(runnable, j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.t1
    @b1
    public <T> T b(Callable<T> callable, long j10, TimeUnit timeUnit) throws ExecutionException {
        return (T) c(callable, j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.t1
    @b1
    public <T> T c(Callable<T> callable, long j10, TimeUnit timeUnit) throws ExecutionException {
        com.google.common.base.w.E(callable);
        com.google.common.base.w.E(timeUnit);
        try {
            return callable.call();
        } catch (Error e10) {
            throw new ExecutionError(e10);
        } catch (RuntimeException e11) {
            throw new UncheckedExecutionException(e11);
        } catch (Exception e12) {
            throw new ExecutionException(e12);
        } catch (Throwable th2) {
            throw new ExecutionException(th2);
        }
    }

    @Override // com.google.common.util.concurrent.t1
    public void d(Runnable runnable, long j10, TimeUnit timeUnit) {
        com.google.common.base.w.E(runnable);
        com.google.common.base.w.E(timeUnit);
        try {
            runnable.run();
        } catch (Error e10) {
            throw new ExecutionError(e10);
        } catch (RuntimeException e11) {
            throw new UncheckedExecutionException(e11);
        } catch (Throwable th2) {
            throw new UncheckedExecutionException(th2);
        }
    }

    @Override // com.google.common.util.concurrent.t1
    public <T> T e(T t10, Class<T> cls, long j10, TimeUnit timeUnit) {
        com.google.common.base.w.E(t10);
        com.google.common.base.w.E(cls);
        com.google.common.base.w.E(timeUnit);
        return t10;
    }
}

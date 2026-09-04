package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: FluentFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b(emulated = true)
@s9.f("Use FluentFuture.from(Futures.immediate*Future) or SettableFuture")
public abstract class y<V> extends k0<V> {

    /* JADX INFO: compiled from: FluentFuture.java */
    public static abstract class a<V> extends y<V> implements AbstractFuture.h<V> {
        a() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.p0
        public final void V(Runnable runnable, Executor executor) {
            super.V(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @s9.a
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @s9.a
        @b1
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @s9.a
        @b1
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    y() {
    }

    @Deprecated
    public static <V> y<V> I(y<V> yVar) {
        return (y) com.google.common.base.w.E(yVar);
    }

    public static <V> y<V> J(p0<V> p0Var) {
        return p0Var instanceof y ? (y) p0Var : new d0(p0Var);
    }

    public final void F(i0<? super V> i0Var, Executor executor) {
        j0.a(this, i0Var, executor);
    }

    @o9.a
    @c1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> y<V> G(Class<X> cls, com.google.common.base.n<? super X, ? extends V> nVar, Executor executor) {
        return (y) j0.d(this, cls, nVar, executor);
    }

    @o9.a
    @c1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> y<V> H(Class<X> cls, m<? super X, ? extends V> mVar, Executor executor) {
        return (y) j0.e(this, cls, mVar, executor);
    }

    @o9.a
    public final <T> y<T> K(com.google.common.base.n<? super V, T> nVar, Executor executor) {
        return (y) j0.x(this, nVar, executor);
    }

    @o9.a
    public final <T> y<T> L(m<? super V, T> mVar, Executor executor) {
        return (y) j0.y(this, mVar, executor);
    }

    @o9.a
    @o9.c
    public final y<V> M(long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (y) j0.D(this, j10, timeUnit, scheduledExecutorService);
    }
}

package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public final class CombinedFuture<V> extends AggregateFuture<Object, V> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @CheckForNull
    private CombinedFuture<V>.CombinedFutureInterruptibleTask<?> f59273r;

    public final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<p0<V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final l<V> f59274g;

        AsyncCallableInterruptibleTask(l<V> lVar, Executor executor) {
            super(executor);
            this.f59274g = (l) com.google.common.base.w.E(lVar);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String f() {
            return this.f59274g.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p0<V> e() throws Exception {
            return (p0) com.google.common.base.w.V(this.f59274g.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f59274g);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(p0<V> p0Var) {
            CombinedFuture.this.D(p0Var);
        }
    }

    public final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Callable<V> f59276g;

        CallableInterruptibleTask(Callable<V> callable, Executor executor) {
            super(executor);
            this.f59276g = (Callable) com.google.common.base.w.E(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @b1
        V e() throws Exception {
            return this.f59276g.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String f() {
            return this.f59276g.toString();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        void i(@b1 V v10) {
            CombinedFuture.this.B(v10);
        }
    }

    public abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Executor f59278e;

        CombinedFutureInterruptibleTask(Executor executor) {
            this.f59278e = (Executor) com.google.common.base.w.E(executor);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void a(Throwable th2) {
            CombinedFuture.this.f59273r = null;
            if (th2 instanceof ExecutionException) {
                CombinedFuture.this.C(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                CombinedFuture.this.cancel(false);
            } else {
                CombinedFuture.this.C(th2);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void b(@b1 T t10) {
            CombinedFuture.this.f59273r = null;
            i(t10);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean d() {
            return CombinedFuture.this.isDone();
        }

        final void h() {
            try {
                this.f59278e.execute(this);
            } catch (RejectedExecutionException e10) {
                CombinedFuture.this.C(e10);
            }
        }

        abstract void i(@b1 T t10);
    }

    CombinedFuture(ImmutableCollection<? extends p0<?>> immutableCollection, boolean z10, Executor executor, l<V> lVar) {
        super(immutableCollection, z10, false);
        this.f59273r = new AsyncCallableInterruptibleTask(lVar, executor);
        U();
    }

    CombinedFuture(ImmutableCollection<? extends p0<?>> immutableCollection, boolean z10, Executor executor, Callable<V> callable) {
        super(immutableCollection, z10, false);
        this.f59273r = new CallableInterruptibleTask(callable, executor);
        U();
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void P(int i10, @CheckForNull Object obj) {
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void S() {
        CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.f59273r;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.h();
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void a0(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.a0(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.f59273r = null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void w() {
        CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.f59273r;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.c();
        }
    }
}

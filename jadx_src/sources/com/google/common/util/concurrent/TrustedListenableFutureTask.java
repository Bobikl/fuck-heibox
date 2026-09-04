package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public class TrustedListenableFutureTask<V> extends y.a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    private volatile InterruptibleTask<?> f59373j;

    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<p0<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final l<V> f59374e;

        TrustedFutureInterruptibleAsyncTask(l<V> lVar) {
            this.f59374e = (l) com.google.common.base.w.E(lVar);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void a(Throwable th2) {
            TrustedListenableFutureTask.this.C(th2);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean d() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String f() {
            return this.f59374e.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void b(p0<V> p0Var) {
            TrustedListenableFutureTask.this.D(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public p0<V> e() throws Exception {
            return (p0) com.google.common.base.w.V(this.f59374e.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f59374e);
        }
    }

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Callable<V> f59376e;

        TrustedFutureInterruptibleTask(Callable<V> callable) {
            this.f59376e = (Callable) com.google.common.base.w.E(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void a(Throwable th2) {
            TrustedListenableFutureTask.this.C(th2);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void b(@b1 V v10) {
            TrustedListenableFutureTask.this.B(v10);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean d() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @b1
        V e() throws Exception {
            return this.f59376e.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String f() {
            return this.f59376e.toString();
        }
    }

    TrustedListenableFutureTask(l<V> lVar) {
        this.f59373j = new TrustedFutureInterruptibleAsyncTask(lVar);
    }

    TrustedListenableFutureTask(Callable<V> callable) {
        this.f59373j = new TrustedFutureInterruptibleTask(callable);
    }

    static <V> TrustedListenableFutureTask<V> N(l<V> lVar) {
        return new TrustedListenableFutureTask<>(lVar);
    }

    static <V> TrustedListenableFutureTask<V> O(Runnable runnable, @b1 V v10) {
        return new TrustedListenableFutureTask<>(Executors.callable(runnable, v10));
    }

    static <V> TrustedListenableFutureTask<V> P(Callable<V> callable) {
        return new TrustedListenableFutureTask<>(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void m() {
        InterruptibleTask<?> interruptibleTask;
        super.m();
        if (E() && (interruptibleTask = this.f59373j) != null) {
            interruptibleTask.c();
        }
        this.f59373j = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        InterruptibleTask<?> interruptibleTask = this.f59373j;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.f59373j = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    protected String y() {
        InterruptibleTask<?> interruptibleTask = this.f59373j;
        if (interruptibleTask == null) {
            return super.y();
        }
        String strValueOf = String.valueOf(interruptibleTask);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 7);
        sb2.append("task=[");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }
}

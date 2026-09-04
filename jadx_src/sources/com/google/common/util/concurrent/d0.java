package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ForwardingFluentFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public final class d0<V> extends y<V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p0<V> f59395j;

    d0(p0<V> p0Var) {
        this.f59395j = (p0) com.google.common.base.w.E(p0Var);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.p0
    public void V(Runnable runnable, Executor executor) {
        this.f59395j.V(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f59395j.cancel(z10);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @b1
    public V get() throws ExecutionException, InterruptedException {
        return this.f59395j.get();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @b1
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f59395j.get(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f59395j.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isDone() {
        return this.f59395j.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String toString() {
        return this.f59395j.toString();
    }
}

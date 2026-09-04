package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ForwardingFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@s9.a
@u
@o9.b
public abstract class e0<V> extends com.google.common.collect.y0 implements Future<V> {

    /* JADX INFO: compiled from: ForwardingFuture.java */
    public static abstract class a<V> extends e0<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Future<V> f59396b;

        protected a(Future<V> future) {
            this.f59396b = (Future) com.google.common.base.w.E(future);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.e0, com.google.common.collect.y0
        public final Future<V> H0() {
            return this.f59396b;
        }
    }

    protected e0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.y0
    public abstract Future<? extends V> H0();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return H0().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    @b1
    public V get() throws ExecutionException, InterruptedException {
        return H0().get();
    }

    @Override // java.util.concurrent.Future
    @b1
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return H0().get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return H0().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return H0().isDone();
    }
}

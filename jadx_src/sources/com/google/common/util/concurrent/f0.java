package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ForwardingListenableFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@s9.a
@u
@o9.b
public abstract class f0<V> extends e0<V> implements p0<V> {

    /* JADX INFO: compiled from: ForwardingListenableFuture.java */
    public static abstract class a<V> extends f0<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p0<V> f59430b;

        protected a(p0<V> p0Var) {
            this.f59430b = (p0) com.google.common.base.w.E(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.f0, com.google.common.util.concurrent.e0
        /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
        public final p0<V> H0() {
            return this.f59430b;
        }
    }

    protected f0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.e0
    /* JADX INFO: renamed from: J0 */
    public abstract p0<? extends V> H0();

    @Override // com.google.common.util.concurrent.p0
    public void V(Runnable runnable, Executor executor) {
        H0().V(runnable, executor);
    }
}

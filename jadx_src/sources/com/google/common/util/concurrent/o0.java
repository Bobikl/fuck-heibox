package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: JdkFutureAdapters.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.a
@o9.c
public final class o0 {

    /* JADX INFO: compiled from: JdkFutureAdapters.java */
    public static class a<V> extends e0<V> implements p0<V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ThreadFactory f59516f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Executor f59517g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f59518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v f59519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f59520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Future<V> f59521e;

        static {
            ThreadFactory threadFactoryB = new s1().e(true).f("ListenableFutureAdapter-thread-%d").b();
            f59516f = threadFactoryB;
            f59517g = Executors.newCachedThreadPool(threadFactoryB);
        }

        a(Future<V> future) {
            this(future, f59517g);
        }

        a(Future<V> future, Executor executor) {
            this.f59519c = new v();
            this.f59520d = new AtomicBoolean(false);
            this.f59521e = (Future) com.google.common.base.w.E(future);
            this.f59518b = (Executor) com.google.common.base.w.E(executor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void L0() {
            try {
                v1.f(this.f59521e);
            } catch (Throwable unused) {
            }
            this.f59519c.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.e0, com.google.common.collect.y0
        /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
        public Future<V> X0() {
            return this.f59521e;
        }

        @Override // com.google.common.util.concurrent.p0
        public void V(Runnable runnable, Executor executor) {
            this.f59519c.a(runnable, executor);
            if (this.f59520d.compareAndSet(false, true)) {
                if (this.f59521e.isDone()) {
                    this.f59519c.b();
                } else {
                    this.f59518b.execute(new Runnable() { // from class: com.google.common.util.concurrent.n0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f59514b.L0();
                        }
                    });
                }
            }
        }
    }

    private o0() {
    }

    public static <V> p0<V> a(Future<V> future) {
        return future instanceof p0 ? (p0) future : new a(future);
    }

    public static <V> p0<V> b(Future<V> future, Executor executor) {
        com.google.common.base.w.E(executor);
        return future instanceof p0 ? (p0) future : new a(future, executor);
    }
}

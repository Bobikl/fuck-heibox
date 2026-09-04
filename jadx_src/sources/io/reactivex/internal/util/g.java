package io.reactivex.internal.util;

import io.reactivex.g0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: HalfSerializer.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    private g() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(g0<?> g0Var, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thC = atomicThrowable.c();
            if (thC != null) {
                g0Var.onError(thC);
            } else {
                g0Var.onComplete();
            }
        }
    }

    public static void b(org.reactivestreams.d<?> dVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thC = atomicThrowable.c();
            if (thC != null) {
                dVar.onError(thC);
            } else {
                dVar.onComplete();
            }
        }
    }

    public static void c(g0<?> g0Var, Throwable th2, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.a(th2)) {
            io.reactivex.plugins.a.Y(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            g0Var.onError(atomicThrowable.c());
        }
    }

    public static void d(org.reactivestreams.d<?> dVar, Throwable th2, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.a(th2)) {
            io.reactivex.plugins.a.Y(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            dVar.onError(atomicThrowable.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(g0<? super T> g0Var, T t10, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            g0Var.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thC = atomicThrowable.c();
                if (thC != null) {
                    g0Var.onError(thC);
                } else {
                    g0Var.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void f(org.reactivestreams.d<? super T> dVar, T t10, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            dVar.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thC = atomicThrowable.c();
                if (thC != null) {
                    dVar.onError(thC);
                } else {
                    dVar.onComplete();
                }
            }
        }
    }
}

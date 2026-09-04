package com.uber.autodispose;

import io.reactivex.g0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: HalfSerializer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t {
    private t() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(g0<?> g0Var, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thB = atomicThrowable.b();
            if (thB != null) {
                g0Var.onError(thB);
            } else {
                g0Var.onComplete();
            }
        }
    }

    public static void b(org.reactivestreams.d<?> dVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thB = atomicThrowable.b();
            if (thB != null) {
                dVar.onError(thB);
            } else {
                dVar.onComplete();
            }
        }
    }

    public static void c(g0<?> g0Var, Throwable th2, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.a(th2)) {
            io.reactivex.plugins.a.Y(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            g0Var.onError(atomicThrowable.b());
        }
    }

    public static void d(org.reactivestreams.d<?> dVar, Throwable th2, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.a(th2)) {
            io.reactivex.plugins.a.Y(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            dVar.onError(atomicThrowable.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean e(g0<? super T> g0Var, T t10, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            g0Var.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thB = atomicThrowable.b();
                if (thB != null) {
                    g0Var.onError(thB);
                } else {
                    g0Var.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean f(org.reactivestreams.d<? super T> dVar, T t10, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            dVar.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thB = atomicThrowable.b();
                if (thB != null) {
                    dVar.onError(thB);
                } else {
                    dVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}

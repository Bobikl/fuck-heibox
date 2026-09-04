package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Callables.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b(emulated = true)
public final class s {
    private s() {
    }

    @o9.a
    @o9.c
    public static <T> l<T> e(final Callable<T> callable, final u0 u0Var) {
        com.google.common.base.w.E(callable);
        com.google.common.base.w.E(u0Var);
        return new l() { // from class: com.google.common.util.concurrent.r
            @Override // com.google.common.util.concurrent.l
            public final p0 call() {
                return u0Var.submit(callable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g(Object obj) throws Exception {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h(com.google.common.base.c0 c0Var, Callable callable) throws Exception {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zM = m((String) c0Var.get(), threadCurrentThread);
        try {
            return callable.call();
        } finally {
            if (zM) {
                m(name, threadCurrentThread);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(com.google.common.base.c0 c0Var, Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zM = m((String) c0Var.get(), threadCurrentThread);
        try {
            runnable.run();
        } finally {
            if (zM) {
                m(name, threadCurrentThread);
            }
        }
    }

    public static <T> Callable<T> j(@b1 final T t10) {
        return new Callable() { // from class: com.google.common.util.concurrent.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.g(t10);
            }
        };
    }

    @o9.c
    static Runnable k(final Runnable runnable, final com.google.common.base.c0<String> c0Var) {
        com.google.common.base.w.E(c0Var);
        com.google.common.base.w.E(runnable);
        return new Runnable() { // from class: com.google.common.util.concurrent.p
            @Override // java.lang.Runnable
            public final void run() {
                s.i(c0Var, runnable);
            }
        };
    }

    @o9.c
    static <T> Callable<T> l(final Callable<T> callable, final com.google.common.base.c0<String> c0Var) {
        com.google.common.base.w.E(c0Var);
        com.google.common.base.w.E(callable);
        return new Callable() { // from class: com.google.common.util.concurrent.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.h(c0Var, callable);
            }
        };
    }

    @o9.c
    private static boolean m(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}

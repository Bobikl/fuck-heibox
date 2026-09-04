package com.google.common.util.concurrent;

import com.google.common.collect.Sets;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: SimpleTimeLimiter.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.a
@o9.c
public final class j1 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f59487a;

    /* JADX INFO: compiled from: SimpleTimeLimiter.java */
    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f59488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f59489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f59490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f59491e;

        a(Object obj, long j10, TimeUnit timeUnit, Set set) {
            this.f59488b = obj;
            this.f59489c = j10;
            this.f59490d = timeUnit;
            this.f59491e = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object b(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                throw j1.n(e10, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public Object invoke(Object obj, final Method method, @CheckForNull final Object[] objArr) throws Throwable {
            final Object obj2 = this.f59488b;
            return j1.this.h(new Callable() { // from class: com.google.common.util.concurrent.i1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j1.a.b(method, obj2, objArr);
                }
            }, this.f59489c, this.f59490d, this.f59491e.contains(method));
        }
    }

    private j1(ExecutorService executorService) {
        this.f59487a = (ExecutorService) com.google.common.base.w.E(executorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T h(Callable<T> callable, long j10, TimeUnit timeUnit, boolean z10) throws Exception {
        com.google.common.base.w.E(callable);
        com.google.common.base.w.E(timeUnit);
        i(j10);
        Future<T> futureSubmit = this.f59487a.submit(callable);
        try {
            if (!z10) {
                return (T) v1.g(futureSubmit, j10, timeUnit);
            }
            try {
                return futureSubmit.get(j10, timeUnit);
            } catch (InterruptedException e10) {
                futureSubmit.cancel(true);
                throw e10;
            }
        } catch (ExecutionException e11) {
            throw n(e11, true);
        } catch (TimeoutException e12) {
            futureSubmit.cancel(true);
            throw new UncheckedTimeoutException(e12);
        }
    }

    private static void i(long j10) {
        com.google.common.base.w.p(j10 > 0, "timeout must be positive: %s", j10);
    }

    public static j1 j(ExecutorService executorService) {
        return new j1(executorService);
    }

    private static boolean k(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static Set<Method> l(Class<?> cls) {
        HashSet hashSetU = Sets.u();
        for (Method method : cls.getMethods()) {
            if (k(method)) {
                hashSetU.add(method);
            }
        }
        return hashSetU;
    }

    private static <T> T m(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception n(Exception exc, boolean z10) throws Exception {
        Throwable cause = exc.getCause();
        if (cause == null) {
            throw exc;
        }
        if (z10) {
            cause.setStackTrace((StackTraceElement[]) com.google.common.collect.u1.f(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw exc;
    }

    private void o(Throwable th2) throws ExecutionException {
        if (th2 instanceof Error) {
            throw new ExecutionError((Error) th2);
        }
        if (!(th2 instanceof RuntimeException)) {
            throw new ExecutionException(th2);
        }
        throw new UncheckedExecutionException(th2);
    }

    private void p(Throwable th2) {
        if (!(th2 instanceof Error)) {
            throw new UncheckedExecutionException(th2);
        }
        throw new ExecutionError((Error) th2);
    }

    @Override // com.google.common.util.concurrent.t1
    public void a(Runnable runnable, long j10, TimeUnit timeUnit) throws TimeoutException {
        com.google.common.base.w.E(runnable);
        com.google.common.base.w.E(timeUnit);
        i(j10);
        Future<?> futureSubmit = this.f59487a.submit(runnable);
        try {
            v1.g(futureSubmit, j10, timeUnit);
        } catch (ExecutionException e10) {
            p(e10.getCause());
            throw new AssertionError();
        } catch (TimeoutException e11) {
            futureSubmit.cancel(true);
            throw e11;
        }
    }

    @Override // com.google.common.util.concurrent.t1
    @s9.a
    public <T> T b(Callable<T> callable, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        com.google.common.base.w.E(callable);
        com.google.common.base.w.E(timeUnit);
        i(j10);
        Future<T> futureSubmit = this.f59487a.submit(callable);
        try {
            return (T) v1.g(futureSubmit, j10, timeUnit);
        } catch (ExecutionException e10) {
            o(e10.getCause());
            throw new AssertionError();
        } catch (TimeoutException e11) {
            futureSubmit.cancel(true);
            throw e11;
        }
    }

    @Override // com.google.common.util.concurrent.t1
    @s9.a
    public <T> T c(Callable<T> callable, long j10, TimeUnit timeUnit) throws Throwable {
        com.google.common.base.w.E(callable);
        com.google.common.base.w.E(timeUnit);
        i(j10);
        Future<T> futureSubmit = this.f59487a.submit(callable);
        try {
            return futureSubmit.get(j10, timeUnit);
        } catch (InterruptedException e10) {
            e = e10;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e11) {
            o(e11.getCause());
            throw new AssertionError();
        } catch (TimeoutException e12) {
            e = e12;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.t1
    public void d(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        com.google.common.base.w.E(runnable);
        com.google.common.base.w.E(timeUnit);
        i(j10);
        Future<?> futureSubmit = this.f59487a.submit(runnable);
        try {
            futureSubmit.get(j10, timeUnit);
        } catch (InterruptedException e10) {
            e = e10;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e11) {
            p(e11.getCause());
            throw new AssertionError();
        } catch (TimeoutException e12) {
            e = e12;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.t1
    public <T> T e(T t10, Class<T> cls, long j10, TimeUnit timeUnit) {
        com.google.common.base.w.E(t10);
        com.google.common.base.w.E(cls);
        com.google.common.base.w.E(timeUnit);
        i(j10);
        com.google.common.base.w.e(cls.isInterface(), "interfaceType must be an interface type");
        return (T) m(cls, new a(t10, j10, timeUnit, l(cls)));
    }
}

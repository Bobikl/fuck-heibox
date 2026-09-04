package com.google.common.util.concurrent;

import com.google.common.collect.Ordering;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public final class FuturesGetChecked {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Ordering<Constructor<?>> f59312a = Ordering.z().D(new a()).E();

    @o9.d
    public static class GetCheckedTypeValidatorHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f59313a = a();

        public enum WeakSetValidator implements b {
            INSTANCE;

            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.FuturesGetChecked.b
            public void validateClass(Class<? extends Exception> cls) {
                Iterator<WeakReference<Class<? extends Exception>>> it = validClasses.iterator();
                while (it.hasNext()) {
                    if (cls.equals(it.next().get())) {
                        return;
                    }
                }
                FuturesGetChecked.b(cls);
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        GetCheckedTypeValidatorHolder() {
        }

        static b a() {
            return FuturesGetChecked.k();
        }
    }

    public class a implements com.google.common.base.n<Constructor<?>, Boolean> {
        a() {
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }

    @o9.d
    public interface b {
        void validateClass(Class<? extends Exception> cls);
    }

    private FuturesGetChecked() {
    }

    private static b a() {
        return GetCheckedTypeValidatorHolder.f59313a;
    }

    @o9.d
    static void b(Class<? extends Exception> cls) {
        com.google.common.base.w.u(g(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        com.google.common.base.w.u(f(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    @s9.a
    @b1
    @o9.d
    static <V, X extends Exception> V c(b bVar, Future<V> future, Class<X> cls) throws Exception {
        bVar.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw i(cls, e10);
        } catch (ExecutionException e11) {
            l(e11.getCause(), cls);
            throw new AssertionError();
        }
    }

    @s9.a
    @b1
    static <V, X extends Exception> V d(Future<V> future, Class<X> cls) throws Exception {
        return (V) c(a(), future, cls);
    }

    @s9.a
    @b1
    static <V, X extends Exception> V e(Future<V> future, Class<X> cls, long j10, TimeUnit timeUnit) throws Exception {
        a().validateClass(cls);
        try {
            return future.get(j10, timeUnit);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw i(cls, e10);
        } catch (ExecutionException e11) {
            l(e11.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e12) {
            throw i(cls, e12);
        }
    }

    private static boolean f(Class<? extends Exception> cls) {
        try {
            i(cls, new Exception());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @o9.d
    static boolean g(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    @CheckForNull
    private static <X> X h(Constructor<X> constructor, Throwable th2) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            Class<?> cls = parameterTypes[i10];
            if (cls.equals(String.class)) {
                objArr[i10] = th2.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i10] = th2;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static <X extends Exception> X i(Class<X> cls, Throwable th2) {
        Iterator it = j(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            X x10 = (X) h((Constructor) it.next(), th2);
            if (x10 != null) {
                if (x10.getCause() == null) {
                    x10.initCause(th2);
                }
                return x10;
            }
        }
        String strValueOf = String.valueOf(cls);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 82);
        sb2.append("No appropriate constructor for exception of type ");
        sb2.append(strValueOf);
        sb2.append(" in response to chained exception");
        throw new IllegalArgumentException(sb2.toString(), th2);
    }

    private static <X extends Exception> List<Constructor<X>> j(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f59312a.F(list);
    }

    @o9.d
    static b k() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    private static <X extends Exception> void l(Throwable th2, Class<X> cls) throws Exception {
        if (th2 instanceof Error) {
            throw new ExecutionError((Error) th2);
        }
        if (!(th2 instanceof RuntimeException)) {
            throw i(cls, th2);
        }
        throw new UncheckedExecutionException(th2);
    }
}

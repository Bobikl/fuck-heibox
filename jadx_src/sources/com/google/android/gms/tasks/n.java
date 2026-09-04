package com.google.android.gms.tasks;

import android.os.Looper;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class n {
    private n() {
    }

    public static <TResult> TResult a(@androidx.annotation.n0 k<TResult> kVar) throws ExecutionException, InterruptedException {
        com.google.android.gms.common.internal.p.j();
        com.google.android.gms.common.internal.p.m(kVar, "Task must not be null");
        if (kVar.u()) {
            return (TResult) o(kVar);
        }
        s sVar = new s(null);
        p(kVar, sVar);
        sVar.a();
        return (TResult) o(kVar);
    }

    public static <TResult> TResult b(@androidx.annotation.n0 k<TResult> kVar, long j10, @androidx.annotation.n0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.p.j();
        com.google.android.gms.common.internal.p.m(kVar, "Task must not be null");
        com.google.android.gms.common.internal.p.m(timeUnit, "TimeUnit must not be null");
        if (kVar.u()) {
            return (TResult) o(kVar);
        }
        s sVar = new s(null);
        p(kVar, sVar);
        if (sVar.b(j10, timeUnit)) {
            return (TResult) o(kVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @androidx.annotation.n0
    @Deprecated
    public static <TResult> k<TResult> c(@androidx.annotation.n0 Callable<TResult> callable) {
        return d(m.f52778a, callable);
    }

    @androidx.annotation.n0
    @Deprecated
    public static <TResult> k<TResult> d(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 Callable<TResult> callable) {
        com.google.android.gms.common.internal.p.m(executor, "Executor must not be null");
        com.google.android.gms.common.internal.p.m(callable, "Callback must not be null");
        q0 q0Var = new q0();
        executor.execute(new t0(q0Var, callable));
        return q0Var;
    }

    @androidx.annotation.n0
    public static <TResult> k<TResult> e() {
        q0 q0Var = new q0();
        q0Var.A();
        return q0Var;
    }

    @androidx.annotation.n0
    public static <TResult> k<TResult> f(@androidx.annotation.n0 Exception exc) {
        q0 q0Var = new q0();
        q0Var.y(exc);
        return q0Var;
    }

    @androidx.annotation.n0
    public static <TResult> k<TResult> g(TResult tresult) {
        q0 q0Var = new q0();
        q0Var.z(tresult);
        return q0Var;
    }

    @androidx.annotation.n0
    public static k<Void> h(@androidx.annotation.p0 Collection<? extends k<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return g(null);
        }
        Iterator<? extends k<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        q0 q0Var = new q0();
        u uVar = new u(collection.size(), q0Var);
        Iterator<? extends k<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            p(it2.next(), uVar);
        }
        return q0Var;
    }

    @androidx.annotation.n0
    public static k<Void> i(@androidx.annotation.p0 k<?>... kVarArr) {
        return (kVarArr == null || kVarArr.length == 0) ? g(null) : h(Arrays.asList(kVarArr));
    }

    @androidx.annotation.n0
    public static k<List<k<?>>> j(@androidx.annotation.p0 Collection<? extends k<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return g(Collections.emptyList());
        }
        return h(collection).p(m.f52778a, new q(collection));
    }

    @androidx.annotation.n0
    public static k<List<k<?>>> k(@androidx.annotation.p0 k<?>... kVarArr) {
        return (kVarArr == null || kVarArr.length == 0) ? g(Collections.emptyList()) : j(Arrays.asList(kVarArr));
    }

    @androidx.annotation.n0
    public static <TResult> k<List<TResult>> l(@androidx.annotation.p0 Collection<? extends k> collection) {
        if (collection == null || collection.isEmpty()) {
            return g(Collections.emptyList());
        }
        return (k<List<TResult>>) h(collection).n(m.f52778a, new p(collection));
    }

    @androidx.annotation.n0
    public static <TResult> k<List<TResult>> m(@androidx.annotation.p0 k... kVarArr) {
        return (kVarArr == null || kVarArr.length == 0) ? g(Collections.emptyList()) : l(Arrays.asList(kVarArr));
    }

    @androidx.annotation.n0
    public static <T> k<T> n(@androidx.annotation.n0 k<T> kVar, long j10, @androidx.annotation.n0 TimeUnit timeUnit) {
        com.google.android.gms.common.internal.p.m(kVar, "Task must not be null");
        com.google.android.gms.common.internal.p.b(j10 > 0, "Timeout must be positive");
        com.google.android.gms.common.internal.p.m(timeUnit, "TimeUnit must not be null");
        final v vVar = new v();
        final l lVar = new l(vVar);
        final b9.a aVar = new b9.a(Looper.getMainLooper());
        aVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.r0
            @Override // java.lang.Runnable
            public final void run() {
                lVar.d(new TimeoutException());
            }
        }, timeUnit.toMillis(j10));
        kVar.e(new e() { // from class: com.google.android.gms.tasks.s0
            @Override // com.google.android.gms.tasks.e
            public final void a(k kVar2) {
                b9.a aVar2 = aVar;
                l lVar2 = lVar;
                v vVar2 = vVar;
                aVar2.removeCallbacksAndMessages(null);
                if (kVar2.v()) {
                    lVar2.e(kVar2.r());
                } else {
                    if (kVar2.t()) {
                        vVar2.c();
                        return;
                    }
                    Exception excQ = kVar2.q();
                    excQ.getClass();
                    lVar2.d(excQ);
                }
            }
        });
        return lVar.a();
    }

    private static Object o(@androidx.annotation.n0 k kVar) throws ExecutionException {
        if (kVar.v()) {
            return kVar.r();
        }
        if (kVar.t()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(kVar.q());
    }

    private static void p(k kVar, t tVar) {
        Executor executor = m.f52779b;
        kVar.l(executor, tVar);
        kVar.i(executor, tVar);
        kVar.c(executor, tVar);
    }
}

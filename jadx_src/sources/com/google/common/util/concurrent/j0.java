package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Futures.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b(emulated = true)
public final class j0 extends l0 {

    /* JADX INFO: compiled from: Futures.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Future f59469b;

        a(Future future) {
            this.f59469b = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59469b.cancel(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* JADX INFO: compiled from: Futures.java */
    public class b<O> implements Future<O> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Future f59470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.n f59471c;

        b(Future future, com.google.common.base.n nVar) {
            this.f59470b = future;
            this.f59471c = nVar;
        }

        private O a(I i10) throws ExecutionException {
            try {
                return (O) this.f59471c.apply(i10);
            } catch (Throwable th2) {
                throw new ExecutionException(th2);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f59470b.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public O get() throws ExecutionException, InterruptedException {
            return a(this.f59470b.get());
        }

        @Override // java.util.concurrent.Future
        public O get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return a(this.f59470b.get(j10, timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f59470b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f59470b.isDone();
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f59472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImmutableList f59473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59474d;

        c(g gVar, ImmutableList immutableList, int i10) {
            this.f59472b = gVar;
            this.f59473c = immutableList;
            this.f59474d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59472b.f(this.f59473c, this.f59474d);
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    public static final class d<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Future<V> f59475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final i0<? super V> f59476c;

        d(Future<V> future, i0<? super V> i0Var) {
            this.f59475b = future;
            this.f59476c = i0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f59475b;
            if ((future instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) future)) != null) {
                this.f59476c.a(thA);
                return;
            }
            try {
                this.f59476c.onSuccess(j0.h(this.f59475b));
            } catch (Error e10) {
                e = e10;
                this.f59476c.a(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f59476c.a(e);
            } catch (ExecutionException e12) {
                this.f59476c.a(e12.getCause());
            }
        }

        public String toString() {
            return com.google.common.base.q.c(this).s(this.f59476c).toString();
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    @s9.a
    @o9.a
    @o9.b
    public static final class e<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f59477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList<p0<? extends V>> f59478b;

        /* JADX INFO: compiled from: Futures.java */
        public class a implements Callable<Void> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f59479b;

            a(e eVar, Runnable runnable) {
                this.f59479b = runnable;
            }

            @Override // java.util.concurrent.Callable
            @CheckForNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f59479b.run();
                return null;
            }
        }

        private e(boolean z10, ImmutableList<p0<? extends V>> immutableList) {
            this.f59477a = z10;
            this.f59478b = immutableList;
        }

        /* synthetic */ e(boolean z10, ImmutableList immutableList, a aVar) {
            this(z10, immutableList);
        }

        @s9.a
        public <C> p0<C> a(Callable<C> callable, Executor executor) {
            return new CombinedFuture(this.f59478b, this.f59477a, executor, callable);
        }

        public <C> p0<C> b(l<C> lVar, Executor executor) {
            return new CombinedFuture(this.f59478b, this.f59477a, executor, lVar);
        }

        public p0<?> c(Runnable runnable, Executor executor) {
            return a(new a(this, runnable), executor);
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    public static final class f<T> extends AbstractFuture<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @CheckForNull
        private g<T> f59480j;

        private f(g<T> gVar) {
            this.f59480j = gVar;
        }

        /* synthetic */ f(g gVar, a aVar) {
            this(gVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            g<T> gVar = this.f59480j;
            if (!super.cancel(z10)) {
                return false;
            }
            Objects.requireNonNull(gVar);
            gVar.g(z10);
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void m() {
            this.f59480j = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        @CheckForNull
        protected String y() {
            g<T> gVar = this.f59480j;
            if (gVar == null) {
                return null;
            }
            int length = ((g) gVar).f59484d.length;
            int i10 = ((g) gVar).f59483c.get();
            StringBuilder sb2 = new StringBuilder(49);
            sb2.append("inputCount=[");
            sb2.append(length);
            sb2.append("], remaining=[");
            sb2.append(i10);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    public static final class g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f59481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f59482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f59483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p0<? extends T>[] f59484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile int f59485e;

        private g(p0<? extends T>[] p0VarArr) {
            this.f59481a = false;
            this.f59482b = true;
            this.f59485e = 0;
            this.f59484d = p0VarArr;
            this.f59483c = new AtomicInteger(p0VarArr.length);
        }

        /* synthetic */ g(p0[] p0VarArr, a aVar) {
            this(p0VarArr);
        }

        private void e() {
            if (this.f59483c.decrementAndGet() == 0 && this.f59481a) {
                for (p0<? extends T> p0Var : this.f59484d) {
                    if (p0Var != null) {
                        p0Var.cancel(this.f59482b);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(ImmutableList<AbstractFuture<T>> immutableList, int i10) {
            p0<? extends T> p0Var = this.f59484d[i10];
            Objects.requireNonNull(p0Var);
            p0<? extends T> p0Var2 = p0Var;
            this.f59484d[i10] = null;
            for (int i11 = this.f59485e; i11 < immutableList.size(); i11++) {
                if (immutableList.get(i11).D(p0Var2)) {
                    e();
                    this.f59485e = i11 + 1;
                    return;
                }
            }
            this.f59485e = immutableList.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(boolean z10) {
            this.f59481a = true;
            if (!z10) {
                this.f59482b = false;
            }
            e();
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    public static final class h<V> extends AbstractFuture.i<V> implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @CheckForNull
        private p0<V> f59486j;

        h(p0<V> p0Var) {
            this.f59486j = p0Var;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void m() {
            this.f59486j = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0<V> p0Var = this.f59486j;
            if (p0Var != null) {
                D(p0Var);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        @CheckForNull
        protected String y() {
            p0<V> p0Var = this.f59486j;
            if (p0Var == null) {
                return null;
            }
            String strValueOf = String.valueOf(p0Var);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 11);
            sb2.append("delegate=[");
            sb2.append(strValueOf);
            sb2.append("]");
            return sb2.toString();
        }
    }

    private j0() {
    }

    @SafeVarargs
    @o9.a
    public static <V> e<V> A(p0<? extends V>... p0VarArr) {
        return new e<>(false, ImmutableList.x(p0VarArr), null);
    }

    @o9.a
    public static <V> e<V> B(Iterable<? extends p0<? extends V>> iterable) {
        return new e<>(true, ImmutableList.u(iterable), null);
    }

    @SafeVarargs
    @o9.a
    public static <V> e<V> C(p0<? extends V>... p0VarArr) {
        return new e<>(true, ImmutableList.x(p0VarArr), null);
    }

    @o9.a
    @o9.c
    public static <V> p0<V> D(p0<V> p0Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return p0Var.isDone() ? p0Var : TimeoutFuture.Q(p0Var, j10, timeUnit, scheduledExecutorService);
    }

    private static void E(Throwable th2) {
        if (!(th2 instanceof Error)) {
            throw new UncheckedExecutionException(th2);
        }
        throw new ExecutionError((Error) th2);
    }

    public static <V> void a(p0<V> p0Var, i0<? super V> i0Var, Executor executor) {
        com.google.common.base.w.E(i0Var);
        p0Var.V(new d(p0Var, i0Var), executor);
    }

    @o9.a
    public static <V> p0<List<V>> b(Iterable<? extends p0<? extends V>> iterable) {
        return new t.a(ImmutableList.u(iterable), true);
    }

    @SafeVarargs
    @o9.a
    public static <V> p0<List<V>> c(p0<? extends V>... p0VarArr) {
        return new t.a(ImmutableList.x(p0VarArr), true);
    }

    @o9.a
    @c1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> p0<V> d(p0<? extends V> p0Var, Class<X> cls, com.google.common.base.n<? super X, ? extends V> nVar, Executor executor) {
        return com.google.common.util.concurrent.a.N(p0Var, cls, nVar, executor);
    }

    @o9.a
    @c1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> p0<V> e(p0<? extends V> p0Var, Class<X> cls, m<? super X, ? extends V> mVar, Executor executor) {
        return com.google.common.util.concurrent.a.O(p0Var, cls, mVar, executor);
    }

    @s9.a
    @b1
    @o9.a
    @o9.c
    public static <V, X extends Exception> V f(Future<V> future, Class<X> cls) throws Exception {
        return (V) FuturesGetChecked.d(future, cls);
    }

    @s9.a
    @b1
    @o9.a
    @o9.c
    public static <V, X extends Exception> V g(Future<V> future, Class<X> cls, long j10, TimeUnit timeUnit) throws Exception {
        return (V) FuturesGetChecked.e(future, cls, j10, timeUnit);
    }

    @s9.a
    @b1
    public static <V> V h(Future<V> future) throws ExecutionException {
        com.google.common.base.w.x0(future.isDone(), "Future was expected to be done: %s", future);
        return (V) v1.f(future);
    }

    @s9.a
    @b1
    public static <V> V i(Future<V> future) {
        com.google.common.base.w.E(future);
        try {
            return (V) v1.f(future);
        } catch (ExecutionException e10) {
            E(e10.getCause());
            throw new AssertionError();
        }
    }

    private static <T> p0<? extends T>[] j(Iterable<? extends p0<? extends T>> iterable) {
        return (p0[]) (iterable instanceof Collection ? (Collection) iterable : ImmutableList.u(iterable)).toArray(new p0[0]);
    }

    public static <V> p0<V> k() {
        m0.a<Object> aVar = m0.a.f59512j;
        return aVar != null ? aVar : new m0.a();
    }

    public static <V> p0<V> l(Throwable th2) {
        com.google.common.base.w.E(th2);
        return new m0.b(th2);
    }

    public static <V> p0<V> m(@b1 V v10) {
        return v10 == null ? (p0<V>) m0.f59509c : new m0(v10);
    }

    public static p0<Void> n() {
        return m0.f59509c;
    }

    public static <T> ImmutableList<p0<T>> o(Iterable<? extends p0<? extends T>> iterable) {
        p0[] p0VarArrJ = j(iterable);
        a aVar = null;
        g gVar = new g(p0VarArrJ, aVar);
        ImmutableList.a aVarS = ImmutableList.s(p0VarArrJ.length);
        for (int i10 = 0; i10 < p0VarArrJ.length; i10++) {
            aVarS.a(new f(gVar, aVar));
        }
        ImmutableList<p0<T>> immutableListE = aVarS.e();
        for (int i11 = 0; i11 < p0VarArrJ.length; i11++) {
            p0VarArrJ[i11].V(new c(gVar, immutableListE, i11), y0.c());
        }
        return immutableListE;
    }

    @o9.a
    @o9.c
    public static <I, O> Future<O> p(Future<I> future, com.google.common.base.n<? super I, ? extends O> nVar) {
        com.google.common.base.w.E(future);
        com.google.common.base.w.E(nVar);
        return new b(future, nVar);
    }

    public static <V> p0<V> q(p0<V> p0Var) {
        if (p0Var.isDone()) {
            return p0Var;
        }
        h hVar = new h(p0Var);
        p0Var.V(hVar, y0.c());
        return hVar;
    }

    @o9.c
    public static <O> p0<O> r(l<O> lVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TrustedListenableFutureTask trustedListenableFutureTaskN = TrustedListenableFutureTask.N(lVar);
        trustedListenableFutureTaskN.V(new a(scheduledExecutorService.schedule(trustedListenableFutureTaskN, j10, timeUnit)), y0.c());
        return trustedListenableFutureTaskN;
    }

    public static p0<Void> s(Runnable runnable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskO = TrustedListenableFutureTask.O(runnable, null);
        executor.execute(trustedListenableFutureTaskO);
        return trustedListenableFutureTaskO;
    }

    public static <O> p0<O> t(Callable<O> callable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskP = TrustedListenableFutureTask.P(callable);
        executor.execute(trustedListenableFutureTaskP);
        return trustedListenableFutureTaskP;
    }

    public static <O> p0<O> u(l<O> lVar, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskN = TrustedListenableFutureTask.N(lVar);
        executor.execute(trustedListenableFutureTaskN);
        return trustedListenableFutureTaskN;
    }

    @o9.a
    public static <V> p0<List<V>> v(Iterable<? extends p0<? extends V>> iterable) {
        return new t.a(ImmutableList.u(iterable), false);
    }

    @SafeVarargs
    @o9.a
    public static <V> p0<List<V>> w(p0<? extends V>... p0VarArr) {
        return new t.a(ImmutableList.x(p0VarArr), false);
    }

    @o9.a
    public static <I, O> p0<O> x(p0<I> p0Var, com.google.common.base.n<? super I, ? extends O> nVar, Executor executor) {
        return com.google.common.util.concurrent.h.N(p0Var, nVar, executor);
    }

    @o9.a
    public static <I, O> p0<O> y(p0<I> p0Var, m<? super I, ? extends O> mVar, Executor executor) {
        return com.google.common.util.concurrent.h.O(p0Var, mVar, executor);
    }

    @o9.a
    public static <V> e<V> z(Iterable<? extends p0<? extends V>> iterable) {
        return new e<>(false, ImmutableList.u(iterable), null);
    }
}

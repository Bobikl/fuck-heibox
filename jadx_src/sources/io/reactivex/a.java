package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableCache;
import io.reactivex.internal.operators.completable.CompletableConcat;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.completable.CompletableDelay;
import io.reactivex.internal.operators.completable.CompletableDoFinally;
import io.reactivex.internal.operators.completable.CompletableMerge;
import io.reactivex.internal.operators.completable.CompletableMergeArray;
import io.reactivex.internal.operators.completable.CompletableMergeIterable;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableResumeNext;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable;
import io.reactivex.internal.operators.completable.CompletableTimer;
import io.reactivex.internal.operators.completable.CompletableUsing;
import io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.internal.operators.mixed.CompletableAndThenPublisher;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.TestObserver;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Completable.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements g {
    @jh.e
    @jh.c
    @jh.g("none")
    public static a A(e eVar) {
        io.reactivex.internal.functions.a.g(eVar, "source is null");
        return io.reactivex.plugins.a.O(new CompletableCreate(eVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a B(Callable<? extends g> callable) {
        io.reactivex.internal.functions.a.g(callable, "completableSupplier");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.b(callable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    private a N(kh.g<? super io.reactivex.disposables.b> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.a aVar2, kh.a aVar3, kh.a aVar4) {
        io.reactivex.internal.functions.a.g(gVar, "onSubscribe is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.a.g(aVar2, "onTerminate is null");
        io.reactivex.internal.functions.a.g(aVar3, "onAfterTerminate is null");
        io.reactivex.internal.functions.a.g(aVar4, "onDispose is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.w(this, gVar, gVar2, aVar, aVar2, aVar3, aVar4));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a Q(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "error is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.g(th2));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a R(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.a.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.h(callable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a S(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "run is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.i(aVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a T(Callable<?> callable) {
        io.reactivex.internal.functions.a.g(callable, "callable is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.j(callable));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    private a T0(long j10, TimeUnit timeUnit, h0 h0Var, g gVar) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.x(this, j10, timeUnit, h0Var, gVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a U(Future<?> future) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        return S(Functions.j(future));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public static a U0(long j10, TimeUnit timeUnit) {
        return V0(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> a V(w<T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "maybe is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.maybe.x(wVar));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public static a V0(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new CompletableTimer(j10, timeUnit, h0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> a W(e0<T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "observable is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.k(e0Var));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> a X(org.reactivestreams.c<T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "publisher is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.l(cVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a Y(Runnable runnable) {
        io.reactivex.internal.functions.a.g(runnable, "run is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.m(runnable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> a Z(o0<T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "single is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.n(o0Var));
    }

    private static NullPointerException Z0(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a d0(Iterable<? extends g> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.O(new CompletableMergeIterable(iterable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a d1(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "source is null");
        if (gVar instanceof a) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.o(gVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public static a e0(org.reactivestreams.c<? extends g> cVar) {
        return g0(cVar, Integer.MAX_VALUE, false);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a f(Iterable<? extends g> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.a(null, iterable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static a f0(org.reactivestreams.c<? extends g> cVar, int i10) {
        return g0(cVar, i10, false);
    }

    @jh.c
    @jh.g("none")
    public static <R> a f1(Callable<R> callable, kh.o<? super R, ? extends g> oVar, kh.g<? super R> gVar) {
        return g1(callable, oVar, gVar, true);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a g(g... gVarArr) {
        io.reactivex.internal.functions.a.g(gVarArr, "sources is null");
        if (gVarArr.length == 0) {
            return t();
        }
        return gVarArr.length == 1 ? h1(gVarArr[0]) : io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.a(gVarArr, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    private static a g0(org.reactivestreams.c<? extends g> cVar, int i10, boolean z10) {
        io.reactivex.internal.functions.a.g(cVar, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.O(new CompletableMerge(cVar, i10, z10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <R> a g1(Callable<R> callable, kh.o<? super R, ? extends g> oVar, kh.g<? super R> gVar, boolean z10) {
        io.reactivex.internal.functions.a.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.a.g(oVar, "completableFunction is null");
        io.reactivex.internal.functions.a.g(gVar, "disposer is null");
        return io.reactivex.plugins.a.O(new CompletableUsing(callable, oVar, gVar, z10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a h0(g... gVarArr) {
        io.reactivex.internal.functions.a.g(gVarArr, "sources is null");
        if (gVarArr.length == 0) {
            return t();
        }
        return gVarArr.length == 1 ? h1(gVarArr[0]) : io.reactivex.plugins.a.O(new CompletableMergeArray(gVarArr));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a h1(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "source is null");
        return gVar instanceof a ? io.reactivex.plugins.a.O((a) gVar) : io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.o(gVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a i0(g... gVarArr) {
        io.reactivex.internal.functions.a.g(gVarArr, "sources is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.s(gVarArr));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a j0(Iterable<? extends g> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.t(iterable));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public static a k0(org.reactivestreams.c<? extends g> cVar) {
        return g0(cVar, Integer.MAX_VALUE, true);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static a l0(org.reactivestreams.c<? extends g> cVar, int i10) {
        return g0(cVar, i10, true);
    }

    @jh.c
    @jh.g("none")
    public static a n0() {
        return io.reactivex.plugins.a.O(io.reactivex.internal.operators.completable.u.f119835b);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a t() {
        return io.reactivex.plugins.a.O(io.reactivex.internal.operators.completable.f.f119809b);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a v(Iterable<? extends g> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.O(new CompletableConcatIterable(iterable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static a w(org.reactivestreams.c<? extends g> cVar) {
        return x(cVar, 2);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static a x(org.reactivestreams.c<? extends g> cVar, int i10) {
        io.reactivex.internal.functions.a.g(cVar, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.O(new CompletableConcat(cVar, i10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static a y(g... gVarArr) {
        io.reactivex.internal.functions.a.g(gVarArr, "sources is null");
        if (gVarArr.length == 0) {
            return t();
        }
        return gVarArr.length == 1 ? h1(gVarArr[0]) : io.reactivex.plugins.a.O(new CompletableConcatArray(gVarArr));
    }

    @jh.c
    @jh.g("none")
    public final a A0(kh.d<? super Integer, ? super Throwable> dVar) {
        return X(X0().q5(dVar));
    }

    @jh.c
    @jh.g("none")
    public final a B0(kh.r<? super Throwable> rVar) {
        return X(X0().r5(rVar));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final a C(long j10, TimeUnit timeUnit) {
        return E(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @jh.c
    @jh.g("none")
    public final a C0(kh.o<? super j<Throwable>, ? extends org.reactivestreams.c<?>> oVar) {
        return X(X0().t5(oVar));
    }

    @jh.c
    @jh.g("custom")
    public final a D(long j10, TimeUnit timeUnit, h0 h0Var) {
        return E(j10, timeUnit, h0Var, false);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a D0(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return y(gVar, this);
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final a E(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new CompletableDelay(this, j10, timeUnit, h0Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <T> j<T> E0(org.reactivestreams.c<T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return X0().c6(cVar);
    }

    @jh.d
    @jh.c
    @jh.g(jh.g.E0)
    public final a F(long j10, TimeUnit timeUnit) {
        return G(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <T> z<T> F0(z<T> zVar) {
        io.reactivex.internal.functions.a.g(zVar, "other is null");
        return zVar.m1(a1());
    }

    @jh.d
    @jh.c
    @jh.g("custom")
    public final a G(long j10, TimeUnit timeUnit, h0 h0Var) {
        return V0(j10, timeUnit, h0Var).i(this);
    }

    @jh.g("none")
    public final io.reactivex.disposables.b G0() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        d(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    @jh.c
    @jh.g("none")
    public final a H(kh.a aVar) {
        kh.g<? super io.reactivex.disposables.b> gVarH = Functions.h();
        kh.g<? super Throwable> gVarH2 = Functions.h();
        kh.a aVar2 = Functions.f119558c;
        return N(gVarH, gVarH2, aVar2, aVar2, aVar, aVar2);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b H0(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(aVar);
        d(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a I(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.O(new CompletableDoFinally(this, aVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b I0(kh.a aVar, kh.g<? super Throwable> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(gVar, aVar);
        d(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    @jh.c
    @jh.g("none")
    public final a J(kh.a aVar) {
        kh.g<? super io.reactivex.disposables.b> gVarH = Functions.h();
        kh.g<? super Throwable> gVarH2 = Functions.h();
        kh.a aVar2 = Functions.f119558c;
        return N(gVarH, gVarH2, aVar, aVar2, aVar2, aVar2);
    }

    protected abstract void J0(d dVar);

    @jh.c
    @jh.g("none")
    public final a K(kh.a aVar) {
        kh.g<? super io.reactivex.disposables.b> gVarH = Functions.h();
        kh.g<? super Throwable> gVarH2 = Functions.h();
        kh.a aVar2 = Functions.f119558c;
        return N(gVarH, gVarH2, aVar2, aVar2, aVar2, aVar);
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final a K0(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new CompletableSubscribeOn(this, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final a L(kh.g<? super Throwable> gVar) {
        kh.g<? super io.reactivex.disposables.b> gVarH = Functions.h();
        kh.a aVar = Functions.f119558c;
        return N(gVarH, gVar, aVar, aVar, aVar, aVar);
    }

    @jh.c
    @jh.g("none")
    public final <E extends d> E L0(E e10) {
        d(e10);
        return e10;
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a M(kh.g<? super Throwable> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onEvent is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.e(this, gVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a M0(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return io.reactivex.plugins.a.O(new CompletableTakeUntilCompletable(this, gVar));
    }

    @jh.c
    @jh.g("none")
    public final TestObserver<Void> N0() {
        TestObserver<Void> testObserver = new TestObserver<>();
        d(testObserver);
        return testObserver;
    }

    @jh.c
    @jh.g("none")
    public final a O(kh.g<? super io.reactivex.disposables.b> gVar) {
        kh.g<? super Throwable> gVarH = Functions.h();
        kh.a aVar = Functions.f119558c;
        return N(gVar, gVarH, aVar, aVar, aVar, aVar);
    }

    @jh.c
    @jh.g("none")
    public final TestObserver<Void> O0(boolean z10) {
        TestObserver<Void> testObserver = new TestObserver<>();
        if (z10) {
            testObserver.cancel();
        }
        d(testObserver);
        return testObserver;
    }

    @jh.c
    @jh.g("none")
    public final a P(kh.a aVar) {
        kh.g<? super io.reactivex.disposables.b> gVarH = Functions.h();
        kh.g<? super Throwable> gVarH2 = Functions.h();
        kh.a aVar2 = Functions.f119558c;
        return N(gVarH, gVarH2, aVar2, aVar, aVar2, aVar2);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final a P0(long j10, TimeUnit timeUnit) {
        return T0(j10, timeUnit, io.reactivex.schedulers.b.a(), null);
    }

    @jh.e
    @jh.c
    @jh.g(jh.g.E0)
    public final a Q0(long j10, TimeUnit timeUnit, g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return T0(j10, timeUnit, io.reactivex.schedulers.b.a(), gVar);
    }

    @jh.c
    @jh.g("custom")
    public final a R0(long j10, TimeUnit timeUnit, h0 h0Var) {
        return T0(j10, timeUnit, h0Var, null);
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final a S0(long j10, TimeUnit timeUnit, h0 h0Var, g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return T0(j10, timeUnit, h0Var, gVar);
    }

    @jh.c
    @jh.g("none")
    public final <U> U W0(kh.o<? super a, U> oVar) {
        try {
            return (U) ((kh.o) io.reactivex.internal.functions.a.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <T> j<T> X0() {
        return this instanceof lh.b ? ((lh.b) this).c() : io.reactivex.plugins.a.P(new io.reactivex.internal.operators.completable.y(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <T> q<T> Y0() {
        return this instanceof lh.c ? ((lh.c) this).b() : io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.r(this));
    }

    @jh.c
    @jh.g("none")
    public final a a0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.p(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <T> z<T> a1() {
        return this instanceof lh.d ? ((lh.d) this).a() : io.reactivex.plugins.a.R(new io.reactivex.internal.operators.completable.z(this));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a b0(f fVar) {
        io.reactivex.internal.functions.a.g(fVar, "onLift is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.q(this, fVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <T> i0<T> b1(Callable<? extends T> callable) {
        io.reactivex.internal.functions.a.g(callable, "completionValueSupplier is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.completable.a0(this, callable, null));
    }

    @jh.d
    @jh.c
    @jh.g("none")
    public final <T> i0<y<T>> c0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.completable.r(this));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <T> i0<T> c1(T t10) {
        io.reactivex.internal.functions.a.g(t10, "completionValue is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.completable.a0(this, null, t10));
    }

    @Override // io.reactivex.g
    @jh.g("none")
    public final void d(d dVar) {
        io.reactivex.internal.functions.a.g(dVar, "observer is null");
        try {
            d dVarD0 = io.reactivex.plugins.a.d0(this, dVar);
            io.reactivex.internal.functions.a.g(dVarD0, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            J0(dVarD0);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
            throw Z0(th2);
        }
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final a e1(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.d(this, h0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a h(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return g(this, gVar);
    }

    @jh.c
    @jh.g("none")
    public final a i(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "next is null");
        return io.reactivex.plugins.a.O(new CompletableAndThenCompletable(this, gVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <T> j<T> j(org.reactivestreams.c<T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "next is null");
        return io.reactivex.plugins.a.P(new CompletableAndThenPublisher(this, cVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <T> q<T> k(w<T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "next is null");
        return io.reactivex.plugins.a.Q(new MaybeDelayWithCompletable(wVar, this));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <T> z<T> l(e0<T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "next is null");
        return io.reactivex.plugins.a.R(new CompletableAndThenObservable(this, e0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <T> i0<T> m(o0<T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "next is null");
        return io.reactivex.plugins.a.S(new SingleDelayWithCompletable(o0Var, this));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a m0(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return h0(this, gVar);
    }

    @jh.c
    @jh.g("none")
    public final <R> R n(@jh.e b<? extends R> bVar) {
        return (R) ((b) io.reactivex.internal.functions.a.g(bVar, "converter is null")).b(this);
    }

    @jh.g("none")
    public final void o() {
        io.reactivex.internal.observers.f fVar = new io.reactivex.internal.observers.f();
        d(fVar);
        fVar.b();
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final a o0(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new CompletableObserveOn(this, h0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final boolean p(long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.observers.f fVar = new io.reactivex.internal.observers.f();
        d(fVar);
        return fVar.a(j10, timeUnit);
    }

    @jh.c
    @jh.g("none")
    public final a p0() {
        return q0(Functions.c());
    }

    @jh.f
    @jh.c
    @jh.g("none")
    public final Throwable q() {
        io.reactivex.internal.observers.f fVar = new io.reactivex.internal.observers.f();
        d(fVar);
        return fVar.d();
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a q0(kh.r<? super Throwable> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.v(this, rVar));
    }

    @jh.f
    @jh.c
    @jh.g("none")
    public final Throwable r(long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.observers.f fVar = new io.reactivex.internal.observers.f();
        d(fVar);
        return fVar.f(j10, timeUnit);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a r0(kh.o<? super Throwable, ? extends g> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "errorMapper is null");
        return io.reactivex.plugins.a.O(new CompletableResumeNext(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final a s() {
        return io.reactivex.plugins.a.O(new CompletableCache(this));
    }

    @jh.c
    @jh.g("none")
    public final a s0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.c(this));
    }

    @jh.c
    @jh.g("none")
    public final a t0() {
        return X(X0().T4());
    }

    @jh.c
    @jh.g("none")
    public final a u(h hVar) {
        return h1(((h) io.reactivex.internal.functions.a.g(hVar, "transformer is null")).b(this));
    }

    @jh.c
    @jh.g("none")
    public final a u0(long j10) {
        return X(X0().U4(j10));
    }

    @jh.c
    @jh.g("none")
    public final a v0(kh.e eVar) {
        return X(X0().V4(eVar));
    }

    @jh.c
    @jh.g("none")
    public final a w0(kh.o<? super j<Object>, ? extends org.reactivestreams.c<?>> oVar) {
        return X(X0().W4(oVar));
    }

    @jh.c
    @jh.g("none")
    public final a x0() {
        return X(X0().n5());
    }

    @jh.c
    @jh.g("none")
    public final a y0(long j10) {
        return X(X0().o5(j10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a z(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return io.reactivex.plugins.a.O(new CompletableAndThenCompletable(this, gVar));
    }

    @jh.c
    @jh.g("none")
    public final a z0(long j10, kh.r<? super Throwable> rVar) {
        return X(X0().p5(j10, rVar));
    }
}

package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.maybe.MaybeCache;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeConcatArray;
import io.reactivex.internal.operators.maybe.MaybeConcatArrayDelayError;
import io.reactivex.internal.operators.maybe.MaybeConcatIterable;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.internal.operators.maybe.MaybeDelay;
import io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher;
import io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher;
import io.reactivex.internal.operators.maybe.MaybeDoFinally;
import io.reactivex.internal.operators.maybe.MaybeEqualSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.maybe.MaybeFlatMapIterableFlowable;
import io.reactivex.internal.operators.maybe.MaybeFlatMapNotification;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.MaybeMergeArray;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle;
import io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe;
import io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher;
import io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe;
import io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher;
import io.reactivex.internal.operators.maybe.MaybeTimer;
import io.reactivex.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.maybe.MaybeToPublisher;
import io.reactivex.internal.operators.maybe.MaybeUnsubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeUsing;
import io.reactivex.internal.operators.maybe.MaybeZipArray;
import io.reactivex.internal.operators.mixed.MaybeFlatMapObservable;
import io.reactivex.internal.operators.mixed.MaybeFlatMapPublisher;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.TestObserver;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Maybe.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q<T> implements w<T> {
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> A0(w<? extends T> wVar, w<? extends T> wVar2, w<? extends T> wVar3) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        return G0(wVar, wVar2, wVar3);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> B0(w<? extends T> wVar, w<? extends T> wVar2, w<? extends T> wVar3, w<? extends T> wVar4) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(wVar4, "source4 is null");
        return G0(wVar, wVar2, wVar3, wVar4);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> C0(Iterable<? extends w<? extends T>> iterable) {
        return D0(j.X2(iterable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> D0(org.reactivestreams.c<? extends w<? extends T>> cVar) {
        return E0(cVar, Integer.MAX_VALUE);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> E(u<T> uVar) {
        io.reactivex.internal.functions.a.g(uVar, "onSubscribe is null");
        return io.reactivex.plugins.a.Q(new MaybeCreate(uVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> E0(org.reactivestreams.c<? extends w<? extends T>> cVar, int i10) {
        io.reactivex.internal.functions.a.g(cVar, "source is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.d0(cVar, MaybeToPublisher.instance(), false, i10, 1));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> F0(w<? extends w<? extends T>> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "source is null");
        return io.reactivex.plugins.a.Q(new MaybeFlatten(wVar, Functions.k()));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> G(Callable<? extends w<? extends T>> callable) {
        io.reactivex.internal.functions.a.g(callable, "maybeSupplier is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.e(callable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> G0(w<? extends T>... wVarArr) {
        io.reactivex.internal.functions.a.g(wVarArr, "sources is null");
        if (wVarArr.length == 0) {
            return j.k2();
        }
        return wVarArr.length == 1 ? io.reactivex.plugins.a.P(new MaybeToFlowable(wVarArr[0])) : io.reactivex.plugins.a.P(new MaybeMergeArray(wVarArr));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> H0(w<? extends T>... wVarArr) {
        return wVarArr.length == 0 ? j.k2() : j.R2(wVarArr).B2(MaybeToPublisher.instance(), true, wVarArr.length);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> I0(w<? extends T> wVar, w<? extends T> wVar2) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        return H0(wVar, wVar2);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public static q<Long> I1(long j10, TimeUnit timeUnit) {
        return J1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> J0(w<? extends T> wVar, w<? extends T> wVar2, w<? extends T> wVar3) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        return H0(wVar, wVar2, wVar3);
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public static q<Long> J1(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new MaybeTimer(Math.max(0L, j10), timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> K0(w<? extends T> wVar, w<? extends T> wVar2, w<? extends T> wVar3, w<? extends T> wVar4) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(wVar4, "source4 is null");
        return H0(wVar, wVar2, wVar3, wVar4);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> L0(Iterable<? extends w<? extends T>> iterable) {
        return j.X2(iterable).A2(MaybeToPublisher.instance(), true);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> M0(org.reactivestreams.c<? extends w<? extends T>> cVar) {
        return N0(cVar, Integer.MAX_VALUE);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> N0(org.reactivestreams.c<? extends w<? extends T>> cVar, int i10) {
        io.reactivex.internal.functions.a.g(cVar, "source is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.d0(cVar, MaybeToPublisher.instance(), true, i10, 1));
    }

    @jh.c
    @jh.g("none")
    public static <T> q<T> P0() {
        return io.reactivex.plugins.a.Q(io.reactivex.internal.operators.maybe.e0.f121641b);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> P1(w<T> wVar) {
        if (wVar instanceof q) {
            throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
        }
        io.reactivex.internal.functions.a.g(wVar, "onSubscribe is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.j0(wVar));
    }

    @jh.c
    @jh.g("none")
    public static <T, D> q<T> R1(Callable<? extends D> callable, kh.o<? super D, ? extends w<? extends T>> oVar, kh.g<? super D> gVar) {
        return S1(callable, oVar, gVar, true);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, D> q<T> S1(Callable<? extends D> callable, kh.o<? super D, ? extends w<? extends T>> oVar, kh.g<? super D> gVar, boolean z10) {
        io.reactivex.internal.functions.a.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.a.g(oVar, "sourceSupplier is null");
        io.reactivex.internal.functions.a.g(gVar, "disposer is null");
        return io.reactivex.plugins.a.Q(new MaybeUsing(callable, oVar, gVar, z10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> T1(w<T> wVar) {
        if (wVar instanceof q) {
            return io.reactivex.plugins.a.Q((q) wVar);
        }
        io.reactivex.internal.functions.a.g(wVar, "onSubscribe is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.j0(wVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> q<R> U1(w<? extends T1> wVar, w<? extends T2> wVar2, w<? extends T3> wVar3, w<? extends T4> wVar4, w<? extends T5> wVar5, w<? extends T6> wVar6, w<? extends T7> wVar7, w<? extends T8> wVar8, w<? extends T9> wVar9, kh.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(wVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(wVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(wVar6, "source6 is null");
        io.reactivex.internal.functions.a.g(wVar7, "source7 is null");
        io.reactivex.internal.functions.a.g(wVar8, "source8 is null");
        io.reactivex.internal.functions.a.g(wVar9, "source9 is null");
        return d2(Functions.E(nVar), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> q<R> V1(w<? extends T1> wVar, w<? extends T2> wVar2, w<? extends T3> wVar3, w<? extends T4> wVar4, w<? extends T5> wVar5, w<? extends T6> wVar6, w<? extends T7> wVar7, w<? extends T8> wVar8, kh.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(wVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(wVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(wVar6, "source6 is null");
        io.reactivex.internal.functions.a.g(wVar7, "source7 is null");
        io.reactivex.internal.functions.a.g(wVar8, "source8 is null");
        return d2(Functions.D(mVar), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> q<R> W1(w<? extends T1> wVar, w<? extends T2> wVar2, w<? extends T3> wVar3, w<? extends T4> wVar4, w<? extends T5> wVar5, w<? extends T6> wVar6, w<? extends T7> wVar7, kh.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(wVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(wVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(wVar6, "source6 is null");
        io.reactivex.internal.functions.a.g(wVar7, "source7 is null");
        return d2(Functions.C(lVar), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7);
    }

    @jh.c
    @jh.g("none")
    public static <T> q<T> X() {
        return io.reactivex.plugins.a.Q(io.reactivex.internal.operators.maybe.j.f121678b);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, R> q<R> X1(w<? extends T1> wVar, w<? extends T2> wVar2, w<? extends T3> wVar3, w<? extends T4> wVar4, w<? extends T5> wVar5, w<? extends T6> wVar6, kh.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(wVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(wVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(wVar6, "source6 is null");
        return d2(Functions.B(kVar), wVar, wVar2, wVar3, wVar4, wVar5, wVar6);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> Y(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "exception is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.k(th2));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, R> q<R> Y1(w<? extends T1> wVar, w<? extends T2> wVar2, w<? extends T3> wVar3, w<? extends T4> wVar4, w<? extends T5> wVar5, kh.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(wVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(wVar5, "source5 is null");
        return d2(Functions.A(jVar), wVar, wVar2, wVar3, wVar4, wVar5);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> Z(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.a.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.l(callable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, R> q<R> Z1(w<? extends T1> wVar, w<? extends T2> wVar2, w<? extends T3> wVar3, w<? extends T4> wVar4, kh.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(wVar4, "source4 is null");
        return d2(Functions.z(iVar), wVar, wVar2, wVar3, wVar4);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, R> q<R> a2(w<? extends T1> wVar, w<? extends T2> wVar2, w<? extends T3> wVar3, kh.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        return d2(Functions.y(hVar), wVar, wVar2, wVar3);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> b(Iterable<? extends w<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.b(null, iterable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, R> q<R> b2(w<? extends T1> wVar, w<? extends T2> wVar2, kh.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        return d2(Functions.x(cVar), wVar, wVar2);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, R> q<R> c2(Iterable<? extends w<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.k0(iterable, oVar));
    }

    @jh.c
    @jh.g("none")
    public static <T> q<T> d(w<? extends T>... wVarArr) {
        if (wVarArr.length == 0) {
            return X();
        }
        return wVarArr.length == 1 ? T1(wVarArr[0]) : io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.b(wVarArr, null));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, R> q<R> d2(kh.o<? super Object[], ? extends R> oVar, w<? extends T>... wVarArr) {
        io.reactivex.internal.functions.a.g(wVarArr, "sources is null");
        if (wVarArr.length == 0) {
            return X();
        }
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        return io.reactivex.plugins.a.Q(new MaybeZipArray(wVarArr, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> l0(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "run is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.p(aVar));
    }

    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> l1(w<? extends T> wVar, w<? extends T> wVar2) {
        return m1(wVar, wVar2, io.reactivex.internal.functions.a.d());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> m0(@jh.e Callable<? extends T> callable) {
        io.reactivex.internal.functions.a.g(callable, "callable is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.q(callable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> m1(w<? extends T> wVar, w<? extends T> wVar2, kh.d<? super T, ? super T> dVar) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(dVar, "isEqual is null");
        return io.reactivex.plugins.a.S(new MaybeEqualSingle(wVar, wVar2, dVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> n(w<? extends T> wVar, w<? extends T> wVar2) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        return t(wVar, wVar2);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> n0(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "completableSource is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.r(gVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> o(w<? extends T> wVar, w<? extends T> wVar2, w<? extends T> wVar3) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        return t(wVar, wVar2, wVar3);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> o0(Future<? extends T> future) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.s(future, 0L, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> p(w<? extends T> wVar, w<? extends T> wVar2, w<? extends T> wVar3, w<? extends T> wVar4) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(wVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(wVar4, "source4 is null");
        return t(wVar, wVar2, wVar3, wVar4);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> p0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.s(future, j10, timeUnit));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> q(Iterable<? extends w<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.P(new MaybeConcatIterable(iterable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> q0(Runnable runnable) {
        io.reactivex.internal.functions.a.g(runnable, "run is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.t(runnable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> r(org.reactivestreams.c<? extends w<? extends T>> cVar) {
        return s(cVar, 2);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> r0(o0<T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "singleSource is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.u(o0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> s(org.reactivestreams.c<? extends w<? extends T>> cVar, int i10) {
        io.reactivex.internal.functions.a.g(cVar, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.n(cVar, MaybeToPublisher.instance(), i10, ErrorMode.IMMEDIATE));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> t(w<? extends T>... wVarArr) {
        io.reactivex.internal.functions.a.g(wVarArr, "sources is null");
        if (wVarArr.length == 0) {
            return j.k2();
        }
        return wVarArr.length == 1 ? io.reactivex.plugins.a.P(new MaybeToFlowable(wVarArr[0])) : io.reactivex.plugins.a.P(new MaybeConcatArray(wVarArr));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> u(w<? extends T>... wVarArr) {
        if (wVarArr.length == 0) {
            return j.k2();
        }
        return wVarArr.length == 1 ? io.reactivex.plugins.a.P(new MaybeToFlowable(wVarArr[0])) : io.reactivex.plugins.a.P(new MaybeConcatArrayDelayError(wVarArr));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> v(w<? extends T>... wVarArr) {
        return j.R2(wVarArr).a1(MaybeToPublisher.instance());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> q<T> v0(T t10) {
        io.reactivex.internal.functions.a.g(t10, "item is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.a0(t10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> w(Iterable<? extends w<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return j.X2(iterable).Y0(MaybeToPublisher.instance());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> x(org.reactivestreams.c<? extends w<? extends T>> cVar) {
        return j.Y2(cVar).Y0(MaybeToPublisher.instance());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> y(Iterable<? extends w<? extends T>> iterable) {
        return j.X2(iterable).a1(MaybeToPublisher.instance());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> z(org.reactivestreams.c<? extends w<? extends T>> cVar) {
        return j.Y2(cVar).a1(MaybeToPublisher.instance());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> z0(w<? extends T> wVar, w<? extends T> wVar2) {
        io.reactivex.internal.functions.a.g(wVar, "source1 is null");
        io.reactivex.internal.functions.a.g(wVar2, "source2 is null");
        return G0(wVar, wVar2);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> q<R> A(kh.o<? super T, ? extends w<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new MaybeFlatten(this, oVar));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final q<T> A1(long j10, TimeUnit timeUnit) {
        return C1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> B(w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return n(this, wVar);
    }

    @jh.e
    @jh.c
    @jh.g(jh.g.E0)
    public final q<T> B1(long j10, TimeUnit timeUnit, w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "fallback is null");
        return D1(j10, timeUnit, io.reactivex.schedulers.b.a(), wVar);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<Boolean> C(Object obj) {
        io.reactivex.internal.functions.a.g(obj, "item is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.c(this, obj));
    }

    @jh.c
    @jh.g("custom")
    public final q<T> C1(long j10, TimeUnit timeUnit, h0 h0Var) {
        return E1(J1(j10, timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final i0<Long> D() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.d(this));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final q<T> D1(long j10, TimeUnit timeUnit, h0 h0Var, w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "fallback is null");
        return F1(J1(j10, timeUnit, h0Var), wVar);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> q<T> E1(w<U> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "timeoutIndicator is null");
        return io.reactivex.plugins.a.Q(new MaybeTimeoutMaybe(this, wVar, null));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> F(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultItem is null");
        return u1(v0(t10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> q<T> F1(w<U> wVar, w<? extends T> wVar2) {
        io.reactivex.internal.functions.a.g(wVar, "timeoutIndicator is null");
        io.reactivex.internal.functions.a.g(wVar2, "fallback is null");
        return io.reactivex.plugins.a.Q(new MaybeTimeoutMaybe(this, wVar, wVar2));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> q<T> G1(org.reactivestreams.c<U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "timeoutIndicator is null");
        return io.reactivex.plugins.a.Q(new MaybeTimeoutPublisher(this, cVar, null));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final q<T> H(long j10, TimeUnit timeUnit) {
        return I(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> q<T> H1(org.reactivestreams.c<U> cVar, w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(cVar, "timeoutIndicator is null");
        io.reactivex.internal.functions.a.g(wVar, "fallback is null");
        return io.reactivex.plugins.a.Q(new MaybeTimeoutPublisher(this, cVar, wVar));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final q<T> I(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new MaybeDelay(this, Math.max(0L, j10), timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, V> q<T> J(org.reactivestreams.c<U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "delayIndicator is null");
        return io.reactivex.plugins.a.Q(new MaybeDelayOtherPublisher(this, cVar));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final q<T> K(long j10, TimeUnit timeUnit) {
        return L(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> R K1(kh.o<? super q<T>, R> oVar) {
        try {
            return (R) ((kh.o) io.reactivex.internal.functions.a.g(oVar, "convert is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    @jh.c
    @jh.g("custom")
    public final q<T> L(long j10, TimeUnit timeUnit, h0 h0Var) {
        return M(j.v7(j10, timeUnit, h0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> L1() {
        return this instanceof lh.b ? ((lh.b) this).c() : io.reactivex.plugins.a.P(new MaybeToFlowable(this));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> q<T> M(org.reactivestreams.c<U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "subscriptionIndicator is null");
        return io.reactivex.plugins.a.Q(new MaybeDelaySubscriptionOtherPublisher(this, cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final z<T> M1() {
        return this instanceof lh.d ? ((lh.d) this).a() : io.reactivex.plugins.a.R(new MaybeToObservable(this));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> N(kh.g<? super T> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onAfterSuccess is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.g(this, gVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> N1() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.i0(this, null));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> O(kh.a aVar) {
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.g gVarH3 = Functions.h();
        kh.a aVar2 = Functions.f119558c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h0(this, gVarH, gVarH2, gVarH3, aVar2, (kh.a) io.reactivex.internal.functions.a.g(aVar, "onAfterTerminate is null"), aVar2));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> O0(w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return z0(this, wVar);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> O1(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultValue is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.i0(this, t10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> P(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.Q(new MaybeDoFinally(this, aVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> Q(kh.a aVar) {
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.g gVarH3 = Functions.h();
        kh.a aVar2 = (kh.a) io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        kh.a aVar3 = Functions.f119558c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h0(this, gVarH, gVarH2, gVarH3, aVar2, aVar3, aVar3));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final q<T> Q0(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new MaybeObserveOn(this, h0Var));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final q<T> Q1(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new MaybeUnsubscribeOn(this, h0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> R(kh.a aVar) {
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.g gVarH3 = Functions.h();
        kh.a aVar2 = Functions.f119558c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h0(this, gVarH, gVarH2, gVarH3, aVar2, aVar2, (kh.a) io.reactivex.internal.functions.a.g(aVar, "onDispose is null")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> q<U> R0(Class<U> cls) {
        io.reactivex.internal.functions.a.g(cls, "clazz is null");
        return a0(Functions.l(cls)).l(cls);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> S(kh.g<? super Throwable> gVar) {
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.g gVar2 = (kh.g) io.reactivex.internal.functions.a.g(gVar, "onError is null");
        kh.a aVar = Functions.f119558c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h0(this, gVarH, gVarH2, gVar2, aVar, aVar, aVar));
    }

    @jh.c
    @jh.g("none")
    public final q<T> S0() {
        return T0(Functions.c());
    }

    @jh.c
    @jh.g("none")
    public final q<T> T(kh.b<? super T, ? super Throwable> bVar) {
        io.reactivex.internal.functions.a.g(bVar, "onEvent is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h(this, bVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> T0(kh.r<? super Throwable> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.f0(this, rVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> U(kh.g<? super io.reactivex.disposables.b> gVar) {
        kh.g gVar2 = (kh.g) io.reactivex.internal.functions.a.g(gVar, "onSubscribe is null");
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.a aVar = Functions.f119558c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h0(this, gVar2, gVarH, gVarH2, aVar, aVar, aVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> U0(w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "next is null");
        return V0(Functions.n(wVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> V(kh.g<? super T> gVar) {
        kh.g gVarH = Functions.h();
        kh.g gVar2 = (kh.g) io.reactivex.internal.functions.a.g(gVar, "onSuccess is null");
        kh.g gVarH2 = Functions.h();
        kh.a aVar = Functions.f119558c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h0(this, gVarH, gVar2, gVarH2, aVar, aVar, aVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> V0(kh.o<? super Throwable, ? extends w<? extends T>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "resumeFunction is null");
        return io.reactivex.plugins.a.Q(new MaybeOnErrorNext(this, oVar, true));
    }

    @jh.d
    @jh.c
    @jh.e
    @jh.g("none")
    public final q<T> W(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onTerminate is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.i(this, aVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> W0(kh.o<? super Throwable, ? extends T> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "valueSupplier is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.g0(this, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> X0(T t10) {
        io.reactivex.internal.functions.a.g(t10, "item is null");
        return W0(Functions.n(t10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> Y0(w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "next is null");
        return io.reactivex.plugins.a.Q(new MaybeOnErrorNext(this, Functions.n(wVar), false));
    }

    @jh.c
    @jh.g("none")
    public final q<T> Z0() {
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.f(this));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> a0(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.m(this, rVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> a1() {
        return b1(Long.MAX_VALUE);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> q<R> b0(kh.o<? super T, ? extends w<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new MaybeFlatten(this, oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> b1(long j10) {
        return L1().U4(j10);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U, R> q<R> c0(kh.o<? super T, ? extends w<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.g(cVar, "resultSelector is null");
        return io.reactivex.plugins.a.Q(new MaybeFlatMapBiSelector(this, oVar, cVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> c1(kh.e eVar) {
        return L1().V4(eVar);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> q<R> d0(kh.o<? super T, ? extends w<? extends R>> oVar, kh.o<? super Throwable, ? extends w<? extends R>> oVar2, Callable<? extends w<? extends R>> callable) {
        io.reactivex.internal.functions.a.g(oVar, "onSuccessMapper is null");
        io.reactivex.internal.functions.a.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.a.g(callable, "onCompleteSupplier is null");
        return io.reactivex.plugins.a.Q(new MaybeFlatMapNotification(this, oVar, oVar2, callable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> d1(kh.o<? super j<Object>, ? extends org.reactivestreams.c<?>> oVar) {
        return L1().W4(oVar);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a e0(kh.o<? super T, ? extends g> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new MaybeFlatMapCompletable(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final q<T> e1() {
        return g1(Long.MAX_VALUE, Functions.c());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U, R> q<R> e2(w<? extends U> wVar, kh.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return b2(this, wVar, cVar);
    }

    @Override // io.reactivex.w
    @jh.g("none")
    public final void f(t<? super T> tVar) {
        io.reactivex.internal.functions.a.g(tVar, "observer is null");
        t<? super T> tVarE0 = io.reactivex.plugins.a.e0(this, tVar);
        io.reactivex.internal.functions.a.g(tVarE0, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            r1(tVarE0);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> z<R> f0(kh.o<? super T, ? extends e0<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new MaybeFlatMapObservable(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final q<T> f1(long j10) {
        return g1(j10, Functions.c());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> g(w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return d(this, wVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> g0(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new MaybeFlatMapPublisher(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final q<T> g1(long j10, kh.r<? super Throwable> rVar) {
        return L1().p5(j10, rVar).L5();
    }

    @jh.c
    @jh.g("none")
    public final <R> R h(@jh.e r<T, ? extends R> rVar) {
        return (R) ((r) io.reactivex.internal.functions.a.g(rVar, "converter is null")).c(this);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> i0<R> h0(kh.o<? super T, ? extends o0<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.S(new MaybeFlatMapSingle(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final q<T> h1(kh.d<? super Integer, ? super Throwable> dVar) {
        return L1().q5(dVar).L5();
    }

    @jh.c
    @jh.g("none")
    public final T i() {
        io.reactivex.internal.observers.f fVar = new io.reactivex.internal.observers.f();
        f(fVar);
        return (T) fVar.b();
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> q<R> i0(kh.o<? super T, ? extends o0<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new MaybeFlatMapSingleElement(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final q<T> i1(kh.r<? super Throwable> rVar) {
        return g1(Long.MAX_VALUE, rVar);
    }

    @jh.c
    @jh.g("none")
    public final T j(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultValue is null");
        io.reactivex.internal.observers.f fVar = new io.reactivex.internal.observers.f();
        f(fVar);
        return (T) fVar.c(t10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<U> j0(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new MaybeFlatMapIterableFlowable(this, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> j1(kh.e eVar) {
        io.reactivex.internal.functions.a.g(eVar, "stop is null");
        return g1(Long.MAX_VALUE, Functions.v(eVar));
    }

    @jh.c
    @jh.g("none")
    public final q<T> k() {
        return io.reactivex.plugins.a.Q(new MaybeCache(this));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> z<U> k0(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.maybe.o(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final q<T> k1(kh.o<? super j<Throwable>, ? extends org.reactivestreams.c<?>> oVar) {
        return L1().t5(oVar).L5();
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> q<U> l(Class<? extends U> cls) {
        io.reactivex.internal.functions.a.g(cls, "clazz is null");
        return (q<U>) x0(Functions.e(cls));
    }

    @jh.c
    @jh.g("none")
    public final <R> q<R> m(x<? super T, ? extends R> xVar) {
        return T1(((x) io.reactivex.internal.functions.a.g(xVar, "transformer is null")).c(this));
    }

    @jh.g("none")
    public final io.reactivex.disposables.b n1() {
        return q1(Functions.h(), Functions.f119561f, Functions.f119558c);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b o1(kh.g<? super T> gVar) {
        return q1(gVar, Functions.f119561f, Functions.f119558c);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b p1(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
        return q1(gVar, gVar2, Functions.f119558c);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b q1(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
        io.reactivex.internal.functions.a.g(gVar, "onSuccess is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        return (io.reactivex.disposables.b) t1(new MaybeCallbackObserver(gVar, gVar2, aVar));
    }

    protected abstract void r1(t<? super T> tVar);

    @jh.c
    @jh.g("none")
    public final q<T> s0() {
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.v(this));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final q<T> s1(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new MaybeSubscribeOn(this, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final a t0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.maybe.x(this));
    }

    @jh.c
    @jh.g("none")
    public final <E extends t<? super T>> E t1(E e10) {
        f(e10);
        return e10;
    }

    @jh.c
    @jh.g("none")
    public final i0<Boolean> u0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.z(this));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> u1(w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return io.reactivex.plugins.a.Q(new MaybeSwitchIfEmpty(this, wVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> v1(o0<? extends T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return io.reactivex.plugins.a.S(new MaybeSwitchIfEmptySingle(this, o0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> q<R> w0(v<? extends R, ? super T> vVar) {
        io.reactivex.internal.functions.a.g(vVar, "lift is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.b0(this, vVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> q<T> w1(w<U> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return io.reactivex.plugins.a.Q(new MaybeTakeUntilMaybe(this, wVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> q<R> x0(kh.o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.c0(this, oVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> q<T> x1(org.reactivestreams.c<U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return io.reactivex.plugins.a.Q(new MaybeTakeUntilPublisher(this, cVar));
    }

    @jh.d
    @jh.c
    @jh.g("none")
    public final i0<y<T>> y0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.d0(this));
    }

    @jh.c
    @jh.g("none")
    public final TestObserver<T> y1() {
        TestObserver<T> testObserver = new TestObserver<>();
        f(testObserver);
        return testObserver;
    }

    @jh.c
    @jh.g("none")
    public final TestObserver<T> z1(boolean z10) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z10) {
            testObserver.cancel();
        }
        f(testObserver);
        return testObserver;
    }
}

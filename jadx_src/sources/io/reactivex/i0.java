package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.BiConsumerSingleObserver;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.z0;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.k1;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.operators.single.SingleDelayWithObservable;
import io.reactivex.internal.operators.single.SingleDelayWithPublisher;
import io.reactivex.internal.operators.single.SingleDelayWithSingle;
import io.reactivex.internal.operators.single.SingleDoFinally;
import io.reactivex.internal.operators.single.SingleDoOnDispose;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleFlatMapIterableFlowable;
import io.reactivex.internal.operators.single.SingleFlatMapIterableObservable;
import io.reactivex.internal.operators.single.SingleFlatMapMaybe;
import io.reactivex.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.internal.operators.single.SingleInternalHelper;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTakeUntil;
import io.reactivex.internal.operators.single.SingleTimeout;
import io.reactivex.internal.operators.single.SingleTimer;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.operators.single.SingleUnsubscribeOn;
import io.reactivex.internal.operators.single.SingleUsing;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.TestObserver;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Single.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0<T> implements o0<T> {
    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> A0(o0<? extends o0<? extends T>> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "source is null");
        return io.reactivex.plugins.a.S(new SingleFlatMap(o0Var, Functions.k()));
    }

    @jh.c
    @jh.g("none")
    public static <T, U> i0<T> A1(Callable<U> callable, kh.o<? super U, ? extends o0<? extends T>> oVar, kh.g<? super U> gVar) {
        return B1(callable, oVar, gVar, true);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> B(m0<T> m0Var) {
        io.reactivex.internal.functions.a.g(m0Var, "source is null");
        return io.reactivex.plugins.a.S(new SingleCreate(m0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> B0(o0<? extends T> o0Var, o0<? extends T> o0Var2) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        return F0(j.R2(o0Var, o0Var2));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, U> i0<T> B1(Callable<U> callable, kh.o<? super U, ? extends o0<? extends T>> oVar, kh.g<? super U> gVar, boolean z10) {
        io.reactivex.internal.functions.a.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.a.g(oVar, "singleFunction is null");
        io.reactivex.internal.functions.a.g(gVar, "disposer is null");
        return io.reactivex.plugins.a.S(new SingleUsing(callable, oVar, gVar, z10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> C(Callable<? extends o0<? extends T>> callable) {
        io.reactivex.internal.functions.a.g(callable, "singleSupplier is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.c(callable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> C0(o0<? extends T> o0Var, o0<? extends T> o0Var2, o0<? extends T> o0Var3) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        return F0(j.R2(o0Var, o0Var2, o0Var3));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> C1(o0<T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "source is null");
        return o0Var instanceof i0 ? io.reactivex.plugins.a.S((i0) o0Var) : io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.r(o0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> D0(o0<? extends T> o0Var, o0<? extends T> o0Var2, o0<? extends T> o0Var3, o0<? extends T> o0Var4) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(o0Var4, "source4 is null");
        return F0(j.R2(o0Var, o0Var2, o0Var3, o0Var4));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> i0<R> D1(o0<? extends T1> o0Var, o0<? extends T2> o0Var2, o0<? extends T3> o0Var3, o0<? extends T4> o0Var4, o0<? extends T5> o0Var5, o0<? extends T6> o0Var6, o0<? extends T7> o0Var7, o0<? extends T8> o0Var8, o0<? extends T9> o0Var9, kh.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(o0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(o0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(o0Var6, "source6 is null");
        io.reactivex.internal.functions.a.g(o0Var7, "source7 is null");
        io.reactivex.internal.functions.a.g(o0Var8, "source8 is null");
        io.reactivex.internal.functions.a.g(o0Var9, "source9 is null");
        return M1(Functions.E(nVar), o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7, o0Var8, o0Var9);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> E0(Iterable<? extends o0<? extends T>> iterable) {
        return F0(j.X2(iterable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> i0<R> E1(o0<? extends T1> o0Var, o0<? extends T2> o0Var2, o0<? extends T3> o0Var3, o0<? extends T4> o0Var4, o0<? extends T5> o0Var5, o0<? extends T6> o0Var6, o0<? extends T7> o0Var7, o0<? extends T8> o0Var8, kh.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(o0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(o0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(o0Var6, "source6 is null");
        io.reactivex.internal.functions.a.g(o0Var7, "source7 is null");
        io.reactivex.internal.functions.a.g(o0Var8, "source8 is null");
        return M1(Functions.D(mVar), o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7, o0Var8);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> F0(org.reactivestreams.c<? extends o0<? extends T>> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "sources is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.d0(cVar, SingleInternalHelper.c(), true, Integer.MAX_VALUE, j.Y()));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> i0<R> F1(o0<? extends T1> o0Var, o0<? extends T2> o0Var2, o0<? extends T3> o0Var3, o0<? extends T4> o0Var4, o0<? extends T5> o0Var5, o0<? extends T6> o0Var6, o0<? extends T7> o0Var7, kh.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(o0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(o0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(o0Var6, "source6 is null");
        io.reactivex.internal.functions.a.g(o0Var7, "source7 is null");
        return M1(Functions.C(lVar), o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, R> i0<R> G1(o0<? extends T1> o0Var, o0<? extends T2> o0Var2, o0<? extends T3> o0Var3, o0<? extends T4> o0Var4, o0<? extends T5> o0Var5, o0<? extends T6> o0Var6, kh.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(o0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(o0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(o0Var6, "source6 is null");
        return M1(Functions.B(kVar), o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6);
    }

    @jh.c
    @jh.g("none")
    public static <T> i0<T> H0() {
        return io.reactivex.plugins.a.S(io.reactivex.internal.operators.single.x.f123579b);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, R> i0<R> H1(o0<? extends T1> o0Var, o0<? extends T2> o0Var2, o0<? extends T3> o0Var3, o0<? extends T4> o0Var4, o0<? extends T5> o0Var5, kh.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(o0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(o0Var5, "source5 is null");
        return M1(Functions.A(jVar), o0Var, o0Var2, o0Var3, o0Var4, o0Var5);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, R> i0<R> I1(o0<? extends T1> o0Var, o0<? extends T2> o0Var2, o0<? extends T3> o0Var3, o0<? extends T4> o0Var4, kh.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(o0Var4, "source4 is null");
        return M1(Functions.z(iVar), o0Var, o0Var2, o0Var3, o0Var4);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, R> i0<R> J1(o0<? extends T1> o0Var, o0<? extends T2> o0Var2, o0<? extends T3> o0Var3, kh.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        return M1(Functions.y(hVar), o0Var, o0Var2, o0Var3);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, R> i0<R> K1(o0<? extends T1> o0Var, o0<? extends T2> o0Var2, kh.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        return M1(Functions.x(cVar), o0Var, o0Var2);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, R> i0<R> L1(Iterable<? extends o0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.z(iterable, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, R> i0<R> M1(kh.o<? super Object[], ? extends R> oVar, o0<? extends T>... o0VarArr) {
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.g(o0VarArr, "sources is null");
        return o0VarArr.length == 0 ? Y(new NoSuchElementException()) : io.reactivex.plugins.a.S(new SingleZipArray(o0VarArr, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> X(o0<? extends T> o0Var, o0<? extends T> o0Var2) {
        io.reactivex.internal.functions.a.g(o0Var, "first is null");
        io.reactivex.internal.functions.a.g(o0Var2, "second is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.n(o0Var, o0Var2));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> Y(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "exception is null");
        return Z(Functions.m(th2));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> Z(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.a.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.o(callable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> d(Iterable<? extends o0<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.a(null, iterable));
    }

    @jh.c
    @jh.g("none")
    public static <T> i0<T> g(o0<? extends T>... o0VarArr) {
        if (o0VarArr.length == 0) {
            return Z(SingleInternalHelper.a());
        }
        return o0VarArr.length == 1 ? C1(o0VarArr[0]) : io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.a(o0VarArr, null));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> i0(Callable<? extends T> callable) {
        io.reactivex.internal.functions.a.g(callable, "callable is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.p(callable));
    }

    @jh.c
    @jh.g("none")
    public static <T> i0<T> j0(Future<? extends T> future) {
        return x1(j.T2(future));
    }

    @jh.c
    @jh.g("none")
    public static <T> i0<T> k0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        return x1(j.U2(future, j10, timeUnit));
    }

    @jh.c
    @jh.g("custom")
    public static <T> i0<T> l0(Future<? extends T> future, long j10, TimeUnit timeUnit, h0 h0Var) {
        return x1(j.V2(future, j10, timeUnit, h0Var));
    }

    @jh.c
    @jh.g("custom")
    public static <T> i0<T> m0(Future<? extends T> future, h0 h0Var) {
        return x1(j.W2(future, h0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> n(o0<? extends T> o0Var, o0<? extends T> o0Var2) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        return r(j.R2(o0Var, o0Var2));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> n0(e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "observableSource is null");
        return io.reactivex.plugins.a.S(new k1(e0Var, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> o(o0<? extends T> o0Var, o0<? extends T> o0Var2, o0<? extends T> o0Var3) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        return r(j.R2(o0Var, o0Var2, o0Var3));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> i0<T> o0(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "publisher is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.q(cVar));
    }

    private i0<T> o1(long j10, TimeUnit timeUnit, h0 h0Var, o0<? extends T> o0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new SingleTimeout(this, j10, timeUnit, h0Var, o0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> p(o0<? extends T> o0Var, o0<? extends T> o0Var2, o0<? extends T> o0Var3, o0<? extends T> o0Var4) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(o0Var4, "source4 is null");
        return r(j.R2(o0Var, o0Var2, o0Var3, o0Var4));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public static i0<Long> p1(long j10, TimeUnit timeUnit) {
        return q1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> q(Iterable<? extends o0<? extends T>> iterable) {
        return r(j.X2(iterable));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public static i0<Long> q1(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new SingleTimer(j10, timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> r(org.reactivestreams.c<? extends o0<? extends T>> cVar) {
        return s(cVar, 2);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> r0(T t10) {
        io.reactivex.internal.functions.a.g(t10, "item is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.t(t10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> s(org.reactivestreams.c<? extends o0<? extends T>> cVar, int i10) {
        io.reactivex.internal.functions.a.g(cVar, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.n(cVar, SingleInternalHelper.c(), i10, ErrorMode.IMMEDIATE));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> t(e0<? extends o0<? extends T>> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        return io.reactivex.plugins.a.R(new ObservableConcatMap(e0Var, SingleInternalHelper.d(), 2, ErrorMode.IMMEDIATE));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> u(o0<? extends T>... o0VarArr) {
        return io.reactivex.plugins.a.P(new FlowableConcatMap(j.R2(o0VarArr), SingleInternalHelper.c(), 2, ErrorMode.BOUNDARY));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> v(o0<? extends T>... o0VarArr) {
        return j.R2(o0VarArr).a1(SingleInternalHelper.c());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> v0(o0<? extends T> o0Var, o0<? extends T> o0Var2) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        return z0(j.R2(o0Var, o0Var2));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> w(Iterable<? extends o0<? extends T>> iterable) {
        return j.X2(iterable).a1(SingleInternalHelper.c());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> w0(o0<? extends T> o0Var, o0<? extends T> o0Var2, o0<? extends T> o0Var3) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        return z0(j.R2(o0Var, o0Var2, o0Var3));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> x(org.reactivestreams.c<? extends o0<? extends T>> cVar) {
        return j.Y2(cVar).a1(SingleInternalHelper.c());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> x0(o0<? extends T> o0Var, o0<? extends T> o0Var2, o0<? extends T> o0Var3, o0<? extends T> o0Var4) {
        io.reactivex.internal.functions.a.g(o0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(o0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(o0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(o0Var4, "source4 is null");
        return z0(j.R2(o0Var, o0Var2, o0Var3, o0Var4));
    }

    private static <T> i0<T> x1(j<T> jVar) {
        return io.reactivex.plugins.a.S(new z0(jVar, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> y0(Iterable<? extends o0<? extends T>> iterable) {
        return z0(j.X2(iterable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> i0<T> y1(o0<T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "onSubscribe is null");
        if (o0Var instanceof i0) {
            throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
        }
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.r(o0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> z0(org.reactivestreams.c<? extends o0<? extends T>> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "sources is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.d0(cVar, SingleInternalHelper.c(), false, Integer.MAX_VALUE, j.Y()));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<Boolean> A(Object obj, kh.d<Object, Object> dVar) {
        io.reactivex.internal.functions.a.g(obj, "value is null");
        io.reactivex.internal.functions.a.g(dVar, "comparer is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.b(this, obj, dVar));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final i0<T> D(long j10, TimeUnit timeUnit) {
        return F(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @jh.c
    @jh.g("custom")
    public final i0<T> E(long j10, TimeUnit timeUnit, h0 h0Var) {
        return F(j10, timeUnit, h0Var, false);
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final i0<T> F(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.d(this, j10, timeUnit, h0Var, z10));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final i0<T> G(long j10, TimeUnit timeUnit, boolean z10) {
        return F(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> G0(o0<? extends T> o0Var) {
        return v0(this, o0Var);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final i0<T> H(long j10, TimeUnit timeUnit) {
        return I(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("custom")
    public final i0<T> I(long j10, TimeUnit timeUnit, h0 h0Var) {
        return K(z.P6(j10, timeUnit, h0Var));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final i0<T> I0(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new SingleObserveOn(this, h0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> J(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return io.reactivex.plugins.a.S(new SingleDelayWithCompletable(this, gVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> J0(i0<? extends T> i0Var) {
        io.reactivex.internal.functions.a.g(i0Var, "resumeSingleInCaseOfError is null");
        return K0(Functions.n(i0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> i0<T> K(e0<U> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return io.reactivex.plugins.a.S(new SingleDelayWithObservable(this, e0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> K0(kh.o<? super Throwable, ? extends o0<? extends T>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "resumeFunctionInCaseOfError is null");
        return io.reactivex.plugins.a.S(new SingleResumeNext(this, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> i0<T> L(o0<U> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return io.reactivex.plugins.a.S(new SingleDelayWithSingle(this, o0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> L0(kh.o<Throwable, ? extends T> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "resumeFunction is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.y(this, oVar, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> i0<T> M(org.reactivestreams.c<U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return io.reactivex.plugins.a.S(new SingleDelayWithPublisher(this, cVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> M0(T t10) {
        io.reactivex.internal.functions.a.g(t10, "value is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.y(this, null, t10));
    }

    @jh.d
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> q<R> N(kh.o<? super T, y<R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.single.e(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> N0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.f(this));
    }

    @jh.c
    @jh.g("none")
    public final <U, R> i0<R> N1(o0<U> o0Var, kh.c<? super T, ? super U, ? extends R> cVar) {
        return K1(this, o0Var, cVar);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> O(kh.g<? super T> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onAfterSuccess is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.g(this, gVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> O0() {
        return t1().T4();
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> P(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onAfterTerminate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.h(this, aVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> P0(long j10) {
        return t1().U4(j10);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> Q(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.S(new SingleDoFinally(this, aVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> Q0(kh.e eVar) {
        return t1().V4(eVar);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> R(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onDispose is null");
        return io.reactivex.plugins.a.S(new SingleDoOnDispose(this, aVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> R0(kh.o<? super j<Object>, ? extends org.reactivestreams.c<?>> oVar) {
        return t1().W4(oVar);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> S(kh.g<? super Throwable> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onError is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.i(this, gVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> S0() {
        return x1(t1().n5());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> T(kh.b<? super T, ? super Throwable> bVar) {
        io.reactivex.internal.functions.a.g(bVar, "onEvent is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.j(this, bVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> T0(long j10) {
        return x1(t1().o5(j10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> U(kh.g<? super io.reactivex.disposables.b> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onSubscribe is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.k(this, gVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> U0(long j10, kh.r<? super Throwable> rVar) {
        return x1(t1().p5(j10, rVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> V(kh.g<? super T> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onSuccess is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.l(this, gVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> V0(kh.d<? super Integer, ? super Throwable> dVar) {
        return x1(t1().q5(dVar));
    }

    @jh.d
    @jh.c
    @jh.e
    @jh.g("none")
    public final i0<T> W(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onTerminate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.m(this, aVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> W0(kh.r<? super Throwable> rVar) {
        return x1(t1().r5(rVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> X0(kh.o<? super j<Throwable>, ? extends org.reactivestreams.c<?>> oVar) {
        return x1(t1().t5(oVar));
    }

    @jh.g("none")
    public final io.reactivex.disposables.b Y0() {
        return b1(Functions.h(), Functions.f119561f);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b Z0(kh.b<? super T, ? super Throwable> bVar) {
        io.reactivex.internal.functions.a.g(bVar, "onCallback is null");
        BiConsumerSingleObserver biConsumerSingleObserver = new BiConsumerSingleObserver(bVar);
        f(biConsumerSingleObserver);
        return biConsumerSingleObserver;
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final q<T> a0(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.n(this, rVar));
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b a1(kh.g<? super T> gVar) {
        return b1(gVar, Functions.f119561f);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> i0<R> b0(kh.o<? super T, ? extends o0<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.S(new SingleFlatMap(this, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b b1(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
        io.reactivex.internal.functions.a.g(gVar, "onSuccess is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(gVar, gVar2);
        f(consumerSingleObserver);
        return consumerSingleObserver;
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final a c0(kh.o<? super T, ? extends g> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new SingleFlatMapCompletable(this, oVar));
    }

    protected abstract void c1(@jh.e l0<? super T> l0Var);

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> q<R> d0(kh.o<? super T, ? extends w<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new SingleFlatMapMaybe(this, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final i0<T> d1(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new SingleSubscribeOn(this, h0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> z<R> e0(kh.o<? super T, ? extends e0<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new SingleFlatMapObservable(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final <E extends l0<? super T>> E e1(E e10) {
        f(e10);
        return e10;
    }

    @Override // io.reactivex.o0
    @jh.g("none")
    public final void f(l0<? super T> l0Var) {
        io.reactivex.internal.functions.a.g(l0Var, "observer is null");
        l0<? super T> l0VarG0 = io.reactivex.plugins.a.g0(this, l0Var);
        io.reactivex.internal.functions.a.g(l0VarG0, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            c1(l0VarG0);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> f0(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new SingleFlatMapPublisher(this, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> f1(g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return h1(new io.reactivex.internal.operators.completable.y(gVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<U> g0(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new SingleFlatMapIterableFlowable(this, oVar));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <E> i0<T> g1(o0<? extends E> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return h1(new SingleToFlowable(o0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final i0<T> h(o0<? extends T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return g(this, o0Var);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> z<U> h0(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new SingleFlatMapIterableObservable(this, oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <E> i0<T> h1(org.reactivestreams.c<E> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return io.reactivex.plugins.a.S(new SingleTakeUntil(this, cVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> R i(@jh.e j0<T, ? extends R> j0Var) {
        return (R) ((j0) io.reactivex.internal.functions.a.g(j0Var, "converter is null")).f(this);
    }

    @jh.c
    @jh.g("none")
    public final TestObserver<T> i1() {
        TestObserver<T> testObserver = new TestObserver<>();
        f(testObserver);
        return testObserver;
    }

    @jh.c
    @jh.g("none")
    public final T j() {
        io.reactivex.internal.observers.f fVar = new io.reactivex.internal.observers.f();
        f(fVar);
        return (T) fVar.b();
    }

    @jh.c
    @jh.g("none")
    public final TestObserver<T> j1(boolean z10) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z10) {
            testObserver.cancel();
        }
        f(testObserver);
        return testObserver;
    }

    @jh.c
    @jh.g("none")
    public final i0<T> k() {
        return io.reactivex.plugins.a.S(new SingleCache(this));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final i0<T> k1(long j10, TimeUnit timeUnit) {
        return o1(j10, timeUnit, io.reactivex.schedulers.b.a(), null);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <U> i0<U> l(Class<? extends U> cls) {
        io.reactivex.internal.functions.a.g(cls, "clazz is null");
        return (i0<U>) t0(Functions.e(cls));
    }

    @jh.c
    @jh.g("custom")
    public final i0<T> l1(long j10, TimeUnit timeUnit, h0 h0Var) {
        return o1(j10, timeUnit, h0Var, null);
    }

    @jh.c
    @jh.g("none")
    public final <R> i0<R> m(p0<? super T, ? extends R> p0Var) {
        return C1(((p0) io.reactivex.internal.functions.a.g(p0Var, "transformer is null")).f(this));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final i0<T> m1(long j10, TimeUnit timeUnit, h0 h0Var, o0<? extends T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return o1(j10, timeUnit, h0Var, o0Var);
    }

    @jh.e
    @jh.c
    @jh.g(jh.g.E0)
    public final i0<T> n1(long j10, TimeUnit timeUnit, o0<? extends T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return o1(j10, timeUnit, io.reactivex.schedulers.b.a(), o0Var);
    }

    @jh.c
    @jh.g("none")
    public final i0<T> p0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.s(this));
    }

    @jh.c
    @jh.g("none")
    public final a q0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.n(this));
    }

    @jh.c
    @jh.g("none")
    public final <R> R r1(kh.o<? super i0<T>, R> oVar) {
        try {
            return (R) ((kh.o) io.reactivex.internal.functions.a.g(oVar, "convert is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> i0<R> s0(n0<? extends R, ? super T> n0Var) {
        io.reactivex.internal.functions.a.g(n0Var, "lift is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.u(this, n0Var));
    }

    @Deprecated
    @jh.c
    @jh.g("none")
    public final a s1() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.n(this));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> i0<R> t0(kh.o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.v(this, oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> t1() {
        return this instanceof lh.b ? ((lh.b) this).c() : io.reactivex.plugins.a.P(new SingleToFlowable(this));
    }

    @jh.d
    @jh.c
    @jh.g("none")
    public final i0<y<T>> u0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.w(this));
    }

    @jh.c
    @jh.g("none")
    public final Future<T> u1() {
        return (Future) e1(new io.reactivex.internal.observers.i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final q<T> v1() {
        return this instanceof lh.c ? ((lh.c) this).b() : io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.u(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final z<T> w1() {
        return this instanceof lh.d ? ((lh.d) this).a() : io.reactivex.plugins.a.R(new SingleToObservable(this));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> y(o0<? extends T> o0Var) {
        return n(this, o0Var);
    }

    @jh.c
    @jh.g("none")
    public final i0<Boolean> z(Object obj) {
        return A(obj, io.reactivex.internal.functions.a.d());
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public final i0<T> z1(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new SingleUnsubscribeOn(this, h0Var));
    }
}

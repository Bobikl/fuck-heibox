package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.ObservableInternalHelper;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableJoin;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableRangeLong;
import io.reactivex.internal.operators.observable.ObservableRepeat;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.operators.observable.ObservableSkipLast;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTakeLast;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.operators.observable.ObservableUsing;
import io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.operators.observable.a1;
import io.reactivex.internal.operators.observable.b1;
import io.reactivex.internal.operators.observable.c1;
import io.reactivex.internal.operators.observable.d1;
import io.reactivex.internal.operators.observable.e1;
import io.reactivex.internal.operators.observable.f1;
import io.reactivex.internal.operators.observable.g1;
import io.reactivex.internal.operators.observable.h1;
import io.reactivex.internal.operators.observable.i1;
import io.reactivex.internal.operators.observable.j1;
import io.reactivex.internal.operators.observable.k1;
import io.reactivex.internal.operators.observable.l1;
import io.reactivex.internal.operators.observable.m1;
import io.reactivex.internal.operators.observable.n1;
import io.reactivex.internal.operators.observable.o1;
import io.reactivex.internal.operators.observable.p1;
import io.reactivex.internal.operators.observable.q0;
import io.reactivex.internal.operators.observable.q1;
import io.reactivex.internal.operators.observable.r0;
import io.reactivex.internal.operators.observable.r1;
import io.reactivex.internal.operators.observable.s0;
import io.reactivex.internal.operators.observable.s1;
import io.reactivex.internal.operators.observable.t0;
import io.reactivex.internal.operators.observable.t1;
import io.reactivex.internal.operators.observable.u0;
import io.reactivex.internal.operators.observable.u1;
import io.reactivex.internal.operators.observable.v0;
import io.reactivex.internal.operators.observable.v1;
import io.reactivex.internal.operators.observable.w0;
import io.reactivex.internal.operators.observable.w1;
import io.reactivex.internal.operators.observable.x0;
import io.reactivex.internal.operators.observable.x1;
import io.reactivex.internal.operators.observable.y0;
import io.reactivex.internal.operators.observable.y1;
import io.reactivex.internal.operators.observable.z0;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.observers.TestObserver;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Observable.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z<T> implements e0<T> {

    /* JADX INFO: compiled from: Observable.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124185a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f124185a = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124185a[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124185a[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124185a[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> A0(int i10, int i11, e0<? extends T>... e0VarArr) {
        return I2(e0VarArr).W0(Functions.k(), i10, i11, false);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> B0(e0<? extends T>... e0VarArr) {
        return A0(T(), T(), e0VarArr);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> B3(e0<? extends e0<? extends T>> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        return io.reactivex.plugins.a.R(new ObservableFlatMap(e0Var, Functions.k(), false, Integer.MAX_VALUE, T()));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> C0(int i10, int i11, e0<? extends T>... e0VarArr) {
        return I2(e0VarArr).W0(Functions.k(), i10, i11, true);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> C3(e0<? extends e0<? extends T>> e0Var, int i10) {
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.R(new ObservableFlatMap(e0Var, Functions.k(), false, i10, T()));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> D0(e0<? extends T>... e0VarArr) {
        return C0(T(), T(), e0VarArr);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> D3(e0<? extends T> e0Var, e0<? extends T> e0Var2) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        return I2(e0Var, e0Var2).u2(Functions.k(), false, 2);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> E0(e0<? extends e0<? extends T>> e0Var) {
        return F0(e0Var, T(), true);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> E3(e0<? extends T> e0Var, e0<? extends T> e0Var2, e0<? extends T> e0Var3) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        return I2(e0Var, e0Var2, e0Var3).u2(Functions.k(), false, 3);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> F0(e0<? extends e0<? extends T>> e0Var, int i10, boolean z10) {
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch is null");
        return io.reactivex.plugins.a.R(new ObservableConcatMap(e0Var, Functions.k(), i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> F3(e0<? extends T> e0Var, e0<? extends T> e0Var2, e0<? extends T> e0Var3, e0<? extends T> e0Var4) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        return I2(e0Var, e0Var2, e0Var3, e0Var4).u2(Functions.k(), false, 4);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> G0(Iterable<? extends e0<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return E0(O2(iterable));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> G3(Iterable<? extends e0<? extends T>> iterable) {
        return O2(iterable).k2(Functions.k());
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> H0(e0<? extends e0<? extends T>> e0Var) {
        return I0(e0Var, T(), T());
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> H3(Iterable<? extends e0<? extends T>> iterable, int i10) {
        return O2(iterable).l2(Functions.k(), i10);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> I0(e0<? extends e0<? extends T>> e0Var, int i10, int i11) {
        return O7(e0Var).V0(Functions.k(), i10, i11);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> I2(T... tArr) {
        io.reactivex.internal.functions.a.g(tArr, "items is null");
        if (tArr.length == 0) {
            return d2();
        }
        return tArr.length == 1 ? l3(tArr[0]) : io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.j0(tArr));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> I3(Iterable<? extends e0<? extends T>> iterable, int i10, int i11) {
        return O2(iterable).v2(Functions.k(), false, i10, i11);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> J0(Iterable<? extends e0<? extends T>> iterable) {
        return K0(iterable, T(), T());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> J2(Callable<? extends T> callable) {
        io.reactivex.internal.functions.a.g(callable, "supplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.k0(callable));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> J3(int i10, int i11, e0<? extends T>... e0VarArr) {
        return I2(e0VarArr).v2(Functions.k(), false, i10, i11);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> K0(Iterable<? extends e0<? extends T>> iterable, int i10, int i11) {
        return O2(iterable).W0(Functions.k(), i10, i11, false);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> K2(Future<? extends T> future) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.l0(future, 0L, null));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> K3(e0<? extends T>... e0VarArr) {
        return I2(e0VarArr).l2(Functions.k(), e0VarArr.length);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> L2(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.l0(future, j10, timeUnit));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> L3(int i10, int i11, e0<? extends T>... e0VarArr) {
        return I2(e0VarArr).v2(Functions.k(), true, i10, i11);
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public static <T> z<T> M2(Future<? extends T> future, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return L2(future, j10, timeUnit).I5(h0Var);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> M3(e0<? extends T>... e0VarArr) {
        return I2(e0VarArr).u2(Functions.k(), true, e0VarArr.length);
    }

    private z<T> M6(long j10, TimeUnit timeUnit, e0<? extends T> e0Var, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "timeUnit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableTimeoutTimed(this, j10, timeUnit, h0Var, e0Var));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public static <T> z<T> N2(Future<? extends T> future, h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return K2(future).I5(h0Var);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> N3(e0<? extends e0<? extends T>> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        return io.reactivex.plugins.a.R(new ObservableFlatMap(e0Var, Functions.k(), true, Integer.MAX_VALUE, T()));
    }

    private <U, V> z<T> N6(e0<U> e0Var, kh.o<? super T, ? extends e0<V>> oVar, e0<? extends T> e0Var2) {
        io.reactivex.internal.functions.a.g(oVar, "itemTimeoutIndicator is null");
        return io.reactivex.plugins.a.R(new ObservableTimeout(this, e0Var, oVar, e0Var2));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> O2(Iterable<? extends T> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "source is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.m0(iterable));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> O3(e0<? extends e0<? extends T>> e0Var, int i10) {
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.R(new ObservableFlatMap(e0Var, Functions.k(), true, i10, T()));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public static z<Long> O6(long j10, TimeUnit timeUnit) {
        return P6(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> O7(e0<T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "source is null");
        return e0Var instanceof z ? io.reactivex.plugins.a.R((z) e0Var) : io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.o0(e0Var));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> z<T> P2(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "publisher is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.n0(cVar));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> P3(e0<? extends T> e0Var, e0<? extends T> e0Var2) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        return I2(e0Var, e0Var2).u2(Functions.k(), true, 2);
    }

    @jh.c
    @jh.g("custom")
    public static z<Long> P6(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableTimer(Math.max(j10, 0L), timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> z<R> P7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, e0<? extends T6> e0Var6, e0<? extends T7> e0Var7, e0<? extends T8> e0Var8, e0<? extends T9> e0Var9, kh.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(e0Var6, "source6 is null");
        io.reactivex.internal.functions.a.g(e0Var7, "source7 is null");
        io.reactivex.internal.functions.a.g(e0Var8, "source8 is null");
        io.reactivex.internal.functions.a.g(e0Var9, "source9 is null");
        return b8(Functions.E(nVar), false, T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8, e0Var9);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, S> z<T> Q2(Callable<S> callable, kh.b<S, i<T>> bVar) {
        io.reactivex.internal.functions.a.g(bVar, "generator is null");
        return T2(callable, ObservableInternalHelper.l(bVar), Functions.h());
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> Q3(e0<? extends T> e0Var, e0<? extends T> e0Var2, e0<? extends T> e0Var3) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        return I2(e0Var, e0Var2, e0Var3).u2(Functions.k(), true, 3);
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> z<R> Q7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, e0<? extends T6> e0Var6, e0<? extends T7> e0Var7, e0<? extends T8> e0Var8, kh.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(e0Var6, "source6 is null");
        io.reactivex.internal.functions.a.g(e0Var7, "source7 is null");
        io.reactivex.internal.functions.a.g(e0Var8, "source8 is null");
        return b8(Functions.D(mVar), false, T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, S> z<T> R2(Callable<S> callable, kh.b<S, i<T>> bVar, kh.g<? super S> gVar) {
        io.reactivex.internal.functions.a.g(bVar, "generator is null");
        return T2(callable, ObservableInternalHelper.l(bVar), gVar);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> R3(e0<? extends T> e0Var, e0<? extends T> e0Var2, e0<? extends T> e0Var3, e0<? extends T> e0Var4) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        return I2(e0Var, e0Var2, e0Var3, e0Var4).u2(Functions.k(), true, 4);
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> z<R> R7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, e0<? extends T6> e0Var6, e0<? extends T7> e0Var7, kh.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(e0Var6, "source6 is null");
        io.reactivex.internal.functions.a.g(e0Var7, "source7 is null");
        return b8(Functions.C(lVar), false, T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7);
    }

    @jh.c
    @jh.g("none")
    public static <T, S> z<T> S2(Callable<S> callable, kh.c<S, i<T>, S> cVar) {
        return T2(callable, cVar, Functions.h());
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> S3(Iterable<? extends e0<? extends T>> iterable) {
        return O2(iterable).t2(Functions.k(), true);
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, R> z<R> S7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, e0<? extends T6> e0Var6, kh.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(e0Var6, "source6 is null");
        return b8(Functions.B(kVar), false, T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6);
    }

    public static int T() {
        return j.Y();
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, S> z<T> T2(Callable<S> callable, kh.c<S, i<T>, S> cVar, kh.g<? super S> gVar) {
        io.reactivex.internal.functions.a.g(callable, "initialState is null");
        io.reactivex.internal.functions.a.g(cVar, "generator is null");
        io.reactivex.internal.functions.a.g(gVar, "disposeState is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.p0(callable, cVar, gVar));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> T3(Iterable<? extends e0<? extends T>> iterable, int i10) {
        return O2(iterable).u2(Functions.k(), true, i10);
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, R> z<R> T7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, kh.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        return b8(Functions.A(jVar), false, T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5);
    }

    @jh.c
    @jh.g("none")
    private z<T> U1(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.a aVar2) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.a.g(aVar2, "onAfterTerminate is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.a0(this, gVar, gVar2, aVar, aVar2));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> U2(kh.g<i<T>> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "generator is null");
        return T2(Functions.u(), ObservableInternalHelper.m(gVar), Functions.h());
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> U3(Iterable<? extends e0<? extends T>> iterable, int i10, int i11) {
        return O2(iterable).v2(Functions.k(), true, i10, i11);
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, R> z<R> U7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, kh.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        return b8(Functions.z(iVar), false, T(), e0Var, e0Var2, e0Var3, e0Var4);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> V5(e0<? extends e0<? extends T>> e0Var) {
        return W5(e0Var, T());
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, R> z<R> V7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, kh.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        return b8(Functions.y(hVar), false, T(), e0Var, e0Var2, e0Var3);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> W5(e0<? extends e0<? extends T>> e0Var, int i10) {
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableSwitchMap(e0Var, Functions.k(), i10, false));
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, R> z<R> W7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, kh.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        return b8(Functions.x(cVar), false, T(), e0Var, e0Var2);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> X5(e0<? extends e0<? extends T>> e0Var) {
        return Y5(e0Var, T());
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, R> z<R> X7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, kh.c<? super T1, ? super T2, ? extends R> cVar, boolean z10) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        return b8(Functions.x(cVar), z10, T(), e0Var, e0Var2);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> Y5(e0<? extends e0<? extends T>> e0Var, int i10) {
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.R(new ObservableSwitchMap(e0Var, Functions.k(), i10, true));
    }

    @jh.c
    @jh.g("none")
    public static <T1, T2, R> z<R> Y7(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, kh.c<? super T1, ? super T2, ? extends R> cVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        return b8(Functions.x(cVar), z10, i10, e0Var, e0Var2);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> z<R> Z(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, e0<? extends T6> e0Var6, e0<? extends T7> e0Var7, e0<? extends T8> e0Var8, e0<? extends T9> e0Var9, kh.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(e0Var6, "source6 is null");
        io.reactivex.internal.functions.a.g(e0Var7, "source7 is null");
        io.reactivex.internal.functions.a.g(e0Var8, "source8 is null");
        io.reactivex.internal.functions.a.g(e0Var9, "source9 is null");
        return j0(Functions.E(nVar), T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8, e0Var9);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> Z3() {
        return io.reactivex.plugins.a.R(a1.f122797b);
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> Z7(e0<? extends e0<? extends T>> e0Var, kh.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        return io.reactivex.plugins.a.R(new u1(e0Var, 16).k2(ObservableInternalHelper.n(oVar)));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> z<R> a0(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, e0<? extends T6> e0Var6, e0<? extends T7> e0Var7, e0<? extends T8> e0Var8, kh.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(e0Var6, "source6 is null");
        io.reactivex.internal.functions.a.g(e0Var7, "source7 is null");
        io.reactivex.internal.functions.a.g(e0Var8, "source8 is null");
        return j0(Functions.D(mVar), T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8);
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> a8(Iterable<? extends e0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.R(new ObservableZip(null, iterable, oVar, T(), false));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> z<R> b0(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, e0<? extends T6> e0Var6, e0<? extends T7> e0Var7, kh.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(e0Var6, "source6 is null");
        io.reactivex.internal.functions.a.g(e0Var7, "source7 is null");
        return j0(Functions.C(lVar), T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7);
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> b8(kh.o<? super Object[], ? extends R> oVar, boolean z10, int i10, e0<? extends T>... e0VarArr) {
        if (e0VarArr.length == 0) {
            return d2();
        }
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableZip(e0VarArr, null, oVar, i10, z10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> c(Iterable<? extends e0<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.R(new ObservableAmb(null, iterable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, R> z<R> c0(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, e0<? extends T6> e0Var6, kh.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        io.reactivex.internal.functions.a.g(e0Var6, "source6 is null");
        return j0(Functions.B(kVar), T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6);
    }

    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> c5(e0<? extends T> e0Var, e0<? extends T> e0Var2) {
        return f5(e0Var, e0Var2, io.reactivex.internal.functions.a.d(), T());
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> c8(Iterable<? extends e0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableZip(null, iterable, oVar, i10, z10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> d(e0<? extends T>... e0VarArr) {
        io.reactivex.internal.functions.a.g(e0VarArr, "sources is null");
        int length = e0VarArr.length;
        if (length == 0) {
            return d2();
        }
        return length == 1 ? O7(e0VarArr[0]) : io.reactivex.plugins.a.R(new ObservableAmb(e0VarArr, null));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, R> z<R> d0(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, e0<? extends T5> e0Var5, kh.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        io.reactivex.internal.functions.a.g(e0Var5, "source5 is null");
        return j0(Functions.A(jVar), T(), e0Var, e0Var2, e0Var3, e0Var4, e0Var5);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> d2() {
        return io.reactivex.plugins.a.R(io.reactivex.internal.operators.observable.f0.f122882b);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public static z<Long> d3(long j10, long j11, TimeUnit timeUnit) {
        return e3(j10, j11, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> d5(e0<? extends T> e0Var, e0<? extends T> e0Var2, int i10) {
        return f5(e0Var, e0Var2, io.reactivex.internal.functions.a.d(), i10);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, T4, R> z<R> e0(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, e0<? extends T4> e0Var4, kh.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        return j0(Functions.z(iVar), T(), e0Var, e0Var2, e0Var3, e0Var4);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> e2(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "exception is null");
        return f2(Functions.m(th2));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public static z<Long> e3(long j10, long j11, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableInterval(Math.max(0L, j10), Math.max(0L, j11), timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> e5(e0<? extends T> e0Var, e0<? extends T> e0Var2, kh.d<? super T, ? super T> dVar) {
        return f5(e0Var, e0Var2, dVar, T());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, T3, R> z<R> f0(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, e0<? extends T3> e0Var3, kh.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        return j0(Functions.y(hVar), T(), e0Var, e0Var2, e0Var3);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> f2(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.a.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.g0(callable));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public static z<Long> f3(long j10, TimeUnit timeUnit) {
        return e3(j10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> f5(e0<? extends T> e0Var, e0<? extends T> e0Var2, kh.d<? super T, ? super T> dVar, int i10) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(dVar, "isEqual is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.S(new ObservableSequenceEqualSingle(e0Var, e0Var2, dVar, i10));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T1, T2, R> z<R> g0(e0<? extends T1> e0Var, e0<? extends T2> e0Var2, kh.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        return j0(Functions.x(cVar), T(), e0Var, e0Var2);
    }

    @jh.c
    @jh.g("custom")
    public static z<Long> g3(long j10, TimeUnit timeUnit, h0 h0Var) {
        return e3(j10, j10, timeUnit, h0Var);
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> h0(Iterable<? extends e0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        return i0(iterable, oVar, T());
    }

    @jh.c
    @jh.g(jh.g.E0)
    public static z<Long> h3(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return i3(j10, j11, j12, j13, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, R> z<R> i0(Iterable<? extends e0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableCombineLatest(null, iterable, oVar, i10 << 1, false));
    }

    @jh.e
    @jh.c
    @jh.g("custom")
    public static z<Long> i3(long j10, long j11, long j12, long j13, TimeUnit timeUnit, h0 h0Var) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return d2().x1(j12, timeUnit, h0Var);
        }
        long j14 = j10 + (j11 - 1);
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableIntervalRange(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> j0(kh.o<? super Object[], ? extends R> oVar, int i10, e0<? extends T>... e0VarArr) {
        return l0(e0VarArr, oVar, i10);
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> k0(e0<? extends T>[] e0VarArr, kh.o<? super Object[], ? extends R> oVar) {
        return l0(e0VarArr, oVar, T());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, R> z<R> l0(e0<? extends T>[] e0VarArr, kh.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.a.g(e0VarArr, "sources is null");
        if (e0VarArr.length == 0) {
            return d2();
        }
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableCombineLatest(e0VarArr, null, oVar, i10 << 1, false));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> l3(T t10) {
        io.reactivex.internal.functions.a.g(t10, "item is null");
        return io.reactivex.plugins.a.R(new t0(t10));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> l7(e0<T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "onSubscribe is null");
        if (e0Var instanceof z) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.o0(e0Var));
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> m0(Iterable<? extends e0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        return n0(iterable, oVar, T());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> m3(T t10, T t11) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        return I2(t10, t11);
    }

    @jh.c
    @jh.g("none")
    public static z<Integer> m4(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i11);
        }
        if (i11 == 0) {
            return d2();
        }
        if (i11 == 1) {
            return l3(Integer.valueOf(i10));
        }
        if (((long) i10) + ((long) (i11 - 1)) <= 2147483647L) {
            return io.reactivex.plugins.a.R(new ObservableRange(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, R> z<R> n0(Iterable<? extends e0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableCombineLatest(null, iterable, oVar, i10 << 1, true));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> n3(T t10, T t11, T t12) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        return I2(t10, t11, t12);
    }

    @jh.c
    @jh.g("none")
    public static z<Long> n4(long j10, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return d2();
        }
        if (j11 == 1) {
            return l3(Long.valueOf(j10));
        }
        long j12 = (j11 - 1) + j10;
        if (j10 <= 0 || j12 >= 0) {
            return io.reactivex.plugins.a.R(new ObservableRangeLong(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @jh.c
    @jh.g("none")
    public static <T, D> z<T> n7(Callable<? extends D> callable, kh.o<? super D, ? extends e0<? extends T>> oVar, kh.g<? super D> gVar) {
        return o7(callable, oVar, gVar, true);
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> o0(kh.o<? super Object[], ? extends R> oVar, int i10, e0<? extends T>... e0VarArr) {
        return q0(e0VarArr, oVar, i10);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> o3(T t10, T t11, T t12, T t13) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        return I2(t10, t11, t12, t13);
    }

    @jh.c
    @jh.g("none")
    public static <T, D> z<T> o7(Callable<? extends D> callable, kh.o<? super D, ? extends e0<? extends T>> oVar, kh.g<? super D> gVar, boolean z10) {
        io.reactivex.internal.functions.a.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.a.g(oVar, "sourceSupplier is null");
        io.reactivex.internal.functions.a.g(gVar, "disposer is null");
        return io.reactivex.plugins.a.R(new ObservableUsing(callable, oVar, gVar, z10));
    }

    @jh.c
    @jh.g("none")
    public static <T, R> z<R> p0(e0<? extends T>[] e0VarArr, kh.o<? super Object[], ? extends R> oVar) {
        return q0(e0VarArr, oVar, T());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> p3(T t10, T t11, T t12, T t13, T t14) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        return I2(t10, t11, t12, t13, t14);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T, R> z<R> q0(e0<? extends T>[] e0VarArr, kh.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        return e0VarArr.length == 0 ? d2() : io.reactivex.plugins.a.R(new ObservableCombineLatest(e0VarArr, null, oVar, i10 << 1, true));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> q1(c0<T> c0Var) {
        io.reactivex.internal.functions.a.g(c0Var, "source is null");
        return io.reactivex.plugins.a.R(new ObservableCreate(c0Var));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> q3(T t10, T t11, T t12, T t13, T t14, T t15) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        io.reactivex.internal.functions.a.g(t15, "item6 is null");
        return I2(t10, t11, t12, t13, t14, t15);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> r3(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        io.reactivex.internal.functions.a.g(t15, "item6 is null");
        io.reactivex.internal.functions.a.g(t16, "item7 is null");
        return I2(t10, t11, t12, t13, t14, t15, t16);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> s0(e0<? extends e0<? extends T>> e0Var) {
        return t0(e0Var, T());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> s3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        io.reactivex.internal.functions.a.g(t15, "item6 is null");
        io.reactivex.internal.functions.a.g(t16, "item7 is null");
        io.reactivex.internal.functions.a.g(t17, "item8 is null");
        return I2(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> t0(e0<? extends e0<? extends T>> e0Var, int i10) {
        io.reactivex.internal.functions.a.g(e0Var, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.R(new ObservableConcatMap(e0Var, Functions.k(), i10, ErrorMode.IMMEDIATE));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> t3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        io.reactivex.internal.functions.a.g(t15, "item6 is null");
        io.reactivex.internal.functions.a.g(t16, "item7 is null");
        io.reactivex.internal.functions.a.g(t17, "item8 is null");
        io.reactivex.internal.functions.a.g(t18, "item9 is null");
        return I2(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> u0(e0<? extends T> e0Var, e0<? extends T> e0Var2) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        return y0(e0Var, e0Var2);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> u3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        io.reactivex.internal.functions.a.g(t15, "item6 is null");
        io.reactivex.internal.functions.a.g(t16, "item7 is null");
        io.reactivex.internal.functions.a.g(t17, "item8 is null");
        io.reactivex.internal.functions.a.g(t18, "item9 is null");
        io.reactivex.internal.functions.a.g(t19, "item10 is null");
        return I2(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> v0(e0<? extends T> e0Var, e0<? extends T> e0Var2, e0<? extends T> e0Var3) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        return y0(e0Var, e0Var2, e0Var3);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> v1(Callable<? extends e0<? extends T>> callable) {
        io.reactivex.internal.functions.a.g(callable, "supplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.s(callable));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> w0(e0<? extends T> e0Var, e0<? extends T> e0Var2, e0<? extends T> e0Var3, e0<? extends T> e0Var4) {
        io.reactivex.internal.functions.a.g(e0Var, "source1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "source2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "source3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "source4 is null");
        return y0(e0Var, e0Var2, e0Var3, e0Var4);
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public static <T> z<T> x0(Iterable<? extends e0<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return O2(iterable).T0(Functions.k(), T(), false);
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> y0(e0<? extends T>... e0VarArr) {
        if (e0VarArr.length == 0) {
            return d2();
        }
        return e0VarArr.length == 1 ? O7(e0VarArr[0]) : io.reactivex.plugins.a.R(new ObservableConcatMap(I2(e0VarArr), Functions.k(), T(), ErrorMode.BOUNDARY));
    }

    @jh.c
    @jh.g("none")
    public static <T> z<T> z0(e0<? extends T>... e0VarArr) {
        if (e0VarArr.length == 0) {
            return d2();
        }
        return e0VarArr.length == 1 ? O7(e0VarArr[0]) : E0(I2(e0VarArr));
    }

    @jh.c
    @jh.g("none")
    public final z<List<T>> A(int i10) {
        return B(i10, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <U, V> z<T> A1(e0<U> e0Var, kh.o<? super T, ? extends e0<V>> oVar) {
        return E1(e0Var).B1(oVar);
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> A2(kh.o<? super T, ? extends w<? extends R>> oVar) {
        return B2(oVar, false);
    }

    @jh.c
    @jh.g("none")
    public final z<y<T>> A3() {
        return io.reactivex.plugins.a.R(new z0(this));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final <R> z<R> A4(kh.o<? super z<T>, ? extends e0<R>> oVar, long j10, TimeUnit timeUnit) {
        return B4(oVar, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final z<T> A5(T t10) {
        io.reactivex.internal.functions.a.g(t10, "item is null");
        return y0(l3(t10), this);
    }

    @jh.c
    @jh.g("none")
    public final z<io.reactivex.schedulers.d<T>> A6() {
        return D6(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("custom")
    public final z<z<T>> A7(long j10, TimeUnit timeUnit, h0 h0Var, long j11, boolean z10) {
        return B7(j10, timeUnit, h0Var, j11, z10, T());
    }

    @jh.c
    @jh.g("none")
    public final z<List<T>> B(int i10, int i11) {
        return (z<List<T>>) C(i10, i11, ArrayListSupplier.asCallable());
    }

    @jh.c
    @jh.g("none")
    public final <U> z<T> B1(kh.o<? super T, ? extends e0<U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "itemDelay is null");
        return (z<T>) k2(ObservableInternalHelper.c(oVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> B2(kh.o<? super T, ? extends w<? extends R>> oVar, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new ObservableFlatMapMaybe(this, oVar, z10));
    }

    @jh.c
    @jh.g("custom")
    public final <R> z<R> B4(kh.o<? super z<T>, ? extends e0<R>> oVar, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return ObservableReplay.x8(ObservableInternalHelper.j(this, j10, timeUnit, h0Var), oVar);
    }

    @jh.c
    @jh.g("none")
    public final z<T> B5(T... tArr) {
        z zVarI2 = I2(tArr);
        return zVarI2 == d2() ? io.reactivex.plugins.a.R(this) : y0(zVarI2, this);
    }

    @jh.c
    @jh.g("none")
    public final z<io.reactivex.schedulers.d<T>> B6(h0 h0Var) {
        return D6(TimeUnit.MILLISECONDS, h0Var);
    }

    @jh.c
    @jh.g("custom")
    public final z<z<T>> B7(long j10, TimeUnit timeUnit, h0 h0Var, long j11, boolean z10, int i10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.i(j11, "count");
        return io.reactivex.plugins.a.R(new x1(this, j10, j10, timeUnit, h0Var, j11, i10, z10));
    }

    @jh.c
    @jh.g("none")
    public final <U extends Collection<? super T>> z<U> C(int i10, int i11, Callable<U> callable) {
        io.reactivex.internal.functions.a.h(i10, "count");
        io.reactivex.internal.functions.a.h(i11, org.apache.tools.ant.taskdefs.optional.vss.g.L2);
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new ObservableBuffer(this, i10, i11, callable));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> C1(long j10, TimeUnit timeUnit) {
        return D1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> C2(kh.o<? super T, ? extends o0<? extends R>> oVar) {
        return D2(oVar, false);
    }

    @jh.c
    @jh.g("custom")
    public final <R> z<R> C4(kh.o<? super z<T>, ? extends e0<R>> oVar, h0 h0Var) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return ObservableReplay.x8(ObservableInternalHelper.g(this), ObservableInternalHelper.k(oVar, h0Var));
    }

    @jh.g("none")
    public final io.reactivex.disposables.b C5() {
        return G5(Functions.h(), Functions.f119561f, Functions.f119558c, Functions.h());
    }

    @jh.c
    @jh.g("none")
    public final z<io.reactivex.schedulers.d<T>> C6(TimeUnit timeUnit) {
        return D6(timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final <B> z<z<T>> C7(e0<B> e0Var) {
        return D7(e0Var, T());
    }

    @jh.c
    @jh.g("none")
    public final <U extends Collection<? super T>> z<U> D(int i10, Callable<U> callable) {
        return C(i10, i10, callable);
    }

    @jh.c
    @jh.g("custom")
    public final z<T> D1(long j10, TimeUnit timeUnit, h0 h0Var) {
        return E1(P6(j10, timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> D2(kh.o<? super T, ? extends o0<? extends R>> oVar, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new ObservableFlatMapSingle(this, oVar, z10));
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.observables.a<T> D4() {
        return ObservableReplay.w8(this);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b D5(kh.g<? super T> gVar) {
        return G5(gVar, Functions.f119561f, Functions.f119558c, Functions.h());
    }

    @jh.c
    @jh.g("none")
    public final z<io.reactivex.schedulers.d<T>> D6(TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new t1(this, timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final <B> z<z<T>> D7(e0<B> e0Var, int i10) {
        io.reactivex.internal.functions.a.g(e0Var, "boundary is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableWindowBoundary(this, e0Var, i10));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<List<T>> E(long j10, long j11, TimeUnit timeUnit) {
        return (z<List<T>>) G(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), ArrayListSupplier.asCallable());
    }

    @jh.c
    @jh.g("none")
    public final <U> z<T> E1(e0<U> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.u(this, e0Var));
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b E2(kh.g<? super T> gVar) {
        return D5(gVar);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.observables.a<T> E4(int i10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return ObservableReplay.s8(this, i10);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b E5(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
        return G5(gVar, gVar2, Functions.f119558c, Functions.h());
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> E6(long j10, TimeUnit timeUnit) {
        return M6(j10, timeUnit, null, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final <U, V> z<z<T>> E7(e0<U> e0Var, kh.o<? super U, ? extends e0<V>> oVar) {
        return F7(e0Var, oVar, T());
    }

    @jh.c
    @jh.g("custom")
    public final z<List<T>> F(long j10, long j11, TimeUnit timeUnit, h0 h0Var) {
        return (z<List<T>>) G(j10, j11, timeUnit, h0Var, ArrayListSupplier.asCallable());
    }

    @Deprecated
    @jh.c
    @jh.g("none")
    public final <T2> z<T2> F1() {
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.v(this, Functions.k()));
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b F2(kh.r<? super T> rVar) {
        return H2(rVar, Functions.f119561f, Functions.f119558c);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final io.reactivex.observables.a<T> F4(int i10, long j10, TimeUnit timeUnit) {
        return G4(i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b F5(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
        return G5(gVar, gVar2, aVar, Functions.h());
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> F6(long j10, TimeUnit timeUnit, e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return M6(j10, timeUnit, e0Var, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final <U, V> z<z<T>> F7(e0<U> e0Var, kh.o<? super U, ? extends e0<V>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(e0Var, "openingIndicator is null");
        io.reactivex.internal.functions.a.g(oVar, "closingIndicator is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new w1(this, e0Var, oVar, i10));
    }

    @jh.c
    @jh.g("custom")
    public final <U extends Collection<? super T>> z<U> G(long j10, long j11, TimeUnit timeUnit, h0 h0Var, Callable<U> callable) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.m(this, j10, j11, timeUnit, h0Var, callable, Integer.MAX_VALUE, false));
    }

    @jh.d
    @jh.c
    @jh.g("none")
    public final <R> z<R> G1(kh.o<? super T, y<R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.v(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b G2(kh.r<? super T> rVar, kh.g<? super Throwable> gVar) {
        return H2(rVar, gVar, Functions.f119558c);
    }

    @jh.c
    @jh.g("custom")
    public final io.reactivex.observables.a<T> G4(int i10, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return ObservableReplay.u8(this, j10, timeUnit, h0Var, i10);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b G5(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.g<? super io.reactivex.disposables.b> gVar3) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.a.g(gVar3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(gVar, gVar2, aVar, gVar3);
        g(lambdaObserver);
        return lambdaObserver;
    }

    @jh.c
    @jh.g("custom")
    public final z<T> G6(long j10, TimeUnit timeUnit, h0 h0Var) {
        return M6(j10, timeUnit, null, h0Var);
    }

    @jh.c
    @jh.g("none")
    public final <B> z<z<T>> G7(Callable<? extends e0<B>> callable) {
        return H7(callable, T());
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<List<T>> H(long j10, TimeUnit timeUnit) {
        return K(j10, timeUnit, io.reactivex.schedulers.b.a(), Integer.MAX_VALUE);
    }

    @jh.c
    @jh.g("none")
    public final z<T> H1() {
        return J1(Functions.k(), Functions.g());
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b H2(kh.r<? super T> rVar, kh.g<? super Throwable> gVar, kh.a aVar) {
        io.reactivex.internal.functions.a.g(rVar, "onNext is null");
        io.reactivex.internal.functions.a.g(gVar, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(rVar, gVar, aVar);
        g(forEachWhileObserver);
        return forEachWhileObserver;
    }

    @jh.c
    @jh.g("custom")
    public final io.reactivex.observables.a<T> H4(int i10, h0 h0Var) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return ObservableReplay.y8(E4(i10), h0Var);
    }

    protected abstract void H5(g0<? super T> g0Var);

    @jh.c
    @jh.g("custom")
    public final z<T> H6(long j10, TimeUnit timeUnit, h0 h0Var, e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return M6(j10, timeUnit, e0Var, h0Var);
    }

    @jh.c
    @jh.g("none")
    public final <B> z<z<T>> H7(Callable<? extends e0<B>> callable, int i10) {
        io.reactivex.internal.functions.a.g(callable, "boundary is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableWindowBoundarySupplier(this, callable, i10));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<List<T>> I(long j10, TimeUnit timeUnit, int i10) {
        return K(j10, timeUnit, io.reactivex.schedulers.b.a(), i10);
    }

    @jh.c
    @jh.g("none")
    public final <K> z<T> I1(kh.o<? super T, K> oVar) {
        return J1(oVar, Functions.g());
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final io.reactivex.observables.a<T> I4(long j10, TimeUnit timeUnit) {
        return J4(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("custom")
    public final z<T> I5(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableSubscribeOn(this, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final <U, V> z<T> I6(e0<U> e0Var, kh.o<? super T, ? extends e0<V>> oVar) {
        io.reactivex.internal.functions.a.g(e0Var, "firstTimeoutIndicator is null");
        return N6(e0Var, oVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <T1, T2, T3, T4, R> z<R> I7(e0<T1> e0Var, e0<T2> e0Var2, e0<T3> e0Var3, e0<T4> e0Var4, kh.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        io.reactivex.internal.functions.a.g(e0Var, "o1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "o2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "o3 is null");
        io.reactivex.internal.functions.a.g(e0Var4, "o4 is null");
        io.reactivex.internal.functions.a.g(jVar, "combiner is null");
        return N7(new e0[]{e0Var, e0Var2, e0Var3, e0Var4}, Functions.A(jVar));
    }

    @jh.c
    @jh.g("custom")
    public final z<List<T>> J(long j10, TimeUnit timeUnit, h0 h0Var) {
        return (z<List<T>>) L(j10, timeUnit, h0Var, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }

    @jh.c
    @jh.g("none")
    public final <K> z<T> J1(kh.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.x(this, oVar, callable));
    }

    @jh.c
    @jh.g("custom")
    public final io.reactivex.observables.a<T> J4(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return ObservableReplay.t8(this, j10, timeUnit, h0Var);
    }

    @jh.c
    @jh.g("none")
    public final <E extends g0<? super T>> E J5(E e10) {
        g(e10);
        return e10;
    }

    @jh.c
    @jh.g("none")
    public final <U, V> z<T> J6(e0<U> e0Var, kh.o<? super T, ? extends e0<V>> oVar, e0<? extends T> e0Var2) {
        io.reactivex.internal.functions.a.g(e0Var, "firstTimeoutIndicator is null");
        io.reactivex.internal.functions.a.g(e0Var2, "other is null");
        return N6(e0Var, oVar, e0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <T1, T2, T3, R> z<R> J7(e0<T1> e0Var, e0<T2> e0Var2, e0<T3> e0Var3, kh.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        io.reactivex.internal.functions.a.g(e0Var, "o1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "o2 is null");
        io.reactivex.internal.functions.a.g(e0Var3, "o3 is null");
        io.reactivex.internal.functions.a.g(iVar, "combiner is null");
        return N7(new e0[]{e0Var, e0Var2, e0Var3}, Functions.z(iVar));
    }

    @jh.c
    @jh.g("custom")
    public final z<List<T>> K(long j10, TimeUnit timeUnit, h0 h0Var, int i10) {
        return (z<List<T>>) L(j10, timeUnit, h0Var, i10, ArrayListSupplier.asCallable(), false);
    }

    @jh.c
    @jh.g("none")
    public final z<T> K1() {
        return M1(Functions.k());
    }

    @jh.c
    @jh.g("custom")
    public final io.reactivex.observables.a<T> K4(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return ObservableReplay.y8(D4(), h0Var);
    }

    @jh.c
    @jh.g("none")
    public final z<T> K5(e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return io.reactivex.plugins.a.R(new o1(this, e0Var));
    }

    @jh.c
    @jh.g("none")
    public final <V> z<T> K6(kh.o<? super T, ? extends e0<V>> oVar) {
        return N6(null, oVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <T1, T2, R> z<R> K7(e0<T1> e0Var, e0<T2> e0Var2, kh.h<? super T, ? super T1, ? super T2, R> hVar) {
        io.reactivex.internal.functions.a.g(e0Var, "o1 is null");
        io.reactivex.internal.functions.a.g(e0Var2, "o2 is null");
        io.reactivex.internal.functions.a.g(hVar, "combiner is null");
        return N7(new e0[]{e0Var, e0Var2}, Functions.y(hVar));
    }

    @jh.c
    @jh.g("custom")
    public final <U extends Collection<? super T>> z<U> L(long j10, TimeUnit timeUnit, h0 h0Var, int i10, Callable<U> callable, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        io.reactivex.internal.functions.a.h(i10, "count");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.m(this, j10, j10, timeUnit, h0Var, callable, i10, z10));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> L0(kh.o<? super T, ? extends e0<? extends R>> oVar) {
        return M0(oVar, 2);
    }

    @jh.c
    @jh.g("none")
    public final z<T> L1(kh.d<? super T, ? super T> dVar) {
        io.reactivex.internal.functions.a.g(dVar, "comparer is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.y(this, Functions.k(), dVar));
    }

    @jh.c
    @jh.g("none")
    public final z<T> L4() {
        return N4(Long.MAX_VALUE, Functions.c());
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> L5(kh.o<? super T, ? extends e0<? extends R>> oVar) {
        return M5(oVar, T());
    }

    @jh.c
    @jh.g("none")
    public final <V> z<T> L6(kh.o<? super T, ? extends e0<V>> oVar, e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return N6(null, oVar, e0Var);
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> L7(e0<? extends U> e0Var, kh.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        io.reactivex.internal.functions.a.g(cVar, "combiner is null");
        return io.reactivex.plugins.a.R(new ObservableWithLatestFrom(this, cVar, e0Var));
    }

    @jh.c
    @jh.g("none")
    public final <B> z<List<T>> M(e0<B> e0Var) {
        return (z<List<T>>) O(e0Var, ArrayListSupplier.asCallable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <R> z<R> M0(kh.o<? super T, ? extends e0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        if (!(this instanceof lh.m)) {
            return io.reactivex.plugins.a.R(new ObservableConcatMap(this, oVar, i10, ErrorMode.IMMEDIATE));
        }
        Object objCall = ((lh.m) this).call();
        return objCall == null ? d2() : ObservableScalarXMap.a(objCall, oVar);
    }

    @jh.c
    @jh.g("none")
    public final <K> z<T> M1(kh.o<? super T, K> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.y(this, oVar, io.reactivex.internal.functions.a.d()));
    }

    @jh.c
    @jh.g("none")
    public final z<T> M4(long j10) {
        return N4(j10, Functions.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <R> z<R> M5(kh.o<? super T, ? extends e0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        if (!(this instanceof lh.m)) {
            return io.reactivex.plugins.a.R(new ObservableSwitchMap(this, oVar, i10, false));
        }
        Object objCall = ((lh.m) this).call();
        return objCall == null ? d2() : ObservableScalarXMap.a(objCall, oVar);
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> M7(Iterable<? extends e0<?>> iterable, kh.o<? super Object[], R> oVar) {
        io.reactivex.internal.functions.a.g(iterable, "others is null");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        return io.reactivex.plugins.a.R(new ObservableWithLatestFromMany(this, iterable, oVar));
    }

    @jh.c
    @jh.g("none")
    public final <B> z<List<T>> N(e0<B> e0Var, int i10) {
        io.reactivex.internal.functions.a.h(i10, "initialCapacity");
        return (z<List<T>>) O(e0Var, Functions.f(i10));
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a N0(kh.o<? super T, ? extends g> oVar) {
        return O0(oVar, 2);
    }

    @jh.c
    @jh.g("none")
    public final z<T> N1(kh.g<? super T> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onAfterNext is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.z(this, gVar));
    }

    @jh.c
    @jh.g("none")
    public final z<T> N4(long j10, kh.r<? super Throwable> rVar) {
        if (j10 >= 0) {
            io.reactivex.internal.functions.a.g(rVar, "predicate is null");
            return io.reactivex.plugins.a.R(new ObservableRetryPredicate(this, j10, rVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a N5(@jh.e kh.o<? super T, ? extends g> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new ObservableSwitchMapCompletable(this, oVar, false));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> N7(e0<?>[] e0VarArr, kh.o<? super Object[], R> oVar) {
        io.reactivex.internal.functions.a.g(e0VarArr, "others is null");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        return io.reactivex.plugins.a.R(new ObservableWithLatestFromMany(this, e0VarArr, oVar));
    }

    @jh.c
    @jh.g("none")
    public final <B, U extends Collection<? super T>> z<U> O(e0<B> e0Var, Callable<U> callable) {
        io.reactivex.internal.functions.a.g(e0Var, "boundary is null");
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.l(this, e0Var, callable));
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a O0(kh.o<? super T, ? extends g> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "capacityHint");
        return io.reactivex.plugins.a.O(new ObservableConcatMapCompletable(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    @jh.c
    @jh.g("none")
    public final z<T> O1(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onFinally is null");
        return U1(Functions.h(), Functions.h(), Functions.f119558c, aVar);
    }

    @jh.c
    @jh.g("none")
    public final z<T> O4(kh.d<? super Integer, ? super Throwable> dVar) {
        io.reactivex.internal.functions.a.g(dVar, "predicate is null");
        return io.reactivex.plugins.a.R(new ObservableRetryBiPredicate(this, dVar));
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a O5(@jh.e kh.o<? super T, ? extends g> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new ObservableSwitchMapCompletable(this, oVar, true));
    }

    @jh.c
    @jh.g("none")
    public final <TOpening, TClosing> z<List<T>> P(e0<? extends TOpening> e0Var, kh.o<? super TOpening, ? extends e0<? extends TClosing>> oVar) {
        return (z<List<T>>) Q(e0Var, oVar, ArrayListSupplier.asCallable());
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a P0(kh.o<? super T, ? extends g> oVar) {
        return R0(oVar, true, 2);
    }

    @jh.c
    @jh.g("none")
    public final z<T> P1(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.R(new ObservableDoFinally(this, aVar));
    }

    @jh.c
    @jh.g("none")
    public final z<T> P4(kh.r<? super Throwable> rVar) {
        return N4(Long.MAX_VALUE, rVar);
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> P5(kh.o<? super T, ? extends e0<? extends R>> oVar) {
        return Q5(oVar, T());
    }

    @jh.c
    @jh.g("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> z<U> Q(e0<? extends TOpening> e0Var, kh.o<? super TOpening, ? extends e0<? extends TClosing>> oVar, Callable<U> callable) {
        io.reactivex.internal.functions.a.g(e0Var, "openingIndicator is null");
        io.reactivex.internal.functions.a.g(oVar, "closingIndicator is null");
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new ObservableBufferBoundary(this, e0Var, oVar, callable));
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a Q0(kh.o<? super T, ? extends g> oVar, boolean z10) {
        return R0(oVar, z10, 2);
    }

    @jh.c
    @jh.g("none")
    public final z<T> Q1(kh.a aVar) {
        return U1(Functions.h(), Functions.h(), aVar, Functions.f119558c);
    }

    @jh.c
    @jh.g("none")
    public final z<T> Q4(kh.e eVar) {
        io.reactivex.internal.functions.a.g(eVar, "stop is null");
        return N4(Long.MAX_VALUE, Functions.v(eVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <R> z<R> Q5(kh.o<? super T, ? extends e0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        if (!(this instanceof lh.m)) {
            return io.reactivex.plugins.a.R(new ObservableSwitchMap(this, oVar, i10, true));
        }
        Object objCall = ((lh.m) this).call();
        return objCall == null ? d2() : ObservableScalarXMap.a(objCall, oVar);
    }

    @jh.c
    @jh.g("none")
    public final z<io.reactivex.schedulers.d<T>> Q6() {
        return T6(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final <B> z<List<T>> R(Callable<? extends e0<B>> callable) {
        return (z<List<T>>) S(callable, ArrayListSupplier.asCallable());
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a R0(kh.o<? super T, ? extends g> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.O(new ObservableConcatMapCompletable(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @jh.c
    @jh.g("none")
    public final z<T> R1(kh.a aVar) {
        return W1(Functions.h(), aVar);
    }

    @jh.c
    @jh.g("none")
    public final z<T> R4(kh.o<? super z<Throwable>, ? extends e0<?>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "handler is null");
        return io.reactivex.plugins.a.R(new ObservableRetryWhen(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> R5(@jh.e kh.o<? super T, ? extends w<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new ObservableSwitchMapMaybe(this, oVar, false));
    }

    @jh.c
    @jh.g("none")
    public final z<io.reactivex.schedulers.d<T>> R6(h0 h0Var) {
        return T6(TimeUnit.MILLISECONDS, h0Var);
    }

    @jh.c
    @jh.g("none")
    public final <B, U extends Collection<? super T>> z<U> S(Callable<? extends e0<B>> callable, Callable<U> callable2) {
        io.reactivex.internal.functions.a.g(callable, "boundarySupplier is null");
        io.reactivex.internal.functions.a.g(callable2, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.k(this, callable, callable2));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> S0(kh.o<? super T, ? extends e0<? extends R>> oVar) {
        return T0(oVar, T(), true);
    }

    @jh.c
    @jh.g("none")
    public final z<T> S1(g0<? super T> g0Var) {
        io.reactivex.internal.functions.a.g(g0Var, "observer is null");
        return U1(ObservableInternalHelper.f(g0Var), ObservableInternalHelper.e(g0Var), ObservableInternalHelper.d(g0Var), Functions.f119558c);
    }

    @jh.g("none")
    public final void S4(g0<? super T> g0Var) {
        io.reactivex.internal.functions.a.g(g0Var, "observer is null");
        if (g0Var instanceof io.reactivex.observers.k) {
            g(g0Var);
        } else {
            g(new io.reactivex.observers.k(g0Var));
        }
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> S5(@jh.e kh.o<? super T, ? extends w<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new ObservableSwitchMapMaybe(this, oVar, true));
    }

    @jh.c
    @jh.g("none")
    public final z<io.reactivex.schedulers.d<T>> S6(TimeUnit timeUnit) {
        return T6(timeUnit, io.reactivex.schedulers.b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <R> z<R> T0(kh.o<? super T, ? extends e0<? extends R>> oVar, int i10, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        if (!(this instanceof lh.m)) {
            return io.reactivex.plugins.a.R(new ObservableConcatMap(this, oVar, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object objCall = ((lh.m) this).call();
        return objCall == null ? d2() : ObservableScalarXMap.a(objCall, oVar);
    }

    @jh.c
    @jh.g("none")
    public final z<T> T1(kh.g<? super y<T>> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onNotification is null");
        return U1(Functions.t(gVar), Functions.s(gVar), Functions.r(gVar), Functions.f119558c);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> T4(long j10, TimeUnit timeUnit) {
        return U4(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> z<R> T5(@jh.e kh.o<? super T, ? extends o0<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new ObservableSwitchMapSingle(this, oVar, false));
    }

    @jh.c
    @jh.g("none")
    public final z<io.reactivex.schedulers.d<T>> T6(TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return (z<io.reactivex.schedulers.d<T>>) z3(Functions.w(timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final z<T> U() {
        return V(16);
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> U0(kh.o<? super T, ? extends e0<? extends R>> oVar) {
        return V0(oVar, Integer.MAX_VALUE, T());
    }

    @jh.c
    @jh.g("custom")
    public final z<T> U4(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableSampleTimed(this, j10, timeUnit, h0Var, false));
    }

    @jh.e
    @jh.c
    @jh.g("none")
    public final <R> z<R> U5(@jh.e kh.o<? super T, ? extends o0<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new ObservableSwitchMapSingle(this, oVar, true));
    }

    @jh.c
    @jh.g("none")
    public final <R> R U6(kh.o<? super z<T>, R> oVar) {
        try {
            return (R) ((kh.o) io.reactivex.internal.functions.a.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    @jh.c
    @jh.g("none")
    public final z<T> V(int i10) {
        io.reactivex.internal.functions.a.h(i10, "initialCapacity");
        return io.reactivex.plugins.a.R(new ObservableCache(this, i10));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> V0(kh.o<? super T, ? extends e0<? extends R>> oVar, int i10, int i11) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.plugins.a.R(new ObservableConcatMapEager(this, oVar, ErrorMode.IMMEDIATE, i10, i11));
    }

    @jh.c
    @jh.g("none")
    public final z<T> V1(kh.g<? super Throwable> gVar) {
        kh.g<? super T> gVarH = Functions.h();
        kh.a aVar = Functions.f119558c;
        return U1(gVarH, gVar, aVar, aVar);
    }

    @jh.c
    @jh.g("none")
    public final <K> z<io.reactivex.observables.b<K, T>> V2(kh.o<? super T, ? extends K> oVar) {
        return (z<io.reactivex.observables.b<K, T>>) Y2(oVar, Functions.k(), false, T());
    }

    @jh.c
    @jh.g("none")
    public final z<T> V3(@jh.e g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return io.reactivex.plugins.a.R(new ObservableMergeWithCompletable(this, gVar));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> V4(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableSampleTimed(this, j10, timeUnit, h0Var, z10));
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final j<T> V6(BackpressureStrategy backpressureStrategy) {
        io.reactivex.internal.operators.flowable.g0 g0Var = new io.reactivex.internal.operators.flowable.g0(this);
        int i10 = a.f124185a[backpressureStrategy.ordinal()];
        if (i10 == 1) {
            return g0Var.x4();
        }
        if (i10 == 2) {
            return g0Var.z4();
        }
        if (i10 != 3) {
            return i10 != 4 ? g0Var.p4() : io.reactivex.plugins.a.P(new FlowableOnBackpressureError(g0Var));
        }
        return g0Var;
    }

    @jh.c
    @jh.g("none")
    public final <U> z<U> W(Class<U> cls) {
        io.reactivex.internal.functions.a.g(cls, "clazz is null");
        return (z<U>) z3(Functions.e(cls));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> W0(kh.o<? super T, ? extends e0<? extends R>> oVar, int i10, int i11, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.plugins.a.R(new ObservableConcatMapEager(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10, i11));
    }

    @jh.c
    @jh.g("none")
    public final z<T> W1(kh.g<? super io.reactivex.disposables.b> gVar, kh.a aVar) {
        io.reactivex.internal.functions.a.g(gVar, "onSubscribe is null");
        io.reactivex.internal.functions.a.g(aVar, "onDispose is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.b0(this, gVar, aVar));
    }

    @jh.c
    @jh.g("none")
    public final <K, V> z<io.reactivex.observables.b<K, V>> W2(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2) {
        return Y2(oVar, oVar2, false, T());
    }

    @jh.c
    @jh.g("none")
    public final z<T> W3(@jh.e w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return io.reactivex.plugins.a.R(new ObservableMergeWithMaybe(this, wVar));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> W4(long j10, TimeUnit timeUnit, boolean z10) {
        return V4(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @jh.c
    @jh.g("none")
    public final Future<T> W6() {
        return (Future) J5(new io.reactivex.internal.observers.h());
    }

    @jh.c
    @jh.g("none")
    public final <U> i0<U> X(Callable<? extends U> callable, kh.b<? super U, ? super T> bVar) {
        io.reactivex.internal.functions.a.g(callable, "initialValueSupplier is null");
        io.reactivex.internal.functions.a.g(bVar, "collector is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.o(this, callable, bVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> X0(kh.o<? super T, ? extends e0<? extends R>> oVar, boolean z10) {
        return W0(oVar, Integer.MAX_VALUE, T(), z10);
    }

    @jh.c
    @jh.g("none")
    public final z<T> X1(kh.g<? super T> gVar) {
        kh.g<? super Throwable> gVarH = Functions.h();
        kh.a aVar = Functions.f119558c;
        return U1(gVar, gVarH, aVar, aVar);
    }

    @jh.c
    @jh.g("none")
    public final <K, V> z<io.reactivex.observables.b<K, V>> X2(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, boolean z10) {
        return Y2(oVar, oVar2, z10, T());
    }

    @jh.c
    @jh.g("none")
    public final z<T> X3(e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return D3(this, e0Var);
    }

    @jh.c
    @jh.g("none")
    public final <U> z<T> X4(e0<U> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "sampler is null");
        return io.reactivex.plugins.a.R(new ObservableSampleWithObservable(this, e0Var, false));
    }

    @jh.c
    @jh.g("none")
    public final i0<List<T>> X6() {
        return Y6(16);
    }

    @jh.c
    @jh.g("none")
    public final <U> i0<U> Y(U u10, kh.b<? super U, ? super T> bVar) {
        io.reactivex.internal.functions.a.g(u10, "initialValue is null");
        return X(Functions.m(u10), bVar);
    }

    @jh.c
    @jh.g("none")
    public final <U> z<U> Y0(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.i0(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final z<T> Y1(kh.g<? super io.reactivex.disposables.b> gVar) {
        return W1(gVar, Functions.f119558c);
    }

    @jh.c
    @jh.g("none")
    public final <K, V> z<io.reactivex.observables.b<K, V>> Y2(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableGroupBy(this, oVar, oVar2, i10, z10));
    }

    @jh.c
    @jh.g("none")
    public final z<T> Y3(@jh.e o0<? extends T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return io.reactivex.plugins.a.R(new ObservableMergeWithSingle(this, o0Var));
    }

    @jh.c
    @jh.g("none")
    public final <U> z<T> Y4(e0<U> e0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(e0Var, "sampler is null");
        return io.reactivex.plugins.a.R(new ObservableSampleWithObservable(this, e0Var, z10));
    }

    @jh.c
    @jh.g("none")
    public final i0<List<T>> Y6(int i10) {
        io.reactivex.internal.functions.a.h(i10, "capacityHint");
        return io.reactivex.plugins.a.S(new v1(this, i10));
    }

    @jh.c
    @jh.g("none")
    public final <U> z<U> Z0(kh.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return (z<U>) M0(ObservableInternalHelper.a(oVar), i10);
    }

    @jh.c
    @jh.g("none")
    public final z<T> Z1(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onTerminate is null");
        return U1(Functions.h(), Functions.a(aVar), aVar, Functions.f119558c);
    }

    @jh.c
    @jh.g("none")
    public final <K> z<io.reactivex.observables.b<K, T>> Z2(kh.o<? super T, ? extends K> oVar, boolean z10) {
        return (z<io.reactivex.observables.b<K, T>>) Y2(oVar, Functions.k(), z10, T());
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> Z4(R r10, kh.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.a.g(r10, "initialValue is null");
        return b5(Functions.m(r10), cVar);
    }

    @jh.c
    @jh.g("none")
    public final z<T> Z5(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.R(new p1(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    @jh.c
    @jh.g("none")
    public final <U extends Collection<? super T>> i0<U> Z6(Callable<U> callable) {
        io.reactivex.internal.functions.a.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.S(new v1(this, callable));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> a1(kh.o<? super T, ? extends w<? extends R>> oVar) {
        return b1(oVar, 2);
    }

    @jh.c
    @jh.g("none")
    public final q<T> a2(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.observable.d0(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @jh.c
    @jh.g("none")
    public final <TRight, TLeftEnd, TRightEnd, R> z<R> a3(e0<? extends TRight> e0Var, kh.o<? super T, ? extends e0<TLeftEnd>> oVar, kh.o<? super TRight, ? extends e0<TRightEnd>> oVar2, kh.c<? super T, ? super z<TRight>, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        io.reactivex.internal.functions.a.g(oVar, "leftEnd is null");
        io.reactivex.internal.functions.a.g(oVar2, "rightEnd is null");
        io.reactivex.internal.functions.a.g(cVar, "resultSelector is null");
        return io.reactivex.plugins.a.R(new ObservableGroupJoin(this, e0Var, oVar, oVar2, cVar));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> a4(h0 h0Var) {
        return c4(h0Var, false, T());
    }

    @jh.c
    @jh.g("none")
    public final z<T> a5(kh.c<T, T, T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "accumulator is null");
        return io.reactivex.plugins.a.R(new g1(this, cVar));
    }

    @jh.c
    @jh.g("none")
    public final z<T> a6(long j10, TimeUnit timeUnit) {
        return l6(O6(j10, timeUnit));
    }

    @jh.c
    @jh.g("none")
    public final <K> i0<Map<K, T>> a7(kh.o<? super T, ? extends K> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        return (i0<Map<K, T>>) X(HashMapSupplier.asCallable(), Functions.F(oVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<Boolean> b(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.f(this, rVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> b1(kh.o<? super T, ? extends w<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.R(new ObservableConcatMapMaybe(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> b2(long j10, T t10) {
        if (j10 >= 0) {
            io.reactivex.internal.functions.a.g(t10, "defaultItem is null");
            return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.e0(this, j10, t10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @jh.c
    @jh.g("none")
    public final z<T> b3() {
        return io.reactivex.plugins.a.R(new q0(this));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> b4(h0 h0Var, boolean z10) {
        return c4(h0Var, z10, T());
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> b5(Callable<R> callable, kh.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.a.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.a.g(cVar, "accumulator is null");
        return io.reactivex.plugins.a.R(new h1(this, callable, cVar));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> b6(long j10, TimeUnit timeUnit, h0 h0Var) {
        return l6(P6(j10, timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final <K, V> i0<Map<K, V>> b7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(oVar2, "valueSelector is null");
        return (i0<Map<K, V>>) X(HashMapSupplier.asCallable(), Functions.G(oVar, oVar2));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> c1(kh.o<? super T, ? extends w<? extends R>> oVar) {
        return e1(oVar, true, 2);
    }

    @jh.c
    @jh.g("none")
    public final i0<T> c2(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.e0(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a c3() {
        return io.reactivex.plugins.a.O(new s0(this));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> c4(h0 h0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableObserveOn(this, h0Var, z10, i10));
    }

    @jh.c
    @jh.g("none")
    public final z<T> c6(int i10) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return io.reactivex.plugins.a.R(new r0(this));
            }
            return i10 == 1 ? io.reactivex.plugins.a.R(new q1(this)) : io.reactivex.plugins.a.R(new ObservableTakeLast(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <K, V> i0<Map<K, V>> c7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.a.g(callable, "mapSupplier is null");
        return (i0<Map<K, V>>) X(callable, Functions.G(oVar, oVar2));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> d1(kh.o<? super T, ? extends w<? extends R>> oVar, boolean z10) {
        return e1(oVar, z10, 2);
    }

    @jh.c
    @jh.g("none")
    public final <U> z<U> d4(Class<U> cls) {
        io.reactivex.internal.functions.a.g(cls, "clazz is null");
        return g2(Functions.l(cls)).W(cls);
    }

    @jh.c
    @jh.g(jh.g.H0)
    public final z<T> d6(long j10, long j11, TimeUnit timeUnit) {
        return f6(j10, j11, timeUnit, io.reactivex.schedulers.b.i(), false, T());
    }

    @jh.c
    @jh.g("none")
    public final <K> i0<Map<K, Collection<T>>> d7(kh.o<? super T, ? extends K> oVar) {
        return (i0<Map<K, Collection<T>>>) g7(oVar, Functions.k(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> d8(e0<? extends U> e0Var, kh.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return W7(this, e0Var, cVar);
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> e1(kh.o<? super T, ? extends w<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.R(new ObservableConcatMapMaybe(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @jh.c
    @jh.g("none")
    public final z<T> e4(e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "next is null");
        return f4(Functions.n(e0Var));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> e6(long j10, long j11, TimeUnit timeUnit, h0 h0Var) {
        return f6(j10, j11, timeUnit, h0Var, false, T());
    }

    @jh.c
    @jh.g("none")
    public final <K, V> i0<Map<K, Collection<V>>> e7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2) {
        return g7(oVar, oVar2, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> e8(e0<? extends U> e0Var, kh.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return X7(this, e0Var, cVar, z10);
    }

    @jh.c
    @jh.g("none")
    public final z<T> f(e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return d(this, e0Var);
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> f1(kh.o<? super T, ? extends o0<? extends R>> oVar) {
        return g1(oVar, 2);
    }

    @jh.c
    @jh.g("none")
    public final z<T> f4(kh.o<? super Throwable, ? extends e0<? extends T>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "resumeFunction is null");
        return io.reactivex.plugins.a.R(new b1(this, oVar, false));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> f6(long j10, long j11, TimeUnit timeUnit, h0 h0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        if (j10 >= 0) {
            return io.reactivex.plugins.a.R(new ObservableTakeLastTimed(this, j10, j11, timeUnit, h0Var, i10, z10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j10);
    }

    @jh.c
    @jh.g("none")
    public final <K, V> i0<Map<K, Collection<V>>> f7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return g7(oVar, oVar2, callable, ArrayListSupplier.asFunction());
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> f8(e0<? extends U> e0Var, kh.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return Y7(this, e0Var, cVar, z10, i10);
    }

    @Override // io.reactivex.e0
    @jh.g("none")
    public final void g(g0<? super T> g0Var) {
        io.reactivex.internal.functions.a.g(g0Var, "observer is null");
        try {
            g0<? super T> g0VarF0 = io.reactivex.plugins.a.f0(this, g0Var);
            io.reactivex.internal.functions.a.g(g0VarF0, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            H5(g0VarF0);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> g1(kh.o<? super T, ? extends o0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.R(new ObservableConcatMapSingle(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    @jh.c
    @jh.g("none")
    public final z<T> g2(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.h0(this, rVar));
    }

    @jh.c
    @jh.g("none")
    public final z<T> g4(kh.o<? super Throwable, ? extends T> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "valueSupplier is null");
        return io.reactivex.plugins.a.R(new c1(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final z<T> g5() {
        return io.reactivex.plugins.a.R(new i1(this));
    }

    @jh.c
    @jh.g(jh.g.H0)
    public final z<T> g6(long j10, TimeUnit timeUnit) {
        return j6(j10, timeUnit, io.reactivex.schedulers.b.i(), false, T());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <K, V> i0<Map<K, Collection<V>>> g7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, kh.o<? super K, ? extends Collection<? super V>> oVar3) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.a.g(callable, "mapSupplier is null");
        io.reactivex.internal.functions.a.g(oVar3, "collectionFactory is null");
        return (i0<Map<K, Collection<V>>>) X(callable, Functions.H(oVar, oVar2, oVar3));
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> g8(Iterable<U> iterable, kh.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(iterable, "other is null");
        io.reactivex.internal.functions.a.g(cVar, "zipper is null");
        return io.reactivex.plugins.a.R(new y1(this, iterable, cVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<Boolean> h(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.h(this, rVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> h1(kh.o<? super T, ? extends o0<? extends R>> oVar) {
        return j1(oVar, true, 2);
    }

    @jh.c
    @jh.g("none")
    public final i0<T> h2(T t10) {
        return b2(0L, t10);
    }

    @jh.c
    @jh.g("none")
    public final z<T> h4(T t10) {
        io.reactivex.internal.functions.a.g(t10, "item is null");
        return g4(Functions.n(t10));
    }

    @jh.c
    @jh.g("none")
    public final z<T> h5() {
        return l4().m8();
    }

    @jh.c
    @jh.g("custom")
    public final z<T> h6(long j10, TimeUnit timeUnit, h0 h0Var) {
        return j6(j10, timeUnit, h0Var, false, T());
    }

    @jh.c
    @jh.g("none")
    public final i0<List<T>> h7() {
        return j7(Functions.q());
    }

    @jh.c
    @jh.g("none")
    public final <R> R i(@jh.e a0<T, ? extends R> a0Var) {
        return (R) ((a0) io.reactivex.internal.functions.a.g(a0Var, "converter is null")).a(this);
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> i1(kh.o<? super T, ? extends o0<? extends R>> oVar, boolean z10) {
        return j1(oVar, z10, 2);
    }

    @jh.c
    @jh.g("none")
    public final q<T> i2() {
        return a2(0L);
    }

    @jh.c
    @jh.g("none")
    public final z<T> i4(e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "next is null");
        return io.reactivex.plugins.a.R(new b1(this, Functions.n(e0Var), true));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> i5(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultItem is null");
        return io.reactivex.plugins.a.S(new k1(this, t10));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> i6(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        return j6(j10, timeUnit, h0Var, z10, T());
    }

    @jh.c
    @jh.g("none")
    public final i0<List<T>> i7(int i10) {
        return k7(Functions.q(), i10);
    }

    @jh.c
    @jh.g("none")
    public final T j() {
        io.reactivex.internal.observers.d dVar = new io.reactivex.internal.observers.d();
        g(dVar);
        T tA = dVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> j1(kh.o<? super T, ? extends o0<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.R(new ObservableConcatMapSingle(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> j2() {
        return c2(0L);
    }

    @jh.c
    @jh.g("none")
    public final i0<Boolean> j3() {
        return b(Functions.b());
    }

    @jh.c
    @jh.g("none")
    public final z<T> j4() {
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.w(this));
    }

    @jh.c
    @jh.g("none")
    public final q<T> j5() {
        return io.reactivex.plugins.a.Q(new j1(this));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> j6(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10, int i10) {
        return f6(Long.MAX_VALUE, j10, timeUnit, h0Var, z10, i10);
    }

    @jh.c
    @jh.g("none")
    public final i0<List<T>> j7(Comparator<? super T> comparator) {
        io.reactivex.internal.functions.a.g(comparator, "comparator is null");
        return (i0<List<T>>) X6().t0(Functions.o(comparator));
    }

    @jh.c
    @jh.g("none")
    public final T k(T t10) {
        io.reactivex.internal.observers.d dVar = new io.reactivex.internal.observers.d();
        g(dVar);
        T tA = dVar.a();
        return tA != null ? tA : t10;
    }

    @jh.c
    @jh.g("none")
    public final z<T> k1(@jh.e g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return io.reactivex.plugins.a.R(new ObservableConcatWithCompletable(this, gVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> k2(kh.o<? super T, ? extends e0<? extends R>> oVar) {
        return t2(oVar, false);
    }

    @jh.c
    @jh.g("none")
    public final <TRight, TLeftEnd, TRightEnd, R> z<R> k3(e0<? extends TRight> e0Var, kh.o<? super T, ? extends e0<TLeftEnd>> oVar, kh.o<? super TRight, ? extends e0<TRightEnd>> oVar2, kh.c<? super T, ? super TRight, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        io.reactivex.internal.functions.a.g(oVar, "leftEnd is null");
        io.reactivex.internal.functions.a.g(oVar2, "rightEnd is null");
        io.reactivex.internal.functions.a.g(cVar, "resultSelector is null");
        return io.reactivex.plugins.a.R(new ObservableJoin(this, e0Var, oVar, oVar2, cVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> k4(kh.o<? super z<T>, ? extends e0<R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        return io.reactivex.plugins.a.R(new ObservablePublishSelector(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> k5() {
        return io.reactivex.plugins.a.S(new k1(this, null));
    }

    @jh.c
    @jh.g(jh.g.H0)
    public final z<T> k6(long j10, TimeUnit timeUnit, boolean z10) {
        return j6(j10, timeUnit, io.reactivex.schedulers.b.i(), z10, T());
    }

    @jh.c
    @jh.g("none")
    public final i0<List<T>> k7(Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.a.g(comparator, "comparator is null");
        return (i0<List<T>>) Y6(i10).t0(Functions.o(comparator));
    }

    @jh.g("none")
    public final void l(kh.g<? super T> gVar) {
        Iterator<T> it = m().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                ((io.reactivex.disposables.b) it).dispose();
                throw ExceptionHelper.f(th2);
            }
        }
    }

    @jh.c
    @jh.g("none")
    public final z<T> l1(@jh.e w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return io.reactivex.plugins.a.R(new ObservableConcatWithMaybe(this, wVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> l2(kh.o<? super T, ? extends e0<? extends R>> oVar, int i10) {
        return v2(oVar, false, i10, T());
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.observables.a<T> l4() {
        return ObservablePublish.s8(this);
    }

    @jh.c
    @jh.g("none")
    public final z<T> l5(long j10) {
        return j10 <= 0 ? io.reactivex.plugins.a.R(this) : io.reactivex.plugins.a.R(new l1(this, j10));
    }

    @jh.c
    @jh.g("none")
    public final <U> z<T> l6(e0<U> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return io.reactivex.plugins.a.R(new ObservableTakeUntil(this, e0Var));
    }

    @jh.c
    @jh.g("none")
    public final Iterable<T> m() {
        return n(T());
    }

    @jh.c
    @jh.g("none")
    public final z<T> m1(e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return u0(this, e0Var);
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> m2(kh.o<? super T, ? extends e0<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar) {
        return q2(oVar, cVar, false, T(), T());
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> m5(long j10, TimeUnit timeUnit) {
        return u5(O6(j10, timeUnit));
    }

    @jh.c
    @jh.g("none")
    public final z<T> m6(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "stopPredicate is null");
        return io.reactivex.plugins.a.R(new r1(this, rVar));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> m7(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableUnsubscribeOn(this, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final Iterable<T> n(int i10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return new BlockingObservableIterable(this, i10);
    }

    @jh.c
    @jh.g("none")
    public final z<T> n1(@jh.e o0<? extends T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return io.reactivex.plugins.a.R(new ObservableConcatWithSingle(this, o0Var));
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> n2(kh.o<? super T, ? extends e0<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar, int i10) {
        return q2(oVar, cVar, false, i10, T());
    }

    @jh.c
    @jh.g("custom")
    public final z<T> n5(long j10, TimeUnit timeUnit, h0 h0Var) {
        return u5(P6(j10, timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final z<T> n6(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.R(new s1(this, rVar));
    }

    @jh.c
    @jh.g("none")
    public final T o() {
        io.reactivex.internal.observers.e eVar = new io.reactivex.internal.observers.e();
        g(eVar);
        T tA = eVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    @jh.c
    @jh.g("none")
    public final i0<Boolean> o1(Object obj) {
        io.reactivex.internal.functions.a.g(obj, "element is null");
        return h(Functions.i(obj));
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> o2(kh.o<? super T, ? extends e0<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return q2(oVar, cVar, z10, T(), T());
    }

    @jh.c
    @jh.g("none")
    public final q<T> o4(kh.c<T, T, T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.Q(new d1(this, cVar));
    }

    @jh.c
    @jh.g("none")
    public final z<T> o5(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? io.reactivex.plugins.a.R(this) : io.reactivex.plugins.a.R(new ObservableSkipLast(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    @jh.c
    @jh.g("none")
    public final TestObserver<T> o6() {
        TestObserver<T> testObserver = new TestObserver<>();
        g(testObserver);
        return testObserver;
    }

    @jh.c
    @jh.g("none")
    public final T p(T t10) {
        io.reactivex.internal.observers.e eVar = new io.reactivex.internal.observers.e();
        g(eVar);
        T tA = eVar.a();
        return tA != null ? tA : t10;
    }

    @jh.c
    @jh.g("none")
    public final i0<Long> p1() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.q(this));
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> p2(kh.o<? super T, ? extends e0<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return q2(oVar, cVar, z10, i10, T());
    }

    @jh.c
    @jh.g("none")
    public final <R> i0<R> p4(R r10, kh.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.a.g(r10, "seed is null");
        io.reactivex.internal.functions.a.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.S(new e1(this, r10, cVar));
    }

    @jh.c
    @jh.g(jh.g.H0)
    public final z<T> p5(long j10, TimeUnit timeUnit) {
        return s5(j10, timeUnit, io.reactivex.schedulers.b.i(), false, T());
    }

    @jh.c
    @jh.g("none")
    public final TestObserver<T> p6(boolean z10) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z10) {
            testObserver.dispose();
        }
        g(testObserver);
        return testObserver;
    }

    @jh.c
    @jh.g("none")
    public final z<z<T>> p7(long j10) {
        return r7(j10, j10, T());
    }

    @jh.c
    @jh.g("none")
    public final Iterable<T> q() {
        return new io.reactivex.internal.operators.observable.b(this);
    }

    @jh.c
    @jh.g("none")
    public final <U, R> z<R> q2(kh.o<? super T, ? extends e0<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.g(cVar, "combiner is null");
        return v2(ObservableInternalHelper.b(oVar, cVar), z10, i10, i11);
    }

    @jh.c
    @jh.g("none")
    public final <R> i0<R> q4(Callable<R> callable, kh.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.a.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.a.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.S(new f1(this, callable, cVar));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> q5(long j10, TimeUnit timeUnit, h0 h0Var) {
        return s5(j10, timeUnit, h0Var, false, T());
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> q6(long j10, TimeUnit timeUnit) {
        return r6(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final z<z<T>> q7(long j10, long j11) {
        return r7(j10, j11, T());
    }

    @jh.c
    @jh.g("none")
    public final Iterable<T> r(T t10) {
        return new io.reactivex.internal.operators.observable.c(this, t10);
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> r0(f0<? super T, ? extends R> f0Var) {
        return O7(((f0) io.reactivex.internal.functions.a.g(f0Var, "composer is null")).a(this));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> r1(long j10, TimeUnit timeUnit) {
        return s1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> r2(kh.o<? super T, ? extends e0<? extends R>> oVar, kh.o<? super Throwable, ? extends e0<? extends R>> oVar2, Callable<? extends e0<? extends R>> callable) {
        io.reactivex.internal.functions.a.g(oVar, "onNextMapper is null");
        io.reactivex.internal.functions.a.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.a.g(callable, "onCompleteSupplier is null");
        return B3(new y0(this, oVar, oVar2, callable));
    }

    @jh.c
    @jh.g("none")
    public final z<T> r4() {
        return s4(Long.MAX_VALUE);
    }

    @jh.c
    @jh.g("custom")
    public final z<T> r5(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        return s5(j10, timeUnit, h0Var, z10, T());
    }

    @jh.c
    @jh.g("custom")
    public final z<T> r6(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableThrottleFirstTimed(this, j10, timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final z<z<T>> r7(long j10, long j11, int i10) {
        io.reactivex.internal.functions.a.i(j10, "count");
        io.reactivex.internal.functions.a.i(j11, org.apache.tools.ant.taskdefs.optional.vss.g.L2);
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableWindow(this, j10, j11, i10));
    }

    @jh.c
    @jh.g("none")
    public final Iterable<T> s() {
        return new io.reactivex.internal.operators.observable.d(this);
    }

    @jh.c
    @jh.g("custom")
    public final z<T> s1(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableDebounceTimed(this, j10, timeUnit, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> s2(kh.o<? super T, ? extends e0<? extends R>> oVar, kh.o<Throwable, ? extends e0<? extends R>> oVar2, Callable<? extends e0<? extends R>> callable, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "onNextMapper is null");
        io.reactivex.internal.functions.a.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.a.g(callable, "onCompleteSupplier is null");
        return C3(new y0(this, oVar, oVar2, callable), i10);
    }

    @jh.c
    @jh.g("none")
    public final z<T> s4(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? d2() : io.reactivex.plugins.a.R(new ObservableRepeat(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    @jh.c
    @jh.g("custom")
    public final z<T> s5(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new ObservableSkipLastTimed(this, j10, timeUnit, h0Var, i10 << 1, z10));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> s6(long j10, TimeUnit timeUnit) {
        return T4(j10, timeUnit);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<z<T>> s7(long j10, long j11, TimeUnit timeUnit) {
        return u7(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), T());
    }

    @jh.c
    @jh.g("none")
    public final T t() {
        T tI = j5().i();
        if (tI != null) {
            return tI;
        }
        throw new NoSuchElementException();
    }

    @jh.c
    @jh.g("none")
    public final <U> z<T> t1(kh.o<? super T, ? extends e0<U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "debounceSelector is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.r(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> t2(kh.o<? super T, ? extends e0<? extends R>> oVar, boolean z10) {
        return u2(oVar, z10, Integer.MAX_VALUE);
    }

    @jh.c
    @jh.g("none")
    public final z<T> t4(kh.e eVar) {
        io.reactivex.internal.functions.a.g(eVar, "stop is null");
        return io.reactivex.plugins.a.R(new ObservableRepeatUntil(this, eVar));
    }

    @jh.c
    @jh.g(jh.g.H0)
    public final z<T> t5(long j10, TimeUnit timeUnit, boolean z10) {
        return s5(j10, timeUnit, io.reactivex.schedulers.b.i(), z10, T());
    }

    @jh.c
    @jh.g("custom")
    public final z<T> t6(long j10, TimeUnit timeUnit, h0 h0Var) {
        return U4(j10, timeUnit, h0Var);
    }

    @jh.c
    @jh.g("custom")
    public final z<z<T>> t7(long j10, long j11, TimeUnit timeUnit, h0 h0Var) {
        return u7(j10, j11, timeUnit, h0Var, T());
    }

    @jh.c
    @jh.g("none")
    public final T u(T t10) {
        return i5(t10).j();
    }

    @jh.c
    @jh.g("none")
    public final z<T> u1(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultItem is null");
        return K5(l3(t10));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> u2(kh.o<? super T, ? extends e0<? extends R>> oVar, boolean z10, int i10) {
        return v2(oVar, z10, i10, T());
    }

    @jh.c
    @jh.g("none")
    public final z<T> u4(kh.o<? super z<Object>, ? extends e0<?>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "handler is null");
        return io.reactivex.plugins.a.R(new ObservableRepeatWhen(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final <U> z<T> u5(e0<U> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return io.reactivex.plugins.a.R(new m1(this, e0Var));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> u6(long j10, TimeUnit timeUnit) {
        return w6(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @jh.c
    @jh.g("custom")
    public final z<z<T>> u7(long j10, long j11, TimeUnit timeUnit, h0 h0Var, int i10) {
        io.reactivex.internal.functions.a.i(j10, "timespan");
        io.reactivex.internal.functions.a.i(j11, "timeskip");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.R(new x1(this, j10, j11, timeUnit, h0Var, Long.MAX_VALUE, i10, false));
    }

    @jh.g("none")
    public final void v() {
        io.reactivex.internal.operators.observable.j.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <R> z<R> v2(kh.o<? super T, ? extends e0<? extends R>> oVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "bufferSize");
        if (!(this instanceof lh.m)) {
            return io.reactivex.plugins.a.R(new ObservableFlatMap(this, oVar, z10, i10, i11));
        }
        Object objCall = ((lh.m) this).call();
        return objCall == null ? d2() : ObservableScalarXMap.a(objCall, oVar);
    }

    @jh.c
    @jh.g("none")
    public final i0<T> v3(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultItem is null");
        return io.reactivex.plugins.a.S(new v0(this, t10));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> v4(kh.o<? super z<T>, ? extends e0<R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        return ObservableReplay.x8(ObservableInternalHelper.g(this), oVar);
    }

    @jh.c
    @jh.g("none")
    public final z<T> v5(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.R(new n1(this, rVar));
    }

    @jh.c
    @jh.g("custom")
    public final z<T> v6(long j10, TimeUnit timeUnit, h0 h0Var) {
        return w6(j10, timeUnit, h0Var, false);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<z<T>> v7(long j10, TimeUnit timeUnit) {
        return A7(j10, timeUnit, io.reactivex.schedulers.b.a(), Long.MAX_VALUE, false);
    }

    @jh.g("none")
    public final void w(g0<? super T> g0Var) {
        io.reactivex.internal.operators.observable.j.b(this, g0Var);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> w1(long j10, TimeUnit timeUnit) {
        return y1(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a w2(kh.o<? super T, ? extends g> oVar) {
        return x2(oVar, false);
    }

    @jh.c
    @jh.g("none")
    public final q<T> w3() {
        return io.reactivex.plugins.a.Q(new u0(this));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> w4(kh.o<? super z<T>, ? extends e0<R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return ObservableReplay.x8(ObservableInternalHelper.h(this, i10), oVar);
    }

    @jh.c
    @jh.g("none")
    public final z<T> w5() {
        return X6().w1().z3(Functions.o(Functions.p())).y2(Functions.k());
    }

    @jh.c
    @jh.g("custom")
    public final z<T> w6(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableThrottleLatest(this, j10, timeUnit, h0Var, z10));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<z<T>> w7(long j10, TimeUnit timeUnit, long j11) {
        return A7(j10, timeUnit, io.reactivex.schedulers.b.a(), j11, false);
    }

    @jh.g("none")
    public final void x(kh.g<? super T> gVar) {
        io.reactivex.internal.operators.observable.j.c(this, gVar, Functions.f119561f, Functions.f119558c);
    }

    @jh.c
    @jh.g("custom")
    public final z<T> x1(long j10, TimeUnit timeUnit, h0 h0Var) {
        return y1(j10, timeUnit, h0Var, false);
    }

    @jh.c
    @jh.g("none")
    public final io.reactivex.a x2(kh.o<? super T, ? extends g> oVar, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new ObservableFlatMapCompletableCompletable(this, oVar, z10));
    }

    @jh.c
    @jh.g("none")
    public final i0<T> x3() {
        return io.reactivex.plugins.a.S(new v0(this, null));
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final <R> z<R> x4(kh.o<? super z<T>, ? extends e0<R>> oVar, int i10, long j10, TimeUnit timeUnit) {
        return y4(oVar, i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.c
    @jh.g("none")
    public final z<T> x5(Comparator<? super T> comparator) {
        io.reactivex.internal.functions.a.g(comparator, "sortFunction is null");
        return X6().w1().z3(Functions.o(comparator)).y2(Functions.k());
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> x6(long j10, TimeUnit timeUnit, boolean z10) {
        return w6(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<z<T>> x7(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return A7(j10, timeUnit, io.reactivex.schedulers.b.a(), j11, z10);
    }

    @jh.g("none")
    public final void y(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
        io.reactivex.internal.operators.observable.j.c(this, gVar, gVar2, Functions.f119558c);
    }

    @jh.c
    @jh.g("custom")
    public final z<T> y1(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.t(this, j10, timeUnit, h0Var, z10));
    }

    @jh.c
    @jh.g("none")
    public final <U> z<U> y2(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.i0(this, oVar));
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> y3(d0<? extends R, ? super T> d0Var) {
        io.reactivex.internal.functions.a.g(d0Var, "lifter is null");
        return io.reactivex.plugins.a.R(new w0(this, d0Var));
    }

    @jh.c
    @jh.g("custom")
    public final <R> z<R> y4(kh.o<? super z<T>, ? extends e0<R>> oVar, int i10, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return ObservableReplay.x8(ObservableInternalHelper.i(this, i10, j10, timeUnit, h0Var), oVar);
    }

    @jh.c
    @jh.g("none")
    public final z<T> y5(e0<? extends T> e0Var) {
        io.reactivex.internal.functions.a.g(e0Var, "other is null");
        return y0(e0Var, this);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> y6(long j10, TimeUnit timeUnit) {
        return r1(j10, timeUnit);
    }

    @jh.c
    @jh.g("custom")
    public final z<z<T>> y7(long j10, TimeUnit timeUnit, h0 h0Var) {
        return A7(j10, timeUnit, h0Var, Long.MAX_VALUE, false);
    }

    @jh.g("none")
    public final void z(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
        io.reactivex.internal.operators.observable.j.c(this, gVar, gVar2, aVar);
    }

    @jh.c
    @jh.g(jh.g.E0)
    public final z<T> z1(long j10, TimeUnit timeUnit, boolean z10) {
        return y1(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.c
    @jh.g("none")
    public final <U, V> z<V> z2(kh.o<? super T, ? extends Iterable<? extends U>> oVar, kh.c<? super T, ? super U, ? extends V> cVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.g(cVar, "resultSelector is null");
        return (z<V>) q2(ObservableInternalHelper.a(oVar), cVar, false, T(), T());
    }

    @jh.c
    @jh.g("none")
    public final <R> z<R> z3(kh.o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new x0(this, oVar));
    }

    @jh.c
    @jh.g("custom")
    public final <R> z<R> z4(kh.o<? super z<T>, ? extends e0<R>> oVar, int i10, h0 h0Var) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return ObservableReplay.x8(ObservableInternalHelper.h(this, i10), ObservableInternalHelper.k(oVar, h0Var));
    }

    @jh.c
    @jh.g("none")
    public final z<T> z5(Iterable<? extends T> iterable) {
        return y0(O2(iterable), this);
    }

    @jh.c
    @jh.g("custom")
    public final z<T> z6(long j10, TimeUnit timeUnit, h0 h0Var) {
        return s1(j10, timeUnit, h0Var);
    }

    @jh.c
    @jh.g("custom")
    public final z<z<T>> z7(long j10, TimeUnit timeUnit, h0 h0Var, long j11) {
        return A7(j10, timeUnit, h0Var, j11, false);
    }
}

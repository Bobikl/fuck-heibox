package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.BlockingFlowableIterable;
import io.reactivex.internal.operators.flowable.FlowableAmb;
import io.reactivex.internal.operators.flowable.FlowableBuffer;
import io.reactivex.internal.operators.flowable.FlowableBufferBoundary;
import io.reactivex.internal.operators.flowable.FlowableCache;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable;
import io.reactivex.internal.operators.flowable.FlowableConcatWithMaybe;
import io.reactivex.internal.operators.flowable.FlowableConcatWithSingle;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableDebounce;
import io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableGenerate;
import io.reactivex.internal.operators.flowable.FlowableGroupBy;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.internal.operators.flowable.FlowableIntervalRange;
import io.reactivex.internal.operators.flowable.FlowableJoin;
import io.reactivex.internal.operators.flowable.FlowableLimit;
import io.reactivex.internal.operators.flowable.FlowableMapNotification;
import io.reactivex.internal.operators.flowable.FlowableMaterialize;
import io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable;
import io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe;
import io.reactivex.internal.operators.flowable.FlowableMergeWithSingle;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableOnErrorNext;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.FlowablePublishMulticast;
import io.reactivex.internal.operators.flowable.FlowableRange;
import io.reactivex.internal.operators.flowable.FlowableRangeLong;
import io.reactivex.internal.operators.flowable.FlowableRepeat;
import io.reactivex.internal.operators.flowable.FlowableRepeatUntil;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.operators.flowable.FlowableReplay;
import io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate;
import io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.operators.flowable.FlowableSamplePublisher;
import io.reactivex.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle;
import io.reactivex.internal.operators.flowable.FlowableSkipLast;
import io.reactivex.internal.operators.flowable.FlowableSkipLastTimed;
import io.reactivex.internal.operators.flowable.FlowableSkipUntil;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.internal.operators.flowable.FlowableTake;
import io.reactivex.internal.operators.flowable.FlowableTakeLast;
import io.reactivex.internal.operators.flowable.FlowableTakeLastOne;
import io.reactivex.internal.operators.flowable.FlowableTakeLastTimed;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed;
import io.reactivex.internal.operators.flowable.FlowableThrottleLatest;
import io.reactivex.internal.operators.flowable.FlowableTimeout;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableUsing;
import io.reactivex.internal.operators.flowable.FlowableWindow;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundary;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany;
import io.reactivex.internal.operators.flowable.FlowableZip;
import io.reactivex.internal.operators.flowable.a1;
import io.reactivex.internal.operators.flowable.b1;
import io.reactivex.internal.operators.flowable.c1;
import io.reactivex.internal.operators.flowable.e1;
import io.reactivex.internal.operators.flowable.f1;
import io.reactivex.internal.operators.flowable.g1;
import io.reactivex.internal.operators.flowable.h1;
import io.reactivex.internal.operators.flowable.i1;
import io.reactivex.internal.operators.flowable.j1;
import io.reactivex.internal.operators.flowable.k1;
import io.reactivex.internal.operators.flowable.r0;
import io.reactivex.internal.operators.flowable.s0;
import io.reactivex.internal.operators.flowable.t0;
import io.reactivex.internal.operators.flowable.u0;
import io.reactivex.internal.operators.flowable.v0;
import io.reactivex.internal.operators.flowable.w0;
import io.reactivex.internal.operators.flowable.x0;
import io.reactivex.internal.operators.flowable.y0;
import io.reactivex.internal.operators.flowable.z0;
import io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.FlowableConcatMapSingle;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.internal.subscribers.ForEachWhileSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.subscribers.TestSubscriber;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Flowable.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j<T> implements org.reactivestreams.c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f123886b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> A0(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar, int i10) {
        return Y2(cVar).S0(Functions.k(), i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> A3(T t10, T t11, T t12, T t13, T t14, T t15) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        io.reactivex.internal.functions.a.g(t15, "item6 is null");
        return R2(t10, t11, t12, t13, t14, t15);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> A6(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar) {
        return Y2(cVar).p6(Functions.k());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, R> j<R> A8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, kh.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        return G8(Functions.z(iVar), false, Y(), cVar, cVar2, cVar3, cVar4);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> B0(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        return E0(cVar, cVar2);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> B1(Callable<? extends org.reactivestreams.c<? extends T>> callable) {
        io.reactivex.internal.functions.a.g(callable, "supplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.p(callable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> B3(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        io.reactivex.internal.functions.a.g(t15, "item6 is null");
        io.reactivex.internal.functions.a.g(t16, "item7 is null");
        return R2(t10, t11, t12, t13, t14, t15, t16);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> B6(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar, int i10) {
        return Y2(cVar).q6(Functions.k(), i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, R> j<R> B8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, kh.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        return G8(Functions.A(jVar), false, Y(), cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> C0(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, org.reactivestreams.c<? extends T> cVar3) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        return E0(cVar, cVar2, cVar3);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> C3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        io.reactivex.internal.functions.a.g(t15, "item6 is null");
        io.reactivex.internal.functions.a.g(t16, "item7 is null");
        io.reactivex.internal.functions.a.g(t17, "item8 is null");
        return R2(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> C6(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar) {
        return D6(cVar, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, R> j<R> C8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, org.reactivestreams.c<? extends T6> cVar6, kh.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(cVar6, "source6 is null");
        return G8(Functions.B(kVar), false, Y(), cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> D0(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, org.reactivestreams.c<? extends T> cVar3, org.reactivestreams.c<? extends T> cVar4) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        return E0(cVar, cVar2, cVar3, cVar4);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> D3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        io.reactivex.internal.functions.a.g(t15, "item6 is null");
        io.reactivex.internal.functions.a.g(t16, "item7 is null");
        io.reactivex.internal.functions.a.g(t17, "item8 is null");
        io.reactivex.internal.functions.a.g(t18, "item9 is null");
        return R2(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> D6(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar, int i10) {
        return Y2(cVar).v6(Functions.k(), i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> j<R> D8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, org.reactivestreams.c<? extends T6> cVar6, org.reactivestreams.c<? extends T7> cVar7, kh.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(cVar6, "source6 is null");
        io.reactivex.internal.functions.a.g(cVar7, "source7 is null");
        return G8(Functions.C(lVar), false, Y(), cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> E0(org.reactivestreams.c<? extends T>... cVarArr) {
        if (cVarArr.length == 0) {
            return k2();
        }
        return cVarArr.length == 1 ? Y2(cVarArr[0]) : io.reactivex.plugins.a.P(new FlowableConcatArray(cVarArr, false));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> E3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
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
        return R2(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> E5(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2) {
        return H5(cVar, cVar2, io.reactivex.internal.functions.a.d(), Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> j<R> E8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, org.reactivestreams.c<? extends T6> cVar6, org.reactivestreams.c<? extends T7> cVar7, org.reactivestreams.c<? extends T8> cVar8, kh.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(cVar6, "source6 is null");
        io.reactivex.internal.functions.a.g(cVar7, "source7 is null");
        io.reactivex.internal.functions.a.g(cVar8, "source8 is null");
        return G8(Functions.D(mVar), false, Y(), cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> F0(org.reactivestreams.c<? extends T>... cVarArr) {
        if (cVarArr.length == 0) {
            return k2();
        }
        return cVarArr.length == 1 ? Y2(cVarArr[0]) : io.reactivex.plugins.a.P(new FlowableConcatArray(cVarArr, true));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> F5(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, int i10) {
        return H5(cVar, cVar2, io.reactivex.internal.functions.a.d(), i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> j<R> F8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, org.reactivestreams.c<? extends T6> cVar6, org.reactivestreams.c<? extends T7> cVar7, org.reactivestreams.c<? extends T8> cVar8, org.reactivestreams.c<? extends T9> cVar9, kh.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(cVar6, "source6 is null");
        io.reactivex.internal.functions.a.g(cVar7, "source7 is null");
        io.reactivex.internal.functions.a.g(cVar8, "source8 is null");
        io.reactivex.internal.functions.a.g(cVar9, "source9 is null");
        return G8(Functions.E(nVar), false, Y(), cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> G0(int i10, int i11, org.reactivestreams.c<? extends T>... cVarArr) {
        io.reactivex.internal.functions.a.g(cVarArr, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.plugins.a.P(new FlowableConcatMapEager(new FlowableFromArray(cVarArr), Functions.k(), i10, i11, ErrorMode.IMMEDIATE));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> i0<Boolean> G5(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, kh.d<? super T, ? super T> dVar) {
        return H5(cVar, cVar2, dVar, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, R> j<R> G8(kh.o<? super Object[], ? extends R> oVar, boolean z10, int i10, org.reactivestreams.c<? extends T>... cVarArr) {
        if (cVarArr.length == 0) {
            return k2();
        }
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableZip(cVarArr, null, oVar, i10, z10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> H0(org.reactivestreams.c<? extends T>... cVarArr) {
        return G0(Y(), Y(), cVarArr);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> i0<Boolean> H5(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, kh.d<? super T, ? super T> dVar, int i10) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(dVar, "isEqual is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.S(new FlowableSequenceEqualSingle(cVar, cVar2, dVar, i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, R> j<R> H8(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableZip(null, iterable, oVar, i10, z10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> I0(int i10, int i11, org.reactivestreams.c<? extends T>... cVarArr) {
        return R2(cVarArr).c1(Functions.k(), i10, i11, true);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> J0(org.reactivestreams.c<? extends T>... cVarArr) {
        return I0(Y(), Y(), cVarArr);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> K0(Iterable<? extends org.reactivestreams.c<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return X2(iterable).Y0(Functions.k());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> L0(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar) {
        return M0(cVar, Y(), true);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> M0(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar, int i10, boolean z10) {
        return Y2(cVar).Z0(Functions.k(), i10, z10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> M3(Iterable<? extends org.reactivestreams.c<? extends T>> iterable) {
        return X2(iterable).r2(Functions.k());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> N0(Iterable<? extends org.reactivestreams.c<? extends T>> iterable) {
        return O0(iterable, Y(), Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> N3(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, int i10) {
        return X2(iterable).s2(Functions.k(), i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static j<Integer> N4(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i11);
        }
        if (i11 == 0) {
            return k2();
        }
        if (i11 == 1) {
            return v3(Integer.valueOf(i10));
        }
        if (((long) i10) + ((long) (i11 - 1)) <= 2147483647L) {
            return io.reactivex.plugins.a.P(new FlowableRange(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> O0(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, int i10, int i11) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.plugins.a.P(new FlowableConcatMapEager(new FlowableFromIterable(iterable), Functions.k(), i10, i11, ErrorMode.IMMEDIATE));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> O3(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, int i10, int i11) {
        return X2(iterable).C2(Functions.k(), false, i10, i11);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static j<Long> O4(long j10, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return k2();
        }
        if (j11 == 1) {
            return v3(Long.valueOf(j10));
        }
        long j12 = (j11 - 1) + j10;
        if (j10 <= 0 || j12 >= 0) {
            return io.reactivex.plugins.a.P(new FlowableRangeLong(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> P0(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar) {
        return Q0(cVar, Y(), Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> P3(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar) {
        return Q3(cVar, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> Q0(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar, int i10, int i11) {
        io.reactivex.internal.functions.a.g(cVar, "sources is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.m(cVar, Functions.k(), i10, i11, ErrorMode.IMMEDIATE));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> Q3(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar, int i10) {
        return Y2(cVar).s2(Functions.k(), i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> R2(T... tArr) {
        io.reactivex.internal.functions.a.g(tArr, "items is null");
        if (tArr.length == 0) {
            return k2();
        }
        return tArr.length == 1 ? v3(tArr[0]) : io.reactivex.plugins.a.P(new FlowableFromArray(tArr));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> R3(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        return R2(cVar, cVar2).B2(Functions.k(), false, 2);
    }

    @jh.a(BackpressureKind.NONE)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> R7(org.reactivestreams.c<T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "onSubscribe is null");
        if (cVar instanceof j) {
            throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
        }
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.h0(cVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> S2(Callable<? extends T> callable) {
        io.reactivex.internal.functions.a.g(callable, "supplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.e0(callable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> S3(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, org.reactivestreams.c<? extends T> cVar3) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        return R2(cVar, cVar2, cVar3).B2(Functions.k(), false, 3);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> T2(Future<? extends T> future) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.f0(future, 0L, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> T3(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, org.reactivestreams.c<? extends T> cVar3, org.reactivestreams.c<? extends T> cVar4) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        return R2(cVar, cVar2, cVar3, cVar4).B2(Functions.k(), false, 4);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public static <T, D> j<T> T7(Callable<? extends D> callable, kh.o<? super D, ? extends org.reactivestreams.c<? extends T>> oVar, kh.g<? super D> gVar) {
        return U7(callable, oVar, gVar, true);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> U2(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.f0(future, j10, timeUnit));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> U3(int i10, int i11, org.reactivestreams.c<? extends T>... cVarArr) {
        return R2(cVarArr).C2(Functions.k(), false, i10, i11);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, D> j<T> U7(Callable<? extends D> callable, kh.o<? super D, ? extends org.reactivestreams.c<? extends T>> oVar, kh.g<? super D> gVar, boolean z10) {
        io.reactivex.internal.functions.a.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.a.g(oVar, "sourceSupplier is null");
        io.reactivex.internal.functions.a.g(gVar, "resourceDisposer is null");
        return io.reactivex.plugins.a.P(new FlowableUsing(callable, oVar, gVar, z10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public static <T> j<T> V2(Future<? extends T> future, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return U2(future, j10, timeUnit).l6(h0Var);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> V3(org.reactivestreams.c<? extends T>... cVarArr) {
        return R2(cVarArr).s2(Functions.k(), cVarArr.length);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public static <T> j<T> W2(Future<? extends T> future, h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return T2(future).l6(h0Var);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> W3(int i10, int i11, org.reactivestreams.c<? extends T>... cVarArr) {
        return R2(cVarArr).C2(Functions.k(), true, i10, i11);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> X2(Iterable<? extends T> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "source is null");
        return io.reactivex.plugins.a.P(new FlowableFromIterable(iterable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> X3(org.reactivestreams.c<? extends T>... cVarArr) {
        return R2(cVarArr).B2(Functions.k(), true, cVarArr.length);
    }

    public static int Y() {
        return f123886b;
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> Y2(org.reactivestreams.c<? extends T> cVar) {
        if (cVar instanceof j) {
            return io.reactivex.plugins.a.P((j) cVar);
        }
        io.reactivex.internal.functions.a.g(cVar, "source is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.h0(cVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> Y3(Iterable<? extends org.reactivestreams.c<? extends T>> iterable) {
        return X2(iterable).A2(Functions.k(), true);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    private j<T> Z1(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.a aVar2) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.a.g(aVar2, "onAfterTerminate is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.w(this, gVar, gVar2, aVar, aVar2));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, S> j<T> Z2(Callable<S> callable, kh.b<S, i<T>> bVar) {
        io.reactivex.internal.functions.a.g(bVar, "generator is null");
        return c3(callable, FlowableInternalHelper.i(bVar), Functions.h());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> Z3(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, int i10) {
        return X2(iterable).B2(Functions.k(), true, i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, S> j<T> a3(Callable<S> callable, kh.b<S, i<T>> bVar, kh.g<? super S> gVar) {
        io.reactivex.internal.functions.a.g(bVar, "generator is null");
        return c3(callable, FlowableInternalHelper.i(bVar), gVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> a4(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, int i10, int i11) {
        return X2(iterable).C2(Functions.k(), true, i10, i11);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T, S> j<T> b3(Callable<S> callable, kh.c<S, i<T>, S> cVar) {
        return c3(callable, cVar, Functions.h());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> b4(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar) {
        return c4(cVar, Y());
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> c(Iterable<? extends org.reactivestreams.c<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.P(new FlowableAmb(null, iterable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, S> j<T> c3(Callable<S> callable, kh.c<S, i<T>, S> cVar, kh.g<? super S> gVar) {
        io.reactivex.internal.functions.a.g(callable, "initialState is null");
        io.reactivex.internal.functions.a.g(cVar, "generator is null");
        io.reactivex.internal.functions.a.g(gVar, "disposeState is null");
        return io.reactivex.plugins.a.P(new FlowableGenerate(callable, cVar, gVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> c4(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar, int i10) {
        return Y2(cVar).B2(Functions.k(), true, i10);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> d(org.reactivestreams.c<? extends T>... cVarArr) {
        io.reactivex.internal.functions.a.g(cVarArr, "sources is null");
        int length = cVarArr.length;
        if (length == 0) {
            return k2();
        }
        return length == 1 ? Y2(cVarArr[0]) : io.reactivex.plugins.a.P(new FlowableAmb(cVarArr, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> d3(kh.g<i<T>> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "generator is null");
        return c3(Functions.u(), FlowableInternalHelper.j(gVar), Functions.h());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> d4(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        return R2(cVar, cVar2).B2(Functions.k(), true, 2);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T, R> j<R> e0(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        return f0(iterable, oVar, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> e4(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, org.reactivestreams.c<? extends T> cVar3) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        return R2(cVar, cVar2, cVar3).B2(Functions.k(), true, 3);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, R> j<R> f0(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableCombineLatest((Iterable) iterable, (kh.o) oVar, i10, false));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> f4(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, org.reactivestreams.c<? extends T> cVar3, org.reactivestreams.c<? extends T> cVar4) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        return R2(cVar, cVar2, cVar3, cVar4).B2(Functions.k(), true, 4);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T, R> j<R> g0(kh.o<? super Object[], ? extends R> oVar, org.reactivestreams.c<? extends T>... cVarArr) {
        return q0(cVarArr, oVar, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T1, T2, R> j<R> h0(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, kh.c<? super T1, ? super T2, ? extends R> cVar3) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        return g0(Functions.x(cVar3), cVar, cVar2);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, R> j<R> i0(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, kh.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        return g0(Functions.y(hVar), cVar, cVar2, cVar3);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, R> j<R> j0(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, kh.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        return g0(Functions.z(iVar), cVar, cVar2, cVar3, cVar4);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, R> j<R> k0(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, kh.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        return g0(Functions.A(jVar), cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public static <T> j<T> k2() {
        return io.reactivex.plugins.a.P(io.reactivex.internal.operators.flowable.a0.f121040c);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public static <T> j<T> k4() {
        return io.reactivex.plugins.a.P(r0.f121308c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, R> j<R> l0(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, org.reactivestreams.c<? extends T6> cVar6, kh.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(cVar6, "source6 is null");
        return g0(Functions.B(kVar), cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> l2(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "throwable is null");
        return m2(Functions.m(th2));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> j<R> m0(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, org.reactivestreams.c<? extends T6> cVar6, org.reactivestreams.c<? extends T7> cVar7, kh.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(cVar6, "source6 is null");
        io.reactivex.internal.functions.a.g(cVar7, "source7 is null");
        return g0(Functions.C(lVar), cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> m2(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.a.g(callable, "supplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.b0(callable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> j<R> n0(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, org.reactivestreams.c<? extends T6> cVar6, org.reactivestreams.c<? extends T7> cVar7, org.reactivestreams.c<? extends T8> cVar8, kh.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(cVar6, "source6 is null");
        io.reactivex.internal.functions.a.g(cVar7, "source7 is null");
        io.reactivex.internal.functions.a.g(cVar8, "source8 is null");
        return g0(Functions.D(mVar), cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public static j<Long> n3(long j10, long j11, TimeUnit timeUnit) {
        return o3(j10, j11, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> j<R> o0(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, org.reactivestreams.c<? extends T4> cVar4, org.reactivestreams.c<? extends T5> cVar5, org.reactivestreams.c<? extends T6> cVar6, org.reactivestreams.c<? extends T7> cVar7, org.reactivestreams.c<? extends T8> cVar8, org.reactivestreams.c<? extends T9> cVar9, kh.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        io.reactivex.internal.functions.a.g(cVar5, "source5 is null");
        io.reactivex.internal.functions.a.g(cVar6, "source6 is null");
        io.reactivex.internal.functions.a.g(cVar7, "source7 is null");
        io.reactivex.internal.functions.a.g(cVar8, "source8 is null");
        io.reactivex.internal.functions.a.g(cVar9, "source9 is null");
        return g0(Functions.E(nVar), cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public static j<Long> o3(long j10, long j11, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableInterval(Math.max(0L, j10), Math.max(0L, j11), timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T, R> j<R> p0(org.reactivestreams.c<? extends T>[] cVarArr, kh.o<? super Object[], ? extends R> oVar) {
        return q0(cVarArr, oVar, Y());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public static j<Long> p3(long j10, TimeUnit timeUnit) {
        return o3(j10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, R> j<R> q0(org.reactivestreams.c<? extends T>[] cVarArr, kh.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.a.g(cVarArr, "sources is null");
        if (cVarArr.length == 0) {
            return k2();
        }
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableCombineLatest((org.reactivestreams.c[]) cVarArr, (kh.o) oVar, i10, false));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public static j<Long> q3(long j10, TimeUnit timeUnit, h0 h0Var) {
        return o3(j10, j10, timeUnit, h0Var);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T, R> j<R> r0(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        return s0(iterable, oVar, Y());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public static j<Long> r3(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return s3(j10, j11, j12, j13, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T, R> j<R> s0(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableCombineLatest((Iterable) iterable, (kh.o) oVar, i10, true));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public static j<Long> s3(long j10, long j11, long j12, long j13, TimeUnit timeUnit, h0 h0Var) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return k2().D1(j12, timeUnit, h0Var);
        }
        long j14 = j10 + (j11 - 1);
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableIntervalRange(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, h0Var));
    }

    private j<T> s7(long j10, TimeUnit timeUnit, org.reactivestreams.c<? extends T> cVar, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "timeUnit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableTimeoutTimed(this, j10, timeUnit, h0Var, cVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T, R> j<R> t0(kh.o<? super Object[], ? extends R> oVar, int i10, org.reactivestreams.c<? extends T>... cVarArr) {
        return w0(cVarArr, oVar, i10);
    }

    private <U, V> j<T> t7(org.reactivestreams.c<U> cVar, kh.o<? super T, ? extends org.reactivestreams.c<V>> oVar, org.reactivestreams.c<? extends T> cVar2) {
        io.reactivex.internal.functions.a.g(oVar, "itemTimeoutIndicator is null");
        return io.reactivex.plugins.a.P(new FlowableTimeout(this, cVar, oVar, cVar2));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T, R> j<R> u0(kh.o<? super Object[], ? extends R> oVar, org.reactivestreams.c<? extends T>... cVarArr) {
        return w0(cVarArr, oVar, Y());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public static j<Long> u7(long j10, TimeUnit timeUnit) {
        return v7(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, R> j<R> u8(Iterable<? extends org.reactivestreams.c<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return io.reactivex.plugins.a.P(new FlowableZip(null, iterable, oVar, Y(), false));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T, R> j<R> v0(org.reactivestreams.c<? extends T>[] cVarArr, kh.o<? super Object[], ? extends R> oVar) {
        return w0(cVarArr, oVar, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> v3(T t10) {
        io.reactivex.internal.functions.a.g(t10, "item is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.l0(t10));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public static j<Long> v7(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableTimer(Math.max(0L, j10), timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, R> j<R> v8(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar, kh.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "zipper is null");
        return Y2(cVar).C7().f0(FlowableInternalHelper.n(oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T, R> j<R> w0(org.reactivestreams.c<? extends T>[] cVarArr, kh.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.a.g(cVarArr, "sources is null");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return cVarArr.length == 0 ? k2() : io.reactivex.plugins.a.P(new FlowableCombineLatest((org.reactivestreams.c[]) cVarArr, (kh.o) oVar, i10, true));
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> w1(m<T> mVar, BackpressureStrategy backpressureStrategy) {
        io.reactivex.internal.functions.a.g(mVar, "source is null");
        io.reactivex.internal.functions.a.g(backpressureStrategy, "mode is null");
        return io.reactivex.plugins.a.P(new FlowableCreate(mVar, backpressureStrategy));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> w3(T t10, T t11) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        return R2(t10, t11);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, R> j<R> w8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, kh.c<? super T1, ? super T2, ? extends R> cVar3) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        return G8(Functions.x(cVar3), false, Y(), cVar, cVar2);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> x3(T t10, T t11, T t12) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        return R2(t10, t11, t12);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, R> j<R> x8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, kh.c<? super T1, ? super T2, ? extends R> cVar3, boolean z10) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        return G8(Functions.x(cVar3), z10, Y(), cVar, cVar2);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> y0(Iterable<? extends org.reactivestreams.c<? extends T>> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "sources is null");
        return X2(iterable).Z0(Functions.k(), 2, false);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> y3(T t10, T t11, T t12, T t13) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        return R2(t10, t11, t12, t13);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, R> j<R> y8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, kh.c<? super T1, ? super T2, ? extends R> cVar3, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        return G8(Functions.x(cVar3), z10, i10, cVar, cVar2);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public static <T> j<T> z0(org.reactivestreams.c<? extends org.reactivestreams.c<? extends T>> cVar) {
        return A0(cVar, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T> j<T> z3(T t10, T t11, T t12, T t13, T t14) {
        io.reactivex.internal.functions.a.g(t10, "item1 is null");
        io.reactivex.internal.functions.a.g(t11, "item2 is null");
        io.reactivex.internal.functions.a.g(t12, "item3 is null");
        io.reactivex.internal.functions.a.g(t13, "item4 is null");
        io.reactivex.internal.functions.a.g(t14, "item5 is null");
        return R2(t10, t11, t12, t13, t14);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public static <T1, T2, T3, R> j<R> z8(org.reactivestreams.c<? extends T1> cVar, org.reactivestreams.c<? extends T2> cVar2, org.reactivestreams.c<? extends T3> cVar3, kh.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        return G8(Functions.y(hVar), false, Y(), cVar, cVar2, cVar3);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.g("none")
    public final void A(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
        io.reactivex.internal.operators.flowable.h.b(this, gVar, gVar2, Functions.f119558c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> A1(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultItem is null");
        return o6(v3(t10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> A2(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, boolean z10) {
        return C2(oVar, z10, Y(), Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> A4(kh.o<? super Throwable, ? extends org.reactivestreams.c<? extends T>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "resumeFunction is null");
        return io.reactivex.plugins.a.P(new FlowableOnErrorNext(this, oVar, false));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<T> A5(org.reactivestreams.c<U> cVar, boolean z10) {
        io.reactivex.internal.functions.a.g(cVar, "sampler is null");
        return io.reactivex.plugins.a.P(new FlowableSamplePublisher(this, cVar, z10));
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final <R> R A7(kh.o<? super j<T>, R> oVar) {
        try {
            return (R) ((kh.o) io.reactivex.internal.functions.a.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    @jh.a(BackpressureKind.FULL)
    @jh.g("none")
    public final void B(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, int i10) {
        io.reactivex.internal.operators.flowable.h.c(this, gVar, gVar2, Functions.f119558c, i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> B2(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, boolean z10, int i10) {
        return C2(oVar, z10, i10, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> B4(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "next is null");
        return A4(Functions.n(cVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> B5(R r10, kh.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.a.g(r10, "initialValue is null");
        return D5(Functions.m(r10), cVar);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final Future<T> B7() {
        return (Future) n6(new io.reactivex.internal.subscribers.f());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.g("none")
    public final void C(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
        io.reactivex.internal.operators.flowable.h.b(this, gVar, gVar2, aVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> C1(long j10, TimeUnit timeUnit) {
        return E1(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> C2(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "bufferSize");
        if (!(this instanceof lh.m)) {
            return io.reactivex.plugins.a.P(new FlowableFlatMap(this, oVar, z10, i10, i11));
        }
        Object objCall = ((lh.m) this).call();
        return objCall == null ? k2() : v0.a(objCall, oVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> C4(kh.o<? super Throwable, ? extends T> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "valueSupplier is null");
        return io.reactivex.plugins.a.P(new FlowableOnErrorReturn(this, oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> C5(kh.c<T, T, T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "accumulator is null");
        return io.reactivex.plugins.a.P(new w0(this, cVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final i0<List<T>> C7() {
        return io.reactivex.plugins.a.S(new h1(this));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.g("none")
    public final void D(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, int i10) {
        io.reactivex.internal.operators.flowable.h.c(this, gVar, gVar2, aVar, i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final j<T> D1(long j10, TimeUnit timeUnit, h0 h0Var) {
        return E1(j10, timeUnit, h0Var, false);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final a D2(kh.o<? super T, ? extends g> oVar) {
        return E2(oVar, false, Integer.MAX_VALUE);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> D4(T t10) {
        io.reactivex.internal.functions.a.g(t10, "item is null");
        return C4(Functions.n(t10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> D5(Callable<R> callable, kh.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.a.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.a.g(cVar, "accumulator is null");
        return io.reactivex.plugins.a.P(new FlowableScanSeed(this, callable, cVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final i0<List<T>> D7(int i10) {
        io.reactivex.internal.functions.a.h(i10, "capacityHint");
        return io.reactivex.plugins.a.S(new h1(this, Functions.f(i10)));
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.g("none")
    public final void E(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.internal.operators.flowable.h.d(this, dVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> E1(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.q(this, Math.max(0L, j10), timeUnit, h0Var, z10));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final a E2(kh.o<? super T, ? extends g> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.O(new FlowableFlatMapCompletableCompletable(this, oVar, z10, i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> E4(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "next is null");
        return io.reactivex.plugins.a.P(new FlowableOnErrorNext(this, Functions.n(cVar), true));
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final j<T> E6(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.P(new FlowableTake(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final <U extends Collection<? super T>> i0<U> E7(Callable<U> callable) {
        io.reactivex.internal.functions.a.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.S(new h1(this, callable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<List<T>> F(int i10) {
        return G(i10, i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> F1(long j10, TimeUnit timeUnit, boolean z10) {
        return E1(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U> j<U> F2(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return G2(oVar, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final i0<T> F3(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultItem");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.n0(this, t10));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> F4() {
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.s(this));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> F6(long j10, TimeUnit timeUnit) {
        return R6(u7(j10, timeUnit));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <K> i0<Map<K, T>> F7(kh.o<? super T, ? extends K> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        return (i0<Map<K, T>>) c0(HashMapSupplier.asCallable(), Functions.F(oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<List<T>> G(int i10, int i11) {
        return (j<List<T>>) H(i10, i11, ArrayListSupplier.asCallable());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<T> G1(kh.o<? super T, ? extends org.reactivestreams.c<U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "itemDelayIndicator is null");
        return (j<T>) r2(FlowableInternalHelper.c(oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<U> G2(kh.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableFlattenIterable(this, oVar, i10));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final q<T> G3() {
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.flowable.m0(this));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final io.reactivex.parallel.a<T> G4() {
        return io.reactivex.parallel.a.y(this);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("custom")
    public final j<T> G6(long j10, TimeUnit timeUnit, h0 h0Var) {
        return R6(v7(j10, timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <K, V> i0<Map<K, V>> G7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(oVar2, "valueSelector is null");
        return (i0<Map<K, V>>) c0(HashMapSupplier.asCallable(), Functions.G(oVar, oVar2));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U extends Collection<? super T>> j<U> H(int i10, int i11, Callable<U> callable) {
        io.reactivex.internal.functions.a.h(i10, "count");
        io.reactivex.internal.functions.a.h(i11, org.apache.tools.ant.taskdefs.optional.vss.g.L2);
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new FlowableBuffer(this, i10, i11, callable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U, V> j<T> H1(org.reactivestreams.c<U> cVar, kh.o<? super T, ? extends org.reactivestreams.c<V>> oVar) {
        return K1(cVar).G1(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, V> j<V> H2(kh.o<? super T, ? extends Iterable<? extends U>> oVar, kh.c<? super T, ? super U, ? extends V> cVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.g(cVar, "resultSelector is null");
        return (j<V>) x2(FlowableInternalHelper.a(oVar), cVar, false, Y(), Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final i0<T> H3() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.n0(this, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final io.reactivex.parallel.a<T> H4(int i10) {
        io.reactivex.internal.functions.a.h(i10, "parallelism");
        return io.reactivex.parallel.a.z(this, i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> H6(int i10) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.j0(this));
            }
            return i10 == 1 ? io.reactivex.plugins.a.P(new FlowableTakeLastOne(this)) : io.reactivex.plugins.a.P(new FlowableTakeLast(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <K, V> i0<Map<K, V>> H7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(oVar2, "valueSelector is null");
        return (i0<Map<K, V>>) c0(callable, Functions.G(oVar, oVar2));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U extends Collection<? super T>> j<U> I(int i10, Callable<U> callable) {
        return H(i10, i10, callable);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> I1(long j10, TimeUnit timeUnit) {
        return J1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, V> j<V> I2(kh.o<? super T, ? extends Iterable<? extends U>> oVar, kh.c<? super T, ? super U, ? extends V> cVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.g(cVar, "resultSelector is null");
        return (j<V>) x2(FlowableInternalHelper.a(oVar), cVar, false, Y(), i10);
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> I3(n<? extends R, ? super T> nVar) {
        io.reactivex.internal.functions.a.g(nVar, "lifter is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.o0(this, nVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final io.reactivex.parallel.a<T> I4(int i10, int i11) {
        io.reactivex.internal.functions.a.h(i10, "parallelism");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.parallel.a.A(this, i10, i11);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> I5() {
        return io.reactivex.plugins.a.P(new x0(this));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> I6(long j10, long j11, TimeUnit timeUnit) {
        return K6(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), false, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final <K> i0<Map<K, Collection<T>>> I7(kh.o<? super T, ? extends K> oVar) {
        return (i0<Map<K, Collection<T>>>) L7(oVar, Functions.k(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, R> j<R> I8(Iterable<U> iterable, kh.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(iterable, "other is null");
        io.reactivex.internal.functions.a.g(cVar, "zipper is null");
        return io.reactivex.plugins.a.P(new k1(this, iterable, cVar));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<List<T>> J(long j10, long j11, TimeUnit timeUnit) {
        return (j<List<T>>) L(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), ArrayListSupplier.asCallable());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final j<T> J1(long j10, TimeUnit timeUnit, h0 h0Var) {
        return K1(v7(j10, timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final <R> j<R> J2(kh.o<? super T, ? extends w<? extends R>> oVar) {
        return K2(oVar, false, Integer.MAX_VALUE);
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final j<T> J3(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.P(new FlowableLimit(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> J4(kh.o<? super j<T>, ? extends org.reactivestreams.c<R>> oVar) {
        return K4(oVar, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> J5() {
        return L4().R8();
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final j<T> J6(long j10, long j11, TimeUnit timeUnit, h0 h0Var) {
        return K6(j10, j11, timeUnit, h0Var, false, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final <K, V> i0<Map<K, Collection<V>>> J7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2) {
        return L7(oVar, oVar2, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, R> j<R> J8(org.reactivestreams.c<? extends U> cVar, kh.c<? super T, ? super U, ? extends R> cVar2) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return w8(this, cVar, cVar2);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<List<T>> K(long j10, long j11, TimeUnit timeUnit, h0 h0Var) {
        return (j<List<T>>) L(j10, j11, timeUnit, h0Var, ArrayListSupplier.asCallable());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<T> K1(org.reactivestreams.c<U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "subscriptionIndicator is null");
        return io.reactivex.plugins.a.P(new FlowableDelaySubscriptionOther(this, cVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> K2(kh.o<? super T, ? extends w<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.P(new FlowableFlatMapMaybe(this, oVar, z10, i10));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> K3(kh.o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.p0(this, oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> K4(kh.o<? super j<T>, ? extends org.reactivestreams.c<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new FlowablePublishMulticast(this, oVar, i10, false));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final i0<T> K5(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultItem is null");
        return io.reactivex.plugins.a.S(new z0(this, t10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> K6(long j10, long j11, TimeUnit timeUnit, h0 h0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        if (j10 >= 0) {
            return io.reactivex.plugins.a.P(new FlowableTakeLastTimed(this, j10, j11, timeUnit, h0Var, i10, z10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j10);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final <K, V> i0<Map<K, Collection<V>>> K7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return L7(oVar, oVar2, callable, ArrayListSupplier.asFunction());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U, R> j<R> K8(org.reactivestreams.c<? extends U> cVar, kh.c<? super T, ? super U, ? extends R> cVar2, boolean z10) {
        return x8(this, cVar, cVar2, z10);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final <U extends Collection<? super T>> j<U> L(long j10, long j11, TimeUnit timeUnit, h0 h0Var, Callable<U> callable) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.k(this, j10, j11, timeUnit, h0Var, callable, Integer.MAX_VALUE, false));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @Deprecated
    @jh.c
    @jh.g("none")
    public final <T2> j<T2> L1() {
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.r(this, Functions.k()));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final <R> j<R> L2(kh.o<? super T, ? extends o0<? extends R>> oVar) {
        return M2(oVar, false, Integer.MAX_VALUE);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<y<T>> L3() {
        return io.reactivex.plugins.a.P(new FlowableMaterialize(this));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final io.reactivex.flowables.a<T> L4() {
        return M4(Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final q<T> L5() {
        return io.reactivex.plugins.a.Q(new y0(this));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> L6(long j10, TimeUnit timeUnit) {
        return O6(j10, timeUnit, io.reactivex.schedulers.b.a(), false, Y());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <K, V> i0<Map<K, Collection<V>>> L7(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, kh.o<? super K, ? extends Collection<? super V>> oVar3) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.a.g(callable, "mapSupplier is null");
        io.reactivex.internal.functions.a.g(oVar3, "collectionFactory is null");
        return (i0<Map<K, Collection<V>>>) c0(callable, Functions.H(oVar, oVar2, oVar3));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U, R> j<R> L8(org.reactivestreams.c<? extends U> cVar, kh.c<? super T, ? super U, ? extends R> cVar2, boolean z10, int i10) {
        return y8(this, cVar, cVar2, z10, i10);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<List<T>> M(long j10, TimeUnit timeUnit) {
        return P(j10, timeUnit, io.reactivex.schedulers.b.a(), Integer.MAX_VALUE);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.d
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> M1(kh.o<? super T, y<R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.r(this, oVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> M2(kh.o<? super T, ? extends o0<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.P(new FlowableFlatMapSingle(this, oVar, z10, i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final io.reactivex.flowables.a<T> M4(int i10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return FlowablePublish.X8(this, i10);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final i0<T> M5() {
        return io.reactivex.plugins.a.S(new z0(this, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final j<T> M6(long j10, TimeUnit timeUnit, h0 h0Var) {
        return O6(j10, timeUnit, h0Var, false, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final z<T> M7() {
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.n0(this));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<List<T>> N(long j10, TimeUnit timeUnit, int i10) {
        return P(j10, timeUnit, io.reactivex.schedulers.b.a(), i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> N1() {
        return P1(Functions.k(), Functions.g());
    }

    @jh.a(BackpressureKind.NONE)
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b N2(kh.g<? super T> gVar) {
        return f6(gVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> N5(long j10) {
        return j10 <= 0 ? io.reactivex.plugins.a.P(this) : io.reactivex.plugins.a.P(new a1(this, j10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final j<T> N6(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        return O6(j10, timeUnit, h0Var, z10, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final i0<List<T>> N7() {
        return P7(Functions.p());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<List<T>> O(long j10, TimeUnit timeUnit, h0 h0Var) {
        return (j<List<T>>) Q(j10, timeUnit, h0Var, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <K> j<T> O1(kh.o<? super T, K> oVar) {
        return P1(oVar, Functions.g());
    }

    @jh.a(BackpressureKind.NONE)
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b O2(kh.r<? super T> rVar) {
        return Q2(rVar, Functions.f119561f, Functions.f119558c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> O5(long j10, TimeUnit timeUnit) {
        return W5(u7(j10, timeUnit));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final j<T> O6(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10, int i10) {
        return K6(Long.MAX_VALUE, j10, timeUnit, h0Var, z10, i10);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final i0<List<T>> O7(int i10) {
        return Q7(Functions.p(), i10);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<List<T>> P(long j10, TimeUnit timeUnit, h0 h0Var, int i10) {
        return (j<List<T>>) Q(j10, timeUnit, h0Var, i10, ArrayListSupplier.asCallable(), false);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <K> j<T> P1(kh.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.t(this, oVar, callable));
    }

    @jh.a(BackpressureKind.NONE)
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b P2(kh.r<? super T> rVar, kh.g<? super Throwable> gVar) {
        return Q2(rVar, gVar, Functions.f119558c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> P4(int i10) {
        return n4(io.reactivex.internal.schedulers.c.f123682c, true, i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final j<T> P5(long j10, TimeUnit timeUnit, h0 h0Var) {
        return W5(v7(j10, timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> P6(long j10, TimeUnit timeUnit, boolean z10) {
        return O6(j10, timeUnit, io.reactivex.schedulers.b.a(), z10, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final i0<List<T>> P7(Comparator<? super T> comparator) {
        io.reactivex.internal.functions.a.g(comparator, "comparator is null");
        return (i0<List<T>>) C7().t0(Functions.o(comparator));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final <U extends Collection<? super T>> j<U> Q(long j10, TimeUnit timeUnit, h0 h0Var, int i10, Callable<U> callable, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        io.reactivex.internal.functions.a.h(i10, "count");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.k(this, j10, j10, timeUnit, h0Var, callable, i10, z10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> Q1() {
        return S1(Functions.k());
    }

    @jh.a(BackpressureKind.NONE)
    @jh.c
    @jh.e
    @jh.g("none")
    public final io.reactivex.disposables.b Q2(kh.r<? super T> rVar, kh.g<? super Throwable> gVar, kh.a aVar) {
        io.reactivex.internal.functions.a.g(rVar, "onNext is null");
        io.reactivex.internal.functions.a.g(gVar, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        ForEachWhileSubscriber forEachWhileSubscriber = new ForEachWhileSubscriber(rVar, gVar, aVar);
        j6(forEachWhileSubscriber);
        return forEachWhileSubscriber;
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final q<T> Q4(kh.c<T, T, T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.Q(new s0(this, cVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> Q5(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? io.reactivex.plugins.a.P(this) : io.reactivex.plugins.a.P(new FlowableSkipLast(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> Q6(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "stopPredicate is null");
        return io.reactivex.plugins.a.P(new e1(this, rVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final i0<List<T>> Q7(Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.a.g(comparator, "comparator is null");
        return (i0<List<T>>) D7(i10).t0(Functions.o(comparator));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <TOpening, TClosing> j<List<T>> R(j<? extends TOpening> jVar, kh.o<? super TOpening, ? extends org.reactivestreams.c<? extends TClosing>> oVar) {
        return (j<List<T>>) S(jVar, oVar, ArrayListSupplier.asCallable());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> R0(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        return S0(oVar, 2);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> R1(kh.d<? super T, ? super T> dVar) {
        io.reactivex.internal.functions.a.g(dVar, "comparer is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.u(this, Functions.k(), dVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> i0<R> R4(R r10, kh.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.a.g(r10, "seed is null");
        io.reactivex.internal.functions.a.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.S(new t0(this, r10, cVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final j<T> R5(long j10, TimeUnit timeUnit) {
        return U5(j10, timeUnit, io.reactivex.schedulers.b.a(), false, Y());
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<T> R6(org.reactivestreams.c<U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return io.reactivex.plugins.a.P(new FlowableTakeUntil(this, cVar));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> j<U> S(j<? extends TOpening> jVar, kh.o<? super TOpening, ? extends org.reactivestreams.c<? extends TClosing>> oVar, Callable<U> callable) {
        io.reactivex.internal.functions.a.g(jVar, "openingIndicator is null");
        io.reactivex.internal.functions.a.g(oVar, "closingIndicator is null");
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new FlowableBufferBoundary(this, jVar, oVar, callable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> S0(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        if (!(this instanceof lh.m)) {
            return io.reactivex.plugins.a.P(new FlowableConcatMap(this, oVar, i10, ErrorMode.IMMEDIATE));
        }
        Object objCall = ((lh.m) this).call();
        return objCall == null ? k2() : v0.a(objCall, oVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <K> j<T> S1(kh.o<? super T, K> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.u(this, oVar, io.reactivex.internal.functions.a.d()));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> i0<R> S4(Callable<R> callable, kh.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.a.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.a.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.S(new u0(this, callable, cVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("custom")
    public final j<T> S5(long j10, TimeUnit timeUnit, h0 h0Var) {
        return U5(j10, timeUnit, h0Var, false, Y());
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> S6(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.P(new f1(this, rVar));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> S7(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableUnsubscribeOn(this, h0Var));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <B> j<List<T>> T(Callable<? extends org.reactivestreams.c<B>> callable) {
        return (j<List<T>>) U(callable, ArrayListSupplier.asCallable());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final a T0(kh.o<? super T, ? extends g> oVar) {
        return U0(oVar, 2);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> T1(kh.g<? super T> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onAfterNext is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.v(this, gVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> T4() {
        return U4(Long.MAX_VALUE);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("custom")
    public final j<T> T5(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        return U5(j10, timeUnit, h0Var, z10, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final TestSubscriber<T> T6() {
        TestSubscriber<T> testSubscriber = new TestSubscriber<>();
        j6(testSubscriber);
        return testSubscriber;
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <B, U extends Collection<? super T>> j<U> U(Callable<? extends org.reactivestreams.c<B>> callable, Callable<U> callable2) {
        io.reactivex.internal.functions.a.g(callable, "boundaryIndicatorSupplier is null");
        io.reactivex.internal.functions.a.g(callable2, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.i(this, callable, callable2));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final a U0(kh.o<? super T, ? extends g> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.O(new FlowableConcatMapCompletable(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> U1(kh.a aVar) {
        return Z1(Functions.h(), Functions.h(), Functions.f119558c, aVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> U4(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? k2() : io.reactivex.plugins.a.P(new FlowableRepeat(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> U5(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableSkipLastTimed(this, j10, timeUnit, h0Var, i10 << 1, z10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final TestSubscriber<T> U6(long j10) {
        TestSubscriber<T> testSubscriber = new TestSubscriber<>(j10);
        j6(testSubscriber);
        return testSubscriber;
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <B> j<List<T>> V(org.reactivestreams.c<B> cVar) {
        return (j<List<T>>) X(cVar, ArrayListSupplier.asCallable());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final a V0(kh.o<? super T, ? extends g> oVar) {
        return X0(oVar, true, 2);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> V1(kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.P(new FlowableDoFinally(this, aVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> V4(kh.e eVar) {
        io.reactivex.internal.functions.a.g(eVar, "stop is null");
        return io.reactivex.plugins.a.P(new FlowableRepeatUntil(this, eVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final j<T> V5(long j10, TimeUnit timeUnit, boolean z10) {
        return U5(j10, timeUnit, io.reactivex.schedulers.b.a(), z10, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final TestSubscriber<T> V6(long j10, boolean z10) {
        TestSubscriber<T> testSubscriber = new TestSubscriber<>(j10);
        if (z10) {
            testSubscriber.cancel();
        }
        j6(testSubscriber);
        return testSubscriber;
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<j<T>> V7(long j10) {
        return X7(j10, j10, Y());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <B> j<List<T>> W(org.reactivestreams.c<B> cVar, int i10) {
        io.reactivex.internal.functions.a.h(i10, "initialCapacity");
        return (j<List<T>>) X(cVar, Functions.f(i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final a W0(kh.o<? super T, ? extends g> oVar, boolean z10) {
        return X0(oVar, z10, 2);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> W1(kh.a aVar) {
        return c2(Functions.h(), Functions.f119562g, aVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> W4(kh.o<? super j<Object>, ? extends org.reactivestreams.c<?>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "handler is null");
        return io.reactivex.plugins.a.P(new FlowableRepeatWhen(this, oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<T> W5(org.reactivestreams.c<U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return io.reactivex.plugins.a.P(new FlowableSkipUntil(this, cVar));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> W6(long j10, TimeUnit timeUnit) {
        return X6(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<j<T>> W7(long j10, long j11) {
        return X7(j10, j11, Y());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <B, U extends Collection<? super T>> j<U> X(org.reactivestreams.c<B> cVar, Callable<U> callable) {
        io.reactivex.internal.functions.a.g(cVar, "boundaryIndicator is null");
        io.reactivex.internal.functions.a.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.j(this, cVar, callable));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final a X0(kh.o<? super T, ? extends g> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.O(new FlowableConcatMapCompletable(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> X1(kh.a aVar) {
        return Z1(Functions.h(), Functions.h(), aVar, Functions.f119558c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> X4(kh.o<? super j<T>, ? extends org.reactivestreams.c<R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        return FlowableReplay.c9(FlowableInternalHelper.d(this), oVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> X5(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.P(new b1(this, rVar));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> X6(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableThrottleFirstTimed(this, j10, timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<j<T>> X7(long j10, long j11, int i10) {
        io.reactivex.internal.functions.a.i(j11, org.apache.tools.ant.taskdefs.optional.vss.g.L2);
        io.reactivex.internal.functions.a.i(j10, "count");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableWindow(this, j10, j11, i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> Y0(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        return Z0(oVar, 2, true);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> Y1(kh.g<? super y<T>> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onNotification is null");
        return Z1(Functions.t(gVar), Functions.s(gVar), Functions.r(gVar), Functions.f119558c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> Y4(kh.o<? super j<T>, ? extends org.reactivestreams.c<R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return FlowableReplay.c9(FlowableInternalHelper.e(this, i10), oVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> Y5() {
        return C7().t1().K3(Functions.o(Functions.p())).F2(Functions.k());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> Y6(long j10, TimeUnit timeUnit) {
        return v5(j10, timeUnit);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<j<T>> Y7(long j10, long j11, TimeUnit timeUnit) {
        return a8(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> Z() {
        return a0(16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> Z0(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        if (!(this instanceof lh.m)) {
            return io.reactivex.plugins.a.P(new FlowableConcatMap(this, oVar, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object objCall = ((lh.m) this).call();
        return objCall == null ? k2() : v0.a(objCall, oVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g(jh.g.E0)
    public final <R> j<R> Z4(kh.o<? super j<T>, ? extends org.reactivestreams.c<R>> oVar, int i10, long j10, TimeUnit timeUnit) {
        return a5(oVar, i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> Z5(Comparator<? super T> comparator) {
        io.reactivex.internal.functions.a.g(comparator, "sortFunction");
        return C7().t1().K3(Functions.o(comparator)).F2(Functions.k());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<T> Z6(long j10, TimeUnit timeUnit, h0 h0Var) {
        return w5(j10, timeUnit, h0Var);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<j<T>> Z7(long j10, long j11, TimeUnit timeUnit, h0 h0Var) {
        return a8(j10, j11, timeUnit, h0Var, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> a0(int i10) {
        io.reactivex.internal.functions.a.h(i10, "initialCapacity");
        return io.reactivex.plugins.a.P(new FlowableCache(this, i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> a1(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        return b1(oVar, Y(), Y());
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> a2(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.internal.functions.a.g(dVar, "subscriber is null");
        return Z1(FlowableInternalHelper.m(dVar), FlowableInternalHelper.l(dVar), FlowableInternalHelper.k(dVar), Functions.f119558c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final <R> j<R> a5(kh.o<? super j<T>, ? extends org.reactivestreams.c<R>> oVar, int i10, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return FlowableReplay.c9(FlowableInternalHelper.f(this, i10, j10, timeUnit, h0Var), oVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> a6(Iterable<? extends T> iterable) {
        return E0(X2(iterable), this);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> a7(long j10, TimeUnit timeUnit) {
        return c7(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<j<T>> a8(long j10, long j11, TimeUnit timeUnit, h0 h0Var, int i10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.i(j10, "timespan");
        io.reactivex.internal.functions.a.i(j11, "timeskip");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.P(new j1(this, j10, j11, timeUnit, h0Var, Long.MAX_VALUE, i10, false));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final i0<Boolean> b(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.e(this, rVar));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<U> b0(Class<U> cls) {
        io.reactivex.internal.functions.a.g(cls, "clazz is null");
        return (j<U>) K3(Functions.e(cls));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> b1(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, int i11) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.plugins.a.P(new FlowableConcatMapEager(this, oVar, i10, i11, ErrorMode.IMMEDIATE));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> b2(kh.g<? super Throwable> gVar) {
        kh.g<? super T> gVarH = Functions.h();
        kh.a aVar = Functions.f119558c;
        return Z1(gVarH, gVar, aVar, aVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final <R> j<R> b5(kh.o<? super j<T>, ? extends org.reactivestreams.c<R>> oVar, int i10, h0 h0Var) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return FlowableReplay.c9(FlowableInternalHelper.e(this, i10), FlowableInternalHelper.h(oVar, h0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> b6(T t10) {
        io.reactivex.internal.functions.a.g(t10, "value is null");
        return E0(v3(t10), this);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<T> b7(long j10, TimeUnit timeUnit, h0 h0Var) {
        return c7(j10, timeUnit, h0Var, false);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<j<T>> b8(long j10, TimeUnit timeUnit) {
        return g8(j10, timeUnit, io.reactivex.schedulers.b.a(), Long.MAX_VALUE, false);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> i0<U> c0(Callable<? extends U> callable, kh.b<? super U, ? super T> bVar) {
        io.reactivex.internal.functions.a.g(callable, "initialItemSupplier is null");
        io.reactivex.internal.functions.a.g(bVar, "collector is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.l(this, callable, bVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> c1(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, int i11, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.plugins.a.P(new FlowableConcatMapEager(this, oVar, i10, i11, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> c2(kh.g<? super org.reactivestreams.e> gVar, kh.q qVar, kh.a aVar) {
        io.reactivex.internal.functions.a.g(gVar, "onSubscribe is null");
        io.reactivex.internal.functions.a.g(qVar, "onRequest is null");
        io.reactivex.internal.functions.a.g(aVar, "onCancel is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.x(this, gVar, qVar, aVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g(jh.g.E0)
    public final <R> j<R> c5(kh.o<? super j<T>, ? extends org.reactivestreams.c<R>> oVar, long j10, TimeUnit timeUnit) {
        return d5(oVar, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> c6(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return E0(cVar, this);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> c7(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableThrottleLatest(this, j10, timeUnit, h0Var, z10));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<j<T>> c8(long j10, TimeUnit timeUnit, long j11) {
        return g8(j10, timeUnit, io.reactivex.schedulers.b.a(), j11, false);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> i0<U> d0(U u10, kh.b<? super U, ? super T> bVar) {
        io.reactivex.internal.functions.a.g(u10, "initialItem is null");
        return c0(Functions.m(u10), bVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> d1(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, boolean z10) {
        return c1(oVar, Y(), Y(), z10);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> d2(kh.g<? super T> gVar) {
        kh.g<? super Throwable> gVarH = Functions.h();
        kh.a aVar = Functions.f119558c;
        return Z1(gVar, gVarH, aVar, aVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final <R> j<R> d5(kh.o<? super j<T>, ? extends org.reactivestreams.c<R>> oVar, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return FlowableReplay.c9(FlowableInternalHelper.g(this, j10, timeUnit, h0Var), oVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> d6(T... tArr) {
        j jVarR2 = R2(tArr);
        return jVarR2 == k2() ? io.reactivex.plugins.a.P(this) : E0(jVarR2, this);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> d7(long j10, TimeUnit timeUnit, boolean z10) {
        return c7(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<j<T>> d8(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return g8(j10, timeUnit, io.reactivex.schedulers.b.a(), j11, z10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U> j<U> e1(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return f1(oVar, 2);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> e2(kh.q qVar) {
        return c2(Functions.h(), qVar, Functions.f119558c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <K> j<io.reactivex.flowables.b<K, T>> e3(kh.o<? super T, ? extends K> oVar) {
        return (j<io.reactivex.flowables.b<K, T>>) h3(oVar, Functions.k(), false, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final <R> j<R> e5(kh.o<? super j<T>, ? extends org.reactivestreams.c<R>> oVar, h0 h0Var) {
        io.reactivex.internal.functions.a.g(oVar, "selector is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return FlowableReplay.c9(FlowableInternalHelper.d(this), FlowableInternalHelper.h(oVar, h0Var));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.g("none")
    public final io.reactivex.disposables.b e6() {
        return i6(Functions.h(), Functions.f119561f, Functions.f119558c, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> e7(long j10, TimeUnit timeUnit) {
        return x1(j10, timeUnit);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<j<T>> e8(long j10, TimeUnit timeUnit, h0 h0Var) {
        return g8(j10, timeUnit, h0Var, Long.MAX_VALUE, false);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> f(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return d(this, cVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<U> f1(kh.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new FlowableFlattenIterable(this, oVar, i10));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> f2(kh.g<? super org.reactivestreams.e> gVar) {
        return c2(gVar, Functions.f119562g, Functions.f119558c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <K, V> j<io.reactivex.flowables.b<K, V>> f3(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2) {
        return h3(oVar, oVar2, false, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final io.reactivex.flowables.a<T> f5() {
        return FlowableReplay.b9(this);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b f6(kh.g<? super T> gVar) {
        return i6(gVar, Functions.f119561f, Functions.f119558c, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<T> f7(long j10, TimeUnit timeUnit, h0 h0Var) {
        return y1(j10, timeUnit, h0Var);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<j<T>> f8(long j10, TimeUnit timeUnit, h0 h0Var, long j11) {
        return g8(j10, timeUnit, h0Var, j11, false);
    }

    @Override // org.reactivestreams.c
    @jh.a(BackpressureKind.SPECIAL)
    @jh.g("none")
    public final void g(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof o) {
            j6((o) dVar);
        } else {
            io.reactivex.internal.functions.a.g(dVar, "s is null");
            j6(new StrictSubscriber(dVar));
        }
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> g1(kh.o<? super T, ? extends w<? extends R>> oVar) {
        return h1(oVar, 2);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> g2(kh.a aVar) {
        return Z1(Functions.h(), Functions.a(aVar), aVar, Functions.f119558c);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <K, V> j<io.reactivex.flowables.b<K, V>> g3(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, boolean z10) {
        return h3(oVar, oVar2, z10, Y());
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> g4(@jh.e g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return io.reactivex.plugins.a.P(new FlowableMergeWithCompletable(this, gVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final io.reactivex.flowables.a<T> g5(int i10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return FlowableReplay.X8(this, i10);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b g6(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
        return i6(gVar, gVar2, Functions.f119558c, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<io.reactivex.schedulers.d<T>> g7() {
        return j7(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("custom")
    public final j<j<T>> g8(long j10, TimeUnit timeUnit, h0 h0Var, long j11, boolean z10) {
        return h8(j10, timeUnit, h0Var, j11, z10, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final i0<Boolean> h(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.f(this, rVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> h1(kh.o<? super T, ? extends w<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new FlowableConcatMapMaybe(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final q<T> h2(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.flowable.y(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <K, V> j<io.reactivex.flowables.b<K, V>> h3(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableGroupBy(this, oVar, oVar2, i10, z10, null));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> h4(@jh.e w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return io.reactivex.plugins.a.P(new FlowableMergeWithMaybe(this, wVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g(jh.g.E0)
    public final io.reactivex.flowables.a<T> h5(int i10, long j10, TimeUnit timeUnit) {
        return i5(i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final io.reactivex.disposables.b h6(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
        return i6(gVar, gVar2, aVar, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<io.reactivex.schedulers.d<T>> h7(h0 h0Var) {
        return j7(TimeUnit.MILLISECONDS, h0Var);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<j<T>> h8(long j10, TimeUnit timeUnit, h0 h0Var, long j11, boolean z10, int i10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.i(j11, "count");
        return io.reactivex.plugins.a.P(new j1(this, j10, j10, timeUnit, h0Var, j11, i10, z10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> i1(kh.o<? super T, ? extends w<? extends R>> oVar) {
        return k1(oVar, true, 2);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final i0<T> i2(long j10, T t10) {
        if (j10 >= 0) {
            io.reactivex.internal.functions.a.g(t10, "defaultItem is null");
            return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.z(this, j10, t10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <K, V> j<io.reactivex.flowables.b<K, V>> i3(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, boolean z10, int i10, kh.o<? super kh.g<Object>, ? extends Map<K, Object>> oVar3) {
        io.reactivex.internal.functions.a.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.a.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.g(oVar3, "evictingMapFactory is null");
        return io.reactivex.plugins.a.P(new FlowableGroupBy(this, oVar, oVar2, i10, z10, oVar3));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> i4(@jh.e o0<? extends T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return io.reactivex.plugins.a.P(new FlowableMergeWithSingle(this, o0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final io.reactivex.flowables.a<T> i5(int i10, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return FlowableReplay.Z8(this, j10, timeUnit, h0Var, i10);
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final io.reactivex.disposables.b i6(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.g<? super org.reactivestreams.e> gVar3) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.a.g(gVar3, "onSubscribe is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(gVar, gVar2, aVar, gVar3);
        j6(lambdaSubscriber);
        return lambdaSubscriber;
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<io.reactivex.schedulers.d<T>> i7(TimeUnit timeUnit) {
        return j7(timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <B> j<j<T>> i8(Callable<? extends org.reactivestreams.c<B>> callable) {
        return j8(callable, Y());
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final <R> R j(@jh.e k<T, ? extends R> kVar) {
        return (R) ((k) io.reactivex.internal.functions.a.g(kVar, "converter is null")).d(this);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> j1(kh.o<? super T, ? extends w<? extends R>> oVar, boolean z10) {
        return k1(oVar, z10, 2);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final i0<T> j2(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.z(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <K> j<io.reactivex.flowables.b<K, T>> j3(kh.o<? super T, ? extends K> oVar, boolean z10) {
        return (j<io.reactivex.flowables.b<K, T>>) h3(oVar, Functions.k(), z10, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> j4(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return R3(this, cVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final io.reactivex.flowables.a<T> j5(int i10, h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return FlowableReplay.d9(g5(i10), h0Var);
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.g("none")
    public final void j6(o<? super T> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "s is null");
        try {
            org.reactivestreams.d<? super T> dVarH0 = io.reactivex.plugins.a.h0(this, oVar);
            io.reactivex.internal.functions.a.g(dVarH0, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            k6(dVarH0);
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

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<io.reactivex.schedulers.d<T>> j7(TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new g1(this, timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <B> j<j<T>> j8(Callable<? extends org.reactivestreams.c<B>> callable, int i10) {
        io.reactivex.internal.functions.a.g(callable, "boundaryIndicatorSupplier is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableWindowBoundarySupplier(this, callable, i10));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final T k() {
        io.reactivex.internal.subscribers.d dVar = new io.reactivex.internal.subscribers.d();
        j6(dVar);
        T tA = dVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> k1(kh.o<? super T, ? extends w<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new FlowableConcatMapMaybe(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <TRight, TLeftEnd, TRightEnd, R> j<R> k3(org.reactivestreams.c<? extends TRight> cVar, kh.o<? super T, ? extends org.reactivestreams.c<TLeftEnd>> oVar, kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> oVar2, kh.c<? super T, ? super j<TRight>, ? extends R> cVar2) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        io.reactivex.internal.functions.a.g(oVar, "leftEnd is null");
        io.reactivex.internal.functions.a.g(oVar2, "rightEnd is null");
        io.reactivex.internal.functions.a.g(cVar2, "resultSelector is null");
        return io.reactivex.plugins.a.P(new FlowableGroupJoin(this, cVar, oVar, oVar2, cVar2));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g(jh.g.E0)
    public final io.reactivex.flowables.a<T> k5(long j10, TimeUnit timeUnit) {
        return l5(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    protected abstract void k6(org.reactivestreams.d<? super T> dVar);

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> k7(long j10, TimeUnit timeUnit) {
        return s7(j10, timeUnit, null, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <B> j<j<T>> k8(org.reactivestreams.c<B> cVar) {
        return l8(cVar, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final T l(T t10) {
        io.reactivex.internal.subscribers.d dVar = new io.reactivex.internal.subscribers.d();
        j6(dVar);
        T tA = dVar.a();
        return tA != null ? tA : t10;
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> l1(kh.o<? super T, ? extends o0<? extends R>> oVar) {
        return m1(oVar, 2);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> l3() {
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.i0(this));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final j<T> l4(h0 h0Var) {
        return n4(h0Var, false, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final io.reactivex.flowables.a<T> l5(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return FlowableReplay.Y8(this, j10, timeUnit, h0Var);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> l6(@jh.e h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return m6(h0Var, !(this instanceof FlowableCreate));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("custom")
    public final j<T> l7(long j10, TimeUnit timeUnit, h0 h0Var) {
        return s7(j10, timeUnit, null, h0Var);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <B> j<j<T>> l8(org.reactivestreams.c<B> cVar, int i10) {
        io.reactivex.internal.functions.a.g(cVar, "boundaryIndicator is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableWindowBoundary(this, cVar, i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> m1(kh.o<? super T, ? extends o0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new FlowableConcatMapSingle(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final a m3() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.flowable.k0(this));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final j<T> m4(h0 h0Var, boolean z10) {
        return n4(h0Var, z10, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("custom")
    public final io.reactivex.flowables.a<T> m5(h0 h0Var) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return FlowableReplay.d9(f5(), h0Var);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> m6(@jh.e h0 h0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableSubscribeOn(this, h0Var, z10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> m7(long j10, TimeUnit timeUnit, h0 h0Var, org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return s7(j10, timeUnit, cVar, h0Var);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final <U, V> j<j<T>> m8(org.reactivestreams.c<U> cVar, kh.o<? super U, ? extends org.reactivestreams.c<V>> oVar) {
        return n8(cVar, oVar, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.g("none")
    public final void n(kh.g<? super T> gVar) {
        Iterator<T> it = o().iterator();
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

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> n1(kh.o<? super T, ? extends o0<? extends R>> oVar) {
        return p1(oVar, true, 2);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> n2(kh.r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.c0(this, rVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> n4(h0 h0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new FlowableObserveOn(this, h0Var, z10, i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> n5() {
        return p5(Long.MAX_VALUE, Functions.c());
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final <E extends org.reactivestreams.d<? super T>> E n6(E e10) {
        g(e10);
        return e10;
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g(jh.g.E0)
    public final j<T> n7(long j10, TimeUnit timeUnit, org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return s7(j10, timeUnit, cVar, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, V> j<j<T>> n8(org.reactivestreams.c<U> cVar, kh.o<? super U, ? extends org.reactivestreams.c<V>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(cVar, "openingIndicator is null");
        io.reactivex.internal.functions.a.g(oVar, "closingIndicator is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new i1(this, cVar, oVar, i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final Iterable<T> o() {
        return p(Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> o1(kh.o<? super T, ? extends o0<? extends R>> oVar, boolean z10) {
        return p1(oVar, z10, 2);
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final i0<T> o2(T t10) {
        return i2(0L, t10);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<U> o4(Class<U> cls) {
        io.reactivex.internal.functions.a.g(cls, "clazz is null");
        return n2(Functions.l(cls)).b0(cls);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> o5(long j10) {
        return p5(j10, Functions.c());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> o6(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return io.reactivex.plugins.a.P(new c1(this, cVar));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final <V> j<T> o7(kh.o<? super T, ? extends org.reactivestreams.c<V>> oVar) {
        return t7(null, oVar, null);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> o8(Iterable<? extends org.reactivestreams.c<?>> iterable, kh.o<? super Object[], R> oVar) {
        io.reactivex.internal.functions.a.g(iterable, "others is null");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        return io.reactivex.plugins.a.P(new FlowableWithLatestFromMany(this, iterable, oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final Iterable<T> p(int i10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        return new BlockingFlowableIterable(this, i10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> p1(kh.o<? super T, ? extends o0<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new FlowableConcatMapSingle(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final q<T> p2() {
        return h2(0L);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final j<T> p4() {
        return t4(Y(), false, true);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> p5(long j10, kh.r<? super Throwable> rVar) {
        if (j10 >= 0) {
            io.reactivex.internal.functions.a.g(rVar, "predicate is null");
            return io.reactivex.plugins.a.P(new FlowableRetryPredicate(this, j10, rVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> p6(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        return q6(oVar, Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <V> j<T> p7(kh.o<? super T, ? extends org.reactivestreams.c<V>> oVar, j<? extends T> jVar) {
        io.reactivex.internal.functions.a.g(jVar, "other is null");
        return t7(null, oVar, jVar);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, R> j<R> p8(org.reactivestreams.c<? extends U> cVar, kh.c<? super T, ? super U, ? extends R> cVar2) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        io.reactivex.internal.functions.a.g(cVar2, "combiner is null");
        return io.reactivex.plugins.a.P(new FlowableWithLatestFrom(this, cVar2, cVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final T q() {
        io.reactivex.internal.subscribers.e eVar = new io.reactivex.internal.subscribers.e();
        j6(eVar);
        T tA = eVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<T> q1(@jh.e g gVar) {
        io.reactivex.internal.functions.a.g(gVar, "other is null");
        return io.reactivex.plugins.a.P(new FlowableConcatWithCompletable(this, gVar));
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final i0<T> q2() {
        return j2(0L);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final j<T> q4(int i10) {
        return t4(i10, false, false);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> q5(kh.d<? super Integer, ? super Throwable> dVar) {
        io.reactivex.internal.functions.a.g(dVar, "predicate is null");
        return io.reactivex.plugins.a.P(new FlowableRetryBiPredicate(this, dVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> q6(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10) {
        return r6(oVar, i10, false);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, V> j<T> q7(org.reactivestreams.c<U> cVar, kh.o<? super T, ? extends org.reactivestreams.c<V>> oVar) {
        io.reactivex.internal.functions.a.g(cVar, "firstTimeoutIndicator is null");
        return t7(cVar, oVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <T1, T2, R> j<R> q8(org.reactivestreams.c<T1> cVar, org.reactivestreams.c<T2> cVar2, kh.h<? super T, ? super T1, ? super T2, R> hVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        return t8(new org.reactivestreams.c[]{cVar, cVar2}, Functions.y(hVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final T r(T t10) {
        io.reactivex.internal.subscribers.e eVar = new io.reactivex.internal.subscribers.e();
        j6(eVar);
        T tA = eVar.a();
        return tA != null ? tA : t10;
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> r1(@jh.e w<? extends T> wVar) {
        io.reactivex.internal.functions.a.g(wVar, "other is null");
        return io.reactivex.plugins.a.P(new FlowableConcatWithMaybe(this, wVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> r2(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        return C2(oVar, false, Y(), Y());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final j<T> r4(int i10, kh.a aVar) {
        return u4(i10, false, false, aVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> r5(kh.r<? super Throwable> rVar) {
        return p5(Long.MAX_VALUE, rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> j<R> r6(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        if (!(this instanceof lh.m)) {
            return io.reactivex.plugins.a.P(new FlowableSwitchMap(this, oVar, i10, z10));
        }
        Object objCall = ((lh.m) this).call();
        return objCall == null ? k2() : v0.a(objCall, oVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, V> j<T> r7(org.reactivestreams.c<U> cVar, kh.o<? super T, ? extends org.reactivestreams.c<V>> oVar, org.reactivestreams.c<? extends T> cVar2) {
        io.reactivex.internal.functions.a.g(cVar, "firstTimeoutSelector is null");
        io.reactivex.internal.functions.a.g(cVar2, "other is null");
        return t7(cVar, oVar, cVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <T1, T2, T3, R> j<R> r8(org.reactivestreams.c<T1> cVar, org.reactivestreams.c<T2> cVar2, org.reactivestreams.c<T3> cVar3, kh.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        return t8(new org.reactivestreams.c[]{cVar, cVar2, cVar3}, Functions.z(iVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final Iterable<T> s() {
        return new io.reactivex.internal.operators.flowable.b(this);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> s1(@jh.e o0<? extends T> o0Var) {
        io.reactivex.internal.functions.a.g(o0Var, "other is null");
        return io.reactivex.plugins.a.P(new FlowableConcatWithSingle(this, o0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> s2(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10) {
        return C2(oVar, false, i10, Y());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g("none")
    public final j<T> s4(int i10, boolean z10) {
        return t4(i10, z10, false);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> s5(kh.e eVar) {
        io.reactivex.internal.functions.a.g(eVar, "stop is null");
        return p5(Long.MAX_VALUE, Functions.v(eVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final a s6(@jh.e kh.o<? super T, ? extends g> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new FlowableSwitchMapCompletable(this, oVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <T1, T2, T3, T4, R> j<R> s8(org.reactivestreams.c<T1> cVar, org.reactivestreams.c<T2> cVar2, org.reactivestreams.c<T3> cVar3, org.reactivestreams.c<T4> cVar4, kh.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        io.reactivex.internal.functions.a.g(cVar, "source1 is null");
        io.reactivex.internal.functions.a.g(cVar2, "source2 is null");
        io.reactivex.internal.functions.a.g(cVar3, "source3 is null");
        io.reactivex.internal.functions.a.g(cVar4, "source4 is null");
        return t8(new org.reactivestreams.c[]{cVar, cVar2, cVar3, cVar4}, Functions.A(jVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final Iterable<T> t(T t10) {
        return new io.reactivex.internal.operators.flowable.c(this, t10);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> t1(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        return B0(this, cVar);
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U, R> j<R> t2(kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar) {
        return x2(oVar, cVar, false, Y(), Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final i0<Boolean> t3() {
        return b(Functions.b());
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final j<T> t4(int i10, boolean z10, boolean z11) {
        io.reactivex.internal.functions.a.h(i10, "capacity");
        return io.reactivex.plugins.a.P(new FlowableOnBackpressureBuffer(this, i10, z11, z10, Functions.f119558c));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> t5(kh.o<? super j<Throwable>, ? extends org.reactivestreams.c<?>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "handler is null");
        return io.reactivex.plugins.a.P(new FlowableRetryWhen(this, oVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final a t6(@jh.e kh.o<? super T, ? extends g> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new FlowableSwitchMapCompletable(this, oVar, true));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> t8(org.reactivestreams.c<?>[] cVarArr, kh.o<? super Object[], R> oVar) {
        io.reactivex.internal.functions.a.g(cVarArr, "others is null");
        io.reactivex.internal.functions.a.g(oVar, "combiner is null");
        return io.reactivex.plugins.a.P(new FlowableWithLatestFromMany(this, cVarArr, oVar));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final Iterable<T> u() {
        return new io.reactivex.internal.operators.flowable.d(this);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final i0<Boolean> u1(Object obj) {
        io.reactivex.internal.functions.a.g(obj, "item is null");
        return h(Functions.i(obj));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U, R> j<R> u2(kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar, int i10) {
        return x2(oVar, cVar, false, i10, Y());
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <TRight, TLeftEnd, TRightEnd, R> j<R> u3(org.reactivestreams.c<? extends TRight> cVar, kh.o<? super T, ? extends org.reactivestreams.c<TLeftEnd>> oVar, kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> oVar2, kh.c<? super T, ? super TRight, ? extends R> cVar2) {
        io.reactivex.internal.functions.a.g(cVar, "other is null");
        io.reactivex.internal.functions.a.g(oVar, "leftEnd is null");
        io.reactivex.internal.functions.a.g(oVar2, "rightEnd is null");
        io.reactivex.internal.functions.a.g(cVar2, "resultSelector is null");
        return io.reactivex.plugins.a.P(new FlowableJoin(this, cVar, oVar, oVar2, cVar2));
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> u4(int i10, boolean z10, boolean z11, kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onOverflow is null");
        io.reactivex.internal.functions.a.h(i10, "capacity");
        return io.reactivex.plugins.a.P(new FlowableOnBackpressureBuffer(this, i10, z11, z10, aVar));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.g("none")
    public final void u5(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.internal.functions.a.g(dVar, "s is null");
        if (dVar instanceof io.reactivex.subscribers.d) {
            j6((io.reactivex.subscribers.d) dVar);
        } else {
            j6(new io.reactivex.subscribers.d(dVar));
        }
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> u6(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        return v6(oVar, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final T v() {
        return M5().j();
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final i0<Long> v1() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.o(this));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U, R> j<R> v2(kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return x2(oVar, cVar, z10, Y(), Y());
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> v4(long j10, kh.a aVar, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        io.reactivex.internal.functions.a.g(backpressureOverflowStrategy, "overflowStrategy is null");
        io.reactivex.internal.functions.a.i(j10, "capacity");
        return io.reactivex.plugins.a.P(new FlowableOnBackpressureBufferStrategy(this, j10, aVar, backpressureOverflowStrategy));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> v5(long j10, TimeUnit timeUnit) {
        return w5(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.SPECIAL)
    @jh.c
    @jh.g("none")
    public final <R> j<R> v6(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10) {
        return r6(oVar, i10, true);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final T w(T t10) {
        return K5(t10).j();
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final <U, R> j<R> w2(kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return x2(oVar, cVar, z10, i10, Y());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final j<T> w4(boolean z10) {
        return t4(Y(), z10, true);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> w5(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableSampleTimed(this, j10, timeUnit, h0Var, false));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> w6(@jh.e kh.o<? super T, ? extends w<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new FlowableSwitchMapMaybe(this, oVar, false));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<io.reactivex.schedulers.d<T>> w7() {
        return z7(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.g("none")
    public final void x() {
        io.reactivex.internal.operators.flowable.h.a(this);
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final <R> j<R> x0(p<? super T, ? extends R> pVar) {
        return Y2(((p) io.reactivex.internal.functions.a.g(pVar, "composer is null")).d(this));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> x1(long j10, TimeUnit timeUnit) {
        return y1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U, R> j<R> x2(kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.g(cVar, "combiner is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "bufferSize");
        return C2(FlowableInternalHelper.b(oVar, cVar), z10, i10, i11);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final j<T> x4() {
        return io.reactivex.plugins.a.P(new FlowableOnBackpressureDrop(this));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> x5(long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableSampleTimed(this, j10, timeUnit, h0Var, z10));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> x6(@jh.e kh.o<? super T, ? extends w<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new FlowableSwitchMapMaybe(this, oVar, true));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<io.reactivex.schedulers.d<T>> x7(h0 h0Var) {
        return z7(TimeUnit.MILLISECONDS, h0Var);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.g("none")
    public final void y(kh.g<? super T> gVar) {
        io.reactivex.internal.operators.flowable.h.b(this, gVar, Functions.f119561f, Functions.f119558c);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("custom")
    public final j<T> y1(long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableDebounceTimed(this, j10, timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> y2(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, kh.o<? super Throwable, ? extends org.reactivestreams.c<? extends R>> oVar2, Callable<? extends org.reactivestreams.c<? extends R>> callable) {
        io.reactivex.internal.functions.a.g(oVar, "onNextMapper is null");
        io.reactivex.internal.functions.a.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.a.g(callable, "onCompleteSupplier is null");
        return P3(new FlowableMapNotification(this, oVar, oVar2, callable));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<T> y4(kh.g<? super T> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onDrop is null");
        return io.reactivex.plugins.a.P(new FlowableOnBackpressureDrop(this, gVar));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.g(jh.g.E0)
    public final j<T> y5(long j10, TimeUnit timeUnit, boolean z10) {
        return x5(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> y6(@jh.e kh.o<? super T, ? extends o0<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new FlowableSwitchMapSingle(this, oVar, false));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.g("none")
    public final j<io.reactivex.schedulers.d<T>> y7(TimeUnit timeUnit) {
        return z7(timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.g("none")
    public final void z(kh.g<? super T> gVar, int i10) {
        io.reactivex.internal.operators.flowable.h.c(this, gVar, Functions.f119561f, Functions.f119558c, i10);
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<T> z1(kh.o<? super T, ? extends org.reactivestreams.c<U>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "debounceIndicator is null");
        return io.reactivex.plugins.a.P(new FlowableDebounce(this, oVar));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> z2(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, kh.o<Throwable, ? extends org.reactivestreams.c<? extends R>> oVar2, Callable<? extends org.reactivestreams.c<? extends R>> callable, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "onNextMapper is null");
        io.reactivex.internal.functions.a.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.a.g(callable, "onCompleteSupplier is null");
        return Q3(new FlowableMapNotification(this, oVar, oVar2, callable), i10);
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.g("none")
    public final j<T> z4() {
        return io.reactivex.plugins.a.P(new FlowableOnBackpressureLatest(this));
    }

    @jh.a(BackpressureKind.ERROR)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <U> j<T> z5(org.reactivestreams.c<U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "sampler is null");
        return io.reactivex.plugins.a.P(new FlowableSamplePublisher(this, cVar, false));
    }

    @jh.a(BackpressureKind.UNBOUNDED_IN)
    @jh.c
    @jh.e
    @jh.g("none")
    public final <R> j<R> z6(@jh.e kh.o<? super T, ? extends o0<? extends R>> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new FlowableSwitchMapSingle(this, oVar, true));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @jh.c
    @jh.e
    @jh.g("none")
    public final j<io.reactivex.schedulers.d<T>> z7(TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return (j<io.reactivex.schedulers.d<T>>) K3(Functions.w(timeUnit, h0Var));
    }
}

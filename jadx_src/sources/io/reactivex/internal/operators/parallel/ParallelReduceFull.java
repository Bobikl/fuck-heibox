package io.reactivex.internal.operators.parallel;

import androidx.compose.animation.core.s0;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ParallelReduceFull<T> extends j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.parallel.a<? extends T> f123224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<T, T, T> f123225d;

    public static final class ParallelReduceFullInnerSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements o<T> {
        private static final long serialVersionUID = -7954444275102466525L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ParallelReduceFullMainSubscriber<T> f123226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<T, T, T> f123227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f123228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123229e;

        ParallelReduceFullInnerSubscriber(ParallelReduceFullMainSubscriber<T> parallelReduceFullMainSubscriber, kh.c<T, T, T> cVar) {
            this.f123226b = parallelReduceFullMainSubscriber;
            this.f123227c = cVar;
        }

        void a() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123229e) {
                return;
            }
            this.f123229e = true;
            this.f123226b.n(this.f123228d);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123229e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123229e = true;
                this.f123226b.a(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123229e) {
                return;
            }
            T t11 = this.f123228d;
            if (t11 == null) {
                this.f123228d = t10;
                return;
            }
            try {
                this.f123228d = (T) io.reactivex.internal.functions.a.g(this.f123227c.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                get().cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public static final class ParallelReduceFullMainSubscriber<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = -5370107872170712765L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final ParallelReduceFullInnerSubscriber<T>[] f123230l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final kh.c<T, T, T> f123231m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AtomicReference<SlotPair<T>> f123232n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final AtomicInteger f123233o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final AtomicReference<Throwable> f123234p;

        ParallelReduceFullMainSubscriber(org.reactivestreams.d<? super T> dVar, int i10, kh.c<T, T, T> cVar) {
            super(dVar);
            this.f123232n = new AtomicReference<>();
            this.f123233o = new AtomicInteger();
            this.f123234p = new AtomicReference<>();
            ParallelReduceFullInnerSubscriber<T>[] parallelReduceFullInnerSubscriberArr = new ParallelReduceFullInnerSubscriber[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                parallelReduceFullInnerSubscriberArr[i11] = new ParallelReduceFullInnerSubscriber<>(this, cVar);
            }
            this.f123230l = parallelReduceFullInnerSubscriberArr;
            this.f123231m = cVar;
            this.f123233o.lazySet(i10);
        }

        void a(Throwable th2) {
            if (s0.a(this.f123234p, null, th2)) {
                cancel();
                this.f123845b.onError(th2);
            } else if (th2 != this.f123234p.get()) {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            for (ParallelReduceFullInnerSubscriber<T> parallelReduceFullInnerSubscriber : this.f123230l) {
                parallelReduceFullInnerSubscriber.a();
            }
        }

        SlotPair<T> k(T t10) {
            SlotPair<T> slotPair;
            int iB;
            while (true) {
                slotPair = this.f123232n.get();
                if (slotPair == null) {
                    slotPair = new SlotPair<>();
                    if (!s0.a(this.f123232n, null, slotPair)) {
                        continue;
                    }
                }
                iB = slotPair.b();
                if (iB >= 0) {
                    break;
                }
                s0.a(this.f123232n, slotPair, null);
            }
            if (iB == 0) {
                slotPair.f123235b = t10;
            } else {
                slotPair.f123236c = t10;
            }
            if (!slotPair.a()) {
                return null;
            }
            s0.a(this.f123232n, slotPair, null);
            return slotPair;
        }

        void n(T t10) {
            if (t10 != null) {
                while (true) {
                    SlotPair<T> slotPairK = k(t10);
                    if (slotPairK == null) {
                        break;
                    }
                    try {
                        t10 = (T) io.reactivex.internal.functions.a.g(this.f123231m.apply(slotPairK.f123235b, slotPairK.f123236c), "The reducer returned a null value");
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        a(th2);
                        return;
                    }
                }
            }
            if (this.f123233o.decrementAndGet() == 0) {
                SlotPair<T> slotPair = this.f123232n.get();
                this.f123232n.lazySet(null);
                if (slotPair != null) {
                    c(slotPair.f123235b);
                } else {
                    this.f123845b.onComplete();
                }
            }
        }
    }

    public static final class SlotPair<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        T f123235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f123236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f123237d = new AtomicInteger();

        SlotPair() {
        }

        boolean a() {
            return this.f123237d.incrementAndGet() == 2;
        }

        int b() {
            int i10;
            do {
                i10 = get();
                if (i10 >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i10, i10 + 1));
            return i10;
        }
    }

    public ParallelReduceFull(io.reactivex.parallel.a<? extends T> aVar, kh.c<T, T, T> cVar) {
        this.f123224c = aVar;
        this.f123225d = cVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        ParallelReduceFullMainSubscriber parallelReduceFullMainSubscriber = new ParallelReduceFullMainSubscriber(dVar, this.f123224c.F(), this.f123225d);
        dVar.onSubscribe(parallelReduceFullMainSubscriber);
        this.f123224c.Q(parallelReduceFullMainSubscriber.f123230l);
    }
}

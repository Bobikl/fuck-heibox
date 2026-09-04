package io.reactivex.internal.operators.parallel;

import androidx.compose.animation.core.s0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.o;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ParallelSortedJoin<T> extends j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.parallel.a<List<T>> f123256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Comparator<? super T> f123257d;

    public static final class SortedJoinInnerSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements o<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SortedJoinSubscription<T> f123258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f123259c;

        SortedJoinInnerSubscriber(SortedJoinSubscription<T> sortedJoinSubscription, int i10) {
            this.f123258b = sortedJoinSubscription;
            this.f123259c = i10;
        }

        void a() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(List<T> list) {
            this.f123258b.d(list, this.f123259c);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123258b.c(th2);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public static final class SortedJoinSubscription<T> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = 3481980673745556697L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f123260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SortedJoinInnerSubscriber<T>[] f123261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<T>[] f123262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int[] f123263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Comparator<? super T> f123264f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f123266h;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicLong f123265g = new AtomicLong();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicInteger f123267i = new AtomicInteger();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<Throwable> f123268j = new AtomicReference<>();

        SortedJoinSubscription(org.reactivestreams.d<? super T> dVar, int i10, Comparator<? super T> comparator) {
            this.f123260b = dVar;
            this.f123264f = comparator;
            SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new SortedJoinInnerSubscriber[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                sortedJoinInnerSubscriberArr[i11] = new SortedJoinInnerSubscriber<>(this, i11);
            }
            this.f123261c = sortedJoinInnerSubscriberArr;
            this.f123262d = new List[i10];
            this.f123263e = new int[i10];
            this.f123267i.lazySet(i10);
        }

        void a() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.f123261c) {
                sortedJoinInnerSubscriber.a();
            }
        }

        void b() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = this.f123260b;
            List<T>[] listArr = this.f123262d;
            int[] iArr = this.f123263e;
            int length = iArr.length;
            int i10 = 1;
            while (true) {
                long j10 = this.f123265g.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f123266h) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th2 = this.f123268j.get();
                    if (th2 != null) {
                        a();
                        Arrays.fill(listArr, (Object) null);
                        dVar.onError(th2);
                        return;
                    }
                    int i11 = -1;
                    T t10 = null;
                    for (int i12 = 0; i12 < length; i12++) {
                        List<T> list = listArr[i12];
                        int i13 = iArr[i12];
                        if (list.size() != i13) {
                            if (t10 == null) {
                                t10 = list.get(i13);
                            } else {
                                T t11 = list.get(i13);
                                try {
                                    if (this.f123264f.compare(t10, t11) > 0) {
                                        t10 = t11;
                                    }
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.a.b(th3);
                                    a();
                                    Arrays.fill(listArr, (Object) null);
                                    if (!s0.a(this.f123268j, null, th3)) {
                                        io.reactivex.plugins.a.Y(th3);
                                    }
                                    dVar.onError(this.f123268j.get());
                                    return;
                                }
                            }
                            i11 = i12;
                        }
                    }
                    if (t10 == null) {
                        Arrays.fill(listArr, (Object) null);
                        dVar.onComplete();
                        return;
                    } else {
                        dVar.onNext(t10);
                        iArr[i11] = iArr[i11] + 1;
                        j11++;
                    }
                }
                if (j11 == j10) {
                    if (this.f123266h) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th4 = this.f123268j.get();
                    if (th4 != null) {
                        a();
                        Arrays.fill(listArr, (Object) null);
                        dVar.onError(th4);
                        return;
                    }
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            z10 = true;
                            break;
                        } else {
                            if (iArr[i14] != listArr[i14].size()) {
                                z10 = false;
                                break;
                            }
                            i14++;
                        }
                    }
                    if (z10) {
                        Arrays.fill(listArr, (Object) null);
                        dVar.onComplete();
                        return;
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f123265g.addAndGet(-j11);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i10 && (iAddAndGet = addAndGet(-i10)) == 0) {
                    return;
                } else {
                    i10 = iAddAndGet;
                }
            }
        }

        void c(Throwable th2) {
            if (s0.a(this.f123268j, null, th2)) {
                b();
            } else if (th2 != this.f123268j.get()) {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f123266h) {
                return;
            }
            this.f123266h = true;
            a();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.f123262d, (Object) null);
            }
        }

        void d(List<T> list, int i10) {
            this.f123262d[i10] = list;
            if (this.f123267i.decrementAndGet() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f123265g, j10);
                if (this.f123267i.get() == 0) {
                    b();
                }
            }
        }
    }

    public ParallelSortedJoin(io.reactivex.parallel.a<List<T>> aVar, Comparator<? super T> comparator) {
        this.f123256c = aVar;
        this.f123257d = comparator;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        SortedJoinSubscription sortedJoinSubscription = new SortedJoinSubscription(dVar, this.f123256c.F(), this.f123257d);
        dVar.onSubscribe(sortedJoinSubscription);
        this.f123256c.Q(sortedJoinSubscription.f123261c);
    }
}

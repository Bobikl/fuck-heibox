package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowablePublishMulticast<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super io.reactivex.j<T>, ? extends org.reactivestreams.c<? extends R>> f120526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f120528f;

    public static final class MulticastSubscription<T> extends AtomicLong implements org.reactivestreams.e {
        private static final long serialVersionUID = 8664815189257569791L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<T> f120530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f120531d;

        MulticastSubscription(org.reactivestreams.d<? super T> dVar, a<T> aVar) {
            this.f120529b = dVar;
            this.f120530c = aVar;
        }

        public boolean a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f120530c.Q8(this);
                this.f120530c.O8();
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.b(this, j10);
                this.f120530c.O8();
            }
        }
    }

    public static final class a<T> extends io.reactivex.j<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final MulticastSubscription[] f120532n = new MulticastSubscription[0];

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final MulticastSubscription[] f120533o = new MulticastSubscription[0];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f120537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f120538g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile lh.o<T> f120540i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f120541j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f120542k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Throwable f120543l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f120544m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f120534c = new AtomicInteger();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120539h = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<MulticastSubscription<T>[]> f120535d = new AtomicReference<>(f120532n);

        a(int i10, boolean z10) {
            this.f120536e = i10;
            this.f120537f = i10 - (i10 >> 2);
            this.f120538g = z10;
        }

        boolean M8(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription<T>[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.f120535d.get();
                if (multicastSubscriptionArr == f120533o) {
                    return false;
                }
                int length = multicastSubscriptionArr.length;
                multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
            } while (!androidx.compose.animation.core.s0.a(this.f120535d, multicastSubscriptionArr, multicastSubscriptionArr2));
            return true;
        }

        void N8() {
            for (MulticastSubscription<T> multicastSubscription : this.f120535d.getAndSet(f120533o)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.f120529b.onComplete();
                }
            }
        }

        void O8() {
            AtomicReference<MulticastSubscription<T>[]> atomicReference;
            Throwable th2;
            Throwable th3;
            if (this.f120534c.getAndIncrement() != 0) {
                return;
            }
            lh.o<T> oVar = this.f120540i;
            int i10 = this.f120544m;
            int i11 = this.f120537f;
            boolean z10 = this.f120541j != 1;
            AtomicReference<MulticastSubscription<T>[]> atomicReference2 = this.f120535d;
            MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = multicastSubscriptionArr.length;
                if (oVar == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = multicastSubscriptionArr.length;
                    long j10 = Long.MAX_VALUE;
                    long j11 = Long.MAX_VALUE;
                    int i12 = 0;
                    while (i12 < length2) {
                        MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i12];
                        AtomicReference<MulticastSubscription<T>[]> atomicReference3 = atomicReference2;
                        long j12 = multicastSubscription.get() - multicastSubscription.f120531d;
                        if (j12 == Long.MIN_VALUE) {
                            length--;
                        } else if (j11 > j12) {
                            j11 = j12;
                        }
                        i12++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j13 = 0;
                    if (length == 0) {
                        j11 = 0;
                    }
                    while (true) {
                        if (j11 != j13) {
                            if (isDisposed()) {
                                oVar.clear();
                                return;
                            }
                            boolean z11 = this.f120542k;
                            if (z11 && !this.f120538g && (th3 = this.f120543l) != null) {
                                P8(th3);
                                return;
                            }
                            try {
                                T tPoll = oVar.poll();
                                boolean z12 = tPoll == null;
                                if (z11 && z12) {
                                    Throwable th4 = this.f120543l;
                                    if (th4 != null) {
                                        P8(th4);
                                        return;
                                    } else {
                                        N8();
                                        return;
                                    }
                                }
                                if (!z12) {
                                    int length3 = multicastSubscriptionArr.length;
                                    int i13 = 0;
                                    boolean z13 = false;
                                    while (i13 < length3) {
                                        MulticastSubscription<T> multicastSubscription2 = multicastSubscriptionArr[i13];
                                        long j14 = multicastSubscription2.get();
                                        if (j14 != Long.MIN_VALUE) {
                                            if (j14 != j10) {
                                                multicastSubscription2.f120531d++;
                                            }
                                            multicastSubscription2.f120529b.onNext(tPoll);
                                        } else {
                                            z13 = true;
                                        }
                                        i13++;
                                        j10 = Long.MAX_VALUE;
                                    }
                                    j11--;
                                    if (z10 && (i10 = i10 + 1) == i11) {
                                        this.f120539h.get().request(i11);
                                        i10 = 0;
                                    }
                                    MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                                    if (z13 || multicastSubscriptionArr2 != multicastSubscriptionArr) {
                                        multicastSubscriptionArr = multicastSubscriptionArr2;
                                    } else {
                                        j13 = 0;
                                        j10 = Long.MAX_VALUE;
                                    }
                                }
                                atomicReference2 = atomicReference;
                            } catch (Throwable th5) {
                                io.reactivex.exceptions.a.b(th5);
                                SubscriptionHelper.cancel(this.f120539h);
                                P8(th5);
                                return;
                            }
                        }
                        if (j11 == j13) {
                            if (isDisposed()) {
                                oVar.clear();
                                return;
                            }
                            boolean z14 = this.f120542k;
                            if (z14 && !this.f120538g && (th2 = this.f120543l) != null) {
                                P8(th2);
                                return;
                            }
                            if (z14 && oVar.isEmpty()) {
                                Throwable th6 = this.f120543l;
                                if (th6 != null) {
                                    P8(th6);
                                    return;
                                } else {
                                    N8();
                                    return;
                                }
                            }
                        }
                    }
                }
                this.f120544m = i10;
                iAddAndGet = this.f120534c.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (oVar == null) {
                    oVar = this.f120540i;
                }
                multicastSubscriptionArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        void P8(Throwable th2) {
            for (MulticastSubscription<T> multicastSubscription : this.f120535d.getAndSet(f120533o)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.f120529b.onError(th2);
                }
            }
        }

        void Q8(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription<T>[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.f120535d.get();
                int length = multicastSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (multicastSubscriptionArr[i11] == multicastSubscription) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    multicastSubscriptionArr2 = f120532n;
                } else {
                    MulticastSubscription[] multicastSubscriptionArr3 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i10);
                    System.arraycopy(multicastSubscriptionArr, i10 + 1, multicastSubscriptionArr3, i10, (length - i10) - 1);
                    multicastSubscriptionArr2 = multicastSubscriptionArr3;
                }
            } while (!androidx.compose.animation.core.s0.a(this.f120535d, multicastSubscriptionArr, multicastSubscriptionArr2));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            lh.o<T> oVar;
            SubscriptionHelper.cancel(this.f120539h);
            if (this.f120534c.getAndIncrement() != 0 || (oVar = this.f120540i) == null) {
                return;
            }
            oVar.clear();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f120539h.get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.j
        protected void k6(org.reactivestreams.d<? super T> dVar) {
            MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(dVar, this);
            dVar.onSubscribe(multicastSubscription);
            if (M8(multicastSubscription)) {
                if (multicastSubscription.a()) {
                    Q8(multicastSubscription);
                    return;
                } else {
                    O8();
                    return;
                }
            }
            Throwable th2 = this.f120543l;
            if (th2 != null) {
                dVar.onError(th2);
            } else {
                dVar.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120542k) {
                return;
            }
            this.f120542k = true;
            O8();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120542k) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120543l = th2;
            this.f120542k = true;
            O8();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120542k) {
                return;
            }
            if (this.f120541j != 0 || this.f120540i.offer(t10)) {
                O8();
            } else {
                this.f120539h.get().cancel();
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this.f120539h, eVar)) {
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f120541j = iRequestFusion;
                        this.f120540i = lVar;
                        this.f120542k = true;
                        O8();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f120541j = iRequestFusion;
                        this.f120540i = lVar;
                        io.reactivex.internal.util.n.j(eVar, this.f120536e);
                        return;
                    }
                }
                this.f120540i = io.reactivex.internal.util.n.c(this.f120536e);
                io.reactivex.internal.util.n.j(eVar, this.f120536e);
            }
        }
    }

    public static final class b<R> implements io.reactivex.o<R>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<?> f120546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f120547d;

        b(org.reactivestreams.d<? super R> dVar, a<?> aVar) {
            this.f120545b = dVar;
            this.f120546c = aVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120547d.cancel();
            this.f120546c.dispose();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120545b.onComplete();
            this.f120546c.dispose();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120545b.onError(th2);
            this.f120546c.dispose();
        }

        @Override // org.reactivestreams.d
        public void onNext(R r10) {
            this.f120545b.onNext(r10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120547d, eVar)) {
                this.f120547d = eVar;
                this.f120545b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120547d.request(j10);
        }
    }

    public FlowablePublishMulticast(io.reactivex.j<T> jVar, kh.o<? super io.reactivex.j<T>, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, boolean z10) {
        super(jVar);
        this.f120526d = oVar;
        this.f120527e = i10;
        this.f120528f = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        a aVar = new a(this.f120527e, this.f120528f);
        try {
            ((org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120526d.apply(aVar), "selector returned a null Publisher")).g(new b(dVar, aVar));
            this.f121039c.j6(aVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}

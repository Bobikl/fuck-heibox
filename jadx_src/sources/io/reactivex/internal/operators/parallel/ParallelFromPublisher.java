package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import lh.l;

/* JADX INFO: loaded from: classes5.dex */
public final class ParallelFromPublisher<T> extends io.reactivex.parallel.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f123184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f123185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f123186c;

    public static final class ParallelDispatcher<T> extends AtomicInteger implements o<T> {
        private static final long serialVersionUID = -4470634016609963609L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T>[] f123187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLongArray f123188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long[] f123189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f123190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f123191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.e f123192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        lh.o<T> f123193h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Throwable f123194i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f123195j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f123196k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f123197l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final AtomicInteger f123198m = new AtomicInteger();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123199n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f123200o;

        public final class a implements org.reactivestreams.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final int f123201b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final int f123202c;

            a(int i10, int i11) {
                this.f123201b = i10;
                this.f123202c = i11;
            }

            @Override // org.reactivestreams.e
            public void cancel() {
                if (ParallelDispatcher.this.f123188c.compareAndSet(this.f123201b + this.f123202c, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i10 = this.f123202c;
                    parallelDispatcher.a(i10 + i10);
                }
            }

            @Override // org.reactivestreams.e
            public void request(long j10) {
                long j11;
                if (SubscriptionHelper.validate(j10)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.f123188c;
                    do {
                        j11 = atomicLongArray.get(this.f123201b);
                        if (j11 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f123201b, j11, io.reactivex.internal.util.b.c(j11, j10)));
                    if (ParallelDispatcher.this.f123198m.get() == this.f123202c) {
                        ParallelDispatcher.this.b();
                    }
                }
            }
        }

        ParallelDispatcher(org.reactivestreams.d<? super T>[] dVarArr, int i10) {
            this.f123187b = dVarArr;
            this.f123190e = i10;
            this.f123191f = i10 - (i10 >> 2);
            int length = dVarArr.length;
            int i11 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i11 + 1);
            this.f123188c = atomicLongArray;
            atomicLongArray.lazySet(i11, length);
            this.f123189d = new long[length];
        }

        void a(int i10) {
            if (this.f123188c.decrementAndGet(i10) == 0) {
                this.f123197l = true;
                this.f123192g.cancel();
                if (getAndIncrement() == 0) {
                    this.f123193h.clear();
                }
            }
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f123200o == 1) {
                d();
            } else {
                c();
            }
        }

        void c() {
            Throwable th2;
            lh.o<T> oVar = this.f123193h;
            org.reactivestreams.d<? super T>[] dVarArr = this.f123187b;
            AtomicLongArray atomicLongArray = this.f123188c;
            long[] jArr = this.f123189d;
            int length = jArr.length;
            int i10 = this.f123196k;
            int i11 = this.f123199n;
            int iAddAndGet = 1;
            while (true) {
                int i12 = 0;
                int i13 = 0;
                do {
                    if (this.f123197l) {
                        oVar.clear();
                        return;
                    }
                    boolean z10 = this.f123195j;
                    if (z10 && (th2 = this.f123194i) != null) {
                        oVar.clear();
                        int length2 = dVarArr.length;
                        while (i12 < length2) {
                            dVarArr[i12].onError(th2);
                            i12++;
                        }
                        return;
                    }
                    boolean zIsEmpty = oVar.isEmpty();
                    if (z10 && zIsEmpty) {
                        int length3 = dVarArr.length;
                        while (i12 < length3) {
                            dVarArr[i12].onComplete();
                            i12++;
                        }
                        return;
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    long j10 = atomicLongArray.get(i10);
                    long j11 = jArr[i10];
                    if (j10 == j11 || atomicLongArray.get(length + i10) != 0) {
                        i13++;
                    } else {
                        try {
                            T tPoll = oVar.poll();
                            if (tPoll == null) {
                                break;
                            }
                            dVarArr[i10].onNext(tPoll);
                            jArr[i10] = j11 + 1;
                            i11++;
                            if (i11 == this.f123191f) {
                                this.f123192g.request(i11);
                                i11 = 0;
                            }
                            i13 = 0;
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            this.f123192g.cancel();
                            int length4 = dVarArr.length;
                            while (i12 < length4) {
                                dVarArr[i12].onError(th3);
                                i12++;
                            }
                            return;
                        }
                    }
                    i10++;
                    if (i10 == length) {
                        i10 = 0;
                    }
                } while (i13 != length);
                int i14 = get();
                if (i14 == iAddAndGet) {
                    this.f123196k = i10;
                    this.f123199n = i11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i14;
                }
            }
        }

        void d() {
            lh.o<T> oVar = this.f123193h;
            org.reactivestreams.d<? super T>[] dVarArr = this.f123187b;
            AtomicLongArray atomicLongArray = this.f123188c;
            long[] jArr = this.f123189d;
            int length = jArr.length;
            int i10 = this.f123196k;
            int iAddAndGet = 1;
            while (true) {
                int i11 = 0;
                int i12 = 0;
                do {
                    if (this.f123197l) {
                        oVar.clear();
                        return;
                    }
                    if (oVar.isEmpty()) {
                        int length2 = dVarArr.length;
                        while (i11 < length2) {
                            dVarArr[i11].onComplete();
                            i11++;
                        }
                        return;
                    }
                    long j10 = atomicLongArray.get(i10);
                    long j11 = jArr[i10];
                    if (j10 == j11 || atomicLongArray.get(length + i10) != 0) {
                        i12++;
                    } else {
                        try {
                            T tPoll = oVar.poll();
                            if (tPoll == null) {
                                int length3 = dVarArr.length;
                                while (i11 < length3) {
                                    dVarArr[i11].onComplete();
                                    i11++;
                                }
                                return;
                            }
                            dVarArr[i10].onNext(tPoll);
                            jArr[i10] = j11 + 1;
                            i12 = 0;
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            this.f123192g.cancel();
                            int length4 = dVarArr.length;
                            while (i11 < length4) {
                                dVarArr[i11].onError(th2);
                                i11++;
                            }
                            return;
                        }
                    }
                    i10++;
                    if (i10 == length) {
                        i10 = 0;
                    }
                } while (i12 != length);
                int i13 = get();
                if (i13 == iAddAndGet) {
                    this.f123196k = i10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i13;
                }
            }
        }

        void e() {
            org.reactivestreams.d<? super T>[] dVarArr = this.f123187b;
            int length = dVarArr.length;
            int i10 = 0;
            while (i10 < length && !this.f123197l) {
                int i11 = i10 + 1;
                this.f123198m.lazySet(i11);
                dVarArr[i10].onSubscribe(new a(i10, length));
                i10 = i11;
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f123195j = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123194i = th2;
            this.f123195j = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123200o != 0 || this.f123193h.offer(t10)) {
                b();
            } else {
                this.f123192g.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123192g, eVar)) {
                this.f123192g = eVar;
                if (eVar instanceof l) {
                    l lVar = (l) eVar;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f123200o = iRequestFusion;
                        this.f123193h = lVar;
                        this.f123195j = true;
                        e();
                        b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f123200o = iRequestFusion;
                        this.f123193h = lVar;
                        e();
                        eVar.request(this.f123190e);
                        return;
                    }
                }
                this.f123193h = new SpscArrayQueue(this.f123190e);
                e();
                eVar.request(this.f123190e);
            }
        }
    }

    public ParallelFromPublisher(org.reactivestreams.c<? extends T> cVar, int i10, int i11) {
        this.f123184a = cVar;
        this.f123185b = i10;
        this.f123186c = i11;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123185b;
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super T>[] dVarArr) {
        if (U(dVarArr)) {
            this.f123184a.g(new ParallelDispatcher(dVarArr, this.f123186c));
        }
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMergeWithMaybe<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.w<? extends T> f120398d;

    public static final class MergeWithObserver<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final int f120399p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final int f120400q = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120402c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final OtherObserver<T> f120403d = new OtherObserver<>(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f120404e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f120405f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f120406g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f120407h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile lh.n<T> f120408i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        T f120409j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f120410k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f120411l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile int f120412m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f120413n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f120414o;

        public static final class OtherObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final MergeWithObserver<T> f120415b;

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f120415b = mergeWithObserver;
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f120415b.d();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f120415b.e(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(T t10) {
                this.f120415b.f(t10);
            }
        }

        MergeWithObserver(org.reactivestreams.d<? super T> dVar) {
            this.f120401b = dVar;
            int iY = io.reactivex.j.Y();
            this.f120406g = iY;
            this.f120407h = iY - (iY >> 2);
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            org.reactivestreams.d<? super T> dVar = this.f120401b;
            long j10 = this.f120413n;
            int i10 = this.f120414o;
            int i11 = this.f120407h;
            int i12 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f120405f.get();
                while (j10 != j11) {
                    if (this.f120410k) {
                        this.f120409j = null;
                        this.f120408i = null;
                        return;
                    }
                    if (this.f120404e.get() != null) {
                        this.f120409j = null;
                        this.f120408i = null;
                        dVar.onError(this.f120404e.c());
                        return;
                    }
                    int i13 = this.f120412m;
                    if (i13 == i12) {
                        T t10 = this.f120409j;
                        this.f120409j = null;
                        this.f120412m = 2;
                        dVar.onNext(t10);
                        j10++;
                    } else {
                        boolean z10 = this.f120411l;
                        lh.n<T> nVar = this.f120408i;
                        a.a.a.a.d.p.d.c.d dVarPoll = nVar != null ? nVar.poll() : null;
                        boolean z11 = dVarPoll == null;
                        if (z10 && z11 && i13 == 2) {
                            this.f120408i = null;
                            dVar.onComplete();
                            return;
                        } else {
                            if (z11) {
                                break;
                            }
                            dVar.onNext(dVarPoll);
                            j10++;
                            i10++;
                            if (i10 == i11) {
                                this.f120402c.get().request(i11);
                                i10 = 0;
                            }
                            i12 = 1;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.f120410k) {
                        this.f120409j = null;
                        this.f120408i = null;
                        return;
                    }
                    if (this.f120404e.get() != null) {
                        this.f120409j = null;
                        this.f120408i = null;
                        dVar.onError(this.f120404e.c());
                        return;
                    }
                    boolean z12 = this.f120411l;
                    lh.n<T> nVar2 = this.f120408i;
                    boolean z13 = nVar2 == null || nVar2.isEmpty();
                    if (z12 && z13 && this.f120412m == 2) {
                        this.f120408i = null;
                        dVar.onComplete();
                        return;
                    }
                }
                this.f120413n = j10;
                this.f120414o = i10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i12 = 1;
                }
            }
        }

        lh.n<T> c() {
            lh.n<T> nVar = this.f120408i;
            if (nVar != null) {
                return nVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(io.reactivex.j.Y());
            this.f120408i = spscArrayQueue;
            return spscArrayQueue;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120410k = true;
            SubscriptionHelper.cancel(this.f120402c);
            DisposableHelper.dispose(this.f120403d);
            if (getAndIncrement() == 0) {
                this.f120408i = null;
                this.f120409j = null;
            }
        }

        void d() {
            this.f120412m = 2;
            a();
        }

        void e(Throwable th2) {
            if (!this.f120404e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                SubscriptionHelper.cancel(this.f120402c);
                a();
            }
        }

        void f(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.f120413n;
                if (this.f120405f.get() != j10) {
                    this.f120413n = j10 + 1;
                    this.f120401b.onNext(t10);
                    this.f120412m = 2;
                } else {
                    this.f120409j = t10;
                    this.f120412m = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f120409j = t10;
                this.f120412m = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120411l = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f120404e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                SubscriptionHelper.cancel(this.f120402c);
                a();
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.f120413n;
                if (this.f120405f.get() != j10) {
                    lh.n<T> nVar = this.f120408i;
                    if (nVar == null || nVar.isEmpty()) {
                        this.f120413n = j10 + 1;
                        this.f120401b.onNext(t10);
                        int i10 = this.f120414o + 1;
                        if (i10 == this.f120407h) {
                            this.f120414o = 0;
                            this.f120402c.get().request(i10);
                        } else {
                            this.f120414o = i10;
                        }
                    } else {
                        nVar.offer(t10);
                    }
                } else {
                    c().offer(t10);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                c().offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this.f120402c, eVar, this.f120406g);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            io.reactivex.internal.util.b.a(this.f120405f, j10);
            a();
        }
    }

    public FlowableMergeWithMaybe(io.reactivex.j<T> jVar, io.reactivex.w<? extends T> wVar) {
        super(jVar);
        this.f120398d = wVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(dVar);
        dVar.onSubscribe(mergeWithObserver);
        this.f121039c.j6(mergeWithObserver);
        this.f120398d.f(mergeWithObserver.f120403d);
    }
}

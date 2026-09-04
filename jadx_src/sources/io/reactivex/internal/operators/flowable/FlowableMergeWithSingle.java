package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMergeWithSingle<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.o0<? extends T> f120416d;

    public static final class MergeWithObserver<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final int f120417p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final int f120418q = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120420c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final OtherObserver<T> f120421d = new OtherObserver<>(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f120422e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f120423f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f120424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f120425h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile lh.n<T> f120426i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        T f120427j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f120428k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f120429l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile int f120430m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f120431n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f120432o;

        public static final class OtherObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.l0<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final MergeWithObserver<T> f120433b;

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f120433b = mergeWithObserver;
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                this.f120433b.d(th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(T t10) {
                this.f120433b.e(t10);
            }
        }

        MergeWithObserver(org.reactivestreams.d<? super T> dVar) {
            this.f120419b = dVar;
            int iY = io.reactivex.j.Y();
            this.f120424g = iY;
            this.f120425h = iY - (iY >> 2);
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            org.reactivestreams.d<? super T> dVar = this.f120419b;
            long j10 = this.f120431n;
            int i10 = this.f120432o;
            int i11 = this.f120425h;
            int i12 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f120423f.get();
                while (j10 != j11) {
                    if (this.f120428k) {
                        this.f120427j = null;
                        this.f120426i = null;
                        return;
                    }
                    if (this.f120422e.get() != null) {
                        this.f120427j = null;
                        this.f120426i = null;
                        dVar.onError(this.f120422e.c());
                        return;
                    }
                    int i13 = this.f120430m;
                    if (i13 == i12) {
                        T t10 = this.f120427j;
                        this.f120427j = null;
                        this.f120430m = 2;
                        dVar.onNext(t10);
                        j10++;
                    } else {
                        boolean z10 = this.f120429l;
                        lh.n<T> nVar = this.f120426i;
                        a.a.a.a.d.p.d.c.d dVarPoll = nVar != null ? nVar.poll() : null;
                        boolean z11 = dVarPoll == null;
                        if (z10 && z11 && i13 == 2) {
                            this.f120426i = null;
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
                                this.f120420c.get().request(i11);
                                i10 = 0;
                            }
                            i12 = 1;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.f120428k) {
                        this.f120427j = null;
                        this.f120426i = null;
                        return;
                    }
                    if (this.f120422e.get() != null) {
                        this.f120427j = null;
                        this.f120426i = null;
                        dVar.onError(this.f120422e.c());
                        return;
                    }
                    boolean z12 = this.f120429l;
                    lh.n<T> nVar2 = this.f120426i;
                    boolean z13 = nVar2 == null || nVar2.isEmpty();
                    if (z12 && z13 && this.f120430m == 2) {
                        this.f120426i = null;
                        dVar.onComplete();
                        return;
                    }
                }
                this.f120431n = j10;
                this.f120432o = i10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i12 = 1;
                }
            }
        }

        lh.n<T> c() {
            lh.n<T> nVar = this.f120426i;
            if (nVar != null) {
                return nVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(io.reactivex.j.Y());
            this.f120426i = spscArrayQueue;
            return spscArrayQueue;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120428k = true;
            SubscriptionHelper.cancel(this.f120420c);
            DisposableHelper.dispose(this.f120421d);
            if (getAndIncrement() == 0) {
                this.f120426i = null;
                this.f120427j = null;
            }
        }

        void d(Throwable th2) {
            if (!this.f120422e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                SubscriptionHelper.cancel(this.f120420c);
                a();
            }
        }

        void e(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.f120431n;
                if (this.f120423f.get() != j10) {
                    this.f120431n = j10 + 1;
                    this.f120419b.onNext(t10);
                    this.f120430m = 2;
                } else {
                    this.f120427j = t10;
                    this.f120430m = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f120427j = t10;
                this.f120430m = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120429l = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f120422e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                SubscriptionHelper.cancel(this.f120420c);
                a();
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.f120431n;
                if (this.f120423f.get() != j10) {
                    lh.n<T> nVar = this.f120426i;
                    if (nVar == null || nVar.isEmpty()) {
                        this.f120431n = j10 + 1;
                        this.f120419b.onNext(t10);
                        int i10 = this.f120432o + 1;
                        if (i10 == this.f120425h) {
                            this.f120432o = 0;
                            this.f120420c.get().request(i10);
                        } else {
                            this.f120432o = i10;
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
            SubscriptionHelper.setOnce(this.f120420c, eVar, this.f120424g);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            io.reactivex.internal.util.b.a(this.f120423f, j10);
            a();
        }
    }

    public FlowableMergeWithSingle(io.reactivex.j<T> jVar, io.reactivex.o0<? extends T> o0Var) {
        super(jVar);
        this.f120416d = o0Var;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(dVar);
        dVar.onSubscribe(mergeWithObserver);
        this.f121039c.j6(mergeWithObserver);
        this.f120416d.f(mergeWithObserver.f120421d);
    }
}

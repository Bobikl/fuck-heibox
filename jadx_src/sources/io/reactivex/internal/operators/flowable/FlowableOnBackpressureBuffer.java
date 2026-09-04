package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnBackpressureBuffer<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f120453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f120454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f120455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final kh.a f120456g;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final lh.n<T> f120458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f120459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.a f120460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.e f120461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f120462g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f120463h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Throwable f120464i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicLong f120465j = new AtomicLong();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f120466k;

        BackpressureBufferSubscriber(org.reactivestreams.d<? super T> dVar, int i10, boolean z10, boolean z11, kh.a aVar) {
            this.f120457b = dVar;
            this.f120460e = aVar;
            this.f120459d = z11;
            this.f120458c = z10 ? new io.reactivex.internal.queue.a<>(i10) : new SpscArrayQueue<>(i10);
        }

        void b() {
            if (getAndIncrement() == 0) {
                lh.n<T> nVar = this.f120458c;
                org.reactivestreams.d<? super T> dVar = this.f120457b;
                int iAddAndGet = 1;
                while (!c(this.f120463h, nVar.isEmpty(), dVar)) {
                    long j10 = this.f120465j.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z10 = this.f120463h;
                        T tPoll = nVar.poll();
                        boolean z11 = tPoll == null;
                        if (c(z10, z11, dVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        dVar.onNext(tPoll);
                        j11++;
                    }
                    if (j11 == j10 && c(this.f120463h, nVar.isEmpty(), dVar)) {
                        return;
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f120465j.addAndGet(-j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        boolean c(boolean z10, boolean z11, org.reactivestreams.d<? super T> dVar) {
            if (this.f120462g) {
                this.f120458c.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f120459d) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f120464i;
                if (th2 != null) {
                    dVar.onError(th2);
                } else {
                    dVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f120464i;
            if (th3 != null) {
                this.f120458c.clear();
                dVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            dVar.onComplete();
            return true;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120462g) {
                return;
            }
            this.f120462g = true;
            this.f120461f.cancel();
            if (getAndIncrement() == 0) {
                this.f120458c.clear();
            }
        }

        @Override // lh.o
        public void clear() {
            this.f120458c.clear();
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f120458c.isEmpty();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120463h = true;
            if (this.f120466k) {
                this.f120457b.onComplete();
            } else {
                b();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120464i = th2;
            this.f120463h = true;
            if (this.f120466k) {
                this.f120457b.onError(th2);
            } else {
                b();
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120458c.offer(t10)) {
                if (this.f120466k) {
                    this.f120457b.onNext(null);
                    return;
                } else {
                    b();
                    return;
                }
            }
            this.f120461f.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f120460e.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120461f, eVar)) {
                this.f120461f = eVar;
                this.f120457b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            return this.f120458c.poll();
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (this.f120466k || !SubscriptionHelper.validate(j10)) {
                return;
            }
            io.reactivex.internal.util.b.a(this.f120465j, j10);
            b();
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f120466k = true;
            return 2;
        }
    }

    public FlowableOnBackpressureBuffer(io.reactivex.j<T> jVar, int i10, boolean z10, boolean z11, kh.a aVar) {
        super(jVar);
        this.f120453d = i10;
        this.f120454e = z10;
        this.f120455f = z11;
        this.f120456g = aVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new BackpressureBufferSubscriber(dVar, this.f120453d, this.f120454e, this.f120455f, this.f120456g));
    }
}

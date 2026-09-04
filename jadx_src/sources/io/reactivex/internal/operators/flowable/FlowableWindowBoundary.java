package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWindowBoundary<T, B> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.j<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<B> f120959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120960e;

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Object f120961n = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super io.reactivex.j<T>> f120962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f120963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a<T, B> f120964d = new a<>(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120965e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f120966f = new AtomicInteger(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final MpscLinkedQueue<Object> f120967g = new MpscLinkedQueue<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicThrowable f120968h = new AtomicThrowable();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicBoolean f120969i = new AtomicBoolean();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicLong f120970j = new AtomicLong();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f120971k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        UnicastProcessor<T> f120972l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f120973m;

        WindowBoundaryMainSubscriber(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, int i10) {
            this.f120962b = dVar;
            this.f120963c = i10;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super io.reactivex.j<T>> dVar = this.f120962b;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f120967g;
            AtomicThrowable atomicThrowable = this.f120968h;
            long j10 = this.f120973m;
            int iAddAndGet = 1;
            while (this.f120966f.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.f120972l;
                boolean z10 = this.f120971k;
                if (z10 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thC = atomicThrowable.c();
                    if (unicastProcessor != null) {
                        this.f120972l = null;
                        unicastProcessor.onError(thC);
                    }
                    dVar.onError(thC);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thC2 = atomicThrowable.c();
                    if (thC2 == null) {
                        if (unicastProcessor != null) {
                            this.f120972l = null;
                            unicastProcessor.onComplete();
                        }
                        dVar.onComplete();
                        return;
                    }
                    if (unicastProcessor != null) {
                        this.f120972l = null;
                        unicastProcessor.onError(thC2);
                    }
                    dVar.onError(thC2);
                    return;
                }
                if (z11) {
                    this.f120973m = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f120961n) {
                    unicastProcessor.onNext((T) objPoll);
                } else {
                    if (unicastProcessor != null) {
                        this.f120972l = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.f120969i.get()) {
                        UnicastProcessor<T> unicastProcessorU8 = UnicastProcessor.U8(this.f120963c, this);
                        this.f120972l = unicastProcessorU8;
                        this.f120966f.getAndIncrement();
                        if (j10 != this.f120970j.get()) {
                            j10++;
                            dVar.onNext(unicastProcessorU8);
                        } else {
                            SubscriptionHelper.cancel(this.f120965e);
                            this.f120964d.dispose();
                            atomicThrowable.a(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.f120971k = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f120972l = null;
        }

        void b() {
            SubscriptionHelper.cancel(this.f120965e);
            this.f120971k = true;
            a();
        }

        void c(Throwable th2) {
            SubscriptionHelper.cancel(this.f120965e);
            if (!this.f120968h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120971k = true;
                a();
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120969i.compareAndSet(false, true)) {
                this.f120964d.dispose();
                if (this.f120966f.decrementAndGet() == 0) {
                    SubscriptionHelper.cancel(this.f120965e);
                }
            }
        }

        void d() {
            this.f120967g.offer(f120961n);
            a();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120964d.dispose();
            this.f120971k = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120964d.dispose();
            if (!this.f120968h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120971k = true;
                a();
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120967g.offer(t10);
            a();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this.f120965e, eVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            io.reactivex.internal.util.b.a(this.f120970j, j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f120966f.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.f120965e);
            }
        }
    }

    public static final class a<T, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowBoundaryMainSubscriber<T, B> f120974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f120975d;

        a(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.f120974c = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120975d) {
                return;
            }
            this.f120975d = true;
            this.f120974c.b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120975d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120975d = true;
                this.f120974c.c(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(B b10) {
            if (this.f120975d) {
                return;
            }
            this.f120974c.d();
        }
    }

    public FlowableWindowBoundary(io.reactivex.j<T> jVar, org.reactivestreams.c<B> cVar, int i10) {
        super(jVar);
        this.f120959d = cVar;
        this.f120960e = i10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super io.reactivex.j<T>> dVar) {
        WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = new WindowBoundaryMainSubscriber(dVar, this.f120960e);
        dVar.onSubscribe(windowBoundaryMainSubscriber);
        windowBoundaryMainSubscriber.d();
        this.f120959d.g(windowBoundaryMainSubscriber.f120964d);
        this.f121039c.j6(windowBoundaryMainSubscriber);
    }
}

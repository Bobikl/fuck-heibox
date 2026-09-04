package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.j<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<? extends org.reactivestreams.c<B>> f120976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120977e;

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final a<Object, Object> f120978o = new a<>(null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final Object f120979p = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super io.reactivex.j<T>> f120980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f120981c;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final Callable<? extends org.reactivestreams.c<B>> f120987i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        org.reactivestreams.e f120989k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f120990l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        UnicastProcessor<T> f120991m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f120992n;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<a<T, B>> f120982d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f120983e = new AtomicInteger(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final MpscLinkedQueue<Object> f120984f = new MpscLinkedQueue<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicThrowable f120985g = new AtomicThrowable();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicBoolean f120986h = new AtomicBoolean();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicLong f120988j = new AtomicLong();

        WindowBoundaryMainSubscriber(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, int i10, Callable<? extends org.reactivestreams.c<B>> callable) {
            this.f120980b = dVar;
            this.f120981c = i10;
            this.f120987i = callable;
        }

        void a() {
            AtomicReference<a<T, B>> atomicReference = this.f120982d;
            a<Object, Object> aVar = f120978o;
            a<T, B> andSet = atomicReference.getAndSet((a<T, B>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.dispose();
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super io.reactivex.j<T>> dVar = this.f120980b;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f120984f;
            AtomicThrowable atomicThrowable = this.f120985g;
            long j10 = this.f120992n;
            int iAddAndGet = 1;
            while (this.f120983e.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.f120991m;
                boolean z10 = this.f120990l;
                if (z10 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thC = atomicThrowable.c();
                    if (unicastProcessor != null) {
                        this.f120991m = null;
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
                            this.f120991m = null;
                            unicastProcessor.onComplete();
                        }
                        dVar.onComplete();
                        return;
                    }
                    if (unicastProcessor != null) {
                        this.f120991m = null;
                        unicastProcessor.onError(thC2);
                    }
                    dVar.onError(thC2);
                    return;
                }
                if (z11) {
                    this.f120992n = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f120979p) {
                    unicastProcessor.onNext((T) objPoll);
                } else {
                    if (unicastProcessor != null) {
                        this.f120991m = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.f120986h.get()) {
                        if (j10 != this.f120988j.get()) {
                            UnicastProcessor<T> unicastProcessorU8 = UnicastProcessor.U8(this.f120981c, this);
                            this.f120991m = unicastProcessorU8;
                            this.f120983e.getAndIncrement();
                            try {
                                org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120987i.call(), "The other Callable returned a null Publisher");
                                a aVar = new a(this);
                                if (androidx.compose.animation.core.s0.a(this.f120982d, null, aVar)) {
                                    cVar.g(aVar);
                                    j10++;
                                    dVar.onNext(unicastProcessorU8);
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                atomicThrowable.a(th2);
                                this.f120990l = true;
                            }
                        } else {
                            this.f120989k.cancel();
                            a();
                            atomicThrowable.a(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.f120990l = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f120991m = null;
        }

        void c() {
            this.f120989k.cancel();
            this.f120990l = true;
            b();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120986h.compareAndSet(false, true)) {
                a();
                if (this.f120983e.decrementAndGet() == 0) {
                    this.f120989k.cancel();
                }
            }
        }

        void d(Throwable th2) {
            this.f120989k.cancel();
            if (!this.f120985g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120990l = true;
                b();
            }
        }

        void e(a<T, B> aVar) {
            androidx.compose.animation.core.s0.a(this.f120982d, aVar, null);
            this.f120984f.offer(f120979p);
            b();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            a();
            this.f120990l = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            a();
            if (!this.f120985g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120990l = true;
                b();
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120984f.offer(t10);
            b();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120989k, eVar)) {
                this.f120989k = eVar;
                this.f120980b.onSubscribe(this);
                this.f120984f.offer(f120979p);
                b();
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            io.reactivex.internal.util.b.a(this.f120988j, j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f120983e.decrementAndGet() == 0) {
                this.f120989k.cancel();
            }
        }
    }

    public static final class a<T, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowBoundaryMainSubscriber<T, B> f120993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f120994d;

        a(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.f120993c = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120994d) {
                return;
            }
            this.f120994d = true;
            this.f120993c.c();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120994d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120994d = true;
                this.f120993c.d(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(B b10) {
            if (this.f120994d) {
                return;
            }
            this.f120994d = true;
            dispose();
            this.f120993c.e(this);
        }
    }

    public FlowableWindowBoundarySupplier(io.reactivex.j<T> jVar, Callable<? extends org.reactivestreams.c<B>> callable, int i10) {
        super(jVar);
        this.f120976d = callable;
        this.f120977e = i10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super io.reactivex.j<T>> dVar) {
        this.f121039c.j6(new WindowBoundaryMainSubscriber(dVar, this.f120977e, this.f120976d));
    }
}

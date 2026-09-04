package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSamplePublisher<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<T> f120662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<?> f120663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f120664e;

    public static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f120665g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f120666h;

        SampleMainEmitLast(org.reactivestreams.d<? super T> dVar, org.reactivestreams.c<?> cVar) {
            super(dVar, cVar);
            this.f120665g = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void b() {
            this.f120666h = true;
            if (this.f120665g.getAndIncrement() == 0) {
                c();
                this.f120667b.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void e() {
            if (this.f120665g.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.f120666h;
                    c();
                    if (z10) {
                        this.f120667b.onComplete();
                        return;
                    }
                } while (this.f120665g.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(org.reactivestreams.d<? super T> dVar, org.reactivestreams.c<?> cVar) {
            super(dVar, cVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void b() {
            this.f120667b.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void e() {
            c();
        }
    }

    public static abstract class SamplePublisherSubscriber<T> extends AtomicReference<T> implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.c<?> f120668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f120669d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120670e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.e f120671f;

        SamplePublisherSubscriber(org.reactivestreams.d<? super T> dVar, org.reactivestreams.c<?> cVar) {
            this.f120667b = dVar;
            this.f120668c = cVar;
        }

        public void a() {
            this.f120671f.cancel();
            b();
        }

        abstract void b();

        void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f120669d.get() != 0) {
                    this.f120667b.onNext(andSet);
                    io.reactivex.internal.util.b.e(this.f120669d, 1L);
                } else {
                    cancel();
                    this.f120667b.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120670e);
            this.f120671f.cancel();
        }

        public void d(Throwable th2) {
            this.f120671f.cancel();
            this.f120667b.onError(th2);
        }

        abstract void e();

        void f(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this.f120670e, eVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            SubscriptionHelper.cancel(this.f120670e);
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f120670e);
            this.f120667b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120671f, eVar)) {
                this.f120671f = eVar;
                this.f120667b.onSubscribe(this);
                if (this.f120670e.get() == null) {
                    this.f120668c.g(new a(this));
                    eVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120669d, j10);
            }
        }
    }

    public static final class a<T> implements io.reactivex.o<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SamplePublisherSubscriber<T> f120672b;

        a(SamplePublisherSubscriber<T> samplePublisherSubscriber) {
            this.f120672b = samplePublisherSubscriber;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120672b.a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120672b.d(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            this.f120672b.e();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            this.f120672b.f(eVar);
        }
    }

    public FlowableSamplePublisher(org.reactivestreams.c<T> cVar, org.reactivestreams.c<?> cVar2, boolean z10) {
        this.f120662c = cVar;
        this.f120663d = cVar2;
        this.f120664e = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(dVar);
        if (this.f120664e) {
            this.f120662c.g(new SampleMainEmitLast(eVar, this.f120663d));
        } else {
            this.f120662c.g(new SampleMainNoLast(eVar, this.f120663d));
        }
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<? super T, ? super U, ? extends R> f120995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final org.reactivestreams.c<? extends U> f120996e;

    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements lh.a<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -312246233408980075L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<? super T, ? super U, ? extends R> f120998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120999d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f121000e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f121001f = new AtomicReference<>();

        WithLatestFromSubscriber(org.reactivestreams.d<? super R> dVar, kh.c<? super T, ? super U, ? extends R> cVar) {
            this.f120997b = dVar;
            this.f120998c = cVar;
        }

        public void a(Throwable th2) {
            SubscriptionHelper.cancel(this.f120999d);
            this.f120997b.onError(th2);
        }

        public boolean b(org.reactivestreams.e eVar) {
            return SubscriptionHelper.setOnce(this.f121001f, eVar);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120999d);
            SubscriptionHelper.cancel(this.f121001f);
        }

        @Override // lh.a
        public boolean m(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    this.f120997b.onNext(io.reactivex.internal.functions.a.g(this.f120998c.apply(t10, u10), "The combiner returned a null value"));
                    return true;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    cancel();
                    this.f120997b.onError(th2);
                }
            }
            return false;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            SubscriptionHelper.cancel(this.f121001f);
            this.f120997b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f121001f);
            this.f120997b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (m(t10)) {
                return;
            }
            this.f120999d.get().request(1L);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f120999d, this.f121000e, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f120999d, this.f121000e, j10);
        }
    }

    public final class a implements io.reactivex.o<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WithLatestFromSubscriber<T, U, R> f121002b;

        a(WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.f121002b = withLatestFromSubscriber;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121002b.a(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(U u10) {
            this.f121002b.lazySet(u10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (this.f121002b.b(eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableWithLatestFrom(io.reactivex.j<T> jVar, kh.c<? super T, ? super U, ? extends R> cVar, org.reactivestreams.c<? extends U> cVar2) {
        super(jVar);
        this.f120995d = cVar;
        this.f120996e = cVar2;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(dVar);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(eVar, this.f120995d);
        eVar.onSubscribe(withLatestFromSubscriber);
        this.f120996e.g(new a(withLatestFromSubscriber));
        this.f121039c.j6(withLatestFromSubscriber);
    }
}

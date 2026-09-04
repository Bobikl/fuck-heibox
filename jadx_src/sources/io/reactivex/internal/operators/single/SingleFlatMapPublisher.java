package io.reactivex.internal.operators.single;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleFlatMapPublisher<T, R> extends io.reactivex.j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o0<T> f123419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f123420d;

    public static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements l0<S>, io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 7759721921468635667L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f123421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super S, ? extends org.reactivestreams.c<? extends T>> f123422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f123423d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f123424e;

        SingleFlatMapPublisherObserver(org.reactivestreams.d<? super T> dVar, kh.o<? super S, ? extends org.reactivestreams.c<? extends T>> oVar) {
            this.f123421b = dVar;
            this.f123422c = oVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f123424e.dispose();
            SubscriptionHelper.cancel(this.f123423d);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f123421b.onComplete();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123421b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f123421b.onNext(t10);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123424e = bVar;
            this.f123421b.onSubscribe(this);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f123423d, this, eVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(S s10) {
            try {
                ((org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f123422c.apply(s10), "the mapper returned a null Publisher")).g(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123421b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f123423d, this, j10);
        }
    }

    public SingleFlatMapPublisher(o0<T> o0Var, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        this.f123419c = o0Var;
        this.f123420d = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        this.f123419c.f(new SingleFlatMapPublisherObserver(dVar, this.f123420d));
    }
}

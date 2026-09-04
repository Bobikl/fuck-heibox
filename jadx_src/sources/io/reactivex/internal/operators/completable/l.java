package io.reactivex.internal.operators.completable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: CompletableFromPublisher.java */
/* JADX INFO: loaded from: classes12.dex */
public final class l<T> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<T> f119816b;

    /* JADX INFO: compiled from: CompletableFromPublisher.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f119818c;

        a(io.reactivex.d dVar) {
            this.f119817b = dVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119818c.cancel();
            this.f119818c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119818c == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f119817b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f119817b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f119818c, eVar)) {
                this.f119818c = eVar;
                this.f119817b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public l(org.reactivestreams.c<T> cVar) {
        this.f119816b = cVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119816b.g(new a(dVar));
    }
}

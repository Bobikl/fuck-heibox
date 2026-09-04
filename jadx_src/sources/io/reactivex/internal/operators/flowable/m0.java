package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableLastMaybe.java */
/* JADX INFO: loaded from: classes12.dex */
public final class m0<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<T> f121263b;

    /* JADX INFO: compiled from: FlowableLastMaybe.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f121265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f121266d;

        a(io.reactivex.t<? super T> tVar) {
            this.f121264b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121265c.cancel();
            this.f121265c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121265c == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121265c = SubscriptionHelper.CANCELLED;
            T t10 = this.f121266d;
            if (t10 == null) {
                this.f121264b.onComplete();
            } else {
                this.f121266d = null;
                this.f121264b.onSuccess(t10);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121265c = SubscriptionHelper.CANCELLED;
            this.f121266d = null;
            this.f121264b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f121266d = t10;
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121265c, eVar)) {
                this.f121265c = eVar;
                this.f121264b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public m0(org.reactivestreams.c<T> cVar) {
        this.f121263b = cVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121263b.g(new a(tVar));
    }
}

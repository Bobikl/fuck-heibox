package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableIgnoreElementsCompletable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class k0<T> extends io.reactivex.a implements lh.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121239b;

    /* JADX INFO: compiled from: FlowableIgnoreElementsCompletable.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f121240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f121241c;

        a(io.reactivex.d dVar) {
            this.f121240b = dVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121241c.cancel();
            this.f121241c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121241c == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121241c = SubscriptionHelper.CANCELLED;
            this.f121240b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121241c = SubscriptionHelper.CANCELLED;
            this.f121240b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121241c, eVar)) {
                this.f121241c = eVar;
                this.f121240b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public k0(io.reactivex.j<T> jVar) {
        this.f121239b = jVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f121239b.j6(new a(dVar));
    }

    @Override // lh.b
    public io.reactivex.j<T> c() {
        return io.reactivex.plugins.a.P(new j0(this.f121239b));
    }
}

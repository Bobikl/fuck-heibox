package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableHide.java */
/* JADX INFO: loaded from: classes12.dex */
public final class i0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: compiled from: FlowableHide.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f121141c;

        a(org.reactivestreams.d<? super T> dVar) {
            this.f121140b = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121141c.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121140b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121140b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f121140b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121141c, eVar)) {
                this.f121141c = eVar;
                this.f121140b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121141c.request(j10);
        }
    }

    public i0(io.reactivex.j<T> jVar) {
        super(jVar);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(dVar));
    }
}

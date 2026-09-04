package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableCountSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class o<T> extends io.reactivex.i0<Long> implements lh.b<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121277b;

    /* JADX INFO: compiled from: FlowableCountSingle.java */
    public static final class a implements io.reactivex.o<Object>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super Long> f121278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f121279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f121280d;

        a(io.reactivex.l0<? super Long> l0Var) {
            this.f121278b = l0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121279c.cancel();
            this.f121279c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121279c == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121279c = SubscriptionHelper.CANCELLED;
            this.f121278b.onSuccess(Long.valueOf(this.f121280d));
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121279c = SubscriptionHelper.CANCELLED;
            this.f121278b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            this.f121280d++;
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121279c, eVar)) {
                this.f121279c = eVar;
                this.f121278b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public o(io.reactivex.j<T> jVar) {
        this.f121277b = jVar;
    }

    @Override // lh.b
    public io.reactivex.j<Long> c() {
        return io.reactivex.plugins.a.P(new FlowableCount(this.f121277b));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super Long> l0Var) {
        this.f121277b.j6(new a(l0Var));
    }
}

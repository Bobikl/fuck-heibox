package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableSingleMaybe.java */
/* JADX INFO: loaded from: classes12.dex */
public final class y0<T> extends io.reactivex.q<T> implements lh.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121380b;

    /* JADX INFO: compiled from: FlowableSingleMaybe.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f121382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f121383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        T f121384e;

        a(io.reactivex.t<? super T> tVar) {
            this.f121381b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121382c.cancel();
            this.f121382c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121382c == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121383d) {
                return;
            }
            this.f121383d = true;
            this.f121382c = SubscriptionHelper.CANCELLED;
            T t10 = this.f121384e;
            this.f121384e = null;
            if (t10 == null) {
                this.f121381b.onComplete();
            } else {
                this.f121381b.onSuccess(t10);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121383d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121383d = true;
            this.f121382c = SubscriptionHelper.CANCELLED;
            this.f121381b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121383d) {
                return;
            }
            if (this.f121384e == null) {
                this.f121384e = t10;
                return;
            }
            this.f121383d = true;
            this.f121382c.cancel();
            this.f121382c = SubscriptionHelper.CANCELLED;
            this.f121381b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121382c, eVar)) {
                this.f121382c = eVar;
                this.f121381b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public y0(io.reactivex.j<T> jVar) {
        this.f121380b = jVar;
    }

    @Override // lh.b
    public io.reactivex.j<T> c() {
        return io.reactivex.plugins.a.P(new FlowableSingle(this.f121380b, null, false));
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121380b.j6(new a(tVar));
    }
}

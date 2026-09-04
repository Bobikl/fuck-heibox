package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableElementAtMaybe.java */
/* JADX INFO: loaded from: classes12.dex */
public final class y<T> extends io.reactivex.q<T> implements lh.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f121374c;

    /* JADX INFO: compiled from: FlowableElementAtMaybe.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f121376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f121378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f121379f;

        a(io.reactivex.t<? super T> tVar, long j10) {
            this.f121375b = tVar;
            this.f121376c = j10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121377d.cancel();
            this.f121377d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121377d == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121377d = SubscriptionHelper.CANCELLED;
            if (this.f121379f) {
                return;
            }
            this.f121379f = true;
            this.f121375b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121379f) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121379f = true;
            this.f121377d = SubscriptionHelper.CANCELLED;
            this.f121375b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121379f) {
                return;
            }
            long j10 = this.f121378e;
            if (j10 != this.f121376c) {
                this.f121378e = j10 + 1;
                return;
            }
            this.f121379f = true;
            this.f121377d.cancel();
            this.f121377d = SubscriptionHelper.CANCELLED;
            this.f121375b.onSuccess(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121377d, eVar)) {
                this.f121377d = eVar;
                this.f121375b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public y(io.reactivex.j<T> jVar, long j10) {
        this.f121373b = jVar;
        this.f121374c = j10;
    }

    @Override // lh.b
    public io.reactivex.j<T> c() {
        return io.reactivex.plugins.a.P(new FlowableElementAt(this.f121373b, this.f121374c, null, false));
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121373b.j6(new a(tVar, this.f121374c));
    }
}

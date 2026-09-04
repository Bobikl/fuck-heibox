package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: FlowableTimeInterval.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g1<T> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.schedulers.d<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.h0 f121118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f121119e;

    /* JADX INFO: compiled from: FlowableTimeInterval.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super io.reactivex.schedulers.d<T>> f121120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f121121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.h0 f121122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f121123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f121124f;

        a(org.reactivestreams.d<? super io.reactivex.schedulers.d<T>> dVar, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f121120b = dVar;
            this.f121122d = h0Var;
            this.f121121c = timeUnit;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121123e.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121120b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121120b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            long jD = this.f121122d.d(this.f121121c);
            long j10 = this.f121124f;
            this.f121124f = jD;
            this.f121120b.onNext(new io.reactivex.schedulers.d(t10, jD - j10, this.f121121c));
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121123e, eVar)) {
                this.f121124f = this.f121122d.d(this.f121121c);
                this.f121123e = eVar;
                this.f121120b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121123e.request(j10);
        }
    }

    public g1(io.reactivex.j<T> jVar, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        super(jVar);
        this.f121118d = h0Var;
        this.f121119e = timeUnit;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super io.reactivex.schedulers.d<T>> dVar) {
        this.f121039c.j6(new a(dVar, this.f121119e, this.f121118d));
    }
}

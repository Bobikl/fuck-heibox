package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableSkip.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a1<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f121041d;

    /* JADX INFO: compiled from: FlowableSkip.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f121043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121044d;

        a(org.reactivestreams.d<? super T> dVar, long j10) {
            this.f121042b = dVar;
            this.f121043c = j10;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121044d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121042b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121042b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            long j10 = this.f121043c;
            if (j10 != 0) {
                this.f121043c = j10 - 1;
            } else {
                this.f121042b.onNext(t10);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121044d, eVar)) {
                long j10 = this.f121043c;
                this.f121044d = eVar;
                this.f121042b.onSubscribe(this);
                eVar.request(j10);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121044d.request(j10);
        }
    }

    public a1(io.reactivex.j<T> jVar, long j10) {
        super(jVar);
        this.f121041d = j10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(dVar, this.f121041d));
    }
}

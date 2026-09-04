package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableTakeUntilPredicate.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e1<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.r<? super T> f121092d;

    /* JADX INFO: compiled from: FlowableTakeUntilPredicate.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f121094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f121096e;

        a(org.reactivestreams.d<? super T> dVar, kh.r<? super T> rVar) {
            this.f121093b = dVar;
            this.f121094c = rVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121095d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121096e) {
                return;
            }
            this.f121096e = true;
            this.f121093b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121096e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121096e = true;
                this.f121093b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121096e) {
                return;
            }
            this.f121093b.onNext(t10);
            try {
                if (this.f121094c.test(t10)) {
                    this.f121096e = true;
                    this.f121095d.cancel();
                    this.f121093b.onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121095d.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121095d, eVar)) {
                this.f121095d = eVar;
                this.f121093b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121095d.request(j10);
        }
    }

    public e1(io.reactivex.j<T> jVar, kh.r<? super T> rVar) {
        super(jVar);
        this.f121092d = rVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(dVar, this.f121092d));
    }
}

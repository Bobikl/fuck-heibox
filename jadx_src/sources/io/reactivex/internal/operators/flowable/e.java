package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableAllSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e<T> extends io.reactivex.i0<Boolean> implements lh.b<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f121086c;

    /* JADX INFO: compiled from: FlowableAllSingle.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super Boolean> f121087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f121088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f121090e;

        a(io.reactivex.l0<? super Boolean> l0Var, kh.r<? super T> rVar) {
            this.f121087b = l0Var;
            this.f121088c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121089d.cancel();
            this.f121089d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121089d == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121090e) {
                return;
            }
            this.f121090e = true;
            this.f121089d = SubscriptionHelper.CANCELLED;
            this.f121087b.onSuccess(Boolean.TRUE);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121090e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121090e = true;
            this.f121089d = SubscriptionHelper.CANCELLED;
            this.f121087b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121090e) {
                return;
            }
            try {
                if (this.f121088c.test(t10)) {
                    return;
                }
                this.f121090e = true;
                this.f121089d.cancel();
                this.f121089d = SubscriptionHelper.CANCELLED;
                this.f121087b.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121089d.cancel();
                this.f121089d = SubscriptionHelper.CANCELLED;
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121089d, eVar)) {
                this.f121089d = eVar;
                this.f121087b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public e(io.reactivex.j<T> jVar, kh.r<? super T> rVar) {
        this.f121085b = jVar;
        this.f121086c = rVar;
    }

    @Override // lh.b
    public io.reactivex.j<Boolean> c() {
        return io.reactivex.plugins.a.P(new FlowableAll(this.f121085b, this.f121086c));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super Boolean> l0Var) {
        this.f121085b.j6(new a(l0Var, this.f121086c));
    }
}

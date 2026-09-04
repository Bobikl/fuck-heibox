package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableReduceSeedSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class t0<T, R> extends io.reactivex.i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<T> f121322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final R f121323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<R, ? super T, R> f121324d;

    /* JADX INFO: compiled from: FlowableReduceSeedSingle.java */
    public static final class a<T, R> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super R> f121325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<R, ? super T, R> f121326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        R f121327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f121328e;

        a(io.reactivex.l0<? super R> l0Var, kh.c<R, ? super T, R> cVar, R r10) {
            this.f121325b = l0Var;
            this.f121327d = r10;
            this.f121326c = cVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121328e.cancel();
            this.f121328e = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121328e == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            R r10 = this.f121327d;
            if (r10 != null) {
                this.f121327d = null;
                this.f121328e = SubscriptionHelper.CANCELLED;
                this.f121325b.onSuccess(r10);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121327d == null) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121327d = null;
            this.f121328e = SubscriptionHelper.CANCELLED;
            this.f121325b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            R r10 = this.f121327d;
            if (r10 != null) {
                try {
                    this.f121327d = (R) io.reactivex.internal.functions.a.g(this.f121326c.apply(r10, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f121328e.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121328e, eVar)) {
                this.f121328e = eVar;
                this.f121325b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public t0(org.reactivestreams.c<T> cVar, R r10, kh.c<R, ? super T, R> cVar2) {
        this.f121322b = cVar;
        this.f121323c = r10;
        this.f121324d = cVar2;
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super R> l0Var) {
        this.f121322b.g(new a(l0Var, this.f121324d, this.f121323c));
    }
}

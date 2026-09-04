package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableAnySingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f<T> extends io.reactivex.i0<Boolean> implements lh.b<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f121098c;

    /* JADX INFO: compiled from: FlowableAnySingle.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super Boolean> f121099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f121100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f121102e;

        a(io.reactivex.l0<? super Boolean> l0Var, kh.r<? super T> rVar) {
            this.f121099b = l0Var;
            this.f121100c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121101d.cancel();
            this.f121101d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121101d == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121102e) {
                return;
            }
            this.f121102e = true;
            this.f121101d = SubscriptionHelper.CANCELLED;
            this.f121099b.onSuccess(Boolean.FALSE);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121102e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121102e = true;
            this.f121101d = SubscriptionHelper.CANCELLED;
            this.f121099b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121102e) {
                return;
            }
            try {
                if (this.f121100c.test(t10)) {
                    this.f121102e = true;
                    this.f121101d.cancel();
                    this.f121101d = SubscriptionHelper.CANCELLED;
                    this.f121099b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121101d.cancel();
                this.f121101d = SubscriptionHelper.CANCELLED;
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121101d, eVar)) {
                this.f121101d = eVar;
                this.f121099b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public f(io.reactivex.j<T> jVar, kh.r<? super T> rVar) {
        this.f121097b = jVar;
        this.f121098c = rVar;
    }

    @Override // lh.b
    public io.reactivex.j<Boolean> c() {
        return io.reactivex.plugins.a.P(new FlowableAny(this.f121097b, this.f121098c));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super Boolean> l0Var) {
        this.f121097b.j6(new a(l0Var, this.f121098c));
    }
}

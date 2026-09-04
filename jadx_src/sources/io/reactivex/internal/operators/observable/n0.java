package io.reactivex.internal.operators.observable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: ObservableFromPublisher.java */
/* JADX INFO: loaded from: classes5.dex */
public final class n0<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f122990b;

    /* JADX INFO: compiled from: ObservableFromPublisher.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f122992c;

        a(io.reactivex.g0<? super T> g0Var) {
            this.f122991b = g0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122992c.cancel();
            this.f122992c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122992c == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f122991b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f122991b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f122991b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f122992c, eVar)) {
                this.f122992c = eVar;
                this.f122991b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public n0(org.reactivestreams.c<? extends T> cVar) {
        this.f122990b = cVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122990b.g(new a(g0Var));
    }
}

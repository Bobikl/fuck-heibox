package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: FlowableLastSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class n0<T> extends io.reactivex.i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<T> f121271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f121272c;

    /* JADX INFO: compiled from: FlowableLastSingle.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super T> f121273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f121274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        T f121276e;

        a(io.reactivex.l0<? super T> l0Var, T t10) {
            this.f121273b = l0Var;
            this.f121274c = t10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121275d.cancel();
            this.f121275d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121275d == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121275d = SubscriptionHelper.CANCELLED;
            T t10 = this.f121276e;
            if (t10 != null) {
                this.f121276e = null;
                this.f121273b.onSuccess(t10);
                return;
            }
            T t11 = this.f121274c;
            if (t11 != null) {
                this.f121273b.onSuccess(t11);
            } else {
                this.f121273b.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121275d = SubscriptionHelper.CANCELLED;
            this.f121276e = null;
            this.f121273b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f121276e = t10;
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121275d, eVar)) {
                this.f121275d = eVar;
                this.f121273b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public n0(org.reactivestreams.c<T> cVar, T t10) {
        this.f121271b = cVar;
        this.f121272c = t10;
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super T> l0Var) {
        this.f121271b.g(new a(l0Var, this.f121272c));
    }
}

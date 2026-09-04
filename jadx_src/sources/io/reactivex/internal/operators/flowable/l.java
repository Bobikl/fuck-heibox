package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableCollectSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class l<T, U> extends io.reactivex.i0<U> implements lh.b<U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends U> f121250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.b<? super U, ? super T> f121251d;

    /* JADX INFO: compiled from: FlowableCollectSingle.java */
    public static final class a<T, U> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super U> f121252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.b<? super U, ? super T> f121253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final U f121254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f121255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f121256f;

        a(io.reactivex.l0<? super U> l0Var, U u10, kh.b<? super U, ? super T> bVar) {
            this.f121252b = l0Var;
            this.f121253c = bVar;
            this.f121254d = u10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121255e.cancel();
            this.f121255e = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121255e == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121256f) {
                return;
            }
            this.f121256f = true;
            this.f121255e = SubscriptionHelper.CANCELLED;
            this.f121252b.onSuccess(this.f121254d);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121256f) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121256f = true;
            this.f121255e = SubscriptionHelper.CANCELLED;
            this.f121252b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121256f) {
                return;
            }
            try {
                this.f121253c.accept(this.f121254d, t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121255e.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121255e, eVar)) {
                this.f121255e = eVar;
                this.f121252b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public l(io.reactivex.j<T> jVar, Callable<? extends U> callable, kh.b<? super U, ? super T> bVar) {
        this.f121249b = jVar;
        this.f121250c = callable;
        this.f121251d = bVar;
    }

    @Override // lh.b
    public io.reactivex.j<U> c() {
        return io.reactivex.plugins.a.P(new FlowableCollect(this.f121249b, this.f121250c, this.f121251d));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super U> l0Var) {
        try {
            this.f121249b.j6(new a(l0Var, io.reactivex.internal.functions.a.g(this.f121250c.call(), "The initialSupplier returned a null value"), this.f121251d));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, l0Var);
        }
    }
}

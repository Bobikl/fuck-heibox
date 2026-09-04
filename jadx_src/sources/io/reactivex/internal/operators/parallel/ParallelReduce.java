package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class ParallelReduce<T, R> extends io.reactivex.parallel.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<? extends T> f123218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<R> f123219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<R, ? super T, R> f123220c;

    public static final class ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final kh.c<R, ? super T, R> f123221n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        R f123222o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f123223p;

        ParallelReduceSubscriber(org.reactivestreams.d<? super R> dVar, R r10, kh.c<R, ? super T, R> cVar) {
            super(dVar);
            this.f123222o = r10;
            this.f123221n = cVar;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f123761l.cancel();
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.d
        public void onComplete() {
            if (this.f123223p) {
                return;
            }
            this.f123223p = true;
            R r10 = this.f123222o;
            this.f123222o = null;
            c(r10);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123223p) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123223p = true;
            this.f123222o = null;
            this.f123845b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123223p) {
                return;
            }
            try {
                this.f123222o = (R) io.reactivex.internal.functions.a.g(this.f123221n.apply(this.f123222o, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123761l, eVar)) {
                this.f123761l = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public ParallelReduce(io.reactivex.parallel.a<? extends T> aVar, Callable<R> callable, kh.c<R, ? super T, R> cVar) {
        this.f123218a = aVar;
        this.f123219b = callable;
        this.f123220c = cVar;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123218a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super R>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super Object>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    dVarArr2[i10] = new ParallelReduceSubscriber(dVarArr[i10], io.reactivex.internal.functions.a.g(this.f123219b.call(), "The initialSupplier returned a null value"), this.f123220c);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    V(dVarArr, th2);
                    return;
                }
            }
            this.f123218a.Q(dVarArr2);
        }
    }

    void V(org.reactivestreams.d<?>[] dVarArr, Throwable th2) {
        for (org.reactivestreams.d<?> dVar : dVarArr) {
            EmptySubscription.error(th2, dVar);
        }
    }
}

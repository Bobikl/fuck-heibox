package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class ParallelCollect<T, C> extends io.reactivex.parallel.a<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<? extends T> f123178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends C> f123179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.b<? super C, ? super T> f123180c;

    public static final class ParallelCollectSubscriber<T, C> extends DeferredScalarSubscriber<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final kh.b<? super C, ? super T> f123181n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C f123182o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f123183p;

        ParallelCollectSubscriber(org.reactivestreams.d<? super C> dVar, C c10, kh.b<? super C, ? super T> bVar) {
            super(dVar);
            this.f123182o = c10;
            this.f123181n = bVar;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f123761l.cancel();
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.d
        public void onComplete() {
            if (this.f123183p) {
                return;
            }
            this.f123183p = true;
            C c10 = this.f123182o;
            this.f123182o = null;
            c(c10);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123183p) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123183p = true;
            this.f123182o = null;
            this.f123845b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123183p) {
                return;
            }
            try {
                this.f123181n.accept(this.f123182o, t10);
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

    public ParallelCollect(io.reactivex.parallel.a<? extends T> aVar, Callable<? extends C> callable, kh.b<? super C, ? super T> bVar) {
        this.f123178a = aVar;
        this.f123179b = callable;
        this.f123180c = bVar;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123178a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super C>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super Object>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    dVarArr2[i10] = new ParallelCollectSubscriber(dVarArr[i10], io.reactivex.internal.functions.a.g(this.f123179b.call(), "The initialSupplier returned a null value"), this.f123180c);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    V(dVarArr, th2);
                    return;
                }
            }
            this.f123178a.Q(dVarArr2);
        }
    }

    void V(org.reactivestreams.d<?>[] dVarArr, Throwable th2) {
        for (org.reactivestreams.d<?> dVar : dVarArr) {
            EmptySubscription.error(th2, dVar);
        }
    }
}

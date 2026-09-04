package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableToList<T, U extends Collection<? super T>> extends a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<U> f120908d;

    public static final class ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -8134157938864266736L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        org.reactivestreams.e f120909l;

        /* JADX WARN: Multi-variable type inference failed */
        ToListSubscriber(org.reactivestreams.d<? super U> dVar, U u10) {
            super(dVar);
            this.f123846c = u10;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f120909l.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            c(this.f123846c);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123846c = null;
            this.f123845b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            Collection collection = (Collection) this.f123846c;
            if (collection != null) {
                collection.add(t10);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120909l, eVar)) {
                this.f120909l = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableToList(io.reactivex.j<T> jVar, Callable<U> callable) {
        super(jVar);
        this.f120908d = callable;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        try {
            this.f121039c.j6(new ToListSubscriber(dVar, (Collection) io.reactivex.internal.functions.a.g(this.f120908d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}

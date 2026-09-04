package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSingle<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final T f120728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f120729e;

    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final T f120730l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final boolean f120731m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        org.reactivestreams.e f120732n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f120733o;

        SingleElementSubscriber(org.reactivestreams.d<? super T> dVar, T t10, boolean z10) {
            super(dVar);
            this.f120730l = t10;
            this.f120731m = z10;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f120732n.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120733o) {
                return;
            }
            this.f120733o = true;
            T t10 = this.f123846c;
            this.f123846c = null;
            if (t10 == null) {
                t10 = this.f120730l;
            }
            if (t10 != null) {
                c(t10);
            } else if (this.f120731m) {
                this.f123845b.onError(new NoSuchElementException());
            } else {
                this.f123845b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120733o) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120733o = true;
                this.f123845b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120733o) {
                return;
            }
            if (this.f123846c == null) {
                this.f123846c = t10;
                return;
            }
            this.f120733o = true;
            this.f120732n.cancel();
            this.f123845b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120732n, eVar)) {
                this.f120732n = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingle(io.reactivex.j<T> jVar, T t10, boolean z10) {
        super(jVar);
        this.f120728d = t10;
        this.f120729e = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new SingleElementSubscriber(dVar, this.f120728d, this.f120729e));
    }
}

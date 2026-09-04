package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableElementAt<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final T f120120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f120121f;

    public static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements io.reactivex.o<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final long f120122l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final T f120123m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final boolean f120124n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        org.reactivestreams.e f120125o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f120126p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f120127q;

        ElementAtSubscriber(org.reactivestreams.d<? super T> dVar, long j10, T t10, boolean z10) {
            super(dVar);
            this.f120122l = j10;
            this.f120123m = t10;
            this.f120124n = z10;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f120125o.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120127q) {
                return;
            }
            this.f120127q = true;
            T t10 = this.f120123m;
            if (t10 != null) {
                c(t10);
            } else if (this.f120124n) {
                this.f123845b.onError(new NoSuchElementException());
            } else {
                this.f123845b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120127q) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120127q = true;
                this.f123845b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120127q) {
                return;
            }
            long j10 = this.f120126p;
            if (j10 != this.f120122l) {
                this.f120126p = j10 + 1;
                return;
            }
            this.f120127q = true;
            this.f120125o.cancel();
            c(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120125o, eVar)) {
                this.f120125o = eVar;
                this.f123845b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAt(io.reactivex.j<T> jVar, long j10, T t10, boolean z10) {
        super(jVar);
        this.f120119d = j10;
        this.f120120e = t10;
        this.f120121f = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new ElementAtSubscriber(dVar, this.f120119d, this.f120120e, this.f120121f));
    }
}

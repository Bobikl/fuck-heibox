package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnErrorNext<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends org.reactivestreams.c<? extends T>> f120496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f120497e;

    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements io.reactivex.o<T> {
        private static final long serialVersionUID = 4063763155303814625L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120498j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends org.reactivestreams.c<? extends T>> f120499k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final boolean f120500l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f120501m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f120502n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f120503o;

        OnErrorNextSubscriber(org.reactivestreams.d<? super T> dVar, kh.o<? super Throwable, ? extends org.reactivestreams.c<? extends T>> oVar, boolean z10) {
            super(false);
            this.f120498j = dVar;
            this.f120499k = oVar;
            this.f120500l = z10;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120502n) {
                return;
            }
            this.f120502n = true;
            this.f120501m = true;
            this.f120498j.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120501m) {
                if (this.f120502n) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                } else {
                    this.f120498j.onError(th2);
                    return;
                }
            }
            this.f120501m = true;
            if (this.f120500l && !(th2 instanceof Exception)) {
                this.f120498j.onError(th2);
                return;
            }
            try {
                org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120499k.apply(th2), "The nextSupplier returned a null Publisher");
                long j10 = this.f120503o;
                if (j10 != 0) {
                    g(j10);
                }
                cVar.g(this);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f120498j.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120502n) {
                return;
            }
            if (!this.f120501m) {
                this.f120503o++;
            }
            this.f120498j.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            h(eVar);
        }
    }

    public FlowableOnErrorNext(io.reactivex.j<T> jVar, kh.o<? super Throwable, ? extends org.reactivestreams.c<? extends T>> oVar, boolean z10) {
        super(jVar);
        this.f120496d = oVar;
        this.f120497e = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(dVar, this.f120496d, this.f120497e);
        dVar.onSubscribe(onErrorNextSubscriber);
        this.f121039c.j6(onErrorNextSubscriber);
    }
}

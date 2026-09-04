package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSkipLast<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f120734d;

    public static final class SkipLastSubscriber<T> extends ArrayDeque<T> implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -3807491841935125653L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f120736c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f120737d;

        SkipLastSubscriber(org.reactivestreams.d<? super T> dVar, int i10) {
            super(i10);
            this.f120735b = dVar;
            this.f120736c = i10;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120737d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120735b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120735b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120736c == size()) {
                this.f120735b.onNext(poll());
            } else {
                this.f120737d.request(1L);
            }
            offer(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120737d, eVar)) {
                this.f120737d = eVar;
                this.f120735b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120737d.request(j10);
        }
    }

    public FlowableSkipLast(io.reactivex.j<T> jVar, int i10) {
        super(jVar);
        this.f120734d = i10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new SkipLastSubscriber(dVar, this.f120734d));
    }
}

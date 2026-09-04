package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableIgnoreElements.java */
/* JADX INFO: loaded from: classes12.dex */
public final class j0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: compiled from: FlowableIgnoreElements.java */
    public static final class a<T> implements io.reactivex.o<T>, lh.l<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f121168c;

        a(org.reactivestreams.d<? super T> dVar) {
            this.f121167b = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121168c.cancel();
        }

        @Override // lh.o
        public void clear() {
        }

        @Override // lh.o
        public boolean isEmpty() {
            return true;
        }

        @Override // lh.o
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // lh.o
        public boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121167b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121167b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121168c, eVar)) {
                this.f121168c = eVar;
                this.f121167b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() {
            return null;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return i10 & 2;
        }
    }

    public j0(io.reactivex.j<T> jVar) {
        super(jVar);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(dVar));
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionArbiter;

/* JADX INFO: compiled from: FlowableSwitchIfEmpty.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c1<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f121063d;

    /* JADX INFO: compiled from: FlowableSwitchIfEmpty.java */
    public static final class a<T> implements io.reactivex.o<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.c<? extends T> f121065c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f121067e = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final SubscriptionArbiter f121066d = new SubscriptionArbiter(false);

        a(org.reactivestreams.d<? super T> dVar, org.reactivestreams.c<? extends T> cVar) {
            this.f121064b = dVar;
            this.f121065c = cVar;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (!this.f121067e) {
                this.f121064b.onComplete();
            } else {
                this.f121067e = false;
                this.f121065c.g(this);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121064b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121067e) {
                this.f121067e = false;
            }
            this.f121064b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            this.f121066d.h(eVar);
        }
    }

    public c1(io.reactivex.j<T> jVar, org.reactivestreams.c<? extends T> cVar) {
        super(jVar);
        this.f121063d = cVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a(dVar, this.f121063d);
        dVar.onSubscribe(aVar.f121066d);
        this.f121039c.j6(aVar);
    }
}

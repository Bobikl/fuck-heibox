package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: compiled from: FlowableDetach.java */
/* JADX INFO: loaded from: classes12.dex */
public final class s<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: compiled from: FlowableDetach.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.d<? super T> f121309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f121310c;

        a(org.reactivestreams.d<? super T> dVar) {
            this.f121309b = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            org.reactivestreams.e eVar = this.f121310c;
            this.f121310c = EmptyComponent.INSTANCE;
            this.f121309b = EmptyComponent.asSubscriber();
            eVar.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            org.reactivestreams.d<? super T> dVar = this.f121309b;
            this.f121310c = EmptyComponent.INSTANCE;
            this.f121309b = EmptyComponent.asSubscriber();
            dVar.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            org.reactivestreams.d<? super T> dVar = this.f121309b;
            this.f121310c = EmptyComponent.INSTANCE;
            this.f121309b = EmptyComponent.asSubscriber();
            dVar.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f121309b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121310c, eVar)) {
                this.f121310c = eVar;
                this.f121309b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121310c.request(j10);
        }
    }

    public s(io.reactivex.j<T> jVar) {
        super(jVar);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(dVar));
    }
}

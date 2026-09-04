package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableDoOnLifecycle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class x<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kh.g<? super org.reactivestreams.e> f121365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kh.q f121366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kh.a f121367f;

    /* JADX INFO: compiled from: FlowableDoOnLifecycle.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super org.reactivestreams.e> f121369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.q f121370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.a f121371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.e f121372f;

        a(org.reactivestreams.d<? super T> dVar, kh.g<? super org.reactivestreams.e> gVar, kh.q qVar, kh.a aVar) {
            this.f121368b = dVar;
            this.f121369c = gVar;
            this.f121371e = aVar;
            this.f121370d = qVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            org.reactivestreams.e eVar = this.f121372f;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar != subscriptionHelper) {
                this.f121372f = subscriptionHelper;
                try {
                    this.f121371e.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
                eVar.cancel();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121372f != SubscriptionHelper.CANCELLED) {
                this.f121368b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121372f != SubscriptionHelper.CANCELLED) {
                this.f121368b.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f121368b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            try {
                this.f121369c.accept(eVar);
                if (SubscriptionHelper.validate(this.f121372f, eVar)) {
                    this.f121372f = eVar;
                    this.f121368b.onSubscribe(this);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                eVar.cancel();
                this.f121372f = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th2, this.f121368b);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            try {
                this.f121370d.accept(j10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f121372f.request(j10);
        }
    }

    public x(io.reactivex.j<T> jVar, kh.g<? super org.reactivestreams.e> gVar, kh.q qVar, kh.a aVar) {
        super(jVar);
        this.f121365d = gVar;
        this.f121366e = qVar;
        this.f121367f = aVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(dVar, this.f121365d, this.f121366e, this.f121367f));
    }
}

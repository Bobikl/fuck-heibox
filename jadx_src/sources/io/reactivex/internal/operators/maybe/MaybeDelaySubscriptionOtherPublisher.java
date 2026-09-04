package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<U> f121453c;

    public static final class DelayMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T> {
        private static final long serialVersionUID = 706635022205076709L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121454b;

        DelayMaybeObserver(io.reactivex.t<? super T> tVar) {
            this.f121454b = tVar;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121454b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121454b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121454b.onSuccess(t10);
        }
    }

    public static final class a<T> implements io.reactivex.o<Object>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DelayMaybeObserver<T> f121455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.w<T> f121456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121457d;

        a(io.reactivex.t<? super T> tVar, io.reactivex.w<T> wVar) {
            this.f121455b = new DelayMaybeObserver<>(tVar);
            this.f121456c = wVar;
        }

        void a() {
            io.reactivex.w<T> wVar = this.f121456c;
            this.f121456c = null;
            wVar.f(this.f121455b);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121457d.cancel();
            this.f121457d = SubscriptionHelper.CANCELLED;
            DisposableHelper.dispose(this.f121455b);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f121455b.get());
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            org.reactivestreams.e eVar = this.f121457d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar != subscriptionHelper) {
                this.f121457d = subscriptionHelper;
                a();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            org.reactivestreams.e eVar = this.f121457d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar == subscriptionHelper) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121457d = subscriptionHelper;
                this.f121455b.f121454b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            org.reactivestreams.e eVar = this.f121457d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar != subscriptionHelper) {
                eVar.cancel();
                this.f121457d = subscriptionHelper;
                a();
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121457d, eVar)) {
                this.f121457d = eVar;
                this.f121455b.f121454b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public MaybeDelaySubscriptionOtherPublisher(io.reactivex.w<T> wVar, org.reactivestreams.c<U> cVar) {
        super(wVar);
        this.f121453c = cVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121453c.g(new a(tVar, this.f121618b));
    }
}

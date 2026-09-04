package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelayOtherPublisher<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<U> f121446c;

    public static final class OtherSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object> {
        private static final long serialVersionUID = -1215060610805418006L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f121448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Throwable f121449d;

        OtherSubscriber(io.reactivex.t<? super T> tVar) {
            this.f121447b = tVar;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            Throwable th2 = this.f121449d;
            if (th2 != null) {
                this.f121447b.onError(th2);
                return;
            }
            T t10 = this.f121448c;
            if (t10 != null) {
                this.f121447b.onSuccess(t10);
            } else {
                this.f121447b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            Throwable th3 = this.f121449d;
            if (th3 == null) {
                this.f121447b.onError(th2);
            } else {
                this.f121447b.onError(new CompositeException(th3, th2));
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                eVar.cancel();
                onComplete();
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public static final class a<T, U> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final OtherSubscriber<T> f121450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.c<U> f121451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121452d;

        a(io.reactivex.t<? super T> tVar, org.reactivestreams.c<U> cVar) {
            this.f121450b = new OtherSubscriber<>(tVar);
            this.f121451c = cVar;
        }

        void a() {
            this.f121451c.g(this.f121450b);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121452d.dispose();
            this.f121452d = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.f121450b);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121450b.get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121452d = DisposableHelper.DISPOSED;
            a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121452d = DisposableHelper.DISPOSED;
            this.f121450b.f121449d = th2;
            a();
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121452d, bVar)) {
                this.f121452d = bVar;
                this.f121450b.f121447b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121452d = DisposableHelper.DISPOSED;
            this.f121450b.f121448c = t10;
            a();
        }
    }

    public MaybeDelayOtherPublisher(io.reactivex.w<T> wVar, org.reactivestreams.c<U> cVar) {
        super(wVar);
        this.f121446c = cVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new a(tVar, this.f121446c));
    }
}

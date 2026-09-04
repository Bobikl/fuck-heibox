package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeToFlowable<T> extends io.reactivex.j<T> implements lh.f<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<T> f121593c;

    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements io.reactivex.t<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        io.reactivex.disposables.b f121594l;

        MaybeToFlowableSubscriber(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f121594l.dispose();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f123845b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f123845b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121594l, bVar)) {
                this.f121594l = bVar;
                this.f123845b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            c(t10);
        }
    }

    public MaybeToFlowable(io.reactivex.w<T> wVar) {
        this.f121593c = wVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121593c.f(new MaybeToFlowableSubscriber(dVar));
    }

    @Override // lh.f
    public io.reactivex.w<T> source() {
        return this.f121593c;
    }
}

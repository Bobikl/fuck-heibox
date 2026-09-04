package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleDelayWithPublisher<T, U> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<U> f123368c;

    public static final class OtherSubscriber<T, U> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.o<U>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o0<T> f123370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f123371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f123372e;

        OtherSubscriber(l0<? super T> l0Var, o0<T> o0Var) {
            this.f123369b = l0Var;
            this.f123370c = o0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123372e.cancel();
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123371d) {
                return;
            }
            this.f123371d = true;
            this.f123370c.f(new io.reactivex.internal.observers.o(this, this.f123369b));
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123371d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123371d = true;
                this.f123369b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(U u10) {
            this.f123372e.cancel();
            onComplete();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123372e, eVar)) {
                this.f123372e = eVar;
                this.f123369b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleDelayWithPublisher(o0<T> o0Var, org.reactivestreams.c<U> cVar) {
        this.f123367b = o0Var;
        this.f123368c = cVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123368c.g(new OtherSubscriber(l0Var, this.f123367b));
    }
}

package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleTakeUntil<T, U> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<U> f123443c;

    public static final class TakeUntilMainObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -622603812305745221L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TakeUntilOtherSubscriber f123445c = new TakeUntilOtherSubscriber(this);

        TakeUntilMainObserver(l0<? super T> l0Var) {
            this.f123444b = l0Var;
        }

        void a(Throwable th2) {
            io.reactivex.disposables.b andSet;
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.f123444b.onError(th2);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f123445c.a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123445c.a();
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123444b.onError(th2);
            }
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123445c.a();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f123444b.onSuccess(t10);
            }
        }
    }

    public static final class TakeUntilOtherSubscriber extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object> {
        private static final long serialVersionUID = 5170026210238877381L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TakeUntilMainObserver<?> f123446b;

        TakeUntilOtherSubscriber(TakeUntilMainObserver<?> takeUntilMainObserver) {
            this.f123446b = takeUntilMainObserver;
        }

        public void a() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f123446b.a(new CancellationException());
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123446b.a(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.f123446b.a(new CancellationException());
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public SingleTakeUntil(o0<T> o0Var, org.reactivestreams.c<U> cVar) {
        this.f123442b = o0Var;
        this.f123443c = cVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(l0Var);
        l0Var.onSubscribe(takeUntilMainObserver);
        this.f123443c.g(takeUntilMainObserver.f123445c);
        this.f123442b.f(takeUntilMainObserver);
    }
}

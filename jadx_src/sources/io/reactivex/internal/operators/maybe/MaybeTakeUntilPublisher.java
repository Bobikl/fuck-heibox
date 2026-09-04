package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTakeUntilPublisher<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<U> f121569c;

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TakeUntilOtherMaybeObserver<U> f121571c = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final TakeUntilMainMaybeObserver<?, U> f121572b;

            TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.f121572b = takeUntilMainMaybeObserver;
            }

            @Override // org.reactivestreams.d
            public void onComplete() {
                this.f121572b.a();
            }

            @Override // org.reactivestreams.d
            public void onError(Throwable th2) {
                this.f121572b.b(th2);
            }

            @Override // org.reactivestreams.d
            public void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                this.f121572b.a();
            }

            @Override // io.reactivex.o, org.reactivestreams.d
            public void onSubscribe(org.reactivestreams.e eVar) {
                SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
            }
        }

        TakeUntilMainMaybeObserver(io.reactivex.t<? super T> tVar) {
            this.f121570b = tVar;
        }

        void a() {
            if (DisposableHelper.dispose(this)) {
                this.f121570b.onComplete();
            }
        }

        void b(Throwable th2) {
            if (DisposableHelper.dispose(this)) {
                this.f121570b.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f121571c);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            SubscriptionHelper.cancel(this.f121571c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121570b.onComplete();
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f121571c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121570b.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            SubscriptionHelper.cancel(this.f121571c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121570b.onSuccess(t10);
            }
        }
    }

    public MaybeTakeUntilPublisher(io.reactivex.w<T> wVar, org.reactivestreams.c<U> cVar) {
        super(wVar);
        this.f121569c = cVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(tVar);
        tVar.onSubscribe(takeUntilMainMaybeObserver);
        this.f121569c.g(takeUntilMainMaybeObserver.f121571c);
        this.f121618b.f(takeUntilMainMaybeObserver);
    }
}

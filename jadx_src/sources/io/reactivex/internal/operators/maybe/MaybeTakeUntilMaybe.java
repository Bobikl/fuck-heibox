package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTakeUntilMaybe<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<U> f121565c;

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TakeUntilOtherMaybeObserver<U> f121567c = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final TakeUntilMainMaybeObserver<?, U> f121568b;

            TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.f121568b = takeUntilMainMaybeObserver;
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f121568b.a();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f121568b.b(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(Object obj) {
                this.f121568b.a();
            }
        }

        TakeUntilMainMaybeObserver(io.reactivex.t<? super T> tVar) {
            this.f121566b = tVar;
        }

        void a() {
            if (DisposableHelper.dispose(this)) {
                this.f121566b.onComplete();
            }
        }

        void b(Throwable th2) {
            if (DisposableHelper.dispose(this)) {
                this.f121566b.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f121567c);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            DisposableHelper.dispose(this.f121567c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121566b.onComplete();
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f121567c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121566b.onError(th2);
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
            DisposableHelper.dispose(this.f121567c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121566b.onSuccess(t10);
            }
        }
    }

    public MaybeTakeUntilMaybe(io.reactivex.w<T> wVar, io.reactivex.w<U> wVar2) {
        super(wVar);
        this.f121565c = wVar2;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(tVar);
        tVar.onSubscribe(takeUntilMainMaybeObserver);
        this.f121565c.f(takeUntilMainMaybeObserver.f121567c);
        this.f121618b.f(takeUntilMainMaybeObserver);
    }
}

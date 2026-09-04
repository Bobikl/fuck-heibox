package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTimeoutMaybe<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<U> f121573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.w<? extends T> f121574d;

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121575b;

        TimeoutFallbackMaybeObserver(io.reactivex.t<? super T> tVar) {
            this.f121575b = tVar;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121575b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121575b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121575b.onSuccess(t10);
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeoutOtherMaybeObserver<T, U> f121577c = new TimeoutOtherMaybeObserver<>(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.w<? extends T> f121578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final TimeoutFallbackMaybeObserver<T> f121579e;

        TimeoutMainMaybeObserver(io.reactivex.t<? super T> tVar, io.reactivex.w<? extends T> wVar) {
            this.f121576b = tVar;
            this.f121578d = wVar;
            this.f121579e = wVar != null ? new TimeoutFallbackMaybeObserver<>(tVar) : null;
        }

        public void a() {
            if (DisposableHelper.dispose(this)) {
                io.reactivex.w<? extends T> wVar = this.f121578d;
                if (wVar == null) {
                    this.f121576b.onError(new TimeoutException());
                } else {
                    wVar.f(this.f121579e);
                }
            }
        }

        public void b(Throwable th2) {
            if (DisposableHelper.dispose(this)) {
                this.f121576b.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f121577c);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.f121579e;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.dispose(timeoutFallbackMaybeObserver);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            DisposableHelper.dispose(this.f121577c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121576b.onComplete();
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f121577c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121576b.onError(th2);
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
            DisposableHelper.dispose(this.f121577c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121576b.onSuccess(t10);
            }
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TimeoutMainMaybeObserver<T, U> f121580b;

        TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.f121580b = timeoutMainMaybeObserver;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121580b.a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121580b.b(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(Object obj) {
            this.f121580b.a();
        }
    }

    public MaybeTimeoutMaybe(io.reactivex.w<T> wVar, io.reactivex.w<U> wVar2, io.reactivex.w<? extends T> wVar3) {
        super(wVar);
        this.f121573c = wVar2;
        this.f121574d = wVar3;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(tVar, this.f121574d);
        tVar.onSubscribe(timeoutMainMaybeObserver);
        this.f121573c.f(timeoutMainMaybeObserver.f121577c);
        this.f121618b.f(timeoutMainMaybeObserver);
    }
}

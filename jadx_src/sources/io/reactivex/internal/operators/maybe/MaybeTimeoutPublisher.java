package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTimeoutPublisher<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<U> f121581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.w<? extends T> f121582d;

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121583b;

        TimeoutFallbackMaybeObserver(io.reactivex.t<? super T> tVar) {
            this.f121583b = tVar;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121583b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121583b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121583b.onSuccess(t10);
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeoutOtherMaybeObserver<T, U> f121585c = new TimeoutOtherMaybeObserver<>(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.w<? extends T> f121586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final TimeoutFallbackMaybeObserver<T> f121587e;

        TimeoutMainMaybeObserver(io.reactivex.t<? super T> tVar, io.reactivex.w<? extends T> wVar) {
            this.f121584b = tVar;
            this.f121586d = wVar;
            this.f121587e = wVar != null ? new TimeoutFallbackMaybeObserver<>(tVar) : null;
        }

        public void a() {
            if (DisposableHelper.dispose(this)) {
                io.reactivex.w<? extends T> wVar = this.f121586d;
                if (wVar == null) {
                    this.f121584b.onError(new TimeoutException());
                } else {
                    wVar.f(this.f121587e);
                }
            }
        }

        public void b(Throwable th2) {
            if (DisposableHelper.dispose(this)) {
                this.f121584b.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f121585c);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.f121587e;
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
            SubscriptionHelper.cancel(this.f121585c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121584b.onComplete();
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f121585c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121584b.onError(th2);
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
            SubscriptionHelper.cancel(this.f121585c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f121584b.onSuccess(t10);
            }
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TimeoutMainMaybeObserver<T, U> f121588b;

        TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.f121588b = timeoutMainMaybeObserver;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121588b.a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121588b.b(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            get().cancel();
            this.f121588b.a();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public MaybeTimeoutPublisher(io.reactivex.w<T> wVar, org.reactivestreams.c<U> cVar, io.reactivex.w<? extends T> wVar2) {
        super(wVar);
        this.f121581c = cVar;
        this.f121582d = wVar2;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(tVar, this.f121582d);
        tVar.onSubscribe(timeoutMainMaybeObserver);
        this.f121581c.g(timeoutMainMaybeObserver.f121585c);
        this.f121618b.f(timeoutMainMaybeObserver);
    }
}

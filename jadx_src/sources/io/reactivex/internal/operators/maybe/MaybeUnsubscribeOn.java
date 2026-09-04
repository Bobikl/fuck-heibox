package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeUnsubscribeOn<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f121597c;

    public static final class UnsubscribeOnMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.h0 f121599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121600d;

        UnsubscribeOnMaybeObserver(io.reactivex.t<? super T> tVar, io.reactivex.h0 h0Var) {
            this.f121598b = tVar;
            this.f121599c = h0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            io.reactivex.disposables.b andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f121600d = andSet;
                this.f121599c.f(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121598b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121598b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f121598b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121598b.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f121600d.dispose();
        }
    }

    public MaybeUnsubscribeOn(io.reactivex.w<T> wVar, io.reactivex.h0 h0Var) {
        super(wVar);
        this.f121597c = h0Var;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new UnsubscribeOnMaybeObserver(tVar, this.f121597c));
    }
}

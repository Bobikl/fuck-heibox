package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeObserveOn<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f121537c;

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.h0 f121539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f121540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f121541e;

        ObserveOnMaybeObserver(io.reactivex.t<? super T> tVar, io.reactivex.h0 h0Var) {
            this.f121538b = tVar;
            this.f121539c = h0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            DisposableHelper.replace(this, this.f121539c.f(this));
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121541e = th2;
            DisposableHelper.replace(this, this.f121539c.f(this));
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f121538b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121540d = t10;
            DisposableHelper.replace(this, this.f121539c.f(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f121541e;
            if (th2 != null) {
                this.f121541e = null;
                this.f121538b.onError(th2);
                return;
            }
            T t10 = this.f121540d;
            if (t10 == null) {
                this.f121538b.onComplete();
            } else {
                this.f121540d = null;
                this.f121538b.onSuccess(t10);
            }
        }
    }

    public MaybeObserveOn(io.reactivex.w<T> wVar, io.reactivex.h0 h0Var) {
        super(wVar);
        this.f121537c = h0Var;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new ObserveOnMaybeObserver(tVar, this.f121537c));
    }
}

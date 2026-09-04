package io.reactivex.internal.operators.completable;

import io.reactivex.h0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableObserveOn extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h0 f119752c;

    public static final class ObserveOnCompletableObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h0 f119754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Throwable f119755d;

        ObserveOnCompletableObserver(io.reactivex.d dVar, h0 h0Var) {
            this.f119753b = dVar;
            this.f119754c = h0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.d
        public void onComplete() {
            DisposableHelper.replace(this, this.f119754c.f(this));
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119755d = th2;
            DisposableHelper.replace(this, this.f119754c.f(this));
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f119753b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f119755d;
            if (th2 == null) {
                this.f119753b.onComplete();
            } else {
                this.f119755d = null;
                this.f119753b.onError(th2);
            }
        }
    }

    public CompletableObserveOn(io.reactivex.g gVar, h0 h0Var) {
        this.f119751b = gVar;
        this.f119752c = h0Var;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119751b.d(new ObserveOnCompletableObserver(dVar, this.f119752c));
    }
}

package io.reactivex.internal.operators.mixed;

import io.reactivex.d;
import io.reactivex.e0;
import io.reactivex.g;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableAndThenObservable<R> extends z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final g f121725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e0<? extends R> f121726c;

    public static final class AndThenObservableObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements g0<R>, d, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super R> f121727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e0<? extends R> f121728c;

        AndThenObservableObserver(g0<? super R> g0Var, e0<? extends R> e0Var) {
            this.f121728c = e0Var;
            this.f121727b = g0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            e0<? extends R> e0Var = this.f121728c;
            if (e0Var == null) {
                this.f121727b.onComplete();
            } else {
                this.f121728c = null;
                e0Var.g(this);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f121727b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(R r10) {
            this.f121727b.onNext(r10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this, bVar);
        }
    }

    public CompletableAndThenObservable(g gVar, e0<? extends R> e0Var) {
        this.f121725b = gVar;
        this.f121726c = e0Var;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super R> g0Var) {
        AndThenObservableObserver andThenObservableObserver = new AndThenObservableObserver(g0Var, this.f121726c);
        g0Var.onSubscribe(andThenObservableObserver);
        this.f121725b.d(andThenObservableObserver);
    }
}

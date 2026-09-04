package io.reactivex.internal.operators.single;

import io.reactivex.h0;
import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleObserveOn<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h0 f123428c;

    public static final class ObserveOnSingleObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h0 f123430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f123431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f123432e;

        ObserveOnSingleObserver(l0<? super T> l0Var, h0 h0Var) {
            this.f123429b = l0Var;
            this.f123430c = h0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123432e = th2;
            DisposableHelper.replace(this, this.f123430c.f(this));
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f123429b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123431d = t10;
            DisposableHelper.replace(this, this.f123430c.f(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f123432e;
            if (th2 != null) {
                this.f123429b.onError(th2);
            } else {
                this.f123429b.onSuccess(this.f123431d);
            }
        }
    }

    public SingleObserveOn(o0<T> o0Var, h0 h0Var) {
        this.f123427b = o0Var;
        this.f123428c = h0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123427b.f(new ObserveOnSingleObserver(l0Var, this.f123428c));
    }
}

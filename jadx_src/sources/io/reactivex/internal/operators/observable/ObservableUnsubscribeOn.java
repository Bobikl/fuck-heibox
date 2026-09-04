package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableUnsubscribeOn<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f122679c;

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1015244841293359600L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.h0 f122681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122682d;

        public final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeObserver.this.f122682d.dispose();
            }
        }

        UnsubscribeObserver(io.reactivex.g0<? super T> g0Var, io.reactivex.h0 h0Var) {
            this.f122680b = g0Var;
            this.f122681c = h0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f122681c.f(new a());
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f122680b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (get()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122680b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f122680b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122682d, bVar)) {
                this.f122682d = bVar;
                this.f122680b.onSubscribe(this);
            }
        }
    }

    public ObservableUnsubscribeOn(io.reactivex.e0<T> e0Var, io.reactivex.h0 h0Var) {
        super(e0Var);
        this.f122679c = h0Var;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new UnsubscribeObserver(g0Var, this.f122679c));
    }
}

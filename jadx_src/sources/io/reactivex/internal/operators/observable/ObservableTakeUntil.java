package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTakeUntil<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<? extends U> f122606c;

    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1418547743690811973L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122608c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TakeUntilMainObserver<T, U>.OtherObserver f122609d = new OtherObserver();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f122610e = new AtomicThrowable();

        public final class OtherObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            OtherObserver() {
            }

            @Override // io.reactivex.g0
            public void onComplete() {
                TakeUntilMainObserver.this.a();
            }

            @Override // io.reactivex.g0
            public void onError(Throwable th2) {
                TakeUntilMainObserver.this.b(th2);
            }

            @Override // io.reactivex.g0
            public void onNext(U u10) {
                DisposableHelper.dispose(this);
                TakeUntilMainObserver.this.a();
            }

            @Override // io.reactivex.g0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        TakeUntilMainObserver(io.reactivex.g0<? super T> g0Var) {
            this.f122607b = g0Var;
        }

        void a() {
            DisposableHelper.dispose(this.f122608c);
            io.reactivex.internal.util.g.a(this.f122607b, this, this.f122610e);
        }

        void b(Throwable th2) {
            DisposableHelper.dispose(this.f122608c);
            io.reactivex.internal.util.g.c(this.f122607b, th2, this, this.f122610e);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122608c);
            DisposableHelper.dispose(this.f122609d);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f122608c.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            DisposableHelper.dispose(this.f122609d);
            io.reactivex.internal.util.g.a(this.f122607b, this, this.f122610e);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f122609d);
            io.reactivex.internal.util.g.c(this.f122607b, th2, this, this.f122610e);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            io.reactivex.internal.util.g.e(this.f122607b, t10, this, this.f122610e);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122608c, bVar);
        }
    }

    public ObservableTakeUntil(io.reactivex.e0<T> e0Var, io.reactivex.e0<? extends U> e0Var2) {
        super(e0Var);
        this.f122606c = e0Var2;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(g0Var);
        g0Var.onSubscribe(takeUntilMainObserver);
        this.f122606c.g(takeUntilMainObserver.f122609d);
        this.f122785b.g(takeUntilMainObserver);
    }
}

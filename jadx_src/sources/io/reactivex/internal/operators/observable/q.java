package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableCountSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class q<T> extends io.reactivex.i0<Long> implements lh.d<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f123030b;

    /* JADX INFO: compiled from: ObservableCountSingle.java */
    public static final class a implements io.reactivex.g0<Object>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super Long> f123031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f123033d;

        a(io.reactivex.l0<? super Long> l0Var) {
            this.f123031b = l0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123032c.dispose();
            this.f123032c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123032c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123032c = DisposableHelper.DISPOSED;
            this.f123031b.onSuccess(Long.valueOf(this.f123033d));
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123032c = DisposableHelper.DISPOSED;
            this.f123031b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(Object obj) {
            this.f123033d++;
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123032c, bVar)) {
                this.f123032c = bVar;
                this.f123031b.onSubscribe(this);
            }
        }
    }

    public q(io.reactivex.e0<T> e0Var) {
        this.f123030b = e0Var;
    }

    @Override // lh.d
    public io.reactivex.z<Long> a() {
        return io.reactivex.plugins.a.R(new p(this.f123030b));
    }

    @Override // io.reactivex.i0
    public void c1(io.reactivex.l0<? super Long> l0Var) {
        this.f123030b.g(new a(l0Var));
    }
}

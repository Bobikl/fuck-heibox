package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableCount.java */
/* JADX INFO: loaded from: classes5.dex */
public final class p<T> extends io.reactivex.internal.operators.observable.a<T, Long> {

    /* JADX INFO: compiled from: ObservableCount.java */
    public static final class a implements io.reactivex.g0<Object>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super Long> f123012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f123014d;

        a(io.reactivex.g0<? super Long> g0Var) {
            this.f123012b = g0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123013c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123013c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123012b.onNext(Long.valueOf(this.f123014d));
            this.f123012b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123012b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(Object obj) {
            this.f123014d++;
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123013c, bVar)) {
                this.f123013c = bVar;
                this.f123012b.onSubscribe(this);
            }
        }
    }

    public p(io.reactivex.e0<T> e0Var) {
        super(e0Var);
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super Long> g0Var) {
        this.f122785b.g(new a(g0Var));
    }
}

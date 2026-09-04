package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableIgnoreElements.java */
/* JADX INFO: loaded from: classes5.dex */
public final class r0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: compiled from: ObservableIgnoreElements.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123052c;

        a(io.reactivex.g0<? super T> g0Var) {
            this.f123051b = g0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123052c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123052c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123051b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123051b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123052c = bVar;
            this.f123051b.onSubscribe(this);
        }
    }

    public r0(io.reactivex.e0<T> e0Var) {
        super(e0Var);
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var));
    }
}

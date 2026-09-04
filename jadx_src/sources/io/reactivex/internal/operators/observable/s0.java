package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableIgnoreElementsCompletable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class s0<T> extends io.reactivex.a implements lh.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f123059b;

    /* JADX INFO: compiled from: ObservableIgnoreElementsCompletable.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f123060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123061c;

        a(io.reactivex.d dVar) {
            this.f123060b = dVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123061c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123061c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123060b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123060b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123061c = bVar;
            this.f123060b.onSubscribe(this);
        }
    }

    public s0(io.reactivex.e0<T> e0Var) {
        this.f123059b = e0Var;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        this.f123059b.g(new a(dVar));
    }

    @Override // lh.d
    public io.reactivex.z<T> a() {
        return io.reactivex.plugins.a.R(new r0(this.f123059b));
    }
}

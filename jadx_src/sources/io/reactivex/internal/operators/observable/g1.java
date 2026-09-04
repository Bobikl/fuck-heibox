package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableScan.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<T, T, T> f122892c;

    /* JADX INFO: compiled from: ObservableScan.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<T, T, T> f122894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        T f122896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122897f;

        a(io.reactivex.g0<? super T> g0Var, kh.c<T, T, T> cVar) {
            this.f122893b = g0Var;
            this.f122894c = cVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122895d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122895d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122897f) {
                return;
            }
            this.f122897f = true;
            this.f122893b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122897f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122897f = true;
                this.f122893b.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122897f) {
                return;
            }
            io.reactivex.g0<? super T> g0Var = this.f122893b;
            T t11 = this.f122896e;
            if (t11 == null) {
                this.f122896e = t10;
                g0Var.onNext(t10);
                return;
            }
            try {
                ?? r10 = (T) io.reactivex.internal.functions.a.g(this.f122894c.apply(t11, t10), "The value returned by the accumulator is null");
                this.f122896e = r10;
                g0Var.onNext(r10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122895d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122895d, bVar)) {
                this.f122895d = bVar;
                this.f122893b.onSubscribe(this);
            }
        }
    }

    public g1(io.reactivex.e0<T> e0Var, kh.c<T, T, T> cVar) {
        super(e0Var);
        this.f122892c = cVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f122892c));
    }
}

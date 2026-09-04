package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableReduceMaybe.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d1<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<T, T, T> f122849c;

    /* JADX INFO: compiled from: ObservableReduceMaybe.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f122850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<T, T, T> f122851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f122852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        T f122853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f122854f;

        a(io.reactivex.t<? super T> tVar, kh.c<T, T, T> cVar) {
            this.f122850b = tVar;
            this.f122851c = cVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122854f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122854f.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122852d) {
                return;
            }
            this.f122852d = true;
            T t10 = this.f122853e;
            this.f122853e = null;
            if (t10 != null) {
                this.f122850b.onSuccess(t10);
            } else {
                this.f122850b.onComplete();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122852d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122852d = true;
            this.f122853e = null;
            this.f122850b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122852d) {
                return;
            }
            T t11 = this.f122853e;
            if (t11 == null) {
                this.f122853e = t10;
                return;
            }
            try {
                this.f122853e = (T) io.reactivex.internal.functions.a.g(this.f122851c.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122854f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122854f, bVar)) {
                this.f122854f = bVar;
                this.f122850b.onSubscribe(this);
            }
        }
    }

    public d1(io.reactivex.e0<T> e0Var, kh.c<T, T, T> cVar) {
        this.f122848b = e0Var;
        this.f122849c = cVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f122848b.g(new a(tVar, this.f122849c));
    }
}

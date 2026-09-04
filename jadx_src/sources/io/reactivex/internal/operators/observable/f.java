package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAllSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f<T> extends io.reactivex.i0<Boolean> implements lh.d<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f122877c;

    /* JADX INFO: compiled from: ObservableAllSingle.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super Boolean> f122878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f122879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122881e;

        a(io.reactivex.l0<? super Boolean> l0Var, kh.r<? super T> rVar) {
            this.f122878b = l0Var;
            this.f122879c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122880d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122880d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122881e) {
                return;
            }
            this.f122881e = true;
            this.f122878b.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122881e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122881e = true;
                this.f122878b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122881e) {
                return;
            }
            try {
                if (this.f122879c.test(t10)) {
                    return;
                }
                this.f122881e = true;
                this.f122880d.dispose();
                this.f122878b.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122880d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122880d, bVar)) {
                this.f122880d = bVar;
                this.f122878b.onSubscribe(this);
            }
        }
    }

    public f(io.reactivex.e0<T> e0Var, kh.r<? super T> rVar) {
        this.f122876b = e0Var;
        this.f122877c = rVar;
    }

    @Override // lh.d
    public io.reactivex.z<Boolean> a() {
        return io.reactivex.plugins.a.R(new e(this.f122876b, this.f122877c));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super Boolean> l0Var) {
        this.f122876b.g(new a(l0Var, this.f122877c));
    }
}

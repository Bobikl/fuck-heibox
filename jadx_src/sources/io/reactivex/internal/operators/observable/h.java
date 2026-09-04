package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAnySingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class h<T> extends io.reactivex.i0<Boolean> implements lh.d<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f122899c;

    /* JADX INFO: compiled from: ObservableAnySingle.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super Boolean> f122900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f122901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122903e;

        a(io.reactivex.l0<? super Boolean> l0Var, kh.r<? super T> rVar) {
            this.f122900b = l0Var;
            this.f122901c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122902d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122902d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122903e) {
                return;
            }
            this.f122903e = true;
            this.f122900b.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122903e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122903e = true;
                this.f122900b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122903e) {
                return;
            }
            try {
                if (this.f122901c.test(t10)) {
                    this.f122903e = true;
                    this.f122902d.dispose();
                    this.f122900b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122902d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122902d, bVar)) {
                this.f122902d = bVar;
                this.f122900b.onSubscribe(this);
            }
        }
    }

    public h(io.reactivex.e0<T> e0Var, kh.r<? super T> rVar) {
        this.f122898b = e0Var;
        this.f122899c = rVar;
    }

    @Override // lh.d
    public io.reactivex.z<Boolean> a() {
        return io.reactivex.plugins.a.R(new g(this.f122898b, this.f122899c));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super Boolean> l0Var) {
        this.f122898b.g(new a(l0Var, this.f122899c));
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSkipWhile.java */
/* JADX INFO: loaded from: classes5.dex */
public final class n1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f122993c;

    /* JADX INFO: compiled from: ObservableSkipWhile.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f122995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122997e;

        a(io.reactivex.g0<? super T> g0Var, kh.r<? super T> rVar) {
            this.f122994b = g0Var;
            this.f122995c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122996d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122996d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122994b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122994b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122997e) {
                this.f122994b.onNext(t10);
                return;
            }
            try {
                if (this.f122995c.test(t10)) {
                    return;
                }
                this.f122997e = true;
                this.f122994b.onNext(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122996d.dispose();
                this.f122994b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122996d, bVar)) {
                this.f122996d = bVar;
                this.f122994b.onSubscribe(this);
            }
        }
    }

    public n1(io.reactivex.e0<T> e0Var, kh.r<? super T> rVar) {
        super(e0Var);
        this.f122993c = rVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f122993c));
    }
}

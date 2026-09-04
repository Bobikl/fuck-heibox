package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableTakeWhile.java */
/* JADX INFO: loaded from: classes5.dex */
public final class s1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f123062c;

    /* JADX INFO: compiled from: ObservableTakeWhile.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f123064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123066e;

        a(io.reactivex.g0<? super T> g0Var, kh.r<? super T> rVar) {
            this.f123063b = g0Var;
            this.f123064c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123065d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123065d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123066e) {
                return;
            }
            this.f123066e = true;
            this.f123063b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f123066e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123066e = true;
                this.f123063b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f123066e) {
                return;
            }
            try {
                if (this.f123064c.test(t10)) {
                    this.f123063b.onNext(t10);
                    return;
                }
                this.f123066e = true;
                this.f123065d.dispose();
                this.f123063b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123065d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123065d, bVar)) {
                this.f123065d = bVar;
                this.f123063b.onSubscribe(this);
            }
        }
    }

    public s1(io.reactivex.e0<T> e0Var, kh.r<? super T> rVar) {
        super(e0Var);
        this.f123062c = rVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f123062c));
    }
}

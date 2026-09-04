package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableTakeUntilPredicate.java */
/* JADX INFO: loaded from: classes5.dex */
public final class r1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f123053c;

    /* JADX INFO: compiled from: ObservableTakeUntilPredicate.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f123055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123057e;

        a(io.reactivex.g0<? super T> g0Var, kh.r<? super T> rVar) {
            this.f123054b = g0Var;
            this.f123055c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123056d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123056d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123057e) {
                return;
            }
            this.f123057e = true;
            this.f123054b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f123057e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123057e = true;
                this.f123054b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f123057e) {
                return;
            }
            this.f123054b.onNext(t10);
            try {
                if (this.f123055c.test(t10)) {
                    this.f123057e = true;
                    this.f123056d.dispose();
                    this.f123054b.onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123056d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123056d, bVar)) {
                this.f123056d = bVar;
                this.f123054b.onSubscribe(this);
            }
        }
    }

    public r1(io.reactivex.e0<T> e0Var, kh.r<? super T> rVar) {
        super(e0Var);
        this.f123053c = rVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f123053c));
    }
}

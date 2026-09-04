package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSingleMaybe.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j1<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122927b;

    /* JADX INFO: compiled from: ObservableSingleMaybe.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f122928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f122929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f122930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122931e;

        a(io.reactivex.t<? super T> tVar) {
            this.f122928b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122929c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122929c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122931e) {
                return;
            }
            this.f122931e = true;
            T t10 = this.f122930d;
            this.f122930d = null;
            if (t10 == null) {
                this.f122928b.onComplete();
            } else {
                this.f122928b.onSuccess(t10);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122931e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122931e = true;
                this.f122928b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122931e) {
                return;
            }
            if (this.f122930d == null) {
                this.f122930d = t10;
                return;
            }
            this.f122931e = true;
            this.f122929c.dispose();
            this.f122928b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122929c, bVar)) {
                this.f122929c = bVar;
                this.f122928b.onSubscribe(this);
            }
        }
    }

    public j1(io.reactivex.e0<T> e0Var) {
        this.f122927b = e0Var;
    }

    @Override // io.reactivex.q
    public void r1(io.reactivex.t<? super T> tVar) {
        this.f122927b.g(new a(tVar));
    }
}

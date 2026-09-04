package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSkipUntil.java */
/* JADX INFO: loaded from: classes5.dex */
public final class m1<T, U> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<U> f122972c;

    /* JADX INFO: compiled from: ObservableSkipUntil.java */
    public final class a implements io.reactivex.g0<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayCompositeDisposable f122973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b<T> f122974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.observers.l<T> f122975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f122976e;

        a(ArrayCompositeDisposable arrayCompositeDisposable, b<T> bVar, io.reactivex.observers.l<T> lVar) {
            this.f122973b = arrayCompositeDisposable;
            this.f122974c = bVar;
            this.f122975d = lVar;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122974c.f122981e = true;
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122973b.dispose();
            this.f122975d.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(U u10) {
            this.f122976e.dispose();
            this.f122974c.f122981e = true;
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122976e, bVar)) {
                this.f122976e = bVar;
                this.f122973b.b(1, bVar);
            }
        }
    }

    /* JADX INFO: compiled from: ObservableSkipUntil.java */
    public static final class b<T> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayCompositeDisposable f122979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f122981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122982f;

        b(io.reactivex.g0<? super T> g0Var, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f122978b = g0Var;
            this.f122979c = arrayCompositeDisposable;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122979c.dispose();
            this.f122978b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122979c.dispose();
            this.f122978b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122982f) {
                this.f122978b.onNext(t10);
            } else if (this.f122981e) {
                this.f122982f = true;
                this.f122978b.onNext(t10);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122980d, bVar)) {
                this.f122980d = bVar;
                this.f122979c.b(0, bVar);
            }
        }
    }

    public m1(io.reactivex.e0<T> e0Var, io.reactivex.e0<U> e0Var2) {
        super(e0Var);
        this.f122972c = e0Var2;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        io.reactivex.observers.l lVar = new io.reactivex.observers.l(g0Var);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        lVar.onSubscribe(arrayCompositeDisposable);
        b bVar = new b(lVar, arrayCompositeDisposable);
        this.f122972c.g(new a(arrayCompositeDisposable, bVar, lVar));
        this.f122785b.g(bVar);
    }
}

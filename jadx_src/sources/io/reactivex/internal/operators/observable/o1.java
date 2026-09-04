package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: ObservableSwitchIfEmpty.java */
/* JADX INFO: loaded from: classes5.dex */
public final class o1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f123007c;

    /* JADX INFO: compiled from: ObservableSwitchIfEmpty.java */
    public static final class a<T> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.e0<? extends T> f123009c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123011e = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final SequentialDisposable f123010d = new SequentialDisposable();

        a(io.reactivex.g0<? super T> g0Var, io.reactivex.e0<? extends T> e0Var) {
            this.f123008b = g0Var;
            this.f123009c = e0Var;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (!this.f123011e) {
                this.f123008b.onComplete();
            } else {
                this.f123011e = false;
                this.f123009c.g(this);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123008b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f123011e) {
                this.f123011e = false;
            }
            this.f123008b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123010d.b(bVar);
        }
    }

    public o1(io.reactivex.e0<T> e0Var, io.reactivex.e0<? extends T> e0Var2) {
        super(e0Var);
        this.f123007c = e0Var2;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        a aVar = new a(g0Var, this.f123007c);
        g0Var.onSubscribe(aVar.f123010d);
        this.f122785b.g(aVar);
    }
}

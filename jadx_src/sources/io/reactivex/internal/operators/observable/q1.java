package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableTakeLastOne.java */
/* JADX INFO: loaded from: classes5.dex */
public final class q1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: compiled from: ObservableTakeLastOne.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f123038d;

        a(io.reactivex.g0<? super T> g0Var) {
            this.f123036b = g0Var;
        }

        void a() {
            T t10 = this.f123038d;
            if (t10 != null) {
                this.f123038d = null;
                this.f123036b.onNext(t10);
            }
            this.f123036b.onComplete();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123038d = null;
            this.f123037c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123037c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123038d = null;
            this.f123036b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f123038d = t10;
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123037c, bVar)) {
                this.f123037c = bVar;
                this.f123036b.onSubscribe(this);
            }
        }
    }

    public q1(io.reactivex.e0<T> e0Var) {
        super(e0Var);
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var));
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: ObservableDelaySubscriptionOther.java */
/* JADX INFO: loaded from: classes5.dex */
public final class u<T, U> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f123090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<U> f123091c;

    /* JADX INFO: compiled from: ObservableDelaySubscriptionOther.java */
    public final class a implements io.reactivex.g0<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SequentialDisposable f123092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f123094d;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableDelaySubscriptionOther.java */
        public final class C1103a implements io.reactivex.g0<T> {
            C1103a() {
            }

            @Override // io.reactivex.g0
            public void onComplete() {
                a.this.f123093c.onComplete();
            }

            @Override // io.reactivex.g0
            public void onError(Throwable th2) {
                a.this.f123093c.onError(th2);
            }

            @Override // io.reactivex.g0
            public void onNext(T t10) {
                a.this.f123093c.onNext(t10);
            }

            @Override // io.reactivex.g0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                a.this.f123092b.b(bVar);
            }
        }

        a(SequentialDisposable sequentialDisposable, io.reactivex.g0<? super T> g0Var) {
            this.f123092b = sequentialDisposable;
            this.f123093c = g0Var;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123094d) {
                return;
            }
            this.f123094d = true;
            u.this.f123090b.g(new C1103a());
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f123094d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123094d = true;
                this.f123093c.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(U u10) {
            onComplete();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123092b.b(bVar);
        }
    }

    public u(io.reactivex.e0<? extends T> e0Var, io.reactivex.e0<U> e0Var2) {
        this.f123090b = e0Var;
        this.f123091c = e0Var2;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        g0Var.onSubscribe(sequentialDisposable);
        this.f123091c.g(new a(sequentialDisposable, g0Var));
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableToList.java */
/* JADX INFO: loaded from: classes5.dex */
public final class u1<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<U> f123101c;

    /* JADX INFO: compiled from: ObservableToList.java */
    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super U> f123102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        U f123104d;

        a(io.reactivex.g0<? super U> g0Var, U u10) {
            this.f123102b = g0Var;
            this.f123104d = u10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123103c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123103c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            U u10 = this.f123104d;
            this.f123104d = null;
            this.f123102b.onNext(u10);
            this.f123102b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123104d = null;
            this.f123102b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f123104d.add(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123103c, bVar)) {
                this.f123103c = bVar;
                this.f123102b.onSubscribe(this);
            }
        }
    }

    public u1(io.reactivex.e0<T> e0Var, int i10) {
        super(e0Var);
        this.f123101c = Functions.f(i10);
    }

    public u1(io.reactivex.e0<T> e0Var, Callable<U> callable) {
        super(e0Var);
        this.f123101c = callable;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super U> g0Var) {
        try {
            this.f122785b.g(new a(g0Var, (Collection) io.reactivex.internal.functions.a.g(this.f123101c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, g0Var);
        }
    }
}

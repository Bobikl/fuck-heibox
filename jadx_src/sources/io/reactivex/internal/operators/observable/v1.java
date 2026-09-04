package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableToListSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class v1<T, U extends Collection<? super T>> extends io.reactivex.i0<U> implements lh.d<U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f123116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<U> f123117c;

    /* JADX INFO: compiled from: ObservableToListSingle.java */
    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super U> f123118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        U f123119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123120d;

        a(io.reactivex.l0<? super U> l0Var, U u10) {
            this.f123118b = l0Var;
            this.f123119c = u10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123120d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123120d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            U u10 = this.f123119c;
            this.f123119c = null;
            this.f123118b.onSuccess(u10);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123119c = null;
            this.f123118b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f123119c.add(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123120d, bVar)) {
                this.f123120d = bVar;
                this.f123118b.onSubscribe(this);
            }
        }
    }

    public v1(io.reactivex.e0<T> e0Var, int i10) {
        this.f123116b = e0Var;
        this.f123117c = Functions.f(i10);
    }

    public v1(io.reactivex.e0<T> e0Var, Callable<U> callable) {
        this.f123116b = e0Var;
        this.f123117c = callable;
    }

    @Override // lh.d
    public io.reactivex.z<U> a() {
        return io.reactivex.plugins.a.R(new u1(this.f123116b, this.f123117c));
    }

    @Override // io.reactivex.i0
    public void c1(io.reactivex.l0<? super U> l0Var) {
        try {
            this.f123116b.g(new a(l0Var, (Collection) io.reactivex.internal.functions.a.g(this.f123117c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, l0Var);
        }
    }
}

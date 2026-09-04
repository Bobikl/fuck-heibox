package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableScanSeed.java */
/* JADX INFO: loaded from: classes5.dex */
public final class h1<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<R, ? super T, R> f122906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<R> f122907d;

    /* JADX INFO: compiled from: ObservableScanSeed.java */
    public static final class a<T, R> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<R, ? super T, R> f122909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        R f122910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f122911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122912f;

        a(io.reactivex.g0<? super R> g0Var, kh.c<R, ? super T, R> cVar, R r10) {
            this.f122908b = g0Var;
            this.f122909c = cVar;
            this.f122910d = r10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122911e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122911e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122912f) {
                return;
            }
            this.f122912f = true;
            this.f122908b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122912f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122912f = true;
                this.f122908b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122912f) {
                return;
            }
            try {
                R r10 = (R) io.reactivex.internal.functions.a.g(this.f122909c.apply(this.f122910d, t10), "The accumulator returned a null value");
                this.f122910d = r10;
                this.f122908b.onNext(r10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122911e.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122911e, bVar)) {
                this.f122911e = bVar;
                this.f122908b.onSubscribe(this);
                this.f122908b.onNext(this.f122910d);
            }
        }
    }

    public h1(io.reactivex.e0<T> e0Var, Callable<R> callable, kh.c<R, ? super T, R> cVar) {
        super(e0Var);
        this.f122906c = cVar;
        this.f122907d = callable;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super R> g0Var) {
        try {
            this.f122785b.g(new a(g0Var, this.f122906c, io.reactivex.internal.functions.a.g(this.f122907d.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, g0Var);
        }
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableMapNotification.java */
/* JADX INFO: loaded from: classes5.dex */
public final class y0<T, R> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.e0<? extends R>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.e0<? extends R>> f123158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends io.reactivex.e0<? extends R>> f123159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<? extends io.reactivex.e0<? extends R>> f123160e;

    /* JADX INFO: compiled from: ObservableMapNotification.java */
    public static final class a<T, R> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super io.reactivex.e0<? extends R>> f123161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<? extends R>> f123162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends io.reactivex.e0<? extends R>> f123163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Callable<? extends io.reactivex.e0<? extends R>> f123164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f123165f;

        a(io.reactivex.g0<? super io.reactivex.e0<? extends R>> g0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends R>> oVar, kh.o<? super Throwable, ? extends io.reactivex.e0<? extends R>> oVar2, Callable<? extends io.reactivex.e0<? extends R>> callable) {
            this.f123161b = g0Var;
            this.f123162c = oVar;
            this.f123163d = oVar2;
            this.f123164e = callable;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123165f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123165f.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            try {
                this.f123161b.onNext((io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f123164e.call(), "The onComplete ObservableSource returned is null"));
                this.f123161b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123161b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            try {
                this.f123161b.onNext((io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f123163d.apply(th2), "The onError ObservableSource returned is null"));
                this.f123161b.onComplete();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f123161b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            try {
                this.f123161b.onNext((io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f123162c.apply(t10), "The onNext ObservableSource returned is null"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123161b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123165f, bVar)) {
                this.f123165f = bVar;
                this.f123161b.onSubscribe(this);
            }
        }
    }

    public y0(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends R>> oVar, kh.o<? super Throwable, ? extends io.reactivex.e0<? extends R>> oVar2, Callable<? extends io.reactivex.e0<? extends R>> callable) {
        super(e0Var);
        this.f123158c = oVar;
        this.f123159d = oVar2;
        this.f123160e = callable;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super io.reactivex.e0<? extends R>> g0Var) {
        this.f122785b.g(new a(g0Var, this.f123158c, this.f123159d, this.f123160e));
    }
}

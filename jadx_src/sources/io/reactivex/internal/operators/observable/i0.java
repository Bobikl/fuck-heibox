package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Iterator;

/* JADX INFO: compiled from: ObservableFlattenIterable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i0<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends Iterable<? extends R>> f122917c;

    /* JADX INFO: compiled from: ObservableFlattenIterable.java */
    public static final class a<T, R> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends Iterable<? extends R>> f122919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122920d;

        a(io.reactivex.g0<? super R> g0Var, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f122918b = g0Var;
            this.f122919c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122920d.dispose();
            this.f122920d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122920d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            io.reactivex.disposables.b bVar = this.f122920d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            this.f122920d = disposableHelper;
            this.f122918b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            io.reactivex.disposables.b bVar = this.f122920d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122920d = disposableHelper;
                this.f122918b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122920d == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f122919c.apply(t10).iterator();
                io.reactivex.g0<? super R> g0Var = this.f122918b;
                while (it.hasNext()) {
                    try {
                        try {
                            g0Var.onNext((Object) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            this.f122920d.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        this.f122920d.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                this.f122920d.dispose();
                onError(th4);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122920d, bVar)) {
                this.f122920d = bVar;
                this.f122918b.onSubscribe(this);
            }
        }
    }

    public i0(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(e0Var);
        this.f122917c = oVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super R> g0Var) {
        this.f122785b.g(new a(g0Var, this.f122917c));
    }
}

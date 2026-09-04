package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableDematerialize.java */
/* JADX INFO: loaded from: classes5.dex */
public final class v<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.y<R>> f123105c;

    /* JADX INFO: compiled from: ObservableDematerialize.java */
    public static final class a<T, R> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f123106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.y<R>> f123107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f123108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f123109e;

        a(io.reactivex.g0<? super R> g0Var, kh.o<? super T, ? extends io.reactivex.y<R>> oVar) {
            this.f123106b = g0Var;
            this.f123107c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123109e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123109e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123108d) {
                return;
            }
            this.f123108d = true;
            this.f123106b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f123108d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123108d = true;
                this.f123106b.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f123108d) {
                if (t10 instanceof io.reactivex.y) {
                    io.reactivex.y yVar = (io.reactivex.y) t10;
                    if (yVar.g()) {
                        io.reactivex.plugins.a.Y(yVar.d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.y yVar2 = (io.reactivex.y) io.reactivex.internal.functions.a.g(this.f123107c.apply(t10), "The selector returned a null Notification");
                if (yVar2.g()) {
                    this.f123109e.dispose();
                    onError(yVar2.d());
                } else if (!yVar2.f()) {
                    this.f123106b.onNext((Object) yVar2.e());
                } else {
                    this.f123109e.dispose();
                    onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123109e.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123109e, bVar)) {
                this.f123109e = bVar;
                this.f123106b.onSubscribe(this);
            }
        }
    }

    public v(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.y<R>> oVar) {
        super(e0Var);
        this.f123105c = oVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super R> g0Var) {
        this.f122785b.g(new a(g0Var, this.f123105c));
    }
}

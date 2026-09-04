package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableReduceSeedSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e1<T, R> extends io.reactivex.i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final R f122870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<R, ? super T, R> f122871d;

    /* JADX INFO: compiled from: ObservableReduceSeedSingle.java */
    public static final class a<T, R> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super R> f122872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<R, ? super T, R> f122873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        R f122874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f122875e;

        a(io.reactivex.l0<? super R> l0Var, kh.c<R, ? super T, R> cVar, R r10) {
            this.f122872b = l0Var;
            this.f122874d = r10;
            this.f122873c = cVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122875e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122875e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            R r10 = this.f122874d;
            if (r10 != null) {
                this.f122874d = null;
                this.f122872b.onSuccess(r10);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122874d == null) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122874d = null;
                this.f122872b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            R r10 = this.f122874d;
            if (r10 != null) {
                try {
                    this.f122874d = (R) io.reactivex.internal.functions.a.g(this.f122873c.apply(r10, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f122875e.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122875e, bVar)) {
                this.f122875e = bVar;
                this.f122872b.onSubscribe(this);
            }
        }
    }

    public e1(io.reactivex.e0<T> e0Var, R r10, kh.c<R, ? super T, R> cVar) {
        this.f122869b = e0Var;
        this.f122870c = r10;
        this.f122871d = cVar;
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super R> l0Var) {
        this.f122869b.g(new a(l0Var, this.f122871d, this.f122870c));
    }
}

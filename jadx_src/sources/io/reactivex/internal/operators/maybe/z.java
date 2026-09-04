package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;

/* JADX INFO: compiled from: MaybeIsEmptySingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class z<T> extends io.reactivex.i0<Boolean> implements lh.f<T>, lh.c<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121722b;

    /* JADX INFO: compiled from: MaybeIsEmptySingle.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super Boolean> f121723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f121724c;

        a(l0<? super Boolean> l0Var) {
            this.f121723b = l0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121724c.dispose();
            this.f121724c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121724c.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121724c = DisposableHelper.DISPOSED;
            this.f121723b.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121724c = DisposableHelper.DISPOSED;
            this.f121723b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121724c, bVar)) {
                this.f121724c = bVar;
                this.f121723b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121724c = DisposableHelper.DISPOSED;
            this.f121723b.onSuccess(Boolean.FALSE);
        }
    }

    public z(io.reactivex.w<T> wVar) {
        this.f121722b = wVar;
    }

    @Override // lh.c
    public io.reactivex.q<Boolean> b() {
        return io.reactivex.plugins.a.Q(new y(this.f121722b));
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super Boolean> l0Var) {
        this.f121722b.f(new a(l0Var));
    }

    @Override // lh.f
    public io.reactivex.w<T> source() {
        return this.f121722b;
    }
}

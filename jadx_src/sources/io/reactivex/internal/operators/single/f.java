package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleDetach.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123518b;

    /* JADX INFO: compiled from: SingleDetach.java */
    public static final class a<T> implements l0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        l0<? super T> f123519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123520c;

        a(l0<? super T> l0Var) {
            this.f123519b = l0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123519b = null;
            this.f123520c.dispose();
            this.f123520c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123520c.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123520c = DisposableHelper.DISPOSED;
            l0<? super T> l0Var = this.f123519b;
            if (l0Var != null) {
                this.f123519b = null;
                l0Var.onError(th2);
            }
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123520c, bVar)) {
                this.f123520c = bVar;
                this.f123519b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123520c = DisposableHelper.DISPOSED;
            l0<? super T> l0Var = this.f123519b;
            if (l0Var != null) {
                this.f123519b = null;
                l0Var.onSuccess(t10);
            }
        }
    }

    public f(o0<T> o0Var) {
        this.f123518b = o0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123518b.f(new a(l0Var));
    }
}

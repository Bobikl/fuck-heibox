package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleHide.java */
/* JADX INFO: loaded from: classes5.dex */
public final class s<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123568b;

    /* JADX INFO: compiled from: SingleHide.java */
    public static final class a<T> implements l0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123570c;

        a(l0<? super T> l0Var) {
            this.f123569b = l0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123570c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123570c.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123569b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123570c, bVar)) {
                this.f123570c = bVar;
                this.f123569b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123569b.onSuccess(t10);
        }
    }

    public s(o0<? extends T> o0Var) {
        this.f123568b = o0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123568b.f(new a(l0Var));
    }
}

package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleDoAfterSuccess.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super T> f123522c;

    /* JADX INFO: compiled from: SingleDoAfterSuccess.java */
    public static final class a<T> implements l0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super T> f123524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123525d;

        a(l0<? super T> l0Var, kh.g<? super T> gVar) {
            this.f123523b = l0Var;
            this.f123524c = gVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123525d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123525d.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123523b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123525d, bVar)) {
                this.f123525d = bVar;
                this.f123523b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123523b.onSuccess(t10);
            try {
                this.f123524c.accept(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    public g(o0<T> o0Var, kh.g<? super T> gVar) {
        this.f123521b = o0Var;
        this.f123522c = gVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123521b.f(new a(l0Var, this.f123522c));
    }
}

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: MaybeFromSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class u<T> extends io.reactivex.q<T> implements lh.i<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f121710b;

    /* JADX INFO: compiled from: MaybeFromSingle.java */
    public static final class a<T> implements l0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f121712c;

        a(io.reactivex.t<? super T> tVar) {
            this.f121711b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121712c.dispose();
            this.f121712c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121712c.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f121712c = DisposableHelper.DISPOSED;
            this.f121711b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121712c, bVar)) {
                this.f121712c = bVar;
                this.f121711b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f121712c = DisposableHelper.DISPOSED;
            this.f121711b.onSuccess(t10);
        }
    }

    public u(o0<T> o0Var) {
        this.f121710b = o0Var;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121710b.f(new a(tVar));
    }

    @Override // lh.i
    public o0<T> source() {
        return this.f121710b;
    }
}

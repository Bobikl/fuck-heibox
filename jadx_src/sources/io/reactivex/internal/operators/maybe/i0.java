package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: MaybeToSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class i0<T> extends io.reactivex.i0<T> implements lh.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f121674c;

    /* JADX INFO: compiled from: MaybeToSingle.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f121675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f121676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121677d;

        a(l0<? super T> l0Var, T t10) {
            this.f121675b = l0Var;
            this.f121676c = t10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121677d.dispose();
            this.f121677d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121677d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121677d = DisposableHelper.DISPOSED;
            T t10 = this.f121676c;
            if (t10 != null) {
                this.f121675b.onSuccess(t10);
            } else {
                this.f121675b.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121677d = DisposableHelper.DISPOSED;
            this.f121675b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121677d, bVar)) {
                this.f121677d = bVar;
                this.f121675b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121677d = DisposableHelper.DISPOSED;
            this.f121675b.onSuccess(t10);
        }
    }

    public i0(io.reactivex.w<T> wVar, T t10) {
        this.f121673b = wVar;
        this.f121674c = t10;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f121673b.f(new a(l0Var, this.f121674c));
    }

    @Override // lh.f
    public io.reactivex.w<T> source() {
        return this.f121673b;
    }
}

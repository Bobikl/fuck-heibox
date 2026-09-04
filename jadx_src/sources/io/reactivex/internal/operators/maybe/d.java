package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;

/* JADX INFO: compiled from: MaybeCount.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d<T> extends io.reactivex.i0<Long> implements lh.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121636b;

    /* JADX INFO: compiled from: MaybeCount.java */
    public static final class a implements io.reactivex.t<Object>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super Long> f121637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f121638c;

        a(l0<? super Long> l0Var) {
            this.f121637b = l0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121638c.dispose();
            this.f121638c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121638c.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121638c = DisposableHelper.DISPOSED;
            this.f121637b.onSuccess(0L);
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121638c = DisposableHelper.DISPOSED;
            this.f121637b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121638c, bVar)) {
                this.f121638c = bVar;
                this.f121637b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(Object obj) {
            this.f121638c = DisposableHelper.DISPOSED;
            this.f121637b.onSuccess(1L);
        }
    }

    public d(io.reactivex.w<T> wVar) {
        this.f121636b = wVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super Long> l0Var) {
        this.f121636b.f(new a(l0Var));
    }

    @Override // lh.f
    public io.reactivex.w<T> source() {
        return this.f121636b;
    }
}

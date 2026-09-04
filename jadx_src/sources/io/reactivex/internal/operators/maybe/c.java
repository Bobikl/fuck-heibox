package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;

/* JADX INFO: compiled from: MaybeContains.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c<T> extends io.reactivex.i0<Boolean> implements lh.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f121628c;

    /* JADX INFO: compiled from: MaybeContains.java */
    public static final class a implements io.reactivex.t<Object>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super Boolean> f121629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f121630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121631d;

        a(l0<? super Boolean> l0Var, Object obj) {
            this.f121629b = l0Var;
            this.f121630c = obj;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121631d.dispose();
            this.f121631d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121631d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121631d = DisposableHelper.DISPOSED;
            this.f121629b.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121631d = DisposableHelper.DISPOSED;
            this.f121629b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121631d, bVar)) {
                this.f121631d = bVar;
                this.f121629b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(Object obj) {
            this.f121631d = DisposableHelper.DISPOSED;
            this.f121629b.onSuccess(Boolean.valueOf(io.reactivex.internal.functions.a.c(obj, this.f121630c)));
        }
    }

    public c(io.reactivex.w<T> wVar, Object obj) {
        this.f121627b = wVar;
        this.f121628c = obj;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super Boolean> l0Var) {
        this.f121627b.f(new a(l0Var, this.f121628c));
    }

    @Override // lh.f
    public io.reactivex.w<T> source() {
        return this.f121627b;
    }
}

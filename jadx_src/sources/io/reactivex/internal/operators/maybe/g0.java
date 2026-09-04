package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeOnErrorReturn.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g0<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends T> f121652c;

    /* JADX INFO: compiled from: MaybeOnErrorReturn.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends T> f121654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121655d;

        a(io.reactivex.t<? super T> tVar, kh.o<? super Throwable, ? extends T> oVar) {
            this.f121653b = tVar;
            this.f121654c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121655d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121655d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121653b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            try {
                this.f121653b.onSuccess(io.reactivex.internal.functions.a.g(this.f121654c.apply(th2), "The valueSupplier returned a null value"));
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f121653b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121655d, bVar)) {
                this.f121655d = bVar;
                this.f121653b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121653b.onSuccess(t10);
        }
    }

    public g0(io.reactivex.w<T> wVar, kh.o<? super Throwable, ? extends T> oVar) {
        super(wVar);
        this.f121652c = oVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new a(tVar, this.f121652c));
    }
}

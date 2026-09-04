package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableOnErrorReturn.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends T> f122827c;

    /* JADX INFO: compiled from: ObservableOnErrorReturn.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends T> f122829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122830d;

        a(io.reactivex.g0<? super T> g0Var, kh.o<? super Throwable, ? extends T> oVar) {
            this.f122828b = g0Var;
            this.f122829c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122830d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122830d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122828b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            try {
                T tApply = this.f122829c.apply(th2);
                if (tApply != null) {
                    this.f122828b.onNext(tApply);
                    this.f122828b.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    this.f122828b.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f122828b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122828b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122830d, bVar)) {
                this.f122830d = bVar;
                this.f122828b.onSubscribe(this);
            }
        }
    }

    public c1(io.reactivex.e0<T> e0Var, kh.o<? super Throwable, ? extends T> oVar) {
        super(e0Var);
        this.f122827c = oVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f122827c));
    }
}

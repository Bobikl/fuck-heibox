package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableSingleSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k1<T> extends io.reactivex.i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f122937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f122938c;

    /* JADX INFO: compiled from: ObservableSingleSingle.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super T> f122939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f122940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        T f122942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122943f;

        a(io.reactivex.l0<? super T> l0Var, T t10) {
            this.f122939b = l0Var;
            this.f122940c = t10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122941d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122941d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122943f) {
                return;
            }
            this.f122943f = true;
            T t10 = this.f122942e;
            this.f122942e = null;
            if (t10 == null) {
                t10 = this.f122940c;
            }
            if (t10 != null) {
                this.f122939b.onSuccess(t10);
            } else {
                this.f122939b.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122943f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122943f = true;
                this.f122939b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122943f) {
                return;
            }
            if (this.f122942e == null) {
                this.f122942e = t10;
                return;
            }
            this.f122943f = true;
            this.f122941d.dispose();
            this.f122939b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122941d, bVar)) {
                this.f122941d = bVar;
                this.f122939b.onSubscribe(this);
            }
        }
    }

    public k1(io.reactivex.e0<? extends T> e0Var, T t10) {
        this.f122937b = e0Var;
        this.f122938c = t10;
    }

    @Override // io.reactivex.i0
    public void c1(io.reactivex.l0<? super T> l0Var) {
        this.f122937b.g(new a(l0Var, this.f122938c));
    }
}

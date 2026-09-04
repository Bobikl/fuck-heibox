package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: ObservableOnErrorNext.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends io.reactivex.e0<? extends T>> f122804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f122805d;

    /* JADX INFO: compiled from: ObservableOnErrorNext.java */
    public static final class a<T> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends io.reactivex.e0<? extends T>> f122807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f122808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final SequentialDisposable f122809e = new SequentialDisposable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f122811g;

        a(io.reactivex.g0<? super T> g0Var, kh.o<? super Throwable, ? extends io.reactivex.e0<? extends T>> oVar, boolean z10) {
            this.f122806b = g0Var;
            this.f122807c = oVar;
            this.f122808d = z10;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122811g) {
                return;
            }
            this.f122811g = true;
            this.f122810f = true;
            this.f122806b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122810f) {
                if (this.f122811g) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                } else {
                    this.f122806b.onError(th2);
                    return;
                }
            }
            this.f122810f = true;
            if (this.f122808d && !(th2 instanceof Exception)) {
                this.f122806b.onError(th2);
                return;
            }
            try {
                io.reactivex.e0<? extends T> e0VarApply = this.f122807c.apply(th2);
                if (e0VarApply != null) {
                    e0VarApply.g(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                this.f122806b.onError(nullPointerException);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f122806b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122811g) {
                return;
            }
            this.f122806b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f122809e.a(bVar);
        }
    }

    public b1(io.reactivex.e0<T> e0Var, kh.o<? super Throwable, ? extends io.reactivex.e0<? extends T>> oVar, boolean z10) {
        super(e0Var);
        this.f122804c = oVar;
        this.f122805d = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        a aVar = new a(g0Var, this.f122804c, this.f122805d);
        g0Var.onSubscribe(aVar.f122809e);
        this.f122785b.g(aVar);
    }
}

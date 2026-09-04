package io.reactivex.internal.operators.single;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleResumeNext<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends o0<? extends T>> f123434c;

    public static final class ResumeMainSingleObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5314538511045349925L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends o0<? extends T>> f123436c;

        ResumeMainSingleObserver(l0<? super T> l0Var, kh.o<? super Throwable, ? extends o0<? extends T>> oVar) {
            this.f123435b = l0Var;
            this.f123436c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            try {
                ((o0) io.reactivex.internal.functions.a.g(this.f123436c.apply(th2), "The nextFunction returned a null SingleSource.")).f(new io.reactivex.internal.observers.o(this, this.f123435b));
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f123435b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f123435b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123435b.onSuccess(t10);
        }
    }

    public SingleResumeNext(o0<? extends T> o0Var, kh.o<? super Throwable, ? extends o0<? extends T>> oVar) {
        this.f123433b = o0Var;
        this.f123434c = oVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123433b.f(new ResumeMainSingleObserver(l0Var, this.f123434c));
    }
}

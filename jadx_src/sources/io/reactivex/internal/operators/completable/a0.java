package io.reactivex.internal.operators.completable;

import io.reactivex.i0;
import io.reactivex.l0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CompletableToSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a0<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends T> f119791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final T f119792d;

    /* JADX INFO: compiled from: CompletableToSingle.java */
    public final class a implements io.reactivex.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0<? super T> f119793b;

        a(l0<? super T> l0Var) {
            this.f119793b = l0Var;
        }

        @Override // io.reactivex.d
        public void onComplete() {
            T tCall;
            a0 a0Var = a0.this;
            Callable<? extends T> callable = a0Var.f119791c;
            if (callable != null) {
                try {
                    tCall = callable.call();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f119793b.onError(th2);
                    return;
                }
            } else {
                tCall = a0Var.f119792d;
            }
            if (tCall == null) {
                this.f119793b.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f119793b.onSuccess(tCall);
            }
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119793b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119793b.onSubscribe(bVar);
        }
    }

    public a0(io.reactivex.g gVar, Callable<? extends T> callable, T t10) {
        this.f119790b = gVar;
        this.f119792d = t10;
        this.f119791c = callable;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f119790b.d(new a(l0Var));
    }
}

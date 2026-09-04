package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleFlatMap<T, R> extends i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends o0<? extends R>> f123387c;

    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 3258103020495908596L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super R> f123388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends o0<? extends R>> f123389c;

        public static final class a<R> implements l0<R> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final AtomicReference<io.reactivex.disposables.b> f123390b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final l0<? super R> f123391c;

            a(AtomicReference<io.reactivex.disposables.b> atomicReference, l0<? super R> l0Var) {
                this.f123390b = atomicReference;
                this.f123391c = l0Var;
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                this.f123391c.onError(th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this.f123390b, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(R r10) {
                this.f123391c.onSuccess(r10);
            }
        }

        SingleFlatMapCallback(l0<? super R> l0Var, kh.o<? super T, ? extends o0<? extends R>> oVar) {
            this.f123388b = l0Var;
            this.f123389c = oVar;
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
            this.f123388b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f123388b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                o0 o0Var = (o0) io.reactivex.internal.functions.a.g(this.f123389c.apply(t10), "The single returned by the mapper is null");
                if (isDisposed()) {
                    return;
                }
                o0Var.f(new a(this, this.f123388b));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123388b.onError(th2);
            }
        }
    }

    public SingleFlatMap(o0<? extends T> o0Var, kh.o<? super T, ? extends o0<? extends R>> oVar) {
        this.f123387c = oVar;
        this.f123386b = o0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super R> l0Var) {
        this.f123386b.f(new SingleFlatMapCallback(l0Var, this.f123387c));
    }
}

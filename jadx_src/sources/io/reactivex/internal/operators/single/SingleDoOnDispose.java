package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleDoOnDispose<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.a f123383c;

    public static final class DoOnDisposeObserver<T> extends AtomicReference<kh.a> implements l0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8583764624474935784L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123385c;

        DoOnDisposeObserver(l0<? super T> l0Var, kh.a aVar) {
            this.f123384b = l0Var;
            lazySet(aVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            kh.a andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
                this.f123385c.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123385c.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123384b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123385c, bVar)) {
                this.f123385c = bVar;
                this.f123384b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123384b.onSuccess(t10);
        }
    }

    public SingleDoOnDispose(o0<T> o0Var, kh.a aVar) {
        this.f123382b = o0Var;
        this.f123383c = aVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123382b.f(new DoOnDisposeObserver(l0Var, this.f123383c));
    }
}

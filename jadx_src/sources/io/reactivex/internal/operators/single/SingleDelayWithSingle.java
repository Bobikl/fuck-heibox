package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleDelayWithSingle<T, U> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o0<U> f123374c;

    public static final class OtherObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements l0<U>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o0<T> f123376c;

        OtherObserver(l0<? super T> l0Var, o0<T> o0Var) {
            this.f123375b = l0Var;
            this.f123376c = o0Var;
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
            this.f123375b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f123375b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(U u10) {
            this.f123376c.f(new io.reactivex.internal.observers.o(this, this.f123375b));
        }
    }

    public SingleDelayWithSingle(o0<T> o0Var, o0<U> o0Var2) {
        this.f123373b = o0Var;
        this.f123374c = o0Var2;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123374c.f(new OtherObserver(l0Var, this.f123373b));
    }
}

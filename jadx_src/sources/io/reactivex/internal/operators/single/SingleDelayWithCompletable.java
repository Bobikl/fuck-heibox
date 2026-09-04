package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleDelayWithCompletable<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g f123359c;

    public static final class OtherObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o0<T> f123361c;

        OtherObserver(l0<? super T> l0Var, o0<T> o0Var) {
            this.f123360b = l0Var;
            this.f123361c = o0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f123361c.f(new io.reactivex.internal.observers.o(this, this.f123360b));
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f123360b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f123360b.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithCompletable(o0<T> o0Var, io.reactivex.g gVar) {
        this.f123358b = o0Var;
        this.f123359c = gVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123359c.d(new OtherObserver(l0Var, this.f123358b));
    }
}

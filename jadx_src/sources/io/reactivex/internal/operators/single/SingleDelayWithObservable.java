package io.reactivex.internal.operators.single;

import io.reactivex.e0;
import io.reactivex.g0;
import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleDelayWithObservable<T, U> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e0<U> f123363c;

    public static final class OtherSubscriber<T, U> extends AtomicReference<io.reactivex.disposables.b> implements g0<U>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o0<T> f123365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f123366d;

        OtherSubscriber(l0<? super T> l0Var, o0<T> o0Var) {
            this.f123364b = l0Var;
            this.f123365c = o0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123366d) {
                return;
            }
            this.f123366d = true;
            this.f123365c.f(new io.reactivex.internal.observers.o(this, this.f123364b));
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f123366d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123366d = true;
                this.f123364b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(U u10) {
            get().dispose();
            onComplete();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.set(this, bVar)) {
                this.f123364b.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithObservable(o0<T> o0Var, e0<U> e0Var) {
        this.f123362b = o0Var;
        this.f123363c = e0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123363c.g(new OtherSubscriber(l0Var, this.f123362b));
    }
}

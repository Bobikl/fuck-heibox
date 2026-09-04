package io.reactivex.internal.operators.single;

import io.reactivex.h0;
import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleSubscribeOn<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h0 f123438c;

    public static final class SubscribeOnObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SequentialDisposable f123440c = new SequentialDisposable();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final o0<? extends T> f123441d;

        SubscribeOnObserver(l0<? super T> l0Var, o0<? extends T> o0Var) {
            this.f123439b = l0Var;
            this.f123441d = o0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f123440c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123439b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123439b.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f123441d.f(this);
        }
    }

    public SingleSubscribeOn(o0<? extends T> o0Var, h0 h0Var) {
        this.f123437b = o0Var;
        this.f123438c = h0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(l0Var, this.f123437b);
        l0Var.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.f123440c.a(this.f123438c.f(subscribeOnObserver));
    }
}

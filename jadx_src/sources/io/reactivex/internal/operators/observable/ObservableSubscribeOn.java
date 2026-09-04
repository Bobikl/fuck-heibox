package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSubscribeOn<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f122561c;

    public static final class SubscribeOnObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122563c = new AtomicReference<>();

        SubscribeOnObserver(io.reactivex.g0<? super T> g0Var) {
            this.f122562b = g0Var;
        }

        void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122563c);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122562b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122562b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122562b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122563c, bVar);
        }
    }

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SubscribeOnObserver<T> f122564b;

        a(SubscribeOnObserver<T> subscribeOnObserver) {
            this.f122564b = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            ObservableSubscribeOn.this.f122785b.g(this.f122564b);
        }
    }

    public ObservableSubscribeOn(io.reactivex.e0<T> e0Var, io.reactivex.h0 h0Var) {
        super(e0Var);
        this.f122561c = h0Var;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(g0Var);
        g0Var.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.a(this.f122561c.f(new a(subscribeOnObserver)));
    }
}

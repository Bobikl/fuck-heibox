package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<? super T, ? super U, ? extends R> f122745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.e0<? extends U> f122746d;

    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -312246233408980075L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<? super T, ? super U, ? extends R> f122748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122749d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122750e = new AtomicReference<>();

        WithLatestFromObserver(io.reactivex.g0<? super R> g0Var, kh.c<? super T, ? super U, ? extends R> cVar) {
            this.f122747b = g0Var;
            this.f122748c = cVar;
        }

        public void a(Throwable th2) {
            DisposableHelper.dispose(this.f122749d);
            this.f122747b.onError(th2);
        }

        public boolean b(io.reactivex.disposables.b bVar) {
            return DisposableHelper.setOnce(this.f122750e, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122749d);
            DisposableHelper.dispose(this.f122750e);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f122749d.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            DisposableHelper.dispose(this.f122750e);
            this.f122747b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f122750e);
            this.f122747b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    this.f122747b.onNext(io.reactivex.internal.functions.a.g(this.f122748c.apply(t10, u10), "The combiner returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    dispose();
                    this.f122747b.onError(th2);
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122749d, bVar);
        }
    }

    public final class a implements io.reactivex.g0<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WithLatestFromObserver<T, U, R> f122751b;

        a(WithLatestFromObserver<T, U, R> withLatestFromObserver) {
            this.f122751b = withLatestFromObserver;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122751b.a(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(U u10) {
            this.f122751b.lazySet(u10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f122751b.b(bVar);
        }
    }

    public ObservableWithLatestFrom(io.reactivex.e0<T> e0Var, kh.c<? super T, ? super U, ? extends R> cVar, io.reactivex.e0<? extends U> e0Var2) {
        super(e0Var);
        this.f122745c = cVar;
        this.f122746d = e0Var2;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super R> g0Var) {
        io.reactivex.observers.l lVar = new io.reactivex.observers.l(g0Var);
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(lVar, this.f122745c);
        lVar.onSubscribe(withLatestFromObserver);
        this.f122746d.g(new a(withLatestFromObserver));
        this.f122785b.g(withLatestFromObserver);
    }
}

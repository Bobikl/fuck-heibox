package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatWithMaybe<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<? extends T> f122090c;

    public static final class ConcatWithObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -1953724749712440952L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.w<? extends T> f122092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f122093d;

        ConcatWithObserver(io.reactivex.g0<? super T> g0Var, io.reactivex.w<? extends T> wVar) {
            this.f122091b = g0Var;
            this.f122092c = wVar;
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
            if (this.f122093d) {
                this.f122091b.onComplete();
                return;
            }
            this.f122093d = true;
            DisposableHelper.replace(this, null);
            io.reactivex.w<? extends T> wVar = this.f122092c;
            this.f122092c = null;
            wVar.f(this);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122091b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122091b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (!DisposableHelper.setOnce(this, bVar) || this.f122093d) {
                return;
            }
            this.f122091b.onSubscribe(this);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f122091b.onNext(t10);
            this.f122091b.onComplete();
        }
    }

    public ObservableConcatWithMaybe(io.reactivex.z<T> zVar, io.reactivex.w<? extends T> wVar) {
        super(zVar);
        this.f122090c = wVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new ConcatWithObserver(g0Var, this.f122090c));
    }
}

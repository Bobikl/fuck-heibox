package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatWithCompletable<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g f122086c;

    public static final class ConcatWithObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = -1953724749712440952L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.g f122088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f122089d;

        ConcatWithObserver(io.reactivex.g0<? super T> g0Var, io.reactivex.g gVar) {
            this.f122087b = g0Var;
            this.f122088c = gVar;
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
            if (this.f122089d) {
                this.f122087b.onComplete();
                return;
            }
            this.f122089d = true;
            DisposableHelper.replace(this, null);
            io.reactivex.g gVar = this.f122088c;
            this.f122088c = null;
            gVar.d(this);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122087b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122087b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (!DisposableHelper.setOnce(this, bVar) || this.f122089d) {
                return;
            }
            this.f122087b.onSubscribe(this);
        }
    }

    public ObservableConcatWithCompletable(io.reactivex.z<T> zVar, io.reactivex.g gVar) {
        super(zVar);
        this.f122086c = gVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new ConcatWithObserver(g0Var, this.f122086c));
    }
}

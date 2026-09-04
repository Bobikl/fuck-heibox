package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableThrottleFirstTimed<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f122613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.h0 f122614e;

    public static final class DebounceTimedObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f122617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f122618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f122619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f122620g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f122621h;

        DebounceTimedObserver(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar) {
            this.f122615b = g0Var;
            this.f122616c = j10;
            this.f122617d = timeUnit;
            this.f122618e = cVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122619f.dispose();
            this.f122618e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122618e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122621h) {
                return;
            }
            this.f122621h = true;
            this.f122615b.onComplete();
            this.f122618e.dispose();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122621h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122621h = true;
            this.f122615b.onError(th2);
            this.f122618e.dispose();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122620g || this.f122621h) {
                return;
            }
            this.f122620g = true;
            this.f122615b.onNext(t10);
            io.reactivex.disposables.b bVar = get();
            if (bVar != null) {
                bVar.dispose();
            }
            DisposableHelper.replace(this, this.f122618e.c(this, this.f122616c, this.f122617d));
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122619f, bVar)) {
                this.f122619f = bVar;
                this.f122615b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f122620g = false;
        }
    }

    public ObservableThrottleFirstTimed(io.reactivex.e0<T> e0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        super(e0Var);
        this.f122612c = j10;
        this.f122613d = timeUnit;
        this.f122614e = h0Var;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new DebounceTimedObserver(new io.reactivex.observers.l(g0Var), this.f122612c, this.f122613d, this.f122614e.c()));
    }
}

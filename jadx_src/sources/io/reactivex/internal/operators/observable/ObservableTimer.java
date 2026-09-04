package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTimer extends io.reactivex.z<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.h0 f122675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f122677d;

    public static final class TimerObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super Long> f122678b;

        TimerObserver(io.reactivex.g0<? super Long> g0Var) {
            this.f122678b = g0Var;
        }

        public void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.trySet(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.f122678b.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            this.f122678b.onComplete();
        }
    }

    public ObservableTimer(long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        this.f122676c = j10;
        this.f122677d = timeUnit;
        this.f122675b = h0Var;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super Long> g0Var) {
        TimerObserver timerObserver = new TimerObserver(g0Var);
        g0Var.onSubscribe(timerObserver);
        timerObserver.a(this.f122675b.g(timerObserver, this.f122676c, this.f122677d));
    }
}

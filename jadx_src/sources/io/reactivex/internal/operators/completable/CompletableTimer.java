package io.reactivex.internal.operators.completable;

import io.reactivex.h0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableTimer extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f119772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f119773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final h0 f119774d;

    public static final class TimerDisposable extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119775b;

        TimerDisposable(io.reactivex.d dVar) {
            this.f119775b = dVar;
        }

        void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f119775b.onComplete();
        }
    }

    public CompletableTimer(long j10, TimeUnit timeUnit, h0 h0Var) {
        this.f119772b = j10;
        this.f119773c = timeUnit;
        this.f119774d = h0Var;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        TimerDisposable timerDisposable = new TimerDisposable(dVar);
        dVar.onSubscribe(timerDisposable);
        timerDisposable.a(this.f119774d.g(timerDisposable, this.f119772b, this.f119773c));
    }
}

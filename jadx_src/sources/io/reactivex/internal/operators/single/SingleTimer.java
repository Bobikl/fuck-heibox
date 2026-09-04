package io.reactivex.internal.operators.single;

import io.reactivex.h0;
import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleTimer extends i0<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f123459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f123460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final h0 f123461d;

    public static final class TimerDisposable extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super Long> f123462b;

        TimerDisposable(l0<? super Long> l0Var) {
            this.f123462b = l0Var;
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
            this.f123462b.onSuccess(0L);
        }
    }

    public SingleTimer(long j10, TimeUnit timeUnit, h0 h0Var) {
        this.f123459b = j10;
        this.f123460c = timeUnit;
        this.f123461d = h0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super Long> l0Var) {
        TimerDisposable timerDisposable = new TimerDisposable(l0Var);
        l0Var.onSubscribe(timerDisposable);
        timerDisposable.a(this.f123461d.g(timerDisposable, this.f123459b, this.f123460c));
    }
}

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTimer extends io.reactivex.q<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f121589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f121590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.h0 f121591d;

    public static final class TimerDisposable extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super Long> f121592b;

        TimerDisposable(io.reactivex.t<? super Long> tVar) {
            this.f121592b = tVar;
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
            this.f121592b.onSuccess(0L);
        }
    }

    public MaybeTimer(long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        this.f121589b = j10;
        this.f121590c = timeUnit;
        this.f121591d = h0Var;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super Long> tVar) {
        TimerDisposable timerDisposable = new TimerDisposable(tVar);
        tVar.onSubscribe(timerDisposable);
        timerDisposable.a(this.f121591d.g(timerDisposable, this.f121589b, this.f121590c));
    }
}

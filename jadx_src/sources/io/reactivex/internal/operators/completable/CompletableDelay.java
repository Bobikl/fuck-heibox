package io.reactivex.internal.operators.completable;

import io.reactivex.h0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableDelay extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f119718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f119719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final h0 f119720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f119721f;

    public static final class Delay extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, Runnable, io.reactivex.disposables.b {
        private static final long serialVersionUID = 465972761105851022L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f119723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f119724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final h0 f119725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f119726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Throwable f119727g;

        Delay(io.reactivex.d dVar, long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
            this.f119722b = dVar;
            this.f119723c = j10;
            this.f119724d = timeUnit;
            this.f119725e = h0Var;
            this.f119726f = z10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.d
        public void onComplete() {
            DisposableHelper.replace(this, this.f119725e.g(this, this.f119723c, this.f119724d));
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119727g = th2;
            DisposableHelper.replace(this, this.f119725e.g(this, this.f119726f ? this.f119723c : 0L, this.f119724d));
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f119722b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f119727g;
            this.f119727g = null;
            if (th2 != null) {
                this.f119722b.onError(th2);
            } else {
                this.f119722b.onComplete();
            }
        }
    }

    public CompletableDelay(io.reactivex.g gVar, long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        this.f119717b = gVar;
        this.f119718c = j10;
        this.f119719d = timeUnit;
        this.f119720e = h0Var;
        this.f119721f = z10;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119717b.d(new Delay(dVar, this.f119718c, this.f119719d, this.f119720e, this.f119721f));
    }
}

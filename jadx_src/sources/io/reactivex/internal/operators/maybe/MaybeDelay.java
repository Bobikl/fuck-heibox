package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelay<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f121437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f121438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.h0 f121439e;

    public static final class DelayMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f121441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f121442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0 f121443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        T f121444f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Throwable f121445g;

        DelayMaybeObserver(io.reactivex.t<? super T> tVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f121440b = tVar;
            this.f121441c = j10;
            this.f121442d = timeUnit;
            this.f121443e = h0Var;
        }

        void a() {
            DisposableHelper.replace(this, this.f121443e.g(this, this.f121441c, this.f121442d));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121445g = th2;
            a();
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f121440b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121444f = t10;
            a();
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f121445g;
            if (th2 != null) {
                this.f121440b.onError(th2);
                return;
            }
            T t10 = this.f121444f;
            if (t10 != null) {
                this.f121440b.onSuccess(t10);
            } else {
                this.f121440b.onComplete();
            }
        }
    }

    public MaybeDelay(io.reactivex.w<T> wVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        super(wVar);
        this.f121437c = j10;
        this.f121438d = timeUnit;
        this.f121439e = h0Var;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new DelayMaybeObserver(tVar, this.f121437c, this.f121438d, this.f121439e));
    }
}

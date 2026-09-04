package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableThrottleLatest<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f122623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.h0 f122624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f122625f;

    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f122628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f122629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f122630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<T> f122631g = new AtomicReference<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.b f122632h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f122633i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Throwable f122634j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f122635k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f122636l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f122637m;

        ThrottleLatestObserver(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar, boolean z10) {
            this.f122626b = g0Var;
            this.f122627c = j10;
            this.f122628d = timeUnit;
            this.f122629e = cVar;
            this.f122630f = z10;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f122631g;
            io.reactivex.g0<? super T> g0Var = this.f122626b;
            int iAddAndGet = 1;
            while (!this.f122635k) {
                boolean z10 = this.f122633i;
                if (z10 && this.f122634j != null) {
                    atomicReference.lazySet(null);
                    g0Var.onError(this.f122634j);
                    this.f122629e.dispose();
                    return;
                }
                boolean z11 = atomicReference.get() == null;
                if (z10) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z11 && this.f122630f) {
                        g0Var.onNext(andSet);
                    }
                    g0Var.onComplete();
                    this.f122629e.dispose();
                    return;
                }
                if (z11) {
                    if (this.f122636l) {
                        this.f122637m = false;
                        this.f122636l = false;
                    }
                } else if (!this.f122637m || this.f122636l) {
                    g0Var.onNext(atomicReference.getAndSet(null));
                    this.f122636l = false;
                    this.f122637m = true;
                    this.f122629e.c(this, this.f122627c, this.f122628d);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122635k = true;
            this.f122632h.dispose();
            this.f122629e.dispose();
            if (getAndIncrement() == 0) {
                this.f122631g.lazySet(null);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122635k;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122633i = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122634j = th2;
            this.f122633i = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122631g.set(t10);
            a();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122632h, bVar)) {
                this.f122632h = bVar;
                this.f122626b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f122636l = true;
            a();
        }
    }

    public ObservableThrottleLatest(io.reactivex.z<T> zVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, boolean z10) {
        super(zVar);
        this.f122622c = j10;
        this.f122623d = timeUnit;
        this.f122624e = h0Var;
        this.f122625f = z10;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new ThrottleLatestObserver(g0Var, this.f122622c, this.f122623d, this.f122624e.c(), this.f122625f));
    }
}

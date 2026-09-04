package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSampleTimed<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f122479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.h0 f122480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f122481f;

    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicInteger f122482h;

        SampleTimedEmitLast(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            super(g0Var, j10, timeUnit, h0Var);
            this.f122482h = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        void b() {
            c();
            if (this.f122482h.decrementAndGet() == 0) {
                this.f122483b.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f122482h.incrementAndGet() == 2) {
                c();
                if (this.f122482h.decrementAndGet() == 0) {
                    this.f122483b.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            super(g0Var, j10, timeUnit, h0Var);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        void b() {
            this.f122483b.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            c();
        }
    }

    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f122485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0 f122486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122487f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f122488g;

        SampleTimedObserver(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f122483b = g0Var;
            this.f122484c = j10;
            this.f122485d = timeUnit;
            this.f122486e = h0Var;
        }

        void a() {
            DisposableHelper.dispose(this.f122487f);
        }

        abstract void b();

        void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f122483b.onNext(andSet);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            a();
            this.f122488g.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122488g.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            a();
            b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            a();
            this.f122483b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122488g, bVar)) {
                this.f122488g = bVar;
                this.f122483b.onSubscribe(this);
                io.reactivex.h0 h0Var = this.f122486e;
                long j10 = this.f122484c;
                DisposableHelper.replace(this.f122487f, h0Var.h(this, j10, j10, this.f122485d));
            }
        }
    }

    public ObservableSampleTimed(io.reactivex.e0<T> e0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, boolean z10) {
        super(e0Var);
        this.f122478c = j10;
        this.f122479d = timeUnit;
        this.f122480e = h0Var;
        this.f122481f = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        io.reactivex.observers.l lVar = new io.reactivex.observers.l(g0Var);
        if (this.f122481f) {
            this.f122785b.g(new SampleTimedEmitLast(lVar, this.f122478c, this.f122479d, this.f122480e));
        } else {
            this.f122785b.g(new SampleTimedNoLast(lVar, this.f122478c, this.f122479d, this.f122480e));
        }
    }
}

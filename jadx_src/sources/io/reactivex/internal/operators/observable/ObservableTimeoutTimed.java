package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTimeoutTimed<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f122654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.h0 f122655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f122656f;

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, io.reactivex.disposables.b, b {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f122659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f122660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final SequentialDisposable f122661f = new SequentialDisposable();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicLong f122662g = new AtomicLong();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122663h = new AtomicReference<>();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.e0<? extends T> f122664i;

        TimeoutFallbackObserver(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar, io.reactivex.e0<? extends T> e0Var) {
            this.f122657b = g0Var;
            this.f122658c = j10;
            this.f122659d = timeUnit;
            this.f122660e = cVar;
            this.f122664i = e0Var;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void b(long j10) {
            if (this.f122662g.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f122663h);
                io.reactivex.e0<? extends T> e0Var = this.f122664i;
                this.f122664i = null;
                e0Var.g(new a(this.f122657b, this));
                this.f122660e.dispose();
            }
        }

        void c(long j10) {
            this.f122661f.a(this.f122660e.c(new c(j10, this), this.f122658c, this.f122659d));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122663h);
            DisposableHelper.dispose(this);
            this.f122660e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122662g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f122661f.dispose();
                this.f122657b.onComplete();
                this.f122660e.dispose();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122662g.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122661f.dispose();
            this.f122657b.onError(th2);
            this.f122660e.dispose();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            long j10 = this.f122662g.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f122662g.compareAndSet(j10, j11)) {
                    this.f122661f.get().dispose();
                    this.f122657b.onNext(t10);
                    c(j11);
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122663h, bVar);
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements io.reactivex.g0<T>, io.reactivex.disposables.b, b {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f122667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f122668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final SequentialDisposable f122669f = new SequentialDisposable();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122670g = new AtomicReference<>();

        TimeoutObserver(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar) {
            this.f122665b = g0Var;
            this.f122666c = j10;
            this.f122667d = timeUnit;
            this.f122668e = cVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f122670g);
                this.f122665b.onError(new TimeoutException(ExceptionHelper.e(this.f122666c, this.f122667d)));
                this.f122668e.dispose();
            }
        }

        void c(long j10) {
            this.f122669f.a(this.f122668e.c(new c(j10, this), this.f122666c, this.f122667d));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122670g);
            this.f122668e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f122670g.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f122669f.dispose();
                this.f122665b.onComplete();
                this.f122668e.dispose();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122669f.dispose();
            this.f122665b.onError(th2);
            this.f122668e.dispose();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    this.f122669f.get().dispose();
                    this.f122665b.onNext(t10);
                    c(j11);
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122670g, bVar);
        }
    }

    public static final class a<T> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122672c;

        a(io.reactivex.g0<? super T> g0Var, AtomicReference<io.reactivex.disposables.b> atomicReference) {
            this.f122671b = g0Var;
            this.f122672c = atomicReference;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122671b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122671b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122671b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this.f122672c, bVar);
        }
    }

    public interface b {
        void b(long j10);
    }

    public static final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b f122673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122674c;

        c(long j10, b bVar) {
            this.f122674c = j10;
            this.f122673b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f122673b.b(this.f122674c);
        }
    }

    public ObservableTimeoutTimed(io.reactivex.z<T> zVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, io.reactivex.e0<? extends T> e0Var) {
        super(zVar);
        this.f122653c = j10;
        this.f122654d = timeUnit;
        this.f122655e = h0Var;
        this.f122656f = e0Var;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        if (this.f122656f == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(g0Var, this.f122653c, this.f122654d, this.f122655e.c());
            g0Var.onSubscribe(timeoutObserver);
            timeoutObserver.c(0L);
            this.f122785b.g(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(g0Var, this.f122653c, this.f122654d, this.f122655e.c(), this.f122656f);
        g0Var.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.c(0L);
        this.f122785b.g(timeoutFallbackObserver);
    }
}

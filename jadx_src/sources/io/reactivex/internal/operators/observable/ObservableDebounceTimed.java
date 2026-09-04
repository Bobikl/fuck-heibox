package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableDebounceTimed<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f122105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.h0 f122106e;

    public static final class DebounceEmitter<T> extends AtomicReference<io.reactivex.disposables.b> implements Runnable, io.reactivex.disposables.b {
        private static final long serialVersionUID = 6812032969491025141L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f122107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a<T> f122109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f122110e = new AtomicBoolean();

        DebounceEmitter(T t10, long j10, a<T> aVar) {
            this.f122107b = t10;
            this.f122108c = j10;
            this.f122109d = aVar;
        }

        public void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this, bVar);
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
            if (this.f122110e.compareAndSet(false, true)) {
                this.f122109d.a(this.f122108c, this.f122107b, this);
            }
        }
    }

    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f122113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f122114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f122115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f122116g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile long f122117h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f122118i;

        a(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar) {
            this.f122111b = g0Var;
            this.f122112c = j10;
            this.f122113d = timeUnit;
            this.f122114e = cVar;
        }

        void a(long j10, T t10, DebounceEmitter<T> debounceEmitter) {
            if (j10 == this.f122117h) {
                this.f122111b.onNext(t10);
                debounceEmitter.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122115f.dispose();
            this.f122114e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122114e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122118i) {
                return;
            }
            this.f122118i = true;
            io.reactivex.disposables.b bVar = this.f122116g;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) bVar;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.f122111b.onComplete();
            this.f122114e.dispose();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122118i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            io.reactivex.disposables.b bVar = this.f122116g;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f122118i = true;
            this.f122111b.onError(th2);
            this.f122114e.dispose();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122118i) {
                return;
            }
            long j10 = this.f122117h + 1;
            this.f122117h = j10;
            io.reactivex.disposables.b bVar = this.f122116g;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t10, j10, this);
            this.f122116g = debounceEmitter;
            debounceEmitter.a(this.f122114e.c(debounceEmitter, this.f122112c, this.f122113d));
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122115f, bVar)) {
                this.f122115f = bVar;
                this.f122111b.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(io.reactivex.e0<T> e0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        super(e0Var);
        this.f122104c = j10;
        this.f122105d = timeUnit;
        this.f122106e = h0Var;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(new io.reactivex.observers.l(g0Var), this.f122104c, this.f122105d, this.f122106e.c()));
    }
}

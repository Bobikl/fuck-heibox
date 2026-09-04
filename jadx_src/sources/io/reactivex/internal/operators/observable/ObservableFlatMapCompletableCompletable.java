package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends io.reactivex.a implements lh.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.g> f122163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f122164d;

    public static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements io.reactivex.disposables.b, io.reactivex.g0<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f122165b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.g> f122167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f122168e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f122170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122171h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicThrowable f122166c = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.a f122169f = new io.reactivex.disposables.a();

        public final class InnerObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
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
                FlatMapCompletableMainObserver.this.a(this);
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                FlatMapCompletableMainObserver.this.b(this, th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        FlatMapCompletableMainObserver(io.reactivex.d dVar, kh.o<? super T, ? extends io.reactivex.g> oVar, boolean z10) {
            this.f122165b = dVar;
            this.f122167d = oVar;
            this.f122168e = z10;
            lazySet(1);
        }

        void a(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
            this.f122169f.b(innerObserver);
            onComplete();
        }

        void b(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, Throwable th2) {
            this.f122169f.b(innerObserver);
            onError(th2);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122171h = true;
            this.f122170g.dispose();
            this.f122169f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122170g.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thC = this.f122166c.c();
                if (thC != null) {
                    this.f122165b.onError(thC);
                } else {
                    this.f122165b.onComplete();
                }
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f122166c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f122168e) {
                if (decrementAndGet() == 0) {
                    this.f122165b.onError(this.f122166c.c());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f122165b.onError(this.f122166c.c());
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            try {
                io.reactivex.g gVar = (io.reactivex.g) io.reactivex.internal.functions.a.g(this.f122167d.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f122171h || !this.f122169f.c(innerObserver)) {
                    return;
                }
                gVar.d(innerObserver);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122170g.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122170g, bVar)) {
                this.f122170g = bVar;
                this.f122165b.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapCompletableCompletable(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.g> oVar, boolean z10) {
        this.f122162b = e0Var;
        this.f122163c = oVar;
        this.f122164d = z10;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f122162b.g(new FlatMapCompletableMainObserver(dVar, this.f122163c, this.f122164d));
    }

    @Override // lh.d
    public io.reactivex.z<T> a() {
        return io.reactivex.plugins.a.R(new ObservableFlatMapCompletable(this.f122162b, this.f122163c, this.f122164d));
    }
}

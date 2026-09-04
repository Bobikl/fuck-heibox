package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableFlatMapCompletable<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.g> f122152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f122153d;

    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements io.reactivex.g0<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122154b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.g> f122156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f122157e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f122159g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122160h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicThrowable f122155c = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.a f122158f = new io.reactivex.disposables.a();

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

        FlatMapCompletableMainObserver(io.reactivex.g0<? super T> g0Var, kh.o<? super T, ? extends io.reactivex.g> oVar, boolean z10) {
            this.f122154b = g0Var;
            this.f122156d = oVar;
            this.f122157e = z10;
            lazySet(1);
        }

        void a(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
            this.f122158f.b(innerObserver);
            onComplete();
        }

        void b(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, Throwable th2) {
            this.f122158f.b(innerObserver);
            onError(th2);
        }

        @Override // lh.o
        public void clear() {
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122160h = true;
            this.f122159g.dispose();
            this.f122158f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122159g.isDisposed();
        }

        @Override // lh.o
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thC = this.f122155c.c();
                if (thC != null) {
                    this.f122154b.onError(thC);
                } else {
                    this.f122154b.onComplete();
                }
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f122155c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f122157e) {
                if (decrementAndGet() == 0) {
                    this.f122154b.onError(this.f122155c.c());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f122154b.onError(this.f122155c.c());
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            try {
                io.reactivex.g gVar = (io.reactivex.g) io.reactivex.internal.functions.a.g(this.f122156d.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f122160h || !this.f122158f.c(innerObserver)) {
                    return;
                }
                gVar.d(innerObserver);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122159g.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122159g, bVar)) {
                this.f122159g = bVar;
                this.f122154b.onSubscribe(this);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            return null;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return i10 & 2;
        }
    }

    public ObservableFlatMapCompletable(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.g> oVar, boolean z10) {
        super(e0Var);
        this.f122152c = oVar;
        this.f122153d = z10;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new FlatMapCompletableMainObserver(g0Var, this.f122152c, this.f122153d));
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRefCount<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.observables.a<T> f122384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f122385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f122386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f122387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f122388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    RefConnection f122389g;

    public static final class RefConnection extends AtomicReference<io.reactivex.disposables.b> implements Runnable, kh.g<io.reactivex.disposables.b> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ObservableRefCount<?> f122390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f122391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f122392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122394f;

        RefConnection(ObservableRefCount<?> observableRefCount) {
            this.f122390b = observableRefCount;
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(io.reactivex.disposables.b bVar) throws Exception {
            DisposableHelper.replace(this, bVar);
            synchronized (this.f122390b) {
                if (this.f122394f) {
                    ((io.reactivex.internal.disposables.c) this.f122390b.f122384b).a(bVar);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f122390b.j8(this);
        }
    }

    public static final class RefCountObserver<T> extends AtomicBoolean implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -7419642935409022375L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ObservableRefCount<T> f122396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final RefConnection f122397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f122398e;

        RefCountObserver(io.reactivex.g0<? super T> g0Var, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.f122395b = g0Var;
            this.f122396c = observableRefCount;
            this.f122397d = refConnection;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122398e.dispose();
            if (compareAndSet(false, true)) {
                this.f122396c.h8(this.f122397d);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122398e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f122396c.i8(this.f122397d);
                this.f122395b.onComplete();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122396c.i8(this.f122397d);
                this.f122395b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122395b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122398e, bVar)) {
                this.f122398e = bVar;
                this.f122395b.onSubscribe(this);
            }
        }
    }

    public ObservableRefCount(io.reactivex.observables.a<T> aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public ObservableRefCount(io.reactivex.observables.a<T> aVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        this.f122384b = aVar;
        this.f122385c = i10;
        this.f122386d = j10;
        this.f122387e = timeUnit;
        this.f122388f = h0Var;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        RefConnection refConnection;
        boolean z10;
        io.reactivex.disposables.b bVar;
        synchronized (this) {
            refConnection = this.f122389g;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.f122389g = refConnection;
            }
            long j10 = refConnection.f122392d;
            if (j10 == 0 && (bVar = refConnection.f122391c) != null) {
                bVar.dispose();
            }
            long j11 = j10 + 1;
            refConnection.f122392d = j11;
            z10 = true;
            if (refConnection.f122393e || j11 != this.f122385c) {
                z10 = false;
            } else {
                refConnection.f122393e = true;
            }
        }
        this.f122384b.g(new RefCountObserver(g0Var, this, refConnection));
        if (z10) {
            this.f122384b.l8(refConnection);
        }
    }

    void h8(RefConnection refConnection) {
        synchronized (this) {
            RefConnection refConnection2 = this.f122389g;
            if (refConnection2 != null && refConnection2 == refConnection) {
                long j10 = refConnection.f122392d - 1;
                refConnection.f122392d = j10;
                if (j10 == 0 && refConnection.f122393e) {
                    if (this.f122386d == 0) {
                        j8(refConnection);
                        return;
                    }
                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                    refConnection.f122391c = sequentialDisposable;
                    sequentialDisposable.a(this.f122388f.g(refConnection, this.f122386d, this.f122387e));
                }
            }
        }
    }

    void i8(RefConnection refConnection) {
        synchronized (this) {
            RefConnection refConnection2 = this.f122389g;
            if (refConnection2 != null && refConnection2 == refConnection) {
                this.f122389g = null;
                io.reactivex.disposables.b bVar = refConnection.f122391c;
                if (bVar != null) {
                    bVar.dispose();
                }
            }
            long j10 = refConnection.f122392d - 1;
            refConnection.f122392d = j10;
            if (j10 == 0) {
                io.reactivex.observables.a<T> aVar = this.f122384b;
                if (aVar instanceof io.reactivex.disposables.b) {
                    ((io.reactivex.disposables.b) aVar).dispose();
                } else if (aVar instanceof io.reactivex.internal.disposables.c) {
                    ((io.reactivex.internal.disposables.c) aVar).a(refConnection.get());
                }
            }
        }
    }

    void j8(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.f122392d == 0 && refConnection == this.f122389g) {
                this.f122389g = null;
                io.reactivex.disposables.b bVar = refConnection.get();
                DisposableHelper.dispose(refConnection);
                io.reactivex.observables.a<T> aVar = this.f122384b;
                if (aVar instanceof io.reactivex.disposables.b) {
                    ((io.reactivex.disposables.b) aVar).dispose();
                } else if (aVar instanceof io.reactivex.internal.disposables.c) {
                    if (bVar == null) {
                        refConnection.f122394f = true;
                    } else {
                        ((io.reactivex.internal.disposables.c) aVar).a(bVar);
                    }
                }
            }
        }
    }
}

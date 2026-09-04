package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableCache<T> extends io.reactivex.internal.operators.observable.a<T, T> implements io.reactivex.g0<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final CacheDisposable[] f122002l = new CacheDisposable[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final CacheDisposable[] f122003m = new CacheDisposable[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f122004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f122005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReference<CacheDisposable<T>[]> f122006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile long f122007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final a<T> f122008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    a<T> f122009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f122010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Throwable f122011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    volatile boolean f122012k;

    public static final class CacheDisposable<T> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 6770240836423125754L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ObservableCache<T> f122014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<T> f122015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f122017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f122018g;

        CacheDisposable(io.reactivex.g0<? super T> g0Var, ObservableCache<T> observableCache) {
            this.f122013b = g0Var;
            this.f122014c = observableCache;
            this.f122015d = observableCache.f122008g;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122018g) {
                return;
            }
            this.f122018g = true;
            this.f122014c.l8(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122018g;
        }
    }

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T[] f122019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile a<T> f122020b;

        a(int i10) {
            this.f122019a = (T[]) new Object[i10];
        }
    }

    public ObservableCache(io.reactivex.z<T> zVar, int i10) {
        super(zVar);
        this.f122005d = i10;
        this.f122004c = new AtomicBoolean();
        a<T> aVar = new a<>(i10);
        this.f122008g = aVar;
        this.f122009h = aVar;
        this.f122006e = new AtomicReference<>(f122002l);
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(g0Var, this);
        g0Var.onSubscribe(cacheDisposable);
        h8(cacheDisposable);
        if (this.f122004c.get() || !this.f122004c.compareAndSet(false, true)) {
            m8(cacheDisposable);
        } else {
            this.f122785b.g(this);
        }
    }

    void h8(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f122006e.get();
            if (cacheDisposableArr == f122003m) {
                return;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!androidx.compose.animation.core.s0.a(this.f122006e, cacheDisposableArr, cacheDisposableArr2));
    }

    long i8() {
        return this.f122007f;
    }

    boolean j8() {
        return this.f122006e.get().length != 0;
    }

    boolean k8() {
        return this.f122004c.get();
    }

    void l8(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f122006e.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (cacheDisposableArr[i11] == cacheDisposable) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr2 = f122002l;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i10);
                System.arraycopy(cacheDisposableArr, i10 + 1, cacheDisposableArr3, i10, (length - i10) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!androidx.compose.animation.core.s0.a(this.f122006e, cacheDisposableArr, cacheDisposableArr2));
    }

    void m8(CacheDisposable<T> cacheDisposable) {
        if (cacheDisposable.getAndIncrement() != 0) {
            return;
        }
        long j10 = cacheDisposable.f122017f;
        int i10 = cacheDisposable.f122016e;
        a<T> aVar = cacheDisposable.f122015d;
        io.reactivex.g0<? super T> g0Var = cacheDisposable.f122013b;
        int i11 = this.f122005d;
        int iAddAndGet = 1;
        while (!cacheDisposable.f122018g) {
            boolean z10 = this.f122012k;
            boolean z11 = this.f122007f == j10;
            if (z10 && z11) {
                cacheDisposable.f122015d = null;
                Throwable th2 = this.f122011j;
                if (th2 != null) {
                    g0Var.onError(th2);
                    return;
                } else {
                    g0Var.onComplete();
                    return;
                }
            }
            if (z11) {
                cacheDisposable.f122017f = j10;
                cacheDisposable.f122016e = i10;
                cacheDisposable.f122015d = aVar;
                iAddAndGet = cacheDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i10 == i11) {
                    aVar = aVar.f122020b;
                    i10 = 0;
                }
                g0Var.onNext(aVar.f122019a[i10]);
                i10++;
                j10++;
            }
        }
        cacheDisposable.f122015d = null;
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        this.f122012k = true;
        for (CacheDisposable<T> cacheDisposable : this.f122006e.getAndSet(f122003m)) {
            m8(cacheDisposable);
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        this.f122011j = th2;
        this.f122012k = true;
        for (CacheDisposable<T> cacheDisposable : this.f122006e.getAndSet(f122003m)) {
            m8(cacheDisposable);
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        int i10 = this.f122010i;
        if (i10 == this.f122005d) {
            a<T> aVar = new a<>(i10);
            aVar.f122019a[0] = t10;
            this.f122010i = 1;
            this.f122009h.f122020b = aVar;
            this.f122009h = aVar;
        } else {
            this.f122009h.f122019a[i10] = t10;
            this.f122010i = i10 + 1;
        }
        this.f122007f++;
        for (CacheDisposable<T> cacheDisposable : this.f122006e.get()) {
            m8(cacheDisposable);
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
    }
}

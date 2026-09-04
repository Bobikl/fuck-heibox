package io.reactivex.internal.operators.maybe;

import androidx.compose.animation.core.s0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeCache<T> extends io.reactivex.q<T> implements io.reactivex.t<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final CacheDisposable[] f121401f = new CacheDisposable[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final CacheDisposable[] f121402g = new CacheDisposable[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.w<T>> f121403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<CacheDisposable<T>[]> f121404c = new AtomicReference<>(f121401f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    T f121405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Throwable f121406e;

    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -5791853038359966195L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121407b;

        CacheDisposable(io.reactivex.t<? super T> tVar, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.f121407b = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.g2(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == null;
        }
    }

    public MaybeCache(io.reactivex.w<T> wVar) {
        this.f121403b = new AtomicReference<>(wVar);
    }

    boolean f2(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f121404c.get();
            if (cacheDisposableArr == f121402g) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!s0.a(this.f121404c, cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    void g2(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f121404c.get();
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
                cacheDisposableArr2 = f121401f;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i10);
                System.arraycopy(cacheDisposableArr, i10 + 1, cacheDisposableArr3, i10, (length - i10) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!s0.a(this.f121404c, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.t
    public void onComplete() {
        for (CacheDisposable<T> cacheDisposable : this.f121404c.getAndSet(f121402g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f121407b.onComplete();
            }
        }
    }

    @Override // io.reactivex.t
    public void onError(Throwable th2) {
        this.f121406e = th2;
        for (CacheDisposable<T> cacheDisposable : this.f121404c.getAndSet(f121402g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f121407b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.t
    public void onSubscribe(io.reactivex.disposables.b bVar) {
    }

    @Override // io.reactivex.t
    public void onSuccess(T t10) {
        this.f121405d = t10;
        for (CacheDisposable<T> cacheDisposable : this.f121404c.getAndSet(f121402g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f121407b.onSuccess(t10);
            }
        }
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(tVar, this);
        tVar.onSubscribe(cacheDisposable);
        if (f2(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                g2(cacheDisposable);
                return;
            }
            io.reactivex.w<T> andSet = this.f121403b.getAndSet(null);
            if (andSet != null) {
                andSet.f(this);
                return;
            }
            return;
        }
        if (cacheDisposable.isDisposed()) {
            return;
        }
        Throwable th2 = this.f121406e;
        if (th2 != null) {
            tVar.onError(th2);
            return;
        }
        T t10 = this.f121405d;
        if (t10 != null) {
            tVar.onSuccess(t10);
        } else {
            tVar.onComplete();
        }
    }
}

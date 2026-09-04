package io.reactivex.internal.operators.single;

import androidx.compose.animation.core.s0;
import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleCache<T> extends i0<T> implements l0<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final CacheDisposable[] f123347g = new CacheDisposable[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final CacheDisposable[] f123348h = new CacheDisposable[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicInteger f123350c = new AtomicInteger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<CacheDisposable<T>[]> f123351d = new AtomicReference<>(f123347g);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    T f123352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Throwable f123353f;

    public static final class CacheDisposable<T> extends AtomicBoolean implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 7514387411091976596L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SingleCache<T> f123355c;

        CacheDisposable(l0<? super T> l0Var, SingleCache<T> singleCache) {
            this.f123354b = l0Var;
            this.f123355c = singleCache;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f123355c.P1(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get();
        }
    }

    public SingleCache(o0<? extends T> o0Var) {
        this.f123349b = o0Var;
    }

    boolean O1(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f123351d.get();
            if (cacheDisposableArr == f123348h) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!s0.a(this.f123351d, cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    void P1(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f123351d.get();
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
                cacheDisposableArr2 = f123347g;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i10);
                System.arraycopy(cacheDisposableArr, i10 + 1, cacheDisposableArr3, i10, (length - i10) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!s0.a(this.f123351d, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(l0Var, this);
        l0Var.onSubscribe(cacheDisposable);
        if (O1(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                P1(cacheDisposable);
            }
            if (this.f123350c.getAndIncrement() == 0) {
                this.f123349b.f(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f123353f;
        if (th2 != null) {
            l0Var.onError(th2);
        } else {
            l0Var.onSuccess(this.f123352e);
        }
    }

    @Override // io.reactivex.l0
    public void onError(Throwable th2) {
        this.f123353f = th2;
        for (CacheDisposable<T> cacheDisposable : this.f123351d.getAndSet(f123348h)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f123354b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.l0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
    }

    @Override // io.reactivex.l0
    public void onSuccess(T t10) {
        this.f123352e = t10;
        for (CacheDisposable<T> cacheDisposable : this.f123351d.getAndSet(f123348h)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f123354b.onSuccess(t10);
            }
        }
    }
}

package io.reactivex.internal.operators.completable;

import androidx.compose.animation.core.s0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableCache extends io.reactivex.a implements io.reactivex.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final InnerCompletableCache[] f119684f = new InnerCompletableCache[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final InnerCompletableCache[] f119685g = new InnerCompletableCache[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<InnerCompletableCache[]> f119687c = new AtomicReference<>(f119684f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f119688d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Throwable f119689e;

    public final class InnerCompletableCache extends AtomicBoolean implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 8943152917179642732L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119690b;

        InnerCompletableCache(io.reactivex.d dVar) {
            this.f119690b = dVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                CompletableCache.this.j1(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get();
        }
    }

    public CompletableCache(io.reactivex.g gVar) {
        this.f119686b = gVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        InnerCompletableCache innerCompletableCache = new InnerCompletableCache(dVar);
        dVar.onSubscribe(innerCompletableCache);
        if (i1(innerCompletableCache)) {
            if (innerCompletableCache.isDisposed()) {
                j1(innerCompletableCache);
            }
            if (this.f119688d.compareAndSet(false, true)) {
                this.f119686b.d(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f119689e;
        if (th2 != null) {
            dVar.onError(th2);
        } else {
            dVar.onComplete();
        }
    }

    boolean i1(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.f119687c.get();
            if (innerCompletableCacheArr == f119685g) {
                return false;
            }
            int length = innerCompletableCacheArr.length;
            innerCompletableCacheArr2 = new InnerCompletableCache[length + 1];
            System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr2, 0, length);
            innerCompletableCacheArr2[length] = innerCompletableCache;
        } while (!s0.a(this.f119687c, innerCompletableCacheArr, innerCompletableCacheArr2));
        return true;
    }

    void j1(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.f119687c.get();
            int length = innerCompletableCacheArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (innerCompletableCacheArr[i11] == innerCompletableCache) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                innerCompletableCacheArr2 = f119684f;
            } else {
                InnerCompletableCache[] innerCompletableCacheArr3 = new InnerCompletableCache[length - 1];
                System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr3, 0, i10);
                System.arraycopy(innerCompletableCacheArr, i10 + 1, innerCompletableCacheArr3, i10, (length - i10) - 1);
                innerCompletableCacheArr2 = innerCompletableCacheArr3;
            }
        } while (!s0.a(this.f119687c, innerCompletableCacheArr, innerCompletableCacheArr2));
    }

    @Override // io.reactivex.d
    public void onComplete() {
        for (InnerCompletableCache innerCompletableCache : this.f119687c.getAndSet(f119685g)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.f119690b.onComplete();
            }
        }
    }

    @Override // io.reactivex.d
    public void onError(Throwable th2) {
        this.f119689e = th2;
        for (InnerCompletableCache innerCompletableCache : this.f119687c.getAndSet(f119685g)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.f119690b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.d
    public void onSubscribe(io.reactivex.disposables.b bVar) {
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCache<T> extends io.reactivex.internal.operators.flowable.a<T, T> implements io.reactivex.o<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final CacheSubscription[] f119944m = new CacheSubscription[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final CacheSubscription[] f119945n = new CacheSubscription[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f119946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f119947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicReference<CacheSubscription<T>[]> f119948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile long f119949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final a<T> f119950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a<T> f119951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f119952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Throwable f119953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    volatile boolean f119954l;

    public static final class CacheSubscription<T> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = 6770240836423125754L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f119955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final FlowableCache<T> f119956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f119957d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        a<T> f119958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f119959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f119960g;

        CacheSubscription(org.reactivestreams.d<? super T> dVar, FlowableCache<T> flowableCache) {
            this.f119955b = dVar;
            this.f119956c = flowableCache;
            this.f119958e = flowableCache.f119950h;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f119957d.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f119956c.Q8(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.b(this.f119957d, j10);
                this.f119956c.R8(this);
            }
        }
    }

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T[] f119961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile a<T> f119962b;

        a(int i10) {
            this.f119961a = (T[]) new Object[i10];
        }
    }

    public FlowableCache(io.reactivex.j<T> jVar, int i10) {
        super(jVar);
        this.f119947e = i10;
        this.f119946d = new AtomicBoolean();
        a<T> aVar = new a<>(i10);
        this.f119950h = aVar;
        this.f119951i = aVar;
        this.f119948f = new AtomicReference<>(f119944m);
    }

    void M8(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.f119948f.get();
            if (cacheSubscriptionArr == f119945n) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            cacheSubscriptionArr2 = new CacheSubscription[length + 1];
            System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
        } while (!androidx.compose.animation.core.s0.a(this.f119948f, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    long N8() {
        return this.f119949g;
    }

    boolean O8() {
        return this.f119948f.get().length != 0;
    }

    boolean P8() {
        return this.f119946d.get();
    }

    void Q8(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.f119948f.get();
            int length = cacheSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (cacheSubscriptionArr[i11] == cacheSubscription) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                cacheSubscriptionArr2 = f119944m;
            } else {
                CacheSubscription[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr3, 0, i10);
                System.arraycopy(cacheSubscriptionArr, i10 + 1, cacheSubscriptionArr3, i10, (length - i10) - 1);
                cacheSubscriptionArr2 = cacheSubscriptionArr3;
            }
        } while (!androidx.compose.animation.core.s0.a(this.f119948f, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    void R8(CacheSubscription<T> cacheSubscription) {
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j10 = cacheSubscription.f119960g;
        int i10 = cacheSubscription.f119959f;
        a<T> aVar = cacheSubscription.f119958e;
        AtomicLong atomicLong = cacheSubscription.f119957d;
        org.reactivestreams.d<? super T> dVar = cacheSubscription.f119955b;
        int i11 = this.f119947e;
        int iAddAndGet = 1;
        while (true) {
            boolean z10 = this.f119954l;
            boolean z11 = this.f119949g == j10;
            if (z10 && z11) {
                cacheSubscription.f119958e = null;
                Throwable th2 = this.f119953k;
                if (th2 != null) {
                    dVar.onError(th2);
                    return;
                } else {
                    dVar.onComplete();
                    return;
                }
            }
            if (!z11) {
                long j11 = atomicLong.get();
                if (j11 == Long.MIN_VALUE) {
                    cacheSubscription.f119958e = null;
                    return;
                } else if (j11 != j10) {
                    if (i10 == i11) {
                        aVar = aVar.f119962b;
                        i10 = 0;
                    }
                    dVar.onNext(aVar.f119961a[i10]);
                    i10++;
                    j10++;
                }
            }
            cacheSubscription.f119960g = j10;
            cacheSubscription.f119959f = i10;
            cacheSubscription.f119958e = aVar;
            iAddAndGet = cacheSubscription.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        CacheSubscription<T> cacheSubscription = new CacheSubscription<>(dVar, this);
        dVar.onSubscribe(cacheSubscription);
        M8(cacheSubscription);
        if (this.f119946d.get() || !this.f119946d.compareAndSet(false, true)) {
            R8(cacheSubscription);
        } else {
            this.f121039c.j6(this);
        }
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        this.f119954l = true;
        for (CacheSubscription<T> cacheSubscription : this.f119948f.getAndSet(f119945n)) {
            R8(cacheSubscription);
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f119954l) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f119953k = th2;
        this.f119954l = true;
        for (CacheSubscription<T> cacheSubscription : this.f119948f.getAndSet(f119945n)) {
            R8(cacheSubscription);
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        int i10 = this.f119952j;
        if (i10 == this.f119947e) {
            a<T> aVar = new a<>(i10);
            aVar.f119961a[0] = t10;
            this.f119952j = 1;
            this.f119951i.f119962b = aVar;
            this.f119951i = aVar;
        } else {
            this.f119951i.f119961a[i10] = t10;
            this.f119952j = i10 + 1;
        }
        this.f119949g++;
        for (CacheSubscription<T> cacheSubscription : this.f119948f.get()) {
            R8(cacheSubscription);
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        eVar.request(Long.MAX_VALUE);
    }
}

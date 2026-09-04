package io.reactivex.internal.subscriptions;

import jh.f;
import org.reactivestreams.d;

/* JADX INFO: loaded from: classes5.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f123837d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f123838e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f123839f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f123840g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f123841h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f123842i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f123843j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f123844k = 32;
    private static final long serialVersionUID = -2151279923272604993L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final d<? super T> f123845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected T f123846c;

    public DeferredScalarSubscription(d<? super T> dVar) {
        this.f123845b = dVar;
    }

    public final void c(T t10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                d<? super T> dVar = this.f123845b;
                dVar.onNext(t10);
                if (get() != 4) {
                    dVar.onComplete();
                    return;
                }
                return;
            }
            this.f123846c = t10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.f123846c = null;
                return;
            }
        }
        this.f123846c = t10;
        lazySet(16);
        d<? super T> dVar2 = this.f123845b;
        dVar2.onNext(t10);
        if (get() != 4) {
            dVar2.onComplete();
        }
    }

    public void cancel() {
        set(4);
        this.f123846c = null;
    }

    @Override // lh.o
    public final void clear() {
        lazySet(32);
        this.f123846c = null;
    }

    public final boolean d() {
        return get() == 4;
    }

    public final boolean f() {
        return getAndSet(4) != 4;
    }

    @Override // lh.o
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // lh.o
    @f
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t10 = this.f123846c;
        this.f123846c = null;
        return t10;
    }

    @Override // org.reactivestreams.e
    public final void request(long j10) {
        T t10;
        if (SubscriptionHelper.validate(j10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (t10 = this.f123846c) == null) {
                        return;
                    }
                    this.f123846c = null;
                    d<? super T> dVar = this.f123845b;
                    dVar.onNext(t10);
                    if (get() != 4) {
                        dVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // lh.k
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}

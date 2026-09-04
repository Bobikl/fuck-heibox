package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import jh.f;
import lh.l;
import org.reactivestreams.d;

/* JADX INFO: loaded from: classes5.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements l<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f123847d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f123848e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f123849f = 2;
    private static final long serialVersionUID = -3830916580126663321L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f123850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final d<? super T> f123851c;

    public ScalarSubscription(d<? super T> dVar, T t10) {
        this.f123851c = dVar;
        this.f123850b = t10;
    }

    public boolean a() {
        return get() == 2;
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        lazySet(2);
    }

    @Override // lh.o
    public void clear() {
        lazySet(1);
    }

    @Override // lh.o
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // lh.o
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lh.o
    public boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lh.o
    @f
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f123850b;
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10) && compareAndSet(0, 1)) {
            d<? super T> dVar = this.f123851c;
            dVar.onNext(this.f123850b);
            if (get() != 2) {
                dVar.onComplete();
            }
        }
    }

    @Override // lh.k
    public int requestFusion(int i10) {
        return i10 & 1;
    }
}

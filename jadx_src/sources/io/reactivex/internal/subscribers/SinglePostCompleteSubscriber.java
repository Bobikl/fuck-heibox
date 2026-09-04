package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements o<T>, org.reactivestreams.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f123778f = Long.MIN_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f123779g = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final org.reactivestreams.d<? super R> f123780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected org.reactivestreams.e f123781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected R f123782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f123783e;

    public SinglePostCompleteSubscriber(org.reactivestreams.d<? super R> dVar) {
        this.f123780b = dVar;
    }

    protected final void a(R r10) {
        long j10 = this.f123783e;
        if (j10 != 0) {
            io.reactivex.internal.util.b.e(this, j10);
        }
        while (true) {
            long j11 = get();
            if ((j11 & Long.MIN_VALUE) != 0) {
                b(r10);
                return;
            }
            if ((j11 & Long.MAX_VALUE) != 0) {
                lazySet(com.google.android.exoplayer2.j.f46377b);
                this.f123780b.onNext(r10);
                this.f123780b.onComplete();
                return;
            } else {
                this.f123782d = r10;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.f123782d = null;
                }
            }
        }
    }

    protected void b(R r10) {
    }

    public void cancel() {
        this.f123781c.cancel();
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.validate(this.f123781c, eVar)) {
            this.f123781c = eVar;
            this.f123780b.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.e
    public final void request(long j10) {
        long j11;
        if (SubscriptionHelper.validate(j10)) {
            do {
                j11 = get();
                if ((j11 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, com.google.android.exoplayer2.j.f46377b)) {
                        this.f123780b.onNext(this.f123782d);
                        this.f123780b.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j11, io.reactivex.internal.util.b.c(j11, j10)));
            this.f123781c.request(j10);
        }
    }
}

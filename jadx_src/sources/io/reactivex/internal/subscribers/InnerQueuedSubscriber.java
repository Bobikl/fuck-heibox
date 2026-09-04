package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.n;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements o<T>, org.reactivestreams.e {
    private static final long serialVersionUID = 22876611072430776L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final g<T> f123767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f123768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f123769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile lh.o<T> f123770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f123771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f123772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f123773h;

    public InnerQueuedSubscriber(g<T> gVar, int i10) {
        this.f123767b = gVar;
        this.f123768c = i10;
        this.f123769d = i10 - (i10 >> 2);
    }

    public boolean a() {
        return this.f123771f;
    }

    public lh.o<T> b() {
        return this.f123770e;
    }

    public void c() {
        if (this.f123773h != 1) {
            long j10 = this.f123772g + 1;
            if (j10 != this.f123769d) {
                this.f123772g = j10;
            } else {
                this.f123772g = 0L;
                get().request(j10);
            }
        }
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void d() {
        this.f123771f = true;
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        this.f123767b.a(this);
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        this.f123767b.c(this, th2);
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (this.f123773h == 0) {
            this.f123767b.d(this, t10);
        } else {
            this.f123767b.b();
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.setOnce(this, eVar)) {
            if (eVar instanceof lh.l) {
                lh.l lVar = (lh.l) eVar;
                int iRequestFusion = lVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f123773h = iRequestFusion;
                    this.f123770e = lVar;
                    this.f123771f = true;
                    this.f123767b.a(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f123773h = iRequestFusion;
                    this.f123770e = lVar;
                    n.j(eVar, this.f123768c);
                    return;
                }
            }
            this.f123770e = n.c(this.f123768c);
            n.j(eVar, this.f123768c);
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        if (this.f123773h != 1) {
            long j11 = this.f123772g + j10;
            if (j11 < this.f123769d) {
                this.f123772g = j11;
            } else {
                this.f123772g = 0L;
                get().request(j11);
            }
        }
    }
}

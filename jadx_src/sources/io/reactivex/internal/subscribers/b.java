package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;

/* JADX INFO: compiled from: BasicFuseableSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b<T, R> implements o<T>, lh.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final org.reactivestreams.d<? super R> f123797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected org.reactivestreams.e f123798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected lh.l<T> f123799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f123800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f123801f;

    public b(org.reactivestreams.d<? super R> dVar) {
        this.f123797b = dVar;
    }

    protected void a() {
    }

    protected boolean b() {
        return true;
    }

    protected final void c(Throwable th2) {
        io.reactivex.exceptions.a.b(th2);
        this.f123798c.cancel();
        onError(th2);
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        this.f123798c.cancel();
    }

    public void clear() {
        this.f123799d.clear();
    }

    protected final int d(int i10) {
        lh.l<T> lVar = this.f123799d;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = lVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f123801f = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // lh.o
    public boolean isEmpty() {
        return this.f123799d.isEmpty();
    }

    @Override // lh.o
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lh.o
    public final boolean offer(R r10, R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (this.f123800e) {
            return;
        }
        this.f123800e = true;
        this.f123797b.onComplete();
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f123800e) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            this.f123800e = true;
            this.f123797b.onError(th2);
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public final void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.validate(this.f123798c, eVar)) {
            this.f123798c = eVar;
            if (eVar instanceof lh.l) {
                this.f123799d = (lh.l) eVar;
            }
            if (b()) {
                this.f123797b.onSubscribe(this);
                a();
            }
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        this.f123798c.request(j10);
    }
}

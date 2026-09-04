package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: BasicFuseableConditionalSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T, R> implements lh.a<T>, lh.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final lh.a<? super R> f123792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected org.reactivestreams.e f123793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected lh.l<T> f123794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f123795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f123796f;

    public a(lh.a<? super R> aVar) {
        this.f123792b = aVar;
    }

    protected void a() {
    }

    protected boolean b() {
        return true;
    }

    protected final void c(Throwable th2) {
        io.reactivex.exceptions.a.b(th2);
        this.f123793c.cancel();
        onError(th2);
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        this.f123793c.cancel();
    }

    @Override // lh.o
    public void clear() {
        this.f123794d.clear();
    }

    protected final int d(int i10) {
        lh.l<T> lVar = this.f123794d;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = lVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f123796f = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // lh.o
    public boolean isEmpty() {
        return this.f123794d.isEmpty();
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
        if (this.f123795e) {
            return;
        }
        this.f123795e = true;
        this.f123792b.onComplete();
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f123795e) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            this.f123795e = true;
            this.f123792b.onError(th2);
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public final void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.validate(this.f123793c, eVar)) {
            this.f123793c = eVar;
            if (eVar instanceof lh.l) {
                this.f123794d = (lh.l) eVar;
            }
            if (b()) {
                this.f123792b.onSubscribe(this);
                a();
            }
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        this.f123793c.request(j10);
    }
}

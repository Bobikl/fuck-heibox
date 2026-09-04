package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import lh.n;

/* JADX INFO: compiled from: QueueDrainSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h<T, U, V> extends l implements o<T>, io.reactivex.internal.util.m<U, V> {
    protected final org.reactivestreams.d<? super V> W;
    protected final n<U> X;
    protected volatile boolean Y;
    protected volatile boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected Throwable f123809a0;

    public h(org.reactivestreams.d<? super V> dVar, n<U> nVar) {
        this.W = dVar;
        this.X = nVar;
    }

    @Override // io.reactivex.internal.util.m
    public final int a(int i10) {
        return this.f123834q.addAndGet(i10);
    }

    @Override // io.reactivex.internal.util.m
    public final boolean b() {
        return this.f123834q.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.m
    public final boolean c() {
        return this.Z;
    }

    @Override // io.reactivex.internal.util.m
    public final boolean d() {
        return this.Y;
    }

    @Override // io.reactivex.internal.util.m
    public final long f() {
        return this.G.get();
    }

    @Override // io.reactivex.internal.util.m
    public final long g(long j10) {
        return this.G.addAndGet(-j10);
    }

    @Override // io.reactivex.internal.util.m
    public final Throwable h() {
        return this.f123809a0;
    }

    public boolean j(org.reactivestreams.d<? super V> dVar, U u10) {
        return false;
    }

    public final boolean k() {
        return this.f123834q.get() == 0 && this.f123834q.compareAndSet(0, 1);
    }

    protected final void l(U u10, boolean z10, io.reactivex.disposables.b bVar) {
        org.reactivestreams.d<? super V> dVar = this.W;
        n<U> nVar = this.X;
        if (k()) {
            long j10 = this.G.get();
            if (j10 == 0) {
                bVar.dispose();
                dVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (j(dVar, u10) && j10 != Long.MAX_VALUE) {
                    g(1L);
                }
                if (a(-1) == 0) {
                    return;
                }
            }
        } else {
            nVar.offer(u10);
            if (!b()) {
                return;
            }
        }
        io.reactivex.internal.util.n.e(nVar, dVar, z10, bVar, this);
    }

    protected final void n(U u10, boolean z10, io.reactivex.disposables.b bVar) {
        org.reactivestreams.d<? super V> dVar = this.W;
        n<U> nVar = this.X;
        if (k()) {
            long j10 = this.G.get();
            if (j10 == 0) {
                this.Y = true;
                bVar.dispose();
                dVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (nVar.isEmpty()) {
                if (j(dVar, u10) && j10 != Long.MAX_VALUE) {
                    g(1L);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                nVar.offer(u10);
            }
        } else {
            nVar.offer(u10);
            if (!b()) {
                return;
            }
        }
        io.reactivex.internal.util.n.e(nVar, dVar, z10, bVar, this);
    }

    public final void o(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            io.reactivex.internal.util.b.a(this.G, j10);
        }
    }
}

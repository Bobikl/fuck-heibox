package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.a;
import io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes5.dex */
public class SubscriptionArbiter extends AtomicInteger implements e {
    private static final long serialVersionUID = -2189523197179400958L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f123852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f123853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<e> f123854d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicLong f123855e = new AtomicLong();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicLong f123856f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f123857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    volatile boolean f123858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f123859i;

    public SubscriptionArbiter(boolean z10) {
        this.f123857g = z10;
    }

    final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        d();
    }

    public void cancel() {
        if (this.f123858h) {
            return;
        }
        this.f123858h = true;
        c();
    }

    final void d() {
        int iAddAndGet = 1;
        e eVar = null;
        long jC = 0;
        do {
            e andSet = this.f123854d.get();
            if (andSet != null) {
                andSet = this.f123854d.getAndSet(null);
            }
            long andSet2 = this.f123855e.get();
            if (andSet2 != 0) {
                andSet2 = this.f123855e.getAndSet(0L);
            }
            long andSet3 = this.f123856f.get();
            if (andSet3 != 0) {
                andSet3 = this.f123856f.getAndSet(0L);
            }
            e eVar2 = this.f123852b;
            if (this.f123858h) {
                if (eVar2 != null) {
                    eVar2.cancel();
                    this.f123852b = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jC2 = this.f123853c;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = b.c(jC2, andSet2);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet3;
                        if (jC2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jC2);
                            jC2 = 0;
                        }
                    }
                    this.f123853c = jC2;
                }
                if (andSet != null) {
                    if (eVar2 != null && this.f123857g) {
                        eVar2.cancel();
                    }
                    this.f123852b = andSet;
                    if (jC2 != 0) {
                        jC = b.c(jC, jC2);
                        eVar = andSet;
                    }
                } else if (eVar2 != null && andSet2 != 0) {
                    jC = b.c(jC, andSet2);
                    eVar = eVar2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            eVar.request(jC);
        }
    }

    public final boolean e() {
        return this.f123858h;
    }

    public final boolean f() {
        return this.f123859i;
    }

    public final void g(long j10) {
        if (this.f123859i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            b.a(this.f123856f, j10);
            c();
            return;
        }
        long j11 = this.f123853c;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                SubscriptionHelper.reportMoreProduced(j12);
                j12 = 0;
            }
            this.f123853c = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        d();
    }

    public final void h(e eVar) {
        if (this.f123858h) {
            eVar.cancel();
            return;
        }
        a.g(eVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            e andSet = this.f123854d.getAndSet(eVar);
            if (andSet != null && this.f123857g) {
                andSet.cancel();
            }
            c();
            return;
        }
        e eVar2 = this.f123852b;
        if (eVar2 != null && this.f123857g) {
            eVar2.cancel();
        }
        this.f123852b = eVar;
        long j10 = this.f123853c;
        if (decrementAndGet() != 0) {
            d();
        }
        if (j10 != 0) {
            eVar.request(j10);
        }
    }

    @Override // org.reactivestreams.e
    public final void request(long j10) {
        if (!SubscriptionHelper.validate(j10) || this.f123859i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            b.a(this.f123855e, j10);
            c();
            return;
        }
        long j11 = this.f123853c;
        if (j11 != Long.MAX_VALUE) {
            long jC = b.c(j11, j10);
            this.f123853c = jC;
            if (jC == Long.MAX_VALUE) {
                this.f123859i = true;
            }
        }
        e eVar = this.f123852b;
        if (decrementAndGet() != 0) {
            d();
        }
        if (eVar != null) {
            eVar.request(j10);
        }
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMap<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f120772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f120774f;

    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SwitchMapSubscriber<T, R> f120775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile lh.o<R> f120778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f120779f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f120780g;

        SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j10, int i10) {
            this.f120775b = switchMapSubscriber;
            this.f120776c = j10;
            this.f120777d = i10;
        }

        public void a() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.f120775b;
            if (this.f120776c == switchMapSubscriber.f120792l) {
                this.f120779f = true;
                switchMapSubscriber.b();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.f120775b;
            if (this.f120776c != switchMapSubscriber.f120792l || !switchMapSubscriber.f120787g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!switchMapSubscriber.f120785e) {
                switchMapSubscriber.f120789i.cancel();
            }
            this.f120779f = true;
            switchMapSubscriber.b();
        }

        @Override // org.reactivestreams.d
        public void onNext(R r10) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.f120775b;
            if (this.f120776c == switchMapSubscriber.f120792l) {
                if (this.f120780g != 0 || this.f120778e.offer(r10)) {
                    switchMapSubscriber.b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this, eVar)) {
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f120780g = iRequestFusion;
                        this.f120778e = lVar;
                        this.f120779f = true;
                        this.f120775b.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f120780g = iRequestFusion;
                        this.f120778e = lVar;
                        eVar.request(this.f120777d);
                        return;
                    }
                }
                this.f120778e = new SpscArrayQueue(this.f120777d);
                eVar.request(this.f120777d);
            }
        }
    }

    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final SwitchMapInnerSubscriber<Object, Object> f120781m;
        private static final long serialVersionUID = -3491074160481096299L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f120783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f120785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f120786f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f120788h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        org.reactivestreams.e f120789i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile long f120792l;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> f120790j = new AtomicReference<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicLong f120791k = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicThrowable f120787g = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1L, 1);
            f120781m = switchMapInnerSubscriber;
            switchMapInnerSubscriber.a();
        }

        SwitchMapSubscriber(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, boolean z10) {
            this.f120782b = dVar;
            this.f120783c = oVar;
            this.f120784d = i10;
            this.f120785e = z10;
        }

        void a() {
            SwitchMapInnerSubscriber<T, R> andSet;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.f120790j.get();
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber2 = f120781m;
            if (switchMapInnerSubscriber == switchMapInnerSubscriber2 || (andSet = this.f120790j.getAndSet((SwitchMapInnerSubscriber<T, R>) switchMapInnerSubscriber2)) == switchMapInnerSubscriber2 || andSet == null) {
                return;
            }
            andSet.a();
        }

        void b() {
            boolean z10;
            a.a.a.a.d.p.d.c.d dVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super R> dVar = this.f120782b;
            int iAddAndGet = 1;
            while (!this.f120788h) {
                if (this.f120786f) {
                    if (this.f120785e) {
                        if (this.f120790j.get() == null) {
                            if (this.f120787g.get() != null) {
                                dVar.onError(this.f120787g.c());
                                return;
                            } else {
                                dVar.onComplete();
                                return;
                            }
                        }
                    } else if (this.f120787g.get() != null) {
                        a();
                        dVar.onError(this.f120787g.c());
                        return;
                    } else if (this.f120790j.get() == null) {
                        dVar.onComplete();
                        return;
                    }
                }
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.f120790j.get();
                lh.o<R> oVar = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.f120778e : null;
                if (oVar != null) {
                    if (switchMapInnerSubscriber.f120779f) {
                        if (this.f120785e) {
                            if (oVar.isEmpty()) {
                                androidx.compose.animation.core.s0.a(this.f120790j, switchMapInnerSubscriber, null);
                            }
                        } else if (this.f120787g.get() != null) {
                            a();
                            dVar.onError(this.f120787g.c());
                            return;
                        } else if (oVar.isEmpty()) {
                            androidx.compose.animation.core.s0.a(this.f120790j, switchMapInnerSubscriber, null);
                        }
                    }
                    long j10 = this.f120791k.get();
                    long j11 = 0;
                    while (true) {
                        z10 = false;
                        if (j11 != j10) {
                            if (!this.f120788h) {
                                boolean z11 = switchMapInnerSubscriber.f120779f;
                                try {
                                    dVarPoll = oVar.poll();
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.a.b(th2);
                                    switchMapInnerSubscriber.a();
                                    this.f120787g.a(th2);
                                    dVarPoll = null;
                                    z11 = true;
                                }
                                boolean z12 = dVarPoll == null;
                                if (switchMapInnerSubscriber == this.f120790j.get()) {
                                    if (z11) {
                                        if (this.f120785e) {
                                            if (z12) {
                                                androidx.compose.animation.core.s0.a(this.f120790j, switchMapInnerSubscriber, null);
                                            }
                                        } else if (this.f120787g.get() != null) {
                                            dVar.onError(this.f120787g.c());
                                            return;
                                        } else if (z12) {
                                            androidx.compose.animation.core.s0.a(this.f120790j, switchMapInnerSubscriber, null);
                                        }
                                    }
                                    if (z12) {
                                        break;
                                    }
                                    dVar.onNext(dVarPoll);
                                    j11++;
                                }
                                z10 = true;
                                break;
                            }
                            return;
                        }
                        break;
                    }
                    if (j11 != 0 && !this.f120788h) {
                        if (j10 != Long.MAX_VALUE) {
                            this.f120791k.addAndGet(-j11);
                        }
                        switchMapInnerSubscriber.get().request(j11);
                    }
                    if (z10) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f120790j.lazySet(null);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120788h) {
                return;
            }
            this.f120788h = true;
            this.f120789i.cancel();
            a();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120786f) {
                return;
            }
            this.f120786f = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120786f || !this.f120787g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f120785e) {
                a();
            }
            this.f120786f = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (this.f120786f) {
                return;
            }
            long j10 = this.f120792l + 1;
            this.f120792l = j10;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.f120790j.get();
            if (switchMapInnerSubscriber2 != null) {
                switchMapInnerSubscriber2.a();
            }
            try {
                org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120783c.apply(t10), "The publisher returned is null");
                SwitchMapInnerSubscriber switchMapInnerSubscriber3 = new SwitchMapInnerSubscriber(this, j10, this.f120784d);
                do {
                    switchMapInnerSubscriber = this.f120790j.get();
                    if (switchMapInnerSubscriber == f120781m) {
                        return;
                    }
                } while (!androidx.compose.animation.core.s0.a(this.f120790j, switchMapInnerSubscriber, switchMapInnerSubscriber3));
                cVar.g(switchMapInnerSubscriber3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f120789i.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120789i, eVar)) {
                this.f120789i = eVar;
                this.f120782b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120791k, j10);
                if (this.f120792l == 0) {
                    this.f120789i.request(Long.MAX_VALUE);
                } else {
                    b();
                }
            }
        }
    }

    public FlowableSwitchMap(io.reactivex.j<T> jVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, boolean z10) {
        super(jVar);
        this.f120772d = oVar;
        this.f120773e = i10;
        this.f120774f = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        if (v0.b(this.f121039c, dVar, this.f120772d)) {
            return;
        }
        this.f121039c.j6(new SwitchMapSubscriber(dVar, this.f120772d, this.f120773e, this.f120774f));
    }
}

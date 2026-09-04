package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapEager<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f120027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f120029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ErrorMode f120030g;

    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e, io.reactivex.internal.subscribers.g<R> {
        private static final long serialVersionUID = -4255299542215038287L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f120032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ErrorMode f120035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicThrowable f120036g = new AtomicThrowable();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicLong f120037h = new AtomicLong();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final io.reactivex.internal.queue.a<InnerQueuedSubscriber<R>> f120038i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        org.reactivestreams.e f120039j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f120040k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f120041l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile InnerQueuedSubscriber<R> f120042m;

        ConcatMapEagerDelayErrorSubscriber(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, int i11, ErrorMode errorMode) {
            this.f120031b = dVar;
            this.f120032c = oVar;
            this.f120033d = i10;
            this.f120034e = i11;
            this.f120035f = errorMode;
            this.f120038i = new io.reactivex.internal.queue.a<>(Math.min(i11, i10));
        }

        @Override // io.reactivex.internal.subscribers.g
        public void a(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.d();
            b();
        }

        @Override // io.reactivex.internal.subscribers.g
        public void b() {
            int i10;
            boolean z10;
            long j10;
            long j11;
            lh.o<R> oVarB;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.f120042m;
            org.reactivestreams.d<? super R> dVar = this.f120031b;
            ErrorMode errorMode = this.f120035f;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.f120037h.get();
                if (innerQueuedSubscriberPoll != null) {
                    innerQueuedSubscriberPoll = innerQueuedSubscriberPoll;
                } else {
                    if (errorMode != ErrorMode.END && this.f120036g.get() != null) {
                        e();
                        dVar.onError(this.f120036g.c());
                        return;
                    }
                    boolean z11 = this.f120041l;
                    innerQueuedSubscriberPoll = this.f120038i.poll();
                    if (z11 && innerQueuedSubscriberPoll == null) {
                        Throwable thC = this.f120036g.c();
                        if (thC != null) {
                            dVar.onError(thC);
                            return;
                        } else {
                            dVar.onComplete();
                            return;
                        }
                    }
                    if (innerQueuedSubscriberPoll != null) {
                        this.f120042m = innerQueuedSubscriberPoll;
                    }
                }
                if (innerQueuedSubscriberPoll == null || (oVarB = innerQueuedSubscriberPoll.b()) == null) {
                    i10 = iAddAndGet;
                    z10 = false;
                    j10 = 0;
                    j11 = 0;
                } else {
                    j11 = 0;
                    while (true) {
                        i10 = iAddAndGet;
                        if (j11 != j12) {
                            if (this.f120040k) {
                                e();
                                return;
                            }
                            if (errorMode == ErrorMode.IMMEDIATE && this.f120036g.get() != null) {
                                this.f120042m = null;
                                innerQueuedSubscriberPoll.cancel();
                                e();
                                dVar.onError(this.f120036g.c());
                                return;
                            }
                            boolean zA = innerQueuedSubscriberPoll.a();
                            try {
                                R rPoll = oVarB.poll();
                                boolean z12 = rPoll == null;
                                if (zA && z12) {
                                    this.f120042m = null;
                                    this.f120039j.request(1L);
                                    innerQueuedSubscriberPoll = null;
                                    z10 = true;
                                    break;
                                }
                                if (!z12) {
                                    dVar.onNext(rPoll);
                                    j11++;
                                    innerQueuedSubscriberPoll.c();
                                    iAddAndGet = i10;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                this.f120042m = null;
                                innerQueuedSubscriberPoll.cancel();
                                e();
                                dVar.onError(th2);
                                return;
                            }
                        }
                        z10 = false;
                        break;
                    }
                    if (j11 == j12) {
                        if (this.f120040k) {
                            e();
                            return;
                        }
                        if (errorMode == ErrorMode.IMMEDIATE && this.f120036g.get() != null) {
                            this.f120042m = null;
                            innerQueuedSubscriberPoll.cancel();
                            e();
                            dVar.onError(this.f120036g.c());
                            return;
                        }
                        boolean zA2 = innerQueuedSubscriberPoll.a();
                        boolean zIsEmpty = oVarB.isEmpty();
                        if (zA2 && zIsEmpty) {
                            this.f120042m = null;
                            this.f120039j.request(1L);
                            innerQueuedSubscriberPoll = null;
                            z10 = true;
                        }
                    }
                    j10 = 0;
                }
                if (j11 != j10 && j12 != Long.MAX_VALUE) {
                    this.f120037h.addAndGet(-j11);
                }
                if (z10) {
                    iAddAndGet = i10;
                } else {
                    iAddAndGet = addAndGet(-i10);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.g
        public void c(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th2) {
            if (!this.f120036g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            innerQueuedSubscriber.d();
            if (this.f120035f != ErrorMode.END) {
                this.f120039j.cancel();
            }
            b();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120040k) {
                return;
            }
            this.f120040k = true;
            this.f120039j.cancel();
            f();
        }

        @Override // io.reactivex.internal.subscribers.g
        public void d(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r10) {
            if (innerQueuedSubscriber.b().offer(r10)) {
                b();
            } else {
                innerQueuedSubscriber.cancel();
                c(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        void e() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.f120042m;
            this.f120042m = null;
            if (innerQueuedSubscriber != null) {
                innerQueuedSubscriber.cancel();
            }
            while (true) {
                InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.f120038i.poll();
                if (innerQueuedSubscriberPoll == null) {
                    return;
                } else {
                    innerQueuedSubscriberPoll.cancel();
                }
            }
        }

        void f() {
            if (getAndIncrement() == 0) {
                do {
                    e();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120041l = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f120036g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120041l = true;
                b();
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            try {
                org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120032c.apply(t10), "The mapper returned a null Publisher");
                InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.f120034e);
                if (this.f120040k) {
                    return;
                }
                this.f120038i.offer(innerQueuedSubscriber);
                cVar.g(innerQueuedSubscriber);
                if (this.f120040k) {
                    innerQueuedSubscriber.cancel();
                    f();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f120039j.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120039j, eVar)) {
                this.f120039j = eVar;
                this.f120031b.onSubscribe(this);
                int i10 = this.f120033d;
                eVar.request(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120037h, j10);
                b();
            }
        }
    }

    public FlowableConcatMapEager(io.reactivex.j<T> jVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, int i11, ErrorMode errorMode) {
        super(jVar);
        this.f120027d = oVar;
        this.f120028e = i10;
        this.f120029f = i11;
        this.f120030g = errorMode;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        this.f121039c.j6(new ConcatMapEagerDelayErrorSubscriber(dVar, this.f120027d, this.f120028e, this.f120029f, this.f120030g));
    }
}

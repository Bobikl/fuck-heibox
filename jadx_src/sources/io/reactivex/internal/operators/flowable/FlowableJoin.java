package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends a<TLeft, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<? extends TRight> f120357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super TLeft, ? extends org.reactivestreams.c<TLeftEnd>> f120358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> f120359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final kh.c<? super TLeft, ? super TRight, ? extends R> f120360g;

    public static final class JoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements org.reactivestreams.e, FlowableGroupJoin.a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final Integer f120361p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final Integer f120362q = 2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final Integer f120363r = 3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final Integer f120364s = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120365b;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final kh.o<? super TLeft, ? extends org.reactivestreams.c<TLeftEnd>> f120372i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> f120373j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final kh.c<? super TLeft, ? super TRight, ? extends R> f120374k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f120376m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120377n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        volatile boolean f120378o;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f120366c = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.disposables.a f120368e = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f120367d = new io.reactivex.internal.queue.a<>(io.reactivex.j.Y());

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Map<Integer, TLeft> f120369f = new LinkedHashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Map<Integer, TRight> f120370g = new LinkedHashMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<Throwable> f120371h = new AtomicReference<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicInteger f120375l = new AtomicInteger(2);

        JoinSubscription(org.reactivestreams.d<? super R> dVar, kh.o<? super TLeft, ? extends org.reactivestreams.c<TLeftEnd>> oVar, kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> oVar2, kh.c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.f120365b = dVar;
            this.f120372i = oVar;
            this.f120373j = oVar2;
            this.f120374k = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void a(Throwable th2) {
            if (!ExceptionHelper.a(this.f120371h, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120375l.decrementAndGet();
                g();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void b(Throwable th2) {
            if (ExceptionHelper.a(this.f120371h, th2)) {
                g();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void c(boolean z10, Object obj) {
            synchronized (this) {
                this.f120367d.offer(z10 ? f120361p : f120362q, obj);
            }
            g();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120378o) {
                return;
            }
            this.f120378o = true;
            f();
            if (getAndIncrement() == 0) {
                this.f120367d.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void d(boolean z10, FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                this.f120367d.offer(z10 ? f120363r : f120364s, leftRightEndSubscriber);
            }
            g();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void e(FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber) {
            this.f120368e.b(leftRightSubscriber);
            this.f120375l.decrementAndGet();
            g();
        }

        void f() {
            this.f120368e.dispose();
        }

        void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.a<Object> aVar = this.f120367d;
            org.reactivestreams.d<? super R> dVar = this.f120365b;
            boolean z10 = true;
            int iAddAndGet = 1;
            while (!this.f120378o) {
                if (this.f120371h.get() != null) {
                    aVar.clear();
                    f();
                    h(dVar);
                    return;
                }
                boolean z11 = this.f120375l.get() == 0 ? z10 : false;
                Integer num = (Integer) aVar.poll();
                boolean z12 = num == null ? z10 : false;
                if (z11 && z12) {
                    this.f120369f.clear();
                    this.f120370g.clear();
                    this.f120368e.dispose();
                    dVar.onComplete();
                    return;
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = aVar.poll();
                    if (num == f120361p) {
                        int i10 = this.f120376m;
                        this.f120376m = i10 + 1;
                        this.f120369f.put(Integer.valueOf(i10), (TLeft) objPoll);
                        try {
                            org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120372i.apply(objPoll), "The leftEnd returned a null Publisher");
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber = new FlowableGroupJoin.LeftRightEndSubscriber(this, z10, i10);
                            this.f120368e.c(leftRightEndSubscriber);
                            cVar.g(leftRightEndSubscriber);
                            if (this.f120371h.get() != null) {
                                aVar.clear();
                                f();
                                h(dVar);
                                return;
                            }
                            long j10 = this.f120366c.get();
                            Iterator<TRight> it = this.f120370g.values().iterator();
                            long j11 = 0;
                            while (it.hasNext()) {
                                try {
                                    a.a.a.a.d.p.d.c.d dVar2 = (Object) io.reactivex.internal.functions.a.g(this.f120374k.apply(objPoll, it.next()), "The resultSelector returned a null value");
                                    if (j11 == j10) {
                                        ExceptionHelper.a(this.f120371h, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        aVar.clear();
                                        f();
                                        h(dVar);
                                        return;
                                    }
                                    dVar.onNext(dVar2);
                                    j11++;
                                } catch (Throwable th2) {
                                    j(th2, dVar, aVar);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                io.reactivex.internal.util.b.e(this.f120366c, j11);
                            }
                        } catch (Throwable th3) {
                            j(th3, dVar, aVar);
                            return;
                        }
                    } else if (num == f120362q) {
                        int i11 = this.f120377n;
                        this.f120377n = i11 + 1;
                        this.f120370g.put(Integer.valueOf(i11), (TRight) objPoll);
                        try {
                            org.reactivestreams.c cVar2 = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120373j.apply(objPoll), "The rightEnd returned a null Publisher");
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber2 = new FlowableGroupJoin.LeftRightEndSubscriber(this, false, i11);
                            this.f120368e.c(leftRightEndSubscriber2);
                            cVar2.g(leftRightEndSubscriber2);
                            if (this.f120371h.get() != null) {
                                aVar.clear();
                                f();
                                h(dVar);
                                return;
                            }
                            long j12 = this.f120366c.get();
                            Iterator<TLeft> it2 = this.f120369f.values().iterator();
                            long j13 = 0;
                            while (it2.hasNext()) {
                                try {
                                    a.a.a.a.d.p.d.c.d dVar3 = (Object) io.reactivex.internal.functions.a.g(this.f120374k.apply(it2.next(), objPoll), "The resultSelector returned a null value");
                                    if (j13 == j12) {
                                        ExceptionHelper.a(this.f120371h, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        aVar.clear();
                                        f();
                                        h(dVar);
                                        return;
                                    }
                                    dVar.onNext(dVar3);
                                    j13++;
                                } catch (Throwable th4) {
                                    j(th4, dVar, aVar);
                                    return;
                                }
                            }
                            if (j13 != 0) {
                                io.reactivex.internal.util.b.e(this.f120366c, j13);
                            }
                        } catch (Throwable th5) {
                            j(th5, dVar, aVar);
                            return;
                        }
                    } else if (num == f120363r) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber3 = (FlowableGroupJoin.LeftRightEndSubscriber) objPoll;
                        this.f120369f.remove(Integer.valueOf(leftRightEndSubscriber3.f120311d));
                        this.f120368e.a(leftRightEndSubscriber3);
                    } else if (num == f120364s) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber4 = (FlowableGroupJoin.LeftRightEndSubscriber) objPoll;
                        this.f120370g.remove(Integer.valueOf(leftRightEndSubscriber4.f120311d));
                        this.f120368e.a(leftRightEndSubscriber4);
                    }
                    z10 = true;
                }
            }
            aVar.clear();
        }

        void h(org.reactivestreams.d<?> dVar) {
            Throwable thC = ExceptionHelper.c(this.f120371h);
            this.f120369f.clear();
            this.f120370g.clear();
            dVar.onError(thC);
        }

        void j(Throwable th2, org.reactivestreams.d<?> dVar, lh.o<?> oVar) {
            io.reactivex.exceptions.a.b(th2);
            ExceptionHelper.a(this.f120371h, th2);
            oVar.clear();
            f();
            h(dVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120366c, j10);
            }
        }
    }

    public FlowableJoin(io.reactivex.j<TLeft> jVar, org.reactivestreams.c<? extends TRight> cVar, kh.o<? super TLeft, ? extends org.reactivestreams.c<TLeftEnd>> oVar, kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> oVar2, kh.c<? super TLeft, ? super TRight, ? extends R> cVar2) {
        super(jVar);
        this.f120357d = cVar;
        this.f120358e = oVar;
        this.f120359f = oVar2;
        this.f120360g = cVar2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        JoinSubscription joinSubscription = new JoinSubscription(dVar, this.f120358e, this.f120359f, this.f120360g);
        dVar.onSubscribe(joinSubscription);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, true);
        joinSubscription.f120368e.c(leftRightSubscriber);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber2 = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, false);
        joinSubscription.f120368e.c(leftRightSubscriber2);
        this.f121039c.j6(leftRightSubscriber);
        this.f120357d.g(leftRightSubscriber2);
    }
}

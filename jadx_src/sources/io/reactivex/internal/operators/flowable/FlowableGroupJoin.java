package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.flowable.a<TLeft, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<? extends TRight> f120287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super TLeft, ? extends org.reactivestreams.c<TLeftEnd>> f120288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> f120289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final kh.c<? super TLeft, ? super io.reactivex.j<TRight>, ? extends R> f120290g;

    public static final class GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements org.reactivestreams.e, a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final Integer f120291p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final Integer f120292q = 2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final Integer f120293r = 3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final Integer f120294s = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120295b;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final kh.o<? super TLeft, ? extends org.reactivestreams.c<TLeftEnd>> f120302i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> f120303j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final kh.c<? super TLeft, ? super io.reactivex.j<TRight>, ? extends R> f120304k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f120306m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120307n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        volatile boolean f120308o;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f120296c = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.disposables.a f120298e = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f120297d = new io.reactivex.internal.queue.a<>(io.reactivex.j.Y());

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Map<Integer, UnicastProcessor<TRight>> f120299f = new LinkedHashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Map<Integer, TRight> f120300g = new LinkedHashMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<Throwable> f120301h = new AtomicReference<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicInteger f120305l = new AtomicInteger(2);

        GroupJoinSubscription(org.reactivestreams.d<? super R> dVar, kh.o<? super TLeft, ? extends org.reactivestreams.c<TLeftEnd>> oVar, kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> oVar2, kh.c<? super TLeft, ? super io.reactivex.j<TRight>, ? extends R> cVar) {
            this.f120295b = dVar;
            this.f120302i = oVar;
            this.f120303j = oVar2;
            this.f120304k = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void a(Throwable th2) {
            if (!ExceptionHelper.a(this.f120301h, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120305l.decrementAndGet();
                g();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void b(Throwable th2) {
            if (ExceptionHelper.a(this.f120301h, th2)) {
                g();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void c(boolean z10, Object obj) {
            synchronized (this) {
                this.f120297d.offer(z10 ? f120291p : f120292q, obj);
            }
            g();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120308o) {
                return;
            }
            this.f120308o = true;
            f();
            if (getAndIncrement() == 0) {
                this.f120297d.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void d(boolean z10, LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                this.f120297d.offer(z10 ? f120293r : f120294s, leftRightEndSubscriber);
            }
            g();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.a
        public void e(LeftRightSubscriber leftRightSubscriber) {
            this.f120298e.b(leftRightSubscriber);
            this.f120305l.decrementAndGet();
            g();
        }

        void f() {
            this.f120298e.dispose();
        }

        void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.a<Object> aVar = this.f120297d;
            org.reactivestreams.d<? super R> dVar = this.f120295b;
            int iAddAndGet = 1;
            while (!this.f120308o) {
                if (this.f120301h.get() != null) {
                    aVar.clear();
                    f();
                    h(dVar);
                    return;
                }
                boolean z10 = this.f120305l.get() == 0;
                Integer num = (Integer) aVar.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    Iterator<UnicastProcessor<TRight>> it = this.f120299f.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.f120299f.clear();
                    this.f120300g.clear();
                    this.f120298e.dispose();
                    dVar.onComplete();
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = aVar.poll();
                    if (num == f120291p) {
                        UnicastProcessor unicastProcessorS8 = UnicastProcessor.S8();
                        int i10 = this.f120306m;
                        this.f120306m = i10 + 1;
                        this.f120299f.put(Integer.valueOf(i10), (UnicastProcessor<TRight>) unicastProcessorS8);
                        try {
                            org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120302i.apply(objPoll), "The leftEnd returned a null Publisher");
                            LeftRightEndSubscriber leftRightEndSubscriber = new LeftRightEndSubscriber(this, true, i10);
                            this.f120298e.c(leftRightEndSubscriber);
                            cVar.g(leftRightEndSubscriber);
                            if (this.f120301h.get() != null) {
                                aVar.clear();
                                f();
                                h(dVar);
                                return;
                            }
                            try {
                                a.a.a.a.d.p.d.c.d dVar2 = (Object) io.reactivex.internal.functions.a.g(this.f120304k.apply(objPoll, unicastProcessorS8), "The resultSelector returned a null value");
                                if (this.f120296c.get() == 0) {
                                    j(new MissingBackpressureException("Could not emit value due to lack of requests"), dVar, aVar);
                                    return;
                                }
                                dVar.onNext(dVar2);
                                io.reactivex.internal.util.b.e(this.f120296c, 1L);
                                Iterator<TRight> it2 = this.f120300g.values().iterator();
                                while (it2.hasNext()) {
                                    unicastProcessorS8.onNext(it2.next());
                                }
                            } catch (Throwable th2) {
                                j(th2, dVar, aVar);
                                return;
                            }
                        } catch (Throwable th3) {
                            j(th3, dVar, aVar);
                            return;
                        }
                    } else if (num == f120292q) {
                        int i11 = this.f120307n;
                        this.f120307n = i11 + 1;
                        this.f120300g.put(Integer.valueOf(i11), (TRight) objPoll);
                        try {
                            org.reactivestreams.c cVar2 = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120303j.apply(objPoll), "The rightEnd returned a null Publisher");
                            LeftRightEndSubscriber leftRightEndSubscriber2 = new LeftRightEndSubscriber(this, false, i11);
                            this.f120298e.c(leftRightEndSubscriber2);
                            cVar2.g(leftRightEndSubscriber2);
                            if (this.f120301h.get() != null) {
                                aVar.clear();
                                f();
                                h(dVar);
                                return;
                            } else {
                                Iterator<UnicastProcessor<TRight>> it3 = this.f120299f.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th4) {
                            j(th4, dVar, aVar);
                            return;
                        }
                    } else if (num == f120293r) {
                        LeftRightEndSubscriber leftRightEndSubscriber3 = (LeftRightEndSubscriber) objPoll;
                        UnicastProcessor<TRight> unicastProcessorRemove = this.f120299f.remove(Integer.valueOf(leftRightEndSubscriber3.f120311d));
                        this.f120298e.a(leftRightEndSubscriber3);
                        if (unicastProcessorRemove != null) {
                            unicastProcessorRemove.onComplete();
                        }
                    } else if (num == f120294s) {
                        LeftRightEndSubscriber leftRightEndSubscriber4 = (LeftRightEndSubscriber) objPoll;
                        this.f120300g.remove(Integer.valueOf(leftRightEndSubscriber4.f120311d));
                        this.f120298e.a(leftRightEndSubscriber4);
                    }
                }
            }
            aVar.clear();
        }

        void h(org.reactivestreams.d<?> dVar) {
            Throwable thC = ExceptionHelper.c(this.f120301h);
            Iterator<UnicastProcessor<TRight>> it = this.f120299f.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thC);
            }
            this.f120299f.clear();
            this.f120300g.clear();
            dVar.onError(thC);
        }

        void j(Throwable th2, org.reactivestreams.d<?> dVar, lh.o<?> oVar) {
            io.reactivex.exceptions.a.b(th2);
            ExceptionHelper.a(this.f120301h, th2);
            oVar.clear();
            f();
            h(dVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120296c, j10);
            }
        }
    }

    public static final class LeftRightEndSubscriber extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f120309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f120310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120311d;

        LeftRightEndSubscriber(a aVar, boolean z10, int i10) {
            this.f120309b = aVar;
            this.f120310c = z10;
            this.f120311d = i10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120309b.d(this.f120310c, this);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120309b.b(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.f120309b.d(this.f120310c, this);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public static final class LeftRightSubscriber extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f120312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f120313c;

        LeftRightSubscriber(a aVar, boolean z10) {
            this.f120312b = aVar;
            this.f120313c = z10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120312b.e(this);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120312b.a(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            this.f120312b.c(this.f120313c, obj);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public interface a {
        void a(Throwable th2);

        void b(Throwable th2);

        void c(boolean z10, Object obj);

        void d(boolean z10, LeftRightEndSubscriber leftRightEndSubscriber);

        void e(LeftRightSubscriber leftRightSubscriber);
    }

    public FlowableGroupJoin(io.reactivex.j<TLeft> jVar, org.reactivestreams.c<? extends TRight> cVar, kh.o<? super TLeft, ? extends org.reactivestreams.c<TLeftEnd>> oVar, kh.o<? super TRight, ? extends org.reactivestreams.c<TRightEnd>> oVar2, kh.c<? super TLeft, ? super io.reactivex.j<TRight>, ? extends R> cVar2) {
        super(jVar);
        this.f120287d = cVar;
        this.f120288e = oVar;
        this.f120289f = oVar2;
        this.f120290g = cVar2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        GroupJoinSubscription groupJoinSubscription = new GroupJoinSubscription(dVar, this.f120288e, this.f120289f, this.f120290g);
        dVar.onSubscribe(groupJoinSubscription);
        LeftRightSubscriber leftRightSubscriber = new LeftRightSubscriber(groupJoinSubscription, true);
        groupJoinSubscription.f120298e.c(leftRightSubscriber);
        LeftRightSubscriber leftRightSubscriber2 = new LeftRightSubscriber(groupJoinSubscription, false);
        groupJoinSubscription.f120298e.c(leftRightSubscriber2);
        this.f121039c.j6(leftRightSubscriber);
        this.f120287d.g(leftRightSubscriber2);
    }
}

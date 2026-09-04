package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableObserveOn<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.h0 f120434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f120435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f120436f;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements io.reactivex.o<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.h0.c f120437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f120438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f120441f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.e f120442g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        lh.o<T> f120443h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f120444i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f120445j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Throwable f120446k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f120447l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f120448m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f120449n;

        BaseObserveOnSubscriber(io.reactivex.h0.c cVar, boolean z10, int i10) {
            this.f120437b = cVar;
            this.f120438c = z10;
            this.f120439d = i10;
            this.f120440e = i10 - (i10 >> 2);
        }

        final boolean c(boolean z10, boolean z11, org.reactivestreams.d<?> dVar) {
            if (this.f120444i) {
                clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f120438c) {
                if (!z11) {
                    return false;
                }
                this.f120444i = true;
                Throwable th2 = this.f120446k;
                if (th2 != null) {
                    dVar.onError(th2);
                } else {
                    dVar.onComplete();
                }
                this.f120437b.dispose();
                return true;
            }
            Throwable th3 = this.f120446k;
            if (th3 != null) {
                this.f120444i = true;
                clear();
                dVar.onError(th3);
                this.f120437b.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f120444i = true;
            dVar.onComplete();
            this.f120437b.dispose();
            return true;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f120444i) {
                return;
            }
            this.f120444i = true;
            this.f120442g.cancel();
            this.f120437b.dispose();
            if (getAndIncrement() == 0) {
                this.f120443h.clear();
            }
        }

        @Override // lh.o
        public final void clear() {
            this.f120443h.clear();
        }

        abstract void d();

        abstract void f();

        @Override // lh.o
        public final boolean isEmpty() {
            return this.f120443h.isEmpty();
        }

        abstract void k();

        final void n() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f120437b.b(this);
        }

        @Override // org.reactivestreams.d
        public final void onComplete() {
            if (this.f120445j) {
                return;
            }
            this.f120445j = true;
            n();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f120445j) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120446k = th2;
            this.f120445j = true;
            n();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t10) {
            if (this.f120445j) {
                return;
            }
            if (this.f120447l == 2) {
                n();
                return;
            }
            if (!this.f120443h.offer(t10)) {
                this.f120442g.cancel();
                this.f120446k = new MissingBackpressureException("Queue is full?!");
                this.f120445j = true;
            }
            n();
        }

        @Override // org.reactivestreams.e
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120441f, j10);
                n();
            }
        }

        @Override // lh.k
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f120449n = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f120449n) {
                f();
            } else if (this.f120447l == 1) {
                k();
            } else {
                d();
            }
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final lh.a<? super T> f120450o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f120451p;

        ObserveOnConditionalSubscriber(lh.a<? super T> aVar, io.reactivex.h0.c cVar, boolean z10, int i10) {
            super(cVar, z10, i10);
            this.f120450o = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void d() {
            lh.a<? super T> aVar = this.f120450o;
            lh.o<T> oVar = this.f120443h;
            long j10 = this.f120448m;
            long j11 = this.f120451p;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.f120441f.get();
                while (j10 != j12) {
                    boolean z10 = this.f120445j;
                    try {
                        T tPoll = oVar.poll();
                        boolean z11 = tPoll == null;
                        if (c(z10, z11, aVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        if (aVar.m(tPoll)) {
                            j10++;
                        }
                        j11++;
                        if (j11 == this.f120440e) {
                            this.f120442g.request(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f120444i = true;
                        this.f120442g.cancel();
                        oVar.clear();
                        aVar.onError(th2);
                        this.f120437b.dispose();
                        return;
                    }
                }
                if (j10 == j12 && c(this.f120445j, oVar.isEmpty(), aVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f120448m = j10;
                    this.f120451p = j11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void f() {
            int iAddAndGet = 1;
            while (!this.f120444i) {
                boolean z10 = this.f120445j;
                this.f120450o.onNext(null);
                if (z10) {
                    this.f120444i = true;
                    Throwable th2 = this.f120446k;
                    if (th2 != null) {
                        this.f120450o.onError(th2);
                    } else {
                        this.f120450o.onComplete();
                    }
                    this.f120437b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void k() {
            lh.a<? super T> aVar = this.f120450o;
            lh.o<T> oVar = this.f120443h;
            long j10 = this.f120448m;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f120441f.get();
                while (j10 != j11) {
                    try {
                        T tPoll = oVar.poll();
                        if (this.f120444i) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f120444i = true;
                            aVar.onComplete();
                            this.f120437b.dispose();
                            return;
                        } else if (aVar.m(tPoll)) {
                            j10++;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f120444i = true;
                        this.f120442g.cancel();
                        aVar.onError(th2);
                        this.f120437b.dispose();
                        return;
                    }
                }
                if (this.f120444i) {
                    return;
                }
                if (oVar.isEmpty()) {
                    this.f120444i = true;
                    aVar.onComplete();
                    this.f120437b.dispose();
                    return;
                } else {
                    int i10 = get();
                    if (iAddAndGet == i10) {
                        this.f120448m = j10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120442g, eVar)) {
                this.f120442g = eVar;
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f120447l = 1;
                        this.f120443h = lVar;
                        this.f120445j = true;
                        this.f120450o.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f120447l = 2;
                        this.f120443h = lVar;
                        this.f120450o.onSubscribe(this);
                        eVar.request(this.f120439d);
                        return;
                    }
                }
                this.f120443h = new SpscArrayQueue(this.f120439d);
                this.f120450o.onSubscribe(this);
                eVar.request(this.f120439d);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll = this.f120443h.poll();
            if (tPoll != null && this.f120447l != 1) {
                long j10 = this.f120451p + 1;
                if (j10 == this.f120440e) {
                    this.f120451p = 0L;
                    this.f120442g.request(j10);
                } else {
                    this.f120451p = j10;
                }
            }
            return tPoll;
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120452o;

        ObserveOnSubscriber(org.reactivestreams.d<? super T> dVar, io.reactivex.h0.c cVar, boolean z10, int i10) {
            super(cVar, z10, i10);
            this.f120452o = dVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void d() {
            org.reactivestreams.d<? super T> dVar = this.f120452o;
            lh.o<T> oVar = this.f120443h;
            long j10 = this.f120448m;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f120441f.get();
                while (j10 != jAddAndGet) {
                    boolean z10 = this.f120445j;
                    try {
                        T tPoll = oVar.poll();
                        boolean z11 = tPoll == null;
                        if (c(z10, z11, dVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        dVar.onNext(tPoll);
                        j10++;
                        if (j10 == this.f120440e) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f120441f.addAndGet(-j10);
                            }
                            this.f120442g.request(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f120444i = true;
                        this.f120442g.cancel();
                        oVar.clear();
                        dVar.onError(th2);
                        this.f120437b.dispose();
                        return;
                    }
                }
                if (j10 == jAddAndGet && c(this.f120445j, oVar.isEmpty(), dVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f120448m = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void f() {
            int iAddAndGet = 1;
            while (!this.f120444i) {
                boolean z10 = this.f120445j;
                this.f120452o.onNext(null);
                if (z10) {
                    this.f120444i = true;
                    Throwable th2 = this.f120446k;
                    if (th2 != null) {
                        this.f120452o.onError(th2);
                    } else {
                        this.f120452o.onComplete();
                    }
                    this.f120437b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void k() {
            org.reactivestreams.d<? super T> dVar = this.f120452o;
            lh.o<T> oVar = this.f120443h;
            long j10 = this.f120448m;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f120441f.get();
                while (j10 != j11) {
                    try {
                        T tPoll = oVar.poll();
                        if (this.f120444i) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f120444i = true;
                            dVar.onComplete();
                            this.f120437b.dispose();
                            return;
                        }
                        dVar.onNext(tPoll);
                        j10++;
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f120444i = true;
                        this.f120442g.cancel();
                        dVar.onError(th2);
                        this.f120437b.dispose();
                        return;
                    }
                }
                if (this.f120444i) {
                    return;
                }
                if (oVar.isEmpty()) {
                    this.f120444i = true;
                    dVar.onComplete();
                    this.f120437b.dispose();
                    return;
                } else {
                    int i10 = get();
                    if (iAddAndGet == i10) {
                        this.f120448m = j10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120442g, eVar)) {
                this.f120442g = eVar;
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f120447l = 1;
                        this.f120443h = lVar;
                        this.f120445j = true;
                        this.f120452o.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f120447l = 2;
                        this.f120443h = lVar;
                        this.f120452o.onSubscribe(this);
                        eVar.request(this.f120439d);
                        return;
                    }
                }
                this.f120443h = new SpscArrayQueue(this.f120439d);
                this.f120452o.onSubscribe(this);
                eVar.request(this.f120439d);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll = this.f120443h.poll();
            if (tPoll != null && this.f120447l != 1) {
                long j10 = this.f120448m + 1;
                if (j10 == this.f120440e) {
                    this.f120448m = 0L;
                    this.f120442g.request(j10);
                } else {
                    this.f120448m = j10;
                }
            }
            return tPoll;
        }
    }

    public FlowableObserveOn(io.reactivex.j<T> jVar, io.reactivex.h0 h0Var, boolean z10, int i10) {
        super(jVar);
        this.f120434d = h0Var;
        this.f120435e = z10;
        this.f120436f = i10;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.h0.c cVarC = this.f120434d.c();
        if (dVar instanceof lh.a) {
            this.f121039c.j6(new ObserveOnConditionalSubscriber((lh.a) dVar, cVarC, this.f120435e, this.f120436f));
        } else {
            this.f121039c.j6(new ObserveOnSubscriber(dVar, cVarC, this.f120435e, this.f120436f));
        }
    }
}

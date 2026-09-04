package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.h0;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class ParallelRunOn<T> extends io.reactivex.parallel.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<? extends T> f123238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h0 f123239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f123240c;

    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f123241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f123242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final SpscArrayQueue<T> f123243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final h0.c f123244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.e f123245f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f123246g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f123247h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicLong f123248i = new AtomicLong();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f123249j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f123250k;

        BaseRunOnSubscriber(int i10, SpscArrayQueue<T> spscArrayQueue, h0.c cVar) {
            this.f123241b = i10;
            this.f123243d = spscArrayQueue;
            this.f123242c = i10 - (i10 >> 2);
            this.f123244e = cVar;
        }

        final void a() {
            if (getAndIncrement() == 0) {
                this.f123244e.b(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f123249j) {
                return;
            }
            this.f123249j = true;
            this.f123245f.cancel();
            this.f123244e.dispose();
            if (getAndIncrement() == 0) {
                this.f123243d.clear();
            }
        }

        @Override // org.reactivestreams.d
        public final void onComplete() {
            if (this.f123246g) {
                return;
            }
            this.f123246g = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f123246g) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123247h = th2;
            this.f123246g = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t10) {
            if (this.f123246g) {
                return;
            }
            if (this.f123243d.offer(t10)) {
                a();
            } else {
                this.f123245f.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f123248i, j10);
                a();
            }
        }
    }

    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final lh.a<? super T> f123251l;

        RunOnConditionalSubscriber(lh.a<? super T> aVar, int i10, SpscArrayQueue<T> spscArrayQueue, h0.c cVar) {
            super(i10, spscArrayQueue, cVar);
            this.f123251l = aVar;
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123245f, eVar)) {
                this.f123245f = eVar;
                this.f123251l.onSubscribe(this);
                eVar.request(this.f123241b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2;
            int i10 = this.f123250k;
            SpscArrayQueue<T> spscArrayQueue = this.f123243d;
            lh.a<? super T> aVar = this.f123251l;
            int i11 = this.f123242c;
            int iAddAndGet = 1;
            while (true) {
                long j10 = this.f123248i.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f123249j) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.f123246g;
                    if (z10 && (th2 = this.f123247h) != null) {
                        spscArrayQueue.clear();
                        aVar.onError(th2);
                        this.f123244e.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        aVar.onComplete();
                        this.f123244e.dispose();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        if (aVar.m(tPoll)) {
                            j11++;
                        }
                        i10++;
                        if (i10 == i11) {
                            this.f123245f.request(i10);
                            i10 = 0;
                        }
                    }
                }
                if (j11 == j10) {
                    if (this.f123249j) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.f123246g) {
                        Throwable th3 = this.f123247h;
                        if (th3 != null) {
                            spscArrayQueue.clear();
                            aVar.onError(th3);
                            this.f123244e.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            aVar.onComplete();
                            this.f123244e.dispose();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f123248i.addAndGet(-j11);
                }
                int i12 = get();
                if (i12 == iAddAndGet) {
                    this.f123250k = i10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i12;
                }
            }
        }
    }

    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f123252l;

        RunOnSubscriber(org.reactivestreams.d<? super T> dVar, int i10, SpscArrayQueue<T> spscArrayQueue, h0.c cVar) {
            super(i10, spscArrayQueue, cVar);
            this.f123252l = dVar;
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123245f, eVar)) {
                this.f123245f = eVar;
                this.f123252l.onSubscribe(this);
                eVar.request(this.f123241b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2;
            int i10 = this.f123250k;
            SpscArrayQueue<T> spscArrayQueue = this.f123243d;
            org.reactivestreams.d<? super T> dVar = this.f123252l;
            int i11 = this.f123242c;
            int iAddAndGet = 1;
            while (true) {
                long j10 = this.f123248i.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f123249j) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.f123246g;
                    if (z10 && (th2 = this.f123247h) != null) {
                        spscArrayQueue.clear();
                        dVar.onError(th2);
                        this.f123244e.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        dVar.onComplete();
                        this.f123244e.dispose();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        dVar.onNext(tPoll);
                        j11++;
                        i10++;
                        if (i10 == i11) {
                            this.f123245f.request(i10);
                            i10 = 0;
                        }
                    }
                }
                if (j11 == j10) {
                    if (this.f123249j) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.f123246g) {
                        Throwable th3 = this.f123247h;
                        if (th3 != null) {
                            spscArrayQueue.clear();
                            dVar.onError(th3);
                            this.f123244e.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            dVar.onComplete();
                            this.f123244e.dispose();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f123248i.addAndGet(-j11);
                }
                int i12 = get();
                if (i12 == iAddAndGet) {
                    this.f123250k = i10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i12;
                }
            }
        }
    }

    public final class a implements io.reactivex.internal.schedulers.i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.d<? super T>[] f123253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<T>[] f123254b;

        a(org.reactivestreams.d<? super T>[] dVarArr, org.reactivestreams.d<T>[] dVarArr2) {
            this.f123253a = dVarArr;
            this.f123254b = dVarArr2;
        }

        @Override // io.reactivex.internal.schedulers.i.a
        public void a(int i10, h0.c cVar) {
            ParallelRunOn.this.V(i10, this.f123253a, this.f123254b, cVar);
        }
    }

    public ParallelRunOn(io.reactivex.parallel.a<? extends T> aVar, h0 h0Var, int i10) {
        this.f123238a = aVar;
        this.f123239b = h0Var;
        this.f123240c = i10;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123238a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super T>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<T>[] dVarArr2 = new org.reactivestreams.d[length];
            Object obj = this.f123239b;
            if (obj instanceof io.reactivex.internal.schedulers.i) {
                ((io.reactivex.internal.schedulers.i) obj).a(length, new a(dVarArr, dVarArr2));
            } else {
                for (int i10 = 0; i10 < length; i10++) {
                    V(i10, dVarArr, dVarArr2, this.f123239b.c());
                }
            }
            this.f123238a.Q(dVarArr2);
        }
    }

    void V(int i10, org.reactivestreams.d<? super T>[] dVarArr, org.reactivestreams.d<T>[] dVarArr2, h0.c cVar) {
        org.reactivestreams.d<? super T> dVar = dVarArr[i10];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.f123240c);
        if (dVar instanceof lh.a) {
            dVarArr2[i10] = new RunOnConditionalSubscriber((lh.a) dVar, this.f123240c, spscArrayQueue, cVar);
        } else {
            dVarArr2[i10] = new RunOnSubscriber(dVar, this.f123240c, spscArrayQueue, cVar);
        }
    }
}

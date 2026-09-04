package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlatMap<T, U> extends a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> f120128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f120129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f120130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f120131g;

    public static final class InnerSubscriber<T, U> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<U>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f120132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final MergeSubscriber<T, U> f120133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f120136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile lh.o<U> f120137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f120138h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f120139i;

        InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j10) {
            this.f120132b = j10;
            this.f120133c = mergeSubscriber;
            int i10 = mergeSubscriber.f120146f;
            this.f120135e = i10;
            this.f120134d = i10 >> 2;
        }

        void a(long j10) {
            if (this.f120139i != 1) {
                long j11 = this.f120138h + j10;
                if (j11 < this.f120134d) {
                    this.f120138h = j11;
                } else {
                    this.f120138h = 0L;
                    get().request(j11);
                }
            }
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
            this.f120136f = true;
            this.f120133c.e();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.f120133c.j(this, th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(U u10) {
            if (this.f120139i != 2) {
                this.f120133c.l(u10, this);
            } else {
                this.f120133c.e();
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this, eVar)) {
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f120139i = iRequestFusion;
                        this.f120137g = lVar;
                        this.f120136f = true;
                        this.f120133c.e();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f120139i = iRequestFusion;
                        this.f120137g = lVar;
                    }
                }
                eVar.request(this.f120135e);
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super U> f120142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> f120143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f120144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f120146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile lh.n<U> f120147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f120148h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicThrowable f120149i = new AtomicThrowable();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f120150j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicReference<InnerSubscriber<?, ?>[]> f120151k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicLong f120152l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        org.reactivestreams.e f120153m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f120154n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f120155o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f120156p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f120157q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final int f120158r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final InnerSubscriber<?, ?>[] f120140s = new InnerSubscriber[0];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final InnerSubscriber<?, ?>[] f120141t = new InnerSubscriber[0];

        MergeSubscriber(org.reactivestreams.d<? super U> dVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, boolean z10, int i10, int i11) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f120151k = atomicReference;
            this.f120152l = new AtomicLong();
            this.f120142b = dVar;
            this.f120143c = oVar;
            this.f120144d = z10;
            this.f120145e = i10;
            this.f120146f = i11;
            this.f120158r = Math.max(1, i10 >> 1);
            atomicReference.lazySet(f120140s);
        }

        boolean a(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.f120151k.get();
                if (innerSubscriberArr == f120141t) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!androidx.compose.animation.core.s0.a(this.f120151k, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        boolean b() {
            if (this.f120150j) {
                c();
                return true;
            }
            if (this.f120144d || this.f120149i.get() == null) {
                return false;
            }
            c();
            Throwable thC = this.f120149i.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f120142b.onError(thC);
            }
            return true;
        }

        void c() {
            lh.n<U> nVar = this.f120147g;
            if (nVar != null) {
                nVar.clear();
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            lh.n<U> nVar;
            if (this.f120150j) {
                return;
            }
            this.f120150j = true;
            this.f120153m.cancel();
            d();
            if (getAndIncrement() != 0 || (nVar = this.f120147g) == null) {
                return;
            }
            nVar.clear();
        }

        void d() {
            InnerSubscriber<?, ?>[] andSet;
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.f120151k.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = f120141t;
            if (innerSubscriberArr == innerSubscriberArr2 || (andSet = this.f120151k.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2) {
                return;
            }
            for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                innerSubscriber.dispose();
            }
            Throwable thC = this.f120149i.c();
            if (thC == null || thC == ExceptionHelper.f123860a) {
                return;
            }
            io.reactivex.plugins.a.Y(thC);
        }

        void e() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void f() {
            long j10;
            long j11;
            boolean z10;
            int i10;
            int i11;
            long j12;
            Object obj;
            org.reactivestreams.d<? super U> dVar = this.f120142b;
            int iAddAndGet = 1;
            while (!b()) {
                lh.n<U> nVar = this.f120147g;
                long jAddAndGet = this.f120152l.get();
                boolean z11 = jAddAndGet == Long.MAX_VALUE;
                long j13 = 0;
                long j14 = 0;
                if (nVar != null) {
                    do {
                        long j15 = 0;
                        obj = null;
                        while (jAddAndGet != 0) {
                            U uPoll = nVar.poll();
                            if (b()) {
                                return;
                            }
                            if (uPoll == null) {
                                obj = uPoll;
                                break;
                            }
                            dVar.onNext(uPoll);
                            j14++;
                            j15++;
                            jAddAndGet--;
                            obj = uPoll;
                        }
                        if (j15 != 0) {
                            jAddAndGet = z11 ? Long.MAX_VALUE : this.f120152l.addAndGet(-j15);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z12 = this.f120148h;
                lh.n<U> nVar2 = this.f120147g;
                InnerSubscriber<?, ?>[] innerSubscriberArr = this.f120151k.get();
                int length = innerSubscriberArr.length;
                if (z12 && ((nVar2 == null || nVar2.isEmpty()) && length == 0)) {
                    Throwable thC = this.f120149i.c();
                    if (thC != ExceptionHelper.f123860a) {
                        if (thC == null) {
                            dVar.onComplete();
                            return;
                        } else {
                            dVar.onError(thC);
                            return;
                        }
                    }
                    return;
                }
                int i12 = iAddAndGet;
                if (length != 0) {
                    long j16 = this.f120155o;
                    int i13 = this.f120156p;
                    if (length <= i13 || innerSubscriberArr[i13].f120132b != j16) {
                        if (length <= i13) {
                            i13 = 0;
                        }
                        for (int i14 = 0; i14 < length && innerSubscriberArr[i13].f120132b != j16; i14++) {
                            i13++;
                            if (i13 == length) {
                                i13 = 0;
                            }
                        }
                        this.f120156p = i13;
                        this.f120155o = innerSubscriberArr[i13].f120132b;
                    }
                    int i15 = i13;
                    boolean z13 = false;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            z10 = z13;
                            break;
                        }
                        if (b()) {
                            return;
                        }
                        InnerSubscriber<T, U> innerSubscriber = innerSubscriberArr[i15];
                        Object obj2 = null;
                        while (!b()) {
                            lh.o<U> oVar = innerSubscriber.f120137g;
                            if (oVar == null) {
                                i10 = length;
                            } else {
                                i10 = length;
                                Object obj3 = obj2;
                                long j17 = j13;
                                while (jAddAndGet != j13) {
                                    try {
                                        U uPoll2 = oVar.poll();
                                        if (uPoll2 == null) {
                                            obj3 = uPoll2;
                                            j13 = 0;
                                            break;
                                        }
                                        dVar.onNext(uPoll2);
                                        if (b()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j17++;
                                        obj3 = uPoll2;
                                        j13 = 0;
                                    } catch (Throwable th2) {
                                        io.reactivex.exceptions.a.b(th2);
                                        innerSubscriber.dispose();
                                        this.f120149i.a(th2);
                                        if (!this.f120144d) {
                                            this.f120153m.cancel();
                                        }
                                        if (b()) {
                                            return;
                                        }
                                        k(innerSubscriber);
                                        i16++;
                                        z13 = true;
                                        i11 = 1;
                                    }
                                }
                                if (j17 != j13) {
                                    jAddAndGet = !z11 ? this.f120152l.addAndGet(-j17) : Long.MAX_VALUE;
                                    innerSubscriber.a(j17);
                                    j12 = 0;
                                } else {
                                    j12 = j13;
                                }
                                if (jAddAndGet != j12 && obj3 != null) {
                                    length = i10;
                                    obj2 = obj3;
                                    j13 = 0;
                                }
                            }
                            boolean z14 = innerSubscriber.f120136f;
                            lh.o<U> oVar2 = innerSubscriber.f120137g;
                            if (z14 && (oVar2 == null || oVar2.isEmpty())) {
                                k(innerSubscriber);
                                if (b()) {
                                    return;
                                }
                                j14++;
                                z13 = true;
                            }
                            if (jAddAndGet == 0) {
                                z10 = z13;
                                break;
                            }
                            i15++;
                            if (i15 == i10) {
                                i15 = 0;
                            }
                            i11 = 1;
                            i16 += i11;
                            length = i10;
                            j13 = 0;
                        }
                        return;
                    }
                    this.f120156p = i15;
                    this.f120155o = innerSubscriberArr[i15].f120132b;
                    j11 = j14;
                    j10 = 0;
                } else {
                    j10 = 0;
                    j11 = j14;
                    z10 = false;
                }
                if (j11 != j10 && !this.f120150j) {
                    this.f120153m.request(j11);
                }
                if (z10) {
                    iAddAndGet = i12;
                } else {
                    iAddAndGet = addAndGet(-i12);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        lh.o<U> g(InnerSubscriber<T, U> innerSubscriber) {
            lh.o<U> oVar = innerSubscriber.f120137g;
            if (oVar != null) {
                return oVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.f120146f);
            innerSubscriber.f120137g = spscArrayQueue;
            return spscArrayQueue;
        }

        lh.o<U> h() {
            lh.n<U> aVar = this.f120147g;
            if (aVar == null) {
                aVar = this.f120145e == Integer.MAX_VALUE ? new io.reactivex.internal.queue.a<>(this.f120146f) : new SpscArrayQueue<>(this.f120145e);
                this.f120147g = aVar;
            }
            return aVar;
        }

        void j(InnerSubscriber<T, U> innerSubscriber, Throwable th2) {
            if (!this.f120149i.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            innerSubscriber.f120136f = true;
            if (!this.f120144d) {
                this.f120153m.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber2 : this.f120151k.getAndSet(f120141t)) {
                    innerSubscriber2.dispose();
                }
            }
            e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void k(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.f120151k.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerSubscriberArr[i11] == innerSubscriber) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = f120140s;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!androidx.compose.animation.core.s0.a(this.f120151k, innerSubscriberArr, innerSubscriberArr2));
        }

        void l(U u10, InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f120152l.get();
                lh.o<U> oVarG = innerSubscriber.f120137g;
                if (j10 == 0 || !(oVarG == null || oVarG.isEmpty())) {
                    if (oVarG == null) {
                        oVarG = g(innerSubscriber);
                    }
                    if (!oVarG.offer(u10)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.f120142b.onNext(u10);
                    if (j10 != Long.MAX_VALUE) {
                        this.f120152l.decrementAndGet();
                    }
                    innerSubscriber.a(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                lh.o spscArrayQueue = innerSubscriber.f120137g;
                if (spscArrayQueue == null) {
                    spscArrayQueue = new SpscArrayQueue(this.f120146f);
                    innerSubscriber.f120137g = spscArrayQueue;
                }
                if (!spscArrayQueue.offer(u10)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            f();
        }

        void n(U u10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f120152l.get();
                lh.o<U> oVarH = this.f120147g;
                if (j10 == 0 || !(oVarH == null || oVarH.isEmpty())) {
                    if (oVarH == null) {
                        oVarH = h();
                    }
                    if (!oVarH.offer(u10)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.f120142b.onNext(u10);
                    if (j10 != Long.MAX_VALUE) {
                        this.f120152l.decrementAndGet();
                    }
                    if (this.f120145e != Integer.MAX_VALUE && !this.f120150j) {
                        int i10 = this.f120157q + 1;
                        this.f120157q = i10;
                        int i11 = this.f120158r;
                        if (i10 == i11) {
                            this.f120157q = 0;
                            this.f120153m.request(i11);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!h().offer(u10)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            f();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120148h) {
                return;
            }
            this.f120148h = true;
            e();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120148h) {
                io.reactivex.plugins.a.Y(th2);
            } else if (!this.f120149i.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120148h = true;
                e();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120148h) {
                return;
            }
            try {
                org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120143c.apply(t10), "The mapper returned a null Publisher");
                if (!(cVar instanceof Callable)) {
                    long j10 = this.f120154n;
                    this.f120154n = 1 + j10;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j10);
                    if (a(innerSubscriber)) {
                        cVar.g(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) cVar).call();
                    if (objCall != null) {
                        n(objCall);
                        return;
                    }
                    if (this.f120145e == Integer.MAX_VALUE || this.f120150j) {
                        return;
                    }
                    int i10 = this.f120157q + 1;
                    this.f120157q = i10;
                    int i11 = this.f120158r;
                    if (i10 == i11) {
                        this.f120157q = 0;
                        this.f120153m.request(i11);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f120149i.a(th2);
                    e();
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f120153m.cancel();
                onError(th3);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120153m, eVar)) {
                this.f120153m = eVar;
                this.f120142b.onSubscribe(this);
                if (this.f120150j) {
                    return;
                }
                int i10 = this.f120145e;
                if (i10 == Integer.MAX_VALUE) {
                    eVar.request(Long.MAX_VALUE);
                } else {
                    eVar.request(i10);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120152l, j10);
                e();
            }
        }
    }

    public FlowableFlatMap(io.reactivex.j<T> jVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(jVar);
        this.f120128d = oVar;
        this.f120129e = z10;
        this.f120130f = i10;
        this.f120131g = i11;
    }

    public static <T, U> io.reactivex.o<T> M8(org.reactivestreams.d<? super U> dVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, boolean z10, int i10, int i11) {
        return new MergeSubscriber(dVar, oVar, z10, i10, i11);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        if (v0.b(this.f121039c, dVar, this.f120128d)) {
            return;
        }
        this.f121039c.j6(M8(dVar, this.f120128d, this.f120129e, this.f120130f, this.f120131g));
    }
}

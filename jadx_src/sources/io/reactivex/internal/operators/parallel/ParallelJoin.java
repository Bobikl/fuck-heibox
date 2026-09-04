package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.j;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lh.n;

/* JADX INFO: loaded from: classes5.dex */
public final class ParallelJoin<T> extends j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.parallel.a<? extends T> f123204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f123205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f123206e;

    public static final class JoinInnerSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements o<T> {
        private static final long serialVersionUID = 8410034718427740355L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final JoinSubscriptionBase<T> f123207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f123208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f123209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f123210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile n<T> f123211f;

        JoinInnerSubscriber(JoinSubscriptionBase<T> joinSubscriptionBase, int i10) {
            this.f123207b = joinSubscriptionBase;
            this.f123208c = i10;
            this.f123209d = i10 - (i10 >> 2);
        }

        public boolean a() {
            return SubscriptionHelper.cancel(this);
        }

        n<T> b() {
            n<T> nVar = this.f123211f;
            if (nVar != null) {
                return nVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.f123208c);
            this.f123211f = spscArrayQueue;
            return spscArrayQueue;
        }

        public void c(long j10) {
            long j11 = this.f123210e + j10;
            if (j11 < this.f123209d) {
                this.f123210e = j11;
            } else {
                this.f123210e = 0L;
                get().request(j11);
            }
        }

        public void d() {
            long j10 = this.f123210e + 1;
            if (j10 != this.f123209d) {
                this.f123210e = j10;
            } else {
                this.f123210e = 0L;
                get().request(j10);
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f123207b.d();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123207b.e(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f123207b.f(this, t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, this.f123208c);
        }
    }

    public static final class JoinSubscription<T> extends JoinSubscriptionBase<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        JoinSubscription(org.reactivestreams.d<? super T> dVar, int i10, int i11) {
            super(dVar, i10, i11);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void d() {
            this.f123217g.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void e(Throwable th2) {
            if (this.f123214d.compareAndSet(null, th2)) {
                a();
                c();
            } else if (th2 != this.f123214d.get()) {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void f(JoinInnerSubscriber<T> joinInnerSubscriber, T t10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f123215e.get() != 0) {
                    this.f123212b.onNext(t10);
                    if (this.f123215e.get() != Long.MAX_VALUE) {
                        this.f123215e.decrementAndGet();
                    }
                    joinInnerSubscriber.c(1L);
                } else if (!joinInnerSubscriber.b().offer(t10)) {
                    a();
                    MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Queue full?!");
                    if (this.f123214d.compareAndSet(null, missingBackpressureException)) {
                        this.f123212b.onError(missingBackpressureException);
                        return;
                    } else {
                        io.reactivex.plugins.a.Y(missingBackpressureException);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!joinInnerSubscriber.b().offer(t10)) {
                a();
                e(new MissingBackpressureException("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        void g() {
            boolean z10;
            T tPoll;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.f123213c;
            int length = joinInnerSubscriberArr.length;
            org.reactivestreams.d<? super T> dVar = this.f123212b;
            int i10 = 1;
            while (true) {
                long j10 = this.f123215e.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f123216f) {
                        b();
                        return;
                    }
                    Throwable th2 = this.f123214d.get();
                    if (th2 != null) {
                        b();
                        dVar.onError(th2);
                        return;
                    }
                    boolean z11 = this.f123217g.get() == 0;
                    boolean z12 = true;
                    for (JoinInnerSubscriber<T> joinInnerSubscriber : joinInnerSubscriberArr) {
                        n<T> nVar = joinInnerSubscriber.f123211f;
                        if (nVar != null && (tPoll = nVar.poll()) != null) {
                            dVar.onNext(tPoll);
                            joinInnerSubscriber.d();
                            j11++;
                            if (j11 == j10) {
                                break;
                            } else {
                                z12 = false;
                            }
                        }
                    }
                    if (!z11 || !z12) {
                        if (z12) {
                            break;
                        }
                    } else {
                        dVar.onComplete();
                        return;
                    }
                }
                if (j11 == j10) {
                    if (this.f123216f) {
                        b();
                        return;
                    }
                    Throwable th3 = this.f123214d.get();
                    if (th3 != null) {
                        b();
                        dVar.onError(th3);
                        return;
                    }
                    boolean z13 = this.f123217g.get() == 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z10 = true;
                            break;
                        }
                        n<T> nVar2 = joinInnerSubscriberArr[i11].f123211f;
                        if (nVar2 != null && !nVar2.isEmpty()) {
                            z10 = false;
                            break;
                        }
                        i11++;
                    }
                    if (z13 && z10) {
                        dVar.onComplete();
                        return;
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f123215e.addAndGet(-j11);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i10 && (iAddAndGet = addAndGet(-i10)) == 0) {
                    return;
                } else {
                    i10 = iAddAndGet;
                }
            }
        }
    }

    public static abstract class JoinSubscriptionBase<T> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = 3100232009247827843L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f123212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final JoinInnerSubscriber<T>[] f123213c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f123216f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicThrowable f123214d = new AtomicThrowable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f123215e = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f123217g = new AtomicInteger();

        JoinSubscriptionBase(org.reactivestreams.d<? super T> dVar, int i10, int i11) {
            this.f123212b = dVar;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = new JoinInnerSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                joinInnerSubscriberArr[i12] = new JoinInnerSubscriber<>(this, i11);
            }
            this.f123213c = joinInnerSubscriberArr;
            this.f123217g.lazySet(i10);
        }

        void a() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.f123213c) {
                joinInnerSubscriber.a();
            }
        }

        void b() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.f123213c) {
                joinInnerSubscriber.f123211f = null;
            }
        }

        abstract void c();

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f123216f) {
                return;
            }
            this.f123216f = true;
            a();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        abstract void d();

        abstract void e(Throwable th2);

        abstract void f(JoinInnerSubscriber<T> joinInnerSubscriber, T t10);

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f123215e, j10);
                c();
            }
        }
    }

    public static final class JoinSubscriptionDelayError<T> extends JoinSubscriptionBase<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        JoinSubscriptionDelayError(org.reactivestreams.d<? super T> dVar, int i10, int i11) {
            super(dVar, i10, i11);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void d() {
            this.f123217g.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void e(Throwable th2) {
            this.f123214d.a(th2);
            this.f123217g.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void f(JoinInnerSubscriber<T> joinInnerSubscriber, T t10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f123215e.get() != 0) {
                    this.f123212b.onNext(t10);
                    if (this.f123215e.get() != Long.MAX_VALUE) {
                        this.f123215e.decrementAndGet();
                    }
                    joinInnerSubscriber.c(1L);
                } else if (!joinInnerSubscriber.b().offer(t10)) {
                    joinInnerSubscriber.a();
                    this.f123214d.a(new MissingBackpressureException("Queue full?!"));
                    this.f123217g.decrementAndGet();
                    g();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!joinInnerSubscriber.b().offer(t10) && joinInnerSubscriber.a()) {
                    this.f123214d.a(new MissingBackpressureException("Queue full?!"));
                    this.f123217g.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            g();
        }

        void g() {
            boolean z10;
            T tPoll;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.f123213c;
            int length = joinInnerSubscriberArr.length;
            org.reactivestreams.d<? super T> dVar = this.f123212b;
            int i10 = 1;
            while (true) {
                long j10 = this.f123215e.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f123216f) {
                        b();
                        return;
                    }
                    boolean z11 = this.f123217g.get() == 0;
                    boolean z12 = true;
                    for (JoinInnerSubscriber<T> joinInnerSubscriber : joinInnerSubscriberArr) {
                        n<T> nVar = joinInnerSubscriber.f123211f;
                        if (nVar != null && (tPoll = nVar.poll()) != null) {
                            dVar.onNext(tPoll);
                            joinInnerSubscriber.d();
                            j11++;
                            if (j11 == j10) {
                                break;
                            } else {
                                z12 = false;
                            }
                        }
                    }
                    if (z11 && z12) {
                        if (this.f123214d.get() != null) {
                            dVar.onError(this.f123214d.c());
                            return;
                        } else {
                            dVar.onComplete();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                }
                if (j11 == j10) {
                    if (this.f123216f) {
                        b();
                        return;
                    }
                    boolean z13 = this.f123217g.get() == 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z10 = true;
                            break;
                        }
                        n<T> nVar2 = joinInnerSubscriberArr[i11].f123211f;
                        if (nVar2 != null && !nVar2.isEmpty()) {
                            z10 = false;
                            break;
                        }
                        i11++;
                    }
                    if (z13 && z10) {
                        if (this.f123214d.get() != null) {
                            dVar.onError(this.f123214d.c());
                            return;
                        } else {
                            dVar.onComplete();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f123215e.addAndGet(-j11);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i10 && (iAddAndGet = addAndGet(-i10)) == 0) {
                    return;
                } else {
                    i10 = iAddAndGet;
                }
            }
        }
    }

    public ParallelJoin(io.reactivex.parallel.a<? extends T> aVar, int i10, boolean z10) {
        this.f123204c = aVar;
        this.f123205d = i10;
        this.f123206e = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        JoinSubscriptionBase joinSubscriptionDelayError = this.f123206e ? new JoinSubscriptionDelayError(dVar, this.f123204c.F(), this.f123205d) : new JoinSubscription(dVar, this.f123204c.F(), this.f123205d);
        dVar.onSubscribe(joinSubscriptionDelayError);
        this.f123204c.Q(joinSubscriptionDelayError.f123213c);
    }
}

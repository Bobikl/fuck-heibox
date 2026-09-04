package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWindow<T> extends a<T, io.reactivex.j<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f120925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f120926f;

    public static final class WindowExactSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super io.reactivex.j<T>> f120927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f120929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f120931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.e f120932g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        UnicastProcessor<T> f120933h;

        WindowExactSubscriber(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, long j10, int i10) {
            super(1);
            this.f120927b = dVar;
            this.f120928c = j10;
            this.f120929d = new AtomicBoolean();
            this.f120930e = i10;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120929d.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.f120933h;
            if (unicastProcessor != null) {
                this.f120933h = null;
                unicastProcessor.onComplete();
            }
            this.f120927b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            UnicastProcessor<T> unicastProcessor = this.f120933h;
            if (unicastProcessor != null) {
                this.f120933h = null;
                unicastProcessor.onError(th2);
            }
            this.f120927b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            long j10 = this.f120931f;
            UnicastProcessor<T> unicastProcessorU8 = this.f120933h;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessorU8 = UnicastProcessor.U8(this.f120930e, this);
                this.f120933h = unicastProcessorU8;
                this.f120927b.onNext(unicastProcessorU8);
            }
            long j11 = j10 + 1;
            unicastProcessorU8.onNext(t10);
            if (j11 != this.f120928c) {
                this.f120931f = j11;
                return;
            }
            this.f120931f = 0L;
            this.f120933h = null;
            unicastProcessorU8.onComplete();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120932g, eVar)) {
                this.f120932g = eVar;
                this.f120927b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.f120932g.request(io.reactivex.internal.util.b.d(this.f120928c, j10));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f120932g.cancel();
            }
        }
    }

    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super io.reactivex.j<T>> f120934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.a<UnicastProcessor<T>> f120935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f120936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f120937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ArrayDeque<UnicastProcessor<T>> f120938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicBoolean f120939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicBoolean f120940h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicLong f120941i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicInteger f120942j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final int f120943k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f120944l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f120945m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        org.reactivestreams.e f120946n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        volatile boolean f120947o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Throwable f120948p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        volatile boolean f120949q;

        WindowOverlapSubscriber(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, long j10, long j11, int i10) {
            super(1);
            this.f120934b = dVar;
            this.f120936d = j10;
            this.f120937e = j11;
            this.f120935c = new io.reactivex.internal.queue.a<>(i10);
            this.f120938f = new ArrayDeque<>();
            this.f120939g = new AtomicBoolean();
            this.f120940h = new AtomicBoolean();
            this.f120941i = new AtomicLong();
            this.f120942j = new AtomicInteger();
            this.f120943k = i10;
        }

        boolean a(boolean z10, boolean z11, org.reactivestreams.d<?> dVar, io.reactivex.internal.queue.a<?> aVar) {
            if (this.f120949q) {
                aVar.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f120948p;
            if (th2 != null) {
                aVar.clear();
                dVar.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            dVar.onComplete();
            return true;
        }

        void b() {
            if (this.f120942j.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super io.reactivex.j<T>> dVar = this.f120934b;
            io.reactivex.internal.queue.a<UnicastProcessor<T>> aVar = this.f120935c;
            int iAddAndGet = 1;
            do {
                long j10 = this.f120941i.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.f120947o;
                    UnicastProcessor<T> unicastProcessorPoll = aVar.poll();
                    boolean z11 = unicastProcessorPoll == null;
                    if (a(z10, z11, dVar, aVar)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(unicastProcessorPoll);
                    j11++;
                }
                if (j11 == j10 && a(this.f120947o, aVar.isEmpty(), dVar, aVar)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f120941i.addAndGet(-j11);
                }
                iAddAndGet = this.f120942j.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120949q = true;
            if (this.f120939g.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120947o) {
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.f120938f.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f120938f.clear();
            this.f120947o = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120947o) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.f120938f.iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.f120938f.clear();
            this.f120948p = th2;
            this.f120947o = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120947o) {
                return;
            }
            long j10 = this.f120944l;
            if (j10 == 0 && !this.f120949q) {
                getAndIncrement();
                UnicastProcessor<T> unicastProcessorU8 = UnicastProcessor.U8(this.f120943k, this);
                this.f120938f.offer(unicastProcessorU8);
                this.f120935c.offer(unicastProcessorU8);
                b();
            }
            long j11 = j10 + 1;
            Iterator<UnicastProcessor<T>> it = this.f120938f.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            long j12 = this.f120945m + 1;
            if (j12 == this.f120936d) {
                this.f120945m = j12 - this.f120937e;
                UnicastProcessor<T> unicastProcessorPoll = this.f120938f.poll();
                if (unicastProcessorPoll != null) {
                    unicastProcessorPoll.onComplete();
                }
            } else {
                this.f120945m = j12;
            }
            if (j11 == this.f120937e) {
                this.f120944l = 0L;
            } else {
                this.f120944l = j11;
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120946n, eVar)) {
                this.f120946n = eVar;
                this.f120934b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120941i, j10);
                if (this.f120940h.get() || !this.f120940h.compareAndSet(false, true)) {
                    this.f120946n.request(io.reactivex.internal.util.b.d(this.f120937e, j10));
                } else {
                    this.f120946n.request(io.reactivex.internal.util.b.c(this.f120936d, io.reactivex.internal.util.b.d(this.f120937e, j10 - 1)));
                }
                b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f120946n.cancel();
            }
        }
    }

    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super io.reactivex.j<T>> f120950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f120952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f120953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicBoolean f120954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f120955g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f120956h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        org.reactivestreams.e f120957i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        UnicastProcessor<T> f120958j;

        WindowSkipSubscriber(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, long j10, long j11, int i10) {
            super(1);
            this.f120950b = dVar;
            this.f120951c = j10;
            this.f120952d = j11;
            this.f120953e = new AtomicBoolean();
            this.f120954f = new AtomicBoolean();
            this.f120955g = i10;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120953e.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.f120958j;
            if (unicastProcessor != null) {
                this.f120958j = null;
                unicastProcessor.onComplete();
            }
            this.f120950b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            UnicastProcessor<T> unicastProcessor = this.f120958j;
            if (unicastProcessor != null) {
                this.f120958j = null;
                unicastProcessor.onError(th2);
            }
            this.f120950b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            long j10 = this.f120956h;
            UnicastProcessor<T> unicastProcessorU8 = this.f120958j;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessorU8 = UnicastProcessor.U8(this.f120955g, this);
                this.f120958j = unicastProcessorU8;
                this.f120950b.onNext(unicastProcessorU8);
            }
            long j11 = j10 + 1;
            if (unicastProcessorU8 != null) {
                unicastProcessorU8.onNext(t10);
            }
            if (j11 == this.f120951c) {
                this.f120958j = null;
                unicastProcessorU8.onComplete();
            }
            if (j11 == this.f120952d) {
                this.f120956h = 0L;
            } else {
                this.f120956h = j11;
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120957i, eVar)) {
                this.f120957i = eVar;
                this.f120950b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                if (this.f120954f.get() || !this.f120954f.compareAndSet(false, true)) {
                    this.f120957i.request(io.reactivex.internal.util.b.d(this.f120952d, j10));
                } else {
                    this.f120957i.request(io.reactivex.internal.util.b.c(io.reactivex.internal.util.b.d(this.f120951c, j10), io.reactivex.internal.util.b.d(this.f120952d - this.f120951c, j10 - 1)));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f120957i.cancel();
            }
        }
    }

    public FlowableWindow(io.reactivex.j<T> jVar, long j10, long j11, int i10) {
        super(jVar);
        this.f120924d = j10;
        this.f120925e = j11;
        this.f120926f = i10;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super io.reactivex.j<T>> dVar) {
        long j10 = this.f120925e;
        long j11 = this.f120924d;
        if (j10 == j11) {
            this.f121039c.j6(new WindowExactSubscriber(dVar, this.f120924d, this.f120926f));
        } else if (j10 > j11) {
            this.f121039c.j6(new WindowSkipSubscriber(dVar, this.f120924d, this.f120925e, this.f120926f));
        } else {
            this.f121039c.j6(new WindowOverlapSubscriber(dVar, this.f120924d, this.f120925e, this.f120926f));
        }
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<U> f119924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final org.reactivestreams.c<? extends Open> f119925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.o<? super Open, ? extends org.reactivestreams.c<? extends Close>> f119926f;

    public static final class BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -8466418554264089604L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super C> f119927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Callable<C> f119928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final org.reactivestreams.c<? extends Open> f119929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.o<? super Open, ? extends org.reactivestreams.c<? extends Close>> f119930e;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f119935j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f119937l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f119938m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f119940o;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final io.reactivex.internal.queue.a<C> f119936k = new io.reactivex.internal.queue.a<>(io.reactivex.j.Y());

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.a f119931f = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicLong f119932g = new AtomicLong();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f119933h = new AtomicReference<>();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Map<Long, C> f119939n = new LinkedHashMap();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicThrowable f119934i = new AtomicThrowable();

        public static final class BufferOpenSubscriber<Open> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Open>, io.reactivex.disposables.b {
            private static final long serialVersionUID = -8498650778633225126L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final BufferBoundarySubscriber<?, ?, Open, ?> f119941b;

            BufferOpenSubscriber(BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber) {
                this.f119941b = bufferBoundarySubscriber;
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
                lazySet(SubscriptionHelper.CANCELLED);
                this.f119941b.e(this);
            }

            @Override // org.reactivestreams.d
            public void onError(Throwable th2) {
                lazySet(SubscriptionHelper.CANCELLED);
                this.f119941b.a(this, th2);
            }

            @Override // org.reactivestreams.d
            public void onNext(Open open) {
                this.f119941b.d(open);
            }

            @Override // io.reactivex.o, org.reactivestreams.d
            public void onSubscribe(org.reactivestreams.e eVar) {
                SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
            }
        }

        BufferBoundarySubscriber(org.reactivestreams.d<? super C> dVar, org.reactivestreams.c<? extends Open> cVar, kh.o<? super Open, ? extends org.reactivestreams.c<? extends Close>> oVar, Callable<C> callable) {
            this.f119927b = dVar;
            this.f119928c = callable;
            this.f119929d = cVar;
            this.f119930e = oVar;
        }

        void a(io.reactivex.disposables.b bVar, Throwable th2) {
            SubscriptionHelper.cancel(this.f119933h);
            this.f119931f.b(bVar);
            onError(th2);
        }

        void b(BufferCloseSubscriber<T, C> bufferCloseSubscriber, long j10) {
            boolean z10;
            this.f119931f.b(bufferCloseSubscriber);
            if (this.f119931f.h() == 0) {
                SubscriptionHelper.cancel(this.f119933h);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.f119939n;
                if (map == null) {
                    return;
                }
                this.f119936k.offer(map.remove(Long.valueOf(j10)));
                if (z10) {
                    this.f119935j = true;
                }
                c();
            }
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j10 = this.f119940o;
            org.reactivestreams.d<? super C> dVar = this.f119927b;
            io.reactivex.internal.queue.a<C> aVar = this.f119936k;
            int iAddAndGet = 1;
            do {
                long j11 = this.f119932g.get();
                while (j10 != j11) {
                    if (this.f119937l) {
                        aVar.clear();
                        return;
                    }
                    boolean z10 = this.f119935j;
                    if (z10 && this.f119934i.get() != null) {
                        aVar.clear();
                        dVar.onError(this.f119934i.c());
                        return;
                    }
                    C cPoll = aVar.poll();
                    boolean z11 = cPoll == null;
                    if (z10 && z11) {
                        dVar.onComplete();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        dVar.onNext(cPoll);
                        j10++;
                    }
                }
                if (j10 == j11) {
                    if (this.f119937l) {
                        aVar.clear();
                        return;
                    }
                    if (this.f119935j) {
                        if (this.f119934i.get() != null) {
                            aVar.clear();
                            dVar.onError(this.f119934i.c());
                            return;
                        } else if (aVar.isEmpty()) {
                            dVar.onComplete();
                            return;
                        }
                    }
                }
                this.f119940o = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (SubscriptionHelper.cancel(this.f119933h)) {
                this.f119937l = true;
                this.f119931f.dispose();
                synchronized (this) {
                    this.f119939n = null;
                }
                if (getAndIncrement() != 0) {
                    this.f119936k.clear();
                }
            }
        }

        void d(Open open) {
            try {
                Collection collection = (Collection) io.reactivex.internal.functions.a.g(this.f119928c.call(), "The bufferSupplier returned a null Collection");
                org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f119930e.apply(open), "The bufferClose returned a null Publisher");
                long j10 = this.f119938m;
                this.f119938m = 1 + j10;
                synchronized (this) {
                    Map<Long, C> map = this.f119939n;
                    if (map == null) {
                        return;
                    }
                    map.put(Long.valueOf(j10), (C) collection);
                    BufferCloseSubscriber bufferCloseSubscriber = new BufferCloseSubscriber(this, j10);
                    this.f119931f.c(bufferCloseSubscriber);
                    cVar.g(bufferCloseSubscriber);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                SubscriptionHelper.cancel(this.f119933h);
                onError(th2);
            }
        }

        void e(BufferOpenSubscriber<Open> bufferOpenSubscriber) {
            this.f119931f.b(bufferOpenSubscriber);
            if (this.f119931f.h() == 0) {
                SubscriptionHelper.cancel(this.f119933h);
                this.f119935j = true;
                c();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f119931f.dispose();
            synchronized (this) {
                Map<Long, C> map = this.f119939n;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.f119936k.offer(it.next());
                }
                this.f119939n = null;
                this.f119935j = true;
                c();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f119934i.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f119931f.dispose();
            synchronized (this) {
                this.f119939n = null;
            }
            this.f119935j = true;
            c();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            synchronized (this) {
                Map<Long, C> map = this.f119939n;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t10);
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this.f119933h, eVar)) {
                BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber(this);
                this.f119931f.c(bufferOpenSubscriber);
                this.f119929d.g(bufferOpenSubscriber);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            io.reactivex.internal.util.b.a(this.f119932g, j10);
            c();
        }
    }

    public static final class BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8498650778633225126L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BufferBoundarySubscriber<T, C, ?, ?> f119942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f119943c;

        BufferCloseSubscriber(BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber, long j10) {
            this.f119942b = bufferBoundarySubscriber;
            this.f119943c = j10;
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
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f119942b.b(this, this.f119943c);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar == subscriptionHelper) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                lazySet(subscriptionHelper);
                this.f119942b.a(this, th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                eVar.cancel();
                this.f119942b.b(this, this.f119943c);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public FlowableBufferBoundary(io.reactivex.j<T> jVar, org.reactivestreams.c<? extends Open> cVar, kh.o<? super Open, ? extends org.reactivestreams.c<? extends Close>> oVar, Callable<U> callable) {
        super(jVar);
        this.f119925e = cVar;
        this.f119926f = oVar;
        this.f119924d = callable;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(dVar, this.f119925e, this.f119926f, this.f119924d);
        dVar.onSubscribe(bufferBoundarySubscriber);
        this.f121039c.j6(bufferBoundarySubscriber);
    }
}

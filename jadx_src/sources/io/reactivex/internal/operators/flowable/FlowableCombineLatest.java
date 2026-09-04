package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCombineLatest<T, R> extends io.reactivex.j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @jh.f
    final org.reactivestreams.c<? extends T>[] f119969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @jh.f
    final Iterable<? extends org.reactivestreams.c<? extends T>> f119970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super Object[], ? extends R> f119971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f119972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f119973g;

    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f119974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Object[], ? extends R> f119975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final CombineLatestInnerSubscriber<T>[] f119976d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f119977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Object[] f119978f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f119979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f119980h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f119981i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f119982j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f119983k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicLong f119984l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile boolean f119985m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AtomicReference<Throwable> f119986n;

        CombineLatestCoordinator(org.reactivestreams.d<? super R> dVar, kh.o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.f119974b = dVar;
            this.f119975c = oVar;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                combineLatestInnerSubscriberArr[i12] = new CombineLatestInnerSubscriber<>(this, i12, i11);
            }
            this.f119976d = combineLatestInnerSubscriberArr;
            this.f119978f = new Object[i10];
            this.f119977e = new io.reactivex.internal.queue.a<>(i11);
            this.f119984l = new AtomicLong();
            this.f119986n = new AtomicReference<>();
            this.f119979g = z10;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f119980h) {
                k();
            } else {
                f();
            }
        }

        void c() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.f119976d) {
                combineLatestInnerSubscriber.a();
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f119983k = true;
            c();
        }

        @Override // lh.o
        public void clear() {
            this.f119977e.clear();
        }

        boolean d(boolean z10, boolean z11, org.reactivestreams.d<?> dVar, io.reactivex.internal.queue.a<?> aVar) {
            if (this.f119983k) {
                c();
                aVar.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f119979g) {
                if (!z11) {
                    return false;
                }
                c();
                Throwable thC = ExceptionHelper.c(this.f119986n);
                if (thC == null || thC == ExceptionHelper.f123860a) {
                    dVar.onComplete();
                } else {
                    dVar.onError(thC);
                }
                return true;
            }
            Throwable thC2 = ExceptionHelper.c(this.f119986n);
            if (thC2 != null && thC2 != ExceptionHelper.f123860a) {
                c();
                aVar.clear();
                dVar.onError(thC2);
                return true;
            }
            if (!z11) {
                return false;
            }
            c();
            dVar.onComplete();
            return true;
        }

        void f() {
            org.reactivestreams.d<? super R> dVar = this.f119974b;
            io.reactivex.internal.queue.a<?> aVar = this.f119977e;
            int iAddAndGet = 1;
            do {
                long j10 = this.f119984l.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.f119985m;
                    Object objPoll = aVar.poll();
                    boolean z11 = objPoll == null;
                    if (d(z10, z11, dVar, aVar)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    try {
                        dVar.onNext((Object) io.reactivex.internal.functions.a.g(this.f119975c.apply((Object[]) aVar.poll()), "The combiner returned a null value"));
                        ((CombineLatestInnerSubscriber) objPoll).b();
                        j11++;
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        c();
                        ExceptionHelper.a(this.f119986n, th2);
                        dVar.onError(ExceptionHelper.c(this.f119986n));
                        return;
                    }
                }
                if (j11 == j10 && d(this.f119985m, aVar.isEmpty(), dVar, aVar)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f119984l.addAndGet(-j11);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f119977e.isEmpty();
        }

        void k() {
            org.reactivestreams.d<? super R> dVar = this.f119974b;
            io.reactivex.internal.queue.a<Object> aVar = this.f119977e;
            int iAddAndGet = 1;
            while (!this.f119983k) {
                Throwable th2 = this.f119986n.get();
                if (th2 != null) {
                    aVar.clear();
                    dVar.onError(th2);
                    return;
                }
                boolean z10 = this.f119985m;
                boolean zIsEmpty = aVar.isEmpty();
                if (!zIsEmpty) {
                    dVar.onNext(null);
                }
                if (z10 && zIsEmpty) {
                    dVar.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            aVar.clear();
        }

        void n(int i10) {
            int i11;
            synchronized (this) {
                Object[] objArr = this.f119978f;
                if (objArr[i10] != null && (i11 = this.f119982j + 1) != objArr.length) {
                    this.f119982j = i11;
                } else {
                    this.f119985m = true;
                    b();
                }
            }
        }

        void o(int i10, Throwable th2) {
            if (!ExceptionHelper.a(this.f119986n, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                if (this.f119979g) {
                    n(i10);
                    return;
                }
                c();
                this.f119985m = true;
                b();
            }
        }

        void p(int i10, T t10) {
            boolean z10;
            synchronized (this) {
                Object[] objArr = this.f119978f;
                int i11 = this.f119981i;
                if (objArr[i10] == null) {
                    i11++;
                    this.f119981i = i11;
                }
                objArr[i10] = t10;
                if (objArr.length == i11) {
                    this.f119977e.offer(this.f119976d[i10], objArr.clone());
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                this.f119976d[i10].b();
            } else {
                b();
            }
        }

        @Override // lh.o
        @jh.f
        public R poll() throws Exception {
            Object objPoll = this.f119977e.poll();
            if (objPoll == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.a.g(this.f119975c.apply((Object[]) this.f119977e.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) objPoll).b();
            return r10;
        }

        void q(org.reactivestreams.c<? extends T>[] cVarArr, int i10) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.f119976d;
            for (int i11 = 0; i11 < i10 && !this.f119985m && !this.f119983k; i11++) {
                cVarArr[i11].g(combineLatestInnerSubscriberArr[i11]);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f119984l, j10);
                b();
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 4) != 0) {
                return 0;
            }
            int i11 = i10 & 2;
            this.f119980h = i11 != 0;
            return i11;
        }
    }

    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<T> {
        private static final long serialVersionUID = -8730235182291002949L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CombineLatestCoordinator<T, ?> f119987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f119989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f119990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f119991f;

        CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i10, int i11) {
            this.f119987b = combineLatestCoordinator;
            this.f119988c = i10;
            this.f119989d = i11;
            this.f119990e = i11 - (i11 >> 2);
        }

        public void a() {
            SubscriptionHelper.cancel(this);
        }

        public void b() {
            int i10 = this.f119991f + 1;
            if (i10 != this.f119990e) {
                this.f119991f = i10;
            } else {
                this.f119991f = 0;
                get().request(i10);
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f119987b.n(this.f119988c);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f119987b.o(this.f119988c, th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f119987b.p(this.f119988c, t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, this.f119989d);
        }
    }

    public final class a implements kh.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // kh.o
        public R apply(T t10) throws Exception {
            return FlowableCombineLatest.this.f119971e.apply(new Object[]{t10});
        }
    }

    public FlowableCombineLatest(@jh.e Iterable<? extends org.reactivestreams.c<? extends T>> iterable, @jh.e kh.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f119969c = null;
        this.f119970d = iterable;
        this.f119971e = oVar;
        this.f119972f = i10;
        this.f119973g = z10;
    }

    public FlowableCombineLatest(@jh.e org.reactivestreams.c<? extends T>[] cVarArr, @jh.e kh.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f119969c = cVarArr;
        this.f119970d = null;
        this.f119971e = oVar;
        this.f119972f = i10;
        this.f119973g = z10;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super R> dVar) {
        int length;
        org.reactivestreams.c<? extends T>[] cVarArr = this.f119969c;
        if (cVarArr == null) {
            cVarArr = new org.reactivestreams.c[8];
            try {
                Iterator it = (Iterator) io.reactivex.internal.functions.a.g(this.f119970d.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            org.reactivestreams.c<? extends T> cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(it.next(), "The publisher returned by the iterator is null");
                            if (length == cVarArr.length) {
                                org.reactivestreams.c<? extends T>[] cVarArr2 = new org.reactivestreams.c[(length >> 2) + length];
                                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                                cVarArr = cVarArr2;
                            }
                            cVarArr[length] = cVar;
                            length++;
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            EmptySubscription.error(th2, dVar);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        EmptySubscription.error(th3, dVar);
                        return;
                    }
                }
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                EmptySubscription.error(th4, dVar);
                return;
            }
        } else {
            length = cVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(dVar);
        } else {
            if (i10 == 1) {
                cVarArr[0].g(new p0.b(dVar, new a()));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(dVar, this.f119971e, i10, this.f119972f, this.f119973g);
            dVar.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.q(cVarArr, i10);
        }
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSequenceEqual<T> extends io.reactivex.j<Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f120699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f120700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.d<? super T, ? super T> f120701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f120702f;

    public static final class EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements a {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final kh.d<? super T, ? super T> f120703l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final EqualSubscriber<T> f120704m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final EqualSubscriber<T> f120705n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final AtomicThrowable f120706o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final AtomicInteger f120707p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        T f120708q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        T f120709r;

        EqualCoordinator(org.reactivestreams.d<? super Boolean> dVar, int i10, kh.d<? super T, ? super T> dVar2) {
            super(dVar);
            this.f120703l = dVar2;
            this.f120707p = new AtomicInteger();
            this.f120704m = new EqualSubscriber<>(this, i10);
            this.f120705n = new EqualSubscriber<>(this, i10);
            this.f120706o = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.a
        public void a(Throwable th2) {
            if (this.f120706o.a(th2)) {
                b();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.a
        public void b() {
            if (this.f120707p.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                lh.o<T> oVar = this.f120704m.f120714f;
                lh.o<T> oVar2 = this.f120705n.f120714f;
                if (oVar != null && oVar2 != null) {
                    while (true) {
                        if (d()) {
                            this.f120704m.clear();
                            this.f120705n.clear();
                            return;
                        }
                        if (this.f120706o.get() != null) {
                            k();
                            this.f123845b.onError(this.f120706o.c());
                            return;
                        }
                        boolean z10 = this.f120704m.f120715g;
                        T tPoll = this.f120708q;
                        if (tPoll == null) {
                            try {
                                tPoll = oVar.poll();
                                this.f120708q = tPoll;
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                k();
                                this.f120706o.a(th2);
                                this.f123845b.onError(this.f120706o.c());
                                return;
                            }
                        }
                        boolean z11 = tPoll == null;
                        boolean z12 = this.f120705n.f120715g;
                        T tPoll2 = this.f120709r;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = oVar2.poll();
                                this.f120709r = tPoll2;
                            } catch (Throwable th3) {
                                io.reactivex.exceptions.a.b(th3);
                                k();
                                this.f120706o.a(th3);
                                this.f123845b.onError(this.f120706o.c());
                                return;
                            }
                        }
                        boolean z13 = tPoll2 == null;
                        if (z10 && z12 && z11 && z13) {
                            c(Boolean.TRUE);
                            return;
                        }
                        if (z10 && z12 && z11 != z13) {
                            k();
                            c(Boolean.FALSE);
                            return;
                        }
                        if (z11 || z13) {
                            break;
                        }
                        try {
                            if (!this.f120703l.test(tPoll, tPoll2)) {
                                k();
                                c(Boolean.FALSE);
                                return;
                            } else {
                                this.f120708q = null;
                                this.f120709r = null;
                                this.f120704m.b();
                                this.f120705n.b();
                            }
                        } catch (Throwable th4) {
                            io.reactivex.exceptions.a.b(th4);
                            k();
                            this.f120706o.a(th4);
                            this.f123845b.onError(this.f120706o.c());
                            return;
                        }
                    }
                } else if (d()) {
                    this.f120704m.clear();
                    this.f120705n.clear();
                    return;
                } else if (this.f120706o.get() != null) {
                    k();
                    this.f123845b.onError(this.f120706o.c());
                    return;
                }
                iAddAndGet = this.f120707p.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f120704m.a();
            this.f120705n.a();
            if (this.f120707p.getAndIncrement() == 0) {
                this.f120704m.clear();
                this.f120705n.clear();
            }
        }

        void k() {
            this.f120704m.a();
            this.f120704m.clear();
            this.f120705n.a();
            this.f120705n.clear();
        }

        void n(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2) {
            cVar.g(this.f120704m);
            cVar2.g(this.f120705n);
        }
    }

    public static final class EqualSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<T> {
        private static final long serialVersionUID = 4804128302091633067L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f120710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f120711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f120713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile lh.o<T> f120714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f120715g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f120716h;

        EqualSubscriber(a aVar, int i10) {
            this.f120710b = aVar;
            this.f120712d = i10 - (i10 >> 2);
            this.f120711c = i10;
        }

        public void a() {
            SubscriptionHelper.cancel(this);
        }

        public void b() {
            if (this.f120716h != 1) {
                long j10 = this.f120713e + 1;
                if (j10 < this.f120712d) {
                    this.f120713e = j10;
                } else {
                    this.f120713e = 0L;
                    get().request(j10);
                }
            }
        }

        void clear() {
            lh.o<T> oVar = this.f120714f;
            if (oVar != null) {
                oVar.clear();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120715g = true;
            this.f120710b.b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120710b.a(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120716h != 0 || this.f120714f.offer(t10)) {
                this.f120710b.b();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this, eVar)) {
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f120716h = iRequestFusion;
                        this.f120714f = lVar;
                        this.f120715g = true;
                        this.f120710b.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f120716h = iRequestFusion;
                        this.f120714f = lVar;
                        eVar.request(this.f120711c);
                        return;
                    }
                }
                this.f120714f = new SpscArrayQueue(this.f120711c);
                eVar.request(this.f120711c);
            }
        }
    }

    public interface a {
        void a(Throwable th2);

        void b();
    }

    public FlowableSequenceEqual(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, kh.d<? super T, ? super T> dVar, int i10) {
        this.f120699c = cVar;
        this.f120700d = cVar2;
        this.f120701e = dVar;
        this.f120702f = i10;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super Boolean> dVar) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(dVar, this.f120702f, this.f120701e);
        dVar.onSubscribe(equalCoordinator);
        equalCoordinator.n(this.f120699c, this.f120700d);
    }
}

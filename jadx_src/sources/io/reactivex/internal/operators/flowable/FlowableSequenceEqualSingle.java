package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSequenceEqualSingle<T> extends io.reactivex.i0<Boolean> implements lh.b<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f120717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f120718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.d<? super T, ? super T> f120719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120720e;

    public static final class EqualCoordinator<T> extends AtomicInteger implements io.reactivex.disposables.b, FlowableSequenceEqual.a {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super Boolean> f120721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.d<? super T, ? super T> f120722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final FlowableSequenceEqual.EqualSubscriber<T> f120723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final FlowableSequenceEqual.EqualSubscriber<T> f120724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicThrowable f120725f = new AtomicThrowable();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        T f120726g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        T f120727h;

        EqualCoordinator(io.reactivex.l0<? super Boolean> l0Var, int i10, kh.d<? super T, ? super T> dVar) {
            this.f120721b = l0Var;
            this.f120722c = dVar;
            this.f120723d = new FlowableSequenceEqual.EqualSubscriber<>(this, i10);
            this.f120724e = new FlowableSequenceEqual.EqualSubscriber<>(this, i10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.a
        public void a(Throwable th2) {
            if (this.f120725f.a(th2)) {
                b();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.a
        public void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                lh.o<T> oVar = this.f120723d.f120714f;
                lh.o<T> oVar2 = this.f120724e.f120714f;
                if (oVar != null && oVar2 != null) {
                    while (true) {
                        if (isDisposed()) {
                            this.f120723d.clear();
                            this.f120724e.clear();
                            return;
                        }
                        if (this.f120725f.get() != null) {
                            c();
                            this.f120721b.onError(this.f120725f.c());
                            return;
                        }
                        boolean z10 = this.f120723d.f120715g;
                        T tPoll = this.f120726g;
                        if (tPoll == null) {
                            try {
                                tPoll = oVar.poll();
                                this.f120726g = tPoll;
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                c();
                                this.f120725f.a(th2);
                                this.f120721b.onError(this.f120725f.c());
                                return;
                            }
                        }
                        boolean z11 = tPoll == null;
                        boolean z12 = this.f120724e.f120715g;
                        T tPoll2 = this.f120727h;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = oVar2.poll();
                                this.f120727h = tPoll2;
                            } catch (Throwable th3) {
                                io.reactivex.exceptions.a.b(th3);
                                c();
                                this.f120725f.a(th3);
                                this.f120721b.onError(this.f120725f.c());
                                return;
                            }
                        }
                        boolean z13 = tPoll2 == null;
                        if (z10 && z12 && z11 && z13) {
                            this.f120721b.onSuccess(Boolean.TRUE);
                            return;
                        }
                        if (z10 && z12 && z11 != z13) {
                            c();
                            this.f120721b.onSuccess(Boolean.FALSE);
                            return;
                        }
                        if (z11 || z13) {
                            break;
                        }
                        try {
                            if (!this.f120722c.test(tPoll, tPoll2)) {
                                c();
                                this.f120721b.onSuccess(Boolean.FALSE);
                                return;
                            } else {
                                this.f120726g = null;
                                this.f120727h = null;
                                this.f120723d.b();
                                this.f120724e.b();
                            }
                        } catch (Throwable th4) {
                            io.reactivex.exceptions.a.b(th4);
                            c();
                            this.f120725f.a(th4);
                            this.f120721b.onError(this.f120725f.c());
                            return;
                        }
                    }
                } else if (isDisposed()) {
                    this.f120723d.clear();
                    this.f120724e.clear();
                    return;
                } else if (this.f120725f.get() != null) {
                    c();
                    this.f120721b.onError(this.f120725f.c());
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void c() {
            this.f120723d.a();
            this.f120723d.clear();
            this.f120724e.a();
            this.f120724e.clear();
        }

        void d(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2) {
            cVar.g(this.f120723d);
            cVar2.g(this.f120724e);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f120723d.a();
            this.f120724e.a();
            if (getAndIncrement() == 0) {
                this.f120723d.clear();
                this.f120724e.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f120723d.get() == SubscriptionHelper.CANCELLED;
        }
    }

    public FlowableSequenceEqualSingle(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.c<? extends T> cVar2, kh.d<? super T, ? super T> dVar, int i10) {
        this.f120717b = cVar;
        this.f120718c = cVar2;
        this.f120719d = dVar;
        this.f120720e = i10;
    }

    @Override // lh.b
    public io.reactivex.j<Boolean> c() {
        return io.reactivex.plugins.a.P(new FlowableSequenceEqual(this.f120717b, this.f120718c, this.f120719d, this.f120720e));
    }

    @Override // io.reactivex.i0
    public void c1(io.reactivex.l0<? super Boolean> l0Var) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(l0Var, this.f120720e, this.f120719d);
        l0Var.onSubscribe(equalCoordinator);
        equalCoordinator.d(this.f120717b, this.f120718c);
    }
}

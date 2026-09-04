package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FlowableWindowBoundarySelector.java */
/* JADX INFO: loaded from: classes12.dex */
public final class i1<T, B, V> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.j<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<B> f121142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super B, ? extends org.reactivestreams.c<V>> f121143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f121144f;

    /* JADX INFO: compiled from: FlowableWindowBoundarySelector.java */
    public static final class a<T, V> extends io.reactivex.subscribers.b<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c<T, ?, V> f121145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final UnicastProcessor<T> f121146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f121147e;

        a(c<T, ?, V> cVar, UnicastProcessor<T> unicastProcessor) {
            this.f121145c = cVar;
            this.f121146d = unicastProcessor;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121147e) {
                return;
            }
            this.f121147e = true;
            this.f121145c.p(this);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121147e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121147e = true;
                this.f121145c.r(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(V v10) {
            a();
            onComplete();
        }
    }

    /* JADX INFO: compiled from: FlowableWindowBoundarySelector.java */
    public static final class b<T, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c<T, B, ?> f121148c;

        b(c<T, B, ?> cVar) {
            this.f121148c = cVar;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121148c.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121148c.r(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(B b10) {
            this.f121148c.s(b10);
        }
    }

    /* JADX INFO: compiled from: FlowableWindowBoundarySelector.java */
    public static final class c<T, B, V> extends io.reactivex.internal.subscribers.h<T, Object, io.reactivex.j<T>> implements org.reactivestreams.e {
        final AtomicBoolean G2;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        final org.reactivestreams.c<B> f121149b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        final kh.o<? super B, ? extends org.reactivestreams.c<V>> f121150c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        final int f121151p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f121152p2;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        final io.reactivex.disposables.a f121153x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        final List<UnicastProcessor<T>> f121154x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        org.reactivestreams.e f121155y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        final AtomicLong f121156y2;

        c(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, org.reactivestreams.c<B> cVar, kh.o<? super B, ? extends org.reactivestreams.c<V>> oVar, int i10) {
            super(dVar, new MpscLinkedQueue());
            this.f121152p2 = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f121156y2 = atomicLong;
            this.G2 = new AtomicBoolean();
            this.f121149b0 = cVar;
            this.f121150c0 = oVar;
            this.f121151p1 = i10;
            this.f121153x1 = new io.reactivex.disposables.a();
            this.f121154x2 = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.G2.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.f121152p2);
                if (this.f121156y2.decrementAndGet() == 0) {
                    this.f121155y1.cancel();
                }
            }
        }

        void dispose() {
            this.f121153x1.dispose();
            DisposableHelper.dispose(this.f121152p2);
        }

        @Override // io.reactivex.internal.subscribers.h, io.reactivex.internal.util.m
        public boolean j(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, Object obj) {
            return false;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.Z) {
                return;
            }
            this.Z = true;
            if (b()) {
                q();
            }
            if (this.f121156y2.decrementAndGet() == 0) {
                this.f121153x1.dispose();
            }
            this.W.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.Z) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123809a0 = th2;
            this.Z = true;
            if (b()) {
                q();
            }
            if (this.f121156y2.decrementAndGet() == 0) {
                this.f121153x1.dispose();
            }
            this.W.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.Z) {
                return;
            }
            if (k()) {
                Iterator<UnicastProcessor<T>> it = this.f121154x2.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.X.offer((U) NotificationLite.next(t10));
                if (!b()) {
                    return;
                }
            }
            q();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121155y1, eVar)) {
                this.f121155y1 = eVar;
                this.W.onSubscribe(this);
                if (this.G2.get()) {
                    return;
                }
                b bVar = new b(this);
                if (androidx.compose.animation.core.s0.a(this.f121152p2, null, bVar)) {
                    eVar.request(Long.MAX_VALUE);
                    this.f121149b0.g(bVar);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void p(a<T, V> aVar) {
            this.f121153x1.b(aVar);
            this.X.offer((U) new d(aVar.f121146d, null));
            if (b()) {
                q();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void q() {
            lh.o oVar = this.X;
            org.reactivestreams.d<? super V> dVar = this.W;
            List<UnicastProcessor<T>> list = this.f121154x2;
            int iA = 1;
            while (true) {
                boolean z10 = this.Z;
                Object objPoll = oVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    dispose();
                    Throwable th2 = this.f123809a0;
                    if (th2 != null) {
                        Iterator<UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar2 = (d) objPoll;
                    UnicastProcessor<T> unicastProcessor = dVar2.f121157a;
                    if (unicastProcessor != null) {
                        if (list.remove(unicastProcessor)) {
                            dVar2.f121157a.onComplete();
                            if (this.f121156y2.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.G2.get()) {
                        UnicastProcessor<T> unicastProcessorT8 = UnicastProcessor.T8(this.f121151p1);
                        long jF = f();
                        if (jF != 0) {
                            list.add(unicastProcessorT8);
                            dVar.onNext(unicastProcessorT8);
                            if (jF != Long.MAX_VALUE) {
                                g(1L);
                            }
                            try {
                                org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f121150c0.apply(dVar2.f121158b), "The publisher supplied is null");
                                a aVar = new a(this, unicastProcessorT8);
                                if (this.f121153x1.c(aVar)) {
                                    this.f121156y2.getAndIncrement();
                                    cVar.g(aVar);
                                }
                            } catch (Throwable th3) {
                                cancel();
                                dVar.onError(th3);
                            }
                        } else {
                            cancel();
                            dVar.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        void r(Throwable th2) {
            this.f121155y1.cancel();
            this.f121153x1.dispose();
            DisposableHelper.dispose(this.f121152p2);
            this.W.onError(th2);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            o(j10);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void s(B b10) {
            this.X.offer((U) new d(null, b10));
            if (b()) {
                q();
            }
        }
    }

    /* JADX INFO: compiled from: FlowableWindowBoundarySelector.java */
    public static final class d<T, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final UnicastProcessor<T> f121157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final B f121158b;

        d(UnicastProcessor<T> unicastProcessor, B b10) {
            this.f121157a = unicastProcessor;
            this.f121158b = b10;
        }
    }

    public i1(io.reactivex.j<T> jVar, org.reactivestreams.c<B> cVar, kh.o<? super B, ? extends org.reactivestreams.c<V>> oVar, int i10) {
        super(jVar);
        this.f121142d = cVar;
        this.f121143e = oVar;
        this.f121144f = i10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super io.reactivex.j<T>> dVar) {
        this.f121039c.j6(new c(new io.reactivex.subscribers.e(dVar), this.f121142d, this.f121143e, this.f121144f));
    }
}

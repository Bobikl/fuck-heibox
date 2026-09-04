package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FlowableBufferBoundarySupplier.java */
/* JADX INFO: loaded from: classes12.dex */
public final class i<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<? extends org.reactivestreams.c<B>> f121131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<U> f121132e;

    /* JADX INFO: compiled from: FlowableBufferBoundarySupplier.java */
    public static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b<T, U, B> f121133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f121134d;

        a(b<T, U, B> bVar) {
            this.f121133c = bVar;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121134d) {
                return;
            }
            this.f121134d = true;
            this.f121133c.r();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121134d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121134d = true;
                this.f121133c.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(B b10) {
            if (this.f121134d) {
                return;
            }
            this.f121134d = true;
            a();
            this.f121133c.r();
        }
    }

    /* JADX INFO: compiled from: FlowableBufferBoundarySupplier.java */
    public static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.internal.subscribers.h<T, U, U> implements io.reactivex.o<T>, org.reactivestreams.e, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        final Callable<U> f121135b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        final Callable<? extends org.reactivestreams.c<B>> f121136c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        org.reactivestreams.e f121137p1;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f121138x1;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        U f121139y1;

        b(org.reactivestreams.d<? super U> dVar, Callable<U> callable, Callable<? extends org.reactivestreams.c<B>> callable2) {
            super(dVar, new MpscLinkedQueue());
            this.f121138x1 = new AtomicReference<>();
            this.f121135b0 = callable;
            this.f121136c0 = callable2;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.Y) {
                return;
            }
            this.Y = true;
            this.f121137p1.cancel();
            q();
            if (b()) {
                this.X.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121137p1.cancel();
            q();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121138x1.get() == DisposableHelper.DISPOSED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            synchronized (this) {
                U u10 = this.f121139y1;
                if (u10 == null) {
                    return;
                }
                this.f121139y1 = null;
                this.X.offer(u10);
                this.Z = true;
                if (b()) {
                    io.reactivex.internal.util.n.e(this.X, this.W, false, this, this);
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            cancel();
            this.W.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f121139y1;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121137p1, eVar)) {
                this.f121137p1 = eVar;
                org.reactivestreams.d<? super V> dVar = this.W;
                try {
                    this.f121139y1 = (U) io.reactivex.internal.functions.a.g(this.f121135b0.call(), "The buffer supplied is null");
                    try {
                        org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f121136c0.call(), "The boundary publisher supplied is null");
                        a aVar = new a(this);
                        this.f121138x1.set(aVar);
                        dVar.onSubscribe(this);
                        if (this.Y) {
                            return;
                        }
                        eVar.request(Long.MAX_VALUE);
                        cVar.g(aVar);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.Y = true;
                        eVar.cancel();
                        EmptySubscription.error(th2, dVar);
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    this.Y = true;
                    eVar.cancel();
                    EmptySubscription.error(th3, dVar);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.h, io.reactivex.internal.util.m
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean j(org.reactivestreams.d<? super U> dVar, U u10) {
            this.W.onNext((Object) u10);
            return true;
        }

        void q() {
            DisposableHelper.dispose(this.f121138x1);
        }

        void r() {
            try {
                U u10 = (U) io.reactivex.internal.functions.a.g(this.f121135b0.call(), "The buffer supplied is null");
                try {
                    org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f121136c0.call(), "The boundary publisher supplied is null");
                    a aVar = new a(this);
                    if (DisposableHelper.replace(this.f121138x1, aVar)) {
                        synchronized (this) {
                            U u11 = this.f121139y1;
                            if (u11 == null) {
                                return;
                            }
                            this.f121139y1 = u10;
                            cVar.g(aVar);
                            l(u11, false, this);
                        }
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.Y = true;
                    this.f121137p1.cancel();
                    this.W.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                cancel();
                this.W.onError(th3);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            o(j10);
        }
    }

    public i(io.reactivex.j<T> jVar, Callable<? extends org.reactivestreams.c<B>> callable, Callable<U> callable2) {
        super(jVar);
        this.f121131d = callable;
        this.f121132e = callable2;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        this.f121039c.j6(new b(new io.reactivex.subscribers.e(dVar), this.f121132e, this.f121131d));
    }
}

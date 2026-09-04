package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableBufferExactBoundary.java */
/* JADX INFO: loaded from: classes12.dex */
public final class j<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<B> f121159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<U> f121160e;

    /* JADX INFO: compiled from: FlowableBufferExactBoundary.java */
    public static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b<T, U, B> f121161c;

        a(b<T, U, B> bVar) {
            this.f121161c = bVar;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121161c.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121161c.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(B b10) {
            this.f121161c.q();
        }
    }

    /* JADX INFO: compiled from: FlowableBufferExactBoundary.java */
    public static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.internal.subscribers.h<T, U, U> implements io.reactivex.o<T>, org.reactivestreams.e, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        final Callable<U> f121162b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        final org.reactivestreams.c<B> f121163c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        org.reactivestreams.e f121164p1;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        io.reactivex.disposables.b f121165x1;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        U f121166y1;

        b(org.reactivestreams.d<? super U> dVar, Callable<U> callable, org.reactivestreams.c<B> cVar) {
            super(dVar, new MpscLinkedQueue());
            this.f121162b0 = callable;
            this.f121163c0 = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.Y) {
                return;
            }
            this.Y = true;
            this.f121165x1.dispose();
            this.f121164p1.cancel();
            if (b()) {
                this.X.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.Y;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            synchronized (this) {
                U u10 = this.f121166y1;
                if (u10 == null) {
                    return;
                }
                this.f121166y1 = null;
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
                U u10 = this.f121166y1;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121164p1, eVar)) {
                this.f121164p1 = eVar;
                try {
                    this.f121166y1 = (U) io.reactivex.internal.functions.a.g(this.f121162b0.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.f121165x1 = aVar;
                    this.W.onSubscribe(this);
                    if (this.Y) {
                        return;
                    }
                    eVar.request(Long.MAX_VALUE);
                    this.f121163c0.g(aVar);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.Y = true;
                    eVar.cancel();
                    EmptySubscription.error(th2, this.W);
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
            try {
                U u10 = (U) io.reactivex.internal.functions.a.g(this.f121162b0.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u11 = this.f121166y1;
                    if (u11 == null) {
                        return;
                    }
                    this.f121166y1 = u10;
                    l(u11, false, this);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                this.W.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            o(j10);
        }
    }

    public j(io.reactivex.j<T> jVar, org.reactivestreams.c<B> cVar, Callable<U> callable) {
        super(jVar);
        this.f121159d = cVar;
        this.f121160e = callable;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        this.f121039c.j6(new b(new io.reactivex.subscribers.e(dVar), this.f121160e, this.f121159d));
    }
}

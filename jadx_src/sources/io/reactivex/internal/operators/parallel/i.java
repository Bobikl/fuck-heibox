package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import kh.q;

/* JADX INFO: compiled from: ParallelPeek.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i<T> extends io.reactivex.parallel.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<T> f123334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kh.g<? super T> f123335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super T> f123336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super Throwable> f123337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.a f123338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.a f123339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final kh.g<? super org.reactivestreams.e> f123340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final q f123341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final kh.a f123342i;

    /* JADX INFO: compiled from: ParallelPeek.java */
    public static final class a<T> implements o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f123343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final i<T> f123344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f123345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123346e;

        a(org.reactivestreams.d<? super T> dVar, i<T> iVar) {
            this.f123343b = dVar;
            this.f123344c = iVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            try {
                this.f123344c.f123342i.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f123345d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123346e) {
                return;
            }
            this.f123346e = true;
            try {
                this.f123344c.f123338e.run();
                this.f123343b.onComplete();
                try {
                    this.f123344c.f123339f.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f123343b.onError(th3);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123346e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123346e = true;
            try {
                this.f123344c.f123337d.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f123343b.onError(th2);
            try {
                this.f123344c.f123339f.run();
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                io.reactivex.plugins.a.Y(th4);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123346e) {
                return;
            }
            try {
                this.f123344c.f123335b.accept(t10);
                this.f123343b.onNext(t10);
                try {
                    this.f123344c.f123336c.accept(t10);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123345d, eVar)) {
                this.f123345d = eVar;
                try {
                    this.f123344c.f123340g.accept(eVar);
                    this.f123343b.onSubscribe(this);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    eVar.cancel();
                    this.f123343b.onSubscribe(EmptySubscription.INSTANCE);
                    onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            try {
                this.f123344c.f123341h.accept(j10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f123345d.request(j10);
        }
    }

    public i(io.reactivex.parallel.a<T> aVar, kh.g<? super T> gVar, kh.g<? super T> gVar2, kh.g<? super Throwable> gVar3, kh.a aVar2, kh.a aVar3, kh.g<? super org.reactivestreams.e> gVar4, q qVar, kh.a aVar4) {
        this.f123334a = aVar;
        this.f123335b = (kh.g) io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        this.f123336c = (kh.g) io.reactivex.internal.functions.a.g(gVar2, "onAfterNext is null");
        this.f123337d = (kh.g) io.reactivex.internal.functions.a.g(gVar3, "onError is null");
        this.f123338e = (kh.a) io.reactivex.internal.functions.a.g(aVar2, "onComplete is null");
        this.f123339f = (kh.a) io.reactivex.internal.functions.a.g(aVar3, "onAfterTerminated is null");
        this.f123340g = (kh.g) io.reactivex.internal.functions.a.g(gVar4, "onSubscribe is null");
        this.f123341h = (q) io.reactivex.internal.functions.a.g(qVar, "onRequest is null");
        this.f123342i = (kh.a) io.reactivex.internal.functions.a.g(aVar4, "onCancel is null");
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123334a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super T>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super T>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                dVarArr2[i10] = new a(dVarArr[i10], this);
            }
            this.f123334a.Q(dVarArr2);
        }
    }
}

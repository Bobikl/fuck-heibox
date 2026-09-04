package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import kh.o;

/* JADX INFO: compiled from: ParallelMap.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g<T, R> extends io.reactivex.parallel.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<T> f123310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends R> f123311b;

    /* JADX INFO: compiled from: ParallelMap.java */
    public static final class a<T, R> implements lh.a<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final lh.a<? super R> f123312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends R> f123313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f123314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123315e;

        a(lh.a<? super R> aVar, o<? super T, ? extends R> oVar) {
            this.f123312b = aVar;
            this.f123313c = oVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f123314d.cancel();
        }

        @Override // lh.a
        public boolean m(T t10) {
            if (this.f123315e) {
                return false;
            }
            try {
                return this.f123312b.m(io.reactivex.internal.functions.a.g(this.f123313c.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                onError(th2);
                return false;
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123315e) {
                return;
            }
            this.f123315e = true;
            this.f123312b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123315e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123315e = true;
                this.f123312b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123315e) {
                return;
            }
            try {
                this.f123312b.onNext(io.reactivex.internal.functions.a.g(this.f123313c.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123314d, eVar)) {
                this.f123314d = eVar;
                this.f123312b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f123314d.request(j10);
        }
    }

    /* JADX INFO: compiled from: ParallelMap.java */
    public static final class b<T, R> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f123316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends R> f123317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f123318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123319e;

        b(org.reactivestreams.d<? super R> dVar, o<? super T, ? extends R> oVar) {
            this.f123316b = dVar;
            this.f123317c = oVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f123318d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123319e) {
                return;
            }
            this.f123319e = true;
            this.f123316b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123319e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123319e = true;
                this.f123316b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123319e) {
                return;
            }
            try {
                this.f123316b.onNext(io.reactivex.internal.functions.a.g(this.f123317c.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123318d, eVar)) {
                this.f123318d = eVar;
                this.f123316b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f123318d.request(j10);
        }
    }

    public g(io.reactivex.parallel.a<T> aVar, o<? super T, ? extends R> oVar) {
        this.f123310a = aVar;
        this.f123311b = oVar;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123310a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super R>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super T>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                org.reactivestreams.d<? super R> dVar = dVarArr[i10];
                if (dVar instanceof lh.a) {
                    dVarArr2[i10] = new a((lh.a) dVar, this.f123311b);
                } else {
                    dVarArr2[i10] = new b(dVar, this.f123311b);
                }
            }
            this.f123310a.Q(dVarArr2);
        }
    }
}

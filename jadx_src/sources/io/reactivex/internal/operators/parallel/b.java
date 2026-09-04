package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;

/* JADX INFO: compiled from: ParallelDoOnNextTry.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> extends io.reactivex.parallel.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<T> f123273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kh.g<? super T> f123274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<? super Long, ? super Throwable, ParallelFailureHandling> f123275c;

    /* JADX INFO: compiled from: ParallelDoOnNextTry.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123276a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f123276a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123276a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123276a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ParallelDoOnNextTry.java */
    public static final class C1105b<T> implements lh.a<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final lh.a<? super T> f123277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super T> f123278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.c<? super Long, ? super Throwable, ParallelFailureHandling> f123279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f123280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f123281f;

        C1105b(lh.a<? super T> aVar, kh.g<? super T> gVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
            this.f123277b = aVar;
            this.f123278c = gVar;
            this.f123279d = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f123280e.cancel();
        }

        @Override // lh.a
        public boolean m(T t10) {
            int i10;
            if (this.f123281f) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f123278c.accept(t10);
                    return this.f123277b.m(t10);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    try {
                        j10++;
                        i10 = a.f123276a[((ParallelFailureHandling) io.reactivex.internal.functions.a.g(this.f123279d.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        cancel();
                        onError(new CompositeException(th2, th3));
                        return false;
                    }
                }
            } while (i10 == 1);
            if (i10 != 2) {
                if (i10 != 3) {
                    cancel();
                    onError(th2);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123281f) {
                return;
            }
            this.f123281f = true;
            this.f123277b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123281f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123281f = true;
                this.f123277b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (m(t10) || this.f123281f) {
                return;
            }
            this.f123280e.request(1L);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123280e, eVar)) {
                this.f123280e = eVar;
                this.f123277b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f123280e.request(j10);
        }
    }

    /* JADX INFO: compiled from: ParallelDoOnNextTry.java */
    public static final class c<T> implements lh.a<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f123282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super T> f123283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.c<? super Long, ? super Throwable, ParallelFailureHandling> f123284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f123285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f123286f;

        c(org.reactivestreams.d<? super T> dVar, kh.g<? super T> gVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
            this.f123282b = dVar;
            this.f123283c = gVar;
            this.f123284d = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f123285e.cancel();
        }

        @Override // lh.a
        public boolean m(T t10) {
            int i10;
            if (this.f123286f) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f123283c.accept(t10);
                    this.f123282b.onNext(t10);
                    return true;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    try {
                        j10++;
                        i10 = a.f123276a[((ParallelFailureHandling) io.reactivex.internal.functions.a.g(this.f123284d.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        cancel();
                        onError(new CompositeException(th2, th3));
                        return false;
                    }
                }
            } while (i10 == 1);
            if (i10 != 2) {
                if (i10 != 3) {
                    cancel();
                    onError(th2);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123286f) {
                return;
            }
            this.f123286f = true;
            this.f123282b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123286f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123286f = true;
                this.f123282b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (m(t10)) {
                return;
            }
            this.f123285e.request(1L);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123285e, eVar)) {
                this.f123285e = eVar;
                this.f123282b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f123285e.request(j10);
        }
    }

    public b(io.reactivex.parallel.a<T> aVar, kh.g<? super T> gVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
        this.f123273a = aVar;
        this.f123274b = gVar;
        this.f123275c = cVar;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123273a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super T>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super T>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                org.reactivestreams.d<? super T> dVar = dVarArr[i10];
                if (dVar instanceof lh.a) {
                    dVarArr2[i10] = new C1105b((lh.a) dVar, this.f123274b, this.f123275c);
                } else {
                    dVarArr2[i10] = new c(dVar, this.f123274b, this.f123275c);
                }
            }
            this.f123273a.Q(dVarArr2);
        }
    }
}

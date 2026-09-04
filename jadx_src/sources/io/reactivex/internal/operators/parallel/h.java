package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import kh.o;

/* JADX INFO: compiled from: ParallelMapTry.java */
/* JADX INFO: loaded from: classes5.dex */
public final class h<T, R> extends io.reactivex.parallel.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<T> f123320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends R> f123321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<? super Long, ? super Throwable, ParallelFailureHandling> f123322c;

    /* JADX INFO: compiled from: ParallelMapTry.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123323a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f123323a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123323a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123323a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: ParallelMapTry.java */
    public static final class b<T, R> implements lh.a<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final lh.a<? super R> f123324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends R> f123325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.c<? super Long, ? super Throwable, ParallelFailureHandling> f123326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f123327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f123328f;

        b(lh.a<? super R> aVar, o<? super T, ? extends R> oVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
            this.f123324b = aVar;
            this.f123325c = oVar;
            this.f123326d = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f123327e.cancel();
        }

        @Override // lh.a
        public boolean m(T t10) {
            int i10;
            if (this.f123328f) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    return this.f123324b.m(io.reactivex.internal.functions.a.g(this.f123325c.apply(t10), "The mapper returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    try {
                        j10++;
                        i10 = a.f123323a[((ParallelFailureHandling) io.reactivex.internal.functions.a.g(this.f123326d.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
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
            if (this.f123328f) {
                return;
            }
            this.f123328f = true;
            this.f123324b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123328f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123328f = true;
                this.f123324b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (m(t10) || this.f123328f) {
                return;
            }
            this.f123327e.request(1L);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123327e, eVar)) {
                this.f123327e = eVar;
                this.f123324b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f123327e.request(j10);
        }
    }

    /* JADX INFO: compiled from: ParallelMapTry.java */
    public static final class c<T, R> implements lh.a<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f123329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends R> f123330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.c<? super Long, ? super Throwable, ParallelFailureHandling> f123331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f123332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f123333f;

        c(org.reactivestreams.d<? super R> dVar, o<? super T, ? extends R> oVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
            this.f123329b = dVar;
            this.f123330c = oVar;
            this.f123331d = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f123332e.cancel();
        }

        @Override // lh.a
        public boolean m(T t10) {
            int i10;
            if (this.f123333f) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f123329b.onNext(io.reactivex.internal.functions.a.g(this.f123330c.apply(t10), "The mapper returned a null value"));
                    return true;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    try {
                        j10++;
                        i10 = a.f123323a[((ParallelFailureHandling) io.reactivex.internal.functions.a.g(this.f123331d.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
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
            if (this.f123333f) {
                return;
            }
            this.f123333f = true;
            this.f123329b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123333f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123333f = true;
                this.f123329b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (m(t10) || this.f123333f) {
                return;
            }
            this.f123332e.request(1L);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123332e, eVar)) {
                this.f123332e = eVar;
                this.f123329b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f123332e.request(j10);
        }
    }

    public h(io.reactivex.parallel.a<T> aVar, o<? super T, ? extends R> oVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
        this.f123320a = aVar;
        this.f123321b = oVar;
        this.f123322c = cVar;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123320a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super R>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super T>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                org.reactivestreams.d<? super R> dVar = dVarArr[i10];
                if (dVar instanceof lh.a) {
                    dVarArr2[i10] = new b((lh.a) dVar, this.f123321b, this.f123322c);
                } else {
                    dVarArr2[i10] = new c(dVar, this.f123321b, this.f123322c);
                }
            }
            this.f123320a.Q(dVarArr2);
        }
    }
}

package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import kh.r;

/* JADX INFO: compiled from: ParallelFilterTry.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> extends io.reactivex.parallel.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<T> f123294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r<? super T> f123295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<? super Long, ? super Throwable, ParallelFailureHandling> f123296c;

    /* JADX INFO: compiled from: ParallelFilterTry.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123297a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f123297a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123297a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123297a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: ParallelFilterTry.java */
    public static abstract class b<T> implements lh.a<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final r<? super T> f123298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<? super Long, ? super Throwable, ParallelFailureHandling> f123299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f123300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123301e;

        b(r<? super T> rVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
            this.f123298b = rVar;
            this.f123299c = cVar;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f123300d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t10) {
            if (m(t10) || this.f123301e) {
                return;
            }
            this.f123300d.request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j10) {
            this.f123300d.request(j10);
        }
    }

    /* JADX INFO: compiled from: ParallelFilterTry.java */
    public static final class c<T> extends b<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final lh.a<? super T> f123302f;

        c(lh.a<? super T> aVar, r<? super T> rVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
            super(rVar, cVar);
            this.f123302f = aVar;
        }

        @Override // lh.a
        public boolean m(T t10) {
            int i10;
            if (!this.f123301e) {
                long j10 = 0;
                do {
                    try {
                        return this.f123298b.test(t10) && this.f123302f.m(t10);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        try {
                            j10++;
                            i10 = a.f123297a[((ParallelFailureHandling) io.reactivex.internal.functions.a.g(this.f123299c.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            cancel();
                            onError(new CompositeException(th2, th3));
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
            return false;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123301e) {
                return;
            }
            this.f123301e = true;
            this.f123302f.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123301e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123301e = true;
                this.f123302f.onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123300d, eVar)) {
                this.f123300d = eVar;
                this.f123302f.onSubscribe(this);
            }
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ParallelFilterTry.java */
    public static final class C1107d<T> extends b<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f123303f;

        C1107d(org.reactivestreams.d<? super T> dVar, r<? super T> rVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
            super(rVar, cVar);
            this.f123303f = dVar;
        }

        @Override // lh.a
        public boolean m(T t10) {
            int i10;
            if (!this.f123301e) {
                long j10 = 0;
                do {
                    try {
                        if (!this.f123298b.test(t10)) {
                            return false;
                        }
                        this.f123303f.onNext(t10);
                        return true;
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        try {
                            j10++;
                            i10 = a.f123297a[((ParallelFailureHandling) io.reactivex.internal.functions.a.g(this.f123299c.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            cancel();
                            onError(new CompositeException(th2, th3));
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
            return false;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123301e) {
                return;
            }
            this.f123301e = true;
            this.f123303f.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123301e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123301e = true;
                this.f123303f.onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123300d, eVar)) {
                this.f123300d = eVar;
                this.f123303f.onSubscribe(this);
            }
        }
    }

    public d(io.reactivex.parallel.a<T> aVar, r<? super T> rVar, kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
        this.f123294a = aVar;
        this.f123295b = rVar;
        this.f123296c = cVar;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123294a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super T>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super T>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                org.reactivestreams.d<? super T> dVar = dVarArr[i10];
                if (dVar instanceof lh.a) {
                    dVarArr2[i10] = new c((lh.a) dVar, this.f123295b, this.f123296c);
                } else {
                    dVarArr2[i10] = new C1107d(dVar, this.f123295b, this.f123296c);
                }
            }
            this.f123294a.Q(dVarArr2);
        }
    }
}

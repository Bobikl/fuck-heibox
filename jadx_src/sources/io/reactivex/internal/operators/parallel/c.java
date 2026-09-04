package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import kh.r;

/* JADX INFO: compiled from: ParallelFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c<T> extends io.reactivex.parallel.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.a<T> f123287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r<? super T> f123288b;

    /* JADX INFO: compiled from: ParallelFilter.java */
    public static abstract class a<T> implements lh.a<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final r<? super T> f123289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f123290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f123291d;

        a(r<? super T> rVar) {
            this.f123289b = rVar;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f123290c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t10) {
            if (m(t10) || this.f123291d) {
                return;
            }
            this.f123290c.request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j10) {
            this.f123290c.request(j10);
        }
    }

    /* JADX INFO: compiled from: ParallelFilter.java */
    public static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final lh.a<? super T> f123292e;

        b(lh.a<? super T> aVar, r<? super T> rVar) {
            super(rVar);
            this.f123292e = aVar;
        }

        @Override // lh.a
        public boolean m(T t10) {
            if (!this.f123291d) {
                try {
                    if (this.f123289b.test(t10)) {
                        return this.f123292e.m(t10);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123291d) {
                return;
            }
            this.f123291d = true;
            this.f123292e.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123291d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123291d = true;
                this.f123292e.onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123290c, eVar)) {
                this.f123290c = eVar;
                this.f123292e.onSubscribe(this);
            }
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ParallelFilter.java */
    public static final class C1106c<T> extends a<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f123293e;

        C1106c(org.reactivestreams.d<? super T> dVar, r<? super T> rVar) {
            super(rVar);
            this.f123293e = dVar;
        }

        @Override // lh.a
        public boolean m(T t10) {
            if (!this.f123291d) {
                try {
                    if (this.f123289b.test(t10)) {
                        this.f123293e.onNext(t10);
                        return true;
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123291d) {
                return;
            }
            this.f123291d = true;
            this.f123293e.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123291d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123291d = true;
                this.f123293e.onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123290c, eVar)) {
                this.f123290c = eVar;
                this.f123293e.onSubscribe(this);
            }
        }
    }

    public c(io.reactivex.parallel.a<T> aVar, r<? super T> rVar) {
        this.f123287a = aVar;
        this.f123288b = rVar;
    }

    @Override // io.reactivex.parallel.a
    public int F() {
        return this.f123287a.F();
    }

    @Override // io.reactivex.parallel.a
    public void Q(org.reactivestreams.d<? super T>[] dVarArr) {
        if (U(dVarArr)) {
            int length = dVarArr.length;
            org.reactivestreams.d<? super T>[] dVarArr2 = new org.reactivestreams.d[length];
            for (int i10 = 0; i10 < length; i10++) {
                org.reactivestreams.d<? super T> dVar = dVarArr[i10];
                if (dVar instanceof lh.a) {
                    dVarArr2[i10] = new b((lh.a) dVar, this.f123288b);
                } else {
                    dVarArr2[i10] = new C1106c(dVar, this.f123288b);
                }
            }
            this.f123287a.Q(dVarArr2);
        }
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWithLatestFromMany<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @jh.f
    final org.reactivestreams.c<?>[] f121004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @jh.f
    final Iterable<? extends org.reactivestreams.c<?>> f121005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.o<? super Object[], R> f121006f;

    public static final class WithLatestFromSubscriber<T, R> extends AtomicInteger implements lh.a<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 1577321883966341961L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f121007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Object[], R> f121008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final WithLatestInnerSubscriber[] f121009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceArray<Object> f121010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f121011f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicLong f121012g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicThrowable f121013h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f121014i;

        WithLatestFromSubscriber(org.reactivestreams.d<? super R> dVar, kh.o<? super Object[], R> oVar, int i10) {
            this.f121007b = dVar;
            this.f121008c = oVar;
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = new WithLatestInnerSubscriber[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                withLatestInnerSubscriberArr[i11] = new WithLatestInnerSubscriber(this, i11);
            }
            this.f121009d = withLatestInnerSubscriberArr;
            this.f121010e = new AtomicReferenceArray<>(i10);
            this.f121011f = new AtomicReference<>();
            this.f121012g = new AtomicLong();
            this.f121013h = new AtomicThrowable();
        }

        void a(int i10) {
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.f121009d;
            for (int i11 = 0; i11 < withLatestInnerSubscriberArr.length; i11++) {
                if (i11 != i10) {
                    withLatestInnerSubscriberArr[i11].a();
                }
            }
        }

        void b(int i10, boolean z10) {
            if (z10) {
                return;
            }
            this.f121014i = true;
            SubscriptionHelper.cancel(this.f121011f);
            a(i10);
            io.reactivex.internal.util.g.b(this.f121007b, this, this.f121013h);
        }

        void c(int i10, Throwable th2) {
            this.f121014i = true;
            SubscriptionHelper.cancel(this.f121011f);
            a(i10);
            io.reactivex.internal.util.g.d(this.f121007b, th2, this, this.f121013h);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f121011f);
            for (WithLatestInnerSubscriber withLatestInnerSubscriber : this.f121009d) {
                withLatestInnerSubscriber.a();
            }
        }

        void d(int i10, Object obj) {
            this.f121010e.set(i10, obj);
        }

        void e(org.reactivestreams.c<?>[] cVarArr, int i10) {
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.f121009d;
            AtomicReference<org.reactivestreams.e> atomicReference = this.f121011f;
            for (int i11 = 0; i11 < i10 && atomicReference.get() != SubscriptionHelper.CANCELLED; i11++) {
                cVarArr[i11].g(withLatestInnerSubscriberArr[i11]);
            }
        }

        @Override // lh.a
        public boolean m(T t10) {
            if (this.f121014i) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f121010e;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = t10;
            int i10 = 0;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return false;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                io.reactivex.internal.util.g.f(this.f121007b, io.reactivex.internal.functions.a.g(this.f121008c.apply(objArr), "The combiner returned a null value"), this, this.f121013h);
                return true;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                onError(th2);
                return false;
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121014i) {
                return;
            }
            this.f121014i = true;
            a(-1);
            io.reactivex.internal.util.g.b(this.f121007b, this, this.f121013h);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121014i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121014i = true;
            a(-1);
            io.reactivex.internal.util.g.d(this.f121007b, th2, this, this.f121013h);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (m(t10) || this.f121014i) {
                return;
            }
            this.f121011f.get().request(1L);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f121011f, this.f121012g, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f121011f, this.f121012g, j10);
        }
    }

    public static final class WithLatestInnerSubscriber extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WithLatestFromSubscriber<?, ?> f121015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f121016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f121017d;

        WithLatestInnerSubscriber(WithLatestFromSubscriber<?, ?> withLatestFromSubscriber, int i10) {
            this.f121015b = withLatestFromSubscriber;
            this.f121016c = i10;
        }

        void a() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121015b.b(this.f121016c, this.f121017d);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121015b.c(this.f121016c, th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            if (!this.f121017d) {
                this.f121017d = true;
            }
            this.f121015b.d(this.f121016c, obj);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public final class a implements kh.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // kh.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.a.g(FlowableWithLatestFromMany.this.f121006f.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    public FlowableWithLatestFromMany(@jh.e io.reactivex.j<T> jVar, @jh.e Iterable<? extends org.reactivestreams.c<?>> iterable, @jh.e kh.o<? super Object[], R> oVar) {
        super(jVar);
        this.f121004d = null;
        this.f121005e = iterable;
        this.f121006f = oVar;
    }

    public FlowableWithLatestFromMany(@jh.e io.reactivex.j<T> jVar, @jh.e org.reactivestreams.c<?>[] cVarArr, kh.o<? super Object[], R> oVar) {
        super(jVar);
        this.f121004d = cVarArr;
        this.f121005e = null;
        this.f121006f = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        int length;
        org.reactivestreams.c<?>[] cVarArr = this.f121004d;
        if (cVarArr == null) {
            cVarArr = new org.reactivestreams.c[8];
            try {
                length = 0;
                for (org.reactivestreams.c<?> cVar : this.f121005e) {
                    if (length == cVarArr.length) {
                        cVarArr = (org.reactivestreams.c[]) Arrays.copyOf(cVarArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    cVarArr[length] = cVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptySubscription.error(th2, dVar);
                return;
            }
        } else {
            length = cVarArr.length;
        }
        if (length == 0) {
            new p0(this.f121039c, new a()).k6(dVar);
            return;
        }
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(dVar, this.f121006f, length);
        dVar.onSubscribe(withLatestFromSubscriber);
        withLatestFromSubscriber.e(cVarArr, length);
        this.f121039c.j6(withLatestFromSubscriber);
    }
}

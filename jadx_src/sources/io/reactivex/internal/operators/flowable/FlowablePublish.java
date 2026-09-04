package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowablePublish<T> extends io.reactivex.flowables.a<T> implements lh.h<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f120506g = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.j<T> f120507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<PublishSubscriber<T>> f120508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final org.reactivestreams.c<T> f120510f;

    public static final class InnerSubscriber<T> extends AtomicLong implements org.reactivestreams.e {
        private static final long serialVersionUID = -4453897557930727610L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile PublishSubscriber<T> f120512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f120513d;

        InnerSubscriber(org.reactivestreams.d<? super T> dVar) {
            this.f120511b = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            PublishSubscriber<T> publishSubscriber;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (publishSubscriber = this.f120512c) == null) {
                return;
            }
            publishSubscriber.d(this);
            publishSubscriber.c();
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.b(this, j10);
                PublishSubscriber<T> publishSubscriber = this.f120512c;
                if (publishSubscriber != null) {
                    publishSubscriber.c();
                }
            }
        }
    }

    public static final class PublishSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final InnerSubscriber[] f120514j = new InnerSubscriber[0];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final InnerSubscriber[] f120515k = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<PublishSubscriber<T>> f120516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f120517c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile Object f120521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f120522h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile lh.o<T> f120523i;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120520f = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<InnerSubscriber<T>[]> f120518d = new AtomicReference<>(f120514j);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f120519e = new AtomicBoolean();

        PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i10) {
            this.f120516b = atomicReference;
            this.f120517c = i10;
        }

        boolean a(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.f120518d.get();
                if (innerSubscriberArr == f120515k) {
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!androidx.compose.animation.core.s0.a(this.f120518d, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        boolean b(Object obj, boolean z10) {
            int i10 = 0;
            if (obj != null) {
                if (!NotificationLite.isComplete(obj)) {
                    Throwable error = NotificationLite.getError(obj);
                    androidx.compose.animation.core.s0.a(this.f120516b, this, null);
                    InnerSubscriber<T>[] andSet = this.f120518d.getAndSet(f120515k);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i10 < length) {
                            andSet[i10].f120511b.onError(error);
                            i10++;
                        }
                    } else {
                        io.reactivex.plugins.a.Y(error);
                    }
                    return true;
                }
                if (z10) {
                    androidx.compose.animation.core.s0.a(this.f120516b, this, null);
                    InnerSubscriber<T>[] andSet2 = this.f120518d.getAndSet(f120515k);
                    int length2 = andSet2.length;
                    while (i10 < length2) {
                        andSet2[i10].f120511b.onComplete();
                        i10++;
                    }
                    return true;
                }
            }
            return false;
        }

        void c() {
            T tPoll;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<InnerSubscriber<T>[]> atomicReference = this.f120518d;
            boolean z10 = true;
            InnerSubscriber<T>[] innerSubscriberArr = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Object obj = this.f120521g;
                lh.o<T> oVar = this.f120523i;
                boolean z11 = (oVar == null || oVar.isEmpty()) ? z10 : false;
                if (b(obj, z11)) {
                    return;
                }
                if (!z11) {
                    int length = innerSubscriberArr.length;
                    int i10 = 0;
                    long jMin = Long.MAX_VALUE;
                    for (InnerSubscriber<T> innerSubscriber : innerSubscriberArr) {
                        long j10 = innerSubscriber.get();
                        if (j10 != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j10 - innerSubscriber.f120513d);
                        } else {
                            i10++;
                        }
                    }
                    if (length == i10) {
                        Object objError = this.f120521g;
                        try {
                            tPoll = oVar.poll();
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            this.f120520f.get().cancel();
                            objError = NotificationLite.error(th2);
                            this.f120521g = objError;
                            tPoll = null;
                        }
                        if (b(objError, tPoll == null ? z10 : false)) {
                            return;
                        }
                        if (this.f120522h != z10) {
                            this.f120520f.get().request(1L);
                        }
                    } else {
                        int i11 = 0;
                        while (true) {
                            long j11 = i11;
                            if (j11 < jMin) {
                                Object objError2 = this.f120521g;
                                try {
                                    tPoll2 = oVar.poll();
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.a.b(th3);
                                    this.f120520f.get().cancel();
                                    objError2 = NotificationLite.error(th3);
                                    this.f120521g = objError2;
                                    tPoll2 = null;
                                }
                                boolean z12 = tPoll2 == null ? z10 : false;
                                if (b(objError2, z12)) {
                                    return;
                                }
                                if (z12) {
                                    z11 = z12;
                                } else {
                                    Object value = NotificationLite.getValue(tPoll2);
                                    int length2 = innerSubscriberArr.length;
                                    int i12 = 0;
                                    boolean z13 = false;
                                    while (i12 < length2) {
                                        InnerSubscriber<T> innerSubscriber2 = innerSubscriberArr[i12];
                                        long j12 = innerSubscriber2.get();
                                        if (j12 != Long.MIN_VALUE) {
                                            if (j12 != Long.MAX_VALUE) {
                                                innerSubscriber2.f120513d++;
                                            }
                                            innerSubscriber2.f120511b.onNext(value);
                                        } else {
                                            oVar = oVar;
                                            z12 = z12;
                                            z13 = true;
                                        }
                                        i12++;
                                        oVar = oVar;
                                        z12 = z12;
                                    }
                                    lh.o<T> oVar2 = oVar;
                                    boolean z14 = z12;
                                    i11++;
                                    InnerSubscriber<T>[] innerSubscriberArr2 = atomicReference.get();
                                    if (z13 || innerSubscriberArr2 != innerSubscriberArr) {
                                        if (i11 != 0 && this.f120522h != 1) {
                                            this.f120520f.get().request(i11);
                                        }
                                        innerSubscriberArr = innerSubscriberArr2;
                                        z10 = true;
                                    } else {
                                        oVar = oVar2;
                                        z11 = z14;
                                        z10 = true;
                                    }
                                }
                            }
                            if (i11 != 0) {
                                z10 = true;
                                if (this.f120522h != 1) {
                                    this.f120520f.get().request(j11);
                                }
                            } else {
                                z10 = true;
                            }
                            if (jMin == 0 || z11) {
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    innerSubscriberArr = atomicReference.get();
                }
            }
        }

        void d(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.f120518d.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerSubscriberArr[i11].equals(innerSubscriber)) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = f120514j;
                } else {
                    InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!androidx.compose.animation.core.s0.a(this.f120518d, innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            InnerSubscriber<T>[] innerSubscriberArr = this.f120518d.get();
            InnerSubscriber<T>[] innerSubscriberArr2 = f120515k;
            if (innerSubscriberArr == innerSubscriberArr2 || this.f120518d.getAndSet(innerSubscriberArr2) == innerSubscriberArr2) {
                return;
            }
            androidx.compose.animation.core.s0.a(this.f120516b, this, null);
            SubscriptionHelper.cancel(this.f120520f);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f120518d.get() == f120515k;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120521g == null) {
                this.f120521g = NotificationLite.complete();
                c();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120521g != null) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120521g = NotificationLite.error(th2);
                c();
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120522h != 0 || this.f120523i.offer(t10)) {
                c();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this.f120520f, eVar)) {
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f120522h = iRequestFusion;
                        this.f120523i = lVar;
                        this.f120521g = NotificationLite.complete();
                        c();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f120522h = iRequestFusion;
                        this.f120523i = lVar;
                        eVar.request(this.f120517c);
                        return;
                    }
                }
                this.f120523i = new SpscArrayQueue(this.f120517c);
                eVar.request(this.f120517c);
            }
        }
    }

    public static final class a<T> implements org.reactivestreams.c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference<PublishSubscriber<T>> f120524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f120525c;

        a(AtomicReference<PublishSubscriber<T>> atomicReference, int i10) {
            this.f120524b = atomicReference;
            this.f120525c = i10;
        }

        @Override // org.reactivestreams.c
        public void g(org.reactivestreams.d<? super T> dVar) {
            PublishSubscriber<T> publishSubscriber;
            InnerSubscriber<T> innerSubscriber = new InnerSubscriber<>(dVar);
            dVar.onSubscribe(innerSubscriber);
            while (true) {
                publishSubscriber = this.f120524b.get();
                if (publishSubscriber == null || publishSubscriber.isDisposed()) {
                    PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.f120524b, this.f120525c);
                    if (androidx.compose.animation.core.s0.a(this.f120524b, publishSubscriber, publishSubscriber2)) {
                        publishSubscriber = publishSubscriber2;
                    } else {
                        continue;
                    }
                }
                if (publishSubscriber.a(innerSubscriber)) {
                    break;
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.d(innerSubscriber);
            } else {
                innerSubscriber.f120512c = publishSubscriber;
            }
            publishSubscriber.c();
        }
    }

    private FlowablePublish(org.reactivestreams.c<T> cVar, io.reactivex.j<T> jVar, AtomicReference<PublishSubscriber<T>> atomicReference, int i10) {
        this.f120510f = cVar;
        this.f120507c = jVar;
        this.f120508d = atomicReference;
        this.f120509e = i10;
    }

    public static <T> io.reactivex.flowables.a<T> X8(io.reactivex.j<T> jVar, int i10) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.plugins.a.T(new FlowablePublish(new a(atomicReference, i10), jVar, atomicReference, i10));
    }

    @Override // io.reactivex.flowables.a
    public void Q8(kh.g<? super io.reactivex.disposables.b> gVar) {
        PublishSubscriber<T> publishSubscriber;
        while (true) {
            publishSubscriber = this.f120508d.get();
            if (publishSubscriber != null && !publishSubscriber.isDisposed()) {
                break;
            }
            PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.f120508d, this.f120509e);
            if (androidx.compose.animation.core.s0.a(this.f120508d, publishSubscriber, publishSubscriber2)) {
                publishSubscriber = publishSubscriber2;
                break;
            }
        }
        boolean z10 = !publishSubscriber.f120519e.get() && publishSubscriber.f120519e.compareAndSet(false, true);
        try {
            gVar.accept(publishSubscriber);
            if (z10) {
                this.f120507c.j6(publishSubscriber);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f120510f.g(dVar);
    }

    @Override // lh.h
    public org.reactivestreams.c<T> source() {
        return this.f120507c;
    }
}

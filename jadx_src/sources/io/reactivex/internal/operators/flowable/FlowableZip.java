package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableZip<T, R> extends io.reactivex.j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<? extends T>[] f121019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Iterable<? extends org.reactivestreams.c<? extends T>> f121020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super Object[], ? extends R> f121021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f121022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f121023g;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = -2434867452883857743L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f121024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ZipSubscriber<T, R>[] f121025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super Object[], ? extends R> f121026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f121027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicThrowable f121028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f121029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f121030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final Object[] f121031i;

        ZipCoordinator(org.reactivestreams.d<? super R> dVar, kh.o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.f121024b = dVar;
            this.f121026d = oVar;
            this.f121029g = z10;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                zipSubscriberArr[i12] = new ZipSubscriber<>(this, i11);
            }
            this.f121031i = new Object[i10];
            this.f121025c = zipSubscriberArr;
            this.f121027e = new AtomicLong();
            this.f121028f = new AtomicThrowable();
        }

        void a() {
            for (ZipSubscriber<T, R> zipSubscriber : this.f121025c) {
                zipSubscriber.cancel();
            }
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super R> dVar = this.f121024b;
            ZipSubscriber<T, R>[] zipSubscriberArr = this.f121025c;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.f121031i;
            int iAddAndGet = 1;
            do {
                long j10 = this.f121027e.get();
                long j11 = 0;
                while (j10 != j11) {
                    if (this.f121030h) {
                        return;
                    }
                    if (!this.f121029g && this.f121028f.get() != null) {
                        a();
                        dVar.onError(this.f121028f.c());
                        return;
                    }
                    boolean z10 = false;
                    for (int i10 = 0; i10 < length; i10++) {
                        ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i10];
                        if (objArr[i10] == null) {
                            try {
                                boolean z11 = zipSubscriber.f121037g;
                                lh.o<T> oVar = zipSubscriber.f121035e;
                                T tPoll = oVar != null ? oVar.poll() : null;
                                boolean z12 = tPoll == null;
                                if (z11 && z12) {
                                    a();
                                    if (this.f121028f.get() != null) {
                                        dVar.onError(this.f121028f.c());
                                        return;
                                    } else {
                                        dVar.onComplete();
                                        return;
                                    }
                                }
                                if (z12) {
                                    z10 = true;
                                } else {
                                    objArr[i10] = tPoll;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                this.f121028f.a(th2);
                                if (!this.f121029g) {
                                    a();
                                    dVar.onError(this.f121028f.c());
                                    return;
                                }
                            }
                        }
                    }
                    if (z10) {
                        break;
                    }
                    try {
                        dVar.onNext((Object) io.reactivex.internal.functions.a.g(this.f121026d.apply(objArr.clone()), "The zipper returned a null value"));
                        j11++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        a();
                        this.f121028f.a(th3);
                        dVar.onError(this.f121028f.c());
                        return;
                    }
                }
                if (j10 == j11) {
                    if (this.f121030h) {
                        return;
                    }
                    if (!this.f121029g && this.f121028f.get() != null) {
                        a();
                        dVar.onError(this.f121028f.c());
                        return;
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i11];
                        if (objArr[i11] == null) {
                            try {
                                boolean z13 = zipSubscriber2.f121037g;
                                lh.o<T> oVar2 = zipSubscriber2.f121035e;
                                T tPoll2 = oVar2 != null ? oVar2.poll() : null;
                                boolean z14 = tPoll2 == null;
                                if (z13 && z14) {
                                    a();
                                    if (this.f121028f.get() != null) {
                                        dVar.onError(this.f121028f.c());
                                        return;
                                    } else {
                                        dVar.onComplete();
                                        return;
                                    }
                                }
                                if (!z14) {
                                    objArr[i11] = tPoll2;
                                }
                            } catch (Throwable th4) {
                                io.reactivex.exceptions.a.b(th4);
                                this.f121028f.a(th4);
                                if (!this.f121029g) {
                                    a();
                                    dVar.onError(this.f121028f.c());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j11 != 0) {
                    for (ZipSubscriber<T, R> zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j11);
                    }
                    if (j10 != Long.MAX_VALUE) {
                        this.f121027e.addAndGet(-j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void c(ZipSubscriber<T, R> zipSubscriber, Throwable th2) {
            if (!this.f121028f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                zipSubscriber.f121037g = true;
                b();
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f121030h) {
                return;
            }
            this.f121030h = true;
            a();
        }

        void d(org.reactivestreams.c<? extends T>[] cVarArr, int i10) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.f121025c;
            for (int i11 = 0; i11 < i10 && !this.f121030h; i11++) {
                if (!this.f121029g && this.f121028f.get() != null) {
                    return;
                }
                cVarArr[i11].g(zipSubscriberArr[i11]);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f121027e, j10);
                b();
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -4627193790118206028L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ZipCoordinator<T, R> f121032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f121033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f121034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        lh.o<T> f121035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f121036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f121037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f121038h;

        ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i10) {
            this.f121032b = zipCoordinator;
            this.f121033c = i10;
            this.f121034d = i10 - (i10 >> 2);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121037g = true;
            this.f121032b.b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121032b.c(this, th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121038h != 2) {
                this.f121035e.offer(t10);
            }
            this.f121032b.b();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this, eVar)) {
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f121038h = iRequestFusion;
                        this.f121035e = lVar;
                        this.f121037g = true;
                        this.f121032b.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f121038h = iRequestFusion;
                        this.f121035e = lVar;
                        eVar.request(this.f121033c);
                        return;
                    }
                }
                this.f121035e = new SpscArrayQueue(this.f121033c);
                eVar.request(this.f121033c);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (this.f121038h != 1) {
                long j11 = this.f121036f + j10;
                if (j11 < this.f121034d) {
                    this.f121036f = j11;
                } else {
                    this.f121036f = 0L;
                    get().request(j11);
                }
            }
        }
    }

    public FlowableZip(org.reactivestreams.c<? extends T>[] cVarArr, Iterable<? extends org.reactivestreams.c<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f121019c = cVarArr;
        this.f121020d = iterable;
        this.f121021e = oVar;
        this.f121022f = i10;
        this.f121023g = z10;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super R> dVar) {
        int length;
        org.reactivestreams.c<? extends T>[] cVarArr = this.f121019c;
        if (cVarArr == null) {
            cVarArr = new org.reactivestreams.c[8];
            length = 0;
            for (org.reactivestreams.c<? extends T> cVar : this.f121020d) {
                if (length == cVarArr.length) {
                    org.reactivestreams.c<? extends T>[] cVarArr2 = new org.reactivestreams.c[(length >> 2) + length];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                    cVarArr = cVarArr2;
                }
                cVarArr[length] = cVar;
                length++;
            }
        } else {
            length = cVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(dVar);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(dVar, this.f121021e, i10, this.f121022f, this.f121023g);
        dVar.onSubscribe(zipCoordinator);
        zipCoordinator.d(cVarArr, i10);
    }
}

package io.reactivex.processors;

import androidx.compose.animation.core.s0;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jh.c;
import jh.g;
import lh.l;
import lh.o;
import org.reactivestreams.d;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes5.dex */
@jh.a(BackpressureKind.FULL)
@g("none")
public final class MulticastProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final MulticastSubscription[] f123973o = new MulticastSubscription[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final MulticastSubscription[] f123974p = new MulticastSubscription[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicInteger f123975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<e> f123976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReference<MulticastSubscription<T>[]> f123977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicBoolean f123978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f123979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f123980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f123981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    volatile o<T> f123982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    volatile boolean f123983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    volatile Throwable f123984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f123985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f123986n;

    public static final class MulticastSubscription<T> extends AtomicLong implements e {
        private static final long serialVersionUID = -363282618957264509L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<? super T> f123987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final MulticastProcessor<T> f123988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f123989d;

        MulticastSubscription(d<? super T> dVar, MulticastProcessor<T> multicastProcessor) {
            this.f123987b = dVar;
            this.f123988c = multicastProcessor;
        }

        void a() {
            if (get() != Long.MIN_VALUE) {
                this.f123987b.onComplete();
            }
        }

        void b(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.f123987b.onError(th2);
            }
        }

        void c(T t10) {
            if (get() != Long.MIN_VALUE) {
                this.f123989d++;
                this.f123987b.onNext(t10);
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f123988c.Y8(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            long j11;
            long j12;
            if (SubscriptionHelper.validate(j10)) {
                do {
                    j11 = get();
                    if (j11 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j11 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j12 = j11 + j10;
                    }
                } while (!compareAndSet(j11, j12 >= 0 ? j12 : Long.MAX_VALUE));
                this.f123988c.W8();
            }
        }
    }

    MulticastProcessor(int i10, boolean z10) {
        io.reactivex.internal.functions.a.h(i10, "bufferSize");
        this.f123979g = i10;
        this.f123980h = i10 - (i10 >> 2);
        this.f123975c = new AtomicInteger();
        this.f123977e = new AtomicReference<>(f123973o);
        this.f123976d = new AtomicReference<>();
        this.f123981i = z10;
        this.f123978f = new AtomicBoolean();
    }

    @jh.e
    @c
    public static <T> MulticastProcessor<T> S8() {
        return new MulticastProcessor<>(j.Y(), false);
    }

    @jh.e
    @c
    public static <T> MulticastProcessor<T> T8(int i10) {
        return new MulticastProcessor<>(i10, false);
    }

    @jh.e
    @c
    public static <T> MulticastProcessor<T> U8(int i10, boolean z10) {
        return new MulticastProcessor<>(i10, z10);
    }

    @jh.e
    @c
    public static <T> MulticastProcessor<T> V8(boolean z10) {
        return new MulticastProcessor<>(j.Y(), z10);
    }

    @Override // io.reactivex.processors.a
    public Throwable M8() {
        if (this.f123978f.get()) {
            return this.f123984l;
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean N8() {
        return this.f123978f.get() && this.f123984l == null;
    }

    @Override // io.reactivex.processors.a
    public boolean O8() {
        return this.f123977e.get().length != 0;
    }

    @Override // io.reactivex.processors.a
    public boolean P8() {
        return this.f123978f.get() && this.f123984l != null;
    }

    boolean R8(MulticastSubscription<T> multicastSubscription) {
        MulticastSubscription<T>[] multicastSubscriptionArr;
        MulticastSubscription[] multicastSubscriptionArr2;
        do {
            multicastSubscriptionArr = this.f123977e.get();
            if (multicastSubscriptionArr == f123974p) {
                return false;
            }
            int length = multicastSubscriptionArr.length;
            multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
        } while (!s0.a(this.f123977e, multicastSubscriptionArr, multicastSubscriptionArr2));
        return true;
    }

    void W8() {
        T tPoll;
        if (this.f123975c.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<MulticastSubscription<T>[]> atomicReference = this.f123977e;
        int i10 = this.f123985m;
        int i11 = this.f123980h;
        int i12 = this.f123986n;
        int iAddAndGet = 1;
        while (true) {
            o<T> oVar = this.f123982j;
            if (oVar != null) {
                MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int length = multicastSubscriptionArr.length;
                    long j10 = -1;
                    long jMin = -1;
                    int i13 = 0;
                    while (i13 < length) {
                        MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i13];
                        long j11 = multicastSubscription.get();
                        if (j11 >= 0) {
                            jMin = jMin == j10 ? j11 - multicastSubscription.f123989d : Math.min(jMin, j11 - multicastSubscription.f123989d);
                        }
                        i13++;
                        j10 = -1;
                    }
                    int i14 = i10;
                    while (true) {
                        if (jMin > 0) {
                            MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                            if (multicastSubscriptionArr2 == f123974p) {
                                oVar.clear();
                                return;
                            }
                            if (multicastSubscriptionArr == multicastSubscriptionArr2) {
                                boolean z10 = this.f123983k;
                                try {
                                    tPoll = oVar.poll();
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.a.b(th2);
                                    SubscriptionHelper.cancel(this.f123976d);
                                    this.f123984l = th2;
                                    this.f123983k = true;
                                    tPoll = null;
                                    z10 = true;
                                }
                                boolean z11 = tPoll == null;
                                if (z10 && z11) {
                                    Throwable th3 = this.f123984l;
                                    if (th3 != null) {
                                        for (MulticastSubscription<T> multicastSubscription2 : atomicReference.getAndSet(f123974p)) {
                                            multicastSubscription2.b(th3);
                                        }
                                        return;
                                    }
                                    for (MulticastSubscription<T> multicastSubscription3 : atomicReference.getAndSet(f123974p)) {
                                        multicastSubscription3.a();
                                    }
                                    return;
                                }
                                if (!z11) {
                                    for (MulticastSubscription<T> multicastSubscription4 : multicastSubscriptionArr) {
                                        multicastSubscription4.c(tPoll);
                                    }
                                    jMin--;
                                    if (i12 != 1 && (i14 = i14 + 1) == i11) {
                                        this.f123976d.get().request(i11);
                                        i14 = 0;
                                    }
                                }
                            }
                            i10 = i14;
                        }
                        if (jMin == 0) {
                            MulticastSubscription<T>[] multicastSubscriptionArr3 = atomicReference.get();
                            MulticastSubscription<T>[] multicastSubscriptionArr4 = f123974p;
                            if (multicastSubscriptionArr3 == multicastSubscriptionArr4) {
                                oVar.clear();
                                return;
                            }
                            if (multicastSubscriptionArr != multicastSubscriptionArr3) {
                                i10 = i14;
                            } else if (this.f123983k && oVar.isEmpty()) {
                                Throwable th4 = this.f123984l;
                                if (th4 != null) {
                                    for (MulticastSubscription<T> multicastSubscription5 : atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                        multicastSubscription5.b(th4);
                                    }
                                    return;
                                }
                                for (MulticastSubscription<T> multicastSubscription6 : atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                    multicastSubscription6.a();
                                }
                                return;
                            }
                        }
                        i10 = i14;
                    }
                }
            }
            iAddAndGet = this.f123975c.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public boolean X8(T t10) {
        if (this.f123978f.get()) {
            return false;
        }
        io.reactivex.internal.functions.a.g(t10, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f123986n != 0 || !this.f123982j.offer(t10)) {
            return false;
        }
        W8();
        return true;
    }

    void Y8(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.f123977e.get();
            int length = multicastSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (multicastSubscriptionArr[i11] == multicastSubscription) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length != 1) {
                MulticastSubscription[] multicastSubscriptionArr2 = new MulticastSubscription[length - 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i10);
                System.arraycopy(multicastSubscriptionArr, i10 + 1, multicastSubscriptionArr2, i10, (length - i10) - 1);
                if (s0.a(this.f123977e, multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    return;
                }
            } else if (this.f123981i) {
                if (s0.a(this.f123977e, multicastSubscriptionArr, f123974p)) {
                    SubscriptionHelper.cancel(this.f123976d);
                    this.f123978f.set(true);
                    return;
                }
            } else if (s0.a(this.f123977e, multicastSubscriptionArr, f123973o)) {
                return;
            }
        }
    }

    public void Z8() {
        if (SubscriptionHelper.setOnce(this.f123976d, EmptySubscription.INSTANCE)) {
            this.f123982j = new SpscArrayQueue(this.f123979g);
        }
    }

    public void a9() {
        if (SubscriptionHelper.setOnce(this.f123976d, EmptySubscription.INSTANCE)) {
            this.f123982j = new io.reactivex.internal.queue.a(this.f123979g);
        }
    }

    @Override // io.reactivex.j
    protected void k6(d<? super T> dVar) {
        Throwable th2;
        MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(dVar, this);
        dVar.onSubscribe(multicastSubscription);
        if (R8(multicastSubscription)) {
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                Y8(multicastSubscription);
                return;
            } else {
                W8();
                return;
            }
        }
        if ((this.f123978f.get() || !this.f123981i) && (th2 = this.f123984l) != null) {
            dVar.onError(th2);
        } else {
            dVar.onComplete();
        }
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (this.f123978f.compareAndSet(false, true)) {
            this.f123983k = true;
            W8();
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f123978f.compareAndSet(false, true)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f123984l = th2;
        this.f123983k = true;
        W8();
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (this.f123978f.get()) {
            return;
        }
        if (this.f123986n == 0) {
            io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.f123982j.offer(t10)) {
                SubscriptionHelper.cancel(this.f123976d);
                onError(new MissingBackpressureException());
                return;
            }
        }
        W8();
    }

    @Override // org.reactivestreams.d
    public void onSubscribe(e eVar) {
        if (SubscriptionHelper.setOnce(this.f123976d, eVar)) {
            if (eVar instanceof l) {
                l lVar = (l) eVar;
                int iRequestFusion = lVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f123986n = iRequestFusion;
                    this.f123982j = lVar;
                    this.f123983k = true;
                    W8();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f123986n = iRequestFusion;
                    this.f123982j = lVar;
                    eVar.request(this.f123979g);
                    return;
                }
            }
            this.f123982j = new SpscArrayQueue(this.f123979g);
            eVar.request(this.f123979g);
        }
    }
}

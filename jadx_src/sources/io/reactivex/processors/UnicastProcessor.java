package io.reactivex.processors;

import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jh.c;
import jh.e;
import jh.f;
import org.reactivestreams.d;

/* JADX INFO: loaded from: classes5.dex */
public final class UnicastProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.internal.queue.a<T> f124030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<Runnable> f124031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f124032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f124033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Throwable f124034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AtomicReference<d<? super T>> f124035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    volatile boolean f124036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final AtomicBoolean f124037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final BasicIntQueueSubscription<T> f124038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final AtomicLong f124039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f124040m;

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        UnicastQueueSubscription() {
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (UnicastProcessor.this.f124036i) {
                return;
            }
            UnicastProcessor.this.f124036i = true;
            UnicastProcessor.this.X8();
            UnicastProcessor unicastProcessor = UnicastProcessor.this;
            if (unicastProcessor.f124040m || unicastProcessor.f124038k.getAndIncrement() != 0) {
                return;
            }
            UnicastProcessor.this.f124030c.clear();
            UnicastProcessor.this.f124035h.lazySet(null);
        }

        @Override // lh.o
        public void clear() {
            UnicastProcessor.this.f124030c.clear();
        }

        @Override // lh.o
        public boolean isEmpty() {
            return UnicastProcessor.this.f124030c.isEmpty();
        }

        @Override // lh.o
        @f
        public T poll() {
            return UnicastProcessor.this.f124030c.poll();
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(UnicastProcessor.this.f124039l, j10);
                UnicastProcessor.this.Y8();
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.f124040m = true;
            return 2;
        }
    }

    UnicastProcessor(int i10) {
        this(i10, null, true);
    }

    UnicastProcessor(int i10, Runnable runnable) {
        this(i10, runnable, true);
    }

    UnicastProcessor(int i10, Runnable runnable, boolean z10) {
        this.f124030c = new io.reactivex.internal.queue.a<>(io.reactivex.internal.functions.a.h(i10, "capacityHint"));
        this.f124031d = new AtomicReference<>(runnable);
        this.f124032e = z10;
        this.f124035h = new AtomicReference<>();
        this.f124037j = new AtomicBoolean();
        this.f124038k = new UnicastQueueSubscription();
        this.f124039l = new AtomicLong();
    }

    @e
    @c
    public static <T> UnicastProcessor<T> S8() {
        return new UnicastProcessor<>(j.Y());
    }

    @e
    @c
    public static <T> UnicastProcessor<T> T8(int i10) {
        return new UnicastProcessor<>(i10);
    }

    @e
    @c
    public static <T> UnicastProcessor<T> U8(int i10, Runnable runnable) {
        io.reactivex.internal.functions.a.g(runnable, "onTerminate");
        return new UnicastProcessor<>(i10, runnable);
    }

    @e
    @c
    public static <T> UnicastProcessor<T> V8(int i10, Runnable runnable, boolean z10) {
        io.reactivex.internal.functions.a.g(runnable, "onTerminate");
        return new UnicastProcessor<>(i10, runnable, z10);
    }

    @e
    @c
    public static <T> UnicastProcessor<T> W8(boolean z10) {
        return new UnicastProcessor<>(j.Y(), null, z10);
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable M8() {
        if (this.f124033f) {
            return this.f124034g;
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean N8() {
        return this.f124033f && this.f124034g == null;
    }

    @Override // io.reactivex.processors.a
    public boolean O8() {
        return this.f124035h.get() != null;
    }

    @Override // io.reactivex.processors.a
    public boolean P8() {
        return this.f124033f && this.f124034g != null;
    }

    boolean R8(boolean z10, boolean z11, boolean z12, d<? super T> dVar, io.reactivex.internal.queue.a<T> aVar) {
        if (this.f124036i) {
            aVar.clear();
            this.f124035h.lazySet(null);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (z10 && this.f124034g != null) {
            aVar.clear();
            this.f124035h.lazySet(null);
            dVar.onError(this.f124034g);
            return true;
        }
        if (!z12) {
            return false;
        }
        Throwable th2 = this.f124034g;
        this.f124035h.lazySet(null);
        if (th2 != null) {
            dVar.onError(th2);
        } else {
            dVar.onComplete();
        }
        return true;
    }

    void X8() {
        Runnable andSet = this.f124031d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    void Y8() {
        if (this.f124038k.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        d<? super T> dVar = this.f124035h.get();
        while (dVar == null) {
            iAddAndGet = this.f124038k.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                dVar = this.f124035h.get();
            }
        }
        if (this.f124040m) {
            Z8(dVar);
        } else {
            a9(dVar);
        }
    }

    void Z8(d<? super T> dVar) {
        io.reactivex.internal.queue.a<T> aVar = this.f124030c;
        int iAddAndGet = 1;
        boolean z10 = !this.f124032e;
        while (!this.f124036i) {
            boolean z11 = this.f124033f;
            if (z10 && z11 && this.f124034g != null) {
                aVar.clear();
                this.f124035h.lazySet(null);
                dVar.onError(this.f124034g);
                return;
            }
            dVar.onNext(null);
            if (z11) {
                this.f124035h.lazySet(null);
                Throwable th2 = this.f124034g;
                if (th2 != null) {
                    dVar.onError(th2);
                    return;
                } else {
                    dVar.onComplete();
                    return;
                }
            }
            iAddAndGet = this.f124038k.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        aVar.clear();
        this.f124035h.lazySet(null);
    }

    void a9(d<? super T> dVar) {
        long j10;
        io.reactivex.internal.queue.a<T> aVar = this.f124030c;
        boolean z10 = true;
        boolean z11 = !this.f124032e;
        int iAddAndGet = 1;
        while (true) {
            long j11 = this.f124039l.get();
            long j12 = 0;
            while (true) {
                if (j11 == j12) {
                    j10 = j12;
                    break;
                }
                boolean z12 = this.f124033f;
                T tPoll = aVar.poll();
                boolean z13 = tPoll == null ? z10 : false;
                j10 = j12;
                if (R8(z11, z12, z13, dVar, aVar)) {
                    return;
                }
                if (z13) {
                    break;
                }
                dVar.onNext(tPoll);
                j12 = 1 + j10;
                z10 = true;
            }
            if (j11 == j12 && R8(z11, this.f124033f, aVar.isEmpty(), dVar, aVar)) {
                return;
            }
            if (j10 != 0 && j11 != Long.MAX_VALUE) {
                this.f124039l.addAndGet(-j10);
            }
            iAddAndGet = this.f124038k.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                z10 = true;
            }
        }
    }

    @Override // io.reactivex.j
    protected void k6(d<? super T> dVar) {
        if (this.f124037j.get() || !this.f124037j.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), dVar);
            return;
        }
        dVar.onSubscribe(this.f124038k);
        this.f124035h.set(dVar);
        if (this.f124036i) {
            this.f124035h.lazySet(null);
        } else {
            Y8();
        }
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (this.f124033f || this.f124036i) {
            return;
        }
        this.f124033f = true;
        X8();
        Y8();
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124033f || this.f124036i) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124034g = th2;
        this.f124033f = true;
        X8();
        Y8();
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124033f || this.f124036i) {
            return;
        }
        this.f124030c.offer(t10);
        Y8();
    }

    @Override // org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (this.f124033f || this.f124036i) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }
}

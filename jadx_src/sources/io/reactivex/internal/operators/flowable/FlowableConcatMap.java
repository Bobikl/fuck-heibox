package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMap<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f120002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final ErrorMode f120004f;

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements io.reactivex.o<T>, b<R>, org.reactivestreams.e {
        private static final long serialVersionUID = -3511336836796789179L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f120006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f120007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.e f120009f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f120010g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        lh.o<T> f120011h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f120012i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f120013j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f120015l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f120016m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ConcatMapInner<R> f120005b = new ConcatMapInner<>(this);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicThrowable f120014k = new AtomicThrowable();

        BaseConcatMapSubscriber(kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10) {
            this.f120006c = oVar;
            this.f120007d = i10;
            this.f120008e = i10 - (i10 >> 2);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public final void b() {
            this.f120015l = false;
            d();
        }

        abstract void d();

        abstract void e();

        @Override // org.reactivestreams.d
        public final void onComplete() {
            this.f120012i = true;
            d();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t10) {
            if (this.f120016m == 2 || this.f120011h.offer(t10)) {
                d();
            } else {
                this.f120009f.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public final void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120009f, eVar)) {
                this.f120009f = eVar;
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f120016m = iRequestFusion;
                        this.f120011h = lVar;
                        this.f120012i = true;
                        e();
                        d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f120016m = iRequestFusion;
                        this.f120011h = lVar;
                        e();
                        eVar.request(this.f120007d);
                        return;
                    }
                }
                this.f120011h = new SpscArrayQueue(this.f120007d);
                e();
                eVar.request(this.f120007d);
            }
        }
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120017n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final boolean f120018o;

        ConcatMapDelayed(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, boolean z10) {
            super(oVar, i10);
            this.f120017n = dVar;
            this.f120018o = z10;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void a(Throwable th2) {
            if (!this.f120014k.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f120018o) {
                this.f120009f.cancel();
                this.f120012i = true;
            }
            this.f120015l = false;
            d();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void c(R r10) {
            this.f120017n.onNext(r10);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120013j) {
                return;
            }
            this.f120013j = true;
            this.f120005b.cancel();
            this.f120009f.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void d() {
            if (getAndIncrement() == 0) {
                while (!this.f120013j) {
                    if (!this.f120015l) {
                        boolean z10 = this.f120012i;
                        if (z10 && !this.f120018o && this.f120014k.get() != null) {
                            this.f120017n.onError(this.f120014k.c());
                            return;
                        }
                        try {
                            T tPoll = this.f120011h.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                Throwable thC = this.f120014k.c();
                                if (thC != null) {
                                    this.f120017n.onError(thC);
                                    return;
                                } else {
                                    this.f120017n.onComplete();
                                    return;
                                }
                            }
                            if (!z11) {
                                try {
                                    org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120006c.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.f120016m != 1) {
                                        int i10 = this.f120010g + 1;
                                        if (i10 == this.f120008e) {
                                            this.f120010g = 0;
                                            this.f120009f.request(i10);
                                        } else {
                                            this.f120010g = i10;
                                        }
                                    }
                                    if (cVar instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) cVar).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.f120005b.f()) {
                                                this.f120017n.onNext(objCall);
                                            } else {
                                                this.f120015l = true;
                                                ConcatMapInner<R> concatMapInner = this.f120005b;
                                                concatMapInner.h(new c(objCall, concatMapInner));
                                            }
                                        } catch (Throwable th2) {
                                            io.reactivex.exceptions.a.b(th2);
                                            this.f120009f.cancel();
                                            this.f120014k.a(th2);
                                            this.f120017n.onError(this.f120014k.c());
                                            return;
                                        }
                                    } else {
                                        this.f120015l = true;
                                        cVar.g(this.f120005b);
                                    }
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.a.b(th3);
                                    this.f120009f.cancel();
                                    this.f120014k.a(th3);
                                    this.f120017n.onError(this.f120014k.c());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            io.reactivex.exceptions.a.b(th4);
                            this.f120009f.cancel();
                            this.f120014k.a(th4);
                            this.f120017n.onError(this.f120014k.c());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void e() {
            this.f120017n.onSubscribe(this);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f120014k.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120012i = true;
                d();
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120005b.request(j10);
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120019n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final AtomicInteger f120020o;

        ConcatMapImmediate(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10) {
            super(oVar, i10);
            this.f120019n = dVar;
            this.f120020o = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void a(Throwable th2) {
            if (!this.f120014k.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120009f.cancel();
            if (getAndIncrement() == 0) {
                this.f120019n.onError(this.f120014k.c());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void c(R r10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f120019n.onNext(r10);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.f120019n.onError(this.f120014k.c());
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120013j) {
                return;
            }
            this.f120013j = true;
            this.f120005b.cancel();
            this.f120009f.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void d() {
            if (this.f120020o.getAndIncrement() == 0) {
                while (!this.f120013j) {
                    if (!this.f120015l) {
                        boolean z10 = this.f120012i;
                        try {
                            T tPoll = this.f120011h.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                this.f120019n.onComplete();
                                return;
                            }
                            if (!z11) {
                                try {
                                    org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120006c.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.f120016m != 1) {
                                        int i10 = this.f120010g + 1;
                                        if (i10 == this.f120008e) {
                                            this.f120010g = 0;
                                            this.f120009f.request(i10);
                                        } else {
                                            this.f120010g = i10;
                                        }
                                    }
                                    if (cVar instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) cVar).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.f120005b.f()) {
                                                this.f120015l = true;
                                                ConcatMapInner<R> concatMapInner = this.f120005b;
                                                concatMapInner.h(new c(objCall, concatMapInner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f120019n.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    this.f120019n.onError(this.f120014k.c());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            io.reactivex.exceptions.a.b(th2);
                                            this.f120009f.cancel();
                                            this.f120014k.a(th2);
                                            this.f120019n.onError(this.f120014k.c());
                                            return;
                                        }
                                    } else {
                                        this.f120015l = true;
                                        cVar.g(this.f120005b);
                                    }
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.a.b(th3);
                                    this.f120009f.cancel();
                                    this.f120014k.a(th3);
                                    this.f120019n.onError(this.f120014k.c());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            io.reactivex.exceptions.a.b(th4);
                            this.f120009f.cancel();
                            this.f120014k.a(th4);
                            this.f120019n.onError(this.f120014k.c());
                            return;
                        }
                    }
                    if (this.f120020o.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void e() {
            this.f120019n.onSubscribe(this);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f120014k.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120005b.cancel();
            if (getAndIncrement() == 0) {
                this.f120019n.onError(this.f120014k.c());
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120005b.request(j10);
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements io.reactivex.o<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final b<R> f120021j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f120022k;

        ConcatMapInner(b<R> bVar) {
            super(false);
            this.f120021j = bVar;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            long j10 = this.f120022k;
            if (j10 != 0) {
                this.f120022k = 0L;
                g(j10);
            }
            this.f120021j.b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            long j10 = this.f120022k;
            if (j10 != 0) {
                this.f120022k = 0L;
                g(j10);
            }
            this.f120021j.a(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(R r10) {
            this.f120022k++;
            this.f120021j.c(r10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            h(eVar);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f120023a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f120023a = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120023a[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b<T> {
        void a(Throwable th2);

        void b();

        void c(T t10);
    }

    public static final class c<T> implements org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f120025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f120026d;

        c(T t10, org.reactivestreams.d<? super T> dVar) {
            this.f120025c = t10;
            this.f120024b = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (j10 <= 0 || this.f120026d) {
                return;
            }
            this.f120026d = true;
            org.reactivestreams.d<? super T> dVar = this.f120024b;
            dVar.onNext(this.f120025c);
            dVar.onComplete();
        }
    }

    public FlowableConcatMap(io.reactivex.j<T> jVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, ErrorMode errorMode) {
        super(jVar);
        this.f120002d = oVar;
        this.f120003e = i10;
        this.f120004f = errorMode;
    }

    public static <T, R> org.reactivestreams.d<T> M8(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, ErrorMode errorMode) {
        int i11 = a.f120023a[errorMode.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? new ConcatMapImmediate(dVar, oVar, i10) : new ConcatMapDelayed(dVar, oVar, i10, true);
        }
        return new ConcatMapDelayed(dVar, oVar, i10, false);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        if (v0.b(this.f121039c, dVar, this.f120002d)) {
            return;
        }
        this.f121039c.g(M8(dVar, this.f120002d, this.f120003e, this.f120004f));
    }
}

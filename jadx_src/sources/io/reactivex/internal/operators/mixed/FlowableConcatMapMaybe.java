package io.reactivex.internal.operators.mixed;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.j;
import io.reactivex.t;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import lh.n;
import org.reactivestreams.d;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapMaybe<T, R> extends j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j<T> f121752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final o<? super T, ? extends w<? extends R>> f121753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ErrorMode f121754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f121755f;

    public static final class ConcatMapMaybeSubscriber<T, R> extends AtomicInteger implements io.reactivex.o<T>, e {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final int f121756q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final int f121757r = 1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f121758s = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<? super R> f121759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends w<? extends R>> f121760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f121761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f121762e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicThrowable f121763f = new AtomicThrowable();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ConcatMapMaybeObserver<R> f121764g = new ConcatMapMaybeObserver<>(this);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final n<T> f121765h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final ErrorMode f121766i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e f121767j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f121768k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f121769l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f121770m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f121771n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        R f121772o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        volatile int f121773p;

        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements t<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final ConcatMapMaybeSubscriber<?, R> f121774b;

            ConcatMapMaybeObserver(ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber) {
                this.f121774b = concatMapMaybeSubscriber;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f121774b.b();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f121774b.c(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(R r10) {
                this.f121774b.d(r10);
            }
        }

        ConcatMapMaybeSubscriber(d<? super R> dVar, o<? super T, ? extends w<? extends R>> oVar, int i10, ErrorMode errorMode) {
            this.f121759b = dVar;
            this.f121760c = oVar;
            this.f121761d = i10;
            this.f121766i = errorMode;
            this.f121765h = new SpscArrayQueue(i10);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            d<? super R> dVar = this.f121759b;
            ErrorMode errorMode = this.f121766i;
            n<T> nVar = this.f121765h;
            AtomicThrowable atomicThrowable = this.f121763f;
            AtomicLong atomicLong = this.f121762e;
            int i10 = this.f121761d;
            int i11 = i10 - (i10 >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.f121769l) {
                    int i12 = this.f121773p;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i12 == 0))) {
                        break;
                    }
                    if (i12 == 0) {
                        boolean z10 = this.f121768k;
                        T tPoll = nVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            Throwable thC = atomicThrowable.c();
                            if (thC == null) {
                                dVar.onComplete();
                                return;
                            } else {
                                dVar.onError(thC);
                                return;
                            }
                        }
                        if (!z11) {
                            int i13 = this.f121771n + 1;
                            if (i13 == i11) {
                                this.f121771n = 0;
                                this.f121767j.request(i11);
                            } else {
                                this.f121771n = i13;
                            }
                            try {
                                w wVar = (w) io.reactivex.internal.functions.a.g(this.f121760c.apply(tPoll), "The mapper returned a null MaybeSource");
                                this.f121773p = 1;
                                wVar.f(this.f121764g);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                this.f121767j.cancel();
                                nVar.clear();
                                atomicThrowable.a(th2);
                                dVar.onError(atomicThrowable.c());
                                return;
                            }
                        }
                    } else if (i12 == 2) {
                        long j10 = this.f121770m;
                        if (j10 != atomicLong.get()) {
                            R r10 = this.f121772o;
                            this.f121772o = null;
                            dVar.onNext(r10);
                            this.f121770m = j10 + 1;
                            this.f121773p = 0;
                        }
                    }
                } else {
                    nVar.clear();
                    this.f121772o = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            nVar.clear();
            this.f121772o = null;
            dVar.onError(atomicThrowable.c());
        }

        void b() {
            this.f121773p = 0;
            a();
        }

        void c(Throwable th2) {
            if (!this.f121763f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121766i != ErrorMode.END) {
                this.f121767j.cancel();
            }
            this.f121773p = 0;
            a();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121769l = true;
            this.f121767j.cancel();
            this.f121764g.a();
            if (getAndIncrement() == 0) {
                this.f121765h.clear();
                this.f121772o = null;
            }
        }

        void d(R r10) {
            this.f121772o = r10;
            this.f121773p = 2;
            a();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121768k = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f121763f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121766i == ErrorMode.IMMEDIATE) {
                this.f121764g.a();
            }
            this.f121768k = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121765h.offer(t10)) {
                a();
            } else {
                this.f121767j.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(e eVar) {
            if (SubscriptionHelper.validate(this.f121767j, eVar)) {
                this.f121767j = eVar;
                this.f121759b.onSubscribe(this);
                eVar.request(this.f121761d);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            io.reactivex.internal.util.b.a(this.f121762e, j10);
            a();
        }
    }

    public FlowableConcatMapMaybe(j<T> jVar, o<? super T, ? extends w<? extends R>> oVar, ErrorMode errorMode, int i10) {
        this.f121752c = jVar;
        this.f121753d = oVar;
        this.f121754e = errorMode;
        this.f121755f = i10;
    }

    @Override // io.reactivex.j
    protected void k6(d<? super R> dVar) {
        this.f121752c.j6(new ConcatMapMaybeSubscriber(dVar, this.f121753d, this.f121755f, this.f121754e));
    }
}

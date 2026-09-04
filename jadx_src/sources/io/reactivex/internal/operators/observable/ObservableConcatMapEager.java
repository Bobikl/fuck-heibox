package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatMapEager<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.e0<? extends R>> f122068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ErrorMode f122069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f122070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f122071f;

    public static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b, io.reactivex.internal.observers.j<R> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<? extends R>> f122073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f122074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f122075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ErrorMode f122076f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicThrowable f122077g = new AtomicThrowable();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final ArrayDeque<InnerQueuedObserver<R>> f122078h = new ArrayDeque<>();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        lh.o<T> f122079i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        io.reactivex.disposables.b f122080j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f122081k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122082l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile boolean f122083m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        InnerQueuedObserver<R> f122084n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f122085o;

        ConcatMapEagerMainObserver(io.reactivex.g0<? super R> g0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends R>> oVar, int i10, int i11, ErrorMode errorMode) {
            this.f122072b = g0Var;
            this.f122073c = oVar;
            this.f122074d = i10;
            this.f122075e = i11;
            this.f122076f = errorMode;
        }

        void a() {
            InnerQueuedObserver<R> innerQueuedObserver = this.f122084n;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                InnerQueuedObserver<R> innerQueuedObserverPoll = this.f122078h.poll();
                if (innerQueuedObserverPoll == null) {
                    return;
                } else {
                    innerQueuedObserverPoll.dispose();
                }
            }
        }

        @Override // io.reactivex.internal.observers.j
        public void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            lh.o<T> oVar = this.f122079i;
            ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.f122078h;
            io.reactivex.g0<? super R> g0Var = this.f122072b;
            ErrorMode errorMode = this.f122076f;
            int iAddAndGet = 1;
            while (true) {
                int i10 = this.f122085o;
                while (i10 != this.f122074d) {
                    if (this.f122083m) {
                        oVar.clear();
                        a();
                        return;
                    }
                    if (errorMode == ErrorMode.IMMEDIATE && this.f122077g.get() != null) {
                        oVar.clear();
                        a();
                        g0Var.onError(this.f122077g.c());
                        return;
                    }
                    try {
                        T tPoll = oVar.poll();
                        if (tPoll == null) {
                            break;
                        }
                        io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122073c.apply(tPoll), "The mapper returned a null ObservableSource");
                        InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.f122075e);
                        arrayDeque.offer(innerQueuedObserver);
                        e0Var.g(innerQueuedObserver);
                        i10++;
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f122080j.dispose();
                        oVar.clear();
                        a();
                        this.f122077g.a(th2);
                        g0Var.onError(this.f122077g.c());
                        return;
                    }
                }
                this.f122085o = i10;
                if (this.f122083m) {
                    oVar.clear();
                    a();
                    return;
                }
                if (errorMode == ErrorMode.IMMEDIATE && this.f122077g.get() != null) {
                    oVar.clear();
                    a();
                    g0Var.onError(this.f122077g.c());
                    return;
                }
                InnerQueuedObserver<R> innerQueuedObserver2 = this.f122084n;
                if (innerQueuedObserver2 == null) {
                    if (errorMode == ErrorMode.BOUNDARY && this.f122077g.get() != null) {
                        oVar.clear();
                        a();
                        g0Var.onError(this.f122077g.c());
                        return;
                    }
                    boolean z10 = this.f122081k;
                    InnerQueuedObserver<R> innerQueuedObserverPoll = arrayDeque.poll();
                    boolean z11 = innerQueuedObserverPoll == null;
                    if (z10 && z11) {
                        if (this.f122077g.get() == null) {
                            g0Var.onComplete();
                            return;
                        }
                        oVar.clear();
                        a();
                        g0Var.onError(this.f122077g.c());
                        return;
                    }
                    if (!z11) {
                        this.f122084n = innerQueuedObserverPoll;
                    }
                    innerQueuedObserver2 = innerQueuedObserverPoll;
                }
                if (innerQueuedObserver2 != null) {
                    lh.o<R> oVarC = innerQueuedObserver2.c();
                    while (true) {
                        if (this.f122083m) {
                            oVar.clear();
                            a();
                            return;
                        }
                        boolean zB = innerQueuedObserver2.b();
                        if (errorMode == ErrorMode.IMMEDIATE && this.f122077g.get() != null) {
                            oVar.clear();
                            a();
                            g0Var.onError(this.f122077g.c());
                            return;
                        }
                        try {
                            R rPoll = oVarC.poll();
                            boolean z12 = rPoll == null;
                            if (zB && z12) {
                                this.f122084n = null;
                                this.f122085o--;
                            } else if (!z12) {
                                g0Var.onNext(rPoll);
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            this.f122077g.a(th3);
                            this.f122084n = null;
                            this.f122085o--;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.observers.j
        public void c(InnerQueuedObserver<R> innerQueuedObserver, Throwable th2) {
            if (!this.f122077g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f122076f == ErrorMode.IMMEDIATE) {
                this.f122080j.dispose();
            }
            innerQueuedObserver.d();
            b();
        }

        @Override // io.reactivex.internal.observers.j
        public void d(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.d();
            b();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122083m) {
                return;
            }
            this.f122083m = true;
            this.f122080j.dispose();
            g();
        }

        @Override // io.reactivex.internal.observers.j
        public void f(InnerQueuedObserver<R> innerQueuedObserver, R r10) {
            innerQueuedObserver.c().offer(r10);
            b();
        }

        void g() {
            if (getAndIncrement() == 0) {
                do {
                    this.f122079i.clear();
                    a();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122083m;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122081k = true;
            b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f122077g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122081k = true;
                b();
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122082l == 0) {
                this.f122079i.offer(t10);
            }
            b();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122080j, bVar)) {
                this.f122080j = bVar;
                if (bVar instanceof lh.j) {
                    lh.j jVar = (lh.j) bVar;
                    int iRequestFusion = jVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f122082l = iRequestFusion;
                        this.f122079i = jVar;
                        this.f122081k = true;
                        this.f122072b.onSubscribe(this);
                        b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f122082l = iRequestFusion;
                        this.f122079i = jVar;
                        this.f122072b.onSubscribe(this);
                        return;
                    }
                }
                this.f122079i = new io.reactivex.internal.queue.a(this.f122075e);
                this.f122072b.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapEager(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends R>> oVar, ErrorMode errorMode, int i10, int i11) {
        super(e0Var);
        this.f122068c = oVar;
        this.f122069d = errorMode;
        this.f122070e = i10;
        this.f122071f = i11;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super R> g0Var) {
        this.f122785b.g(new ConcatMapEagerMainObserver(g0Var, this.f122068c, this.f122070e, this.f122071f, this.f122069d));
    }
}

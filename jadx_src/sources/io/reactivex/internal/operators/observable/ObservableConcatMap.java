package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatMap<T, U> extends a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.e0<? extends U>> f122039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f122040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ErrorMode f122041e;

    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -6951100001833242599L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<? extends R>> f122043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f122044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f122045e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final DelayErrorInnerObserver<R> f122046f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f122047g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        lh.o<T> f122048h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.b f122049i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f122050j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f122051k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f122052l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122053m;

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final io.reactivex.g0<? super R> f122054b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final ConcatMapDelayErrorObserver<?, R> f122055c;

            DelayErrorInnerObserver(io.reactivex.g0<? super R> g0Var, ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.f122054b = g0Var;
                this.f122055c = concatMapDelayErrorObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.g0
            public void onComplete() {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.f122055c;
                concatMapDelayErrorObserver.f122050j = false;
                concatMapDelayErrorObserver.a();
            }

            @Override // io.reactivex.g0
            public void onError(Throwable th2) {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.f122055c;
                if (!concatMapDelayErrorObserver.f122045e.a(th2)) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                }
                if (!concatMapDelayErrorObserver.f122047g) {
                    concatMapDelayErrorObserver.f122049i.dispose();
                }
                concatMapDelayErrorObserver.f122050j = false;
                concatMapDelayErrorObserver.a();
            }

            @Override // io.reactivex.g0
            public void onNext(R r10) {
                this.f122054b.onNext(r10);
            }

            @Override // io.reactivex.g0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        ConcatMapDelayErrorObserver(io.reactivex.g0<? super R> g0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends R>> oVar, int i10, boolean z10) {
            this.f122042b = g0Var;
            this.f122043c = oVar;
            this.f122044d = i10;
            this.f122047g = z10;
            this.f122046f = new DelayErrorInnerObserver<>(g0Var, this);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.g0<? super R> g0Var = this.f122042b;
            lh.o<T> oVar = this.f122048h;
            AtomicThrowable atomicThrowable = this.f122045e;
            while (true) {
                if (!this.f122050j) {
                    if (this.f122052l) {
                        oVar.clear();
                        return;
                    }
                    if (!this.f122047g && atomicThrowable.get() != null) {
                        oVar.clear();
                        this.f122052l = true;
                        g0Var.onError(atomicThrowable.c());
                        return;
                    }
                    boolean z10 = this.f122051k;
                    try {
                        T tPoll = oVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.f122052l = true;
                            Throwable thC = atomicThrowable.c();
                            if (thC != null) {
                                g0Var.onError(thC);
                                return;
                            } else {
                                g0Var.onComplete();
                                return;
                            }
                        }
                        if (!z11) {
                            try {
                                io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122043c.apply(tPoll), "The mapper returned a null ObservableSource");
                                if (e0Var instanceof Callable) {
                                    try {
                                        a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) ((Callable) e0Var).call();
                                        if (aVar != null && !this.f122052l) {
                                            g0Var.onNext(aVar);
                                        }
                                    } catch (Throwable th2) {
                                        io.reactivex.exceptions.a.b(th2);
                                        atomicThrowable.a(th2);
                                    }
                                } else {
                                    this.f122050j = true;
                                    e0Var.g(this.f122046f);
                                }
                            } catch (Throwable th3) {
                                io.reactivex.exceptions.a.b(th3);
                                this.f122052l = true;
                                this.f122049i.dispose();
                                oVar.clear();
                                atomicThrowable.a(th3);
                                g0Var.onError(atomicThrowable.c());
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        io.reactivex.exceptions.a.b(th4);
                        this.f122052l = true;
                        this.f122049i.dispose();
                        atomicThrowable.a(th4);
                        g0Var.onError(atomicThrowable.c());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122052l = true;
            this.f122049i.dispose();
            this.f122046f.a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122052l;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122051k = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f122045e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122051k = true;
                a();
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122053m == 0) {
                this.f122048h.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122049i, bVar)) {
                this.f122049i = bVar;
                if (bVar instanceof lh.j) {
                    lh.j jVar = (lh.j) bVar;
                    int iRequestFusion = jVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f122053m = iRequestFusion;
                        this.f122048h = jVar;
                        this.f122051k = true;
                        this.f122042b.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f122053m = iRequestFusion;
                        this.f122048h = jVar;
                        this.f122042b.onSubscribe(this);
                        return;
                    }
                }
                this.f122048h = new io.reactivex.internal.queue.a(this.f122044d);
                this.f122042b.onSubscribe(this);
            }
        }
    }

    public static final class SourceObserver<T, U> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8828587559905699186L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super U> f122056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<? extends U>> f122057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final InnerObserver<U> f122058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f122059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        lh.o<T> f122060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f122061g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122062h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f122063i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f122064j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f122065k;

        public static final class InnerObserver<U> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final io.reactivex.g0<? super U> f122066b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final SourceObserver<?, ?> f122067c;

            InnerObserver(io.reactivex.g0<? super U> g0Var, SourceObserver<?, ?> sourceObserver) {
                this.f122066b = g0Var;
                this.f122067c = sourceObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.g0
            public void onComplete() {
                this.f122067c.b();
            }

            @Override // io.reactivex.g0
            public void onError(Throwable th2) {
                this.f122067c.dispose();
                this.f122066b.onError(th2);
            }

            @Override // io.reactivex.g0
            public void onNext(U u10) {
                this.f122066b.onNext(u10);
            }

            @Override // io.reactivex.g0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        SourceObserver(io.reactivex.g0<? super U> g0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends U>> oVar, int i10) {
            this.f122056b = g0Var;
            this.f122057c = oVar;
            this.f122059e = i10;
            this.f122058d = new InnerObserver<>(g0Var, this);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f122063i) {
                if (!this.f122062h) {
                    boolean z10 = this.f122064j;
                    try {
                        T tPoll = this.f122060f.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.f122063i = true;
                            this.f122056b.onComplete();
                            return;
                        } else if (!z11) {
                            try {
                                io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122057c.apply(tPoll), "The mapper returned a null ObservableSource");
                                this.f122062h = true;
                                e0Var.g(this.f122058d);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                dispose();
                                this.f122060f.clear();
                                this.f122056b.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        dispose();
                        this.f122060f.clear();
                        this.f122056b.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f122060f.clear();
        }

        void b() {
            this.f122062h = false;
            a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122063i = true;
            this.f122058d.a();
            this.f122061g.dispose();
            if (getAndIncrement() == 0) {
                this.f122060f.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122063i;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122064j) {
                return;
            }
            this.f122064j = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122064j) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122064j = true;
            dispose();
            this.f122056b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122064j) {
                return;
            }
            if (this.f122065k == 0) {
                this.f122060f.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122061g, bVar)) {
                this.f122061g = bVar;
                if (bVar instanceof lh.j) {
                    lh.j jVar = (lh.j) bVar;
                    int iRequestFusion = jVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f122065k = iRequestFusion;
                        this.f122060f = jVar;
                        this.f122064j = true;
                        this.f122056b.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f122065k = iRequestFusion;
                        this.f122060f = jVar;
                        this.f122056b.onSubscribe(this);
                        return;
                    }
                }
                this.f122060f = new io.reactivex.internal.queue.a(this.f122059e);
                this.f122056b.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMap(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends U>> oVar, int i10, ErrorMode errorMode) {
        super(e0Var);
        this.f122039c = oVar;
        this.f122041e = errorMode;
        this.f122040d = Math.max(8, i10);
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super U> g0Var) {
        if (ObservableScalarXMap.b(this.f122785b, g0Var, this.f122039c)) {
            return;
        }
        if (this.f122041e == ErrorMode.IMMEDIATE) {
            this.f122785b.g(new SourceObserver(new io.reactivex.observers.l(g0Var), this.f122039c, this.f122040d));
        } else {
            this.f122785b.g(new ConcatMapDelayErrorObserver(g0Var, this.f122039c, this.f122040d, this.f122041e == ErrorMode.END));
        }
    }
}

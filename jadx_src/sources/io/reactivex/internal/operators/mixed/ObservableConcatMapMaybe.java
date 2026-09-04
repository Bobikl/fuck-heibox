package io.reactivex.internal.operators.mixed;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.t;
import io.reactivex.w;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import lh.n;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapMaybe<T, R> extends z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final z<T> f121868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o<? super T, ? extends w<? extends R>> f121869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ErrorMode f121870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f121871e;

    public static final class ConcatMapMaybeMainObserver<T, R> extends AtomicInteger implements g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f121872m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f121873n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final int f121874o = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super R> f121875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends w<? extends R>> f121876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicThrowable f121877d = new AtomicThrowable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ConcatMapMaybeObserver<R> f121878e = new ConcatMapMaybeObserver<>(this);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final n<T> f121879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ErrorMode f121880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.b f121881h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f121882i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f121883j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        R f121884k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile int f121885l;

        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements t<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final ConcatMapMaybeMainObserver<?, R> f121886b;

            ConcatMapMaybeObserver(ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver) {
                this.f121886b = concatMapMaybeMainObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f121886b.b();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f121886b.c(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(R r10) {
                this.f121886b.d(r10);
            }
        }

        ConcatMapMaybeMainObserver(g0<? super R> g0Var, o<? super T, ? extends w<? extends R>> oVar, int i10, ErrorMode errorMode) {
            this.f121875b = g0Var;
            this.f121876c = oVar;
            this.f121880g = errorMode;
            this.f121879f = new io.reactivex.internal.queue.a(i10);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            g0<? super R> g0Var = this.f121875b;
            ErrorMode errorMode = this.f121880g;
            n<T> nVar = this.f121879f;
            AtomicThrowable atomicThrowable = this.f121877d;
            int iAddAndGet = 1;
            while (true) {
                if (!this.f121883j) {
                    int i10 = this.f121885l;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i10 == 0))) {
                        break;
                    }
                    if (i10 == 0) {
                        boolean z10 = this.f121882i;
                        T tPoll = nVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            Throwable thC = atomicThrowable.c();
                            if (thC == null) {
                                g0Var.onComplete();
                                return;
                            } else {
                                g0Var.onError(thC);
                                return;
                            }
                        }
                        if (!z11) {
                            try {
                                w wVar = (w) io.reactivex.internal.functions.a.g(this.f121876c.apply(tPoll), "The mapper returned a null MaybeSource");
                                this.f121885l = 1;
                                wVar.f(this.f121878e);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                this.f121881h.dispose();
                                nVar.clear();
                                atomicThrowable.a(th2);
                                g0Var.onError(atomicThrowable.c());
                                return;
                            }
                        }
                    } else if (i10 == 2) {
                        R r10 = this.f121884k;
                        this.f121884k = null;
                        g0Var.onNext(r10);
                        this.f121885l = 0;
                    }
                } else {
                    nVar.clear();
                    this.f121884k = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            nVar.clear();
            this.f121884k = null;
            g0Var.onError(atomicThrowable.c());
        }

        void b() {
            this.f121885l = 0;
            a();
        }

        void c(Throwable th2) {
            if (!this.f121877d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121880g != ErrorMode.END) {
                this.f121881h.dispose();
            }
            this.f121885l = 0;
            a();
        }

        void d(R r10) {
            this.f121884k = r10;
            this.f121885l = 2;
            a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121883j = true;
            this.f121881h.dispose();
            this.f121878e.a();
            if (getAndIncrement() == 0) {
                this.f121879f.clear();
                this.f121884k = null;
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121883j;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f121882i = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f121877d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121880g == ErrorMode.IMMEDIATE) {
                this.f121878e.a();
            }
            this.f121882i = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f121879f.offer(t10);
            a();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121881h, bVar)) {
                this.f121881h = bVar;
                this.f121875b.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapMaybe(z<T> zVar, o<? super T, ? extends w<? extends R>> oVar, ErrorMode errorMode, int i10) {
        this.f121868b = zVar;
        this.f121869c = oVar;
        this.f121870d = errorMode;
        this.f121871e = i10;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super R> g0Var) {
        if (b.b(this.f121868b, this.f121869c, g0Var)) {
            return;
        }
        this.f121868b.g(new ConcatMapMaybeMainObserver(g0Var, this.f121869c, this.f121871e, this.f121870d));
    }
}

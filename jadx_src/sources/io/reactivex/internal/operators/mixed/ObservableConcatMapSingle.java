package io.reactivex.internal.operators.mixed;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.l0;
import io.reactivex.o0;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import lh.n;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapSingle<T, R> extends z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final z<T> f121887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o<? super T, ? extends o0<? extends R>> f121888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ErrorMode f121889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f121890e;

    public static final class ConcatMapSingleMainObserver<T, R> extends AtomicInteger implements g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f121891m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f121892n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final int f121893o = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super R> f121894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends o0<? extends R>> f121895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicThrowable f121896d = new AtomicThrowable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ConcatMapSingleObserver<R> f121897e = new ConcatMapSingleObserver<>(this);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final n<T> f121898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ErrorMode f121899g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.b f121900h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f121901i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f121902j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        R f121903k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile int f121904l;

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements l0<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final ConcatMapSingleMainObserver<?, R> f121905b;

            ConcatMapSingleObserver(ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver) {
                this.f121905b = concatMapSingleMainObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                this.f121905b.b(th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(R r10) {
                this.f121905b.c(r10);
            }
        }

        ConcatMapSingleMainObserver(g0<? super R> g0Var, o<? super T, ? extends o0<? extends R>> oVar, int i10, ErrorMode errorMode) {
            this.f121894b = g0Var;
            this.f121895c = oVar;
            this.f121899g = errorMode;
            this.f121898f = new io.reactivex.internal.queue.a(i10);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            g0<? super R> g0Var = this.f121894b;
            ErrorMode errorMode = this.f121899g;
            n<T> nVar = this.f121898f;
            AtomicThrowable atomicThrowable = this.f121896d;
            int iAddAndGet = 1;
            while (true) {
                if (!this.f121902j) {
                    int i10 = this.f121904l;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i10 == 0))) {
                        break;
                    }
                    if (i10 == 0) {
                        boolean z10 = this.f121901i;
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
                                o0 o0Var = (o0) io.reactivex.internal.functions.a.g(this.f121895c.apply(tPoll), "The mapper returned a null SingleSource");
                                this.f121904l = 1;
                                o0Var.f(this.f121897e);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                this.f121900h.dispose();
                                nVar.clear();
                                atomicThrowable.a(th2);
                                g0Var.onError(atomicThrowable.c());
                                return;
                            }
                        }
                    } else if (i10 == 2) {
                        R r10 = this.f121903k;
                        this.f121903k = null;
                        g0Var.onNext(r10);
                        this.f121904l = 0;
                    }
                } else {
                    nVar.clear();
                    this.f121903k = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            nVar.clear();
            this.f121903k = null;
            g0Var.onError(atomicThrowable.c());
        }

        void b(Throwable th2) {
            if (!this.f121896d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121899g != ErrorMode.END) {
                this.f121900h.dispose();
            }
            this.f121904l = 0;
            a();
        }

        void c(R r10) {
            this.f121903k = r10;
            this.f121904l = 2;
            a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121902j = true;
            this.f121900h.dispose();
            this.f121897e.a();
            if (getAndIncrement() == 0) {
                this.f121898f.clear();
                this.f121903k = null;
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121902j;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f121901i = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f121896d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121899g == ErrorMode.IMMEDIATE) {
                this.f121897e.a();
            }
            this.f121901i = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f121898f.offer(t10);
            a();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121900h, bVar)) {
                this.f121900h = bVar;
                this.f121894b.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapSingle(z<T> zVar, o<? super T, ? extends o0<? extends R>> oVar, ErrorMode errorMode, int i10) {
        this.f121887b = zVar;
        this.f121888c = oVar;
        this.f121889d = errorMode;
        this.f121890e = i10;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super R> g0Var) {
        if (b.c(this.f121887b, this.f121888c, g0Var)) {
            return;
        }
        this.f121887b.g(new ConcatMapSingleMainObserver(g0Var, this.f121888c, this.f121890e, this.f121889d));
    }
}

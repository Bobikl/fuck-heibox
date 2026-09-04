package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableFlatMap<T, U> extends a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.e0<? extends U>> f122125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f122126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f122127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f122128f;

    public static final class InnerObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f122129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final MergeObserver<T, U> f122130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f122131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile lh.o<U> f122132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f122133f;

        InnerObserver(MergeObserver<T, U> mergeObserver, long j10) {
            this.f122129b = j10;
            this.f122130c = mergeObserver;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122131d = true;
            this.f122130c.d();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f122130c.f122143i.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            MergeObserver<T, U> mergeObserver = this.f122130c;
            if (!mergeObserver.f122138d) {
                mergeObserver.c();
            }
            this.f122131d = true;
            this.f122130c.d();
        }

        @Override // io.reactivex.g0
        public void onNext(U u10) {
            if (this.f122133f == 0) {
                this.f122130c.j(u10, this);
            } else {
                this.f122130c.d();
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar) && (bVar instanceof lh.j)) {
                lh.j jVar = (lh.j) bVar;
                int iRequestFusion = jVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f122133f = iRequestFusion;
                    this.f122132e = jVar;
                    this.f122131d = true;
                    this.f122130c.d();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f122133f = iRequestFusion;
                    this.f122132e = jVar;
                }
            }
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements io.reactivex.disposables.b, io.reactivex.g0<T> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final InnerObserver<?, ?>[] f122134r = new InnerObserver[0];

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final InnerObserver<?, ?>[] f122135s = new InnerObserver[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super U> f122136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<? extends U>> f122137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f122138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f122139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f122140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile lh.n<U> f122141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122142h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicThrowable f122143i = new AtomicThrowable();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f122144j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicReference<InnerObserver<?, ?>[]> f122145k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        io.reactivex.disposables.b f122146l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f122147m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f122148n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f122149o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Queue<io.reactivex.e0<? extends U>> f122150p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f122151q;

        MergeObserver(io.reactivex.g0<? super U> g0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends U>> oVar, boolean z10, int i10, int i11) {
            this.f122136b = g0Var;
            this.f122137c = oVar;
            this.f122138d = z10;
            this.f122139e = i10;
            this.f122140f = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f122150p = new ArrayDeque(i10);
            }
            this.f122145k = new AtomicReference<>(f122134r);
        }

        boolean a(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.f122145k.get();
                if (innerObserverArr == f122135s) {
                    innerObserver.a();
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new InnerObserver[length + 1];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
            } while (!androidx.compose.animation.core.s0.a(this.f122145k, innerObserverArr, innerObserverArr2));
            return true;
        }

        boolean b() {
            if (this.f122144j) {
                return true;
            }
            Throwable th2 = this.f122143i.get();
            if (this.f122138d || th2 == null) {
                return false;
            }
            c();
            Throwable thC = this.f122143i.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f122136b.onError(thC);
            }
            return true;
        }

        boolean c() {
            InnerObserver<?, ?>[] andSet;
            this.f122146l.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.f122145k.get();
            InnerObserver<?, ?>[] innerObserverArr2 = f122135s;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.f122145k.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.a();
            }
            return true;
        }

        void d() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            Throwable thC;
            if (this.f122144j) {
                return;
            }
            this.f122144j = true;
            if (!c() || (thC = this.f122143i.c()) == null || thC == ExceptionHelper.f123860a) {
                return;
            }
            io.reactivex.plugins.a.Y(thC);
        }

        /* JADX WARN: Code duplicated, block: B:120:0x00ea A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:85:0x00f1 A[PHI: r4
  0x00f1: PHI (r4v10 int) = (r4v8 int), (r4v11 int) binds: [B:72:0x00d0, B:84:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        void f() {
            int size;
            boolean z10;
            io.reactivex.g0<? super U> g0Var = this.f122136b;
            int iAddAndGet = 1;
            while (!b()) {
                lh.n<U> nVar = this.f122141g;
                if (nVar != null) {
                    while (!b()) {
                        U uPoll = nVar.poll();
                        if (uPoll != null) {
                            g0Var.onNext(uPoll);
                        }
                    }
                    return;
                }
                boolean z11 = this.f122142h;
                lh.n<U> nVar2 = this.f122141g;
                InnerObserver<?, ?>[] innerObserverArr = this.f122145k.get();
                int length = innerObserverArr.length;
                int i10 = 0;
                if (this.f122139e != Integer.MAX_VALUE) {
                    synchronized (this) {
                        size = this.f122150p.size();
                    }
                } else {
                    size = 0;
                }
                if (z11 && ((nVar2 == null || nVar2.isEmpty()) && length == 0 && size == 0)) {
                    Throwable thC = this.f122143i.c();
                    if (thC != ExceptionHelper.f123860a) {
                        if (thC == null) {
                            g0Var.onComplete();
                            return;
                        } else {
                            g0Var.onError(thC);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j10 = this.f122148n;
                    int i11 = this.f122149o;
                    if (length <= i11 || innerObserverArr[i11].f122129b != j10) {
                        if (length <= i11) {
                            i11 = 0;
                        }
                        for (int i12 = 0; i12 < length && innerObserverArr[i11].f122129b != j10; i12++) {
                            i11++;
                            if (i11 == length) {
                                i11 = 0;
                            }
                        }
                        this.f122149o = i11;
                        this.f122148n = innerObserverArr[i11].f122129b;
                    }
                    int i13 = 0;
                    for (int i14 = 0; i14 < length; i14++) {
                        if (b()) {
                            return;
                        }
                        InnerObserver<T, U> innerObserver = innerObserverArr[i11];
                        lh.o<U> oVar = innerObserver.f122132e;
                        if (oVar != null) {
                            do {
                                try {
                                    U uPoll2 = oVar.poll();
                                    if (uPoll2 == null) {
                                        z10 = innerObserver.f122131d;
                                        lh.o<U> oVar2 = innerObserver.f122132e;
                                        if (z10 && (oVar2 == null || oVar2.isEmpty())) {
                                            g(innerObserver);
                                            if (b()) {
                                                return;
                                            } else {
                                                i13++;
                                            }
                                        }
                                        i11++;
                                        if (i11 == length) {
                                            i11 = 0;
                                        }
                                    } else {
                                        g0Var.onNext(uPoll2);
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.a.b(th2);
                                    innerObserver.a();
                                    this.f122143i.a(th2);
                                    if (b()) {
                                        return;
                                    }
                                    g(innerObserver);
                                    i13++;
                                    i11++;
                                    if (i11 == length) {
                                    }
                                }
                            } while (!b());
                            return;
                        }
                        z10 = innerObserver.f122131d;
                        lh.o<U> oVar3 = innerObserver.f122132e;
                        if (z10) {
                            g(innerObserver);
                            if (b()) {
                                return;
                            } else {
                                i13++;
                            }
                        }
                        i11++;
                        if (i11 == length) {
                            i11 = 0;
                        }
                    }
                    this.f122149o = i11;
                    this.f122148n = innerObserverArr[i11].f122129b;
                    i10 = i13;
                }
                if (i10 == 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (this.f122139e != Integer.MAX_VALUE) {
                    while (true) {
                        int i15 = i10 - 1;
                        if (i10 != 0) {
                            synchronized (this) {
                                io.reactivex.e0<? extends U> e0VarPoll = this.f122150p.poll();
                                if (e0VarPoll == null) {
                                    this.f122151q--;
                                } else {
                                    h(e0VarPoll);
                                }
                            }
                            i10 = i15;
                        }
                    }
                } else {
                    continue;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.f122145k.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerObserverArr[i11] == innerObserver) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = f122134r;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i10);
                    System.arraycopy(innerObserverArr, i10 + 1, innerObserverArr3, i10, (length - i10) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!androidx.compose.animation.core.s0.a(this.f122145k, innerObserverArr, innerObserverArr2));
        }

        void h(io.reactivex.e0<? extends U> e0Var) {
            io.reactivex.e0<? extends U> e0VarPoll;
            while (e0Var instanceof Callable) {
                if (!k((Callable) e0Var) || this.f122139e == Integer.MAX_VALUE) {
                    return;
                }
                boolean z10 = false;
                synchronized (this) {
                    e0VarPoll = this.f122150p.poll();
                    if (e0VarPoll == null) {
                        this.f122151q--;
                        z10 = true;
                    }
                }
                if (z10) {
                    d();
                    return;
                }
                e0Var = e0VarPoll;
            }
            long j10 = this.f122147m;
            this.f122147m = 1 + j10;
            InnerObserver<T, U> innerObserver = new InnerObserver<>(this, j10);
            if (a(innerObserver)) {
                e0Var.g(innerObserver);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122144j;
        }

        void j(U u10, InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f122136b.onNext(u10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                lh.o aVar = innerObserver.f122132e;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.queue.a(this.f122140f);
                    innerObserver.f122132e = aVar;
                }
                aVar.offer(u10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            f();
        }

        boolean k(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f122136b.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    lh.n<U> aVar = this.f122141g;
                    if (aVar == null) {
                        aVar = this.f122139e == Integer.MAX_VALUE ? new io.reactivex.internal.queue.a<>(this.f122140f) : new SpscArrayQueue<>(this.f122139e);
                        this.f122141g = aVar;
                    }
                    if (!aVar.offer(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                f();
                return true;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122143i.a(th2);
                d();
                return true;
            }
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122142h) {
                return;
            }
            this.f122142h = true;
            d();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122142h) {
                io.reactivex.plugins.a.Y(th2);
            } else if (!this.f122143i.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122142h = true;
                d();
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122142h) {
                return;
            }
            try {
                io.reactivex.e0<? extends U> e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122137c.apply(t10), "The mapper returned a null ObservableSource");
                if (this.f122139e != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i10 = this.f122151q;
                        if (i10 == this.f122139e) {
                            this.f122150p.offer(e0Var);
                            return;
                        }
                        this.f122151q = i10 + 1;
                    }
                }
                h(e0Var);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122146l.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122146l, bVar)) {
                this.f122146l = bVar;
                this.f122136b.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMap(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(e0Var);
        this.f122125c = oVar;
        this.f122126d = z10;
        this.f122127e = i10;
        this.f122128f = i11;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super U> g0Var) {
        if (ObservableScalarXMap.b(this.f122785b, g0Var, this.f122125c)) {
            return;
        }
        this.f122785b.g(new MergeObserver(g0Var, this.f122125c, this.f122126d, this.f122127e, this.f122128f));
    }
}

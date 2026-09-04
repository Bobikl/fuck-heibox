package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableCombineLatest<T, R> extends io.reactivex.z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<? extends T>[] f122021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterable<? extends io.reactivex.e0<? extends T>> f122022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super Object[], ? extends R> f122023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f122024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f122025f;

    public static final class CombinerObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final LatestCoordinator<T, R> f122026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f122027c;

        CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i10) {
            this.f122026b = latestCoordinator;
            this.f122027c = i10;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122026b.d(this.f122027c);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122026b.f(this.f122027c, th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122026b.g(this.f122027c, t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public static final class LatestCoordinator<T, R> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 8567835998786448817L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Object[], ? extends R> f122029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final CombinerObserver<T, R>[] f122030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object[] f122031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object[]> f122032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f122033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122034h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f122035i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicThrowable f122036j = new AtomicThrowable();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f122037k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122038l;

        LatestCoordinator(io.reactivex.g0<? super R> g0Var, kh.o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.f122028b = g0Var;
            this.f122029c = oVar;
            this.f122033g = z10;
            this.f122031e = new Object[i10];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                combinerObserverArr[i12] = new CombinerObserver<>(this, i12);
            }
            this.f122030d = combinerObserverArr;
            this.f122032f = new io.reactivex.internal.queue.a<>(i11);
        }

        void a() {
            for (CombinerObserver<T, R> combinerObserver : this.f122030d) {
                combinerObserver.a();
            }
        }

        void b(io.reactivex.internal.queue.a<?> aVar) {
            synchronized (this) {
                this.f122031e = null;
            }
            aVar.clear();
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.a<Object[]> aVar = this.f122032f;
            io.reactivex.g0<? super R> g0Var = this.f122028b;
            boolean z10 = this.f122033g;
            int iAddAndGet = 1;
            while (!this.f122034h) {
                if (!z10 && this.f122036j.get() != null) {
                    a();
                    b(aVar);
                    g0Var.onError(this.f122036j.c());
                    return;
                }
                boolean z11 = this.f122035i;
                Object[] objArrPoll = aVar.poll();
                boolean z12 = objArrPoll == null;
                if (z11 && z12) {
                    b(aVar);
                    Throwable thC = this.f122036j.c();
                    if (thC == null) {
                        g0Var.onComplete();
                        return;
                    } else {
                        g0Var.onError(thC);
                        return;
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        g0Var.onNext((Object) io.reactivex.internal.functions.a.g(this.f122029c.apply(objArrPoll), "The combiner returned a null value"));
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f122036j.a(th2);
                        a();
                        b(aVar);
                        g0Var.onError(this.f122036j.c());
                        return;
                    }
                }
            }
            b(aVar);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0019 A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0007, B:12:0x0011, B:15:0x001b, B:14:0x0019), top: B:23:0x0001 }] */
        void d(int i10) {
            synchronized (this) {
                Object[] objArr = this.f122031e;
                if (objArr == null) {
                    return;
                }
                boolean z10 = objArr[i10] == null;
                if (z10) {
                    this.f122035i = true;
                } else {
                    int i11 = this.f122038l + 1;
                    this.f122038l = i11;
                    if (i11 == objArr.length) {
                        this.f122035i = true;
                    }
                }
                if (z10) {
                    a();
                }
                c();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122034h) {
                return;
            }
            this.f122034h = true;
            a();
            if (getAndIncrement() == 0) {
                b(this.f122032f);
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0025 A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0014, B:16:0x001d, B:19:0x0027, B:18:0x0025), top: B:29:0x000e }] */
        void f(int i10, Throwable th2) {
            if (!this.f122036j.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            boolean z10 = true;
            if (this.f122033g) {
                synchronized (this) {
                    Object[] objArr = this.f122031e;
                    if (objArr == null) {
                        return;
                    }
                    boolean z11 = objArr[i10] == null;
                    if (z11) {
                        this.f122035i = true;
                    } else {
                        int i11 = this.f122038l + 1;
                        this.f122038l = i11;
                        if (i11 == objArr.length) {
                            this.f122035i = true;
                        }
                    }
                    z10 = z11;
                }
            }
            if (z10) {
                a();
            }
            c();
        }

        void g(int i10, T t10) {
            boolean z10;
            synchronized (this) {
                Object[] objArr = this.f122031e;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i10];
                int i11 = this.f122037k;
                if (obj == null) {
                    i11++;
                    this.f122037k = i11;
                }
                objArr[i10] = t10;
                if (i11 == objArr.length) {
                    this.f122032f.offer((Object[]) objArr.clone());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    c();
                }
            }
        }

        public void h(io.reactivex.e0<? extends T>[] e0VarArr) {
            CombinerObserver<T, R>[] combinerObserverArr = this.f122030d;
            int length = combinerObserverArr.length;
            this.f122028b.onSubscribe(this);
            for (int i10 = 0; i10 < length && !this.f122035i && !this.f122034h; i10++) {
                e0VarArr[i10].g(combinerObserverArr[i10]);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122034h;
        }
    }

    public ObservableCombineLatest(io.reactivex.e0<? extends T>[] e0VarArr, Iterable<? extends io.reactivex.e0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f122021b = e0VarArr;
        this.f122022c = iterable;
        this.f122023d = oVar;
        this.f122024e = i10;
        this.f122025f = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super R> g0Var) {
        int length;
        io.reactivex.e0<? extends T>[] e0VarArr = this.f122021b;
        if (e0VarArr == null) {
            e0VarArr = new io.reactivex.z[8];
            length = 0;
            for (io.reactivex.e0<? extends T> e0Var : this.f122022c) {
                if (length == e0VarArr.length) {
                    io.reactivex.e0<? extends T>[] e0VarArr2 = new io.reactivex.e0[(length >> 2) + length];
                    System.arraycopy(e0VarArr, 0, e0VarArr2, 0, length);
                    e0VarArr = e0VarArr2;
                }
                e0VarArr[length] = e0Var;
                length++;
            }
        } else {
            length = e0VarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptyDisposable.complete(g0Var);
        } else {
            new LatestCoordinator(g0Var, this.f122023d, i10, this.f122024e, this.f122025f).h(e0VarArr);
        }
    }
}

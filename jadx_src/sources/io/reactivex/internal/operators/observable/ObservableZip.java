package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableZip<T, R> extends io.reactivex.z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<? extends T>[] f122767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterable<? extends io.reactivex.e0<? extends T>> f122768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super Object[], ? extends R> f122769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f122770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f122771f;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 2983708048395377667L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Object[], ? extends R> f122773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a<T, R>[] f122774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final T[] f122775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f122776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f122777g;

        ZipCoordinator(io.reactivex.g0<? super R> g0Var, kh.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
            this.f122772b = g0Var;
            this.f122773c = oVar;
            this.f122774d = new a[i10];
            this.f122775e = (T[]) new Object[i10];
            this.f122776f = z10;
        }

        void a() {
            clear();
            b();
        }

        void b() {
            for (a<T, R> aVar : this.f122774d) {
                aVar.a();
            }
        }

        boolean c(boolean z10, boolean z11, io.reactivex.g0<? super R> g0Var, boolean z12, a<?, ?> aVar) {
            if (this.f122777g) {
                a();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = aVar.f122781e;
                this.f122777g = true;
                a();
                if (th2 != null) {
                    g0Var.onError(th2);
                } else {
                    g0Var.onComplete();
                }
                return true;
            }
            Throwable th3 = aVar.f122781e;
            if (th3 != null) {
                this.f122777g = true;
                a();
                g0Var.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f122777g = true;
            a();
            g0Var.onComplete();
            return true;
        }

        void clear() {
            for (a<T, R> aVar : this.f122774d) {
                aVar.f122779c.clear();
            }
        }

        public void d() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            a<T, R>[] aVarArr = this.f122774d;
            io.reactivex.g0<? super R> g0Var = this.f122772b;
            T[] tArr = this.f122775e;
            boolean z10 = this.f122776f;
            int iAddAndGet = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                for (a<T, R> aVar : aVarArr) {
                    if (tArr[i11] == null) {
                        boolean z11 = aVar.f122780d;
                        T tPoll = aVar.f122779c.poll();
                        boolean z12 = tPoll == null;
                        if (c(z11, z12, g0Var, z10, aVar)) {
                            return;
                        }
                        if (z12) {
                            i10++;
                        } else {
                            tArr[i11] = tPoll;
                        }
                    } else if (aVar.f122780d && !z10 && (th2 = aVar.f122781e) != null) {
                        this.f122777g = true;
                        a();
                        g0Var.onError(th2);
                        return;
                    }
                    i11++;
                }
                if (i10 != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        g0Var.onNext((Object) io.reactivex.internal.functions.a.g(this.f122773c.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        a();
                        g0Var.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122777g) {
                return;
            }
            this.f122777g = true;
            b();
            if (getAndIncrement() == 0) {
                clear();
            }
        }

        public void f(io.reactivex.e0<? extends T>[] e0VarArr, int i10) {
            a<T, R>[] aVarArr = this.f122774d;
            int length = aVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                aVarArr[i11] = new a<>(this, i10);
            }
            lazySet(0);
            this.f122772b.onSubscribe(this);
            for (int i12 = 0; i12 < length && !this.f122777g; i12++) {
                e0VarArr[i12].g(aVarArr[i12]);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122777g;
        }
    }

    public static final class a<T, R> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ZipCoordinator<T, R> f122778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.a<T> f122779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f122780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f122781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122782f = new AtomicReference<>();

        a(ZipCoordinator<T, R> zipCoordinator, int i10) {
            this.f122778b = zipCoordinator;
            this.f122779c = new io.reactivex.internal.queue.a<>(i10);
        }

        public void a() {
            DisposableHelper.dispose(this.f122782f);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122780d = true;
            this.f122778b.d();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122781e = th2;
            this.f122780d = true;
            this.f122778b.d();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122779c.offer(t10);
            this.f122778b.d();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122782f, bVar);
        }
    }

    public ObservableZip(io.reactivex.e0<? extends T>[] e0VarArr, Iterable<? extends io.reactivex.e0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f122767b = e0VarArr;
        this.f122768c = iterable;
        this.f122769d = oVar;
        this.f122770e = i10;
        this.f122771f = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super R> g0Var) {
        int length;
        io.reactivex.e0<? extends T>[] e0VarArr = this.f122767b;
        if (e0VarArr == null) {
            e0VarArr = new io.reactivex.z[8];
            length = 0;
            for (io.reactivex.e0<? extends T> e0Var : this.f122768c) {
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
        if (length == 0) {
            EmptyDisposable.complete(g0Var);
        } else {
            new ZipCoordinator(g0Var, this.f122769d, length, this.f122771f).f(e0VarArr, this.f122770e);
        }
    }
}

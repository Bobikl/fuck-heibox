package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWithLatestFromMany<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @jh.f
    final io.reactivex.e0<?>[] f122753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @jh.f
    final Iterable<? extends io.reactivex.e0<?>> f122754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @jh.e
    final kh.o<? super Object[], R> f122755e;

    public static final class WithLatestFromObserver<T, R> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1577321883966341961L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Object[], R> f122757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final WithLatestInnerObserver[] f122758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceArray<Object> f122759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122760f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicThrowable f122761g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122762h;

        WithLatestFromObserver(io.reactivex.g0<? super R> g0Var, kh.o<? super Object[], R> oVar, int i10) {
            this.f122756b = g0Var;
            this.f122757c = oVar;
            WithLatestInnerObserver[] withLatestInnerObserverArr = new WithLatestInnerObserver[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                withLatestInnerObserverArr[i11] = new WithLatestInnerObserver(this, i11);
            }
            this.f122758d = withLatestInnerObserverArr;
            this.f122759e = new AtomicReferenceArray<>(i10);
            this.f122760f = new AtomicReference<>();
            this.f122761g = new AtomicThrowable();
        }

        void a(int i10) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.f122758d;
            for (int i11 = 0; i11 < withLatestInnerObserverArr.length; i11++) {
                if (i11 != i10) {
                    withLatestInnerObserverArr[i11].a();
                }
            }
        }

        void b(int i10, boolean z10) {
            if (z10) {
                return;
            }
            this.f122762h = true;
            a(i10);
            io.reactivex.internal.util.g.a(this.f122756b, this, this.f122761g);
        }

        void c(int i10, Throwable th2) {
            this.f122762h = true;
            DisposableHelper.dispose(this.f122760f);
            a(i10);
            io.reactivex.internal.util.g.c(this.f122756b, th2, this, this.f122761g);
        }

        void d(int i10, Object obj) {
            this.f122759e.set(i10, obj);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122760f);
            for (WithLatestInnerObserver withLatestInnerObserver : this.f122758d) {
                withLatestInnerObserver.a();
            }
        }

        void f(io.reactivex.e0<?>[] e0VarArr, int i10) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.f122758d;
            AtomicReference<io.reactivex.disposables.b> atomicReference = this.f122760f;
            for (int i11 = 0; i11 < i10 && !DisposableHelper.isDisposed(atomicReference.get()) && !this.f122762h; i11++) {
                e0VarArr[i11].g(withLatestInnerObserverArr[i11]);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f122760f.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122762h) {
                return;
            }
            this.f122762h = true;
            a(-1);
            io.reactivex.internal.util.g.a(this.f122756b, this, this.f122761g);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122762h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122762h = true;
            a(-1);
            io.reactivex.internal.util.g.c(this.f122756b, th2, this, this.f122761g);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122762h) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f122759e;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i10 = 0;
            objArr[0] = t10;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                io.reactivex.internal.util.g.e(this.f122756b, io.reactivex.internal.functions.a.g(this.f122757c.apply(objArr), "combiner returned a null value"), this, this.f122761g);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122760f, bVar);
        }
    }

    public static final class WithLatestInnerObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WithLatestFromObserver<?, ?> f122763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f122764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f122765d;

        WithLatestInnerObserver(WithLatestFromObserver<?, ?> withLatestFromObserver, int i10) {
            this.f122763b = withLatestFromObserver;
            this.f122764c = i10;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122763b.b(this.f122764c, this.f122765d);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122763b.c(this.f122764c, th2);
        }

        @Override // io.reactivex.g0
        public void onNext(Object obj) {
            if (!this.f122765d) {
                this.f122765d = true;
            }
            this.f122763b.d(this.f122764c, obj);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public final class a implements kh.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // kh.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.a.g(ObservableWithLatestFromMany.this.f122755e.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    public ObservableWithLatestFromMany(@jh.e io.reactivex.e0<T> e0Var, @jh.e Iterable<? extends io.reactivex.e0<?>> iterable, @jh.e kh.o<? super Object[], R> oVar) {
        super(e0Var);
        this.f122753c = null;
        this.f122754d = iterable;
        this.f122755e = oVar;
    }

    public ObservableWithLatestFromMany(@jh.e io.reactivex.e0<T> e0Var, @jh.e io.reactivex.e0<?>[] e0VarArr, @jh.e kh.o<? super Object[], R> oVar) {
        super(e0Var);
        this.f122753c = e0VarArr;
        this.f122754d = null;
        this.f122755e = oVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super R> g0Var) {
        int length;
        io.reactivex.e0<?>[] e0VarArr = this.f122753c;
        if (e0VarArr == null) {
            e0VarArr = new io.reactivex.e0[8];
            try {
                length = 0;
                for (io.reactivex.e0<?> e0Var : this.f122754d) {
                    if (length == e0VarArr.length) {
                        e0VarArr = (io.reactivex.e0[]) Arrays.copyOf(e0VarArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    e0VarArr[length] = e0Var;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptyDisposable.error(th2, g0Var);
                return;
            }
        } else {
            length = e0VarArr.length;
        }
        if (length == 0) {
            new x0(this.f122785b, new a()).H5(g0Var);
            return;
        }
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(g0Var, this.f122755e, length);
        g0Var.onSubscribe(withLatestFromObserver);
        withLatestFromObserver.f(e0VarArr, length);
        this.f122785b.g(withLatestFromObserver);
    }
}

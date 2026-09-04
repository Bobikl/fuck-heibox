package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleZipArray<T, R> extends i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T>[] f123480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Object[], ? extends R> f123481c;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -5556924161382950569L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super R> f123482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Object[], ? extends R> f123483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ZipSingleObserver<T>[] f123484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Object[] f123485e;

        ZipCoordinator(l0<? super R> l0Var, int i10, kh.o<? super Object[], ? extends R> oVar) {
            super(i10);
            this.f123482b = l0Var;
            this.f123483c = oVar;
            ZipSingleObserver<T>[] zipSingleObserverArr = new ZipSingleObserver[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                zipSingleObserverArr[i11] = new ZipSingleObserver<>(this, i11);
            }
            this.f123484d = zipSingleObserverArr;
            this.f123485e = new Object[i10];
        }

        void a(int i10) {
            ZipSingleObserver<T>[] zipSingleObserverArr = this.f123484d;
            int length = zipSingleObserverArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                zipSingleObserverArr[i11].a();
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                } else {
                    zipSingleObserverArr[i10].a();
                }
            }
        }

        void b(Throwable th2, int i10) {
            if (getAndSet(0) <= 0) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                a(i10);
                this.f123482b.onError(th2);
            }
        }

        void c(T t10, int i10) {
            this.f123485e[i10] = t10;
            if (decrementAndGet() == 0) {
                try {
                    this.f123482b.onSuccess(io.reactivex.internal.functions.a.g(this.f123483c.apply(this.f123485e), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f123482b.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver<T> zipSingleObserver : this.f123484d) {
                    zipSingleObserver.a();
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    public static final class ZipSingleObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ZipCoordinator<T, ?> f123486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f123487c;

        ZipSingleObserver(ZipCoordinator<T, ?> zipCoordinator, int i10) {
            this.f123486b = zipCoordinator;
            this.f123487c = i10;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123486b.b(th2, this.f123487c);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123486b.c(t10, this.f123487c);
        }
    }

    public final class a implements kh.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // kh.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.a.g(SingleZipArray.this.f123481c.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    public SingleZipArray(o0<? extends T>[] o0VarArr, kh.o<? super Object[], ? extends R> oVar) {
        this.f123480b = o0VarArr;
        this.f123481c = oVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super R> l0Var) {
        o0<? extends T>[] o0VarArr = this.f123480b;
        int length = o0VarArr.length;
        if (length == 1) {
            o0VarArr[0].f(new v.a(l0Var, new a()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(l0Var, length, this.f123481c);
        l0Var.onSubscribe(zipCoordinator);
        for (int i10 = 0; i10 < length && !zipCoordinator.isDisposed(); i10++) {
            o0<? extends T> o0Var = o0VarArr[i10];
            if (o0Var == null) {
                zipCoordinator.b(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            o0Var.f(zipCoordinator.f123484d[i10]);
        }
    }
}

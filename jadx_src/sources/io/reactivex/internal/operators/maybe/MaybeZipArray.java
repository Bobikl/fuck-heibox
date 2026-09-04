package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeZipArray<T, R> extends io.reactivex.q<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<? extends T>[] f121609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Object[], ? extends R> f121610c;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -5556924161382950569L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super R> f121611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Object[], ? extends R> f121612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ZipMaybeObserver<T>[] f121613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Object[] f121614e;

        ZipCoordinator(io.reactivex.t<? super R> tVar, int i10, kh.o<? super Object[], ? extends R> oVar) {
            super(i10);
            this.f121611b = tVar;
            this.f121612c = oVar;
            ZipMaybeObserver<T>[] zipMaybeObserverArr = new ZipMaybeObserver[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                zipMaybeObserverArr[i11] = new ZipMaybeObserver<>(this, i11);
            }
            this.f121613d = zipMaybeObserverArr;
            this.f121614e = new Object[i10];
        }

        void a(int i10) {
            ZipMaybeObserver<T>[] zipMaybeObserverArr = this.f121613d;
            int length = zipMaybeObserverArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                zipMaybeObserverArr[i11].a();
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                } else {
                    zipMaybeObserverArr[i10].a();
                }
            }
        }

        void b(int i10) {
            if (getAndSet(0) > 0) {
                a(i10);
                this.f121611b.onComplete();
            }
        }

        void c(Throwable th2, int i10) {
            if (getAndSet(0) <= 0) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                a(i10);
                this.f121611b.onError(th2);
            }
        }

        void d(T t10, int i10) {
            this.f121614e[i10] = t10;
            if (decrementAndGet() == 0) {
                try {
                    this.f121611b.onSuccess(io.reactivex.internal.functions.a.g(this.f121612c.apply(this.f121614e), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f121611b.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipMaybeObserver<T> zipMaybeObserver : this.f121613d) {
                    zipMaybeObserver.a();
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    public static final class ZipMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ZipCoordinator<T, ?> f121615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f121616c;

        ZipMaybeObserver(ZipCoordinator<T, ?> zipCoordinator, int i10) {
            this.f121615b = zipCoordinator;
            this.f121616c = i10;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121615b.b(this.f121616c);
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121615b.c(th2, this.f121616c);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121615b.d(t10, this.f121616c);
        }
    }

    public final class a implements kh.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // kh.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.a.g(MaybeZipArray.this.f121610c.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    public MaybeZipArray(io.reactivex.w<? extends T>[] wVarArr, kh.o<? super Object[], ? extends R> oVar) {
        this.f121609b = wVarArr;
        this.f121610c = oVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        io.reactivex.w<? extends T>[] wVarArr = this.f121609b;
        int length = wVarArr.length;
        if (length == 1) {
            wVarArr[0].f(new c0.a(tVar, new a()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(tVar, length, this.f121610c);
        tVar.onSubscribe(zipCoordinator);
        for (int i10 = 0; i10 < length && !zipCoordinator.isDisposed(); i10++) {
            io.reactivex.w<? extends T> wVar = wVarArr[i10];
            if (wVar == null) {
                zipCoordinator.c(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            wVar.f(zipCoordinator.f121613d[i10]);
        }
    }
}

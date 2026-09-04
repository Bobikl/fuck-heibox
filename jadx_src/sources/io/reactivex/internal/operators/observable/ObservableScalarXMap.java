package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements lh.j<T>, Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f122498d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f122499e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f122500f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f122501g = 3;
        private static final long serialVersionUID = 3880992722410194083L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f122503c;

        public ScalarDisposable(io.reactivex.g0<? super T> g0Var, T t10) {
            this.f122502b = g0Var;
            this.f122503c = t10;
        }

        @Override // lh.o
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // lh.o
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // lh.o
        public boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f122503c;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f122502b.onNext(this.f122503c);
                if (get() == 2) {
                    lazySet(3);
                    this.f122502b.onComplete();
                }
            }
        }
    }

    public static final class a<T, R> extends io.reactivex.z<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f122504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<? extends R>> f122505c;

        a(T t10, kh.o<? super T, ? extends io.reactivex.e0<? extends R>> oVar) {
            this.f122504b = t10;
            this.f122505c = oVar;
        }

        @Override // io.reactivex.z
        public void H5(io.reactivex.g0<? super R> g0Var) {
            try {
                io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122505c.apply(this.f122504b), "The mapper returned a null ObservableSource");
                if (!(e0Var instanceof Callable)) {
                    e0Var.g(g0Var);
                    return;
                }
                try {
                    Object objCall = ((Callable) e0Var).call();
                    if (objCall == null) {
                        EmptyDisposable.complete(g0Var);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(g0Var, objCall);
                    g0Var.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    EmptyDisposable.error(th2, g0Var);
                }
            } catch (Throwable th3) {
                EmptyDisposable.error(th3, g0Var);
            }
        }
    }

    private ObservableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> io.reactivex.z<U> a(T t10, kh.o<? super T, ? extends io.reactivex.e0<? extends U>> oVar) {
        return io.reactivex.plugins.a.R(new a(t10, oVar));
    }

    public static <T, R> boolean b(io.reactivex.e0<T> e0Var, io.reactivex.g0<? super R> g0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends R>> oVar) {
        if (!(e0Var instanceof Callable)) {
            return false;
        }
        try {
            a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) ((Callable) e0Var).call();
            if (aVar == null) {
                EmptyDisposable.complete(g0Var);
                return true;
            }
            try {
                io.reactivex.e0 e0Var2 = (io.reactivex.e0) io.reactivex.internal.functions.a.g(oVar.apply(aVar), "The mapper returned a null ObservableSource");
                if (e0Var2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) e0Var2).call();
                        if (objCall == null) {
                            EmptyDisposable.complete(g0Var);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(g0Var, objCall);
                        g0Var.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        EmptyDisposable.error(th2, g0Var);
                        return true;
                    }
                } else {
                    e0Var2.g(g0Var);
                }
                return true;
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                EmptyDisposable.error(th3, g0Var);
                return true;
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.a.b(th4);
            EmptyDisposable.error(th4, g0Var);
            return true;
        }
    }
}

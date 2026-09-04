package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableUsing<T, D> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends D> f122684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super D, ? extends io.reactivex.e0<? extends T>> f122685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super D> f122686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f122687e;

    public static final class UsingObserver<T, D> extends AtomicBoolean implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 5904473792286235046L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final D f122689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.g<? super D> f122690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f122691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f122692f;

        UsingObserver(io.reactivex.g0<? super T> g0Var, D d10, kh.g<? super D> gVar, boolean z10) {
            this.f122688b = g0Var;
            this.f122689c = d10;
            this.f122690d = gVar;
            this.f122691e = z10;
        }

        void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f122690d.accept(this.f122689c);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            a();
            this.f122692f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (!this.f122691e) {
                this.f122688b.onComplete();
                this.f122692f.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f122690d.accept(this.f122689c);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f122688b.onError(th2);
                    return;
                }
            }
            this.f122692f.dispose();
            this.f122688b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f122691e) {
                this.f122688b.onError(th2);
                this.f122692f.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f122690d.accept(this.f122689c);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f122692f.dispose();
            this.f122688b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122688b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122692f, bVar)) {
                this.f122692f = bVar;
                this.f122688b.onSubscribe(this);
            }
        }
    }

    public ObservableUsing(Callable<? extends D> callable, kh.o<? super D, ? extends io.reactivex.e0<? extends T>> oVar, kh.g<? super D> gVar, boolean z10) {
        this.f122684b = callable;
        this.f122685c = oVar;
        this.f122686d = gVar;
        this.f122687e = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        try {
            D dCall = this.f122684b.call();
            try {
                ((io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122685c.apply(dCall), "The sourceSupplier returned a null ObservableSource")).g(new UsingObserver(g0Var, dCall, this.f122686d, this.f122687e));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                try {
                    this.f122686d.accept(dCall);
                    EmptyDisposable.error(th2, g0Var);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    EmptyDisposable.error(new CompositeException(th2, th3), g0Var);
                }
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.a.b(th4);
            EmptyDisposable.error(th4, g0Var);
        }
    }
}

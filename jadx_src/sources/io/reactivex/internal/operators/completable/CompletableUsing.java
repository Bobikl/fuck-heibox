package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableUsing<R> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<R> f119776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super R, ? extends io.reactivex.g> f119777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super R> f119778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f119779e;

    public static final class UsingObserver<R> extends AtomicReference<Object> implements io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = -674404550052917487L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super R> f119781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f119782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f119783e;

        UsingObserver(io.reactivex.d dVar, R r10, kh.g<? super R> gVar, boolean z10) {
            super(r10);
            this.f119780b = dVar;
            this.f119781c = gVar;
            this.f119782d = z10;
        }

        void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f119781c.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119783e.dispose();
            this.f119783e = DisposableHelper.DISPOSED;
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119783e.isDisposed();
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f119783e = DisposableHelper.DISPOSED;
            if (this.f119782d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f119781c.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f119780b.onError(th2);
                    return;
                }
            }
            this.f119780b.onComplete();
            if (this.f119782d) {
                return;
            }
            a();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119783e = DisposableHelper.DISPOSED;
            if (this.f119782d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f119781c.accept(andSet);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f119780b.onError(th2);
            if (this.f119782d) {
                return;
            }
            a();
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f119783e, bVar)) {
                this.f119783e = bVar;
                this.f119780b.onSubscribe(this);
            }
        }
    }

    public CompletableUsing(Callable<R> callable, kh.o<? super R, ? extends io.reactivex.g> oVar, kh.g<? super R> gVar, boolean z10) {
        this.f119776b = callable;
        this.f119777c = oVar;
        this.f119778d = gVar;
        this.f119779e = z10;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        try {
            R rCall = this.f119776b.call();
            try {
                ((io.reactivex.g) io.reactivex.internal.functions.a.g(this.f119777c.apply(rCall), "The completableFunction returned a null CompletableSource")).d(new UsingObserver(dVar, rCall, this.f119778d, this.f119779e));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                if (this.f119779e) {
                    try {
                        this.f119778d.accept(rCall);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        EmptyDisposable.error(new CompositeException(th2, th3), dVar);
                        return;
                    }
                }
                EmptyDisposable.error(th2, dVar);
                if (this.f119779e) {
                    return;
                }
                try {
                    this.f119778d.accept(rCall);
                } catch (Throwable th4) {
                    io.reactivex.exceptions.a.b(th4);
                    io.reactivex.plugins.a.Y(th4);
                }
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.a.b(th5);
            EmptyDisposable.error(th5, dVar);
        }
    }
}

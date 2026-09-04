package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeUsing<T, D> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends D> f121601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super D, ? extends io.reactivex.w<? extends T>> f121602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super D> f121603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f121604e;

    public static final class UsingObserver<T, D> extends AtomicReference<Object> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -674404550052917487L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super D> f121606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f121607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f121608e;

        UsingObserver(io.reactivex.t<? super T> tVar, D d10, kh.g<? super D> gVar, boolean z10) {
            super(d10);
            this.f121605b = tVar;
            this.f121606c = gVar;
            this.f121607d = z10;
        }

        void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f121606c.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121608e.dispose();
            this.f121608e = DisposableHelper.DISPOSED;
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121608e.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121608e = DisposableHelper.DISPOSED;
            if (this.f121607d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f121606c.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f121605b.onError(th2);
                    return;
                }
            }
            this.f121605b.onComplete();
            if (this.f121607d) {
                return;
            }
            a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121608e = DisposableHelper.DISPOSED;
            if (this.f121607d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f121606c.accept(andSet);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f121605b.onError(th2);
            if (this.f121607d) {
                return;
            }
            a();
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121608e, bVar)) {
                this.f121608e = bVar;
                this.f121605b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121608e = DisposableHelper.DISPOSED;
            if (this.f121607d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f121606c.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f121605b.onError(th2);
                    return;
                }
            }
            this.f121605b.onSuccess(t10);
            if (this.f121607d) {
                return;
            }
            a();
        }
    }

    public MaybeUsing(Callable<? extends D> callable, kh.o<? super D, ? extends io.reactivex.w<? extends T>> oVar, kh.g<? super D> gVar, boolean z10) {
        this.f121601b = callable;
        this.f121602c = oVar;
        this.f121603d = gVar;
        this.f121604e = z10;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        try {
            D dCall = this.f121601b.call();
            try {
                ((io.reactivex.w) io.reactivex.internal.functions.a.g(this.f121602c.apply(dCall), "The sourceSupplier returned a null MaybeSource")).f(new UsingObserver(tVar, dCall, this.f121603d, this.f121604e));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                if (this.f121604e) {
                    try {
                        this.f121603d.accept(dCall);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        EmptyDisposable.error(new CompositeException(th2, th3), tVar);
                        return;
                    }
                }
                EmptyDisposable.error(th2, tVar);
                if (this.f121604e) {
                    return;
                }
                try {
                    this.f121603d.accept(dCall);
                } catch (Throwable th4) {
                    io.reactivex.exceptions.a.b(th4);
                    io.reactivex.plugins.a.Y(th4);
                }
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.a.b(th5);
            EmptyDisposable.error(th5, tVar);
        }
    }
}

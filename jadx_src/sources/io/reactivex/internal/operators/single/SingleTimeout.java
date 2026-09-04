package io.reactivex.internal.operators.single;

import io.reactivex.h0;
import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleTimeout<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f123448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f123449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final h0 f123450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final o0<? extends T> f123451f;

    public static final class TimeoutMainObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, Runnable, io.reactivex.disposables.b {
        private static final long serialVersionUID = 37497744973048446L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f123453c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeoutFallbackObserver<T> f123454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        o0<? extends T> f123455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f123456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final TimeUnit f123457g;

        public static final class TimeoutFallbackObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T> {
            private static final long serialVersionUID = 2071387740092105509L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final l0<? super T> f123458b;

            TimeoutFallbackObserver(l0<? super T> l0Var) {
                this.f123458b = l0Var;
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                this.f123458b.onError(th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(T t10) {
                this.f123458b.onSuccess(t10);
            }
        }

        TimeoutMainObserver(l0<? super T> l0Var, o0<? extends T> o0Var, long j10, TimeUnit timeUnit) {
            this.f123452b = l0Var;
            this.f123455e = o0Var;
            this.f123456f = j10;
            this.f123457g = timeUnit;
            if (o0Var != null) {
                this.f123454d = new TimeoutFallbackObserver<>(l0Var);
            } else {
                this.f123454d = null;
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f123453c);
            TimeoutFallbackObserver<T> timeoutFallbackObserver = this.f123454d;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.dispose(timeoutFallbackObserver);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || !compareAndSet(bVar, disposableHelper)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this.f123453c);
                this.f123452b.onError(th2);
            }
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || !compareAndSet(bVar, disposableHelper)) {
                return;
            }
            DisposableHelper.dispose(this.f123453c);
            this.f123452b.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || !compareAndSet(bVar, disposableHelper)) {
                return;
            }
            if (bVar != null) {
                bVar.dispose();
            }
            o0<? extends T> o0Var = this.f123455e;
            if (o0Var == null) {
                this.f123452b.onError(new TimeoutException(ExceptionHelper.e(this.f123456f, this.f123457g)));
            } else {
                this.f123455e = null;
                o0Var.f(this.f123454d);
            }
        }
    }

    public SingleTimeout(o0<T> o0Var, long j10, TimeUnit timeUnit, h0 h0Var, o0<? extends T> o0Var2) {
        this.f123447b = o0Var;
        this.f123448c = j10;
        this.f123449d = timeUnit;
        this.f123450e = h0Var;
        this.f123451f = o0Var2;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        TimeoutMainObserver timeoutMainObserver = new TimeoutMainObserver(l0Var, this.f123451f, this.f123448c, this.f123449d);
        l0Var.onSubscribe(timeoutMainObserver);
        DisposableHelper.replace(timeoutMainObserver.f123453c, this.f123450e.g(timeoutMainObserver, this.f123448c, this.f123449d));
        this.f123447b.f(timeoutMainObserver);
    }
}

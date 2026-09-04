package io.reactivex.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: SafeObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k<T> implements g0<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final g0<? super T> f123913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    io.reactivex.disposables.b f123914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f123915d;

    public k(@jh.e g0<? super T> g0Var) {
        this.f123913b = g0Var;
    }

    void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f123913b.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f123913b.onError(nullPointerException);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(new CompositeException(nullPointerException, th3));
        }
    }

    void b() {
        this.f123915d = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f123913b.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f123913b.onError(nullPointerException);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.f123914c.dispose();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f123914c.isDisposed();
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (this.f123915d) {
            return;
        }
        this.f123915d = true;
        if (this.f123914c == null) {
            a();
            return;
        }
        try {
            this.f123913b.onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.g0
    public void onError(@jh.e Throwable th2) {
        if (this.f123915d) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f123915d = true;
        if (this.f123914c != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f123913b.onError(th2);
                return;
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f123913b.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f123913b.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                io.reactivex.plugins.a.Y(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.a.b(th5);
            io.reactivex.plugins.a.Y(new CompositeException(th2, nullPointerException, th5));
        }
    }

    @Override // io.reactivex.g0
    public void onNext(@jh.e T t10) {
        if (this.f123915d) {
            return;
        }
        if (this.f123914c == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f123914c.dispose();
                onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                onError(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        try {
            this.f123913b.onNext(t10);
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            try {
                this.f123914c.dispose();
                onError(th3);
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                onError(new CompositeException(th3, th4));
            }
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(@jh.e io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f123914c, bVar)) {
            this.f123914c = bVar;
            try {
                this.f123913b.onSubscribe(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123915d = true;
                try {
                    bVar.dispose();
                    io.reactivex.plugins.a.Y(th2);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
                }
            }
        }
    }
}

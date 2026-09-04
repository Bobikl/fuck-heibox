package io.reactivex.observers;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: compiled from: SerializedObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l<T> implements g0<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f123916h = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final g0<? super T> f123917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f123918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    io.reactivex.disposables.b f123919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f123920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    io.reactivex.internal.util.a<Object> f123921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile boolean f123922g;

    public l(@jh.e g0<? super T> g0Var) {
        this(g0Var, false);
    }

    public l(@jh.e g0<? super T> g0Var, boolean z10) {
        this.f123917b = g0Var;
        this.f123918c = z10;
    }

    void a() {
        io.reactivex.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f123921f;
                if (aVar == null) {
                    this.f123920e = false;
                    return;
                }
                this.f123921f = null;
            }
        } while (!aVar.a(this.f123917b));
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.f123919d.dispose();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f123919d.isDisposed();
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (this.f123922g) {
            return;
        }
        synchronized (this) {
            if (this.f123922g) {
                return;
            }
            if (!this.f123920e) {
                this.f123922g = true;
                this.f123920e = true;
                this.f123917b.onComplete();
            } else {
                io.reactivex.internal.util.a<Object> aVar = this.f123921f;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.util.a<>(4);
                    this.f123921f = aVar;
                }
                aVar.c(NotificationLite.complete());
            }
        }
    }

    @Override // io.reactivex.g0
    public void onError(@jh.e Throwable th2) {
        if (this.f123922g) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f123922g) {
                if (this.f123920e) {
                    this.f123922g = true;
                    io.reactivex.internal.util.a<Object> aVar = this.f123921f;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f123921f = aVar;
                    }
                    Object objError = NotificationLite.error(th2);
                    if (this.f123918c) {
                        aVar.c(objError);
                    } else {
                        aVar.f(objError);
                    }
                    return;
                }
                this.f123922g = true;
                this.f123920e = true;
                z10 = false;
            }
            if (z10) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123917b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.g0
    public void onNext(@jh.e T t10) {
        if (this.f123922g) {
            return;
        }
        if (t10 == null) {
            this.f123919d.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f123922g) {
                return;
            }
            if (!this.f123920e) {
                this.f123920e = true;
                this.f123917b.onNext(t10);
                a();
            } else {
                io.reactivex.internal.util.a<Object> aVar = this.f123921f;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.util.a<>(4);
                    this.f123921f = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(@jh.e io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f123919d, bVar)) {
            this.f123919d = bVar;
            this.f123917b.onSubscribe(this);
        }
    }
}

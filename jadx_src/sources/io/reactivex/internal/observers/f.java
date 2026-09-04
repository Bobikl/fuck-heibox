package io.reactivex.internal.observers;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.l0;
import io.reactivex.t;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: BlockingMultiObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f<T> extends CountDownLatch implements l0<T>, io.reactivex.d, t<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    T f119635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f119636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    io.reactivex.disposables.b f119637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f119638e;

    public f() {
        super(1);
    }

    public boolean a(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                if (!await(j10, timeUnit)) {
                    g();
                    return false;
                }
            } catch (InterruptedException e10) {
                g();
                throw ExceptionHelper.f(e10);
            }
        }
        Throwable th2 = this.f119636c;
        if (th2 == null) {
            return true;
        }
        throw ExceptionHelper.f(th2);
    }

    public T b() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                g();
                throw ExceptionHelper.f(e10);
            }
        }
        Throwable th2 = this.f119636c;
        if (th2 == null) {
            return this.f119635b;
        }
        throw ExceptionHelper.f(th2);
    }

    public T c(T t10) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                g();
                throw ExceptionHelper.f(e10);
            }
        }
        Throwable th2 = this.f119636c;
        if (th2 != null) {
            throw ExceptionHelper.f(th2);
        }
        T t11 = this.f119635b;
        return t11 != null ? t11 : t10;
    }

    public Throwable d() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                g();
                return e10;
            }
        }
        return this.f119636c;
    }

    public Throwable f(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                if (!await(j10, timeUnit)) {
                    g();
                    throw ExceptionHelper.f(new TimeoutException(ExceptionHelper.e(j10, timeUnit)));
                }
            } catch (InterruptedException e10) {
                g();
                throw ExceptionHelper.f(e10);
            }
        }
        return this.f119636c;
    }

    void g() {
        this.f119638e = true;
        io.reactivex.disposables.b bVar = this.f119637d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.d
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.l0
    public void onError(Throwable th2) {
        this.f119636c = th2;
        countDown();
    }

    @Override // io.reactivex.l0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        this.f119637d = bVar;
        if (this.f119638e) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.l0
    public void onSuccess(T t10) {
        this.f119635b = t10;
        countDown();
    }
}

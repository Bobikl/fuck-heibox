package io.reactivex.internal.observers;

import io.reactivex.g0;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: BlockingBaseObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c<T> extends CountDownLatch implements g0<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    T f119631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f119632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    io.reactivex.disposables.b f119633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f119634e;

    public c() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw ExceptionHelper.f(e10);
            }
        }
        Throwable th2 = this.f119632c;
        if (th2 == null) {
            return this.f119631b;
        }
        throw ExceptionHelper.f(th2);
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        this.f119634e = true;
        io.reactivex.disposables.b bVar = this.f119633d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f119634e;
    }

    @Override // io.reactivex.g0
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.g0
    public final void onSubscribe(io.reactivex.disposables.b bVar) {
        this.f119633d = bVar;
        if (this.f119634e) {
            bVar.dispose();
        }
    }
}

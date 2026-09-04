package io.reactivex.internal.observers;

import androidx.compose.animation.core.s0;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FutureObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h<T> extends CountDownLatch implements g0<T>, Future<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    T f119643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f119644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.b> f119645d;

    public h() {
        super(1);
        this.f119645d = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        io.reactivex.disposables.b bVar;
        DisposableHelper disposableHelper;
        do {
            bVar = this.f119645d.get();
            if (bVar == this || bVar == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!s0.a(this.f119645d, bVar, disposableHelper));
        if (bVar != null) {
            bVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            io.reactivex.internal.util.c.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f119644c;
        if (th2 == null) {
            return this.f119643b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            io.reactivex.internal.util.c.b();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.e(j10, timeUnit));
            }
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f119644c;
        if (th2 == null) {
            return this.f119643b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f119645d.get());
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        io.reactivex.disposables.b bVar;
        if (this.f119643b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bVar = this.f119645d.get();
            if (bVar == this || bVar == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!s0.a(this.f119645d, bVar, this));
        countDown();
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        io.reactivex.disposables.b bVar;
        if (this.f119644c != null) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f119644c = th2;
        do {
            bVar = this.f119645d.get();
            if (bVar == this || bVar == DisposableHelper.DISPOSED) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
        } while (!s0.a(this.f119645d, bVar, this));
        countDown();
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        if (this.f119643b == null) {
            this.f119643b = t10;
        } else {
            this.f119645d.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.setOnce(this.f119645d, bVar);
    }
}

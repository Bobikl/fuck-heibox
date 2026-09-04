package io.reactivex.internal.subscribers;

import androidx.compose.animation.core.s0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.o;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FutureSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f<T> extends CountDownLatch implements o<T>, Future<T>, org.reactivestreams.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    T f123806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f123807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<org.reactivestreams.e> f123808d;

    public f() {
        super(1);
        this.f123808d = new AtomicReference<>();
    }

    @Override // org.reactivestreams.e
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        org.reactivestreams.e eVar;
        SubscriptionHelper subscriptionHelper;
        do {
            eVar = this.f123808d.get();
            if (eVar == this || eVar == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!s0.a(this.f123808d, eVar, subscriptionHelper));
        if (eVar != null) {
            eVar.cancel();
        }
        countDown();
        return true;
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
        Throwable th2 = this.f123807c;
        if (th2 == null) {
            return this.f123806b;
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
        Throwable th2 = this.f123807c;
        if (th2 == null) {
            return this.f123806b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f123808d.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        org.reactivestreams.e eVar;
        if (this.f123806b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            eVar = this.f123808d.get();
            if (eVar == this || eVar == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!s0.a(this.f123808d, eVar, this));
        countDown();
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        org.reactivestreams.e eVar;
        do {
            eVar = this.f123808d.get();
            if (eVar == this || eVar == SubscriptionHelper.CANCELLED) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123807c = th2;
        } while (!s0.a(this.f123808d, eVar, this));
        countDown();
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (this.f123806b == null) {
            this.f123806b = t10;
        } else {
            this.f123808d.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        SubscriptionHelper.setOnce(this.f123808d, eVar, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
    }
}

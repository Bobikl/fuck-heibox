package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.o;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: BlockingBaseSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c<T> extends CountDownLatch implements o<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    T f123802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f123803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    org.reactivestreams.e f123804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f123805e;

    public c() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                org.reactivestreams.e eVar = this.f123804d;
                this.f123804d = SubscriptionHelper.CANCELLED;
                if (eVar != null) {
                    eVar.cancel();
                }
                throw ExceptionHelper.f(e10);
            }
        }
        Throwable th2 = this.f123803c;
        if (th2 == null) {
            return this.f123802b;
        }
        throw ExceptionHelper.f(th2);
    }

    @Override // org.reactivestreams.d
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public final void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.validate(this.f123804d, eVar)) {
            this.f123804d = eVar;
            if (this.f123805e) {
                return;
            }
            eVar.request(Long.MAX_VALUE);
            if (this.f123805e) {
                this.f123804d = SubscriptionHelper.CANCELLED;
                eVar.cancel();
            }
        }
    }
}

package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class BoundedSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements o<T>, org.reactivestreams.e, io.reactivex.disposables.b, io.reactivex.observers.f {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kh.g<? super T> f123754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super Throwable> f123755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.a f123756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.g<? super org.reactivestreams.e> f123757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f123758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f123759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f123760h;

    public BoundedSubscriber(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.g<? super org.reactivestreams.e> gVar3, int i10) {
        this.f123754b = gVar;
        this.f123755c = gVar2;
        this.f123756d = aVar;
        this.f123757e = gVar3;
        this.f123758f = i10;
        this.f123760h = i10 - (i10 >> 2);
    }

    @Override // io.reactivex.observers.f
    public boolean a() {
        return this.f123755c != Functions.f119561f;
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        org.reactivestreams.e eVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (eVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f123756d.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        org.reactivestreams.e eVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (eVar == subscriptionHelper) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.f123755c.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f123754b.accept(t10);
            int i10 = this.f123759g + 1;
            if (i10 == this.f123760h) {
                this.f123759g = 0;
                get().request(this.f123760h);
            } else {
                this.f123759g = i10;
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            get().cancel();
            onError(th2);
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.setOnce(this, eVar)) {
            try {
                this.f123757e.accept(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                eVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        get().request(j10);
    }
}

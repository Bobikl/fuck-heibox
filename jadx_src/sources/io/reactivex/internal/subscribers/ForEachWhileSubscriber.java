package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicReference;
import kh.r;

/* JADX INFO: loaded from: classes5.dex */
public final class ForEachWhileSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements o<T>, io.reactivex.disposables.b {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r<? super T> f123763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super Throwable> f123764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.a f123765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f123766e;

    public ForEachWhileSubscriber(r<? super T> rVar, kh.g<? super Throwable> gVar, kh.a aVar) {
        this.f123763b = rVar;
        this.f123764c = gVar;
        this.f123765d = aVar;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (this.f123766e) {
            return;
        }
        this.f123766e = true;
        try {
            this.f123765d.run();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f123766e) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f123766e = true;
        try {
            this.f123764c.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (this.f123766e) {
            return;
        }
        try {
            if (this.f123763b.test(t10)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            dispose();
            onError(th2);
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
    }
}

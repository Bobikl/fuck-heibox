package io.reactivex.subscribers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;

/* JADX INFO: compiled from: SafeSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> implements o<T>, org.reactivestreams.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.d<? super T> f124173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    org.reactivestreams.e f124174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f124175d;

    public d(org.reactivestreams.d<? super T> dVar) {
        this.f124173b = dVar;
    }

    void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f124173b.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f124173b.onError(nullPointerException);
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
        this.f124175d = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f124173b.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f124173b.onError(nullPointerException);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            io.reactivex.plugins.a.Y(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        try {
            this.f124174c.cancel();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (this.f124175d) {
            return;
        }
        this.f124175d = true;
        if (this.f124174c == null) {
            a();
            return;
        }
        try {
            this.f124173b.onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f124175d) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124175d = true;
        if (this.f124174c != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f124173b.onError(th2);
                return;
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f124173b.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f124173b.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                io.reactivex.plugins.a.Y(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.a.b(th5);
            io.reactivex.plugins.a.Y(new CompositeException(th2, nullPointerException, th5));
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (this.f124175d) {
            return;
        }
        if (this.f124174c == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f124174c.cancel();
                onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                onError(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        try {
            this.f124173b.onNext(t10);
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            try {
                this.f124174c.cancel();
                onError(th3);
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                onError(new CompositeException(th3, th4));
            }
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.validate(this.f124174c, eVar)) {
            this.f124174c = eVar;
            try {
                this.f124173b.onSubscribe(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f124175d = true;
                try {
                    eVar.cancel();
                    io.reactivex.plugins.a.Y(th2);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
                }
            }
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        try {
            this.f124174c.request(j10);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            try {
                this.f124174c.cancel();
                io.reactivex.plugins.a.Y(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
            }
        }
    }
}

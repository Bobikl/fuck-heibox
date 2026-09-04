package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.o;

/* JADX INFO: compiled from: SerializedSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e<T> implements o<T>, org.reactivestreams.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f124176h = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.d<? super T> f124177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f124178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    org.reactivestreams.e f124179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f124180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    io.reactivex.internal.util.a<Object> f124181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile boolean f124182g;

    public e(org.reactivestreams.d<? super T> dVar) {
        this(dVar, false);
    }

    public e(org.reactivestreams.d<? super T> dVar, boolean z10) {
        this.f124177b = dVar;
        this.f124178c = z10;
    }

    void a() {
        io.reactivex.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f124181f;
                if (aVar == null) {
                    this.f124180e = false;
                    return;
                }
                this.f124181f = null;
            }
        } while (!aVar.b(this.f124177b));
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        this.f124179d.cancel();
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (this.f124182g) {
            return;
        }
        synchronized (this) {
            if (this.f124182g) {
                return;
            }
            if (!this.f124180e) {
                this.f124182g = true;
                this.f124180e = true;
                this.f124177b.onComplete();
            } else {
                io.reactivex.internal.util.a<Object> aVar = this.f124181f;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.util.a<>(4);
                    this.f124181f = aVar;
                }
                aVar.c(NotificationLite.complete());
            }
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f124182g) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f124182g) {
                if (this.f124180e) {
                    this.f124182g = true;
                    io.reactivex.internal.util.a<Object> aVar = this.f124181f;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f124181f = aVar;
                    }
                    Object objError = NotificationLite.error(th2);
                    if (this.f124178c) {
                        aVar.c(objError);
                    } else {
                        aVar.f(objError);
                    }
                    return;
                }
                this.f124182g = true;
                this.f124180e = true;
                z10 = false;
            }
            if (z10) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f124177b.onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (this.f124182g) {
            return;
        }
        if (t10 == null) {
            this.f124179d.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f124182g) {
                return;
            }
            if (!this.f124180e) {
                this.f124180e = true;
                this.f124177b.onNext(t10);
                a();
            } else {
                io.reactivex.internal.util.a<Object> aVar = this.f124181f;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.util.a<>(4);
                    this.f124181f = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.validate(this.f124179d, eVar)) {
            this.f124179d = eVar;
            this.f124177b.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        this.f124179d.request(j10);
    }
}

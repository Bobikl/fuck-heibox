package io.reactivex.processors;

import io.reactivex.internal.util.NotificationLite;
import jh.f;
import org.reactivestreams.d;
import org.reactivestreams.e;

/* JADX INFO: compiled from: SerializedProcessor.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a<T> f124042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f124043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    io.reactivex.internal.util.a<Object> f124044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f124045f;

    b(a<T> aVar) {
        this.f124042c = aVar;
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable M8() {
        return this.f124042c.M8();
    }

    @Override // io.reactivex.processors.a
    public boolean N8() {
        return this.f124042c.N8();
    }

    @Override // io.reactivex.processors.a
    public boolean O8() {
        return this.f124042c.O8();
    }

    @Override // io.reactivex.processors.a
    public boolean P8() {
        return this.f124042c.P8();
    }

    void R8() {
        io.reactivex.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f124044e;
                if (aVar == null) {
                    this.f124043d = false;
                    return;
                }
                this.f124044e = null;
            }
            aVar.b(this.f124042c);
        }
    }

    @Override // io.reactivex.j
    protected void k6(d<? super T> dVar) {
        this.f124042c.g(dVar);
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (this.f124045f) {
            return;
        }
        synchronized (this) {
            if (this.f124045f) {
                return;
            }
            this.f124045f = true;
            if (!this.f124043d) {
                this.f124043d = true;
                this.f124042c.onComplete();
                return;
            }
            io.reactivex.internal.util.a<Object> aVar = this.f124044e;
            if (aVar == null) {
                aVar = new io.reactivex.internal.util.a<>(4);
                this.f124044e = aVar;
            }
            aVar.c(NotificationLite.complete());
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f124045f) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f124045f) {
                this.f124045f = true;
                if (this.f124043d) {
                    io.reactivex.internal.util.a<Object> aVar = this.f124044e;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f124044e = aVar;
                    }
                    aVar.f(NotificationLite.error(th2));
                    return;
                }
                this.f124043d = true;
                z10 = false;
            }
            if (z10) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f124042c.onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (this.f124045f) {
            return;
        }
        synchronized (this) {
            if (this.f124045f) {
                return;
            }
            if (!this.f124043d) {
                this.f124043d = true;
                this.f124042c.onNext(t10);
                R8();
            } else {
                io.reactivex.internal.util.a<Object> aVar = this.f124044e;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.util.a<>(4);
                    this.f124044e = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // org.reactivestreams.d
    public void onSubscribe(e eVar) {
        boolean z10 = true;
        if (!this.f124045f) {
            synchronized (this) {
                if (!this.f124045f) {
                    if (this.f124043d) {
                        io.reactivex.internal.util.a<Object> aVar = this.f124044e;
                        if (aVar == null) {
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f124044e = aVar;
                        }
                        aVar.c(NotificationLite.subscription(eVar));
                        return;
                    }
                    this.f124043d = true;
                    z10 = false;
                }
            }
        }
        if (z10) {
            eVar.cancel();
        } else {
            this.f124042c.onSubscribe(eVar);
            R8();
        }
    }
}

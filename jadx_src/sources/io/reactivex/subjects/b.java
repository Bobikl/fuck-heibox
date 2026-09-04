package io.reactivex.subjects;

import io.reactivex.g0;
import io.reactivex.internal.util.NotificationLite;
import jh.f;

/* JADX INFO: compiled from: SerializedSubject.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> extends c<T> implements io.reactivex.internal.util.a.InterfaceC1112a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c<T> f124159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f124160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    io.reactivex.internal.util.a<Object> f124161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f124162e;

    b(c<T> cVar) {
        this.f124159b = cVar;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super T> g0Var) {
        this.f124159b.g(g0Var);
    }

    @Override // io.reactivex.subjects.c
    @f
    public Throwable h8() {
        return this.f124159b.h8();
    }

    @Override // io.reactivex.subjects.c
    public boolean i8() {
        return this.f124159b.i8();
    }

    @Override // io.reactivex.subjects.c
    public boolean j8() {
        return this.f124159b.j8();
    }

    @Override // io.reactivex.subjects.c
    public boolean k8() {
        return this.f124159b.k8();
    }

    void m8() {
        io.reactivex.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f124161d;
                if (aVar == null) {
                    this.f124160c = false;
                    return;
                }
                this.f124161d = null;
            }
            aVar.d(this);
        }
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (this.f124162e) {
            return;
        }
        synchronized (this) {
            if (this.f124162e) {
                return;
            }
            this.f124162e = true;
            if (!this.f124160c) {
                this.f124160c = true;
                this.f124159b.onComplete();
                return;
            }
            io.reactivex.internal.util.a<Object> aVar = this.f124161d;
            if (aVar == null) {
                aVar = new io.reactivex.internal.util.a<>(4);
                this.f124161d = aVar;
            }
            aVar.c(NotificationLite.complete());
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        if (this.f124162e) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f124162e) {
                this.f124162e = true;
                if (this.f124160c) {
                    io.reactivex.internal.util.a<Object> aVar = this.f124161d;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f124161d = aVar;
                    }
                    aVar.f(NotificationLite.error(th2));
                    return;
                }
                this.f124160c = true;
                z10 = false;
            }
            if (z10) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f124159b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        if (this.f124162e) {
            return;
        }
        synchronized (this) {
            if (this.f124162e) {
                return;
            }
            if (!this.f124160c) {
                this.f124160c = true;
                this.f124159b.onNext(t10);
                m8();
            } else {
                io.reactivex.internal.util.a<Object> aVar = this.f124161d;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.util.a<>(4);
                    this.f124161d = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        boolean z10 = true;
        if (!this.f124162e) {
            synchronized (this) {
                if (!this.f124162e) {
                    if (this.f124160c) {
                        io.reactivex.internal.util.a<Object> aVar = this.f124161d;
                        if (aVar == null) {
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f124161d = aVar;
                        }
                        aVar.c(NotificationLite.disposable(bVar));
                        return;
                    }
                    this.f124160c = true;
                    z10 = false;
                }
            }
        }
        if (z10) {
            bVar.dispose();
        } else {
            this.f124159b.onSubscribe(bVar);
            m8();
        }
    }

    @Override // io.reactivex.internal.util.a.InterfaceC1112a, kh.r
    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f124159b);
    }
}

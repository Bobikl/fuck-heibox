package io.reactivex.subjects;

import androidx.compose.animation.core.s0;
import io.reactivex.g0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jh.e;
import jh.f;
import lh.o;

/* JADX INFO: loaded from: classes5.dex */
public final class UnicastSubject<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.internal.queue.a<T> f124130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<g0<? super T>> f124131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<Runnable> f124132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f124133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f124134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile boolean f124135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Throwable f124136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final AtomicBoolean f124137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final BasicIntQueueDisposable<T> f124138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f124139k;

    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        UnicastQueueDisposable() {
        }

        @Override // lh.o
        public void clear() {
            UnicastSubject.this.f124130b.clear();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (UnicastSubject.this.f124134f) {
                return;
            }
            UnicastSubject.this.f124134f = true;
            UnicastSubject.this.r8();
            UnicastSubject.this.f124131c.lazySet(null);
            if (UnicastSubject.this.f124138j.getAndIncrement() == 0) {
                UnicastSubject.this.f124131c.lazySet(null);
                UnicastSubject.this.f124130b.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return UnicastSubject.this.f124134f;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return UnicastSubject.this.f124130b.isEmpty();
        }

        @Override // lh.o
        @f
        public T poll() throws Exception {
            return UnicastSubject.this.f124130b.poll();
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.f124139k = true;
            return 2;
        }
    }

    UnicastSubject(int i10, Runnable runnable) {
        this(i10, runnable, true);
    }

    UnicastSubject(int i10, Runnable runnable, boolean z10) {
        this.f124130b = new io.reactivex.internal.queue.a<>(io.reactivex.internal.functions.a.h(i10, "capacityHint"));
        this.f124132d = new AtomicReference<>(io.reactivex.internal.functions.a.g(runnable, "onTerminate"));
        this.f124133e = z10;
        this.f124131c = new AtomicReference<>();
        this.f124137i = new AtomicBoolean();
        this.f124138j = new UnicastQueueDisposable();
    }

    UnicastSubject(int i10, boolean z10) {
        this.f124130b = new io.reactivex.internal.queue.a<>(io.reactivex.internal.functions.a.h(i10, "capacityHint"));
        this.f124132d = new AtomicReference<>();
        this.f124133e = z10;
        this.f124131c = new AtomicReference<>();
        this.f124137i = new AtomicBoolean();
        this.f124138j = new UnicastQueueDisposable();
    }

    @e
    @jh.c
    public static <T> UnicastSubject<T> m8() {
        return new UnicastSubject<>(z.T(), true);
    }

    @e
    @jh.c
    public static <T> UnicastSubject<T> n8(int i10) {
        return new UnicastSubject<>(i10, true);
    }

    @e
    @jh.c
    public static <T> UnicastSubject<T> o8(int i10, Runnable runnable) {
        return new UnicastSubject<>(i10, runnable, true);
    }

    @e
    @jh.c
    public static <T> UnicastSubject<T> p8(int i10, Runnable runnable, boolean z10) {
        return new UnicastSubject<>(i10, runnable, z10);
    }

    @e
    @jh.c
    public static <T> UnicastSubject<T> q8(boolean z10) {
        return new UnicastSubject<>(z.T(), z10);
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super T> g0Var) {
        if (this.f124137i.get() || !this.f124137i.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), g0Var);
            return;
        }
        g0Var.onSubscribe(this.f124138j);
        this.f124131c.lazySet(g0Var);
        if (this.f124134f) {
            this.f124131c.lazySet(null);
        } else {
            s8();
        }
    }

    @Override // io.reactivex.subjects.c
    @f
    public Throwable h8() {
        if (this.f124135g) {
            return this.f124136h;
        }
        return null;
    }

    @Override // io.reactivex.subjects.c
    public boolean i8() {
        return this.f124135g && this.f124136h == null;
    }

    @Override // io.reactivex.subjects.c
    public boolean j8() {
        return this.f124131c.get() != null;
    }

    @Override // io.reactivex.subjects.c
    public boolean k8() {
        return this.f124135g && this.f124136h != null;
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (this.f124135g || this.f124134f) {
            return;
        }
        this.f124135g = true;
        r8();
        s8();
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124135g || this.f124134f) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124136h = th2;
        this.f124135g = true;
        r8();
        s8();
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124135g || this.f124134f) {
            return;
        }
        this.f124130b.offer(t10);
        s8();
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f124135g || this.f124134f) {
            bVar.dispose();
        }
    }

    void r8() {
        Runnable runnable = this.f124132d.get();
        if (runnable == null || !s0.a(this.f124132d, runnable, null)) {
            return;
        }
        runnable.run();
    }

    void s8() {
        if (this.f124138j.getAndIncrement() != 0) {
            return;
        }
        g0<? super T> g0Var = this.f124131c.get();
        int iAddAndGet = 1;
        while (g0Var == null) {
            iAddAndGet = this.f124138j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                g0Var = this.f124131c.get();
            }
        }
        if (this.f124139k) {
            t8(g0Var);
        } else {
            u8(g0Var);
        }
    }

    void t8(g0<? super T> g0Var) {
        io.reactivex.internal.queue.a<T> aVar = this.f124130b;
        int iAddAndGet = 1;
        boolean z10 = !this.f124133e;
        while (!this.f124134f) {
            boolean z11 = this.f124135g;
            if (z10 && z11 && w8(aVar, g0Var)) {
                return;
            }
            g0Var.onNext(null);
            if (z11) {
                v8(g0Var);
                return;
            } else {
                iAddAndGet = this.f124138j.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f124131c.lazySet(null);
        aVar.clear();
    }

    void u8(g0<? super T> g0Var) {
        io.reactivex.internal.queue.a<T> aVar = this.f124130b;
        boolean z10 = !this.f124133e;
        boolean z11 = true;
        int iAddAndGet = 1;
        while (!this.f124134f) {
            boolean z12 = this.f124135g;
            T tPoll = this.f124130b.poll();
            boolean z13 = tPoll == null;
            if (z12) {
                if (z10 && z11) {
                    if (w8(aVar, g0Var)) {
                        return;
                    } else {
                        z11 = false;
                    }
                }
                if (z13) {
                    v8(g0Var);
                    return;
                }
            }
            if (z13) {
                iAddAndGet = this.f124138j.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                g0Var.onNext(tPoll);
            }
        }
        this.f124131c.lazySet(null);
        aVar.clear();
    }

    void v8(g0<? super T> g0Var) {
        this.f124131c.lazySet(null);
        Throwable th2 = this.f124136h;
        if (th2 != null) {
            g0Var.onError(th2);
        } else {
            g0Var.onComplete();
        }
    }

    boolean w8(o<T> oVar, g0<? super T> g0Var) {
        Throwable th2 = this.f124136h;
        if (th2 == null) {
            return false;
        }
        this.f124131c.lazySet(null);
        oVar.clear();
        g0Var.onError(th2);
        return true;
    }
}

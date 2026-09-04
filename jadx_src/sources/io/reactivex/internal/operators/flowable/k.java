package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FlowableBufferTimed.java */
/* JADX INFO: loaded from: classes12.dex */
public final class k<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f121207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f121208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final TimeUnit f121209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final io.reactivex.h0 f121210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Callable<U> f121211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f121212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f121213j;

    /* JADX INFO: compiled from: FlowableBufferTimed.java */
    public static final class a<T, U extends Collection<? super T>> extends io.reactivex.internal.subscribers.h<T, U, U> implements org.reactivestreams.e, Runnable, io.reactivex.disposables.b {
        org.reactivestreams.e G2;
        long G3;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        final Callable<U> f121214b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        final long f121215c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        final TimeUnit f121216p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        final io.reactivex.h0.c f121217p2;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        long f121218p3;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        final int f121219x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        U f121220x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        final boolean f121221y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        io.reactivex.disposables.b f121222y2;

        a(org.reactivestreams.d<? super U> dVar, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, io.reactivex.h0.c cVar) {
            super(dVar, new MpscLinkedQueue());
            this.f121214b0 = callable;
            this.f121215c0 = j10;
            this.f121216p1 = timeUnit;
            this.f121219x1 = i10;
            this.f121221y1 = z10;
            this.f121217p2 = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.Y) {
                return;
            }
            this.Y = true;
            dispose();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            synchronized (this) {
                this.f121220x2 = null;
            }
            this.G2.cancel();
            this.f121217p2.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121217p2.isDisposed();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            U u10;
            synchronized (this) {
                u10 = this.f121220x2;
                this.f121220x2 = null;
            }
            this.X.offer(u10);
            this.Z = true;
            if (b()) {
                io.reactivex.internal.util.n.e(this.X, this.W, false, this, this);
            }
            this.f121217p2.dispose();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f121220x2 = null;
            }
            this.W.onError(th2);
            this.f121217p2.dispose();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f121220x2;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
                if (u10.size() < this.f121219x1) {
                    return;
                }
                this.f121220x2 = null;
                this.f121218p3++;
                if (this.f121221y1) {
                    this.f121222y2.dispose();
                }
                n(u10, false, this);
                try {
                    U u11 = (U) io.reactivex.internal.functions.a.g(this.f121214b0.call(), "The supplied buffer is null");
                    synchronized (this) {
                        this.f121220x2 = u11;
                        this.G3++;
                    }
                    if (this.f121221y1) {
                        io.reactivex.h0.c cVar = this.f121217p2;
                        long j10 = this.f121215c0;
                        this.f121222y2 = cVar.d(this, j10, j10, this.f121216p1);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    cancel();
                    this.W.onError(th2);
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.G2, eVar)) {
                this.G2 = eVar;
                try {
                    this.f121220x2 = (U) io.reactivex.internal.functions.a.g(this.f121214b0.call(), "The supplied buffer is null");
                    this.W.onSubscribe(this);
                    io.reactivex.h0.c cVar = this.f121217p2;
                    long j10 = this.f121215c0;
                    this.f121222y2 = cVar.d(this, j10, j10, this.f121216p1);
                    eVar.request(Long.MAX_VALUE);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f121217p2.dispose();
                    eVar.cancel();
                    EmptySubscription.error(th2, this.W);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.h, io.reactivex.internal.util.m
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean j(org.reactivestreams.d<? super U> dVar, U u10) {
            dVar.onNext(u10);
            return true;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            o(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) io.reactivex.internal.functions.a.g(this.f121214b0.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u11 = this.f121220x2;
                    if (u11 != null && this.f121218p3 == this.G3) {
                        this.f121220x2 = u10;
                        n(u11, false, this);
                    }
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                this.W.onError(th2);
            }
        }
    }

    /* JADX INFO: compiled from: FlowableBufferTimed.java */
    public static final class b<T, U extends Collection<? super T>> extends io.reactivex.internal.subscribers.h<T, U, U> implements org.reactivestreams.e, Runnable, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        final Callable<U> f121223b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        final long f121224c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        final TimeUnit f121225p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        U f121226p2;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        final io.reactivex.h0 f121227x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f121228x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        org.reactivestreams.e f121229y1;

        b(org.reactivestreams.d<? super U> dVar, Callable<U> callable, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            super(dVar, new MpscLinkedQueue());
            this.f121228x2 = new AtomicReference<>();
            this.f121223b0 = callable;
            this.f121224c0 = j10;
            this.f121225p1 = timeUnit;
            this.f121227x1 = h0Var;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.Y = true;
            this.f121229y1.cancel();
            DisposableHelper.dispose(this.f121228x2);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121228x2.get() == DisposableHelper.DISPOSED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            DisposableHelper.dispose(this.f121228x2);
            synchronized (this) {
                U u10 = this.f121226p2;
                if (u10 == null) {
                    return;
                }
                this.f121226p2 = null;
                this.X.offer(u10);
                this.Z = true;
                if (b()) {
                    io.reactivex.internal.util.n.e(this.X, this.W, false, null, this);
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f121228x2);
            synchronized (this) {
                this.f121226p2 = null;
            }
            this.W.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f121226p2;
                if (u10 != null) {
                    u10.add(t10);
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121229y1, eVar)) {
                this.f121229y1 = eVar;
                try {
                    this.f121226p2 = (U) io.reactivex.internal.functions.a.g(this.f121223b0.call(), "The supplied buffer is null");
                    this.W.onSubscribe(this);
                    if (this.Y) {
                        return;
                    }
                    eVar.request(Long.MAX_VALUE);
                    io.reactivex.h0 h0Var = this.f121227x1;
                    long j10 = this.f121224c0;
                    io.reactivex.disposables.b bVarH = h0Var.h(this, j10, j10, this.f121225p1);
                    if (androidx.compose.animation.core.s0.a(this.f121228x2, null, bVarH)) {
                        return;
                    }
                    bVarH.dispose();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    cancel();
                    EmptySubscription.error(th2, this.W);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.h, io.reactivex.internal.util.m
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean j(org.reactivestreams.d<? super U> dVar, U u10) {
            this.W.onNext((Object) u10);
            return true;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            o(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) io.reactivex.internal.functions.a.g(this.f121223b0.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u11 = this.f121226p2;
                    if (u11 == null) {
                        return;
                    }
                    this.f121226p2 = u10;
                    l(u11, false, this);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                this.W.onError(th2);
            }
        }
    }

    /* JADX INFO: compiled from: FlowableBufferTimed.java */
    public static final class c<T, U extends Collection<? super T>> extends io.reactivex.internal.subscribers.h<T, U, U> implements org.reactivestreams.e, Runnable {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        final Callable<U> f121230b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        final long f121231c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        final long f121232p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        final List<U> f121233p2;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        final TimeUnit f121234x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        org.reactivestreams.e f121235x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        final io.reactivex.h0.c f121236y1;

        /* JADX INFO: compiled from: FlowableBufferTimed.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final U f121237b;

            a(U u10) {
                this.f121237b = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f121233p2.remove(this.f121237b);
                }
                c cVar = c.this;
                cVar.n(this.f121237b, false, cVar.f121236y1);
            }
        }

        c(org.reactivestreams.d<? super U> dVar, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0.c cVar) {
            super(dVar, new MpscLinkedQueue());
            this.f121230b0 = callable;
            this.f121231c0 = j10;
            this.f121232p1 = j11;
            this.f121234x1 = timeUnit;
            this.f121236y1 = cVar;
            this.f121233p2 = new LinkedList();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.Y = true;
            this.f121235x2.cancel();
            this.f121236y1.dispose();
            r();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f121233p2);
                this.f121233p2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.X.offer((U) ((Collection) it.next()));
            }
            this.Z = true;
            if (b()) {
                io.reactivex.internal.util.n.e(this.X, this.W, false, this.f121236y1, this);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.Z = true;
            this.f121236y1.dispose();
            r();
            this.W.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            synchronized (this) {
                Iterator<U> it = this.f121233p2.iterator();
                while (it.hasNext()) {
                    it.next().add(t10);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121235x2, eVar)) {
                this.f121235x2 = eVar;
                try {
                    Collection collection = (Collection) io.reactivex.internal.functions.a.g(this.f121230b0.call(), "The supplied buffer is null");
                    this.f121233p2.add((U) collection);
                    this.W.onSubscribe(this);
                    eVar.request(Long.MAX_VALUE);
                    io.reactivex.h0.c cVar = this.f121236y1;
                    long j10 = this.f121232p1;
                    cVar.d(this, j10, j10, this.f121234x1);
                    this.f121236y1.c(new a(collection), this.f121231c0, this.f121234x1);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f121236y1.dispose();
                    eVar.cancel();
                    EmptySubscription.error(th2, this.W);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.h, io.reactivex.internal.util.m
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean j(org.reactivestreams.d<? super U> dVar, U u10) {
            dVar.onNext(u10);
            return true;
        }

        void r() {
            synchronized (this) {
                this.f121233p2.clear();
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            o(j10);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.Y) {
                return;
            }
            try {
                Collection collection = (Collection) io.reactivex.internal.functions.a.g(this.f121230b0.call(), "The supplied buffer is null");
                synchronized (this) {
                    if (this.Y) {
                        return;
                    }
                    this.f121233p2.add((U) collection);
                    this.f121236y1.c(new a(collection), this.f121231c0, this.f121234x1);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                this.W.onError(th2);
            }
        }
    }

    public k(io.reactivex.j<T> jVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var, Callable<U> callable, int i10, boolean z10) {
        super(jVar);
        this.f121207d = j10;
        this.f121208e = j11;
        this.f121209f = timeUnit;
        this.f121210g = h0Var;
        this.f121211h = callable;
        this.f121212i = i10;
        this.f121213j = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        if (this.f121207d == this.f121208e && this.f121212i == Integer.MAX_VALUE) {
            this.f121039c.j6(new b(new io.reactivex.subscribers.e(dVar), this.f121211h, this.f121207d, this.f121209f, this.f121210g));
            return;
        }
        io.reactivex.h0.c cVarC = this.f121210g.c();
        if (this.f121207d == this.f121208e) {
            this.f121039c.j6(new a(new io.reactivex.subscribers.e(dVar), this.f121211h, this.f121207d, this.f121209f, this.f121212i, this.f121213j, cVarC));
        } else {
            this.f121039c.j6(new c(new io.reactivex.subscribers.e(dVar), this.f121211h, this.f121207d, this.f121208e, this.f121209f, cVarC));
        }
    }
}

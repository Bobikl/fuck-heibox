package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableBufferTimed.java */
/* JADX INFO: loaded from: classes5.dex */
public final class m<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f122955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f122956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f122957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Callable<U> f122958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f122959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f122960i;

    /* JADX INFO: compiled from: ObservableBufferTimed.java */
    public static final class a<T, U extends Collection<? super T>> extends io.reactivex.internal.observers.k<T, U, U> implements Runnable, io.reactivex.disposables.b {
        final Callable<U> L;
        final long M;
        final TimeUnit N;
        final int O;
        final boolean P;
        final io.reactivex.h0.c Q;
        U R;
        io.reactivex.disposables.b S;
        io.reactivex.disposables.b T;
        long U;
        long V;

        a(io.reactivex.g0<? super U> g0Var, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, io.reactivex.h0.c cVar) {
            super(g0Var, new MpscLinkedQueue());
            this.L = callable;
            this.M = j10;
            this.N = timeUnit;
            this.O = i10;
            this.P = z10;
            this.Q = cVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.T.dispose();
            this.Q.dispose();
            synchronized (this) {
                this.R = null;
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.I;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.k, io.reactivex.internal.util.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void f(io.reactivex.g0<? super U> g0Var, U u10) {
            g0Var.onNext(u10);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            U u10;
            this.Q.dispose();
            synchronized (this) {
                u10 = this.R;
                this.R = null;
            }
            this.H.offer(u10);
            this.J = true;
            if (b()) {
                io.reactivex.internal.util.n.d(this.H, this.G, false, this, this);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            synchronized (this) {
                this.R = null;
            }
            this.G.onError(th2);
            this.Q.dispose();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.R;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
                if (u10.size() < this.O) {
                    return;
                }
                this.R = null;
                this.U++;
                if (this.P) {
                    this.S.dispose();
                }
                k(u10, false, this);
                try {
                    U u11 = (U) io.reactivex.internal.functions.a.g(this.L.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.R = u11;
                        this.V++;
                    }
                    if (this.P) {
                        io.reactivex.h0.c cVar = this.Q;
                        long j10 = this.M;
                        this.S = cVar.d(this, j10, j10, this.N);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.G.onError(th2);
                    dispose();
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.T, bVar)) {
                this.T = bVar;
                try {
                    this.R = (U) io.reactivex.internal.functions.a.g(this.L.call(), "The buffer supplied is null");
                    this.G.onSubscribe(this);
                    io.reactivex.h0.c cVar = this.Q;
                    long j10 = this.M;
                    this.S = cVar.d(this, j10, j10, this.N);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    bVar.dispose();
                    EmptyDisposable.error(th2, this.G);
                    this.Q.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) io.reactivex.internal.functions.a.g(this.L.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u11 = this.R;
                    if (u11 != null && this.U == this.V) {
                        this.R = u10;
                        k(u11, false, this);
                    }
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                dispose();
                this.G.onError(th2);
            }
        }
    }

    /* JADX INFO: compiled from: ObservableBufferTimed.java */
    public static final class b<T, U extends Collection<? super T>> extends io.reactivex.internal.observers.k<T, U, U> implements Runnable, io.reactivex.disposables.b {
        final Callable<U> L;
        final long M;
        final TimeUnit N;
        final io.reactivex.h0 O;
        io.reactivex.disposables.b P;
        U Q;
        final AtomicReference<io.reactivex.disposables.b> R;

        b(io.reactivex.g0<? super U> g0Var, Callable<U> callable, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            super(g0Var, new MpscLinkedQueue());
            this.R = new AtomicReference<>();
            this.L = callable;
            this.M = j10;
            this.N = timeUnit;
            this.O = h0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.R);
            this.P.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.R.get() == DisposableHelper.DISPOSED;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.observers.k, io.reactivex.internal.util.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void f(io.reactivex.g0<? super U> g0Var, U u10) {
            this.G.onNext((Object) u10);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            U u10;
            synchronized (this) {
                u10 = this.Q;
                this.Q = null;
            }
            if (u10 != null) {
                this.H.offer(u10);
                this.J = true;
                if (b()) {
                    io.reactivex.internal.util.n.d(this.H, this.G, false, null, this);
                }
            }
            DisposableHelper.dispose(this.R);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            synchronized (this) {
                this.Q = null;
            }
            this.G.onError(th2);
            DisposableHelper.dispose(this.R);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.Q;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.P, bVar)) {
                this.P = bVar;
                try {
                    this.Q = (U) io.reactivex.internal.functions.a.g(this.L.call(), "The buffer supplied is null");
                    this.G.onSubscribe(this);
                    if (this.I) {
                        return;
                    }
                    io.reactivex.h0 h0Var = this.O;
                    long j10 = this.M;
                    io.reactivex.disposables.b bVarH = h0Var.h(this, j10, j10, this.N);
                    if (androidx.compose.animation.core.s0.a(this.R, null, bVarH)) {
                        return;
                    }
                    bVarH.dispose();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    dispose();
                    EmptyDisposable.error(th2, this.G);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u10;
            try {
                U u11 = (U) io.reactivex.internal.functions.a.g(this.L.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u10 = this.Q;
                    if (u10 != null) {
                        this.Q = u11;
                    }
                }
                if (u10 == null) {
                    DisposableHelper.dispose(this.R);
                } else {
                    j(u10, false, this);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.G.onError(th2);
                dispose();
            }
        }
    }

    /* JADX INFO: compiled from: ObservableBufferTimed.java */
    public static final class c<T, U extends Collection<? super T>> extends io.reactivex.internal.observers.k<T, U, U> implements Runnable, io.reactivex.disposables.b {
        final Callable<U> L;
        final long M;
        final long N;
        final TimeUnit O;
        final io.reactivex.h0.c P;
        final List<U> Q;
        io.reactivex.disposables.b R;

        /* JADX INFO: compiled from: ObservableBufferTimed.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final U f122961b;

            a(U u10) {
                this.f122961b = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.Q.remove(this.f122961b);
                }
                c cVar = c.this;
                cVar.k(this.f122961b, false, cVar.P);
            }
        }

        /* JADX INFO: compiled from: ObservableBufferTimed.java */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final U f122963b;

            b(U u10) {
                this.f122963b = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.Q.remove(this.f122963b);
                }
                c cVar = c.this;
                cVar.k(this.f122963b, false, cVar.P);
            }
        }

        c(io.reactivex.g0<? super U> g0Var, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0.c cVar) {
            super(g0Var, new MpscLinkedQueue());
            this.L = callable;
            this.M = j10;
            this.N = j11;
            this.O = timeUnit;
            this.P = cVar;
            this.Q = new LinkedList();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.I) {
                return;
            }
            this.I = true;
            o();
            this.R.dispose();
            this.P.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.I;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.k, io.reactivex.internal.util.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void f(io.reactivex.g0<? super U> g0Var, U u10) {
            g0Var.onNext(u10);
        }

        void o() {
            synchronized (this) {
                this.Q.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.Q);
                this.Q.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.H.offer((U) ((Collection) it.next()));
            }
            this.J = true;
            if (b()) {
                io.reactivex.internal.util.n.d(this.H, this.G, false, this.P, this);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.J = true;
            o();
            this.G.onError(th2);
            this.P.dispose();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            synchronized (this) {
                Iterator<U> it = this.Q.iterator();
                while (it.hasNext()) {
                    it.next().add(t10);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.R, bVar)) {
                this.R = bVar;
                try {
                    Collection collection = (Collection) io.reactivex.internal.functions.a.g(this.L.call(), "The buffer supplied is null");
                    this.Q.add((U) collection);
                    this.G.onSubscribe(this);
                    io.reactivex.h0.c cVar = this.P;
                    long j10 = this.N;
                    cVar.d(this, j10, j10, this.O);
                    this.P.c(new b(collection), this.M, this.O);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    bVar.dispose();
                    EmptyDisposable.error(th2, this.G);
                    this.P.dispose();
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.I) {
                return;
            }
            try {
                Collection collection = (Collection) io.reactivex.internal.functions.a.g(this.L.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.I) {
                        return;
                    }
                    this.Q.add((U) collection);
                    this.P.c(new a(collection), this.M, this.O);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.G.onError(th2);
                dispose();
            }
        }
    }

    public m(io.reactivex.e0<T> e0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var, Callable<U> callable, int i10, boolean z10) {
        super(e0Var);
        this.f122954c = j10;
        this.f122955d = j11;
        this.f122956e = timeUnit;
        this.f122957f = h0Var;
        this.f122958g = callable;
        this.f122959h = i10;
        this.f122960i = z10;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super U> g0Var) {
        if (this.f122954c == this.f122955d && this.f122959h == Integer.MAX_VALUE) {
            this.f122785b.g(new b(new io.reactivex.observers.l(g0Var), this.f122958g, this.f122954c, this.f122956e, this.f122957f));
            return;
        }
        io.reactivex.h0.c cVarC = this.f122957f.c();
        if (this.f122954c == this.f122955d) {
            this.f122785b.g(new a(new io.reactivex.observers.l(g0Var), this.f122958g, this.f122954c, this.f122956e, this.f122959h, this.f122960i, cVarC));
        } else {
            this.f122785b.g(new c(new io.reactivex.observers.l(g0Var), this.f122958g, this.f122954c, this.f122955d, this.f122956e, cVarC));
        }
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
/* JADX INFO: loaded from: classes5.dex */
public final class w1<T, B, V> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.z<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<B> f123124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super B, ? extends io.reactivex.e0<V>> f123125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f123126e;

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class a<T, V> extends io.reactivex.observers.d<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T, ?, V> f123127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final UnicastSubject<T> f123128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f123129d;

        a(c<T, ?, V> cVar, UnicastSubject<T> unicastSubject) {
            this.f123127b = cVar;
            this.f123128c = unicastSubject;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123129d) {
                return;
            }
            this.f123129d = true;
            this.f123127b.l(this);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f123129d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123129d = true;
                this.f123127b.o(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(V v10) {
            dispose();
            onComplete();
        }
    }

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class b<T, B> extends io.reactivex.observers.d<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T, B, ?> f123130b;

        b(c<T, B, ?> cVar) {
            this.f123130b = cVar;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123130b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123130b.o(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(B b10) {
            this.f123130b.p(b10);
        }
    }

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class c<T, B, V> extends io.reactivex.internal.observers.k<T, Object, io.reactivex.z<T>> implements io.reactivex.disposables.b {
        final io.reactivex.e0<B> L;
        final kh.o<? super B, ? extends io.reactivex.e0<V>> M;
        final int N;
        final io.reactivex.disposables.a O;
        io.reactivex.disposables.b P;
        final AtomicReference<io.reactivex.disposables.b> Q;
        final List<UnicastSubject<T>> R;
        final AtomicLong S;
        final AtomicBoolean T;

        c(io.reactivex.g0<? super io.reactivex.z<T>> g0Var, io.reactivex.e0<B> e0Var, kh.o<? super B, ? extends io.reactivex.e0<V>> oVar, int i10) {
            super(g0Var, new MpscLinkedQueue());
            this.Q = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.S = atomicLong;
            this.T = new AtomicBoolean();
            this.L = e0Var;
            this.M = oVar;
            this.N = i10;
            this.O = new io.reactivex.disposables.a();
            this.R = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.T.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.Q);
                if (this.S.decrementAndGet() == 0) {
                    this.P.dispose();
                }
            }
        }

        @Override // io.reactivex.internal.observers.k, io.reactivex.internal.util.j
        public void f(io.reactivex.g0<? super io.reactivex.z<T>> g0Var, Object obj) {
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.T.get();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void l(a<T, V> aVar) {
            this.O.b(aVar);
            this.H.offer((U) new d(aVar.f123128c, null));
            if (b()) {
                n();
            }
        }

        void m() {
            this.O.dispose();
            DisposableHelper.dispose(this.Q);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void n() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.H;
            io.reactivex.g0<? super V> g0Var = this.G;
            List<UnicastSubject<T>> list = this.R;
            int iA = 1;
            while (true) {
                boolean z10 = this.J;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    m();
                    Throwable th2 = this.K;
                    if (th2 != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar = (d) objPoll;
                    UnicastSubject<T> unicastSubject = dVar.f123131a;
                    if (unicastSubject != null) {
                        if (list.remove(unicastSubject)) {
                            dVar.f123131a.onComplete();
                            if (this.S.decrementAndGet() == 0) {
                                m();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.T.get()) {
                        UnicastSubject<T> unicastSubjectN8 = UnicastSubject.n8(this.N);
                        list.add(unicastSubjectN8);
                        g0Var.onNext(unicastSubjectN8);
                        try {
                            io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.M.apply(dVar.f123132b), "The ObservableSource supplied is null");
                            a aVar = new a(this, unicastSubjectN8);
                            if (this.O.c(aVar)) {
                                this.S.getAndIncrement();
                                e0Var.g(aVar);
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            this.T.set(true);
                            g0Var.onError(th3);
                        }
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        void o(Throwable th2) {
            this.P.dispose();
            this.O.dispose();
            onError(th2);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.J) {
                return;
            }
            this.J = true;
            if (b()) {
                n();
            }
            if (this.S.decrementAndGet() == 0) {
                this.O.dispose();
            }
            this.G.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.J) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.K = th2;
            this.J = true;
            if (b()) {
                n();
            }
            if (this.S.decrementAndGet() == 0) {
                this.O.dispose();
            }
            this.G.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (g()) {
                Iterator<UnicastSubject<T>> it = this.R.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.H.offer((U) NotificationLite.next(t10));
                if (!b()) {
                    return;
                }
            }
            n();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.P, bVar)) {
                this.P = bVar;
                this.G.onSubscribe(this);
                if (this.T.get()) {
                    return;
                }
                b bVar2 = new b(this);
                if (androidx.compose.animation.core.s0.a(this.Q, null, bVar2)) {
                    this.L.g(bVar2);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void p(B b10) {
            this.H.offer((U) new d(null, b10));
            if (b()) {
                n();
            }
        }
    }

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class d<T, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final UnicastSubject<T> f123131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final B f123132b;

        d(UnicastSubject<T> unicastSubject, B b10) {
            this.f123131a = unicastSubject;
            this.f123132b = b10;
        }
    }

    public w1(io.reactivex.e0<T> e0Var, io.reactivex.e0<B> e0Var2, kh.o<? super B, ? extends io.reactivex.e0<V>> oVar, int i10) {
        super(e0Var);
        this.f123124c = e0Var2;
        this.f123125d = oVar;
        this.f123126e = i10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super io.reactivex.z<T>> g0Var) {
        this.f122785b.g(new c(new io.reactivex.observers.l(g0Var), this.f123124c, this.f123125d, this.f123126e));
    }
}

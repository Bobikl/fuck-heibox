package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableWindowTimed.java */
/* JADX INFO: loaded from: classes5.dex */
public final class x1<T> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.z<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f123139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f123140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f123141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f123142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f123143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f123144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f123145i;

    /* JADX INFO: compiled from: ObservableWindowTimed.java */
    public static final class a<T> extends io.reactivex.internal.observers.k<T, Object, io.reactivex.z<T>> implements io.reactivex.disposables.b {
        final long L;
        final TimeUnit M;
        final io.reactivex.h0 N;
        final int O;
        final boolean P;
        final long Q;
        final io.reactivex.h0.c R;
        long S;
        long T;
        io.reactivex.disposables.b U;
        UnicastSubject<T> V;
        volatile boolean W;
        final AtomicReference<io.reactivex.disposables.b> X;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.x1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableWindowTimed.java */
        public static final class RunnableC1104a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final long f123146b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final a<?> f123147c;

            RunnableC1104a(long j10, a<?> aVar) {
                this.f123146b = j10;
                this.f123147c = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.f123147c;
                if (((io.reactivex.internal.observers.k) aVar).I) {
                    aVar.W = true;
                    aVar.n();
                } else {
                    ((io.reactivex.internal.observers.k) aVar).H.offer(this);
                }
                if (aVar.b()) {
                    aVar.o();
                }
            }
        }

        a(io.reactivex.g0<? super io.reactivex.z<T>> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, long j11, boolean z10) {
            super(g0Var, new MpscLinkedQueue());
            this.X = new AtomicReference<>();
            this.L = j10;
            this.M = timeUnit;
            this.N = h0Var;
            this.O = i10;
            this.Q = j11;
            this.P = z10;
            if (z10) {
                this.R = h0Var.c();
            } else {
                this.R = null;
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.I = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.I;
        }

        void n() {
            DisposableHelper.dispose(this.X);
            io.reactivex.h0.c cVar = this.R;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        void o() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.H;
            io.reactivex.g0<? super V> g0Var = this.G;
            UnicastSubject<T> unicastSubject = this.V;
            int iA = 1;
            while (!this.W) {
                boolean z10 = this.J;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC1104a;
                if (z10 && (z11 || z12)) {
                    this.V = null;
                    mpscLinkedQueue.clear();
                    n();
                    Throwable th2 = this.K;
                    if (th2 != null) {
                        unicastSubject.onError(th2);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (z12) {
                    RunnableC1104a runnableC1104a = (RunnableC1104a) objPoll;
                    if (this.P || this.T == runnableC1104a.f123146b) {
                        unicastSubject.onComplete();
                        this.S = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.n8(this.O);
                        this.V = unicastSubject;
                        g0Var.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                    long j10 = this.S + 1;
                    if (j10 >= this.Q) {
                        this.T++;
                        this.S = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.n8(this.O);
                        this.V = unicastSubject;
                        this.G.onNext(unicastSubject);
                        if (this.P) {
                            io.reactivex.disposables.b bVar = this.X.get();
                            bVar.dispose();
                            io.reactivex.h0.c cVar = this.R;
                            RunnableC1104a runnableC1104a2 = new RunnableC1104a(this.T, this);
                            long j11 = this.L;
                            io.reactivex.disposables.b bVarD = cVar.d(runnableC1104a2, j11, j11, this.M);
                            if (!androidx.compose.animation.core.s0.a(this.X, bVar, bVarD)) {
                                bVarD.dispose();
                            }
                        }
                    } else {
                        this.S = j10;
                    }
                }
            }
            this.U.dispose();
            mpscLinkedQueue.clear();
            n();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.J = true;
            if (b()) {
                o();
            }
            this.G.onComplete();
            n();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.K = th2;
            this.J = true;
            if (b()) {
                o();
            }
            this.G.onError(th2);
            n();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.W) {
                return;
            }
            if (g()) {
                UnicastSubject<T> unicastSubject = this.V;
                unicastSubject.onNext(t10);
                long j10 = this.S + 1;
                if (j10 >= this.Q) {
                    this.T++;
                    this.S = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> unicastSubjectN8 = UnicastSubject.n8(this.O);
                    this.V = unicastSubjectN8;
                    this.G.onNext(unicastSubjectN8);
                    if (this.P) {
                        this.X.get().dispose();
                        io.reactivex.h0.c cVar = this.R;
                        RunnableC1104a runnableC1104a = new RunnableC1104a(this.T, this);
                        long j11 = this.L;
                        DisposableHelper.replace(this.X, cVar.d(runnableC1104a, j11, j11, this.M));
                    }
                } else {
                    this.S = j10;
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
            o();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            io.reactivex.disposables.b bVarH;
            if (DisposableHelper.validate(this.U, bVar)) {
                this.U = bVar;
                io.reactivex.g0<? super V> g0Var = this.G;
                g0Var.onSubscribe(this);
                if (this.I) {
                    return;
                }
                UnicastSubject<T> unicastSubjectN8 = UnicastSubject.n8(this.O);
                this.V = unicastSubjectN8;
                g0Var.onNext(unicastSubjectN8);
                RunnableC1104a runnableC1104a = new RunnableC1104a(this.T, this);
                if (this.P) {
                    io.reactivex.h0.c cVar = this.R;
                    long j10 = this.L;
                    bVarH = cVar.d(runnableC1104a, j10, j10, this.M);
                } else {
                    io.reactivex.h0 h0Var = this.N;
                    long j11 = this.L;
                    bVarH = h0Var.h(runnableC1104a, j11, j11, this.M);
                }
                DisposableHelper.replace(this.X, bVarH);
            }
        }
    }

    /* JADX INFO: compiled from: ObservableWindowTimed.java */
    public static final class b<T> extends io.reactivex.internal.observers.k<T, Object, io.reactivex.z<T>> implements io.reactivex.g0<T>, io.reactivex.disposables.b, Runnable {
        static final Object T = new Object();
        final long L;
        final TimeUnit M;
        final io.reactivex.h0 N;
        final int O;
        io.reactivex.disposables.b P;
        UnicastSubject<T> Q;
        final AtomicReference<io.reactivex.disposables.b> R;
        volatile boolean S;

        b(io.reactivex.g0<? super io.reactivex.z<T>> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10) {
            super(g0Var, new MpscLinkedQueue());
            this.R = new AtomicReference<>();
            this.L = j10;
            this.M = timeUnit;
            this.N = h0Var;
            this.O = i10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.I = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.I;
        }

        void l() {
            DisposableHelper.dispose(this.R);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        void m() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.H;
            io.reactivex.g0<? super V> g0Var = this.G;
            UnicastSubject<T> unicastSubject = this.Q;
            int iA = 1;
            while (true) {
                boolean z10 = this.S;
                boolean z11 = this.J;
                Object objPoll = mpscLinkedQueue.poll();
                if (z11 && (objPoll == null || objPoll == T)) {
                    break;
                }
                if (objPoll == null) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (objPoll == T) {
                    unicastSubject.onComplete();
                    if (z10) {
                        this.P.dispose();
                    } else {
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.n8(this.O);
                        this.Q = unicastSubject;
                        g0Var.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                }
            }
            this.Q = null;
            mpscLinkedQueue.clear();
            l();
            Throwable th2 = this.K;
            if (th2 != null) {
                unicastSubject.onError(th2);
            } else {
                unicastSubject.onComplete();
            }
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.J = true;
            if (b()) {
                m();
            }
            l();
            this.G.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.K = th2;
            this.J = true;
            if (b()) {
                m();
            }
            l();
            this.G.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.S) {
                return;
            }
            if (g()) {
                this.Q.onNext(t10);
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.H.offer((U) NotificationLite.next(t10));
                if (!b()) {
                    return;
                }
            }
            m();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.P, bVar)) {
                this.P = bVar;
                this.Q = UnicastSubject.n8(this.O);
                io.reactivex.g0<? super V> g0Var = this.G;
                g0Var.onSubscribe(this);
                g0Var.onNext(this.Q);
                if (this.I) {
                    return;
                }
                io.reactivex.h0 h0Var = this.N;
                long j10 = this.L;
                DisposableHelper.replace(this.R, h0Var.h(this, j10, j10, this.M));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.I) {
                this.S = true;
                l();
            }
            this.H.offer((U) T);
            if (b()) {
                m();
            }
        }
    }

    /* JADX INFO: compiled from: ObservableWindowTimed.java */
    public static final class c<T> extends io.reactivex.internal.observers.k<T, Object, io.reactivex.z<T>> implements io.reactivex.disposables.b, Runnable {
        final long L;
        final long M;
        final TimeUnit N;
        final io.reactivex.h0.c O;
        final int P;
        final List<UnicastSubject<T>> Q;
        io.reactivex.disposables.b R;
        volatile boolean S;

        /* JADX INFO: compiled from: ObservableWindowTimed.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final UnicastSubject<T> f123148b;

            a(UnicastSubject<T> unicastSubject) {
                this.f123148b = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.l(this.f123148b);
            }
        }

        /* JADX INFO: compiled from: ObservableWindowTimed.java */
        public static final class b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final UnicastSubject<T> f123150a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final boolean f123151b;

            b(UnicastSubject<T> unicastSubject, boolean z10) {
                this.f123150a = unicastSubject;
                this.f123151b = z10;
            }
        }

        c(io.reactivex.g0<? super io.reactivex.z<T>> g0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0.c cVar, int i10) {
            super(g0Var, new MpscLinkedQueue());
            this.L = j10;
            this.M = j11;
            this.N = timeUnit;
            this.O = cVar;
            this.P = i10;
            this.Q = new LinkedList();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.I = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.I;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void l(UnicastSubject<T> unicastSubject) {
            this.H.offer((U) new b(unicastSubject, false));
            if (b()) {
                n();
            }
        }

        void m() {
            this.O.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void n() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.H;
            io.reactivex.g0<? super V> g0Var = this.G;
            List<UnicastSubject<T>> list = this.Q;
            int iA = 1;
            while (!this.S) {
                boolean z10 = this.J;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    mpscLinkedQueue.clear();
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
                    m();
                    list.clear();
                    return;
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f123151b) {
                        list.remove(bVar.f123150a);
                        bVar.f123150a.onComplete();
                        if (list.isEmpty() && this.I) {
                            this.S = true;
                        }
                    } else if (!this.I) {
                        UnicastSubject<T> unicastSubjectN8 = UnicastSubject.n8(this.P);
                        list.add(unicastSubjectN8);
                        g0Var.onNext(unicastSubjectN8);
                        this.O.c(new a(unicastSubjectN8), this.L, this.N);
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.R.dispose();
            m();
            mpscLinkedQueue.clear();
            list.clear();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.J = true;
            if (b()) {
                n();
            }
            this.G.onComplete();
            m();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.K = th2;
            this.J = true;
            if (b()) {
                n();
            }
            this.G.onError(th2);
            m();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (g()) {
                Iterator<UnicastSubject<T>> it = this.Q.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.H.offer((U) t10);
                if (!b()) {
                    return;
                }
            }
            n();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.R, bVar)) {
                this.R = bVar;
                this.G.onSubscribe(this);
                if (this.I) {
                    return;
                }
                UnicastSubject<T> unicastSubjectN8 = UnicastSubject.n8(this.P);
                this.Q.add(unicastSubjectN8);
                this.G.onNext(unicastSubjectN8);
                this.O.c(new a(unicastSubjectN8), this.L, this.N);
                io.reactivex.h0.c cVar = this.O;
                long j10 = this.M;
                cVar.d(this, j10, j10, this.N);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(UnicastSubject.n8(this.P), true);
            if (!this.I) {
                this.H.offer((U) bVar);
            }
            if (b()) {
                n();
            }
        }
    }

    public x1(io.reactivex.e0<T> e0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var, long j12, int i10, boolean z10) {
        super(e0Var);
        this.f123139c = j10;
        this.f123140d = j11;
        this.f123141e = timeUnit;
        this.f123142f = h0Var;
        this.f123143g = j12;
        this.f123144h = i10;
        this.f123145i = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super io.reactivex.z<T>> g0Var) {
        io.reactivex.observers.l lVar = new io.reactivex.observers.l(g0Var);
        long j10 = this.f123139c;
        long j11 = this.f123140d;
        if (j10 != j11) {
            this.f122785b.g(new c(lVar, j10, j11, this.f123141e, this.f123142f.c(), this.f123144h));
            return;
        }
        long j12 = this.f123143g;
        if (j12 == Long.MAX_VALUE) {
            this.f122785b.g(new b(lVar, this.f123139c, this.f123141e, this.f123142f, this.f123144h));
        } else {
            this.f122785b.g(new a(lVar, j10, this.f123141e, this.f123142f, this.f123144h, j12, this.f123145i));
        }
    }
}

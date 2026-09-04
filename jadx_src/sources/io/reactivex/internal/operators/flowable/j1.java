package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: FlowableWindowTimed.java */
/* JADX INFO: loaded from: classes12.dex */
public final class j1<T> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.j<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f121169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f121170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final TimeUnit f121171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final io.reactivex.h0 f121172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f121173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f121174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f121175j;

    /* JADX INFO: compiled from: FlowableWindowTimed.java */
    public static final class a<T> extends io.reactivex.internal.subscribers.h<T, Object, io.reactivex.j<T>> implements org.reactivestreams.e {
        long G2;
        UnicastProcessor<T> G3;
        volatile boolean J3;
        final SequentialDisposable K3;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        final long f121176b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        final TimeUnit f121177c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        final io.reactivex.h0 f121178p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        final long f121179p2;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        org.reactivestreams.e f121180p3;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        final int f121181x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        final io.reactivex.h0.c f121182x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        final boolean f121183y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        long f121184y2;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.j1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FlowableWindowTimed.java */
        public static final class RunnableC1098a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final long f121185b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final a<?> f121186c;

            RunnableC1098a(long j10, a<?> aVar) {
                this.f121185b = j10;
                this.f121186c = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.f121186c;
                if (((io.reactivex.internal.subscribers.h) aVar).Y) {
                    aVar.J3 = true;
                    aVar.dispose();
                } else {
                    ((io.reactivex.internal.subscribers.h) aVar).X.offer(this);
                }
                if (aVar.b()) {
                    aVar.r();
                }
            }
        }

        a(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, long j11, boolean z10) {
            super(dVar, new MpscLinkedQueue());
            this.K3 = new SequentialDisposable();
            this.f121176b0 = j10;
            this.f121177c0 = timeUnit;
            this.f121178p1 = h0Var;
            this.f121181x1 = i10;
            this.f121179p2 = j11;
            this.f121183y1 = z10;
            if (z10) {
                this.f121182x2 = h0Var.c();
            } else {
                this.f121182x2 = null;
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.Y = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.K3);
            io.reactivex.h0.c cVar = this.f121182x2;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.Z = true;
            if (b()) {
                r();
            }
            this.W.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123809a0 = th2;
            this.Z = true;
            if (b()) {
                r();
            }
            this.W.onError(th2);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.J3) {
                return;
            }
            if (k()) {
                UnicastProcessor<T> unicastProcessor = this.G3;
                unicastProcessor.onNext(t10);
                long j10 = this.f121184y2 + 1;
                if (j10 >= this.f121179p2) {
                    this.G2++;
                    this.f121184y2 = 0L;
                    unicastProcessor.onComplete();
                    long jF = f();
                    if (jF == 0) {
                        this.G3 = null;
                        this.f121180p3.cancel();
                        this.W.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        dispose();
                        return;
                    }
                    UnicastProcessor<T> unicastProcessorT8 = UnicastProcessor.T8(this.f121181x1);
                    this.G3 = unicastProcessorT8;
                    this.W.onNext(unicastProcessorT8);
                    if (jF != Long.MAX_VALUE) {
                        g(1L);
                    }
                    if (this.f121183y1) {
                        this.K3.get().dispose();
                        io.reactivex.h0.c cVar = this.f121182x2;
                        RunnableC1098a runnableC1098a = new RunnableC1098a(this.G2, this);
                        long j11 = this.f121176b0;
                        this.K3.a(cVar.d(runnableC1098a, j11, j11, this.f121177c0));
                    }
                } else {
                    this.f121184y2 = j10;
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.X.offer((U) NotificationLite.next(t10));
                if (!b()) {
                    return;
                }
            }
            r();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            io.reactivex.disposables.b bVarH;
            if (SubscriptionHelper.validate(this.f121180p3, eVar)) {
                this.f121180p3 = eVar;
                org.reactivestreams.d<? super V> dVar = this.W;
                dVar.onSubscribe(this);
                if (this.Y) {
                    return;
                }
                UnicastProcessor<T> unicastProcessorT8 = UnicastProcessor.T8(this.f121181x1);
                this.G3 = unicastProcessorT8;
                long jF = f();
                if (jF == 0) {
                    this.Y = true;
                    eVar.cancel();
                    dVar.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    return;
                }
                dVar.onNext(unicastProcessorT8);
                if (jF != Long.MAX_VALUE) {
                    g(1L);
                }
                RunnableC1098a runnableC1098a = new RunnableC1098a(this.G2, this);
                if (this.f121183y1) {
                    io.reactivex.h0.c cVar = this.f121182x2;
                    long j10 = this.f121176b0;
                    bVarH = cVar.d(runnableC1098a, j10, j10, this.f121177c0);
                } else {
                    io.reactivex.h0 h0Var = this.f121178p1;
                    long j11 = this.f121176b0;
                    bVarH = h0Var.h(runnableC1098a, j11, j11, this.f121177c0);
                }
                if (this.K3.a(bVarH)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        void r() {
            UnicastProcessor<T> unicastProcessorT8;
            lh.o oVar = this.X;
            org.reactivestreams.d<? super V> dVar = this.W;
            UnicastProcessor<T> unicastProcessor = this.G3;
            int iA = 1;
            while (!this.J3) {
                boolean z10 = this.Z;
                Object objPoll = oVar.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC1098a;
                if (z10 && (z11 || z12)) {
                    this.G3 = null;
                    oVar.clear();
                    Throwable th2 = this.f123809a0;
                    if (th2 != null) {
                        ((UnicastProcessor) unicastProcessor).onError(th2);
                    } else {
                        ((UnicastProcessor) unicastProcessor).onComplete();
                    }
                    dispose();
                    return;
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else {
                    int i10 = iA;
                    if (z12) {
                        RunnableC1098a runnableC1098a = (RunnableC1098a) objPoll;
                        if (this.f121183y1 || this.G2 == runnableC1098a.f121185b) {
                            unicastProcessor = unicastProcessor;
                            ((UnicastProcessor) unicastProcessor).onComplete();
                            this.f121184y2 = 0L;
                            unicastProcessorT8 = UnicastProcessor.T8(this.f121181x1);
                            this.G3 = unicastProcessorT8;
                            long jF = f();
                            if (jF == 0) {
                                this.G3 = null;
                                this.X.clear();
                                this.f121180p3.cancel();
                                dVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                dispose();
                                return;
                            }
                            dVar.onNext(unicastProcessorT8);
                            if (jF != Long.MAX_VALUE) {
                                unicastProcessor = unicastProcessorT8;
                                g(1L);
                                unicastProcessor = unicastProcessorT8;
                            }
                        }
                    } else {
                        ((UnicastProcessor) unicastProcessor).onNext(NotificationLite.getValue(objPoll));
                        long j10 = this.f121184y2 + 1;
                        if (j10 >= this.f121179p2) {
                            this.G2++;
                            this.f121184y2 = 0L;
                            ((UnicastProcessor) unicastProcessor).onComplete();
                            long jF2 = f();
                            if (jF2 == 0) {
                                this.G3 = null;
                                this.f121180p3.cancel();
                                this.W.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                                dispose();
                                return;
                            }
                            UnicastProcessor<T> unicastProcessorT9 = UnicastProcessor.T8(this.f121181x1);
                            this.G3 = unicastProcessorT9;
                            this.W.onNext(unicastProcessorT9);
                            if (jF2 != Long.MAX_VALUE) {
                                g(1L);
                            }
                            if (this.f121183y1) {
                                this.K3.get().dispose();
                                io.reactivex.h0.c cVar = this.f121182x2;
                                RunnableC1098a runnableC1098a2 = new RunnableC1098a(this.G2, this);
                                long j11 = this.f121176b0;
                                this.K3.a(cVar.d(runnableC1098a2, j11, j11, this.f121177c0));
                            }
                            unicastProcessor = unicastProcessorT9;
                        } else {
                            this.f121184y2 = j10;
                            unicastProcessor = unicastProcessor;
                        }
                    }
                    unicastProcessor = unicastProcessorT8;
                    unicastProcessor = unicastProcessor;
                    iA = i10;
                }
            }
            this.f121180p3.cancel();
            oVar.clear();
            dispose();
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            o(j10);
        }
    }

    /* JADX INFO: compiled from: FlowableWindowTimed.java */
    public static final class b<T> extends io.reactivex.internal.subscribers.h<T, Object, io.reactivex.j<T>> implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {
        static final Object G2 = new Object();

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        final long f121187b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        final TimeUnit f121188c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        final io.reactivex.h0 f121189p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        UnicastProcessor<T> f121190p2;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        final int f121191x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        final SequentialDisposable f121192x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        org.reactivestreams.e f121193y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        volatile boolean f121194y2;

        b(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10) {
            super(dVar, new MpscLinkedQueue());
            this.f121192x2 = new SequentialDisposable();
            this.f121187b0 = j10;
            this.f121188c0 = timeUnit;
            this.f121189p1 = h0Var;
            this.f121191x1 = i10;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.Y = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.f121192x2);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.Z = true;
            if (b()) {
                p();
            }
            this.W.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123809a0 = th2;
            this.Z = true;
            if (b()) {
                p();
            }
            this.W.onError(th2);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121194y2) {
                return;
            }
            if (k()) {
                this.f121190p2.onNext(t10);
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.X.offer((U) NotificationLite.next(t10));
                if (!b()) {
                    return;
                }
            }
            p();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121193y1, eVar)) {
                this.f121193y1 = eVar;
                this.f121190p2 = UnicastProcessor.T8(this.f121191x1);
                org.reactivestreams.d<? super V> dVar = this.W;
                dVar.onSubscribe(this);
                long jF = f();
                if (jF == 0) {
                    this.Y = true;
                    eVar.cancel();
                    dVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                    return;
                }
                dVar.onNext(this.f121190p2);
                if (jF != Long.MAX_VALUE) {
                    g(1L);
                }
                if (this.Y) {
                    return;
                }
                SequentialDisposable sequentialDisposable = this.f121192x2;
                io.reactivex.h0 h0Var = this.f121189p1;
                long j10 = this.f121187b0;
                if (sequentialDisposable.a(h0Var.h(this, j10, j10, this.f121188c0))) {
                    eVar.request(Long.MAX_VALUE);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.processors.UnicastProcessor<T>] */
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
        void p() {
            lh.o oVar = this.X;
            org.reactivestreams.d<? super V> dVar = this.W;
            UnicastProcessor<T> unicastProcessor = this.f121190p2;
            int iA = 1;
            while (true) {
                boolean z10 = this.f121194y2;
                boolean z11 = this.Z;
                Object objPoll = oVar.poll();
                if (z11 && (objPoll == null || objPoll == G2)) {
                    break;
                }
                if (objPoll == null) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (objPoll == G2) {
                    unicastProcessor.onComplete();
                    if (z10) {
                        this.f121193y1.cancel();
                    } else {
                        unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.T8(this.f121191x1);
                        this.f121190p2 = unicastProcessor;
                        long jF = f();
                        if (jF == 0) {
                            this.f121190p2 = null;
                            this.X.clear();
                            this.f121193y1.cancel();
                            dispose();
                            dVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                            return;
                        }
                        dVar.onNext(unicastProcessor);
                        if (jF != Long.MAX_VALUE) {
                            g(1L);
                        }
                    }
                } else {
                    unicastProcessor.onNext(NotificationLite.getValue(objPoll));
                }
            }
            this.f121190p2 = null;
            oVar.clear();
            dispose();
            Throwable th2 = this.f123809a0;
            if (th2 != null) {
                unicastProcessor.onError(th2);
            } else {
                unicastProcessor.onComplete();
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
                this.f121194y2 = true;
                dispose();
            }
            this.X.offer((U) G2);
            if (b()) {
                p();
            }
        }
    }

    /* JADX INFO: compiled from: FlowableWindowTimed.java */
    public static final class c<T> extends io.reactivex.internal.subscribers.h<T, Object, io.reactivex.j<T>> implements org.reactivestreams.e, Runnable {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        final long f121195b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        final long f121196c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        final TimeUnit f121197p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        final List<UnicastProcessor<T>> f121198p2;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        final io.reactivex.h0.c f121199x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        org.reactivestreams.e f121200x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        final int f121201y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        volatile boolean f121202y2;

        /* JADX INFO: compiled from: FlowableWindowTimed.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final UnicastProcessor<T> f121203b;

            a(UnicastProcessor<T> unicastProcessor) {
                this.f121203b = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.p(this.f121203b);
            }
        }

        /* JADX INFO: compiled from: FlowableWindowTimed.java */
        public static final class b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final UnicastProcessor<T> f121205a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final boolean f121206b;

            b(UnicastProcessor<T> unicastProcessor, boolean z10) {
                this.f121205a = unicastProcessor;
                this.f121206b = z10;
            }
        }

        c(org.reactivestreams.d<? super io.reactivex.j<T>> dVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0.c cVar, int i10) {
            super(dVar, new MpscLinkedQueue());
            this.f121195b0 = j10;
            this.f121196c0 = j11;
            this.f121197p1 = timeUnit;
            this.f121199x1 = cVar;
            this.f121201y1 = i10;
            this.f121198p2 = new LinkedList();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.Y = true;
        }

        public void dispose() {
            this.f121199x1.dispose();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.Z = true;
            if (b()) {
                q();
            }
            this.W.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123809a0 = th2;
            this.Z = true;
            if (b()) {
                q();
            }
            this.W.onError(th2);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (k()) {
                Iterator<UnicastProcessor<T>> it = this.f121198p2.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.X.offer((U) t10);
                if (!b()) {
                    return;
                }
            }
            q();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121200x2, eVar)) {
                this.f121200x2 = eVar;
                this.W.onSubscribe(this);
                if (this.Y) {
                    return;
                }
                long jF = f();
                if (jF == 0) {
                    eVar.cancel();
                    this.W.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                    return;
                }
                UnicastProcessor<T> unicastProcessorT8 = UnicastProcessor.T8(this.f121201y1);
                this.f121198p2.add(unicastProcessorT8);
                this.W.onNext(unicastProcessorT8);
                if (jF != Long.MAX_VALUE) {
                    g(1L);
                }
                this.f121199x1.c(new a(unicastProcessorT8), this.f121195b0, this.f121197p1);
                io.reactivex.h0.c cVar = this.f121199x1;
                long j10 = this.f121196c0;
                cVar.d(this, j10, j10, this.f121197p1);
                eVar.request(Long.MAX_VALUE);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void p(UnicastProcessor<T> unicastProcessor) {
            this.X.offer((U) new b(unicastProcessor, false));
            if (b()) {
                q();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void q() {
            lh.o oVar = this.X;
            org.reactivestreams.d<? super V> dVar = this.W;
            List<UnicastProcessor<T>> list = this.f121198p2;
            int iA = 1;
            while (!this.f121202y2) {
                boolean z10 = this.Z;
                Object objPoll = oVar.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    oVar.clear();
                    Throwable th2 = this.f123809a0;
                    if (th2 != null) {
                        Iterator<UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    dispose();
                    return;
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f121206b) {
                        list.remove(bVar.f121205a);
                        bVar.f121205a.onComplete();
                        if (list.isEmpty() && this.Y) {
                            this.f121202y2 = true;
                        }
                    } else if (!this.Y) {
                        long jF = f();
                        if (jF != 0) {
                            UnicastProcessor<T> unicastProcessorT8 = UnicastProcessor.T8(this.f121201y1);
                            list.add(unicastProcessorT8);
                            dVar.onNext(unicastProcessorT8);
                            if (jF != Long.MAX_VALUE) {
                                g(1L);
                            }
                            this.f121199x1.c(new a(unicastProcessorT8), this.f121195b0, this.f121197p1);
                        } else {
                            dVar.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.f121200x2.cancel();
            dispose();
            oVar.clear();
            list.clear();
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            o(j10);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(UnicastProcessor.T8(this.f121201y1), true);
            if (!this.Y) {
                this.X.offer((U) bVar);
            }
            if (b()) {
                q();
            }
        }
    }

    public j1(io.reactivex.j<T> jVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var, long j12, int i10, boolean z10) {
        super(jVar);
        this.f121169d = j10;
        this.f121170e = j11;
        this.f121171f = timeUnit;
        this.f121172g = h0Var;
        this.f121173h = j12;
        this.f121174i = i10;
        this.f121175j = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super io.reactivex.j<T>> dVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(dVar);
        long j10 = this.f121169d;
        long j11 = this.f121170e;
        if (j10 != j11) {
            this.f121039c.j6(new c(eVar, j10, j11, this.f121171f, this.f121172g.c(), this.f121174i));
            return;
        }
        long j12 = this.f121173h;
        if (j12 == Long.MAX_VALUE) {
            this.f121039c.j6(new b(eVar, this.f121169d, this.f121171f, this.f121172g, this.f121174i));
        } else {
            this.f121039c.j6(new a(eVar, j10, this.f121171f, this.f121172g, this.f121174i, j12, this.f121175j));
        }
    }
}

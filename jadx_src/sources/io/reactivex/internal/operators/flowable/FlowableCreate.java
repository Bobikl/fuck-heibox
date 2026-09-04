package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCreate<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.m<T> f120057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final BackpressureStrategy f120058d;

    public static abstract class BaseEmitter<T> extends AtomicLong implements io.reactivex.l<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 7326289992464377023L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SequentialDisposable f120060c = new SequentialDisposable();

        BaseEmitter(org.reactivestreams.d<? super T> dVar) {
            this.f120059b = dVar;
        }

        @Override // io.reactivex.l
        public final void a(kh.f fVar) {
            c(new CancellableDisposable(fVar));
        }

        @Override // io.reactivex.l
        public boolean b(Throwable th2) {
            return e(th2);
        }

        @Override // io.reactivex.l
        public final void c(io.reactivex.disposables.b bVar) {
            this.f120060c.b(bVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f120060c.dispose();
            h();
        }

        protected void d() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f120059b.onComplete();
            } finally {
                this.f120060c.dispose();
            }
        }

        protected boolean e(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f120059b.onError(th2);
                return true;
            } finally {
                this.f120060c.dispose();
            }
        }

        @Override // io.reactivex.l
        public final long f() {
            return get();
        }

        void g() {
        }

        void h() {
        }

        @Override // io.reactivex.l
        public final boolean isCancelled() {
            return this.f120060c.isDisposed();
        }

        @Override // io.reactivex.i
        public void onComplete() {
            d();
        }

        @Override // io.reactivex.i
        public final void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // org.reactivestreams.e
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this, j10);
                g();
            }
        }

        @Override // io.reactivex.l
        public final io.reactivex.l<T> serialize() {
            return new SerializedEmitter(this);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.queue.a<T> f120061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f120062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f120063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f120064g;

        BufferAsyncEmitter(org.reactivestreams.d<? super T> dVar, int i10) {
            super(dVar);
            this.f120061d = new io.reactivex.internal.queue.a<>(i10);
            this.f120064g = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.l
        public boolean b(Throwable th2) {
            if (this.f120063f || isCancelled()) {
                return false;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f120062e = th2;
            this.f120063f = true;
            j();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void g() {
            j();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void h() {
            if (this.f120064g.getAndIncrement() == 0) {
                this.f120061d.clear();
            }
        }

        void j() {
            if (this.f120064g.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = this.f120059b;
            io.reactivex.internal.queue.a<T> aVar = this.f120061d;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (isCancelled()) {
                        aVar.clear();
                        return;
                    }
                    boolean z10 = this.f120063f;
                    T tPoll = aVar.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f120062e;
                        if (th2 != null) {
                            e(th2);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(tPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (isCancelled()) {
                        aVar.clear();
                        return;
                    }
                    boolean z12 = this.f120063f;
                    boolean zIsEmpty = aVar.isEmpty();
                    if (z12 && zIsEmpty) {
                        Throwable th3 = this.f120062e;
                        if (th3 != null) {
                            e(th3);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    io.reactivex.internal.util.b.e(this, j11);
                }
                iAddAndGet = this.f120064g.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.i
        public void onComplete() {
            this.f120063f = true;
            j();
        }

        @Override // io.reactivex.i
        public void onNext(T t10) {
            if (this.f120063f || isCancelled()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f120061d.offer(t10);
                j();
            }
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        DropAsyncEmitter(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        void j() {
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        void j() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<T> f120065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f120066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f120067f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f120068g;

        LatestAsyncEmitter(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
            this.f120065d = new AtomicReference<>();
            this.f120068g = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.l
        public boolean b(Throwable th2) {
            if (this.f120067f || isCancelled()) {
                return false;
            }
            if (th2 == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f120066e = th2;
            this.f120067f = true;
            j();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void g() {
            j();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void h() {
            if (this.f120068g.getAndIncrement() == 0) {
                this.f120065d.lazySet(null);
            }
        }

        void j() {
            if (this.f120068g.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = this.f120059b;
            AtomicReference<T> atomicReference = this.f120065d;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z10 = this.f120067f;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f120066e;
                        if (th2 != null) {
                            e(th2);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(andSet);
                    j11++;
                }
                if (j11 == j10) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z12 = this.f120067f;
                    boolean z13 = atomicReference.get() == null;
                    if (z12 && z13) {
                        Throwable th3 = this.f120066e;
                        if (th3 != null) {
                            e(th3);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    io.reactivex.internal.util.b.e(this, j11);
                }
                iAddAndGet = this.f120068g.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.i
        public void onComplete() {
            this.f120067f = true;
            j();
        }

        @Override // io.reactivex.i
        public void onNext(T t10) {
            if (this.f120067f || isCancelled()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f120065d.set(t10);
                j();
            }
        }
    }

    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
        }

        @Override // io.reactivex.i
        public void onNext(T t10) {
            long j10;
            if (isCancelled()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f120059b.onNext(t10);
            do {
                j10 = get();
                if (j10 == 0) {
                    return;
                }
            } while (!compareAndSet(j10, j10 - 1));
        }
    }

    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        NoOverflowBaseAsyncEmitter(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
        }

        abstract void j();

        @Override // io.reactivex.i
        public final void onNext(T t10) {
            if (isCancelled()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                j();
            } else {
                this.f120059b.onNext(t10);
                io.reactivex.internal.util.b.e(this, 1L);
            }
        }
    }

    public static final class SerializedEmitter<T> extends AtomicInteger implements io.reactivex.l<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BaseEmitter<T> f120069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicThrowable f120070c = new AtomicThrowable();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final lh.n<T> f120071d = new io.reactivex.internal.queue.a(16);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f120072e;

        SerializedEmitter(BaseEmitter<T> baseEmitter) {
            this.f120069b = baseEmitter;
        }

        @Override // io.reactivex.l
        public void a(kh.f fVar) {
            this.f120069b.a(fVar);
        }

        @Override // io.reactivex.l
        public boolean b(Throwable th2) {
            if (!this.f120069b.isCancelled() && !this.f120072e) {
                if (th2 == null) {
                    th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f120070c.a(th2)) {
                    this.f120072e = true;
                    d();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.l
        public void c(io.reactivex.disposables.b bVar) {
            this.f120069b.c(bVar);
        }

        void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        void e() {
            BaseEmitter<T> baseEmitter = this.f120069b;
            lh.n<T> nVar = this.f120071d;
            AtomicThrowable atomicThrowable = this.f120070c;
            int iAddAndGet = 1;
            while (!baseEmitter.isCancelled()) {
                if (atomicThrowable.get() != null) {
                    nVar.clear();
                    baseEmitter.onError(atomicThrowable.c());
                    return;
                }
                boolean z10 = this.f120072e;
                T tPoll = nVar.poll();
                boolean z11 = tPoll == null;
                if (z10 && z11) {
                    baseEmitter.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    baseEmitter.onNext(tPoll);
                }
            }
            nVar.clear();
        }

        @Override // io.reactivex.l
        public long f() {
            return this.f120069b.f();
        }

        @Override // io.reactivex.l
        public boolean isCancelled() {
            return this.f120069b.isCancelled();
        }

        @Override // io.reactivex.i
        public void onComplete() {
            if (this.f120069b.isCancelled() || this.f120072e) {
                return;
            }
            this.f120072e = true;
            d();
        }

        @Override // io.reactivex.i
        public void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // io.reactivex.i
        public void onNext(T t10) {
            if (this.f120069b.isCancelled() || this.f120072e) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f120069b.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                lh.n<T> nVar = this.f120071d;
                synchronized (nVar) {
                    nVar.offer(t10);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            e();
        }

        @Override // io.reactivex.l
        public io.reactivex.l<T> serialize() {
            return this;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.f120069b.toString();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f120073a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f120073a = iArr;
            try {
                iArr[BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120073a[BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120073a[BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f120073a[BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FlowableCreate(io.reactivex.m<T> mVar, BackpressureStrategy backpressureStrategy) {
        this.f120057c = mVar;
        this.f120058d = backpressureStrategy;
    }

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
    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        BaseEmitter missingEmitter;
        int i10 = a.f120073a[this.f120058d.ordinal()];
        if (i10 == 1) {
            missingEmitter = new MissingEmitter(dVar);
        } else if (i10 == 2) {
            missingEmitter = new ErrorAsyncEmitter(dVar);
        } else if (i10 != 3) {
            missingEmitter = i10 != 4 ? new BufferAsyncEmitter(dVar, io.reactivex.j.Y()) : new LatestAsyncEmitter(dVar);
        } else {
            missingEmitter = new DropAsyncEmitter(dVar);
        }
        dVar.onSubscribe(missingEmitter);
        try {
            this.f120057c.a(missingEmitter);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            missingEmitter.onError(th2);
        }
    }
}

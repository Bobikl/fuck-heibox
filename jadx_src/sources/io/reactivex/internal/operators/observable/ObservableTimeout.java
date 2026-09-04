package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTimeout<T, U, V> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<U> f122638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.e0<V>> f122639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f122640e;

    public static final class TimeoutConsumer extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<Object>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8708641127342403073L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f122641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122642c;

        TimeoutConsumer(long j10, a aVar) {
            this.f122642c = j10;
            this.f122641b = aVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.f122641b.b(this.f122642c);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj == disposableHelper) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                lazySet(disposableHelper);
                this.f122641b.a(this.f122642c, th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(Object obj) {
            io.reactivex.disposables.b bVar = (io.reactivex.disposables.b) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                bVar.dispose();
                lazySet(disposableHelper);
                this.f122641b.b(this.f122642c);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, io.reactivex.disposables.b, a {
        private static final long serialVersionUID = -7508389464265974549L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<?>> f122644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final SequentialDisposable f122645d = new SequentialDisposable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f122646e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122647f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.e0<? extends T> f122648g;

        TimeoutFallbackObserver(io.reactivex.g0<? super T> g0Var, kh.o<? super T, ? extends io.reactivex.e0<?>> oVar, io.reactivex.e0<? extends T> e0Var) {
            this.f122643b = g0Var;
            this.f122644c = oVar;
            this.f122648g = e0Var;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.a
        public void a(long j10, Throwable th2) {
            if (!this.f122646e.compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this);
                this.f122643b.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void b(long j10) {
            if (this.f122646e.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f122647f);
                io.reactivex.e0<? extends T> e0Var = this.f122648g;
                this.f122648g = null;
                e0Var.g(new ObservableTimeoutTimed.a(this.f122643b, this));
            }
        }

        void c(io.reactivex.e0<?> e0Var) {
            if (e0Var != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.f122645d.a(timeoutConsumer)) {
                    e0Var.g(timeoutConsumer);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122647f);
            DisposableHelper.dispose(this);
            this.f122645d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122646e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f122645d.dispose();
                this.f122643b.onComplete();
                this.f122645d.dispose();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122646e.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122645d.dispose();
            this.f122643b.onError(th2);
            this.f122645d.dispose();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            long j10 = this.f122646e.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f122646e.compareAndSet(j10, j11)) {
                    io.reactivex.disposables.b bVar = this.f122645d.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f122643b.onNext(t10);
                    try {
                        io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122644c.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.f122645d.a(timeoutConsumer)) {
                            e0Var.g(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f122647f.get().dispose();
                        this.f122646e.getAndSet(Long.MAX_VALUE);
                        this.f122643b.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122647f, bVar);
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements io.reactivex.g0<T>, io.reactivex.disposables.b, a {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<?>> f122650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final SequentialDisposable f122651d = new SequentialDisposable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122652e = new AtomicReference<>();

        TimeoutObserver(io.reactivex.g0<? super T> g0Var, kh.o<? super T, ? extends io.reactivex.e0<?>> oVar) {
            this.f122649b = g0Var;
            this.f122650c = oVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.a
        public void a(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this.f122652e);
                this.f122649b.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f122652e);
                this.f122649b.onError(new TimeoutException());
            }
        }

        void c(io.reactivex.e0<?> e0Var) {
            if (e0Var != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.f122651d.a(timeoutConsumer)) {
                    e0Var.g(timeoutConsumer);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122652e);
            this.f122651d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f122652e.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f122651d.dispose();
                this.f122649b.onComplete();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122651d.dispose();
                this.f122649b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    io.reactivex.disposables.b bVar = this.f122651d.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f122649b.onNext(t10);
                    try {
                        io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122650c.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.f122651d.a(timeoutConsumer)) {
                            e0Var.g(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f122652e.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f122649b.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122652e, bVar);
        }
    }

    public interface a extends ObservableTimeoutTimed.b {
        void a(long j10, Throwable th2);
    }

    public ObservableTimeout(io.reactivex.z<T> zVar, io.reactivex.e0<U> e0Var, kh.o<? super T, ? extends io.reactivex.e0<V>> oVar, io.reactivex.e0<? extends T> e0Var2) {
        super(zVar);
        this.f122638c = e0Var;
        this.f122639d = oVar;
        this.f122640e = e0Var2;
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
    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        if (this.f122640e == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(g0Var, this.f122639d);
            g0Var.onSubscribe(timeoutObserver);
            timeoutObserver.c(this.f122638c);
            this.f122785b.g(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(g0Var, this.f122639d, this.f122640e);
        g0Var.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.c(this.f122638c);
        this.f122785b.g(timeoutFallbackObserver);
    }
}

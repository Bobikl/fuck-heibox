package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSampleWithObservable<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<?> f122489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f122490d;

    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f122491f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f122492g;

        SampleMainEmitLast(io.reactivex.g0<? super T> g0Var, io.reactivex.e0<?> e0Var) {
            super(g0Var, e0Var);
            this.f122491f = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void b() {
            this.f122492g = true;
            if (this.f122491f.getAndIncrement() == 0) {
                c();
                this.f122493b.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void f() {
            if (this.f122491f.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.f122492g;
                    c();
                    if (z10) {
                        this.f122493b.onComplete();
                        return;
                    }
                } while (this.f122491f.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(io.reactivex.g0<? super T> g0Var, io.reactivex.e0<?> e0Var) {
            super(g0Var, e0Var);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void b() {
            this.f122493b.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void f() {
            c();
        }
    }

    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.e0<?> f122494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122495d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f122496e;

        SampleMainObserver(io.reactivex.g0<? super T> g0Var, io.reactivex.e0<?> e0Var) {
            this.f122493b = g0Var;
            this.f122494c = e0Var;
        }

        public void a() {
            this.f122496e.dispose();
            b();
        }

        abstract void b();

        void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f122493b.onNext(andSet);
            }
        }

        public void d(Throwable th2) {
            this.f122496e.dispose();
            this.f122493b.onError(th2);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122495d);
            this.f122496e.dispose();
        }

        abstract void f();

        boolean g(io.reactivex.disposables.b bVar) {
            return DisposableHelper.setOnce(this.f122495d, bVar);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122495d.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            DisposableHelper.dispose(this.f122495d);
            b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f122495d);
            this.f122493b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122496e, bVar)) {
                this.f122496e = bVar;
                this.f122493b.onSubscribe(this);
                if (this.f122495d.get() == null) {
                    this.f122494c.g(new a(this));
                }
            }
        }
    }

    public static final class a<T> implements io.reactivex.g0<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SampleMainObserver<T> f122497b;

        a(SampleMainObserver<T> sampleMainObserver) {
            this.f122497b = sampleMainObserver;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122497b.a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122497b.d(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(Object obj) {
            this.f122497b.f();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f122497b.g(bVar);
        }
    }

    public ObservableSampleWithObservable(io.reactivex.e0<T> e0Var, io.reactivex.e0<?> e0Var2, boolean z10) {
        super(e0Var);
        this.f122489c = e0Var2;
        this.f122490d = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        io.reactivex.observers.l lVar = new io.reactivex.observers.l(g0Var);
        if (this.f122490d) {
            this.f122785b.g(new SampleMainEmitLast(lVar, this.f122489c));
        } else {
            this.f122785b.g(new SampleMainNoLast(lVar, this.f122489c));
        }
    }
}

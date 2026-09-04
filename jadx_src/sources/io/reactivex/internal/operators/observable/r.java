package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableDebounce.java */
/* JADX INFO: loaded from: classes5.dex */
public final class r<T, U> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.e0<U>> f123039c;

    /* JADX INFO: compiled from: ObservableDebounce.java */
    public static final class a<T, U> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<U>> f123041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f123043e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f123044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f123045g;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableDebounce.java */
        public static final class C1101a<T, U> extends io.reactivex.observers.d<U> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final a<T, U> f123046b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final long f123047c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final T f123048d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            boolean f123049e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final AtomicBoolean f123050f = new AtomicBoolean();

            C1101a(a<T, U> aVar, long j10, T t10) {
                this.f123046b = aVar;
                this.f123047c = j10;
                this.f123048d = t10;
            }

            void a() {
                if (this.f123050f.compareAndSet(false, true)) {
                    this.f123046b.a(this.f123047c, this.f123048d);
                }
            }

            @Override // io.reactivex.g0
            public void onComplete() {
                if (this.f123049e) {
                    return;
                }
                this.f123049e = true;
                a();
            }

            @Override // io.reactivex.g0
            public void onError(Throwable th2) {
                if (this.f123049e) {
                    io.reactivex.plugins.a.Y(th2);
                } else {
                    this.f123049e = true;
                    this.f123046b.onError(th2);
                }
            }

            @Override // io.reactivex.g0
            public void onNext(U u10) {
                if (this.f123049e) {
                    return;
                }
                this.f123049e = true;
                dispose();
                a();
            }
        }

        a(io.reactivex.g0<? super T> g0Var, kh.o<? super T, ? extends io.reactivex.e0<U>> oVar) {
            this.f123040b = g0Var;
            this.f123041c = oVar;
        }

        void a(long j10, T t10) {
            if (j10 == this.f123044f) {
                this.f123040b.onNext(t10);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123042d.dispose();
            DisposableHelper.dispose(this.f123043e);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123042d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123045g) {
                return;
            }
            this.f123045g = true;
            io.reactivex.disposables.b bVar = this.f123043e.get();
            if (bVar != DisposableHelper.DISPOSED) {
                ((C1101a) bVar).a();
                DisposableHelper.dispose(this.f123043e);
                this.f123040b.onComplete();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f123043e);
            this.f123040b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f123045g) {
                return;
            }
            long j10 = this.f123044f + 1;
            this.f123044f = j10;
            io.reactivex.disposables.b bVar = this.f123043e.get();
            if (bVar != null) {
                bVar.dispose();
            }
            try {
                io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f123041c.apply(t10), "The ObservableSource supplied is null");
                C1101a c1101a = new C1101a(this, j10, t10);
                if (androidx.compose.animation.core.s0.a(this.f123043e, bVar, c1101a)) {
                    e0Var.g(c1101a);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                dispose();
                this.f123040b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123042d, bVar)) {
                this.f123042d = bVar;
                this.f123040b.onSubscribe(this);
            }
        }
    }

    public r(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.e0<U>> oVar) {
        super(e0Var);
        this.f123039c = oVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(new io.reactivex.observers.l(g0Var), this.f123039c));
    }
}

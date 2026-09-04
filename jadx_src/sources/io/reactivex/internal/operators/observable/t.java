package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableDelay.java */
/* JADX INFO: loaded from: classes5.dex */
public final class t<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f123067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f123068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.h0 f123069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f123070f;

    /* JADX INFO: compiled from: ObservableDelay.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f123072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f123073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f123074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f123075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f123076g;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableDelay.java */
        public final class RunnableC1102a implements Runnable {
            RunnableC1102a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f123071b.onComplete();
                } finally {
                    a.this.f123074e.dispose();
                }
            }
        }

        /* JADX INFO: compiled from: ObservableDelay.java */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f123078b;

            b(Throwable th2) {
                this.f123078b = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f123071b.onError(this.f123078b);
                } finally {
                    a.this.f123074e.dispose();
                }
            }
        }

        /* JADX INFO: compiled from: ObservableDelay.java */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final T f123080b;

            c(T t10) {
                this.f123080b = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f123071b.onNext(this.f123080b);
            }
        }

        a(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar, boolean z10) {
            this.f123071b = g0Var;
            this.f123072c = j10;
            this.f123073d = timeUnit;
            this.f123074e = cVar;
            this.f123075f = z10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123076g.dispose();
            this.f123074e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123074e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123074e.c(new RunnableC1102a(), this.f123072c, this.f123073d);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123074e.c(new b(th2), this.f123075f ? this.f123072c : 0L, this.f123073d);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f123074e.c(new c(t10), this.f123072c, this.f123073d);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123076g, bVar)) {
                this.f123076g = bVar;
                this.f123071b.onSubscribe(this);
            }
        }
    }

    public t(io.reactivex.e0<T> e0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, boolean z10) {
        super(e0Var);
        this.f123067c = j10;
        this.f123068d = timeUnit;
        this.f123069e = h0Var;
        this.f123070f = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(this.f123070f ? g0Var : new io.reactivex.observers.l(g0Var), this.f123067c, this.f123068d, this.f123069e.c(), this.f123070f));
    }
}

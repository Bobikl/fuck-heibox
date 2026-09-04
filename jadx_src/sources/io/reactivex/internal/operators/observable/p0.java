package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableGenerate.java */
/* JADX INFO: loaded from: classes5.dex */
public final class p0<T, S> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<S> f123015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<S, io.reactivex.i<T>, S> f123016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super S> f123017d;

    /* JADX INFO: compiled from: ObservableGenerate.java */
    public static final class a<T, S> implements io.reactivex.i<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<S, ? super io.reactivex.i<T>, S> f123019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.g<? super S> f123020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        S f123021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f123022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f123023g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f123024h;

        a(io.reactivex.g0<? super T> g0Var, kh.c<S, ? super io.reactivex.i<T>, S> cVar, kh.g<? super S> gVar, S s10) {
            this.f123018b = g0Var;
            this.f123019c = cVar;
            this.f123020d = gVar;
            this.f123021e = s10;
        }

        private void d(S s10) {
            try {
                this.f123020d.accept(s10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123022f = true;
        }

        public void g() {
            S sApply = this.f123021e;
            if (this.f123022f) {
                this.f123021e = null;
                d(sApply);
                return;
            }
            kh.c<S, ? super io.reactivex.i<T>, S> cVar = this.f123019c;
            while (!this.f123022f) {
                this.f123024h = false;
                try {
                    sApply = cVar.apply(sApply, this);
                    if (this.f123023g) {
                        this.f123022f = true;
                        this.f123021e = null;
                        d(sApply);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f123021e = null;
                    this.f123022f = true;
                    onError(th2);
                    d(sApply);
                    return;
                }
            }
            this.f123021e = null;
            d(sApply);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123022f;
        }

        @Override // io.reactivex.i
        public void onComplete() {
            if (this.f123023g) {
                return;
            }
            this.f123023g = true;
            this.f123018b.onComplete();
        }

        @Override // io.reactivex.i
        public void onError(Throwable th2) {
            if (this.f123023g) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f123023g = true;
            this.f123018b.onError(th2);
        }

        @Override // io.reactivex.i
        public void onNext(T t10) {
            if (this.f123023g) {
                return;
            }
            if (this.f123024h) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f123024h = true;
                this.f123018b.onNext(t10);
            }
        }
    }

    public p0(Callable<S> callable, kh.c<S, io.reactivex.i<T>, S> cVar, kh.g<? super S> gVar) {
        this.f123015b = callable;
        this.f123016c = cVar;
        this.f123017d = gVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        try {
            a aVar = new a(g0Var, this.f123016c, this.f123017d, this.f123015b.call());
            g0Var.onSubscribe(aVar);
            aVar.g();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, g0Var);
        }
    }
}

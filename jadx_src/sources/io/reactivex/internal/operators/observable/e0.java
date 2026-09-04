package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableElementAtSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e0<T> extends io.reactivex.i0<T> implements lh.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final T f122862d;

    /* JADX INFO: compiled from: ObservableElementAtSingle.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super T> f122863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final T f122865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f122866e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f122867f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f122868g;

        a(io.reactivex.l0<? super T> l0Var, long j10, T t10) {
            this.f122863b = l0Var;
            this.f122864c = j10;
            this.f122865d = t10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122866e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122866e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122868g) {
                return;
            }
            this.f122868g = true;
            T t10 = this.f122865d;
            if (t10 != null) {
                this.f122863b.onSuccess(t10);
            } else {
                this.f122863b.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122868g) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122868g = true;
                this.f122863b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122868g) {
                return;
            }
            long j10 = this.f122867f;
            if (j10 != this.f122864c) {
                this.f122867f = j10 + 1;
                return;
            }
            this.f122868g = true;
            this.f122866e.dispose();
            this.f122863b.onSuccess(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122866e, bVar)) {
                this.f122866e = bVar;
                this.f122863b.onSubscribe(this);
            }
        }
    }

    public e0(io.reactivex.e0<T> e0Var, long j10, T t10) {
        this.f122860b = e0Var;
        this.f122861c = j10;
        this.f122862d = t10;
    }

    @Override // lh.d
    public io.reactivex.z<T> a() {
        return io.reactivex.plugins.a.R(new c0(this.f122860b, this.f122861c, this.f122862d, true));
    }

    @Override // io.reactivex.i0
    public void c1(io.reactivex.l0<? super T> l0Var) {
        this.f122860b.g(new a(l0Var, this.f122861c, this.f122862d));
    }
}

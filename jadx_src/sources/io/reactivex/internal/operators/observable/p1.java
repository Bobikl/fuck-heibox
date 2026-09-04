package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: ObservableTake.java */
/* JADX INFO: loaded from: classes5.dex */
public final class p1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f123025c;

    /* JADX INFO: compiled from: ObservableTake.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f123026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f123027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f123029e;

        a(io.reactivex.g0<? super T> g0Var, long j10) {
            this.f123026b = g0Var;
            this.f123029e = j10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123028d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123028d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123027c) {
                return;
            }
            this.f123027c = true;
            this.f123028d.dispose();
            this.f123026b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f123027c) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123027c = true;
            this.f123028d.dispose();
            this.f123026b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f123027c) {
                return;
            }
            long j10 = this.f123029e;
            long j11 = j10 - 1;
            this.f123029e = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f123026b.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123028d, bVar)) {
                this.f123028d = bVar;
                if (this.f123029e != 0) {
                    this.f123026b.onSubscribe(this);
                    return;
                }
                this.f123027c = true;
                bVar.dispose();
                EmptyDisposable.complete(this.f123026b);
            }
        }
    }

    public p1(io.reactivex.e0<T> e0Var, long j10) {
        super(e0Var);
        this.f123025c = j10;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f123025c));
    }
}

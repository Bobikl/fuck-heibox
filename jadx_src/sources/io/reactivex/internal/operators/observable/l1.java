package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSkip.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122950c;

    /* JADX INFO: compiled from: ObservableSkip.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f122952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122953d;

        a(io.reactivex.g0<? super T> g0Var, long j10) {
            this.f122951b = g0Var;
            this.f122952c = j10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122953d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122953d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122951b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122951b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            long j10 = this.f122952c;
            if (j10 != 0) {
                this.f122952c = j10 - 1;
            } else {
                this.f122951b.onNext(t10);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122953d, bVar)) {
                this.f122953d = bVar;
                this.f122951b.onSubscribe(this);
            }
        }
    }

    public l1(io.reactivex.e0<T> e0Var, long j10) {
        super(e0Var);
        this.f122950c = j10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f122950c));
    }
}

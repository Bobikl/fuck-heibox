package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAll.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e<T> extends io.reactivex.internal.operators.observable.a<T, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f122855c;

    /* JADX INFO: compiled from: ObservableAll.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super Boolean> f122856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f122857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122859e;

        a(io.reactivex.g0<? super Boolean> g0Var, kh.r<? super T> rVar) {
            this.f122856b = g0Var;
            this.f122857c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122858d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122858d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122859e) {
                return;
            }
            this.f122859e = true;
            this.f122856b.onNext(Boolean.TRUE);
            this.f122856b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122859e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122859e = true;
                this.f122856b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122859e) {
                return;
            }
            try {
                if (this.f122857c.test(t10)) {
                    return;
                }
                this.f122859e = true;
                this.f122858d.dispose();
                this.f122856b.onNext(Boolean.FALSE);
                this.f122856b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122858d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122858d, bVar)) {
                this.f122858d = bVar;
                this.f122856b.onSubscribe(this);
            }
        }
    }

    public e(io.reactivex.e0<T> e0Var, kh.r<? super T> rVar) {
        super(e0Var);
        this.f122855c = rVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super Boolean> g0Var) {
        this.f122785b.g(new a(g0Var, this.f122855c));
    }
}

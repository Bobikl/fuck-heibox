package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableElementAtMaybe.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d0<T> extends io.reactivex.q<T> implements lh.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122842c;

    /* JADX INFO: compiled from: ObservableElementAtMaybe.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f122843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f122846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122847f;

        a(io.reactivex.t<? super T> tVar, long j10) {
            this.f122843b = tVar;
            this.f122844c = j10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122845d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122845d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122847f) {
                return;
            }
            this.f122847f = true;
            this.f122843b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122847f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122847f = true;
                this.f122843b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122847f) {
                return;
            }
            long j10 = this.f122846e;
            if (j10 != this.f122844c) {
                this.f122846e = j10 + 1;
                return;
            }
            this.f122847f = true;
            this.f122845d.dispose();
            this.f122843b.onSuccess(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122845d, bVar)) {
                this.f122845d = bVar;
                this.f122843b.onSubscribe(this);
            }
        }
    }

    public d0(io.reactivex.e0<T> e0Var, long j10) {
        this.f122841b = e0Var;
        this.f122842c = j10;
    }

    @Override // lh.d
    public io.reactivex.z<T> a() {
        return io.reactivex.plugins.a.R(new c0(this.f122841b, this.f122842c, null, false));
    }

    @Override // io.reactivex.q
    public void r1(io.reactivex.t<? super T> tVar) {
        this.f122841b.g(new a(tVar, this.f122842c));
    }
}

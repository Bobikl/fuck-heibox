package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableTimeInterval.java */
/* JADX INFO: loaded from: classes5.dex */
public final class t1<T> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.schedulers.d<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f123083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f123084d;

    /* JADX INFO: compiled from: ObservableTimeInterval.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super io.reactivex.schedulers.d<T>> f123085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f123086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.h0 f123087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f123088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f123089f;

        a(io.reactivex.g0<? super io.reactivex.schedulers.d<T>> g0Var, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f123085b = g0Var;
            this.f123087d = h0Var;
            this.f123086c = timeUnit;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123089f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123089f.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f123085b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f123085b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            long jD = this.f123087d.d(this.f123086c);
            long j10 = this.f123088e;
            this.f123088e = jD;
            this.f123085b.onNext(new io.reactivex.schedulers.d(t10, jD - j10, this.f123086c));
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123089f, bVar)) {
                this.f123089f = bVar;
                this.f123088e = this.f123087d.d(this.f123086c);
                this.f123085b.onSubscribe(this);
            }
        }
    }

    public t1(io.reactivex.e0<T> e0Var, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        super(e0Var);
        this.f123083c = h0Var;
        this.f123084d = timeUnit;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super io.reactivex.schedulers.d<T>> g0Var) {
        this.f122785b.g(new a(g0Var, this.f123084d, this.f123083c));
    }
}

package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;

/* JADX INFO: compiled from: SingleDematerialize.java */
/* JADX INFO: loaded from: classes5.dex */
@jh.d
public final class e<T, R> extends io.reactivex.q<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i0<T> f123513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, io.reactivex.y<R>> f123514c;

    /* JADX INFO: compiled from: SingleDematerialize.java */
    public static final class a<T, R> implements l0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super R> f123515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, io.reactivex.y<R>> f123516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123517d;

        a(io.reactivex.t<? super R> tVar, kh.o<? super T, io.reactivex.y<R>> oVar) {
            this.f123515b = tVar;
            this.f123516c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123517d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123517d.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123515b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123517d, bVar)) {
                this.f123517d = bVar;
                this.f123515b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                io.reactivex.y yVar = (io.reactivex.y) io.reactivex.internal.functions.a.g(this.f123516c.apply(t10), "The selector returned a null Notification");
                if (yVar.h()) {
                    this.f123515b.onSuccess((Object) yVar.e());
                } else if (yVar.f()) {
                    this.f123515b.onComplete();
                } else {
                    this.f123515b.onError(yVar.d());
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123515b.onError(th2);
            }
        }
    }

    public e(i0<T> i0Var, kh.o<? super T, io.reactivex.y<R>> oVar) {
        this.f123513b = i0Var;
        this.f123514c = oVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        this.f123513b.f(new a(tVar, this.f123514c));
    }
}

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: MaybeFilterSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class n<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f121688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f121689c;

    /* JADX INFO: compiled from: MaybeFilterSingle.java */
    public static final class a<T> implements l0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f121691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121692d;

        a(io.reactivex.t<? super T> tVar, kh.r<? super T> rVar) {
            this.f121690b = tVar;
            this.f121691c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            io.reactivex.disposables.b bVar = this.f121692d;
            this.f121692d = DisposableHelper.DISPOSED;
            bVar.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121692d.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f121690b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121692d, bVar)) {
                this.f121692d = bVar;
                this.f121690b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                if (this.f121691c.test(t10)) {
                    this.f121690b.onSuccess(t10);
                } else {
                    this.f121690b.onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121690b.onError(th2);
            }
        }
    }

    public n(o0<T> o0Var, kh.r<? super T> rVar) {
        this.f121688b = o0Var;
        this.f121689c = rVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121688b.f(new a(tVar, this.f121689c));
    }
}

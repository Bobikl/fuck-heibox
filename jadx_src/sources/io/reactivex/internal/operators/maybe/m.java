package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeFilter.java */
/* JADX INFO: loaded from: classes12.dex */
public final class m<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f121684c;

    /* JADX INFO: compiled from: MaybeFilter.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f121686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121687d;

        a(io.reactivex.t<? super T> tVar, kh.r<? super T> rVar) {
            this.f121685b = tVar;
            this.f121686c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            io.reactivex.disposables.b bVar = this.f121687d;
            this.f121687d = DisposableHelper.DISPOSED;
            bVar.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121687d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121685b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121685b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121687d, bVar)) {
                this.f121687d = bVar;
                this.f121685b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                if (this.f121686c.test(t10)) {
                    this.f121685b.onSuccess(t10);
                } else {
                    this.f121685b.onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121685b.onError(th2);
            }
        }
    }

    public m(io.reactivex.w<T> wVar, kh.r<? super T> rVar) {
        super(wVar);
        this.f121684c = rVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new a(tVar, this.f121684c));
    }
}

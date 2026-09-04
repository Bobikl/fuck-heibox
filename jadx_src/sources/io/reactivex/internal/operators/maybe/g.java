package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeDoAfterSuccess.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super T> f121648c;

    /* JADX INFO: compiled from: MaybeDoAfterSuccess.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super T> f121650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121651d;

        a(io.reactivex.t<? super T> tVar, kh.g<? super T> gVar) {
            this.f121649b = tVar;
            this.f121650c = gVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121651d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121651d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121649b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121649b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121651d, bVar)) {
                this.f121651d = bVar;
                this.f121649b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121649b.onSuccess(t10);
            try {
                this.f121650c.accept(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    public g(io.reactivex.w<T> wVar, kh.g<? super T> gVar) {
        super(wVar);
        this.f121648c = gVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new a(tVar, this.f121648c));
    }
}

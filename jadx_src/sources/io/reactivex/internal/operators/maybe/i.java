package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: compiled from: MaybeDoOnTerminate.java */
/* JADX INFO: loaded from: classes12.dex */
public final class i<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.a f121670c;

    /* JADX INFO: compiled from: MaybeDoOnTerminate.java */
    public final class a implements io.reactivex.t<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121671b;

        a(io.reactivex.t<? super T> tVar) {
            this.f121671b = tVar;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            try {
                i.this.f121670c.run();
                this.f121671b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121671b.onError(th2);
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            try {
                i.this.f121670c.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f121671b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f121671b.onSubscribe(bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                i.this.f121670c.run();
                this.f121671b.onSuccess(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121671b.onError(th2);
            }
        }
    }

    public i(io.reactivex.w<T> wVar, kh.a aVar) {
        this.f121669b = wVar;
        this.f121670c = aVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121669b.f(new a(tVar));
    }
}

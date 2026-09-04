package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeDoOnEvent.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.b<? super T, ? super Throwable> f121656c;

    /* JADX INFO: compiled from: MaybeDoOnEvent.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.b<? super T, ? super Throwable> f121658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121659d;

        a(io.reactivex.t<? super T> tVar, kh.b<? super T, ? super Throwable> bVar) {
            this.f121657b = tVar;
            this.f121658c = bVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121659d.dispose();
            this.f121659d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121659d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121659d = DisposableHelper.DISPOSED;
            try {
                this.f121658c.accept(null, null);
                this.f121657b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121657b.onError(th2);
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121659d = DisposableHelper.DISPOSED;
            try {
                this.f121658c.accept(null, th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f121657b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121659d, bVar)) {
                this.f121659d = bVar;
                this.f121657b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121659d = DisposableHelper.DISPOSED;
            try {
                this.f121658c.accept(t10, null);
                this.f121657b.onSuccess(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121657b.onError(th2);
            }
        }
    }

    public h(io.reactivex.w<T> wVar, kh.b<? super T, ? super Throwable> bVar) {
        super(wVar);
        this.f121656c = bVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new a(tVar, this.f121656c));
    }
}

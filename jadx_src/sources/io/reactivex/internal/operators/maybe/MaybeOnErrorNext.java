package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeOnErrorNext<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends io.reactivex.w<? extends T>> f121542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f121543d;

    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 2026620218879969836L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends io.reactivex.w<? extends T>> f121545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f121546d;

        public static final class a<T> implements io.reactivex.t<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final io.reactivex.t<? super T> f121547b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final AtomicReference<io.reactivex.disposables.b> f121548c;

            a(io.reactivex.t<? super T> tVar, AtomicReference<io.reactivex.disposables.b> atomicReference) {
                this.f121547b = tVar;
                this.f121548c = atomicReference;
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f121547b.onComplete();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f121547b.onError(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this.f121548c, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(T t10) {
                this.f121547b.onSuccess(t10);
            }
        }

        OnErrorNextMaybeObserver(io.reactivex.t<? super T> tVar, kh.o<? super Throwable, ? extends io.reactivex.w<? extends T>> oVar, boolean z10) {
            this.f121544b = tVar;
            this.f121545c = oVar;
            this.f121546d = z10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121544b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            if (!this.f121546d && !(th2 instanceof Exception)) {
                this.f121544b.onError(th2);
                return;
            }
            try {
                io.reactivex.w wVar = (io.reactivex.w) io.reactivex.internal.functions.a.g(this.f121545c.apply(th2), "The resumeFunction returned a null MaybeSource");
                DisposableHelper.replace(this, null);
                wVar.f(new a(this.f121544b, this));
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f121544b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f121544b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121544b.onSuccess(t10);
        }
    }

    public MaybeOnErrorNext(io.reactivex.w<T> wVar, kh.o<? super Throwable, ? extends io.reactivex.w<? extends T>> oVar, boolean z10) {
        super(wVar);
        this.f121542c = oVar;
        this.f121543d = z10;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new OnErrorNextMaybeObserver(tVar, this.f121542c, this.f121543d));
    }
}

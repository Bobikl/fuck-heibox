package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelayWithCompletable<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g f121459c;

    public static final class OtherObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = 703409937383992161L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.w<T> f121461c;

        OtherObserver(io.reactivex.t<? super T> tVar, io.reactivex.w<T> wVar) {
            this.f121460b = tVar;
            this.f121461c = wVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f121461c.f(new a(this, this.f121460b));
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f121460b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f121460b.onSubscribe(this);
            }
        }
    }

    public static final class a<T> implements io.reactivex.t<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f121462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.t<? super T> f121463c;

        a(AtomicReference<io.reactivex.disposables.b> atomicReference, io.reactivex.t<? super T> tVar) {
            this.f121462b = atomicReference;
            this.f121463c = tVar;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121463c.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121463c.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this.f121462b, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121463c.onSuccess(t10);
        }
    }

    public MaybeDelayWithCompletable(io.reactivex.w<T> wVar, io.reactivex.g gVar) {
        this.f121458b = wVar;
        this.f121459c = gVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121459c.d(new OtherObserver(tVar, this.f121458b));
    }
}

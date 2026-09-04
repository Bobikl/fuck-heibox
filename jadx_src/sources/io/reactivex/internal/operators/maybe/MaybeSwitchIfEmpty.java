package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeSwitchIfEmpty<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<? extends T> f121554c;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2223459372976438024L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.w<? extends T> f121556c;

        public static final class a<T> implements io.reactivex.t<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final io.reactivex.t<? super T> f121557b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final AtomicReference<io.reactivex.disposables.b> f121558c;

            a(io.reactivex.t<? super T> tVar, AtomicReference<io.reactivex.disposables.b> atomicReference) {
                this.f121557b = tVar;
                this.f121558c = atomicReference;
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f121557b.onComplete();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f121557b.onError(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this.f121558c, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(T t10) {
                this.f121557b.onSuccess(t10);
            }
        }

        SwitchIfEmptyMaybeObserver(io.reactivex.t<? super T> tVar, io.reactivex.w<? extends T> wVar) {
            this.f121555b = tVar;
            this.f121556c = wVar;
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
            io.reactivex.disposables.b bVar = get();
            if (bVar == DisposableHelper.DISPOSED || !compareAndSet(bVar, null)) {
                return;
            }
            this.f121556c.f(new a(this.f121555b, this));
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121555b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f121555b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121555b.onSuccess(t10);
        }
    }

    public MaybeSwitchIfEmpty(io.reactivex.w<T> wVar, io.reactivex.w<? extends T> wVar2) {
        super(wVar);
        this.f121554c = wVar2;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new SwitchIfEmptyMaybeObserver(tVar, this.f121554c));
    }
}

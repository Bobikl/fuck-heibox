package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeSwitchIfEmptySingle<T> extends io.reactivex.i0<T> implements lh.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o0<? extends T> f121560c;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4603919676453758899L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f121561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o0<? extends T> f121562c;

        public static final class a<T> implements l0<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final l0<? super T> f121563b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final AtomicReference<io.reactivex.disposables.b> f121564c;

            a(l0<? super T> l0Var, AtomicReference<io.reactivex.disposables.b> atomicReference) {
                this.f121563b = l0Var;
                this.f121564c = atomicReference;
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                this.f121563b.onError(th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this.f121564c, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(T t10) {
                this.f121563b.onSuccess(t10);
            }
        }

        SwitchIfEmptyMaybeObserver(l0<? super T> l0Var, o0<? extends T> o0Var) {
            this.f121561b = l0Var;
            this.f121562c = o0Var;
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
            this.f121562c.f(new a(this.f121561b, this));
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121561b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f121561b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121561b.onSuccess(t10);
        }
    }

    public MaybeSwitchIfEmptySingle(io.reactivex.w<T> wVar, o0<? extends T> o0Var) {
        this.f121559b = wVar;
        this.f121560c = o0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f121559b.f(new SwitchIfEmptyMaybeObserver(l0Var, this.f121560c));
    }

    @Override // lh.f
    public io.reactivex.w<T> source() {
        return this.f121559b;
    }
}

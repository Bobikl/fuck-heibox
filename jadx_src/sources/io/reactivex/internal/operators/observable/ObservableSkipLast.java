package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSkipLast<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f122542c;

    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -3807491841935125653L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f122544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122545d;

        SkipLastObserver(io.reactivex.g0<? super T> g0Var, int i10) {
            super(i10);
            this.f122543b = g0Var;
            this.f122544c = i10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122545d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122545d.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122543b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122543b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122544c == size()) {
                this.f122543b.onNext(poll());
            }
            offer(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122545d, bVar)) {
                this.f122545d = bVar;
                this.f122543b.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLast(io.reactivex.e0<T> e0Var, int i10) {
        super(e0Var);
        this.f122542c = i10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new SkipLastObserver(g0Var, this.f122542c));
    }
}

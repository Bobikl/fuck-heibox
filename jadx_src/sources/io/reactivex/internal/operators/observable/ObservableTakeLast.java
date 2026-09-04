package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTakeLast<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f122585c;

    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 7240042530241604978L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f122587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f122589e;

        TakeLastObserver(io.reactivex.g0<? super T> g0Var, int i10) {
            this.f122586b = g0Var;
            this.f122587c = i10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122589e) {
                return;
            }
            this.f122589e = true;
            this.f122588d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122589e;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            io.reactivex.g0<? super T> g0Var = this.f122586b;
            while (!this.f122589e) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.f122589e) {
                        return;
                    }
                    g0Var.onComplete();
                    return;
                }
                g0Var.onNext(tPoll);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122586b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122587c == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122588d, bVar)) {
                this.f122588d = bVar;
                this.f122586b.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLast(io.reactivex.e0<T> e0Var, int i10) {
        super(e0Var);
        this.f122585c = i10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new TakeLastObserver(g0Var, this.f122585c));
    }
}

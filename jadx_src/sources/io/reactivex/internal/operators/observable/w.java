package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: compiled from: ObservableDetach.java */
/* JADX INFO: loaded from: classes5.dex */
public final class w<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: compiled from: ObservableDetach.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.g0<? super T> f123121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f123122c;

        a(io.reactivex.g0<? super T> g0Var) {
            this.f123121b = g0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            io.reactivex.disposables.b bVar = this.f123122c;
            this.f123122c = EmptyComponent.INSTANCE;
            this.f123121b = EmptyComponent.asObserver();
            bVar.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123122c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            io.reactivex.g0<? super T> g0Var = this.f123121b;
            this.f123122c = EmptyComponent.INSTANCE;
            this.f123121b = EmptyComponent.asObserver();
            g0Var.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            io.reactivex.g0<? super T> g0Var = this.f123121b;
            this.f123122c = EmptyComponent.INSTANCE;
            this.f123121b = EmptyComponent.asObserver();
            g0Var.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f123121b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123122c, bVar)) {
                this.f123122c = bVar;
                this.f123121b.onSubscribe(this);
            }
        }
    }

    public w(io.reactivex.e0<T> e0Var) {
        super(e0Var);
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var));
    }
}

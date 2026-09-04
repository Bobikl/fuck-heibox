package io.reactivex.internal.operators.completable;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: CompletableToObservable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class z<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119864b;

    /* JADX INFO: compiled from: CompletableToObservable.java */
    public static final class a extends io.reactivex.internal.observers.b<Void> implements io.reactivex.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<?> f119865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f119866c;

        a(g0<?> g0Var) {
            this.f119865b = g0Var;
        }

        @Override // lh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void poll() throws Exception {
            return null;
        }

        @Override // lh.o
        public void clear() {
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119866c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119866c.isDisposed();
        }

        @Override // lh.o
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f119865b.onComplete();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119865b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f119866c, bVar)) {
                this.f119866c = bVar;
                this.f119865b.onSubscribe(this);
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return i10 & 2;
        }
    }

    public z(io.reactivex.g gVar) {
        this.f119864b = gVar;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super T> g0Var) {
        this.f119864b.d(new a(g0Var));
    }
}

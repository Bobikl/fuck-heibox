package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableAndThenCompletable extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g f119679c;

    public static final class SourceObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = -4101678820158072998L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.g f119681c;

        SourceObserver(io.reactivex.d dVar, io.reactivex.g gVar) {
            this.f119680b = dVar;
            this.f119681c = gVar;
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
            this.f119681c.d(new a(this, this.f119680b));
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119680b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f119680b.onSubscribe(this);
            }
        }
    }

    public static final class a implements io.reactivex.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f119682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.d f119683c;

        public a(AtomicReference<io.reactivex.disposables.b> atomicReference, io.reactivex.d dVar) {
            this.f119682b = atomicReference;
            this.f119683c = dVar;
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f119683c.onComplete();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119683c.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this.f119682b, bVar);
        }
    }

    public CompletableAndThenCompletable(io.reactivex.g gVar, io.reactivex.g gVar2) {
        this.f119678b = gVar;
        this.f119679c = gVar2;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119678b.d(new SourceObserver(dVar, this.f119679c));
    }
}

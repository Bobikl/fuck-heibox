package io.reactivex.internal.operators.completable;

import io.reactivex.h0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableSubscribeOn extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h0 f119762c;

    public static final class SubscribeOnObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SequentialDisposable f119764c = new SequentialDisposable();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.g f119765d;

        SubscribeOnObserver(io.reactivex.d dVar, io.reactivex.g gVar) {
            this.f119763b = dVar;
            this.f119765d = gVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f119764c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f119763b.onComplete();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119763b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f119765d.d(this);
        }
    }

    public CompletableSubscribeOn(io.reactivex.g gVar, h0 h0Var) {
        this.f119761b = gVar;
        this.f119762c = h0Var;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(dVar, this.f119761b);
        dVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.f119764c.a(this.f119762c.f(subscribeOnObserver));
    }
}

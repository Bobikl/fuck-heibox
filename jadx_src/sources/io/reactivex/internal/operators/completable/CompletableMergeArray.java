package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableMergeArray extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g[] f119743b;

    public static final class InnerCompletableObserver extends AtomicInteger implements io.reactivex.d {
        private static final long serialVersionUID = -8360547806504310570L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicBoolean f119745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.disposables.a f119746d;

        InnerCompletableObserver(io.reactivex.d dVar, AtomicBoolean atomicBoolean, io.reactivex.disposables.a aVar, int i10) {
            this.f119744b = dVar;
            this.f119745c = atomicBoolean;
            this.f119746d = aVar;
            lazySet(i10);
        }

        @Override // io.reactivex.d
        public void onComplete() {
            if (decrementAndGet() == 0 && this.f119745c.compareAndSet(false, true)) {
                this.f119744b.onComplete();
            }
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119746d.dispose();
            if (this.f119745c.compareAndSet(false, true)) {
                this.f119744b.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119746d.c(bVar);
        }
    }

    public CompletableMergeArray(io.reactivex.g[] gVarArr) {
        this.f119743b = gVarArr;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        InnerCompletableObserver innerCompletableObserver = new InnerCompletableObserver(dVar, new AtomicBoolean(), aVar, this.f119743b.length + 1);
        dVar.onSubscribe(aVar);
        for (io.reactivex.g gVar : this.f119743b) {
            if (aVar.isDisposed()) {
                return;
            }
            if (gVar == null) {
                aVar.dispose();
                innerCompletableObserver.onError(new NullPointerException("A completable source is null"));
                return;
            }
            gVar.d(innerCompletableObserver);
        }
        innerCompletableObserver.onComplete();
    }
}

package io.reactivex.internal.operators.completable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableMergeIterable extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.g> f119747b;

    public static final class MergeCompletableObserver extends AtomicBoolean implements io.reactivex.d {
        private static final long serialVersionUID = -7730517613164279224L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.disposables.a f119748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.d f119749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f119750d;

        MergeCompletableObserver(io.reactivex.d dVar, io.reactivex.disposables.a aVar, AtomicInteger atomicInteger) {
            this.f119749c = dVar;
            this.f119748b = aVar;
            this.f119750d = atomicInteger;
        }

        @Override // io.reactivex.d
        public void onComplete() {
            if (this.f119750d.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.f119749c.onComplete();
            }
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119748b.dispose();
            if (compareAndSet(false, true)) {
                this.f119749c.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119748b.c(bVar);
        }
    }

    public CompletableMergeIterable(Iterable<? extends io.reactivex.g> iterable) {
        this.f119747b = iterable;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        dVar.onSubscribe(aVar);
        try {
            Iterator it = (Iterator) io.reactivex.internal.functions.a.g(this.f119747b.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            MergeCompletableObserver mergeCompletableObserver = new MergeCompletableObserver(dVar, aVar, atomicInteger);
            while (!aVar.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        mergeCompletableObserver.onComplete();
                        return;
                    }
                    if (aVar.isDisposed()) {
                        return;
                    }
                    try {
                        io.reactivex.g gVar = (io.reactivex.g) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null CompletableSource");
                        if (aVar.isDisposed()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        gVar.d(mergeCompletableObserver);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        aVar.dispose();
                        mergeCompletableObserver.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    aVar.dispose();
                    mergeCompletableObserver.onError(th3);
                    return;
                }
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.a.b(th4);
            dVar.onError(th4);
        }
    }
}

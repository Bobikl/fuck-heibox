package io.reactivex.internal.operators.completable;

import io.reactivex.internal.util.AtomicThrowable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: CompletableMergeDelayErrorIterable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class t extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.g> f119834b;

    public t(Iterable<? extends io.reactivex.g> iterable) {
        this.f119834b = iterable;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        dVar.onSubscribe(aVar);
        try {
            Iterator it = (Iterator) io.reactivex.internal.functions.a.g(this.f119834b.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicThrowable atomicThrowable = new AtomicThrowable();
            while (!aVar.isDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (aVar.isDisposed()) {
                            return;
                        }
                        try {
                            io.reactivex.g gVar = (io.reactivex.g) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null CompletableSource");
                            if (aVar.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            gVar.d(new s.a(dVar, aVar, atomicThrowable, atomicInteger));
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            atomicThrowable.a(th2);
                        }
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    atomicThrowable.a(th3);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    Throwable thC = atomicThrowable.c();
                    if (thC == null) {
                        dVar.onComplete();
                        return;
                    } else {
                        dVar.onError(thC);
                        return;
                    }
                }
                return;
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.a.b(th4);
            dVar.onError(th4);
        }
    }
}

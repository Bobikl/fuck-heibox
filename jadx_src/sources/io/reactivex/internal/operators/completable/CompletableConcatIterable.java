package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableConcatIterable extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.g> f119711b;

    public static final class ConcatInnerObserver extends AtomicInteger implements io.reactivex.d {
        private static final long serialVersionUID = -7965400327305809232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Iterator<? extends io.reactivex.g> f119713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final SequentialDisposable f119714d = new SequentialDisposable();

        ConcatInnerObserver(io.reactivex.d dVar, Iterator<? extends io.reactivex.g> it) {
            this.f119712b = dVar;
            this.f119713c = it;
        }

        void a() {
            if (!this.f119714d.isDisposed() && getAndIncrement() == 0) {
                Iterator<? extends io.reactivex.g> it = this.f119713c;
                while (!this.f119714d.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            this.f119712b.onComplete();
                            return;
                        }
                        try {
                            ((io.reactivex.g) io.reactivex.internal.functions.a.g(it.next(), "The CompletableSource returned is null")).d(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            this.f119712b.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        this.f119712b.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.d
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119712b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119714d.a(bVar);
        }
    }

    public CompletableConcatIterable(Iterable<? extends io.reactivex.g> iterable) {
        this.f119711b = iterable;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        try {
            ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(dVar, (Iterator) io.reactivex.internal.functions.a.g(this.f119711b.iterator(), "The iterator returned is null"));
            dVar.onSubscribe(concatInnerObserver.f119714d);
            concatInnerObserver.a();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, dVar);
        }
    }
}

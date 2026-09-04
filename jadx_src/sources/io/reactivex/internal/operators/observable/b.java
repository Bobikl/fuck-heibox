package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: BlockingObservableLatest.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122798b;

    /* JADX INFO: compiled from: BlockingObservableLatest.java */
    public static final class a<T> extends io.reactivex.observers.d<io.reactivex.y<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.y<T> f122799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Semaphore f122800c = new Semaphore(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.y<T>> f122801d = new AtomicReference<>();

        a() {
        }

        @Override // io.reactivex.g0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.y<T> yVar) {
            if (this.f122801d.getAndSet(yVar) == null) {
                this.f122800c.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            io.reactivex.y<T> yVar = this.f122799b;
            if (yVar != null && yVar.g()) {
                throw ExceptionHelper.f(this.f122799b.d());
            }
            if (this.f122799b == null) {
                try {
                    io.reactivex.internal.util.c.b();
                    this.f122800c.acquire();
                    io.reactivex.y<T> andSet = this.f122801d.getAndSet(null);
                    this.f122799b = andSet;
                    if (andSet.g()) {
                        throw ExceptionHelper.f(andSet.d());
                    }
                } catch (InterruptedException e10) {
                    dispose();
                    this.f122799b = io.reactivex.y.b(e10);
                    throw ExceptionHelper.f(e10);
                }
            }
            return this.f122799b.h();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tE = this.f122799b.e();
            this.f122799b = null;
            return tE;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public b(io.reactivex.e0<T> e0Var) {
        this.f122798b = e0Var;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        io.reactivex.z.O7(this.f122798b).A3().g(aVar);
        return aVar;
    }
}

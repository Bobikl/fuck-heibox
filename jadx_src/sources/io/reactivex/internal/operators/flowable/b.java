package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: BlockingFlowableLatest.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f121045b;

    /* JADX INFO: compiled from: BlockingFlowableLatest.java */
    public static final class a<T> extends io.reactivex.subscribers.b<io.reactivex.y<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Semaphore f121046c = new Semaphore(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.y<T>> f121047d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.y<T> f121048e;

        a() {
        }

        @Override // org.reactivestreams.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.y<T> yVar) {
            if (this.f121047d.getAndSet(yVar) == null) {
                this.f121046c.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            io.reactivex.y<T> yVar = this.f121048e;
            if (yVar != null && yVar.g()) {
                throw ExceptionHelper.f(this.f121048e.d());
            }
            io.reactivex.y<T> yVar2 = this.f121048e;
            if ((yVar2 == null || yVar2.h()) && this.f121048e == null) {
                try {
                    io.reactivex.internal.util.c.b();
                    this.f121046c.acquire();
                    io.reactivex.y<T> andSet = this.f121047d.getAndSet(null);
                    this.f121048e = andSet;
                    if (andSet.g()) {
                        throw ExceptionHelper.f(andSet.d());
                    }
                } catch (InterruptedException e10) {
                    dispose();
                    this.f121048e = io.reactivex.y.b(e10);
                    throw ExceptionHelper.f(e10);
                }
            }
            return this.f121048e.h();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext() || !this.f121048e.h()) {
                throw new NoSuchElementException();
            }
            T tE = this.f121048e.e();
            this.f121048e = null;
            return tE;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public b(org.reactivestreams.c<? extends T> cVar) {
        this.f121045b = cVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        io.reactivex.j.Y2(this.f121045b).L3().j6(aVar);
        return aVar;
    }
}

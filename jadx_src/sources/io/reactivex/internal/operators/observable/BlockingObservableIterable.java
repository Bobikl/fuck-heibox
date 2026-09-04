package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f121952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f121953c;

    public static final class BlockingObservableIterator<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, Iterator<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 6695226475494099826L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.queue.a<T> f121954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Lock f121955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Condition f121956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f121957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Throwable f121958f;

        BlockingObservableIterator(int i10) {
            this.f121954b = new io.reactivex.internal.queue.a<>(i10);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f121955c = reentrantLock;
            this.f121956d = reentrantLock.newCondition();
        }

        void a() {
            this.f121955c.lock();
            try {
                this.f121956d.signalAll();
            } finally {
                this.f121955c.unlock();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z10 = this.f121957e;
                boolean zIsEmpty = this.f121954b.isEmpty();
                if (z10) {
                    Throwable th2 = this.f121958f;
                    if (th2 != null) {
                        throw ExceptionHelper.f(th2);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    io.reactivex.internal.util.c.b();
                    this.f121955c.lock();
                    while (!this.f121957e && this.f121954b.isEmpty()) {
                        try {
                            this.f121956d.await();
                        } catch (Throwable th3) {
                            this.f121955c.unlock();
                            throw th3;
                        }
                    }
                    this.f121955c.unlock();
                } catch (InterruptedException e10) {
                    DisposableHelper.dispose(this);
                    a();
                    throw ExceptionHelper.f(e10);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f121954b.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f121957e = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f121958f = th2;
            this.f121957e = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f121954b.offer(t10);
            a();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public BlockingObservableIterable(io.reactivex.e0<? extends T> e0Var, int i10) {
        this.f121952b = e0Var;
        this.f121953c = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.f121953c);
        this.f121952b.g(blockingObservableIterator);
        return blockingObservableIterator;
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingFlowableIterable<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f119867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f119868c;

    public static final class BlockingFlowableIterator<T> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<T>, Iterator<T>, Runnable, io.reactivex.disposables.b {
        private static final long serialVersionUID = 6695226475494099826L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SpscArrayQueue<T> f119869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f119870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f119871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Lock f119872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Condition f119873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f119874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f119875h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Throwable f119876i;

        BlockingFlowableIterator(int i10) {
            this.f119869b = new SpscArrayQueue<>(i10);
            this.f119870c = i10;
            this.f119871d = i10 - (i10 >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f119872e = reentrantLock;
            this.f119873f = reentrantLock.newCondition();
        }

        void a() {
            this.f119872e.lock();
            try {
                this.f119873f.signalAll();
            } finally {
                this.f119872e.unlock();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z10 = this.f119875h;
                boolean zIsEmpty = this.f119869b.isEmpty();
                if (z10) {
                    Throwable th2 = this.f119876i;
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
                io.reactivex.internal.util.c.b();
                this.f119872e.lock();
                while (!this.f119875h && this.f119869b.isEmpty()) {
                    try {
                        try {
                            this.f119873f.await();
                        } catch (InterruptedException e10) {
                            run();
                            throw ExceptionHelper.f(e10);
                        }
                    } catch (Throwable th3) {
                        this.f119872e.unlock();
                        throw th3;
                    }
                }
                this.f119872e.unlock();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tPoll = this.f119869b.poll();
            long j10 = this.f119874g + 1;
            if (j10 == this.f119871d) {
                this.f119874g = 0L;
                get().request(j10);
            } else {
                this.f119874g = j10;
            }
            return tPoll;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f119875h = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f119876i = th2;
            this.f119875h = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f119869b.offer(t10)) {
                a();
            } else {
                SubscriptionHelper.cancel(this);
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, this.f119870c);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public void run() {
            SubscriptionHelper.cancel(this);
            a();
        }
    }

    public BlockingFlowableIterable(io.reactivex.j<T> jVar, int i10) {
        this.f119867b = jVar;
        this.f119868c = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingFlowableIterator blockingFlowableIterator = new BlockingFlowableIterator(this.f119868c);
        this.f119867b.j6(blockingFlowableIterator);
        return blockingFlowableIterator;
    }
}

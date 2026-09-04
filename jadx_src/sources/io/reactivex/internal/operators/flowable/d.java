package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BlockingFlowableNext.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f121068b;

    /* JADX INFO: compiled from: BlockingFlowableNext.java */
    public static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<T> f121069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final org.reactivestreams.c<? extends T> f121070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private T f121071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f121072e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f121073f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Throwable f121074g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f121075h;

        a(org.reactivestreams.c<? extends T> cVar, b<T> bVar) {
            this.f121070c = cVar;
            this.f121069b = bVar;
        }

        private boolean a() {
            try {
                if (!this.f121075h) {
                    this.f121075h = true;
                    this.f121069b.f();
                    io.reactivex.j.Y2(this.f121070c).L3().j6(this.f121069b);
                }
                io.reactivex.y<T> yVarG = this.f121069b.g();
                if (yVarG.h()) {
                    this.f121073f = false;
                    this.f121071d = yVarG.e();
                    return true;
                }
                this.f121072e = false;
                if (yVarG.f()) {
                    return false;
                }
                if (!yVarG.g()) {
                    throw new IllegalStateException("Should not reach here");
                }
                Throwable thD = yVarG.d();
                this.f121074g = thD;
                throw ExceptionHelper.f(thD);
            } catch (InterruptedException e10) {
                this.f121069b.dispose();
                this.f121074g = e10;
                throw ExceptionHelper.f(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f121074g;
            if (th2 != null) {
                throw ExceptionHelper.f(th2);
            }
            if (this.f121072e) {
                return !this.f121073f || a();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.f121074g;
            if (th2 != null) {
                throw ExceptionHelper.f(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f121073f = true;
            return this.f121071d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: compiled from: BlockingFlowableNext.java */
    public static final class b<T> extends io.reactivex.subscribers.b<io.reactivex.y<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BlockingQueue<io.reactivex.y<T>> f121076c = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f121077d = new AtomicInteger();

        b() {
        }

        @Override // org.reactivestreams.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.y<T> yVar) {
            if (this.f121077d.getAndSet(0) == 1 || !yVar.h()) {
                while (!this.f121076c.offer(yVar)) {
                    io.reactivex.y<T> yVarPoll = this.f121076c.poll();
                    if (yVarPoll != null && !yVarPoll.h()) {
                        yVar = yVarPoll;
                    }
                }
            }
        }

        void f() {
            this.f121077d.set(1);
        }

        public io.reactivex.y<T> g() throws InterruptedException {
            f();
            io.reactivex.internal.util.c.b();
            return this.f121076c.take();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }
    }

    public d(org.reactivestreams.c<? extends T> cVar) {
        this.f121068b = cVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f121068b, new b());
    }
}

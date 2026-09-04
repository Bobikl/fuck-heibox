package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BlockingObservableNext.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122831b;

    /* JADX INFO: compiled from: BlockingObservableNext.java */
    public static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<T> f122832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.e0<T> f122833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private T f122834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f122835e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f122836f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Throwable f122837g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f122838h;

        a(io.reactivex.e0<T> e0Var, b<T> bVar) {
            this.f122833c = e0Var;
            this.f122832b = bVar;
        }

        private boolean a() {
            if (!this.f122838h) {
                this.f122838h = true;
                this.f122832b.b();
                new z0(this.f122833c).g(this.f122832b);
            }
            try {
                io.reactivex.y<T> yVarC = this.f122832b.c();
                if (yVarC.h()) {
                    this.f122836f = false;
                    this.f122834d = yVarC.e();
                    return true;
                }
                this.f122835e = false;
                if (yVarC.f()) {
                    return false;
                }
                Throwable thD = yVarC.d();
                this.f122837g = thD;
                throw ExceptionHelper.f(thD);
            } catch (InterruptedException e10) {
                this.f122832b.dispose();
                this.f122837g = e10;
                throw ExceptionHelper.f(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f122837g;
            if (th2 != null) {
                throw ExceptionHelper.f(th2);
            }
            if (this.f122835e) {
                return !this.f122836f || a();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.f122837g;
            if (th2 != null) {
                throw ExceptionHelper.f(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f122836f = true;
            return this.f122834d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: compiled from: BlockingObservableNext.java */
    public static final class b<T> extends io.reactivex.observers.d<io.reactivex.y<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BlockingQueue<io.reactivex.y<T>> f122839b = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f122840c = new AtomicInteger();

        b() {
        }

        @Override // io.reactivex.g0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.y<T> yVar) {
            if (this.f122840c.getAndSet(0) == 1 || !yVar.h()) {
                while (!this.f122839b.offer(yVar)) {
                    io.reactivex.y<T> yVarPoll = this.f122839b.poll();
                    if (yVarPoll != null && !yVarPoll.h()) {
                        yVar = yVarPoll;
                    }
                }
            }
        }

        void b() {
            this.f122840c.set(1);
        }

        public io.reactivex.y<T> c() throws InterruptedException {
            b();
            io.reactivex.internal.util.c.b();
            return this.f122839b.take();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }
    }

    public d(io.reactivex.e0<T> e0Var) {
        this.f122831b = e0Var;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f122831b, new b());
    }
}

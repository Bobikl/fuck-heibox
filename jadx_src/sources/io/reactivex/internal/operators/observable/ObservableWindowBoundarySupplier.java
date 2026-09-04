package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.z<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends io.reactivex.e0<B>> f122728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f122729d;

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b, Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final a<Object, Object> f122730m = new a<>(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Object f122731n = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super io.reactivex.z<T>> f122732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f122733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<a<T, B>> f122734d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f122735e = new AtomicInteger(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final MpscLinkedQueue<Object> f122736f = new MpscLinkedQueue<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicThrowable f122737g = new AtomicThrowable();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicBoolean f122738h = new AtomicBoolean();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final Callable<? extends io.reactivex.e0<B>> f122739i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        io.reactivex.disposables.b f122740j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f122741k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        UnicastSubject<T> f122742l;

        WindowBoundaryMainObserver(io.reactivex.g0<? super io.reactivex.z<T>> g0Var, int i10, Callable<? extends io.reactivex.e0<B>> callable) {
            this.f122732b = g0Var;
            this.f122733c = i10;
            this.f122739i = callable;
        }

        void a() {
            AtomicReference<a<T, B>> atomicReference = this.f122734d;
            a<Object, Object> aVar = f122730m;
            a<T, B> andSet = atomicReference.getAndSet((a<T, B>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.dispose();
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.g0<? super io.reactivex.z<T>> g0Var = this.f122732b;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f122736f;
            AtomicThrowable atomicThrowable = this.f122737g;
            int iAddAndGet = 1;
            while (this.f122735e.get() != 0) {
                UnicastSubject<T> unicastSubject = this.f122742l;
                boolean z10 = this.f122741k;
                if (z10 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thC = atomicThrowable.c();
                    if (unicastSubject != null) {
                        this.f122742l = null;
                        unicastSubject.onError(thC);
                    }
                    g0Var.onError(thC);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thC2 = atomicThrowable.c();
                    if (thC2 == null) {
                        if (unicastSubject != null) {
                            this.f122742l = null;
                            unicastSubject.onComplete();
                        }
                        g0Var.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.f122742l = null;
                        unicastSubject.onError(thC2);
                    }
                    g0Var.onError(thC2);
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f122731n) {
                    unicastSubject.onNext((T) objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.f122742l = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.f122738h.get()) {
                        UnicastSubject<T> unicastSubjectO8 = UnicastSubject.o8(this.f122733c, this);
                        this.f122742l = unicastSubjectO8;
                        this.f122735e.getAndIncrement();
                        try {
                            io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122739i.call(), "The other Callable returned a null ObservableSource");
                            a aVar = new a(this);
                            if (androidx.compose.animation.core.s0.a(this.f122734d, null, aVar)) {
                                e0Var.g(aVar);
                                g0Var.onNext(unicastSubjectO8);
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            atomicThrowable.a(th2);
                            this.f122741k = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f122742l = null;
        }

        void c() {
            this.f122740j.dispose();
            this.f122741k = true;
            b();
        }

        void d(Throwable th2) {
            this.f122740j.dispose();
            if (!this.f122737g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122741k = true;
                b();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122738h.compareAndSet(false, true)) {
                a();
                if (this.f122735e.decrementAndGet() == 0) {
                    this.f122740j.dispose();
                }
            }
        }

        void f(a<T, B> aVar) {
            androidx.compose.animation.core.s0.a(this.f122734d, aVar, null);
            this.f122736f.offer(f122731n);
            b();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122738h.get();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            a();
            this.f122741k = true;
            b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            a();
            if (!this.f122737g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122741k = true;
                b();
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122736f.offer(t10);
            b();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122740j, bVar)) {
                this.f122740j = bVar;
                this.f122732b.onSubscribe(this);
                this.f122736f.offer(f122731n);
                b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f122735e.decrementAndGet() == 0) {
                this.f122740j.dispose();
            }
        }
    }

    public static final class a<T, B> extends io.reactivex.observers.d<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowBoundaryMainObserver<T, B> f122743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f122744c;

        a(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.f122743b = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122744c) {
                return;
            }
            this.f122744c = true;
            this.f122743b.c();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122744c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122744c = true;
                this.f122743b.d(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(B b10) {
            if (this.f122744c) {
                return;
            }
            this.f122744c = true;
            dispose();
            this.f122743b.f(this);
        }
    }

    public ObservableWindowBoundarySupplier(io.reactivex.e0<T> e0Var, Callable<? extends io.reactivex.e0<B>> callable, int i10) {
        super(e0Var);
        this.f122728c = callable;
        this.f122729d = i10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super io.reactivex.z<T>> g0Var) {
        this.f122785b.g(new WindowBoundaryMainObserver(g0Var, this.f122729d, this.f122728c));
    }
}

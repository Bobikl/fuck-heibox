package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWindowBoundary<T, B> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.z<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<B> f122713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f122714d;

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b, Runnable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final Object f122715l = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super io.reactivex.z<T>> f122716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f122717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a<T, B> f122718d = new a<>(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122719e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f122720f = new AtomicInteger(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final MpscLinkedQueue<Object> f122721g = new MpscLinkedQueue<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicThrowable f122722h = new AtomicThrowable();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicBoolean f122723i = new AtomicBoolean();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f122724j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        UnicastSubject<T> f122725k;

        WindowBoundaryMainObserver(io.reactivex.g0<? super io.reactivex.z<T>> g0Var, int i10) {
            this.f122716b = g0Var;
            this.f122717c = i10;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.g0<? super io.reactivex.z<T>> g0Var = this.f122716b;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f122721g;
            AtomicThrowable atomicThrowable = this.f122722h;
            int iAddAndGet = 1;
            while (this.f122720f.get() != 0) {
                UnicastSubject<T> unicastSubject = this.f122725k;
                boolean z10 = this.f122724j;
                if (z10 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thC = atomicThrowable.c();
                    if (unicastSubject != null) {
                        this.f122725k = null;
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
                            this.f122725k = null;
                            unicastSubject.onComplete();
                        }
                        g0Var.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.f122725k = null;
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
                } else if (objPoll != f122715l) {
                    unicastSubject.onNext((T) objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.f122725k = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.f122723i.get()) {
                        UnicastSubject<T> unicastSubjectO8 = UnicastSubject.o8(this.f122717c, this);
                        this.f122725k = unicastSubjectO8;
                        this.f122720f.getAndIncrement();
                        g0Var.onNext(unicastSubjectO8);
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f122725k = null;
        }

        void b() {
            DisposableHelper.dispose(this.f122719e);
            this.f122724j = true;
            a();
        }

        void c(Throwable th2) {
            DisposableHelper.dispose(this.f122719e);
            if (!this.f122722h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122724j = true;
                a();
            }
        }

        void d() {
            this.f122721g.offer(f122715l);
            a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122723i.compareAndSet(false, true)) {
                this.f122718d.dispose();
                if (this.f122720f.decrementAndGet() == 0) {
                    DisposableHelper.dispose(this.f122719e);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122723i.get();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122718d.dispose();
            this.f122724j = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122718d.dispose();
            if (!this.f122722h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122724j = true;
                a();
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122721g.offer(t10);
            a();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this.f122719e, bVar)) {
                d();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f122720f.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.f122719e);
            }
        }
    }

    public static final class a<T, B> extends io.reactivex.observers.d<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowBoundaryMainObserver<T, B> f122726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f122727c;

        a(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.f122726b = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122727c) {
                return;
            }
            this.f122727c = true;
            this.f122726b.b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122727c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122727c = true;
                this.f122726b.c(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(B b10) {
            if (this.f122727c) {
                return;
            }
            this.f122726b.d();
        }
    }

    public ObservableWindowBoundary(io.reactivex.e0<T> e0Var, io.reactivex.e0<B> e0Var2, int i10) {
        super(e0Var);
        this.f122713c = e0Var2;
        this.f122714d = i10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super io.reactivex.z<T>> g0Var) {
        WindowBoundaryMainObserver windowBoundaryMainObserver = new WindowBoundaryMainObserver(g0Var, this.f122714d);
        g0Var.onSubscribe(windowBoundaryMainObserver);
        this.f122713c.g(windowBoundaryMainObserver.f122718d);
        this.f122785b.g(windowBoundaryMainObserver);
    }
}

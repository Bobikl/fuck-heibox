package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableCreate<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.c0<T> f122098b;

    public static final class CreateEmitter<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.b0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -3434801548987643227L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122099b;

        CreateEmitter(io.reactivex.g0<? super T> g0Var) {
            this.f122099b = g0Var;
        }

        @Override // io.reactivex.b0
        public void a(kh.f fVar) {
            c(new CancellableDisposable(fVar));
        }

        @Override // io.reactivex.b0
        public boolean b(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f122099b.onError(th2);
                return true;
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.b0
        public void c(io.reactivex.disposables.b bVar) {
            DisposableHelper.set(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.b0, io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.i
        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f122099b.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.i
        public void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // io.reactivex.i
        public void onNext(T t10) {
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f122099b.onNext(t10);
            }
        }

        @Override // io.reactivex.b0
        public io.reactivex.b0<T> serialize() {
            return new SerializedEmitter(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", CreateEmitter.class.getSimpleName(), super.toString());
        }
    }

    public static final class SerializedEmitter<T> extends AtomicInteger implements io.reactivex.b0<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.b0<T> f122100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicThrowable f122101c = new AtomicThrowable();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.queue.a<T> f122102d = new io.reactivex.internal.queue.a<>(16);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f122103e;

        SerializedEmitter(io.reactivex.b0<T> b0Var) {
            this.f122100b = b0Var;
        }

        @Override // io.reactivex.b0
        public void a(kh.f fVar) {
            this.f122100b.a(fVar);
        }

        @Override // io.reactivex.b0
        public boolean b(Throwable th2) {
            if (!this.f122100b.isDisposed() && !this.f122103e) {
                if (th2 == null) {
                    th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f122101c.a(th2)) {
                    this.f122103e = true;
                    d();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.b0
        public void c(io.reactivex.disposables.b bVar) {
            this.f122100b.c(bVar);
        }

        void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        void e() {
            io.reactivex.b0<T> b0Var = this.f122100b;
            io.reactivex.internal.queue.a<T> aVar = this.f122102d;
            AtomicThrowable atomicThrowable = this.f122101c;
            int iAddAndGet = 1;
            while (!b0Var.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    aVar.clear();
                    b0Var.onError(atomicThrowable.c());
                    return;
                }
                boolean z10 = this.f122103e;
                T tPoll = aVar.poll();
                boolean z11 = tPoll == null;
                if (z10 && z11) {
                    b0Var.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    b0Var.onNext(tPoll);
                }
            }
            aVar.clear();
        }

        @Override // io.reactivex.b0, io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122100b.isDisposed();
        }

        @Override // io.reactivex.i
        public void onComplete() {
            if (this.f122100b.isDisposed() || this.f122103e) {
                return;
            }
            this.f122103e = true;
            d();
        }

        @Override // io.reactivex.i
        public void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // io.reactivex.i
        public void onNext(T t10) {
            if (this.f122100b.isDisposed() || this.f122103e) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f122100b.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.queue.a<T> aVar = this.f122102d;
                synchronized (aVar) {
                    aVar.offer(t10);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            e();
        }

        @Override // io.reactivex.b0
        public io.reactivex.b0<T> serialize() {
            return this;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.f122100b.toString();
        }
    }

    public ObservableCreate(io.reactivex.c0<T> c0Var) {
        this.f122098b = c0Var;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        CreateEmitter createEmitter = new CreateEmitter(g0Var);
        g0Var.onSubscribe(createEmitter);
        try {
            this.f122098b.a(createEmitter);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            createEmitter.onError(th2);
        }
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRetryBiPredicate<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.d<? super Integer, ? super Throwable> f122455c;

    public static final class RetryBiObserver<T> extends AtomicInteger implements io.reactivex.g0<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SequentialDisposable f122457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.e0<? extends T> f122458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.d<? super Integer, ? super Throwable> f122459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f122460f;

        RetryBiObserver(io.reactivex.g0<? super T> g0Var, kh.d<? super Integer, ? super Throwable> dVar, SequentialDisposable sequentialDisposable, io.reactivex.e0<? extends T> e0Var) {
            this.f122456b = g0Var;
            this.f122457c = sequentialDisposable;
            this.f122458d = e0Var;
            this.f122459e = dVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f122457c.isDisposed()) {
                    this.f122458d.g(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122456b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            try {
                kh.d<? super Integer, ? super Throwable> dVar = this.f122459e;
                int i10 = this.f122460f + 1;
                this.f122460f = i10;
                if (dVar.test(Integer.valueOf(i10), th2)) {
                    a();
                } else {
                    this.f122456b.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f122456b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122456b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f122457c.a(bVar);
        }
    }

    public ObservableRetryBiPredicate(io.reactivex.z<T> zVar, kh.d<? super Integer, ? super Throwable> dVar) {
        super(zVar);
        this.f122455c = dVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        g0Var.onSubscribe(sequentialDisposable);
        new RetryBiObserver(g0Var, this.f122455c, sequentialDisposable, this.f122785b).a();
    }
}
